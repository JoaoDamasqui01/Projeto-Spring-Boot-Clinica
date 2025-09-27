package senac.api.senac.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        String logradouro,
        @NotBlank
        String bairro,
        @NotBlank
        @Pattern(regexp = "\\d{8}") // para travar em 8 digitos o cep
        String cep,
        @NotBlank
        String cidade,
        @NotBlank
        String uf,

        String numero,

        String complemento) {
}
