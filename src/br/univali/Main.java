package br.univali;

import br.univali.adapters.PhilcoAdapter;
import br.univali.adapters.SamsungAdapter;

public class Main {

    public static void main(String args[]) throws Exception {
        CompoundVideoRecorder superRecorder = new CompoundVideoRecorder();
        superRecorder.add(new PhilcoAdapter());
        superRecorder.add(new SamsungAdapter());
        VideoRecorder recorder = superRecorder;
        
        GenericVideoRecorder application = new GenericVideoRecorder(recorder);

        //simula a utilização da aplicação
        application.record();
        application.stop();
        application.play();
    }

}
