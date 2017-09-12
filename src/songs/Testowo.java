package songs;

import java.util.ArrayList;
import java.util.List;

public class Testowo {

	public static void main(String[] args) {

		Song song1 = new Song();
		song1.setName("What's Love");
		song1.setAuthor("Tina Turner");
		song1.setWin(false);

		Song song2 = new Song();
		song2.setName("Called out");
		song2.setAuthor("Snow Patrol");
		song2.setWin(false);

		Song song3 = new Song();
		song3.setName("Don't Look");
		song3.setAuthor("Oasis");
		song3.setWin(true);

		Song song4 = new Song();
		song4.setName("What Goes");
		song4.setAuthor("Justin Timberlake");
		song4.setWin(false);

		Song song5 = new Song();
		song5.setName("Radioactive");
		song5.setAuthor("Imagine Dragons");
		song5.setWin(false);

		Song song6 = new Song();
		song6.setName("What A");
		song6.setAuthor("Armstrong");
		song6.setWin(true);

		Song song7 = new Song();
		song7.setName("Losing my");
		song7.setAuthor("rem");
		song7.setWin(false);

		Song song8 = new Song();
		song8.setName("Not Afraid");
		song8.setAuthor("Halsey");
		song8.setWin(true);
		
		List<Song> songs = new ArrayList<>();
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);
		songs.add(song4);
		songs.add(song5);
		songs.add(song6);
		songs.add(song7);
		songs.add(song8);

		Category pop = new Pop();
		pop.setName("Pop");
		pop.setAvailable(true);
		pop.setCost(0);

		Category rock = new Rock();
		rock.setName("Rock");
		rock.setAvailable(false);
		rock.setCost(3000);

		Category hityPolskie = new HityPolskie();
		hityPolskie.setName("Hity polskie");
		hityPolskie.setAvailable(false);
		hityPolskie.setCost(3000);

		Category hitySwiatowe = new HitySwiatowe();
		hitySwiatowe.setName("Hity œwiatowe");
		hitySwiatowe.setAvailable(false);
		hitySwiatowe.setCost(3000);

		Level level1 = new Level();
		level1.setName("Beginner");

		Level level2 = new Level();
		level2.setName("Avegare");

		Level level3 = new Level();
		level3.setName("Advanced");
		List<Level> levels = new ArrayList<>();
		levels.add(level1);
		levels.add(level2);
		levels.add(level3);
		hitySwiatowe.setLevel(levels);
		hityPolskie.setLevel(levels);
		rock.setLevel(levels);
		pop.setLevel(levels);
		level1.setSongs(songs);
		level2.setSongs(songs);
		level3.setSongs(songs);
		

		User user = new User();
		user.setLogin("Marta");
		user.setPassword("password");

		State state = new State();
		state.setStage(1500);
		List<Category> categories = new ArrayList<>();
		categories.add(pop);
		categories.add(rock);
		categories.add(hityPolskie);
		categories.add(hitySwiatowe);
		state.setCategories(categories);
		
		int a=8;

	}

}
