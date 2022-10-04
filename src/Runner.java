public class Runner {
    public static void main(String[] args) {
        StudentData student1 = new StudentData("Bob", "Yes", 2025);
        student1.addTestScore(100);
        student1.addTestScore(98);
        student1.addTestScore(89);
        student1.addTestScore(99);
        System.out.println(student1);

    }
}
