package controlflow;

public class SwitchCase {
    public static void main(String[] args) {
        char grade = 'A';
        int marks;

        SwitchCase obj = new SwitchCase();

        switch (grade) {
            case 'A':
                marks = 90;
                break;
            case 'F':
                marks = 75;
                break;
            case 'D':
                marks = 65;
                break;
            default:
                marks = 0;
                break;

        }

        System.out.println(marks);

    }


    public void gradeAMarkrange() {
        System.out.println(" Grade A: > 80");

    }
}