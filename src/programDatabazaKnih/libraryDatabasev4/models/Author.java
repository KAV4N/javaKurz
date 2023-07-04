package programDatabazaKnih.libraryDatabasev4.models;

import java.io.Serializable;

public class Author implements Serializable {
	private String name;

	public Author(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
