class MP4ToAVIAdapter implements VideoConverter {
    private MP4Video mp4Video;

    public MP4ToAVIAdapter(MP4Video mp4Video) {
        this.mp4Video = mp4Video;
    }

    public void convert(String sourceVideo, String targetVideo) {
        System.out.println("Converting MP4 to AVI");
        mp4Video.playMP4();
        System.out.println("Done. Created file: " + targetVideo);
    }
}