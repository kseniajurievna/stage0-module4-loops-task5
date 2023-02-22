package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for(int i=1; i<=height/2; i++)
        {
            for(int k=1; k<=i-1; k++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=5-i+1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=4; i>=1; i--)
        {
            for(int k=1; k<=i-1; k++)
            {
                System.out.print(" ");
            }
            for(int j=i; j<=5; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
//        for (int i = 0; i<=height; i++){
//            for (int j = 0; j <=height; j++){
//                if(i == 0 || i == height){
//                    System.out.print("o");
//                } else if (i > 0 && i <height/2){
//                    for(int n = 1; n<=height/2; n++){
//                        System.out.print("y");
//                    }
//                }
//            }
//            System.out.println();
//        }

    }
}
