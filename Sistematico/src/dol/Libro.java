package dol;

import java.io.Serializable;

public class Libro implements Serializable{
	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 798544264193721303L;
	private String title;
	private String editorial;
	private String edicion;
	private int Publicyear;
	private String author;
	
	public Libro() {
		super();
	}
	
	
	
	  
	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getEditorial() {
		return editorial;
	}




	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}




	public String getEdicion() {
		return edicion;
	}




	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}




	public int getPublicyear() {
		return Publicyear;
	}




	public void setPublicyear(int publicyear) {
		Publicyear = publicyear;
	}




	public String getAuthor() {
		return author;
	}




	public void setAuthor(String author) {
		this.author = author;
	}




	@Override
	public String toString() {
		return "Libro [Titulo=" + title + ", Editorial=" + editorial + ", Edicion=" + edicion + ", Publicyear="
				+ Publicyear + ", author=" + author + "]";
	}
	
	
}
