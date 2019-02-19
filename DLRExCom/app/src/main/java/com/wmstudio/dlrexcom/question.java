package com.wmstudio.dlrexcom;

public class question {


    private int question;
    private String question_direction;
    private String question_color;
    private int question_dot;
    private int option1;
    private int option2;
    private int option3;
    public  question(){}

    public question(int question,String question_direction,String question_color,int question_dot, int option1, int option2, int option3) {
        this.question = question;
        this.question_direction=question_direction;
        this.question_color = question_color;
        this.question_dot = question_dot;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public int getOption1() {
        return option1;
    }

    public void setOption1(int option1) {
        this.option1 = option1;
    }

    public int getOption2() {
        return option2;
    }

    public void setOption2(int option2) {
        this.option2 = option2;
    }

    public int getOption3() {
        return option3;
    }

    public void setOption3(int option3) {
        this.option3 = option3;
    }

    public String getQuestion_direction() {
        return question_direction;
    }

    public void setQuestion_direction(String question_direction) {
        this.question_direction = question_direction;
    }

    public String getQuestion_color() {
        return question_color;
    }

    public void setQuestion_color(String question_color) {
        this.question_color = question_color;
    }

    public int getQuestion_dot() {
        return question_dot;
    }

    public void setQuestion_dot(int question_dot) {
        this.question_dot = question_dot;
    }
}
