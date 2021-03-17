package automation.practice.controllers.dto;

import lombok.Getter;
import lombok.Setter;

public class BookDto {
    public BookDto(String id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String author;
    
    //Necessary locally - Kliver Desktop

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
    
    
}
