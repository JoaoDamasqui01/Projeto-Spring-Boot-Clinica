package senac.api.senac.paciente;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import senac.api.senac.endereco.DadosEndereco;

public record DadosExclucaoPaciente(

        @NotNull
        Long id,

        @AssertTrue
        Boolean ativo
) {
}
