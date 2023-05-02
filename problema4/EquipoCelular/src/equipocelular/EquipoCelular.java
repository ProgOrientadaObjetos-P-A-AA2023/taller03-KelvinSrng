package equipocelular;


public class EquipoCelular {
    
    private String sistemaOperativo;
    private double tamanioPantala;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String informacionIMEI;
    
    
    public void establecerSistemaOperativo(String x) {
        sistemaOperativo = x;
    }
    
    public void establecerTamanioPantalla(double x) {
        tamanioPantala = x;
    }
    
    public void establecerCostoInicial(double x) {
        costoInicial = x;
    }
    
    public void establecerIvaPorcetaje(double x) {
        ivaPorcentaje = x;
    }
    
    public void calcularIvaCostoInicial() {
        ivaCostoInicial = costoInicial * ivaPorcentaje;
    }
    
    public void calcularCostoFinal() {
        costoFinal = ivaCostoInicial + costoInicial;
    }
    
    public void establecerDireccionMac(String x) {
        direccionMac = x;
    }
    
    public void establecerInformacionIMEI(String x) {
        informacionIMEI = x;
    }
    
    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }
    
    public double obtenerTamanioPantalla() {
        return tamanioPantala;
    }
    
    public double obtenerCostoInicial() {
        return costoInicial;
    }
    
    public double obtenerIvaPorcentaje() {
        return ivaPorcentaje;
    }
    
    public double obtenerIvaCostoInicial() {
        return ivaCostoInicial;
    }
    
    public double obtenerCostoFInal() {
        return costoFinal;
    }
    
    public String obtenerDireccionMac() {
        return direccionMac;
    }
    
    public String obtenerInformacionIMEI() {
        return informacionIMEI;
    }
}
