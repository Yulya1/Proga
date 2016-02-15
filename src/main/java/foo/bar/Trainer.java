package foo.bar;

/**
 * Created by Yulya on 15.02.2016.
 */
public class Trainer implements Performer {
    String animal;
    Poem poem = null;

    public Trainer(String animal, Poem poem){
        this.animal = animal;
        this.poem = poem;
    }

    public void perform(){
        System.out.println("Trainer trains "+ animal);
        poem.readPoem();
    }
}
