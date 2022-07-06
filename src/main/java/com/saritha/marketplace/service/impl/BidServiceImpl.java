package com.saritha.marketplace.service.impl;

import com.saritha.marketplace.model.Bid;
import com.saritha.marketplace.repository.BidRepository;
import com.saritha.marketplace.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class BidServiceImpl implements BidService {

    @Autowired
    public BidRepository bidRepository;

    public Bid create(Bid bid){
        return bidRepository.save(bid);
    }

    public List<Bid> create(List<Bid> bids){
        return bidRepository.saveAll(bids);
    }

}
