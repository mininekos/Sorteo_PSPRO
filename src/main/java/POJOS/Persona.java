/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJOS;

import Enums.TipoPersona;
import Excepcion.NotNullDNI;
import java.util.Objects;

/**
 *
 * @author Dam
 */
public class Persona extends Aspirante{
    

    private TipoPersona tipo;

    public Persona(TipoPersona tipo, String nombre, String dni) throws NotNullDNI {
        super(nombre, dni);
        this.tipo = tipo;
        if(dni.equals("")){
            throw new NotNullDNI();
        }
    }
 

    public TipoPersona getTipo() {
        return tipo;
    }

    public void setTipo(TipoPersona tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return super.toString()+" Persona --> tipo=" + tipo;
    }
    
    
    
}
