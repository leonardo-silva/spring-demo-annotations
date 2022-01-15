package com.luv2code.springdemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	// create an array of strings
	private String[] dataArray;
	
	// create a random number generator
	private Random myRandom = new Random();

	public FileFortuneService() {
		String data = this.readFortunesFromFile();
		dataArray = data.split("\n");
	}

	// Java 11 implementation
	private String readFortunesFromFile() {
		String actual="";
		
		Path fileName = Path.of("fortunes.txt");
	    try {
		    actual = Files.readString(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    return actual;
	}
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(dataArray.length);
		
		return dataArray[index];
	}
}
