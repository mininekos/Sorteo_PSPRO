/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sorteogenericos;

import Enums.TipoPersona;
import Enums.TipoVecinal;
import Enums.TipoVivienda;
import Excepcion.NotNullDNI;
import POJOS.Aspirante;
import POJOS.Ganador;
import POJOS.Organizacion;
import POJOS.Persona;
import POJOS.Vivienda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Dam
 */
public class SorteoGenericos {

    public static void main(String[] args) {
        
        ArrayList<Aspirante> aspirantes=miniDaoAspirante();
        ArrayList<Aspirante> participaciones= new ArrayList<Aspirante>();
        ArrayList<Vivienda> viviendas=miniDaoVivienda();
        ArrayList<Ganador> ganadores= new ArrayList<Ganador>();
        Random rnd= new Random();
        Collections.shuffle(viviendas);
        
        for (Aspirante aspirante : aspirantes) {
            int agregar=1;
            if(aspirante instanceof Persona){
                Persona persona=(Persona)aspirante;
                if(persona.getTipo()==TipoPersona.CON_HIJOS)
                    agregar=3;
                if(persona.getTipo()==TipoPersona.MINUSVALIDO)
                    agregar=2;
            }
            for(int cont=0;cont<agregar;cont++){
                participaciones.add(aspirante);
            }
        }
        Collections.shuffle(participaciones);
        for(int ind=0;ind<viviendas.size();ind++){
            ganadores.add(new Ganador(aspirantes.remove(0),viviendas.get(ind)));
        }
        
        for(int ind=0;ind<ganadores.size();ind++){
            System.out.println(ganadores.get(ind).toString());
        }
        
    }
    
    public static ArrayList<Aspirante> miniDaoAspirante(){
        ArrayList<Aspirante> lista=new ArrayList<Aspirante>();
        try{
            lista.add(new Persona(TipoPersona.CON_HIJOS,"Manu","32165478A"));
            lista.add(new Persona(TipoPersona.MINUSVALIDO,"Carlos","32165478B"));
            lista.add(new Persona(TipoPersona.SIN_HIJOS,"Pablo","32165478C"));
            lista.add(new Organizacion(TipoVecinal.EL_PELIRON, "Asisa", "32165478D"));
            lista.add(new Organizacion(TipoVecinal.LA_GRANJA, "Ole", "32165478E"));
        }
        catch(NotNullDNI e){
            System.out.println(e);
        }
        return lista;
    }
    
    public static ArrayList<Vivienda> miniDaoVivienda(){
        ArrayList<Vivienda> lista=new ArrayList<Vivienda>();
        lista.add(new Vivienda("1", "", TipoVivienda.CASA));
        lista.add(new Vivienda("2", "", TipoVivienda.CASA));
        lista.add(new Vivienda("3", "", TipoVivienda.PISO));
        lista.add(new Vivienda("4", "", TipoVivienda.PISO));
        return lista;
    }
}
