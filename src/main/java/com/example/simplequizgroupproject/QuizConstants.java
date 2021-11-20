package com.example.simplequizgroupproject;

import android.provider.BaseColumns;

public class QuizConstants {
    private QuizConstants(){ }
}

class QuestionsTable implements BaseColumns {
    public static final String TABLE_NAME = "quiz_questions";
    public static final String COULUMN_QUESTION = "question";
    public static final String COULUMN_OPTION1 = "option1";
    public static final String COULUMN_OPTION2 = "option2";
    public static final String COULUMN_OPTION3 = "option3";
    public static final String COULUMN_OPTION4 = "option4";
    public static final String COULUMN_ANSWER_NUM = "answer_num";
    public static final String COULUMN_EMPTY = "answer_empty";
}
