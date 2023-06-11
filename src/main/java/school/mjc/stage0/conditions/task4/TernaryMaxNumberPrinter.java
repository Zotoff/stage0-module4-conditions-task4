package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int biggest = first > second ? (first > third ? first : third) : (second > third ? second : third);
        System.out.println(biggest);
        if (biggest == first && first == second) {
            System.out.println(first);
        } else if (biggest == first && first == third) {
            System.out.println(third);
        } else if (biggest == second && second == third) {
            System.out.println(second);
        }
    }
}
