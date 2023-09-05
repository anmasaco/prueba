package com.example.test;
import com.example.test.controllers.TestController;
import com.example.test.dto.Character;
import com.example.test.services.TestService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals; // Importa desde JUnit 4
import static org.mockito.Mockito.when;

public class TestControllerUnitTest {

	@InjectMocks
	private TestController testController;

	@Mock
	private TestService testService;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);

		testController = new TestController(testService);
	}

	@Test
	public void testGetCharacters() {
		// Crea datos de prueba
		List<Character> characters = new ArrayList<>();
		characters.add(new Character(1, "Character1"));
		characters.add(new Character(2, "Character2"));

		// Define el comportamiento esperado cuando se llama a testService.getCharacters()
		when(testService.getCharacters()).thenReturn(characters);

		// Llama al método del controlador que deseas probar
		ResponseEntity<List<Character>> responseEntity = testController.test();

		// Verifica que la respuesta sea un ResponseEntity con HttpStatus OK
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

		// Verifica que los datos devueltos coincidan con los datos de prueba
		List<Character> responseBody = responseEntity.getBody();
		assertEquals(characters.size(), responseBody.size());
		assertEquals(characters.get(0).getName(), responseBody.get(0).getName());
		assertEquals(characters.get(1).getName(), responseBody.get(1).getName());
		// Agrega más aserciones según sea necesario para tus pruebas.
	}
}