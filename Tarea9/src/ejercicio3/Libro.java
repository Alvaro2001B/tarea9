package ejercicio3;

public class Libro {
	
	private String ISBN, titulo, autor;
	private int numPaginas;
	
	public Libro(String ISBN, String titulo, String autor, int numPaginas) {
		this.ISBN=ISBN;
		this.titulo=titulo;
		this.autor=autor;
		this.numPaginas=numPaginas;
	}
	public String masPaginas(Libro p) {
		if(p.getNumPaginas()>numPaginas) {
			return p.getTitulo();
		}
		return titulo;
	}
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	public String toString() {
		return "El libro "+titulo+" con "+ISBN+" creado por el autor "+ autor+" tiene "+ numPaginas+" paginas"; 
	}
	
}