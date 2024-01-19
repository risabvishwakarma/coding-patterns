package bridge.processorImpl;

import bridge.VideoProcessor;

public class HDProcessor implements VideoProcessor {
    @Override
    public void process() {
            System.out.println("video is in process HD");
    }
}
