package p000;

import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbe {

    /* JADX INFO: renamed from: a */
    private static final pbd f47321a = new pbd(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b */
    private static final int f47322b;

    /* JADX INFO: renamed from: c */
    private static final AtomicReference[] f47323c;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iHighestOneBit = Integer.highestOneBit((iAvailableProcessors + iAvailableProcessors) - 1);
        f47322b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f47323c = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: a */
    public static final pbd m19291a() {
        AtomicReference atomicReferenceM19293c = m19293c();
        pbd pbdVar = f47321a;
        pbd pbdVar2 = (pbd) atomicReferenceM19293c.getAndSet(pbdVar);
        if (pbdVar2 == pbdVar) {
            return new pbd();
        }
        if (pbdVar2 == null) {
            atomicReferenceM19293c.set(null);
            return new pbd();
        }
        atomicReferenceM19293c.set(pbdVar2.f47319f);
        pbdVar2.f47319f = null;
        pbdVar2.f47316c = 0;
        return pbdVar2;
    }

    /* JADX INFO: renamed from: c */
    private static final AtomicReference m19293c() {
        return f47323c[(int) (Thread.currentThread().getId() & (((long) f47322b) - 1))];
    }

    /* JADX INFO: renamed from: b */
    public static final void m19292b(pbd pbdVar) {
        if (pbdVar.f47319f != null || pbdVar.f47320g != null) {
            throw new IllegalArgumentException(BcwGDRhrTsnlj.vHliPxrNKa);
        }
        if (pbdVar.f47317d) {
            return;
        }
        AtomicReference atomicReferenceM19293c = m19293c();
        pbd pbdVar2 = f47321a;
        pbd pbdVar3 = (pbd) atomicReferenceM19293c.getAndSet(pbdVar2);
        if (pbdVar3 == pbdVar2) {
            return;
        }
        int i = pbdVar3 != null ? pbdVar3.f47316c : 0;
        if (i >= 65536) {
            atomicReferenceM19293c.set(pbdVar3);
            return;
        }
        pbdVar.f47319f = pbdVar3;
        pbdVar.f47315b = 0;
        pbdVar.f47316c = i + 8192;
        atomicReferenceM19293c.set(pbdVar);
    }
}
