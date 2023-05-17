package ru.netology.statistic;


public class Radio {
    public int currentRadioStation;
    public int currentVolume;
    private int minRadioStation = 0;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int radioStation = 10;


    public Radio() {
    }

    public Radio(int radioStation) {
        this.radioStation = radioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > radioStation - 1) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void nextRadio() {
        if (currentRadioStation < radioStation - 1) {
            setCurrentRadioStation(currentRadioStation + 1);
        } else {
            setCurrentRadioStation(minRadioStation);
        }
    }

    public void prevRadio() {
        if (currentRadioStation > minRadioStation) {
            setCurrentRadioStation(currentRadioStation - 1);
        } else {
            setCurrentRadioStation(radioStation - 1);
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}
