package pe.idat.ec1.leo.pinedo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.ec1.leo.pinedo.model.Universidad;
import pe.idat.ec1.leo.pinedo.repository.UniversidadRepository;

@Service
public class UniversidadServiceImp implements UniversidadService {
	
	@Autowired
	private UniversidadRepository repositorio;

	@Override
	public void guardar(Universidad universidad) {
		// TODO Auto-generated method stub
		repositorio.guardar(universidad);

	}

	@Override
	public void actualizar(Universidad universidad) {
		// TODO Auto-generated method stub
		repositorio.actualizar(universidad);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.eliminar(id);

	}

	@Override
	public List<Universidad> listar() {
		// TODO Auto-generated method stub
		return repositorio.listar();
	}

	@Override
	public Universidad obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.obtener(id);
	}

}
