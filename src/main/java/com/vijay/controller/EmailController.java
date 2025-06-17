package com.vijay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.dto.QuoteRequestDTO;
import com.vijay.entity.InteriorLead;
import com.vijay.entity.QuoteRequest;
import com.vijay.repository.QuoteRequestRepository;
import com.vijay.service.EmailService;
import com.vijay.service.InteriorLeadService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // allow React frontend to call this API
public class EmailController {

    @Autowired
    private EmailService emailService;
    
   
    
    @Autowired
    private JavaMailSender mailSender;
    
    
    @Autowired
    private InteriorLeadService leadService;
    
    @Autowired
    private QuoteRequestRepository quoteRequestRepository;
    

//    @PostMapping("/submit-quote")
//    public ResponseEntity<String> sendEmail(@RequestBody QuoteRequest payload) {
//        if (payload.getName() == null || payload.getEmail() == null) {
//            return ResponseEntity.badRequest().body("Missing name or email");
//        }
//
//        try {
//            emailService.sendThankYouEmail(payload.getEmail(), payload.getName());
//        } catch (Exception e) {
//            return ResponseEntity.internalServerError().body("Email failed: " + e.getMessage());
//        }
//
//        try {
//            whatsAppService.sendWhatsAppMessage(payload.getPhone(), payload.getName());
//        } catch (Exception e) {
//            return ResponseEntity.internalServerError().body("WhatsApp message failed: " + e.getMessage());
//        }
//
//        return ResponseEntity.ok("Email and WhatsApp sent to: " + payload.getEmail());
//    }

    
    // CREATE
//    @PostMapping("/submit-quote")
//    public ResponseEntity<InteriorLead> createLead(@RequestBody InteriorLead lead) {
//        System.out.println(lead);
//
//        try {
//            // Save the lead
//            InteriorLead savedLead = leadService.saveLead(lead);
//
//            // Send thank-you email
//            emailService.sendThankYouEmail(savedLead.getEmail(), savedLead.getName());
//
//            // Return 200 OK with the saved lead
//            return ResponseEntity.ok(savedLead);
//
//        } catch (Exception e) {
//            e.printStackTrace(); // Log the exception
//            return ResponseEntity.internalServerError().body(null); // Return 500 with null body
//        }
//    }
    
    
    @PostMapping("/submit-quote")
    public ResponseEntity<String> submitQuote(@RequestBody QuoteRequestDTO dto) {
    	System.out.println(dto);
        QuoteRequest quote = new QuoteRequest();
        quote.setName(dto.getName());
        quote.setEmail(dto.getEmail());
        quote.setPhone(dto.getPhone());
        quote.setPropertyName(dto.getPropertyName());
        quote.setWhatsappUpdates(dto.isWhatsappUpdates());
        
               

        quoteRequestRepository.save(quote);
        return ResponseEntity.ok("Quote submitted successfully");
    }
    
    
    
    

    // READ ALL
    @GetMapping("/leads")
    public ResponseEntity<List<InteriorLead>> getAllLeads() {
        List<InteriorLead> leads = leadService.getAllLeads();
        return ResponseEntity.ok(leads);
    }

    // READ BY ID
    @GetMapping("/{id}")
    public ResponseEntity<InteriorLead> getLeadById(@PathVariable Long id) {
        InteriorLead lead = leadService.getLeadById(id);
        if (lead != null) {
            return ResponseEntity.ok(lead);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLead(@PathVariable Long id) {
        InteriorLead lead = leadService.getLeadById(id);
        if (lead != null) {
            leadService.deleteLead(id);
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
