package senac.api.senac.paciente;

import jakarta.validation.constraints.NotNull;
import senac.api.senac.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(

        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEndereco endereco
) {
}
