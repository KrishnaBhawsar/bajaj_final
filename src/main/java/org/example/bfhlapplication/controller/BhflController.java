package org.example.bfhlapplication.controller;

import org.example.bfhlapplication.model.BfhlRequest;
import org.example.bfhlapplication.model.BfhlResponse;
import org.example.bfhlapplication.model.Response;
import org.example.bfhlapplication.service.BfhlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BhflController {
    @Autowired
    BfhlService bfhlService;

    @PostMapping("/bfhl")
    public ResponseEntity<Response> handlePost(@RequestBody BfhlRequest request) {
        System.out.println("cledd");
        Response response = bfhlService.processRequest(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/bfhl")
    public ResponseEntity<String> handleGet() {
        return ResponseEntity.ok("OK");
    }
}
