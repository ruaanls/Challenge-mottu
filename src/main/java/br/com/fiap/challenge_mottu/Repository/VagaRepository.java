package br.com.fiap.challenge_mottu.Repository;

import br.com.fiap.challenge_mottu.Model.Vagas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VagaRepository extends JpaRepository<Vagas, Long> {
}
