package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class otd {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f46515a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objM15591r;
        try {
            Looper mainLooper = Looper.getMainLooper();
            mainLooper.getClass();
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, mainLooper);
            objInvoke.getClass();
            objM15591r = new otb((Handler) objInvoke, null);
        } catch (Throwable th) {
            objM15591r = lkm.m15591r(th);
        }
    }
}
