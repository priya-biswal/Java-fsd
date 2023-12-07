package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entites.Todo;

public interface TodoRepo extends JpaRepository<Todo,Integer> {

}
