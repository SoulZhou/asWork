package cn.yunovo.nxos.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    RadioTest radioTest = RadioTest.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startRadioTest(View view){
        radioTest.startRadio();
    }
    public void startRadioMuteTest(View view){
        radioTest.radioMute(0);
    }
    public void stopRadioMuteTest(View view){
        radioTest.radioMute(1);
    }
}
