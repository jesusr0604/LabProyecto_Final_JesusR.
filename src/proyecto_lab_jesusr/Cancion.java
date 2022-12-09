package proyecto_lab_jesusr;

public class Cancion {
    private String nombre;
    private String album;
    private String artista;
    private int duracion;
    private int año;

    public Cancion(String nombre, String album, String artista,int duracion, int año) {
     setNombre(nombre);
     setAlbum(album);
     setArtista(artista);
     setDuracion(duracion);
     setAño(año);
    }

    public String getNombre() {
        
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
        
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String al) {
        this.album = al;
        
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String art) {
       this.artista = art;
       
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int dur) {
        this.duracion = dur;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return " nombre=" + nombre + "\n album=" + album + "\n artista=" + artista + "\n duracion=" + duracion + "\n a\u00f1o=" + año ;
    }
    
}
