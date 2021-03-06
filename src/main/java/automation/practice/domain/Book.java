package automation.practice.domain;

import lombok.Getter;
import lombok.Setter;

public class Book {
  public Book() { }

  public Book(String name, String author) {
    this.name = name;
    this.author = author;
  }

  @Getter
  @Setter
  private String name;

  @Getter
  @Setter
  private String author;
  
  //Necessary locally - Kliver Desktop

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
