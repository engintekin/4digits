package com.fdnsoft.digits;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.phonegap.*;

public class Digits4 extends DroidGap {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.init();
        appView.addJavascriptInterface(new KeyBoard(this, appView), "KeyBoard");
        super.loadUrl("file:///android_asset/www/4digits/game.html");
        appView.requestFocus(View.FOCUS_UP);


    }

}
    
