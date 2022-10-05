package pe.idat.ec1.leo.pinedo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.idat.ec1.leo.pinedo.model.Curso;

@Repository
public class CursoRepositoryImp implements CursoRepository {

	List<Curso> almacenamiento = new ArrayList<>();

	@Override
	public void guardar(Curso curso) {
		// TODO Auto-generated method stub
		almacenamiento.add(curso);

	}

	@Override
	public void actualizar(Curso curso) {
		// TODO Auto-generated method stub
		Curso existeActualizar = obtener(curso.getIdCurso());
		eliminar(existeActualizar.getIdCurso());
		almacenamiento.add(curso);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Curso existeEliminar = obtener(id);
		almacenamiento.remove(existeEliminar);
	}

	@Override
	public List<Curso> listar() {
		// TODO Auto-generated method stub
		return almacenamiento;
	}

	@Override
	public Curso obtener(Integer id) {
		// TODO Auto-generated method stub
		return almacenamiento.stream().filter(p->p.getIdCurso()==id).findFirst().orElse(null);
	}

}
