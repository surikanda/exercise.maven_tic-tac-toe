package com.github.perscholas;

import java.util.Arrays;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] game;

    public Board(Character[][] matrix) {
        this.game = matrix;
    }

    public Boolean isInFavorOfX() {

        return isInFavorOfXO('X');
    }

    public Boolean isInFavorOfO() {

        return isInFavorOfXO('O');
    }

    public Boolean isTie() {
            return !isInFavorOfX() && !isInFavorOfO();
    }

    public String getWinner() {
        if(isInFavorOfX()){
            return "X";
        } else if(isInFavorOfO()) {
            return "O";
        }
        return "";
    }

    public Boolean isInFavorOfXO(char XO){
        if((game[0][0]==XO) && (game[0][1] == XO) && (game[0][2] == XO)){
            return true;
        } else if((game[1][0]==XO) && (game[1][1]==XO) && (game[1][2]== XO)){
            return true;
        } else if((game[2][0]==XO) && (game[2][1]==XO) && (game[2][2]==XO)){
            return true;
        } else if((game[0][0]==XO) && (game[0][1]==XO) && (game[0][2]==XO)){
            return true;
        } else if((game[1][0]==XO) && (game[1][1]==XO) && (game[1][2]==XO)){
            return true;
        } else if((game[2][0]==XO) && (game[2][1]==XO) && game[2][2]==XO){
            return true;
        } else if((game[0][0]==XO) && (game[1][1]==XO) && (game[2][2]==XO)){
            return true;
        } else if((game[0][2]==XO) && (game[1][1]==XO) && (game[2][0]==XO)){
            return true;
        } return false;
    }

}
