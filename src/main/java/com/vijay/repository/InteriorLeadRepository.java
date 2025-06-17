package com.vijay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vijay.entity.InteriorLead;

@Repository
public interface InteriorLeadRepository extends JpaRepository<InteriorLead, Long>  {

}
