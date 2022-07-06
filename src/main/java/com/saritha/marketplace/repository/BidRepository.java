package com.saritha.marketplace.repository;

import com.saritha.marketplace.model.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BidRepository extends JpaRepository<Bid, Integer> {

    @Query("")
    public List<Bid> getTenLowestBids(Long taskId);

    @Query
    public Integer getNumberOfBids(Long taskId);



}
