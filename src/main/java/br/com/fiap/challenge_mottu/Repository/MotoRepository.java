package br.com.fiap.challenge_mottu.Repository;

import br.com.fiap.challenge_mottu.Model.Moto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoRepository extends JpaRepository<Moto, Long> {
}
