package com.sit.int202.word;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*", maxAge=3600)
public class WordController {
    @Autowired
    private WordService wordService;

    @GetMapping("test/{name}")
    public String helloWorld(@PathVariable String name) {
        return "hello world" + " " + name;
    }

    @GetMapping("int202/hello")
    public ResponseEntity<String> helloWorld() {
        Word wordObject = wordService.getWordById(1);
        String word = wordObject.getWord();
        return new ResponseEntity<>(word, HttpStatus.OK);
    }
}