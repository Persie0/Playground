package p000;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class wz9 {

    /* JADX INFO: renamed from: a */
    public static final long f67573a;

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        f67573a = id;
    }
}
