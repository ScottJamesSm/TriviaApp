package com.example.scottsmith.triviaapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TakeQuizFragment extends Fragment {
    @BindView(R.id.quiz_question_textview)
    protected TextView quizQuestion;

    @BindView((R.id.answer_one_button))
    protected Button answerOneButton;

    @BindView(R.id.answer_two_button)
    protected Button answerTwoButton;

    @BindView((R.id.answer_three_button))
    protected Button answerThreeButton;

    @BindView((R.id.answer_four_button))
    protected Button answerFourButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);
        ButterKnife.bind(this, view);
        return view;


    }

    public static TakeQuizFragment newInstance() {

        Bundle args = new Bundle();

        TakeQuizFragment fragment = new TakeQuizFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @OnClick(R.id.answer_one_button)
    protected void buttonOneClicked() {


    }

    @OnClick(R.id.answer_two_button)
    protected void buttonTwoClicked() {


    }

    @OnClick(R.id.answer_three_button)
    protected void buttonThreeClicked() {


    }


    @OnClick(R.id.answer_four_button)
    protected void buttonFourClicked() {


    }


    @OnClick(R.id.next_button)
    protected void nextButtonClicked() {


    }

}

