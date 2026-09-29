package p000;

import androidx.compose.runtime.internal.AtomicInt;

/* JADX INFO: loaded from: classes.dex */
public abstract class qh9 implements ph9 {

    /* JADX INFO: renamed from: a */
    public final AtomicInt f57795a = new AtomicInt(0);

    /* JADX INFO: renamed from: c */
    public final boolean m19973c(int i) {
        return (this.f57795a.get() & i) != 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m19974e(int i) {
        AtomicInt atomicInt;
        int i2;
        do {
            atomicInt = this.f57795a;
            i2 = atomicInt.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!atomicInt.compareAndSet(i2, i2 | i));
    }
}
