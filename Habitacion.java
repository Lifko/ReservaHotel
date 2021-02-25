
package logica;


public class Habitacion {
    private int numero;
    private int camas;
    private int banos;
    private int costo;
    private String tipo;
    private boolean estado;
    private Reserva reserva;

    public Habitacion() {
    }
    
    public void agregarReserva(Reserva r){
        this.reserva=r;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getBanos() {
        return banos;
    }
 
    public void setBanos(int banos) {
        this.banos = banos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}
