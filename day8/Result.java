class Student {
    int rollNo;
    String name;

    void setStudent(int r, String n) {
        rollNo = r;
        name = n;
    }

    void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name       : " + name);
    }
}

class Exam extends Student {
    int[] marks = new int[6];

    void setMarks(int[] m) {
        for (int i = 0; i < 6; i++) {
            marks[i] = m[i];
        }
    }

    void displayMarks() {
        System.out.println("Marks in 6 subjects:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}

class Result extends Exam {
    int totalMarks;

    void calculateTotal() {
        totalMarks = 0;
        for (int i = 0; i < 6; i++) {
            totalMarks += marks[i];
        }
    }

    void displayResult() {
        displayStudent();
        displayMarks();
        System.out.println("Total Marks: " + totalMarks);
    }

    public static void main(String[] args) {
        Result r = new Result();

        r.setStudent(101, "Rahul Sharma");

        int[] marks = {75, 82, 68, 90, 77, 85};
        r.setMarks(marks);

        r.calculateTotal();
        r.displayResult();
    }
}
