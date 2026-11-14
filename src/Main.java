import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] quastions = {"1.Which organ in the human body is responsible for pumping blood? ",
                "2.What is the pH level of pure water at 25°C? ",
                "3.According to Newton's Second Law of Motion, what is the formula relating force, mass, and acceleration? ",
                "4.Which gas do plants absorb from the atmosphere during photosynthesis? ",
                "5.Which part of the cell controls most of its activities?"};

        String[][] options = {{"1.Lungs ","2.Liver ","3.Kidneys ","4.Heart "},
                {"1.0 ", "2.7 ", "3.5 ", "4.10 "},
                {"1. F = m/v ", "2. F = m/a ", "3. F = ma ", "4. F = md "},
                {"1.Carbon dioxide", "2.Oxygen ", "3.Nitrigen ", "4.Hydrogen "},
                {"1.Cytoplasm ", "2.Nucleus ", "3.cell membrance ", "4.Mitochondria"}};
        int[] correctAnswer={4,2,3,1,2};


        System.out.println("********************");
        System.out.println(" LITTLE QUIZ IN SCIENCE(PHYISCS/BIOLOGY) ");
        System.out.println("********************");
        System.out.println("Your name ?");
        String name = scanner.next();
        System.out.println("Hello "+name+" 👋");
        System.out.println("Are you ready ? ");
       scanner.next();
        System.out.println("3\n2\n1");
        int score=0;
        for (int i =0;i<quastions.length;i++) {
            System.out.println(quastions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
                System.out.print("Your answer (just the number) : ");
                int answer = scanner.nextInt();
                if (answer == correctAnswer[i]) {
                    System.out.println("Correct!🥳");
                    score++;
                } else {
                    System.out.println("Wrong!🤦");
                }
        }
        System.out.println(name+".. Your final score is "+score+" out of "+quastions.length);
    }
}
