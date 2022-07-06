package com.saritha.marketplace.service.impl;

import com.saritha.marketplace.model.Task;
import com.saritha.marketplace.repository.TaskRepository;
import com.saritha.marketplace.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Transactional
@Service
public class TaskServiceImpl  implements TaskService {

    @Autowired
    public TaskRepository taskRepository;
    public Task create(Task task){
       return taskRepository.save(task);
    }
    public List<Task> create(List<Task> tasks){
        return taskRepository.saveAll(tasks);
    }
    public Date getAuctionExpirationDate(Long taskId) {
        Optional<Task> tasks= taskRepository.findById(taskId);
       return tasks.get().getExpirationDate();
    }
    public List<Task> getActiveTen() {
        return taskRepository.getActiveTen();
    }
    public List<Task> getRecentTen() {
        return taskRepository.getMostRecentTenTask();
    }
    public Integer getBidsCount(Long id){
        Optional<Task> tasks= taskRepository.findById(id);
        return tasks.get().getBids() !=null ? tasks.get().getBids().size() : 0;
    }

}
