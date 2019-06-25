package demc.checkpoint3;

import java.util.Scanner;

public class QuizOOPMain
{
    // this is where the app starts
    public static void main(String[] args)
    {
        Question[] questions = new Question[2];
        questions[0] = new Question("Laney is better than BCC?", true);
        questions[1] = new Question("Java is an easy to understand language?", false);

        int index = 0;
        int score = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the quiz! Good luck!");

        // 2 < 2 is false
        while (index < questions.length)
        {
            System.out.println(questions[index].getText());
            System.out.print("Enter t/f: ");
            String in = input.nextLine();
            boolean boolResponse;

            if (in.equals("t"))
            {
                boolResponse = true;
            }
            else
            {
                boolResponse = false;
            }

            if (questions[index].getAnswer() == boolResponse)
            {
                System.out.println("You are correct!");
            }
            else
            {
                System.out.println("You are incorrect!");
            }

            index++;
        }
    }
}
