package p000;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l98 {

    /* JADX INFO: renamed from: a */
    public final HashSet f49346a = new HashSet();

    /* JADX INFO: renamed from: a */
    public final void m16034a() {
        if (f7d.f38604b == null) {
            f7d.f38604b = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != f7d.f38604b) {
            C3386nv.m17633t("Must be called on the Main thread.");
            return;
        }
        Iterator it = this.f49346a.iterator();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
    }
}
