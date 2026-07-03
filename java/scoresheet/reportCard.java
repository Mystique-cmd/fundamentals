import java.util.Scanner;
public class  reportCard {
    public static void main (String[] args){


        //School Details
        Scanner input = new Scanner(System.in);
        System.out.print("Enter School Name:");
        String schoolName = input.nextLine();

        System.out.print("Enter Teacher's Name:");
        String teacherName = input.nextLine();

        System.out.print("Enter Grade:");
        String grade = input.nextLine();

        System.out.print("Enter Year:");
        String year = input.nextLine();

        //Student Details
        System.out.print("Enter Students No.:");
        int studentNo = input.nextInt();
        input.nextLine(); // Consume the newline character

        String[] names = new String[studentNo];
        int[] englishMarks = new int[studentNo];
        int[] mathMarks = new int[studentNo];
        int[] historyMarks = new int[studentNo];
        int[] geographyMarks = new int[studentNo];
        int[] scienceMarks = new int[studentNo];
        int[] programmingMarks = new int[studentNo];
        int[] totalMarks = new int[studentNo];
        String[] grades = new String[studentNo];

        for (int i = 0; i < studentNo; i++){
            System.out.println("Enter student" + (i +1) + "details");
            System.out.print("Student Name:");
            names[i] = input.nextLine();

            System.out.print("English Marks:");
            englishMarks[i] = input.nextInt();

            System.out.print("Maths Marks:");
            mathMarks[i] = input.nextInt();

            System.out.print("History Marks:");
            historyMarks[i] = input.nextInt();

            System.out.print("Geography Marks:");
            geographyMarks[i] = input.nextInt();

            System.out.print("Science Marks:");
            scienceMarks[i] = input.nextInt();

            System.out.print("Programming Marks:");
            programmingMarks[i] = input.nextInt();
            input.nextLine(); // Consume the newline character

            totalMarks[i] = englishMarks[i] + mathMarks[i] + historyMarks[i] + geographyMarks[i] + scienceMarks[i] + programmingMarks[i];
        }

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;
        for (int i = 0; i < studentNo; i++) {
            if (totalMarks[i] >= 540) {
                grades[i] = "A";
                aCount++;
            } else if (totalMarks[i] >= 480) {
                grades[i] = "B";
                bCount++;
            } else if (totalMarks[i] >= 420) {
                grades[i] = "C";
                cCount++;
            } else if (totalMarks[i] >= 360) {
                grades[i] = "D";
                dCount++;
            } else {
                grades[i] = "F";
                fCount++;
            }
        }

        //Computations
        int sumEnglish = 0;
        int sumMath = 0;
        int sumHistory = 0;
        int sumGeography = 0;
        int sumScience = 0;
        int sumProgramming = 0;
        int sumTotal = 0;

        //totals
        for (int i = 0; i < englishMarks.length; i++) {
            sumEnglish += englishMarks[i];
        }
        for (int i = 0; i < mathMarks.length; i++) {
            sumMath += mathMarks[i];
        }
        for (int i = 0; i < historyMarks.length; i++) {
            sumHistory += historyMarks[i];
        }
        for (int i = 0; i < geographyMarks.length; i++) {
            sumGeography += geographyMarks[i];
        }
        for (int i = 0; i < scienceMarks.length; i++) {
            sumScience += scienceMarks[i];
        }
        for (int i = 0; i < programmingMarks.length; i++) {
            sumProgramming += programmingMarks[i];
        }
        for (int i = 0; i < totalMarks.length; i++) {
            sumTotal+=totalMarks[i];
        }

        //average
        int englishAvg = sumEnglish/studentNo;
        int mathsAvg = sumMath / studentNo;
        int historyAvg = sumHistory /studentNo;
        int scienceAvg = sumScience /studentNo;
        int programmingAvg = sumProgramming / studentNo;
        int geographyAvg = sumGeography /studentNo;
        int totalAvg = sumTotal/studentNo;

        //gradeNo.s

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("                                        School Name:" + schoolName);
        System.out.println("                                        Teacher:" + teacherName);
        System.out.println("                                        Grade:" + grade);
        System.out.println("                                        Year:" + year);
        System.out.println("===========================================================================================");
       System.out.println(
    "Student Name\t\tEnglish\tMath\tHistory\tGeography  Science  Programming\tTotal\tGrade"
);


        System.out.println("===========================================================================================");
        for (int i = 0; i < studentNo; i++) {
            System.out.println(

            names[i] + "\t\t" +
            englishMarks[i] + "\t" +
            mathMarks[i] + "\t" +
            historyMarks[i] + "\t" +
            geographyMarks[i] + "\t\t" +
            scienceMarks[i] + "\t" +
            programmingMarks[i] + "\t" +
            totalMarks[i] + "\t" +
            grades[i]
    );

        }
        System.out.println("--------------------------------------------------------------------------------------------");

// Totals
System.out.println("                    \t"+sumEnglish + "\t" + sumMath + "\t" + sumHistory + "\t" + sumGeography + "\t\t" + sumScience + "\t" + sumProgramming + "\t" + sumTotal
);

System.out.println("--------------------------------------------------------------------------------------------");

// Averages
System.out.println(
   "                    \t"+ englishAvg + "\t" + mathsAvg + "\t" +historyAvg + "\t" +geographyAvg + "\t\t" +scienceAvg + "\t" +programmingAvg + "\t" +totalAvg
);

        System.out.println("=============================================================================================");
        System.out.println("Rank:   A's: " + aCount + "   B's: " + bCount + "   C's: " + cCount + "   D's: " + dCount + "   F's: " + fCount);

    }
}