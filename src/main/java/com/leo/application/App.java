package com.leo.application;

import boardgame.Board;
import chess.ChessMatch;

public class App {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());
    }
}