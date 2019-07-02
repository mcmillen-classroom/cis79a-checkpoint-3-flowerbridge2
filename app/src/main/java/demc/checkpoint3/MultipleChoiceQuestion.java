package demc.checkpoint3;

import demc.checkpoint3.Question;

import java.util.Scanner;

public class MultipleChoiceQuestion extends Question
{
    private String[] mOptions;
    private int mAnswer;

    public MultipleChoiceQuestion(String text, String[] options, int answer){
        super(text);
        mOptions = options;
        mAnswer = answer;
    }

    @Override
    public boolean checkAnswer(int ans){
        return (mAnswer == ans);
    }


    public boolean isMultipleChoiceQuestion(){
        return true;
    }

    @Override
    public boolean readInputAndCheckAnswer(Scanner input)
    {
        for(int i = 0; i < mOptions.length; i++) {
            System.out.println(i + " " + mOptions[i]);
        }

        System.out.println("Enter the index of your answer ");
        int in = input.nextInt();
        return checkAnswer(in);
    }
}


