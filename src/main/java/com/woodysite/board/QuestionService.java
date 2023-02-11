package com.woodysite.board;

import com.woodysite.board.Question;
import com.woodysite.board.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionRepository questionRepository;

    public String getQuestionContent(){
        List<Question> all = questionRepository.findAll();
        Question res = all.get(0);
        return res.getQuestionContent();
    }

}
