package senac.api.senac.medico;


import jakarta.validation.constraints.NotNull;
import senac.api.senac.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(

        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEndereco endereco) {
}
