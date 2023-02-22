package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    System.out.print("|");
                } else if (i==j) {
                    System.out.print("\\");
                }
                else if (i==cathetusLength){
                    System.out.print("_");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
