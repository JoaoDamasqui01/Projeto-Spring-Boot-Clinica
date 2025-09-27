package senac.api.senac.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import senac.api.senac.medico.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoControllerTeste {

    @Autowired
    private MedicoRepository repository;

   @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){
       repository.save(new Medico(dados));
    }

    @GetMapping
    public Page<DadosListagemMedico> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){ // Importar do pacote spring
       return repository.findAll(paginacao).map(DadosListagemMedico::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados){
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}") //parametro dinamico
    @Transactional
    public void excluir(@PathVariable Long id){ // Anotacao para receber o parametro dinamico
        repository.deleteById(id);
    }

}
