package demc.checkpoint3;

public class FillTheBlankQuestion extends Question
{
    private String[] mFillAnswers;

    public FillTheBlankQuestion(String text, String... ans)
    {
        super(text);
        mFillAnswers = ans;
    }

    // fill the blank question check
    @Override
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
