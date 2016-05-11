package br.univali.adapters;

import br.univali.VideoRecorder;
import com.samsung.DVR;

public class SamsungAdapter implements VideoRecorder {

    DVR samsung = new DVR();

    @Override
    public void record() {
        
        samsung.rec();
    }

    @Override
    public void stop() {
        samsung.stop();
    }

    @Override
    public void play() {
        samsung.playLastMovie();
    }

}
