package pe.idat.ec1.leo.pinedo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "curso_profesor")
public class CursoProfesor {
	
	@Id
	private CursoProfesorFk fk = new CursoProfesorFk();

}

@Embeddable
class CursoProfesorFk implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 668727937556427463L;

	@Column(name = "id_profesor", nullable = false, unique = true)
	private Integer idProfesor;
	
	@Column(name = "id_curso", nullable = false, unique = true)
	private Integer idCurso;

	public Integer getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	
}
