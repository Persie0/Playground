package p243lg;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: lg.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7363e {

    /* JADX INFO: renamed from: c */
    public static final Object f41124c = new Object();

    /* JADX INFO: renamed from: d */
    public static HandlerThread f41125d;

    /* JADX INFO: renamed from: e */
    public static ExecutorService f41126e;

    /* JADX INFO: renamed from: a */
    public final Handler f41127a;

    /* JADX INFO: renamed from: b */
    public final Handler f41128b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7363e() {
        synchronized (f41124c) {
            HandlerThread handlerThread = f41125d;
            if (handlerThread == null || !handlerThread.isAlive()) {
                HandlerThread handlerThread2 = new HandlerThread("KochavaPrimaryThread");
                f41125d = handlerThread2;
                handlerThread2.start();
            }
            if (f41126e == null) {
                f41126e = Executors.newCachedThreadPool();
            }
            Looper looper = f41125d.getLooper();
            if (looper == null) {
                throw new RuntimeException("Failed to start KochavaPrimaryThread");
            }
            this.f41127a = new Handler(Looper.getMainLooper());
            this.f41128b = new Handler(looper);
        }
    }
}
