/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 5498465
 */
public class CompoundVideoRecorder implements VideoRecorder{

    private List<VideoRecorder> recorders = new ArrayList<>();
    
    public void add(VideoRecorder recorder){
        this.recorders.add(recorder);
    }
    @Override
    public void record() {
        for (VideoRecorder recorder : recorders) {
            recorder.record();
        }
    }

    @Override
    public void stop() {
        for (VideoRecorder recorder : recorders) {
            recorder.stop();
        }
    }

    @Override
    public void play() {
        for (VideoRecorder recorder : recorders) {
            recorder.play();
        }
    }
    
}
