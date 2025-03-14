package jeroquest.items;

import jeroquest.utils.Position;

public class Trap extends Item {

    private Boolean activated;

    public Trap() {
        super();
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

}
