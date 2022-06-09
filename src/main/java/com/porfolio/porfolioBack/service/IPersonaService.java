/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolio.porfolioBack.service;

import com.porfolio.porfolioBack.model.Persona;
import java.util.List;

/**
 *
 * @author Ramiro
 */
public interface IPersonaService {
    // Traer todas las personas
    public List<Persona> getPersonas ();
    
    //dar de alta una persona
    public void savePersona (Persona perso);
    
    //borrar una persona
    public void deletePersona (Long id);
    
    // traer una persona
    public Persona findPersona (Long id);
    
  
            
            
}
