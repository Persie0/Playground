package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class cu8 {

    /* JADX INFO: renamed from: a */
    public static final zt8 f34551a = new zt8(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b */
    public static final int f34552b;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference[] f34553c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f34552b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f34553c = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: a */
    public static final void m9897a(zt8 zt8Var) {
        zt8Var.getClass();
        if (zt8Var.f72158f != null || zt8Var.f72159g != null) {
            C3386nv.m17626m("Failed requirement.");
            return;
        }
        if (zt8Var.f72156d) {
            return;
        }
        AtomicReference atomicReference = f34553c[(int) (Thread.currentThread().getId() & (((long) f34552b) - 1))];
        zt8 zt8Var2 = f34551a;
        zt8 zt8Var3 = (zt8) atomicReference.getAndSet(zt8Var2);
        if (zt8Var3 == zt8Var2) {
            return;
        }
        int i = zt8Var3 != null ? zt8Var3.f72155c : 0;
        if (i >= 65536) {
            atomicReference.set(zt8Var3);
            return;
        }
        zt8Var.f72158f = zt8Var3;
        zt8Var.f72154b = 0;
        zt8Var.f72155c = i + 8192;
        atomicReference.set(zt8Var);
    }

    /* JADX INFO: renamed from: b */
    public static final zt8 m9898b() {
        AtomicReference atomicReference = f34553c[(int) (Thread.currentThread().getId() & (((long) f34552b) - 1))];
        zt8 zt8Var = f34551a;
        zt8 zt8Var2 = (zt8) atomicReference.getAndSet(zt8Var);
        if (zt8Var2 == zt8Var) {
            return new zt8();
        }
        if (zt8Var2 == null) {
            atomicReference.set(null);
            return new zt8();
        }
        atomicReference.set(zt8Var2.f72158f);
        zt8Var2.f72158f = null;
        zt8Var2.f72155c = 0;
        return zt8Var2;
    }
}
