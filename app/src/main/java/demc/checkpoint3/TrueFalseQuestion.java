package demc.checkpoint3;

public class TrueFalseQuestion extends Question
{
    private boolean mTFAnswer;
    private String[] mFillAnswers;

    public TrueFalseQuestion(String text, boolean ans)
    {
        super(text);
        mTFAnswer = ans;
    }

    // checks the user inputs against the answer.
    // returns whether the user answered the question correctly.
    @Override
    public boolean checkAnswer(boolean userAnswer)
    {
        return (mTFAnswer == userAnswer);
    }

    public boolean getTFAnswer()
    {
        return mTFAnswer;
    }

    public void setTFAnswer(boolean TFAnswer)
    {
        mTFAnswer = TFAnswer;
    }

    // fill the blank question check
    public boolean checkAnswer(String userAnswer)
    {
        for (String ans : getFillAnswers())
        {
            if (ans.equalsIgnoreCase(userAnswer))
            {
                return true;
            }
        }

        return false;
    }

    public String[] getFillAnswers()
    {
        return mFillAnswers;
    }
}
