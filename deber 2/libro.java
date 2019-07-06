public class libro{
	String autor;
	String titulo;
	int Paginas;
	
	public libro(String autor, String titulo, int Paginas){
		this.autor=autor;
		this.titulo=titulo;
		this.Paginas=Paginas;
	}
	public void setAutor(String autor){
		autor=autor;
	}
	public void setTitulo(String titulo){
		titulo=titulo;
	}
	public void setPaginas(int paginas){
		paginas=paginas;
	}
	public String getAutor(){
		return autor;
	}
	public String getTitulo(){
		return titulo;
	}
	public int getPaginas(){
		return paginas;
	}
	
}