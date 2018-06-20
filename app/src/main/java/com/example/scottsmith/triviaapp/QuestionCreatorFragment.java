package com.example.scottsmith.triviaapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import javax.security.auth.callback.Callback;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QuestionCreatorFragment extends Fragment {


    @BindView(R.id.question_edittext)
    protected EditText question;

    @BindView(R.id.correct_answer_edititext)
    protected EditText correctAnswerInput;
    @BindView(R.id.first_wrong_answer_edit_text)
    protected EditText firstWrongAnswerInput;
    @BindView(R.id.second_wrong_answer_edit_text)
    protected EditText secondWrongAnswerInput;
    @BindView(R.id.third_wrong_answer_edit_text)
    protected EditText thirdWrongAnswerInput;

    private Callback callback;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_question_creator, container, false);
        ButterKnife.bind(this, view);
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
        //gets user input from EditTexts and saves them as variables
        String questionTitle = question.getText().toString();
        String correctAnswer = correctAnswerInput.getText().toString();
        String firstWrongAnswer = firstWrongAnswerInput.getText().toString();
        String secondWrongAnswer = secondWrongAnswerInput.getText().toString();
        String thirdWrongAnswer = thirdWrongAnswerInput.getText().toString();
        if (question.getText().toString().isEmpty() || correctAnswerInput.getText().toString().isEmpty() || firstWrongAnswerInput.getText().toString().isEmpty() || secondWrongAnswerInput.getText().toString().isEmpty() || thirdWrongAnswerInput.getText().toString().isEmpty() ) {

            Toast.makeText(getActivity(), "All fields are required!", Toast.LENGTH_SHORT).show();

        } else {
            //Takes variables created from user input and saves them in Question object
            Question question = new Question(questionTitle, correctAnswer, firstWrongAnswer, secondWrongAnswer, thirdWrongAnswer);
            callback.questionSaved(question);

        }
    }

    public void attachParent(Callback callback) {
        //sends question object we just created ot the xakkback method to be saved.
        this.callback = callback;
    }


    public interface Callback {

        void questionSaved(Question question);
    }


}
