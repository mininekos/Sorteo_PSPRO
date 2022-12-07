/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJOS;

import Enums.TipoVivienda;
import java.util.Objects;

/**
 *
 * @author Dam
 */
public class Vivienda {
    
    private String registro;
    private String dirección;
    private TipoVivienda vivienda;

    public Vivienda(String registro, String dirección, TipoVivienda vivienda) {
        this.registro = registro;
        this.dirección = dirección;
        this.vivienda = vivienda;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public TipoVivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(TipoVivienda vivienda) {
        this.vivienda = vivienda;
    }

    @Override
    public String toString() {
        return "Vivienda{" + "registro=" + registro + ", direcci\u00f3n=" + dirección + ", vivienda=" + vivienda + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.registro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vivienda other = (Vivienda) obj;
        return Objects.equals(this.registro, other.registro);
    }
    
    
}
