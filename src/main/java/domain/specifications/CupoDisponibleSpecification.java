package domain.specifications;

import domain.model.curso.Curso;

/**
 *
 * @author lm-carlos
 */
public class CupoDisponibleSpecification implements Specification<Curso> {

    @Override
    public boolean satisfechoPor(Curso curso) {
        return curso.getAlumnoIds().size() < curso.getCupoMaximo();

    }
}
