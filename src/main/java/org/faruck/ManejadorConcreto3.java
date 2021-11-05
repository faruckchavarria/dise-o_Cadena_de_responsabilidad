package org.faruck;

public class ManejadorConcreto3 extends Manejador {
    public double calculaCosteEnvio(Paquete p) {
        if (p.getDestino().equals("España")) {
            return p.getPeso() * 1.5 + 3;
        } else if (super.getSucesor() != null) {
            return getSucesor().calculaCosteEnvio(p);
        }
        return 0;
    }
}
