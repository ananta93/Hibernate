package com.ananta.util;

import com.ananta.dao.MovieDAO;
import com.ananta.dto.MovieDTO;

public class MovieTester {

	public static void main(String[] args) {
		MovieDTO movie=new MovieDTO();
		movie.setMname("one day");
		movie.setLanguage("English");
		movie.setDuration(122);
		movie.setRating(6);
		
		MovieDAO dao=new MovieDAO();
		dao.save(movie);

	}

}
