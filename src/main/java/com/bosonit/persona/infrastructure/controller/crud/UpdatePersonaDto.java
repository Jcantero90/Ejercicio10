package com.bosonit.persona.infrastructure.controller.crud;

import com.bosonit.persona.application.service.PersonaServiceImpl;
import com.bosonit.persona.domain.Persona;
import com.bosonit.persona.infrastructure.controller.outPutPersonaDto.OutPutPersonaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdatePersonaDto {

    @Autowired
    PersonaServiceImpl personaService;

    @PutMapping("/updatePersona/{id}")
    public OutPutPersonaDto updatePersona (@PathVariable("id") Integer id_persona, @RequestBody Persona persona){
        return personaService.updatePersona(id_persona, persona);
    }
}
