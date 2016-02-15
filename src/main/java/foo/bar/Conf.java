package foo.bar;

/**
 * Created by Yulya on 11.02.2016.
 */
public class Conf {
    Performer performer = null;

    public Conf(Performer performer){
        this.performer= performer;
    }

    public void makePerform() {
        System.out.println("Goooo");
        performer.perform();
    }
}