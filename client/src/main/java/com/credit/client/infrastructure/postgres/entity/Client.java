package com.credit.client.infrastructure.postgres.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    private String id;

    private String name;

    private Client() {}

    public Client(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}