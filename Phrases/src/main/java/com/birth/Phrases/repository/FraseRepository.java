package com.birth.Phrases.repository;



import com.birth.Phrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


public interface FraseRepository extends JpaRepository<Frase, Long> {
    @Query("SELECT f FROM Frase f ORDER BY function('RAND') LIMIT 1")
    Frase buscaFraseAleatoria();

}