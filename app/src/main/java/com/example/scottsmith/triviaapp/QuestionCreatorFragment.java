package com.example.scottsmith.triviaapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.OnClick;

public class QuestionCreatorFragment extends Fragment {


    @BindView(R.id.question_edittext)
    protected EditText question;

    @BindView(R.id.correct_answer_edititext)
    protected EditText correctAnswer;
    @BindView(R.id.first_wrong_answer_edit_text)
    protected EditText firstWrongAnswer;
    @BindView(R.id.second_wrong_answer_edit_text)
    protected EditText secongWrongAnswer;
    @BindView(R.id.third_wrong_answer_edit_text)
    protected EditText thirdWrongAnswer;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_question_creator, container, false);
        
        return view;
    }

    public static QuestionCreatorFragment newInstance() {

        Bundle args = new Bundle();

        QuestionCreatorFragment fragment = new QuestionCreatorFragment();
        fragment.setArguments(args);
        return fragment;
    }



    @OnClick(R.id.save_question_button)
    protected void addQuestion() {

    }


}
