/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml7;

import java.util.ArrayList;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Detective extends Persona{
    private String numeroPlaca;
    private ArrayList<Mafioso> investigacion = new ArrayList<>();

    public Detective() {
        
    }

    public Detective(String numeroPlaca, String nombre, String apellido, Foto foto, ArrayList<MedioDeComunicacion> comunicaciones, ArrayList<Perfil> perfiles) {
        super(nombre, apellido, foto, comunicaciones, perfiles);
        this.numeroPlaca = numeroPlaca;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }
    
    public ArrayList<Mafioso> getInvestigacion(){
        return this.investigacion;
    }
    public void setInvesticion(ArrayList<Mafioso> investigacion){
        this.investigacion = investigacion;
    }
    
    public boolean investigarMafioso(Mafioso mafioso){
        if (this.investigacion.contains(mafioso)){
            System.out.printf("%s se encuentra bajo investigación \n", mafioso.getNombre());
            return true;
        }else {
            System.out.printf("%s se encuentra libre de investigaciones \n", mafioso.getNombre());
            return false;
        }
    }
    
}
