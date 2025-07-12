package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Produc;



public interface Repository extends JpaRepository<Produc, Integer> {

}
