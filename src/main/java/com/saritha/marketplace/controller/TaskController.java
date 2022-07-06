package com.saritha.marketplace.controller;

import com.saritha.marketplace.model.Bid;
import com.saritha.marketplace.model.Task;
import com.saritha.marketplace.service.impl.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TaskController {

    @Autowired
    TaskServiceImpl taskService;

    @PostMapping("/task")
    public Task create(@RequestBody Task task){
        return taskService.create(task);
    }

    @PostMapping("/tasks")
    public List<Task> create(@RequestBody List<Task> tasks){
       return taskService.create(tasks);
    }

    @GetMapping("/tasks/activeten")
    public List<Task> getActiveTen(){
        return taskService.getActiveTen();
    }
    @GetMapping("/tasks/recentten")
    public List<Task> getRecentTen(){
        return taskService.getRecentTen();
    }

    @GetMapping("/task/{id}/bidscount")
    public Integer getBidsCount(@PathVariable Long id){
        return taskService.getBidsCount(id);
    }

    @GetMapping("/task/{id}/lowesttenbids")
    public List<Bid> getLowestTenBids(@PathVariable Long id){
        return taskService.geLowestTenBids(id);
    }
    
}
