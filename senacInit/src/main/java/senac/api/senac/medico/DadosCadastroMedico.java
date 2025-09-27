package senac.api.senac.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import senac.api.senac.endereco.DadosEndereco;

public record DadosCadastroMedico(

        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}") // expressao regular para travar entre 4 a 6 digitos
        String crm,

        @NotNull
        Especialidade especialidade,

        @NotNull
        @Valid // para ele validar o que esta dentro de dadosEndereco
        DadosEndereco endereco) {
}
