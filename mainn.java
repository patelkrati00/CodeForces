import java.util.*;

public class mainn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        boolean lastCol = true;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i % 2 == 0) {
                    System.out.print("#");
                } else if (lastCol == true) {
                    if (j != col - 1)
                        System.out.print(".");
                    else {
                        System.out.print("#");

                    }
                     lastCol = false;


                } else {
                    if (j == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");

                    }
                    lastCol = true;
                }
            }
            System.out.println("");

        }
    }
}
