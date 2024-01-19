package bridge.videoImpl;

import bridge.Video;
import bridge.VideoProcessor;

public class NetflixVideo extends Video {

    public NetflixVideo(VideoProcessor videoProcessor){
        super(videoProcessor);
    }
    @Override
    public void play() {
        videoProcessor.process();

    }
}
