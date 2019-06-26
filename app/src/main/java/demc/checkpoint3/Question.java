package demc.checkpoint3;

public class Question
{
    private String mText;
    private boolean mTFAnswer;
    private String[] mFillAnswers;
    // 0 = read in boolean, 1 = read in string, 2 = read in number
    private int mAnswerType;

    public Question(String text, boolean ans)
    {
        mText = text;
        mTFAnswer = ans;
        mAnswerType = 0;
    }

    public Question(String text, String... ans)
    {
        mText = text;
        mFillAnswers = ans;
        mAnswerType = 1;
    }

    // checks the user inputs against the answer.
    // returns whether the user answered the question correctly.
    public boolean checkAnswer(boolean userAnswer)
    {
        return (mTFAnswer == userAnswer);
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

    public int getAnswerType()
    {
        return mAnswerType;
    }

    public String[] getFillAnswers()
    {
        return mFillAnswers;
    }

    public String getText()
    {
        return mText;
    }

    public void setText(String text)
    {
        mText = text;
    }

    public boolean getTFAnswer()
    {
        return mTFAnswer;
    }

    public void setTFAnswer(boolean TFAnswer)
    {
        mTFAnswer = TFAnswer;
    }

    public String toString()
    {
        return "Question: " + mText + "  answer: " + mTFAnswer;
    }
}
