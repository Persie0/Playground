package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class noi extends noh {

    /* JADX INFO: renamed from: a */
    final AtomicReferenceFieldUpdater f43981a;

    /* JADX INFO: renamed from: b */
    final AtomicIntegerFieldUpdater f43982b;

    public noi(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f43981a = atomicReferenceFieldUpdater;
        this.f43982b = atomicIntegerFieldUpdater;
    }

    @Override // p000.noh
    /* JADX INFO: renamed from: a */
    public final int mo17565a(nok nokVar) {
        return this.f43982b.decrementAndGet(nokVar);
    }

    @Override // p000.noh
    /* JADX INFO: renamed from: b */
    public final void mo17566b(nok nokVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f43981a;
        while (!atomicReferenceFieldUpdater.compareAndSet(nokVar, null, set) && atomicReferenceFieldUpdater.get(nokVar) == null) {
        }
    }
}
