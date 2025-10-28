package HAS_A;

class Song {
	
	String title;
	String artist;
}

class Playlist {
	
	Song track;
	
	void playSong(Song pass) {
		track = pass;
		System.out.println("now playing the song  " + track.title);
		System.out.println("the artist is : " + track.artist);
	}
}

//the relationship between objs have 2 types , has-a(aggregation and composition) and is-a (inheritance)
// aggregation is weekly coupled between objects [mobile has a charger].may exist independently
// composition is strong coupled between objects [mobile has a os]. can't exist independently.
// the play list has-A  song

public class Aggregation {

	public static void main(String[] args) {
		
		Song mySong  = new Song();
		mySong.title = "Jambhalakadi Jarumitaya";
		mySong.artist = "Bharatamma";

		Playlist pl = new Playlist();
		pl.playSong(mySong);
		
		
	}

}
