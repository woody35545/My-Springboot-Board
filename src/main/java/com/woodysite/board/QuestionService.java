package com.woodysite.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionRepository questionRepository;

    public List<Question> getAllQuestion(){
        return questionRepository.findAll();
    }

    public Question getQuestion(int id){
        return questionRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("no such data"));
    }


}
