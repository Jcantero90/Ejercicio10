package com.bosonit.persona.infrastructure.controller.crud;

import com.bosonit.persona.application.service.PersonaServiceImpl;
import com.bosonit.persona.infrastructure.controller.outPutPersonaDto.OutPutPersonaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindPersonaController {

    @Autowired
    PersonaServiceImpl personaService;

    @GetMapping("/getPersona/{id}")
    public OutPutPersonaDto findPersona (@PathVariable ("id") Integer id_persona){
        return personaService.findByIdPersona(id_persona);
    }
}
