package cn.yunovo.nxos.test;

import cn.yunovo.nxos.carservice.sdk.manager.AppsManager;
import cn.yunovo.nxos.carservice.sdk.manager.RadioManager;
import cn.yunovo.nxos.test.handler.HandlerNotRemove;
import cn.yunovo.nxos.test.run.RunList;

/**
 * Created by Administrator on 2018/11/27.
 */

public class RadioTest extends IRadio.BaseRadio{
    private static RadioTest ourInstance;

    private static final Long one = 1000l;
    private static final Long three = 3000l;
    private static final Long five = 5000l;
    private AppsManager appsManager = AppsManager.instance();
    private RadioManager radioManager = RadioManager.instance();
    private RunList runList = RunList.getInstance();
    public static RadioTest getInstance() {
        if(ourInstance==null){
            ourInstance = new RadioTest();
        }
        return ourInstance;
    }

    private RadioTest() {
    }

    public void startRadio(){
        appsManager.startRadio();
        HandlerNotRemove.me().postDelayed(runList.runRadioSearch,three);
        HandlerNotRemove.me().postDelayed(runList.runRadioStopSearch,2*three);
        HandlerNotRemove.me().postDelayed(runList.runRadioSeekup,3*three);
        HandlerNotRemove.me().postDelayed(runList.runRadioSeekdown,4*three);
        HandlerNotRemove.me().postDelayed(runList.runRadioPrev,5*three);
        HandlerNotRemove.me().postDelayed(runList.runRadioNext,6*three);
        HandlerNotRemove.me().postDelayed(runList.runRadioFreq,7*three);
        HandlerNotRemove.me().postDelayed(runList.runRadioSave,8*three);
        HandlerNotRemove.me().postDelayed(runList.runRadioClose,9*three);
    }

    public void stopRadio(){
        appsManager.closeRadio();
    }

    @Override
    public void freqUp() {
        radioManager.freqUp();
    }

    @Override
    public void freqDown() {
        radioManager.freqDown();
    }

    @Override
    public void seekUp() {
        radioManager.seekUp();
    }

    @Override
    public void seekDown() {
        radioManager.seekDown();
    }

    @Override
    public void saveColectionChannel(int index, int freq) {
        radioManager.saveChannel(index,freq);
    }

    @Override
    public void nextChannel() {
        radioManager.nextChannel();
    }

    @Override
    public void prevChannel() {
        radioManager.prevChannel();
    }

    /**
     * @param value1 传入值 1
     * @param value2 freq value
     */
    @Override
    public void freq(int value1, int value2) {
        radioManager.freq(value1,value2);
    }

    @Override
    public void search(int value) {
        radioManager.search(value);
    }

    @Override
    public void radioMute(int value) {
        if(value==0){
            radioManager.powerOff();
        }else if(value==1){
            radioManager.powerOn();
        }
    }
}
