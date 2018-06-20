package com.example.scottsmith.triviaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements QuestionCreatorFragment.Callback {

    private QuestionCreatorFragment questionCreatorFragment;
    private List<Question> questionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        questionList = new ArrayList<>();
    }

    @OnClick(R.id.add_question_button)
    protected void addQuestionClicked() {
        questionCreatorFragment = QuestionCreatorFragment.newInstance();
        questionCreatorFragment.attachParent(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_holder, questionCreatorFragment).commit();
    }

    @Override
    public void questionSaved(Question question) {


        questionList.add(question);

        Toast.makeText(this, "question saved!!", Toast.LENGTH_SHORT).show();

        getSupportFragmentManager().beginTransaction().remove(questionCreatorFragment).commit();
    }
}
