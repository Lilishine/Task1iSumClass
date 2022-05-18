public class Main {
    public static void main(String[] args) {
        int resultado = 0;
        resultado = suma (2,3,4);
        System.out.println(resultado);
        Coche miCoche = new Coche();
        miCoche.ingrement();
        System.out.println(miCoche.almacen);
          }
    public static int suma (int a, int b, int c){
        return a+b+c;
    }
}
class Coche {

    public int almacen = 4;
    public  void ingrement(){
        this. almacen ++;
    }
}