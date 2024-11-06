package Wiss.Solution1WithCompositeDesign;

public class Main {
    public static void main(String args[]){

       Directory movieDirectory = new Directory("Movie");

        FileSystem border = new File("Border",10);
        movieDirectory.add(border);

       Directory comedyMovieDirectory = new Directory("ComedyMovie");
       File hulchul = new File("Hulchul",20);
        comedyMovieDirectory.add(hulchul);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();
        System.out.println(movieDirectory.size());
    }
}
