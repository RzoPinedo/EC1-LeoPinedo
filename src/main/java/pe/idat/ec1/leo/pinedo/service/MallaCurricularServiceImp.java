package pe.idat.ec1.leo.pinedo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.ec1.leo.pinedo.model.MallaCurricular;
import pe.idat.ec1.leo.pinedo.repository.MallaCurricularRepository;

@Service
public class MallaCurricularServiceImp implements MallaCurricularService {

	@Autowired
	private MallaCurricularRepository repositorio;
	
	@Override
	public void guardar(MallaCurricular mallacurricular) {
		// TODO Auto-generated method stub
		repositorio.guardar(mallacurricular);

	}

	@Override
	public void actualizar(MallaCurricular mallacurricular) {
		// TODO Auto-generated method stub
		repositorio.actualizar(mallacurricular);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.eliminar(id);

	}

	@Override
	public List<MallaCurricular> listar() {
		// TODO Auto-generated method stub
		return repositorio.listar();
	}

	@Override
	public MallaCurricular obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.obtener(id);
	}

}
