package cn.yunovo.nxos.test;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/11/27.
 */

public interface IRadio {
    void freqUp();
    void freqDown();
    void seekUp();
    void seekDown();
    void saveColectionChannel(int index,int freq);
    void nextChannel();
    void prevChannel();
    void freq(int value1, int value2);
    void search(int value);
    void radioMute(int value);

    public static class BaseRadio implements IRadio{
        @Override
        public void freqUp() {

        }

        @Override
        public void freqDown() {

        }

        @Override
        public void seekUp() {

        }

        @Override
        public void seekDown() {

        }

        @Override
        public void saveColectionChannel(int index, int freq) {

        }

        @Override
        public void nextChannel() {

        }

        @Override
        public void prevChannel() {

        }

        @Override
        public void freq(int value1, int value2) {

        }

        @Override
        public void search(int value) {

        }

        @Override
        public void radioMute(int value) {

        }


    }
}
