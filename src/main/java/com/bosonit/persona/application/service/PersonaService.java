package com.bosonit.persona.application.service;

import com.bosonit.persona.domain.Persona;
import com.bosonit.persona.infrastructure.controller.inputPersonaDto.InputPersonaDto;
import com.bosonit.persona.infrastructure.controller.outPutPersonaDto.OutPutPersonaDto;

public interface PersonaService {

    public OutPutPersonaDto addPersona(InputPersonaDto inputPersonaDto);

    public OutPutPersonaDto findByIdPersona (Integer id_persona);

    public String deletePersonById (Integer id_persona);

    public OutPutPersonaDto updatePersona (Integer id_persona, Persona persona);
}
