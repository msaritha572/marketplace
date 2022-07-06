package com.saritha.marketplace.controller;

import com.saritha.marketplace.model.Bid;
import com.saritha.marketplace.service.impl.BidServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class BidController {

    @Autowired
    BidServiceImpl bidService;

    @PostMapping("/bid")
    public Bid create(@RequestBody Bid bid){
        return bidService.create(bid);
    }
    @PostMapping("/bids")
    public List<Bid> create(@RequestBody List<Bid> bids){
        return bidService.create(bids);
    }

}
