package automation.practice.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import automation.practice.controllers.BooksController;

class BookTest {

	@Autowired
	private BooksController underTest;
	
	@BeforeEach
	void setUp() {
		underTest = new BooksController();
	}
	
	@Test
	@DisplayName("Should return 20 default books")
    void itShouldReturn20Books() {
		//Arrange
			//BeforeEach
		//Action
		int totalBooks = underTest.getBooks().size();
		//Assert
		assertEquals(20, totalBooks); //20 are written in code in BooksController
	}
	
}
