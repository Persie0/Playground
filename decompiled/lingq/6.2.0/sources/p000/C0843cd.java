package p000;

import com.google.common.util.concurrent.C1114d;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: cd */
/* JADX INFO: loaded from: classes2.dex */
public final class C0843cd extends o2d {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater f9900a;

    /* JADX INFO: renamed from: b */
    public final AtomicIntegerFieldUpdater f9901b;

    public C0843cd(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f9900a = atomicReferenceFieldUpdater;
        this.f9901b = atomicIntegerFieldUpdater;
    }

    @Override // p000.o2d
    /* JADX INFO: renamed from: b */
    public final void mo4534b(C1114d c1114d, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f9900a;
            if (atomicReferenceFieldUpdater.compareAndSet(c1114d, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(c1114d) == null);
    }

    @Override // p000.o2d
    /* JADX INFO: renamed from: c */
    public final int mo4535c(C1114d c1114d) {
        return this.f9901b.decrementAndGet(c1114d);
    }
}
