public class Song {
	static Song so[] = new Song [10];
	static int socount = 0;
	private String title;
	private String url;
	private Singer singer;

	public Song(String title, Singer singer, String url) {
		this.title = title;
		this.url = url;
		this.singer = singer;
		so[socount] = this;
		socount++;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setSinger(Singer singer) {
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}

	public Singer getSinger() {
		return singer;
	}

	public String toString() {
		return "Song [ Title = " + title + ", url to listen = " + url + " ]";
	}


}
