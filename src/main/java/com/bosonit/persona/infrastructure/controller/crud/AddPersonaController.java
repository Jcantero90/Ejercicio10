package com.bosonit.persona.infrastructure.controller.crud;

import com.bosonit.persona.application.service.PersonaServiceImpl;
import com.bosonit.persona.infrastructure.controller.inputPersonaDto.InputPersonaDto;
import com.bosonit.persona.infrastructure.controller.outPutPersonaDto.OutPutPersonaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddPersonaController {

    @Autowired
    PersonaServiceImpl personaService;

    @PostMapping("/addPersona")
    public OutPutPersonaDto addPersona (@RequestBody InputPersonaDto inputPersonaDto){
        return personaService.addPersona(inputPersonaDto);
    }
}
