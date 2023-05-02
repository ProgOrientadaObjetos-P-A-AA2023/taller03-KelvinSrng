package equipocelular;



public class Ejecutor {
    public static void main(String[] args) {
        
        // Se crea un objeto
        EquipoCelular telefono = new EquipoCelular();
        
        // Valores de entrada
        String sistemaOperativo = "Android";
        double tamanioPantala = 6.4;
        double costoInicial = 180.50;
        double ivaPorcentaje = 0.12;
        String direccionMac = "E0:83:D0:5D:81:zz88";
        String informacionIMEI = "519236487321658";
        
        // Uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        telefono.establecerSistemaOperativo(sistemaOperativo);
        telefono.establecerTamanioPantalla(tamanioPantala);
        telefono.establecerCostoInicial(costoInicial);
        telefono.establecerIvaPorcetaje(ivaPorcentaje);
        telefono.establecerDireccionMac(direccionMac);
        telefono.establecerInformacionIMEI(informacionIMEI);
        
        telefono.calcularIvaCostoInicial();
        telefono.calcularCostoFinal();
        
        System.out.printf("Equipo Celular\n\nSistema operativo: %s\nTamaño"
                + " pantalla: %s\nCosto inicial: %.2f\nIva porcentaje: 12"
                + "\nDireccion Mac: %s\nInformacion IMEI: %s\nIva del costo "
                + "inicial: %.2f\nCosto final: %.2f\n",telefono.obtenerSistemaOperativo(),
                telefono.obtenerTamanioPantalla(),
                telefono.obtenerCostoInicial(),
                //telefono.obtenerIvaPorcentaje(),
                telefono.obtenerDireccionMac(),
                telefono.obtenerInformacionIMEI(),
                telefono.obtenerIvaCostoInicial(),
                telefono.obtenerCostoFInal());
    }
}
