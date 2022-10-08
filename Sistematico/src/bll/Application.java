package bll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dal.LibroDal;

import dol.Libro;
import ui.AuthorForm;
import ui.LibroForm;

public class Application {
	private Scanner scan;
	private List<Libro> books;
	private String pathToSave;
	private String fileName;

	public Application() {
		scan = new Scanner(System.in);
		fileName = "";
		books = new ArrayList<Libro>();
	}
	public Application(Scanner scanner) {
		scan = scanner;
		fileName = "";
		books = new ArrayList<Libro>();
	}
	
	public String getPathToSave() {
		return pathToSave;
	}
	public void setPathToSave(String pathToSave) {
		this.pathToSave = pathToSave;
	}
	
	
	public void PrintMenu() {
		
		Scanner entrada = new Scanner (System.in);
		int opc=0;
		System.out.println("==================BIENVENIDO================");
		System.out.println("1. Gestionar Libros");
		System.out.println("2.Gestionar Autores");
		System.out.println("3.Salir");
	
		opc= entrada.nextInt();
		
		switch (opc) {
		
		case 1:
			displayOptions();	
		case 2:
			Display2Option();
		case 3:
			System.exit(0);
		}
	}
	
	
	
	
	public void displayOptions() {
	
		System.out.println("Gestionar libros");
		System.out.println("1. Agregar");
		System.out.println("2. Guardar");
		System.out.println("3. Abrir");
		System.out.println("4. Volver al menu principal");
	}
	
	public void show() {
		short option =0;
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			option = scan.nextShort();
			switch(option) {
				case 1:
					add();
					break;
				case 2:
					save();
					break;
				case 3:
					open();
					break;
				case 4:
					PrintMenu();
					break;
				default:
					System.out.println("Opción no válida");
					break;
			}
		}while(option!=4);
	}
	
	private void add() {
	LibroForm bf = new LibroForm(scan);
   books.add(bf.catchBook());
	}
	
	public void save() {

		LibroDal bd = new LibroDal();
			
		bd.setFilePath(pathToSave);
		
		while(fileName.length()==0) {			
			System.out.println("Por favor indica el nombre del archivo: ");		
			fileName = scan.next();
		}
		
		bd.setFileName(fileName);
		
		bd.setBooks(books);
		
		bd.saveList();
	}
	
	public void open() {
		System.out.println("Por favor indica el nombre del archivo a abrir: ");
		fileName = scan.next();
		String filePath = pathToSave + "\\" + fileName;
		LibroDal bd = new LibroDal();
		bd.setFilePath(filePath);
		books = bd.openList();
		
		LibroForm bf = new LibroForm(books);
		bf.showBooks();
	}
	
	
	public void Display2Option() {
		System.out.println("Gestionar Autores");
		System.out.println("1. Agregar");
		System.out.println("2. Guardar");
		System.out.println("3. Abrir");
		System.out.println("4. Volver al menu principal");
	}
	
	public void show2() {
		short option =0;
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			option = scan.nextShort();
			switch(option) {
				case 1:
					Agg();
					break;
				case 2:
					Guardar();
					break;
				case 3:
					Abrir();
					break;
				case 4:
					PrintMenu();
					break;
				default:
					System.out.println("Opción no válida");
					break;
			}
		}while(option!=4);
	}
	
	
	
	private void Agg() {
		AuthorForm bf = new AuthorForm(scan);
		Author.add(bf.catchAuthor());
		
	}
	
	public void Guardar() {}
	public void Abrir() {}
	
	
	
	
}
