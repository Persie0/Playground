package p000;

import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bnt {

    /* JADX INFO: renamed from: b */
    public final Object f3895b = new Object();

    /* JADX INFO: renamed from: a */
    public final Runnable f3894a = new baa(this, 9);

    /* JADX INFO: renamed from: a */
    static void m2778a(Message message) {
        if (message != null && (message.obj instanceof bnt)) {
            ((bnt) message.obj).f3894a.run();
        }
    }
}
