package learningakka.actors;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.testkit.TestActorRef;
import org.junit.Assert;
import org.junit.Test;


public class ProcessingActorTest {

    ActorSystem system = ActorSystem.create();

    @Test
    public void messageReceivedSuccessfylly() {
        TestActorRef<ProcessingActor> actorTestActorRef = TestActorRef.create(system, Props.create(ProcessingActor.class));

        actorTestActorRef.tell("TheShame|Bergman|1968|Drama", ActorRef.noSender());

        ProcessingActor processingActor = actorTestActorRef.underlyingActor();

        Assert.assertEquals(processingActor.getLastMovie(), "TheShame|Bergman|1968|Drama");

    }

    @Test
    public void secondMessageReceivedSuccessfuly() {
        TestActorRef<ProcessingActor> actorTestActorRef = TestActorRef.create(system, Props.create(ProcessingActor.class));

        actorTestActorRef.tell("TheShame|Bergman|1968|Drama", ActorRef.noSender());
        actorTestActorRef.tell("Persona|Bergman|1966|Thriller", ActorRef.noSender());

        ProcessingActor processingActor = actorTestActorRef.underlyingActor();

        Assert.assertEquals(processingActor.getLastMovie(), "Persona|Bergman|1966|Thriller");
    }
}