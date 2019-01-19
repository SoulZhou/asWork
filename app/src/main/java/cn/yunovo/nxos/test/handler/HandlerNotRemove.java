
package cn.yunovo.nxos.test.handler;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/**
 * 中途不需要调用RemoteCallbacks的Handler
 */
public class HandlerNotRemove extends Handler {
	private static final HandlerNotRemove me;
	static {
		HandlerThread thread = new HandlerThread("HandlerNotRemove");
		thread.start();
		me = new HandlerNotRemove(thread.getLooper());
	}
	
	public static HandlerNotRemove me() {
		return me;
	}
	
	private HandlerNotRemove(Looper looper) { super(looper); }
}
