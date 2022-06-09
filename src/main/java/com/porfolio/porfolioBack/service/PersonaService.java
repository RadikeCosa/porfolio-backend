/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.porfolioBack.service;

import com.porfolio.porfolioBack.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfolio.porfolioBack.repository.PersonaRepository;
import java.util.List;

/**
 *
 * @author Ramiro
 */
@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private PersonaRepository persoRepository;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona perso) {
        persoRepository.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
    persoRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
    //el orElse es por si no encuentra la persona
    Persona perso = persoRepository.findById(id).orElse(null);
    return perso;
    }
}
