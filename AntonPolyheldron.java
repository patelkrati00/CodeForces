
import java.util.*;

public class AntonPolyheldron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {

            if (arr[i].equals("Tetrahedron")) {
                res += 4;
            }
            if (arr[i].equals("Cube")) {
                res += 6;
            }
            if (arr[i].equals("Octahedron")) {
                res += 8;
            }
            if (arr[i].equals("Dodecahedron")) {
                res += 12;
            }
            if (arr[i].equals("Icosahedron")) {
                res += 20;
            }

        }
        System.out.println(res);
        sc.close();
    }
}
