package ui;

import java.util.List;
import java.util.Scanner;

import dol.Author;
import dol.Libro;

public class AuthorForm {

	
	private Scanner scan;
	private Author author;
	private List<Author> Auths;
	
	public AuthorForm(Scanner scan) {
		super();
		this.scan = scan;
	}
	public AuthorForm(Author author ) {
		super();
		this.author = author;
	}
	
	public AuthorForm(List<Author> author) {
		super();
		this.author = (Author) author;
	}
	
	public Author catchAuthor() {
		Author a = new Author();
		System.out.println("Nombre: ");
		scan.nextLine();
		a.setName(scan.nextLine());
		
		System.out.println("Pseudonimo: ");
		a.setPseudonimo(scan.nextLine());
		
		
		System.out.println("Nacionalidad: ");
		a.setNacionalidad(scan.nextLine());
		
		
		return a;
	}
	
	public void showAuthor() {
		System.out.printf("Nombre: %s\n", author.getName());
		System.out.printf("Pseudonimo: %s\n", author.getPseudonimo());
		System.out.printf("Nacionalidad: %s\n", author.getNacionalidad());
		
	}
	
	public void showAuthors() {
		for(int i=0; i<Auths.size(); i++) {
			System.out.printf("%d | %s | %s\n", i+1, Auths.get(i).getName(), Auths.get(i).getPseudonimo(), Auths.get(i).getNacionalidad());
		}
	}
}

}
