package com.example.android.miwok;

public class Word {
    /**default translation for the word*/
    private  String mDefaultTranslation;
    /**Miwok translation for the word*/
    private String mMiwokTranslation;
    /** image for the words*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    public Word(String defaultTranslation,String MiwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=MiwokTranslation;
    }
    public Word(String defaultTranslation,String MiwokTranslation,int ImageResourceId ){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;
    }
    public  String getmDefaultTranslation() {

        return mDefaultTranslation;
    }
    public  String  getmMiwokTranslation() {

        return mMiwokTranslation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
