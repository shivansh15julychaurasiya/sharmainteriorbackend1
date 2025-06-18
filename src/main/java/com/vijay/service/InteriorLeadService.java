//package com.vijay.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.vijay.entity.InteriorLead;
//import com.vijay.repository.QuoteRequestRepository;
//
//@Service
//public class InteriorLeadService {
//
//    @Autowired
//    private QuoteRequestRepository quoteRequestRepository;
//
//    public InteriorLead saveLead(InteriorLead lead) {
//        return quoteRequestRepository.save(lead);
//    }
//
//    public List<InteriorLead> getAllLeads() {
//        return leadRepository.findAll();
//    }
//
//    public InteriorLead getLeadById(Long id) {
//        return leadRepository.findById(id).orElse(null);
//    }
//
//    public void deleteLead(Long id) {
//        leadRepository.deleteById(id);
//    }
//}