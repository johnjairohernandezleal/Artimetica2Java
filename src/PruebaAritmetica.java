public class PruebaAritmetica {
    public static void main(String[] args) {
        //creamos un objeto de la clase artimetica
        Aritmetica objeto1 = new Aritmetica();
        objeto1.a=5;
        objeto1.b=3;
        
        int resultado = objeto1.sumar();
        System.out.println("resultado = " + resultado);

        //creamos un segundo objeto de tipo aritmetica para llamar el contructor con argumentos
        Aritmetica objeto2 = new Aritmetica(2,4);
        System.out.println("resultado 2 = " + objeto2.sumar());
    }
}
