/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml5;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Rueda {
    private String tipo;
    private double presion;

    public Rueda() {
        
    }
    public Rueda(String tipo, double presion) {
        this.tipo = tipo;
        this.presion = presion;
    }

    public String getTipo() {
        return tipo;
    }
    public double getPresion() {
        return presion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setPresion(double presion) {
        this.presion = presion;
    }
    
    
    
}
