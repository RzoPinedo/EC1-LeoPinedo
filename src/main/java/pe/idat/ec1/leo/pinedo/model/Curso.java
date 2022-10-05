package pe.idat.ec1.leo.pinedo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso {
	
	private Integer idCurso;
	private String curso;
	private String description;
	
	@ManyToMany
	@JoinTable(name="curso_profesor",
	joinColumns = @JoinColumn(name = "id_curso", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign Kei (id_curso) references cursos (id_cursos)")),
			inverseJoinColumns = @JoinColumn(name="id_profesor", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign Kei (id_profesor) references profesores (id_profesor)"))
	)
	private List<Profesor> profesores = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="id_malla", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign Kei (id_malla) references mallas_curriculares(id_malla)"))
	private MallaCurricular mallacurricular;
	
	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
		

}
