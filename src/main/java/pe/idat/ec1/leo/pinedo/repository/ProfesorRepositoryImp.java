package pe.idat.ec1.leo.pinedo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.idat.ec1.leo.pinedo.model.Profesor;

@Repository
public class ProfesorRepositoryImp implements ProfesorRepository {
	
	List<Profesor> almacenamiento = new ArrayList<>();

	@Override
	public void guardar(Profesor profesor) {
		// TODO Auto-generated method stub
		almacenamiento.add(profesor);

	}

	@Override
	public void actualizar(Profesor profesor) {
		// TODO Auto-generated method stub
		Profesor existeActualizar = obtener(profesor.getIdProfesor());
		eliminar(existeActualizar.getIdProfesor());
		almacenamiento.add(profesor);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Profesor existeEliminar = obtener(id);
		almacenamiento.remove(existeEliminar);

	}

	@Override
	public List<Profesor> listar() {
		// TODO Auto-generated method stub
		return almacenamiento;
	}

	@Override
	public Profesor obtener(Integer id) {
		// TODO Auto-generated method stub
		return almacenamiento.stream().filter(p->p.getIdProfesor()==id).findFirst().orElse(null);
	}

}
