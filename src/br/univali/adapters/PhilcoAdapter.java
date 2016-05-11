package br.univali.adapters;

import br.univali.VideoRecorder;
import com.philco.PhilcoDVRController;

public class PhilcoAdapter implements VideoRecorder{
    private PhilcoDVRController philcoAdapter = new PhilcoDVRController();
    
    @Override
    public void record() {
        philcoAdapter.record();
    }

    @Override
    public void stop() {
        philcoAdapter.stop();
    }

    @Override
    public void play() {
        philcoAdapter.play();
    }
    
}
