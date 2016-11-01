package com.dat.firebasedemo;

import android.app.Application;
import com.firebase.client.Firebase;

/**
 * Created by Dat on 02-Nov-16.
 */

public class FireBaseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
