
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
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, boolean esLibroTexto){
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = esLibroTexto;
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
    
    public int getVecesPrestado(){
        return vecesPrestado;
    }
    
    public boolean getEsLibroDeTexto(){
        return esLibroDeTexto;
    }
    
    public void setNumeroReferencia (String referencia){
        if (referencia.length() >= 3){
            numeroReferencia = referencia;
        }
        else{
            System.out.println("Error: No ha sido posible modificar el numero de referencia, debe introducir al menos 3 caracteres.");
        }
        
    }
    
    public void prestar(){
        vecesPrestado += 1;
    }
    
    public String getDetalles(){
        String detalles = "";
        String siONo = "";
        if (esLibroDeTexto == true){
            siONo = "Si";
        }
        else {
            siONo = "No";
        }
        
        if (numeroReferencia != ""){
            detalles ="Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + numeroPaginas + ", Numero de Referencia: " + numeroReferencia + ", Numero de veces que ha sido prestado: " + vecesPrestado + ", Es un libro de texto: " + siONo;
        } 
        else {
            detalles ="Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + numeroPaginas + ", Numero de Referencia: ZZZ, Numero de veces que ha sido prestado: " + vecesPrestado + ", Es un libro de texto: " + siONo;
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
