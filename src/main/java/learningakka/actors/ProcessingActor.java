package learningakka.actors;

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

public class ProcessingActor extends AbstractActor {

    /*final private List<Movie> movies = new ArrayList<>();*/
    private String lastMovie;

    public ProcessingActor() {
        receive(ReceiveBuilder.match(String.class, s -> lastMovie = s)
                        .build());
    }

    public String getLastMovie() {
        return lastMovie;
    }
}
