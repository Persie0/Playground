package p000;

import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oke implements Serializable, ojy {

    /* JADX INFO: renamed from: a */
    private static final AtomicReferenceFieldUpdater f46189a = AtomicReferenceFieldUpdater.newUpdater(oke.class, Object.class, "c");

    /* JADX INFO: renamed from: b */
    private volatile omx f46190b;

    /* JADX INFO: renamed from: c */
    private volatile Object f46191c = okg.f46195a;

    public oke(omx omxVar) {
        this.f46190b = omxVar;
    }

    private final Object writeReplace() {
        return new ojw(mo18586a());
    }

    @Override // p000.ojy
    /* JADX INFO: renamed from: a */
    public final Object mo18586a() {
        Object obj = this.f46191c;
        if (obj != okg.f46195a) {
            return obj;
        }
        omx omxVar = this.f46190b;
        if (omxVar != null) {
            Object objMo2077a = omxVar.mo2077a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46189a;
            okg okgVar = okg.f46195a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, okgVar, objMo2077a)) {
                if (atomicReferenceFieldUpdater.get(this) != okgVar) {
                }
            }
            this.f46190b = null;
            return objMo2077a;
        }
        return this.f46191c;
    }

    @Override // p000.ojy
    /* JADX INFO: renamed from: b */
    public final boolean mo18587b() {
        throw null;
    }

    public final String toString() {
        return this.f46191c != okg.f46195a ? String.valueOf(mo18586a()) : pIeXJQLZLfgIN.rOlx;
    }
}
