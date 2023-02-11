package com.woodysite.board;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BoardApplicationTests {
	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void questionRepositoryTest(){
		List<Question> all = this.questionRepository.findAll();
		Question q0 = all.get(0);
		//System.out.println(q0.getQuestionContent());
		System.out.println(q0.getQuestionContent());
	}
}
