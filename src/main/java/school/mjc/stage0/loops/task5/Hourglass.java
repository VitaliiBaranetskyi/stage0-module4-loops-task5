package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for(int  i = 0; i < height; i++){
            for(int  j = 0; j < height; j++) {
                if(((i > j || j > height - 1 - i) && i < height / 2) || ((height - 1 - i > j || j > i) && i >= height / 2))
                    System.out.print(" ");
                else
                    System.out.print("8");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hourglass hourglass = new Hourglass();
        hourglass.printHourglassOfGivenSize(10);
    }
}
