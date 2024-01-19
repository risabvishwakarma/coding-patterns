package bridge;

public abstract class Video {

    protected VideoProcessor videoProcessor=null;

    protected Video(VideoProcessor videoProcessor){
        this.videoProcessor=videoProcessor;
    }

     public abstract void play();
}
