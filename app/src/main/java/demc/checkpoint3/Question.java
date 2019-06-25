package demc.checkpoint3;

public class Question
{
    private String mText;
    private boolean mAnswer;

    public Question(String text, boolean ans)
    {
        mText = text;
        mAnswer = ans;
    }

    public String getText()
    {
        return mText;
    }

    public void setText(String text)
    {
        mText = text;
    }

    public boolean getAnswer()
    {
        return mAnswer;
    }

    public void setAnswer(boolean answer)
    {
        mAnswer = answer;
    }

    public String toString()
    {
        return "Question: " + mText + "  answer: " + mAnswer;
    }
}
