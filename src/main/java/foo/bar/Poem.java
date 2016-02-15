package foo.bar;


public class Poem {
    String textPoem;

    public Poem(String textPoem){
        this.textPoem = textPoem;
    }

    public void recite(){
        System.out.println("reciting cool poem");
        System.out.println(textPoem);
    }

    public void readPoem(){
        System.out.println("Poem for trainer");
        System.out.println(textPoem);
    }
}
