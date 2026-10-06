package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: xp */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1127xp extends AbstractC1121xj {

    /* JADX INFO: renamed from: a */
    final AtomicReferenceFieldUpdater f48022a;

    /* JADX INFO: renamed from: b */
    final AtomicReferenceFieldUpdater f48023b;

    /* JADX INFO: renamed from: c */
    final AtomicReferenceFieldUpdater f48024c;

    /* JADX INFO: renamed from: d */
    final AtomicReferenceFieldUpdater f48025d;

    /* JADX INFO: renamed from: e */
    final AtomicReferenceFieldUpdater f48026e;

    public C1127xp(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f48022a = atomicReferenceFieldUpdater;
        this.f48023b = atomicReferenceFieldUpdater2;
        this.f48024c = atomicReferenceFieldUpdater3;
        this.f48025d = atomicReferenceFieldUpdater4;
        this.f48026e = atomicReferenceFieldUpdater5;
    }

    @Override // p000.AbstractC1121xj
    /* JADX INFO: renamed from: a */
    public final void mo19573a(C1130xs c1130xs, C1130xs c1130xs2) {
        this.f48023b.lazySet(c1130xs, c1130xs2);
    }

    @Override // p000.AbstractC1121xj
    /* JADX INFO: renamed from: b */
    public final void mo19574b(C1130xs c1130xs, Thread thread) {
        this.f48022a.lazySet(c1130xs, thread);
    }

    @Override // p000.AbstractC1121xj
    /* JADX INFO: renamed from: c */
    public final boolean mo19575c(AbstractC1131xt abstractC1131xt, C1125xn c1125xn, C1125xn c1125xn2) {
        return C1126xo.m19578a(this.f48025d, abstractC1131xt, c1125xn, c1125xn2);
    }

    @Override // p000.AbstractC1121xj
    /* JADX INFO: renamed from: d */
    public final boolean mo19576d(AbstractC1131xt abstractC1131xt, Object obj, Object obj2) {
        return C1126xo.m19578a(this.f48026e, abstractC1131xt, obj, obj2);
    }

    @Override // p000.AbstractC1121xj
    /* JADX INFO: renamed from: e */
    public final boolean mo19577e(AbstractC1131xt abstractC1131xt, C1130xs c1130xs, C1130xs c1130xs2) {
        return C1126xo.m19578a(this.f48024c, abstractC1131xt, c1130xs, c1130xs2);
    }
}
