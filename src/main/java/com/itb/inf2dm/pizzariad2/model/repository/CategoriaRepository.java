package com.itb.inf2dm.pizzariad2.model.repository;


import com.itb.inf2dm.pizzariad2.model.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
