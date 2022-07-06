package com.saritha.marketplace.model;

import javax.persistence.*;

@Entity
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "taskId")
    private Task task;
    private long bidderId;
    private long createdDate;
    private double price;
}
