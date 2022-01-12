package com.sbHanokai.bookstore.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/bookstore")
public class BookStoreController {

    @GetMapping
    public ResponseEntity<String> HelloWorld(){
        return ResponseEntity.ok("Hello world");
    }


}
