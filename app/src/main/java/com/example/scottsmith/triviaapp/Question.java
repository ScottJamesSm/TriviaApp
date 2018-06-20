package com.example.scottsmith.triviaapp;

public class Question {
    private String questionTitle;
    private String  coreectAnswer;
    private String  worngAnswer;
    private String  wrongAnswer2;
    private String  WrongAnswer3;

    public Question(String questionTitle, String coreectAnswer, String worngAnswer, String wrongAnswer2, String wrongAnswer3) {
        this.questionTitle = questionTitle;
        this.coreectAnswer = coreectAnswer;
        this.worngAnswer = worngAnswer;
        this.wrongAnswer2 = wrongAnswer2;
        WrongAnswer3 = wrongAnswer3;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public String getCoreectAnswer() {
        return coreectAnswer;
    }

    public String getWorngAnswer() {
        return worngAnswer;
    }

    public String getWrongAnswer2() {
        return wrongAnswer2;
    }

    public String getWrongAnswer3() {
        return WrongAnswer3;
    }
}
