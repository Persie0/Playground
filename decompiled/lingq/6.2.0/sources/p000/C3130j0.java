package p000;

import com.google.common.util.concurrent.AbstractC1112b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: j0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3130j0 extends vz1 {

    /* JADX INFO: renamed from: l */
    public final AtomicReferenceFieldUpdater f44821l;

    /* JADX INFO: renamed from: m */
    public final AtomicReferenceFieldUpdater f44822m;

    /* JADX INFO: renamed from: n */
    public final AtomicReferenceFieldUpdater f44823n;

    /* JADX INFO: renamed from: o */
    public final AtomicReferenceFieldUpdater f44824o;

    /* JADX INFO: renamed from: p */
    public final AtomicReferenceFieldUpdater f44825p;

    public C3130j0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f44821l = atomicReferenceFieldUpdater;
        this.f44822m = atomicReferenceFieldUpdater2;
        this.f44823n = atomicReferenceFieldUpdater3;
        this.f44824o = atomicReferenceFieldUpdater4;
        this.f44825p = atomicReferenceFieldUpdater5;
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: E */
    public final C3095i0 mo14229E(AbstractC1112b abstractC1112b) {
        return (C3095i0) this.f44824o.getAndSet(abstractC1112b, C3095i0.f43266d);
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: F */
    public final C3594t0 mo14230F(AbstractC1112b abstractC1112b) {
        return (C3594t0) this.f44823n.getAndSet(abstractC1112b, C3594t0.f61684c);
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: S */
    public final void mo14231S(C3594t0 c3594t0, C3594t0 c3594t1) {
        this.f44822m.lazySet(c3594t0, c3594t1);
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: U */
    public final void mo14232U(C3594t0 c3594t0, Thread thread) {
        this.f44821l.lazySet(c3594t0, thread);
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: k */
    public final boolean mo14233k(AbstractC1112b abstractC1112b, C3095i0 c3095i0, C3095i0 c3095i1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f44824o;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1112b, c3095i0, c3095i1)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1112b) == c3095i0);
        return false;
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: l */
    public final boolean mo14234l(AbstractC1112b abstractC1112b, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f44825p;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1112b, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1112b) == obj);
        return false;
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: m */
    public final boolean mo14235m(AbstractC1112b abstractC1112b, C3594t0 c3594t0, C3594t0 c3594t1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f44823n;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1112b, c3594t0, c3594t1)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1112b) == c3594t0);
        return false;
    }
}
