package pe.idat.ec1.leo.pinedo.repository;

import java.util.List;

import pe.idat.ec1.leo.pinedo.model.Universidad;

public interface UniversidadRepository {

	void guardar(Universidad universidad);

	void actualizar(Universidad universidad);

	void eliminar(Integer id);

	List<Universidad> listar();

	Universidad obtener(Integer id);

}
