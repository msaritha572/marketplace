package com.saritha.marketplace.repository;

import com.saritha.marketplace.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

    @Query("SELECT * from Task order by createddate LIMIT 10")
    public List<Task> getMostRecentTenTask();

    @Query("SELECT * from Task order by createddate LIMIT 10")
    public List<Task> getActiveTen();

}
