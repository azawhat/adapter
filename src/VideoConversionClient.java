public class VideoConversionClient {
    public static void main(String[] args) {
        MP4Video mp4Video = new MP4Video();

        VideoConverter videoConverter = new MP4ToAVIAdapter(mp4Video);

        String sourceVideo = "video.mp4";
        String targetVideo = "convertedVideo.avi";
        videoConverter.convert(sourceVideo, targetVideo);
    }
}