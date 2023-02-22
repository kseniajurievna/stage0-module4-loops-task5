package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int interval = 5;
        for (int i = 0; i <=sideLength; i++){
            for (int j = 0; j<=sideLength; j++){
                if(j == interval){
                    System.out.print("8");
                } else if(i == interval){
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
