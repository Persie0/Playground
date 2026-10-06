package p000;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ged {
    /* JADX INFO: renamed from: a */
    public static Handler m9087a(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return jvh.m13557e(handlerThread.getLooper());
    }
}
