package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ber extends bem {

    /* JADX INFO: renamed from: a */
    final AtomicReferenceFieldUpdater f3054a;

    /* JADX INFO: renamed from: b */
    final AtomicReferenceFieldUpdater f3055b;

    /* JADX INFO: renamed from: c */
    final AtomicReferenceFieldUpdater f3056c;

    /* JADX INFO: renamed from: d */
    final AtomicReferenceFieldUpdater f3057d;

    /* JADX INFO: renamed from: e */
    final AtomicReferenceFieldUpdater f3058e;

    public ber(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3054a = atomicReferenceFieldUpdater;
        this.f3055b = atomicReferenceFieldUpdater2;
        this.f3056c = atomicReferenceFieldUpdater3;
        this.f3057d = atomicReferenceFieldUpdater4;
        this.f3058e = atomicReferenceFieldUpdater5;
    }

    @Override // p000.bem
    /* JADX INFO: renamed from: a */
    public final void mo2266a(beu beuVar, beu beuVar2) {
        this.f3055b.lazySet(beuVar, beuVar2);
    }

    @Override // p000.bem
    /* JADX INFO: renamed from: b */
    public final void mo2267b(beu beuVar, Thread thread) {
        this.f3054a.lazySet(beuVar, thread);
    }

    @Override // p000.bem
    /* JADX INFO: renamed from: c */
    public final boolean mo2268c(bev bevVar, beq beqVar, beq beqVar2) {
        return bdw.m2255d(this.f3057d, bevVar, beqVar, beqVar2);
    }

    @Override // p000.bem
    /* JADX INFO: renamed from: d */
    public final boolean mo2269d(bev bevVar, Object obj, Object obj2) {
        return bdw.m2255d(this.f3058e, bevVar, obj, obj2);
    }

    @Override // p000.bem
    /* JADX INFO: renamed from: e */
    public final boolean mo2270e(bev bevVar, beu beuVar, beu beuVar2) {
        return bdw.m2255d(this.f3056c, bevVar, beuVar, beuVar2);
    }
}
