public class teste3 {
    public static void main(String[] args){
        Movie one = new Movie();
        one.title = "Gone with the stock";
        one.genre = "Tragic";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Lost in cubicle space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic";
        three.rating = 10;
    }
}

class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie !");
    }
}