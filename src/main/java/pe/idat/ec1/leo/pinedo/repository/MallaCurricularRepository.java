package pe.idat.ec1.leo.pinedo.repository;

import java.util.List;

import pe.idat.ec1.leo.pinedo.model.MallaCurricular;

public interface MallaCurricularRepository {

	void guardar(MallaCurricular mallacurricular);

	void actualizar(MallaCurricular mallacurricular);

	void eliminar(Integer id);

	List<MallaCurricular> listar();

	MallaCurricular obtener(Integer id);

}
