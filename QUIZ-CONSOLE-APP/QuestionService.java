import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[5];
    String [] selection = new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");

    }
    

    public void displayQuestions()
    {  
        int score = 0;
        int i = 0;
        for (Question q : questions) {
            System.out.println(q);
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            if(selection[i].equals(q.getAnswer())){
                score++;
            }

            i++;
        }

        for (String s : selection) {
            System.out.println(s);
            
        }
        // 4,8,8,2,1 should print 3 out of 5 in console
        System.out.println("Your score is : " + score + " out of " + (questions.length));
        
    }
}
