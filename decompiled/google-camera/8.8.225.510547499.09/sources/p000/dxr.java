package p000;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dxr {

    /* JADX INFO: renamed from: a */
    private static final nbh f12844a = nbh.m17259h("com/google/android/apps/camera/framestore/FrameStoreResourceManager");

    /* JADX INFO: renamed from: b */
    private final Deque f12845b = new ArrayDeque();

    /* JADX INFO: renamed from: a */
    public final synchronized void m6863a(dya dyaVar) {
        this.f12845b.addLast(dyaVar);
        dyv.m6941d(dyaVar);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6864b(dya dyaVar) {
        try {
            if (dyaVar == null) {
                ((nbe) ((nbe) f12844a.m17252c()).mo17276G((char) 1174)).mo17290o("Invalid frame store resource.");
            } else if (this.f12845b.removeFirstOccurrence(dyaVar)) {
                dyv.m6941d(dyaVar);
            } else {
                ((nbe) ((nbe) f12844a.m17252c()).mo17276G((char) 1172)).mo17290o("Resource not found in queue");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
