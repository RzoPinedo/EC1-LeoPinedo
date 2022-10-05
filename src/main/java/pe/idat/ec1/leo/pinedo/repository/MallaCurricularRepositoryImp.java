package pe.idat.ec1.leo.pinedo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.idat.ec1.leo.pinedo.model.MallaCurricular;

@Repository
public class MallaCurricularRepositoryImp implements MallaCurricularRepository {

	List<MallaCurricular> almacenamiento = new ArrayList<>();
	
	@Override
	public void guardar(MallaCurricular mallacurricular) {
		// TODO Auto-generated method stub
		almacenamiento.add(mallacurricular);

	}

	@Override
	public void actualizar(MallaCurricular mallacurricular) {
		// TODO Auto-generated method stub
		MallaCurricular existeActualizar = obtener(mallacurricular.getIdMalla());
		eliminar(existeActualizar.getIdMalla());
		almacenamiento.add(mallacurricular);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		MallaCurricular existeEliminar = obtener(id);
		almacenamiento.remove(existeEliminar);

	}

	@Override
	public List<MallaCurricular> listar() {
		// TODO Auto-generated method stub
		return almacenamiento;
	}

	@Override
	public MallaCurricular obtener(Integer id) {
		// TODO Auto-generated method stub
		return almacenamiento.stream().filter(p->p.getIdMalla()==id).findFirst().orElse(null);
	}

}
