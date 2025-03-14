package jeroquest.items;

import jeroquest.boardgame.Piece;
import jeroquest.utils.Position;

public class Wall extends Item implements Piece {

    public Wall() {
        super();
    }

    @Override
    public char toChar() {
        return '#';
    }

}
