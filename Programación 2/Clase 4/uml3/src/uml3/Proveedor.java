/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml3;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Proveedor {
    private int codigo;
    private String razonSocial;

    public Proveedor(){
        
    }
    public Proveedor(int codigo, String razonSocial) {
        this.codigo = codigo;
        this.razonSocial = razonSocial;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
}
