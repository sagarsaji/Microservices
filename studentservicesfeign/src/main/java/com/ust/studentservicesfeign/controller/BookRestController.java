package com.ust.studentservicesfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class BookRestController {

    @Autowired
    private BookRestConsumer consumer;

    @GetMapping("/data")
    public String getStudentInfo(){
        System.out.println(consumer.getClass().getName());
        return "ACCESSING THE STUDENT-SERVICE ==>" + consumer.getBookData();
    }

    @GetMapping("/allBooks")
    public String getBooksInfo(){
        return "ACCESSING FROM STUDENT-SERVICE ==>" + consumer.getAllBooks();
    }

    @GetMapping("/getDataBook/{id}")
    public String getBookById(@PathVariable Integer id){
        return "ACCESSING FROM STUDENT-SERVICE ==>" + consumer.getBookById(id);
    }

    @GetMapping("/entitydata")
    public String printEntityData(){
        ResponseEntity<String> resp = consumer.getEntityData();
        return "ACCESSING FROM STUDENT-SERVICE ==>" + resp.getBody() + " , status is : " + resp.getStatusCode();
    }

}
