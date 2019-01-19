package cn.yunovo.nxos.test;

import android.app.Application;

import cn.yunovo.nxos.carservice.sdk.ipc.NxCarServiceKit;

/**
 * Created by Administrator on 2018/11/27.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        NxCarServiceKit.init(this);
    }
}
