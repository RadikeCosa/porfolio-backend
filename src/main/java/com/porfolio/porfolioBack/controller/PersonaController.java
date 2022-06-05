/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.porfolioBack.controller;

import com.porfolio.porfolioBack.model.Persona;
import com.porfolio.porfolioBack.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ramiro
 */
@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping ("/personas/traer")
    public List<Persona> getPersonas() {
        return interPersona.getPersonas();
    }
    
    @PostMapping ("/personas/crear")
    public String createPersona(@RequestBody Persona perso) {
    
    interPersona.savePersona(perso);    
    // el string confirma si se creo correctamente
    return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona (@PathVariable Long id) {
        
        interPersona.deletePersona(id);
        // el string confirma si se borro correctamente
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping ("/personas/editar/{id}")
    public Persona editPersona (@PathVariable Long id, 
                                 @RequestParam ("nombre") String nuevoNombre,
                                 @RequestParam ("apellido") String nuevoApellido,
                                 @RequestParam ("email") String nuevoEmail,
                                 @RequestParam ("linkedin") String nuevoLinkedin,
                                 @RequestParam ("github") String nuevoGithub,
                                 @RequestParam ("twitter") String nuevoTwitter,
                                 @RequestParam ("instagram") String nuevoInstagram,
                                 @RequestParam ("about") String nuevoAbout) {
        
        Persona perso = interPersona.findPersona(id);
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setEmail(nuevoEmail);
        perso.setLinkedin(nuevoLinkedin);
        perso.setGithub(nuevoGithub);
        perso.setTwitter(nuevoTwitter);
        perso.setInstagram(nuevoInstagram);
        perso.setAbout(nuevoAbout);
        
        interPersona.savePersona(perso);
        return perso;
        
    }
    
    
}
