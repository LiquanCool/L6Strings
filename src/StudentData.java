public class StudentData {


    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;


    public StudentData(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
    }


    public void updateGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    public void addTestScore(double newTestScore) {
        accumulatedTestScores += newTestScore;
        testScoreCount ++;
    }

    public int getTestScoreCount() {
        return testScoreCount;
    }


    public double averageTestScore() {
        return accumulatedTestScores / testScoreCount;
    }

    public void printStudentInfo() {
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Graduation Year: " + gradYear);
        System.out.println("Average Test Score: " + averageTestScore());
        System.out.println("Number of Tests Averaged: " + testScoreCount);
    }
    public String toString(){
        String str = "Student Name: " + firstName + " " + lastName+ "\n" +"Graduation Year: " + gradYear + "\n" + "Average Test Score: " + averageTestScore() +
    }
}