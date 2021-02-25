
package logica;

public class Reserva {
    private String fechaInicio;
    private String fechaTermina;
    private int costoTotal;
    private Persona p;

    public Reserva(String fechaInicio, String fechaTermina, int costoTotal, Persona p) {
        this.fechaInicio = fechaInicio;
        this.fechaTermina = fechaTermina;
        this.costoTotal = costoTotal;
        this.p = p;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaTermina() {
        return fechaTermina;
    }

    public void setFechaTermina(String fechaTermina) {
        this.fechaTermina = fechaTermina;
    }

    public Persona getP() {
        return p;
    }

    public void setP(Persona p) {
        this.p = p;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    
}
