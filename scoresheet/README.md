# Score Sheet

This is a simple Java command-line application to generate a report card for a class of students.

## Description

The program takes the following information as input:
- School Name
- Teacher's Name
- Grade
- Year
- Number of students
- For each student:
  - Name
  - Marks in English, Maths, History, Geography, Science, and Programming

It then calculates the total marks for each student, assigns a grade, and displays a formatted report card with the following details:
- Student's name
- Marks in each subject
- Total marks
- Grade

The report also includes the total and average marks for each subject across all students, and a summary of the number of students who achieved each grade (A, B, C, D, F).

## How to Compile and Run

1.  **Compile the Java code:**
    ```bash
    javac reportCard.java
    ```

2.  **Run the compiled code:**
    ```bash
    java reportCard
    ```

## Example Usage

When you run the program, it will prompt you to enter the details. Here is an example of the interaction:

```
Enter School Name:Greenwood High
Enter Teacher's Name:Mr. Smith
Enter Grade:10
Enter Year:2023
Enter Students No.:2
Enter student1details
Student Name:John Doe
English Marks:85
Maths Marks:90
History Marks:78
Geography Marks:88
Science Marks:92
Programming Marks:95
Enter student2details
Student Name:Jane Smith
English Marks:92
Maths Marks:88
History Marks:85
Geography Marks:90
Science Marks:89
Programming Marks:91
```

### Example Output

Based on the input above, the program will generate the following report:

```
------------------------------------------------------------------------------------------
                                        School Name:Greenwood High
                                        Teacher:Mr. Smith
                                        Grade:10
                                        Year:2023
===========================================================================================
Student Name		English	Math	History	Geography  Science  Programming	Total	Grade
===========================================================================================
John Doe		       85	  90	   78	      88		     92	     95	         528   B
Jane Smith		     92 	88	   85	      90		     89	     91	         535   B
--------------------------------------------------------------------------------------------
                  177 	178	   163	    178		     181	   186	       1063
--------------------------------------------------------------------------------------------
                   88	   89	    81	     89		      90	    93	        531
=============================================================================================
Rank:   A's: 0   B's: 2   C's: 0   D's: 0   F's: 0
```
