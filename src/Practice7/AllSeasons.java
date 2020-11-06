package Practice7;

public class AllSeasons {

    private Seasons seasons;

    AllSeasons(Seasons seasons) {
        this.seasons = seasons;
    }

    public void whatToDo(){

        switch (seasons) {

            case fall:
                System.out.println("my favorite seasons");
                break;
            case spring:
                System.out.println("Too much Rain");
                break;
            case summer:
                System.out.println("Way to hot");
                break;
            case winter:
                System.out.println("Too cold");
                break;
            default:
                System.out.println("No more seasons");
                break;
        }


    }
}
