package contrato.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import contrato.modelo.Contrato;

@Repository
public interface contratoRepositorio extends JpaRepository<Contrato, Long> {

}
