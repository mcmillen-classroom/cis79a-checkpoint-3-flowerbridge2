package demc.checkpoint3;

public class Question
{
    private String mText;
    private boolean mTFAnswer;
    private String mFillAnswer;
    // 0 = read in boolean, 1 = read in string, 2 = read in number
    private int mAnswerType;

    public Question(String text, boolean ans)
    {
        mText = text;
        mTFAnswer = ans;
        mAnswerType = 0;
    }

    public Question(String text, String ans)
    {
        mText = text;
        mFillAnswer = ans;
        mAnswerType = 1;
    }

    public int getAnswerType()
    {
        return mAnswerType;
    }

    public String getFillAnswer()
    {
        return mFillAnswer;
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
