package jeroquest.items;

import jeroquest.boardgame.Board;
import jeroquest.utils.DynamicVectorPosition;
import jeroquest.utils.Position;

public class Item {

    private Position pos;

    public Item() {
    }

    public Position getPosition() {
        return pos;
    }

    public void setPosition(Position pos) {
        this.pos = pos;
    }

    public DynamicVectorPosition validPositions(Board theBoard) {

        DynamicVectorPosition positions = new DynamicVectorPosition();

        // N
        if (theBoard.freeSquare(this.getPosition().north()))
            positions.add(this.getPosition().north());

        // S
        if (theBoard.freeSquare(this.getPosition().south()))
            positions.add(this.getPosition().south());

        // E
        if (theBoard.freeSquare(this.getPosition().east()))
            positions.add(this.getPosition().east());

        // W
        if (theBoard.freeSquare(this.getPosition().west()))
            positions.add(this.getPosition().west());

		/*
		// NE
		if (theBoard.freeSquare(this.getPosition().north().east()))
			positions.add(this.getPosition().north().east());

		// NW
		if (theBoard.freeSquare(this.getPosition().north().west()))
			positions.add(this.getPosition().north().west());

		// SE
		if (theBoard.freeSquare(this.getPosition().south().east()))
			positions.add(this.getPosition().south().east());

		// SW
		if (theBoard.freeSquare(this.getPosition().south().west()))
			positions.add(this.getPosition().south().west());
		*/

        return positions;

    }
}
