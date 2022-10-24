package com.bosonit.persona.infrastructure.controller.crud;

import com.bosonit.persona.application.service.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeletePersonaController {

    @Autowired
    PersonaServiceImpl personaService;

    @DeleteMapping("/deletePersona/{id}")
    public String deletePersona(@PathVariable ("id") Integer id_persona){
        return personaService.deletePersonById(id_persona);
    }
}
