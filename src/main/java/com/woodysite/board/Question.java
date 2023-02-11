package com.woodysite.board;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(name = "question_table")
public class Question {
    @Id
    private int questionID;

    @Column(name="question_id")
    private String questionContent;

    @Column(name="category")
    private String questionCategory;

    @Column(name="selected_count")
    private int questionSelectedCount;

}

