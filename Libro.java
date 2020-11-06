
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    
    public void setNumeroReferencia (String referencia){
        if (referencia.length() >= 3){
            numeroReferencia = referencia;
        }
        else{
            System.out.println("Error: No ha sido posible modificar el numero de referencia, debe introducir al menos 3 caracteres.");
        }
        
    }
    
    public String getDetalles(){
        String detalles = "";
        if (numeroReferencia != ""){
            detalles ="Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + numeroPaginas + ", Numero de Referencia: " + numeroReferencia;
        } 
        else {
           detalles ="Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + numeroPaginas + ", Numero de Referencia: ZZZ";
        }
        return detalles;
    }
    
    public void imprimeAutor(){
        System.out.println("Autor: " + autor);
    }
    
    public void imprimeTitulo(){
        System.out.println("Titulo: " + titulo);
    }
    
    public void imprimeDetalles(){
       System.out.println(getDetalles());
    }
    
    
    
}
