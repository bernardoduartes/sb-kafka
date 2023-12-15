package br.shizuca.spconsumer.repository;

import br.shizuca.spconsumer.model.KeyPix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface KeyRepository extends JpaRepository<KeyPix, Integer> {
    KeyPix findByChave(String key);
}
