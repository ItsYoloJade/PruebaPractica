package dal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;


import dol.Libro;

public class LibroDal {
	private Libro libro;
	private List<Libro> libros;
	
	private String filePath;
	private String fileName;
	public LibroDal() {
		super();
	}
	public Libro getBook() {
		return libro;
	}
	public void setBook(Libro libro) {
		this.libro = libro;
	}
	
	public List<Libro> getBooks() {
		return libros;
	}
	public void setBooks(List<Libro> libro) {
		this.libro = (Libro) libro;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void save() {
		
		File file = new File(filePath + "\\" + fileName);
		try {
			
			ObjectOutputStream os =  new ObjectOutputStream(new FileOutputStream(file));
			os.writeObject(libro);
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Libro open() {
		try {
			File file = new File(filePath);
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			Libro l = (Libro)ois.readObject();
			ois.close();
			return l;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void saveList() {
		
		File file = new File(filePath + "\\" + fileName);
		try {
			
			ObjectOutputStream os =  new ObjectOutputStream(new FileOutputStream(file));
			os.writeObject(libros);
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Libro> openList() {
		try {
			File file = new File(filePath);
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			List<Libro> b = (List<Libro>)ois.readObject();
			ois.close();
			return b;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
