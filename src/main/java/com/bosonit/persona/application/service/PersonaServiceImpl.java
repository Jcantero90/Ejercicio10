package com.bosonit.persona.application.service;

import com.bosonit.persona.domain.Persona;
import com.bosonit.persona.infrastructure.controller.inputPersonaDto.InputPersonaDto;
import com.bosonit.persona.infrastructure.controller.outPutPersonaDto.OutPutPersonaDto;
import com.bosonit.persona.infrastructure.controller.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    PersonaRepository personaRepository;

    public OutPutPersonaDto addPersona(InputPersonaDto inputPersonaDto){
        Persona persona = new Persona(inputPersonaDto);
        personaRepository.save(persona);
        return new OutPutPersonaDto(persona);
    }

    public OutPutPersonaDto findByIdPersona (Integer id_persona){
        Optional<Persona> personaReporitory = personaRepository.findById(id_persona);
        Persona persona = personaReporitory.get();
        return new OutPutPersonaDto(persona);
    }

    public String deletePersonById (Integer id_persona){
        personaRepository.deleteById(id_persona);
        return "persona borrada";
    }

    public OutPutPersonaDto updatePersona (Integer id_persona, Persona persona){
        Optional<Persona> updatePer = personaRepository.findById(id_persona);
        Persona p1 = updatePer.get();
        persona.setUsuario(persona.getUsuario());
        p1.setPassword(persona.getPassword());
        p1.setName(persona.getName());
        p1.setSupername(persona.getSupername());
        p1.setCompany_Email(persona.getCompany_Email());
        p1.setCity(persona.getCity());
        p1.setActive(persona.getActive());
        p1.setCreated_date(persona.getCreated_date());
        p1.setImagen_url(persona.getImagen_url());
        p1.setTermination_date(persona.getTermination_date());
        personaRepository.save(p1);
        return new OutPutPersonaDto(p1);
    }
}
