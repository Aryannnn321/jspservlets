package com.movieapp.service;

import java.util.Arrays;
import java.util.List;

public class MovieDetails {
 public List<String> showMovies (String language){
	List<String> movies=null;
	 if(language.equals("english")) {
		 return Arrays.asList("anacona", "python","crow","Spiderman");
	 }
	 else if(language.equals("kannada")){
		 return Arrays.asList("dilwal", "rajahulli", "devil","shourya");
	 }
	 else if(language.equals("hindi")) {
		 return Arrays.asList("one", "rajkumar","jackie");
	 }
	 else if(language.equals("tamil")) {
		 return Arrays.asList("vijay", "dhanush","trisha");
	 }
	return movies;
 }
}
