package com.example.melentyev.sergey.beatbox;

public class Sound {
    private String mAssetPath;
    private String mName;
    private String mImage;
    private Integer mSoundId;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length -1];
        mName = filename.replace(".mp3", "");
        mImage = mName;
    }

    public String getAssetPath() {
        return mAssetPath;
    }
    public String getName() {
        return mName;
    }
    public String getImage() {
        return mImage;
    }
    public Integer getSoundId() {
        return mSoundId;
    }
    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }
}