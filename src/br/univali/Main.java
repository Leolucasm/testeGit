package br.univali;

import br.univali.adapters.PhilcoAdapter;

public class Main {

    public static void main(String args[]) throws Exception {
        VideoRecorder recorder = VideoRecorderFactory.newVideoRecorderFactory();
        
        GenericVideoRecorder application = new GenericVideoRecorder(recorder);

        //simula a utilização da aplicação
        application.record();
        application.stop();
        application.play();
    }

}
