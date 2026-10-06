package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzr implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f30079a;

    public hzr(oju ojuVar) {
        this.f30079a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final msi get() {
        return jpd.m13427h((AtomicReference) this.f30079a.get());
    }
}
