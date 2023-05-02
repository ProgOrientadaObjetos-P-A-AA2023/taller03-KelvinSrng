package equivalentehora;


public class Ejecutor {
    public static void main(String[] args) {
        
        // Creamos un objeto de tipo EquivalenteHora
        EquivalenteHora equivalente = new EquivalenteHora();
        
        float horas = (float) 864.50;
        
        equivalente.establecerHoras(horas);
        
        equivalente.calcularMinutos();
        equivalente.calcularSegundos();
        equivalente.calcularDias();
        
        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
        System.out.printf("Equivalente en tiempo\n"
                + "Valor en horas: 864.50\n"
                + "\nValor en segundos: %.2f segundos\n"
                + "Valor en minutos: %.2f minutos\n"
                + "Valor en dias: %.2f dias\n",
                equivalente.obtenerCalcularSegundos(), 
                equivalente.obtenerCalcularMinutos(),
                equivalente.obtenerCalcularDias());
        
    }
}
