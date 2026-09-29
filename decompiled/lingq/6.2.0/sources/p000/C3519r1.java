package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: r1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3519r1 extends zyc {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater f58473a;

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater f58474b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater f58475c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater f58476d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater f58477e;

    public C3519r1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f58473a = atomicReferenceFieldUpdater;
        this.f58474b = atomicReferenceFieldUpdater2;
        this.f58475c = atomicReferenceFieldUpdater3;
        this.f58476d = atomicReferenceFieldUpdater4;
        this.f58477e = atomicReferenceFieldUpdater5;
    }

    @Override // p000.zyc
    /* JADX INFO: renamed from: f */
    public final boolean mo20237f(AbstractC3632u1 abstractC3632u1, C3481q1 c3481q1, C3481q1 c3481q2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f58476d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC3632u1, c3481q1, c3481q2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC3632u1) == c3481q1);
        return false;
    }

    @Override // p000.zyc
    /* JADX INFO: renamed from: g */
    public final boolean mo20238g(AbstractC3632u1 abstractC3632u1, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f58477e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC3632u1, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC3632u1) == obj);
        return false;
    }

    @Override // p000.zyc
    /* JADX INFO: renamed from: h */
    public final boolean mo20239h(AbstractC3632u1 abstractC3632u1, C3595t1 c3595t1, C3595t1 c3595t2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f58475c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC3632u1, c3595t1, c3595t2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC3632u1) == c3595t1);
        return false;
    }

    @Override // p000.zyc
    /* JADX INFO: renamed from: i */
    public final void mo20240i(C3595t1 c3595t1, C3595t1 c3595t2) {
        this.f58474b.lazySet(c3595t1, c3595t2);
    }

    @Override // p000.zyc
    /* JADX INFO: renamed from: j */
    public final void mo20241j(C3595t1 c3595t1, Thread thread) {
        this.f58473a.lazySet(c3595t1, thread);
    }
}
