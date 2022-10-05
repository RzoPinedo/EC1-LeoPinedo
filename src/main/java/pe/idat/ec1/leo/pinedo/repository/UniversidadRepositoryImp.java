package pe.idat.ec1.leo.pinedo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.idat.ec1.leo.pinedo.model.Universidad;

@Repository
public class UniversidadRepositoryImp implements UniversidadRepository {

	
	List<Universidad> almacenamiento = new ArrayList<>();
	
	@Override
	public void guardar(Universidad universidad) {
		// TODO Auto-generated method stub
		almacenamiento.add(universidad);

	}

	@Override
	public void actualizar(Universidad universidad) {
		// TODO Auto-generated method stub
		Universidad existeActualizar = obtener(universidad.getIdUniversidad());
		eliminar(existeActualizar.getIdUniversidad());
		almacenamiento.add(universidad);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Universidad existeEliminar = obtener(id);
		almacenamiento.remove(existeEliminar);

	}

	@Override
	public List<Universidad> listar() {
		// TODO Auto-generated method stub
		return almacenamiento;
	}

	@Override
	public Universidad obtener(Integer id) {
		// TODO Auto-generated method stub
		return almacenamiento.stream().filter(p->p.getIdUniversidad()==id).findFirst().orElse(null);
	}

}
