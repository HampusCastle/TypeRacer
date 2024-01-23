package com.fredrik.typeRacer;

public class Main {
    public static void main(String[] args) {

        SentenceGenerator sentenceGenerator = new SentenceGenerator();

        TypeRacerGame typeRacerGame = new TypeRacerGame();

        typeRacerGame.startGame(sentenceGenerator.getRandomSentence());

        }

    }