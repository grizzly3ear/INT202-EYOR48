package com.sit.int202.word;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService {
    @Autowired
    private WordRepository wordRepository;

    public Word getWordById(int id) {
        return wordRepository.getOne(id);
    }
}