package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class jnc extends idd {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater f45885a;

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater f45886b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater f45887c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater f45888d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater f45889e;

    public jnc(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f45885a = atomicReferenceFieldUpdater;
        this.f45886b = atomicReferenceFieldUpdater2;
        this.f45887c = atomicReferenceFieldUpdater3;
        this.f45888d = atomicReferenceFieldUpdater4;
        this.f45889e = atomicReferenceFieldUpdater5;
    }

    @Override // p000.idd
    /* JADX INFO: renamed from: b */
    public final void mo13802b(yzc yzcVar, yzc yzcVar2) {
        this.f45886b.lazySet(yzcVar, yzcVar2);
    }

    @Override // p000.idd
    /* JADX INFO: renamed from: c */
    public final void mo13803c(yzc yzcVar, Thread thread) {
        this.f45885a.lazySet(yzcVar, thread);
    }

    @Override // p000.idd
    /* JADX INFO: renamed from: d */
    public final boolean mo13804d(m6d m6dVar, fec fecVar, fec fecVar2) {
        return wdd.m23855b(this.f45888d, m6dVar, fecVar, fecVar2);
    }

    @Override // p000.idd
    /* JADX INFO: renamed from: e */
    public final boolean mo13805e(m6d m6dVar, Object obj, Object obj2) {
        return wdd.m23855b(this.f45889e, m6dVar, obj, obj2);
    }

    @Override // p000.idd
    /* JADX INFO: renamed from: f */
    public final boolean mo13806f(m6d m6dVar, yzc yzcVar, yzc yzcVar2) {
        return wdd.m23855b(this.f45887c, m6dVar, yzcVar, yzcVar2);
    }
}
