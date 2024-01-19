package bridge.videoImpl;

import bridge.Video;
import bridge.VideoProcessor;

public class YoutubeVideo extends Video {

    public YoutubeVideo(VideoProcessor videoProcessor){
        super(videoProcessor);
    }
    @Override
    public void play() {
            videoProcessor.process();
    }
}
