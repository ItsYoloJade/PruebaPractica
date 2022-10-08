package ui;

import java.util.List;
import java.util.Scanner;


import dol.Libro;

public class LibroForm {
	private Scanner scan;
	private Libro libro;
	private List<Libro> books;
	
	public LibroForm(Scanner scan) {
		super();
		this.scan = scan;
	}
	public LibroForm(Libro libro) {
		super();
		this.libro = libro;
	}
	
	public LibroForm(List<Libro> books) {
		super();
		this.books = books;
	}
	
	public Libro catchBook() {
		Libro b = new Libro();
		System.out.println("Título: ");
		scan.nextLine();
		b.setTitle(scan.nextLine());
		
		System.out.println("Editorial: ");
		b.setEditorial(scan.nextLine());
		
		System.out.println("Edición: ");
		b.setEdicion(scan.nextLine());
		
		System.out.println("Año de publicación: ");
		b.setPublicyear(scan.nextInt());
		
	
	
		
		return b;
	}
	
	public void showBook() {
		System.out.printf("Título: %s\n", libro.getTitle());
		System.out.printf("Editorial: %s\n", libro.getEditorial());
		System.out.printf("Edicion: %s\n", libro.getEdicion());
		System.out.printf("Año de publicación: %s\n", libro.getPublicyear());
		
	}
	
	public void showBooks() {
		for(int i=0; i<books.size(); i++) {
			System.out.printf("%d | %s | %s\n", i+1, books.get(i).getTitle(), books.get(i).getEditorial(), books.get(i).getEdicion()  , books.get(i).getPublicyear() );
		}
	}
}
