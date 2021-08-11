package com.example.a10118397_joss;
/*nama : bagas wirawan
  NIM : 10118397
  Kelas : IF9
  Tanggal : 02-August-2021 - 08-August-2021
* */


import android.app.Application;

import com.google.firebase.FirebaseApp;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }

}
