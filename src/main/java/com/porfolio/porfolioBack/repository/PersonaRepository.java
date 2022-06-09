/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolio.porfolioBack.repository;

import com.porfolio.porfolioBack.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ramiro
 */
public interface PersonaRepository extends JpaRepository <Persona, Long>
{
    
}
