package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by John on 2016/12/14 0014.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        mId = UUID.randomUUID();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getId() {

        return mId;
    }
}
