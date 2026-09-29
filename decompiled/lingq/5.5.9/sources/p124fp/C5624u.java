package p124fp;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: fp.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C5624u {

    /* JADX INFO: renamed from: a */
    public static final C5623t f34470a = new C5623t(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b */
    public static final int f34471b;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference<C5623t>[] f34472c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f34471b = iHighestOneBit;
        AtomicReference<C5623t>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f34472c = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: a */
    public static final void m12006a(C5623t c5623t) {
        boolean z10 = true;
        if (!(c5623t.f34468f == null && c5623t.f34469g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (c5623t.f34466d) {
            return;
        }
        AtomicReference<C5623t> atomicReference = f34472c[(int) (Thread.currentThread().getId() & (((long) f34471b) - 1))];
        C5623t c5623t2 = atomicReference.get();
        if (c5623t2 == f34470a) {
            return;
        }
        int i10 = c5623t2 != null ? c5623t2.f34465c : 0;
        if (i10 >= 65536) {
            return;
        }
        c5623t.f34468f = c5623t2;
        c5623t.f34464b = 0;
        c5623t.f34465c = i10 + 8192;
        while (!atomicReference.compareAndSet(c5623t2, c5623t)) {
            if (atomicReference.get() != c5623t2) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return;
        }
        c5623t.f34468f = null;
    }

    /* JADX INFO: renamed from: b */
    public static final C5623t m12007b() {
        AtomicReference<C5623t> atomicReference = f34472c[(int) (Thread.currentThread().getId() & (((long) f34471b) - 1))];
        C5623t c5623t = f34470a;
        C5623t andSet = atomicReference.getAndSet(c5623t);
        if (andSet == c5623t) {
            return new C5623t();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new C5623t();
        }
        atomicReference.set(andSet.f34468f);
        andSet.f34468f = null;
        andSet.f34465c = 0;
        return andSet;
    }
}
