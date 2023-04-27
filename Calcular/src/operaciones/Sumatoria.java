package operaciones;

public class Sumatoria {
    private int suma = 0; // variable instancia para acumular la suma

    public int sumatoria(int i) {
        for (int j = 1; j < (i+1); j++) {
            suma +=j;
        }
        return suma;
    }
}
