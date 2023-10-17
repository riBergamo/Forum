package br.com.alura.forum.repository;

import br.com.alura.forum.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    List<Topico> findByCursoNome(String nomeCurso);

}
//Em uma situação que existe o atributo com o mesmo nome da sequencia(Se tivesse um atributo chamado cursoNome na classe Topico):
//findByCurso_Nome: o underline(_) é pra ter certeza que vai pegar o atributo Nome dentro da classe Curso.

/*
//Em uma situação que voce nao quer usar o nome findBy...MAS N TEM PORQUE FAZER ISSO, eu acho
@Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);
*/