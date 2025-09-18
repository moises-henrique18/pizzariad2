package com.itb.inf2dm.pizzariad2.model.repository;


import com.itb.inf2dm.pizzariad2.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
