package automation.practice.controllers.dto;

public class BookDto {

  public BookDto() {

  }

  public BookDto(String name, String author) {
    this.name = name;
    this.author = author;
  }

  private String name;

  private String author;

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
