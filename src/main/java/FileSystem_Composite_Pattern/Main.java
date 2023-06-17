package FileSystem_Composite_Pattern;

public class Main {
    public static void main(String[] args) {
        Directory movie = new Directory("Movies");
        File firstMovie = new File("First movie");
        movie.add(firstMovie);
        Directory comedyMovies = new Directory("Comedy Movies");
        Directory horrorMovies = new Directory("Horror Movies");

        File m420 = new File("Mr.420");
        File karva = new File("Karva");
        movie.add(comedyMovies);
        movie.add(horrorMovies);
        comedyMovies.add(m420);
        horrorMovies.add(karva);
        File uTurn = new File("U-Turn");
        horrorMovies.add(uTurn);
        movie.ls();
    }
}
