package com.saritha.marketplace.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity(name = "Task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long posterId;

    @OneToMany(mappedBy = "task")
    private Set<Bid> bids;
    private String desc;
    private String status;
    @Temporal(TemporalType.TIMESTAMP)
    @Basic(optional = false)
    private Date cratedDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Basic(optional = false)
    private Date expirationDate;

    public Set<Bid> getBids() {
        return bids;
    }
    public void setBids(Set<Bid> bids) {
        this.bids = bids;
    }
    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
