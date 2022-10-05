package pe.idat.ec1.leo.pinedo.repository;

import java.util.List;

import pe.idat.ec1.leo.pinedo.model.Profesor;

public interface ProfesorRepository {

	void guardar(Profesor profesor);

	void actualizar(Profesor profesor);

	void eliminar(Integer id);

	List<Profesor> listar();

	Profesor obtener(Integer id);

}
