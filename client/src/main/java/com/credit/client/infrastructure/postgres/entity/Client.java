package com.credit.client.infrastructure.postgres.entity;

import com.credit.client.dto.ClientDTO;
import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    private String id;

    private String name;

    private BigInteger debit;

    private Client() {}

    public Client(String id, String name, BigInteger debit) {
        this.id = id;
        this.name = name;
        this.debit = debit;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigInteger getDebit() {
        return debit;
    }

    public void setDebit(BigInteger extra) {
        debit = debit.add(extra);
    }

    public void updateClient(ClientDTO newVersion) {
        this.setDebit(newVersion.debit());
        this.name = newVersion.name();
    }
}