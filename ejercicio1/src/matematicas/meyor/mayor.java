package matematicas.meyor;

public class mayor {

    public static int numeromayor(int a, int b, int c) {
        int aux = 0;
        if (a >= b) {
            if (a >= c) {
                aux = a;
            }
        }
        if (b >= a) {
            if (b > c) {
                aux = b;
            }
        }
        if (c >= b) {
            if (c > a) {
                aux = c;
            }
        }

        return aux;
    }

}
