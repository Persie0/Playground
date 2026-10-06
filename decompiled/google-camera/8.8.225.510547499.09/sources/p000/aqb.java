package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqb implements olv {

    /* JADX INFO: renamed from: c */
    public static final olt f2106c = new olt();

    /* JADX INFO: renamed from: a */
    public final olu f2107a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f2108b = new AtomicInteger(0);

    public aqb(olu oluVar) {
        this.f2107a = oluVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m1856a() {
        if (this.f2108b.decrementAndGet() < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
    }

    @Override // p000.oly
    public final Object fold(Object obj, onm onmVar) {
        return omn.m18702g(this, obj, onmVar);
    }

    @Override // p000.olv, p000.oly
    public final olv get(olw olwVar) {
        return omn.m18703h(this, olwVar);
    }

    @Override // p000.olv
    public final olw getKey() {
        return f2106c;
    }

    @Override // p000.oly
    public final oly minusKey(olw olwVar) {
        return omn.m18704i(this, olwVar);
    }

    @Override // p000.oly
    public final oly plus(oly olyVar) {
        return omn.m18705j(this, olyVar);
    }
}
