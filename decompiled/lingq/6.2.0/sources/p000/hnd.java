package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class hnd {

    /* JADX INFO: renamed from: c */
    public static final mmd f42677c = new mmd(2);

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f42678a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f42679b = new AtomicInteger();

    /* JADX INFO: renamed from: a */
    public static int m13382a(ind indVar, cnd cndVar, afa afaVar) {
        hnd hndVar = (hnd) f42677c.m19759h(cndVar, afaVar);
        AtomicInteger atomicInteger = hndVar.f42679b;
        AtomicBoolean atomicBoolean = hndVar.f42678a;
        int iIncrementAndGet = atomicInteger.incrementAndGet();
        if (indVar == ind.f44335a || !atomicBoolean.compareAndSet(false, true)) {
            return -1;
        }
        try {
            indVar.mo11963a();
            atomicBoolean.set(false);
            atomicInteger.addAndGet(-iIncrementAndGet);
            return iIncrementAndGet - 1;
        } catch (Throwable th) {
            atomicBoolean.set(false);
            throw th;
        }
    }
}
