package terreno;


public class Ejecutor {
    public static void main(String[] args) {
        
        // Creamos un objeto de tipo Terreno
        Terreno terreno = new Terreno();
        
        double ancho = 14;
        double largo = 60;
        double valorMetroCuadrado = 1310;
        
        terreno.estableceRancho(ancho);
        terreno.establecerLargo(largo);
        terreno.establecerValorMetroCuadrado(valorMetroCuadrado);
        
        terreno.calcularArea();
        terreno.calcularCostoTerreno();
        
        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
        System.out.printf("Datos terreno\n"
                + "\nEl ancho del terreno es: %.1f\n"
                + "El largo del terreno es: %.1f\n"
                + "El area del terreno es: %.1f\n"
                + "El costo del terreno es: %.2f dolares\n"
                , terreno.obteneRancho(),
                terreno.obtenerLargo(), 
                terreno.obtenerCalcularArea(),
                terreno.obtenerCalcularCostoTerreno());
        
    }
    
}
