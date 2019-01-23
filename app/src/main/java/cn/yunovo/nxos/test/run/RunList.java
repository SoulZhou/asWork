package cn.yunovo.nxos.test.run;

import android.util.Log;

import cn.yunovo.nxos.carservice.sdk.manager.RadioManager;
import cn.yunovo.nxos.test.RadioTest;

/**
 * Created by Administrator on 2018/11/27.
 */

public class RunList {
    private static RunList ourInstance;
    public static final String TAG = RunList.class.getSimpleName();
    private RadioTest radioTest = RadioTest.getInstance();
    public static RunList getInstance() {
        if(ourInstance==null){
            ourInstance = new RunList();
            
        }
        return ourInstance;
    }

    private RunList() {
    }

    public Runnable runRadioSearch = new Runnable() {
        @Override
        public void run() {
            if(radioTest==null){
                Log.d(TAG, "runRadioSearch: radioTest==null");
            }
            radioTest.search(1);
        }
    };
    public Runnable runRadioStopSearch = new Runnable() {
        @Override
        public void run() {
            radioTest.search(0);
        }
    };
    public Runnable runRadioSeekup = new Runnable() {
        @Override
        public void run() {
            radioTest.seekUp();
        }
    };
    public Runnable runRadioSeekdown = new Runnable() {
        @Override
        public void run() {
            radioTest.seekDown();
        }
    };
    public Runnable runRadioPrev = new Runnable() {
        @Override
        public void run() {
            radioTest.prevChannel();
        }
    };
    public Runnable runRadioNext = new Runnable() {
        @Override
        public void run() {
            radioTest.nextChannel();
        }
    };
    public Runnable runRadioFreq = new Runnable() {
        @Override
        public void run() {
            radioTest.freq(1,9420);
        }
    };
    public Runnable runRadioSave = new Runnable() {
        @Override
        public void run() {
            radioTest.saveColectionChannel(3,8800);
        }
    };
    public Runnable runRadioClose = new Runnable() {
        @Override
        public void run() {
            radioTest.stopRadio();
        }
    };


}
