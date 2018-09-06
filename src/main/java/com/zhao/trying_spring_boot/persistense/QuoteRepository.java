package com.zhao.trying_spring_boot.persistense;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zhao.trying_spring_boot.model.Quote;


public interface QuoteRepository extends JpaRepository<Quote, String>  {

}
