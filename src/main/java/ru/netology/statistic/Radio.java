package ru.netology.statistic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.plaf.PanelUI;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    public int currentRadioStation;
    public int currentVolume;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int RadioStation = 10;

    public Radio(int RadioStation) {
        this.RadioStation = RadioStation;
    }

    public void setCurrentNumberRadio(int newCurrentRadioStation) {
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void nextRadio() {
        if (currentRadioStation < RadioStation - 1) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prevRadio() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = RadioStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = currentVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = currentVolume;
        }
    }

}
