package testebacklovable.com.br.testebacklovable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import testebacklovable.com.br.testebacklovable.model.Usuarios;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {

}
