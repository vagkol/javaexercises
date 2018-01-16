import java.util.Scanner;

public class SongTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		Singer frank = new Singer ("Frank Sinatra");
		//si[0] = frank;
		Singer wham = new Singer ("Wham!");
		//si[1] = wham;
		Singer mariah = new Singer ("Mariah Carey");
		//si[2] = mariah;
		Singer chris = new Singer ("Chris Rea");
		//si[3] = chris;
		Singer sia = new Singer ("sia");
		//si[4] = sia;

		Song song1 = new Song ("All I want for Christmas Is You", mariah, "https://www.youtube.com/watch?v=yXQViqx6GMY");
		//so[0] = song1;
		Song song2= new Song ("White Christmas", frank, "https://www.youtube.com/watch?v=q_XzZNCDWCA");
		//so[1] = song2;
		Song song3 = new Song ("Last Christmas", wham, "https://www.youtube.com/watch?v=E8gmARGvPlI");
		//so[2] = song3;
		Song song4 = new Song ("Driving home for Christmas", chris, "https://www.youtube.com/watch?v=EvDxSW8mzvU");
		//so[3] = song4;
		Song song5 = new Song ("Santa's Coming For Us", sia, "https://www.youtube.com/watch?v=V3EYjVPRClU");
		//so[4] = song5;
		Song song6 = new Song ("Let It Snow! Let It Snow! Let It Snow!", frank, "https://www.youtube.com/watch?v=mN7LW0Y00kE");
		//so[5] = song6;

		System.out.println("*** Welcome to our DMST Christmas Music Application ***:");
		while (true){

			System.out.println("Menu:");
			System.out.println("Type 1 to display singers' List");
			System.out.println("Type 2 to display Frank's Sinatra available songs");
			System.out.println("Type here:");
			int type = scanner.nextInt();

			if (type == 1){
				System.out.println("** Display Singers' List ** ");
				for (int singer=0; singer < Singer.si.length; singer++){    //Singer singer: Singer.si

					if (Singer.si[singer]!= null) {
						System.out.println(Singer.si[singer].toString());
				}
			}
			}

			else if (type == 2) {
				int counter = 0;
				for(Song song:Song.so) {
					if(song!=null && song.getSinger()==frank) {
							counter++;
					}
				}
				if(counter==0) {
					System.out.println("There are no Frank's Sinatra songs!");
				}else if(counter > 0) {
					System.out.println(counter+" songs were found:");
					for(Song song:Song.so){
						if(song!=null && song.getSinger() == frank){ // Χρησιμοποίησα == frank και όχι equal διότι η δήλωση γίνεται στην ίδια κλάση!!!
							System.out.println(song.toString());
						};
					}


				}

			}else {
				System.out.println("You have not entered a correct type. Please try again!");
			}System.out.println("***************** The End ******************");

		}
}

}
