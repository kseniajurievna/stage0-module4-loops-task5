package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 0; i <=height; i++){
           for (int j = 0; j <=length; j++){
               if (i == 0 || i == height){
                   System.out.print("-");
               } else if (j == 0 || j == length){
                   System.out.print("|");
               } else{
                   System.out.print(" ");
               }
           }
            System.out.println();
        }
    }
}
