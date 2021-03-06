package sg.edu.np.mad.Assignment1;

public class ModelVideos {
    String id, title, timestamp, videoUrl;
    Boolean isLike; // Added liked button for tutorials in ASG2

    //constructor
    public ModelVideos(){

    }

    public ModelVideos(String id, String title, String timestamp, String videoUrl, Boolean isLike) {
        this.id = id;
        this.title = title;
        this.timestamp = timestamp;
        this.videoUrl = videoUrl;
        this.isLike = isLike;
    }

    //Getter & Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Boolean getLike() {
        return isLike;
    }
}
