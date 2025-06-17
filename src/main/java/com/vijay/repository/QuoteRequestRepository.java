package com.vijay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vijay.entity.QuoteRequest;

@Repository
public interface QuoteRequestRepository extends JpaRepository<QuoteRequest, Long> {

}
