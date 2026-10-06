package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ndq {

    /* JADX INFO: renamed from: a */
    private static final AtomicBoolean f42057a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static void m17376a(nax naxVar) {
        if (!f42057a.compareAndSet(false, true)) {
            throw new IllegalStateException("Logger backend configuration may only occur once.");
        }
        Object ndxVar = naxVar.f41919a;
        if (ndxVar == null) {
            ndxVar = new ndx();
        }
        AtomicReference atomicReference = ndv.f42062a;
        while (!atomicReference.compareAndSet(null, ndxVar)) {
            if (atomicReference.get() != null) {
                throw new IllegalStateException("Logger backends can only be configured once.");
            }
        }
        ndv.m17383e();
        ndw.f42066a.f42067b.set(nec.f42087a);
    }
}
