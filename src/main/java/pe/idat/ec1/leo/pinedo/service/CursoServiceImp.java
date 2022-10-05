package pe.idat.ec1.leo.pinedo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.ec1.leo.pinedo.model.Curso;
import pe.idat.ec1.leo.pinedo.repository.CursoRepository;

@Service
public class CursoServiceImp implements CursoService {

	@Autowired
	private CursoRepository repositorio;
	
	@Override
	public void guardar(Curso curso) {
		// TODO Auto-generated method stub
		repositorio.guardar(curso);

	}

	@Override
	public void actualizar(Curso curso) {
		// TODO Auto-generated method stub
		repositorio.actualizar(curso);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.eliminar(id);

	}

	@Override
	public List<Curso> listar() {
		// TODO Auto-generated method stub
		return repositorio.listar();
	}

	@Override
	public Curso obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.obtener(id);
	}

}
