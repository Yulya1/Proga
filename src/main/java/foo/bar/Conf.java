package foo.bar;

import java.util.Collection;
import java.util.List;

/**
 * Created by Yulya on 11.02.2016.
 */
public class Conf {
    List<Performer> perf;

    public void setPerf(List<Performer> perf) {
        this.perf = perf;
    }

    public void perform() {
        for (Performer p : perf){
            p.perform();
        }
    }
}