import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.statistic.Radio;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(6);
        ;
        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(6);
        radio.nextRadio();
        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNullRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(9);
        radio.nextRadio();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(4);
        radio.prevRadio();
        int expected = 3;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNineRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(0);
        radio.prevRadio();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.increaseVolume();
        int expected = 7;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeNull() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}

