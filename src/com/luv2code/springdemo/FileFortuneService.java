package com.luv2code.springdemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	// create an array of strings
	private String[] dataArray;
	
	// create a random number generator
	private Random myRandom = new Random();

	// Java 11 implementation
	@PostConstruct
	private void readFortunesFromFile() {
		System.out.println(">> FileFortuneService: Inside PostConstruct method");
		
		String data="";
		
		Path fileName = Path.of("fortunes.txt");
	    try {
	    	data = Files.readString(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    this.dataArray = data.split("\n");

	}
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(dataArray.length);
		
		return dataArray[index];
	}
}
