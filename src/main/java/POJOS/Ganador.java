/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJOS;

import java.util.Objects;

/**
 *
 * @author Dam
 */
public class Ganador<T extends Aspirante,E extends Vivienda> {

    private T t;
    private E e;

    public Ganador(T t, E e) {
        this.t = t;
        this.e = e;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Ganador{" + "t=" + t + ", e=" + e + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.t);
        hash = 17 * hash + Objects.hashCode(this.e);
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
        final Ganador<?, ?> other = (Ganador<?, ?>) obj;
        if (!Objects.equals(this.t, other.t)) {
            return false;
        }
        return Objects.equals(this.e, other.e);
    }
    
    
    
    
}
