package com.woodysite.board;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Iterator;
import java.util.List;

@SpringBootTest
class BoardApplicationTests {
	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void questionRepositoryTest(){
		List <Question> allQuestions= this.questionRepository.findAll();
		assertEquals(6, allQuestions.size()); ;
		for (Question q : allQuestions){
			System.out.println(q.getQuestionContent());
		}
	}
}
