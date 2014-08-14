package com.sz.stanzhao.snapchat_clone_android;


import android.app.Application;

import com.parse.Parse;

public class snapchat_clone extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "HzZKetV70Xl6Bk9eXgfqNCfAXsc8ZgVm2NizCKzc", "PinzP3feD503X3xJRoMAXXdn7IKi8phZm5vvvO7G");


    }

}

