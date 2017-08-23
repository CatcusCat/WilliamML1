
public class NetflixRunner {
	// 1. Instantiate some Movie objects (at least 5).
	Movie m = new Movie("Jimmy's Rocket Adventure", 1);
	Movie m1 = new Movie("Little Jimsteins", 4);
	Movie m2 = new Movie("Jimmy Builds a Solar Farm", 5);
	Movie m3 = new Movie("Jimmy the Movie (10000 B.C.E. Edition)", 4);
	Movie m4 = new Movie("Jimmy Learns About Math (And Fails)", 2);

	// 2. Use the Movie class to get the ticket price of one of your movies.
	public static void main(String[] args) {
		new NetflixRunner();
	}

	public NetflixRunner() {
		System.out.println(m.getTicketPrice());
		
		// 3. Instantiate a NetflixQueue.
		NetflixQueue q = new NetflixQueue();
		// 4. Add your movies to the Netflix queue
		q.addMovie(m3);
		q.addMovie(m4);
		q.addMovie(m1);
		q.addMovie(m2);
		q.addMovie(m);
		// 5. Print all the movies in your queue.
		q.sortMoviesByRating();
		q.printMovies();
		// 6. Use your NetflixQueue object to finish the sentence "the best movie
		// is...."
		System.out.println("The best movie is...");
		System.out.println(q.getBestMovie());
		// 7. Use your NetflixQueue to finish the sentence "the second best movie
		// is...."
		System.out.println("The second best movies are...");
		System.out.println(q.getMovie(1));
		System.out.println(q.getMovie(2));
	}
}
