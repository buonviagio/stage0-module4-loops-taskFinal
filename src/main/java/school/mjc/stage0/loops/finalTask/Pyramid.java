package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {

            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }

            int result = i;
            for (int e = 1; e <= i; e++) {
                System.out.print(result--);

            }

            for (int y = 1; y <= i; y++) {
                if (y == 1) {
                    continue;
                }
                System.out.print(y);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
