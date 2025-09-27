package senac.api.senac.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import senac.api.senac.paciente.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteControllerTeste {

    @Autowired
    private PacientesRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dadosCadastro){
        repository.save(new Paciente(dadosCadastro));
    }

}
