package com.woodysite.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class QuestionController
{
    @Autowired
    QuestionService questionService;

    @GetMapping("/questions/lib")
    public List<Question> getQuestionList(){
        // 질문 라이브러리에 등록된 모든 정보를 보여주는 API
        return questionService.getAllQuestion();
    }
    @GetMapping("/questions/lib/{question_id}")
    public String getFirstQuestionContent(@PathVariable int question_id){
        /// 질문 라이브러리의 특정 질문을 질문 ID로 받아오는 api: http://localhost:8080/question/lib/{질문번호}
        return questionService.getQuestion(question_id).getQuestionContent();
    }
}


