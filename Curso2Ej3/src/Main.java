public class Main {
    public static void main(String[] args) {

        int resultado;
        resultado = suma(5, 10, 2);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int x, int y, int z) {
        return(x+y+z);
    }
    public static class Coche{
        public int puertas = 3;
        public void agregarPuertas(){
            puertas += 1;
        }
    }}
