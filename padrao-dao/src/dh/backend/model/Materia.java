package dh.backend.model;

public class Materia {
    private long id;
    private String materia;

    public Materia(long id, String materia) {
        this.id = id;
        this.materia = materia;
    }

    public Materia(String materia) {
        this.materia = materia;
    }

    public Materia() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "id=" + id +
                ", materia='" + materia + '\'' +
                '}';
    }
}
