package handson.answer.nintendoswitch;

public class Gamesoft {

	private static int count = 0;

	private String title;
	private String genre;
	private String impression;

	public Gamesoft() {
	}

	public Gamesoft(String title, String genre, String impression) {
		count++;
		this.title = title;
		this.genre = genre;
		this.impression = impression;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public String getImpression() {
		return impression;
	}

	public static int getCount() {
		return count;
	}
}
