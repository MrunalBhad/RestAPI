package com.example.scan;

//ScanController.java
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scan")
public class ScanController {

@PostMapping
public ResponseEntity<ScanResponse> postScan(@RequestBody Scan scan) {
 // Implement your logic to process the scan
 // For simplicity, let's assume the scan is processed successfully

 ScanResponse response = new ScanResponse("12345", HttpStatus.OK.value());
 return ResponseEntity.ok(response);
}
}


