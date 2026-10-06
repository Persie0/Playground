package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nnq extends nnk {

    /* JADX INFO: renamed from: a */
    final AtomicReferenceFieldUpdater f43951a;

    /* JADX INFO: renamed from: b */
    final AtomicReferenceFieldUpdater f43952b;

    /* JADX INFO: renamed from: c */
    final AtomicReferenceFieldUpdater f43953c;

    /* JADX INFO: renamed from: d */
    final AtomicReferenceFieldUpdater f43954d;

    /* JADX INFO: renamed from: e */
    final AtomicReferenceFieldUpdater f43955e;

    public nnq(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f43951a = atomicReferenceFieldUpdater;
        this.f43952b = atomicReferenceFieldUpdater2;
        this.f43953c = atomicReferenceFieldUpdater3;
        this.f43954d = atomicReferenceFieldUpdater4;
        this.f43955e = atomicReferenceFieldUpdater5;
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: a */
    public final nno mo17525a(nnz nnzVar, nno nnoVar) {
        return (nno) this.f43954d.getAndSet(nnzVar, nnoVar);
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: b */
    public final nny mo17526b(nnz nnzVar, nny nnyVar) {
        return (nny) this.f43953c.getAndSet(nnzVar, nnyVar);
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: c */
    public final void mo17527c(nny nnyVar, nny nnyVar2) {
        this.f43952b.lazySet(nnyVar, nnyVar2);
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: d */
    public final void mo17528d(nny nnyVar, Thread thread) {
        this.f43951a.lazySet(nnyVar, thread);
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: e */
    public final boolean mo17529e(nnz nnzVar, nno nnoVar, nno nnoVar2) {
        return nnp.m17532a(this.f43954d, nnzVar, nnoVar, nnoVar2);
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: f */
    public final boolean mo17530f(nnz nnzVar, Object obj, Object obj2) {
        return nnp.m17532a(this.f43955e, nnzVar, obj, obj2);
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: g */
    public final boolean mo17531g(nnz nnzVar, nny nnyVar, nny nnyVar2) {
        return nnp.m17532a(this.f43953c, nnzVar, nnyVar, nnyVar2);
    }
}
