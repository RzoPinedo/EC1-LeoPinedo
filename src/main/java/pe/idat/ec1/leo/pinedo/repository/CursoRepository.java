package pe.idat.ec1.leo.pinedo.repository;

import java.util.List;

import pe.idat.ec1.leo.pinedo.model.Curso;

public interface CursoRepository {

	void guardar(Curso curso);

	void actualizar(Curso curso);

	void eliminar(Integer id);

	List<Curso> listar();

	Curso obtener(Integer id);
}
