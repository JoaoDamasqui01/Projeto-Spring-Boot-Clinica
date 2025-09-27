package senac.api.senac.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import senac.api.senac.endereco.DadosEndereco;

public record DadosCadastroPaciente(

        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{11}") // expressao regular para travar com 11 digitos
        String cpf,

        @Valid // para ele validar o que esta dentro de dadosEndereco
        DadosEndereco endereco
        ) {
}
