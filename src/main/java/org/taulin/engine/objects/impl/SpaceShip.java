package org.taulin.engine.objects.impl;

import org.taulin.bindings.ncurses.NCurses;
import org.taulin.engine.enums.InputKey;
import org.taulin.engine.objects.Controllable;
import org.taulin.engine.objects.Drawable;
import org.taulin.engine.objects.Movable;

import java.util.List;
import java.util.Objects;

public class SpaceShip implements Drawable, Movable, Controllable {
    private static final char PIECES_CHAR = '#';

    private final Board board;
    private final List<Glyph> pieces;

    public SpaceShip(Board board) {
        this.board = board;

        pieces = initPieces(board);
    }

    private static List<Glyph> initPieces(Board board) {
        Glyph frontPiece = new Glyph(board, board.getHeight() - 3, 2, PIECES_CHAR);
        Glyph leftPiece = new Glyph(board, board.getHeight() - 2, 1, PIECES_CHAR);
        Glyph rightPiece = new Glyph(board, board.getHeight() - 2, 3, PIECES_CHAR);

        return List.of(frontPiece, leftPiece, rightPiece);
    }

    @Override
    public void draw() {
        pieces.forEach(Glyph::draw);
    }

    @Override
    public void processInput() {
        InputKey input = InputKey.ofCode(NCurses.wgetch(board.getWindowRef()));

        if (Objects.isNull(input)) return;

        switch (input) {
            case KEY_UP -> up();
            case KEY_DOWN -> down();
            case KEY_LEFT -> left();
            case KEY_RIGHT -> right();
        }
    }

    @Override
    public boolean canMoveUp() {
        return pieces.stream()
                .allMatch(Glyph::canMoveUp);
    }

    @Override
    public void up() {
        if (!canMoveUp()) return;

        pieces.forEach(Glyph::up);
    }

    @Override
    public boolean canMoveDown() {
        return pieces.stream()
                .allMatch(Glyph::canMoveDown);
    }

    @Override
    public void down() {
        if (!canMoveDown()) return;

        pieces.forEach(Glyph::down);
    }

    @Override
    public boolean canMoveLeft() {
        return pieces.stream()
                .allMatch(Glyph::canMoveLeft);
    }

    @Override
    public void left() {
        if (!canMoveLeft()) return;

        pieces.forEach(Glyph::left);
    }

    @Override
    public boolean canMoveRight() {
        return pieces.stream()
                .allMatch(Glyph::canMoveRight);
    }

    @Override
    public void right() {
        if (!canMoveRight()) return;

        pieces.forEach(Glyph::right);
    }
}
