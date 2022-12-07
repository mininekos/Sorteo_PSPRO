/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJOS;

import Enums.TipoVecinal;
import java.util.Objects;

/**
 *
 * @author Dam
 */
public class Organizacion extends Aspirante{
    

    private TipoVecinal vecinal;

    public Organizacion(TipoVecinal vecinal, String nombre, String dni) {
        super(nombre, dni);
        this.vecinal = vecinal;
    }

    public TipoVecinal getVecinal() {
        return vecinal;
    }

    public void setVecinal(TipoVecinal vecinal) {
        this.vecinal = vecinal;
    }

    @Override
    public String toString() {
        return "Organizacion{ vecinal=" + vecinal + '}';
    }


    
    
}
