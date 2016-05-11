package br.univali;

public class GenericVideoRecorder {

    // VideoRecorder é abstração/contrato que será usada para interagir com equipamentos de diferentes fabricantes
    private VideoRecorder videoRecorder;

    public GenericVideoRecorder(VideoRecorder videoRecorder) {
        if (videoRecorder == null) {
            throw new IllegalArgumentException("O parâmetro videoRecorder no constructor de GenericVideoRecorder não pode ser nulo!");
        }
        this.videoRecorder = videoRecorder;
    }

    public void record() {
        videoRecorder.record();
    }

    public void stop() {
        videoRecorder.stop();
    }

    public void play() {
        videoRecorder.play();
    }
    
    public void setVideoRecorder(VideoRecorder recorder){
        this.videoRecorder = recorder;
    }
    
    

}
