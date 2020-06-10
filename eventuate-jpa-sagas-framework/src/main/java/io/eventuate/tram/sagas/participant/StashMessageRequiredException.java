package io.eventuate.tram.sagas.participant;

public class StashMessageRequiredException extends RuntimeException {
    private String target;

    public String getTarget() {
        return target;
    }

    public StashMessageRequiredException(String target) {
        this.target = target;

    }
}
