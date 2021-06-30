
package ec.edu.intsuperior.modelo;

public class Bicicleta {
int numeroRin;
String marca;
double presio;
int tamanio;
String color;

public Bicicleta() {
     
}
public Bicicleta(int numeroRin, String marca, double presio, int tamanio, String color ){
    this. numeroRin = numeroRin;
    this.marca = marca;
    this.presio = presio;
    this.tamanio = tamanio;
    this.color = color;
}

    public int getNumeroRin() {
        return numeroRin;
    }

    public void setNumeroRin(int numeroRin) {
        this.numeroRin = numeroRin;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPresio() {
        return presio;
    }

    public void setPresio(double presio) {
        this.presio = presio;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
}
