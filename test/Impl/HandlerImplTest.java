package Impl;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class HandlerImplTest {
	
	// Fields
	HandlerImpl h = new HandlerImpl();
	private String data;

	@Test
	void testReadFile() throws IOException {
		data = h.readFile("Cars.csv");
        
        int expected = 157;
        int actual = data.length();
        assertEquals(expected, actual);
        
        String _expected = "AF22454, 1";
        String _actual = data.split(System.lineSeparator())[0];
        assertEquals(_expected, _actual);
        
        _expected = "CF22751, 2";
        _actual = data.split(System.lineSeparator())[13]; // Magic number
        assertEquals(_expected, _actual);
	}
}