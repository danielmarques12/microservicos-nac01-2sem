package br.com.fiap.ti_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.ti_service.model.TiService;

@Repository
public interface TiServiceRepository extends JpaRepository<TiService, Long> {

}
