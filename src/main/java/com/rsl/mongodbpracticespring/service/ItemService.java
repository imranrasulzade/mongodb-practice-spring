package com.rsl.mongodbpracticespring.service;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.rsl.mongodbpracticespring.doc_collection.Item;
import org.bson.Document;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final MongoCollection<Document> collection;

    public ItemService() {
        // MongoDB'ye qoshulma
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            // Database sechme
            MongoDatabase database = mongoClient.getDatabase("mix_test");
            // Collection sechmek ve ya yaratmaq
            this.collection = database.getCollection("people");
        }
    }

    public void saveItem(Item item) {
        // Item class-ini MongoDb documentine cevirme
        Document document = new Document()
                .append("name", item.getName())
                .append("age", item.getAge());

        // MongoDB-ye document elave etme
        collection.insertOne(document);
    }

    public Item getItemById(String id) {
        // MongoDB'den gelen documenti alıb Item objectine cevirme
        Document document = collection.find(new Document("_id", id)).first();
        if (document != null) {
            return new Item(document.getString("name"), document.getInteger("age"));
        }
        return null;
    }
}
