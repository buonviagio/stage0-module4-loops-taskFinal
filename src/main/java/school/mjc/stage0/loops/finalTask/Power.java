package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int result = numberToPrint;

        if (power == 0) {
            System.out.println(1);
        } else if (power < 0) {
            power *= -1;
            for (int i = 2; i <= power; i++) {
                result *= numberToPrint;
            }
            float tmp = 1;
            System.out.println(tmp / result);
        } else {
            for (int i = 2; i <= power; i++) {
                result *= numberToPrint;
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
