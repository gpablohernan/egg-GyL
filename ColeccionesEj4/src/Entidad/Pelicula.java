package Entidad;

public class Pelicula {

    private String titulo;
    private String director;
    private Float duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Float duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Float getDuracion() {
        return duracion;
    }

    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula:" + '\t' +
                "Título: " + titulo + '\t'+'\t' +
                ", Director: " + director + '\t'+'\t' +
                ", Duración: " + duracion + "hs" +
                '\n';
    }
}
