package ml;

import android.os.Looper;
import dm.C5206f;
import il.InterfaceC6355a;
import java.util.HashSet;
import java.util.Iterator;
import p305ol.InterfaceC8083a;

/* JADX INFO: renamed from: ml.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C7637d implements InterfaceC6355a {

    /* JADX INFO: renamed from: a */
    public final HashSet f42045a = new HashSet();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m15195a() {
        if (C5206f.f33267b == null) {
            C5206f.f33267b = Looper.getMainLooper().getThread();
        }
        if (!(Thread.currentThread() == C5206f.f33267b)) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
        Iterator it = this.f42045a.iterator();
        while (it.hasNext()) {
            ((InterfaceC8083a) it.next()).m16004a();
        }
    }
}
