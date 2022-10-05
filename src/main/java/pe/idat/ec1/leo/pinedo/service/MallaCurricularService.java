package pe.idat.ec1.leo.pinedo.service;

import java.util.List;

import pe.idat.ec1.leo.pinedo.model.MallaCurricular;

public interface MallaCurricularService {
	
	void guardar(MallaCurricular mallacurricular);

	void actualizar(MallaCurricular mallacurricular);

	void eliminar(Integer id);

	List<MallaCurricular> listar();

	MallaCurricular obtener(Integer id);

}
