package bridge.processorImpl;

import bridge.VideoProcessor;

public class UHDProcessor implements VideoProcessor {
    @Override
    public void process() {
        System.out.println("video is in process UHD");
    }
}
