package pe.idat.ec1.leo.pinedo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.ec1.leo.pinedo.model.Profesor;
import pe.idat.ec1.leo.pinedo.repository.ProfesorRepository;

@Service
public class ProfesorServiceImp implements ProfesorService {

	@Autowired
	private ProfesorRepository repositorio;
	
	@Override
	public void guardar(Profesor profesor) {
		// TODO Auto-generated method stub
		repositorio.guardar(profesor);

	}

	@Override
	public void actualizar(Profesor profesor) {
		// TODO Auto-generated method stub
		repositorio.actualizar(profesor);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.eliminar(id);

	}

	@Override
	public List<Profesor> listar() {
		// TODO Auto-generated method stub
		return repositorio.listar();
	}

	@Override
	public Profesor obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.obtener(id);
	}

}
