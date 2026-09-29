package p000;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c47 {

    /* JADX INFO: renamed from: a */
    public static final kv3 f9482a = new kv3(0, null);

    /* JADX INFO: renamed from: b */
    public static final kv3 f9483b = new kv3(1, null);

    /* JADX INFO: renamed from: a */
    public static wo3 m4309a(Looper looper, String str, ccd ccdVar) {
        lda.m16131q(looper, "Looper must not be null");
        return new wo3(looper, str, ccdVar);
    }
}
