package senac.api.senac.paciente;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacientesRepository extends JpaRepository<Paciente, Long> {

    Page<Paciente>findAllByAtivoTrue(Pageable paginacao);
}
