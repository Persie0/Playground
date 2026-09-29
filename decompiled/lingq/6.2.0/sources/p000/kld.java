package p000;

import com.google.common.util.concurrent.AbstractC1112b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class kld extends AbstractC1112b {

    /* JADX INFO: renamed from: h */
    public a34 f47502h;

    /* JADX INFO: renamed from: i */
    public final int f47503i;

    public kld(a34 a34Var, int i) {
        this.f47502h = a34Var;
        this.f47503i = i;
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b
    /* JADX INFO: renamed from: d */
    public final void mo42d() {
        AtomicLong atomicLong;
        long j;
        int i;
        int i2;
        boolean z;
        a34 a34Var = this.f47502h;
        this.f47502h = null;
        if (a34Var == null) {
            return;
        }
        AtomicReference atomicReference = (AtomicReference) a34Var.f175c;
        do {
            atomicLong = (AtomicLong) a34Var.f174b;
            j = atomicLong.get();
            i = (int) j;
            long j2 = j >>> 32;
            if (i == Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 13);
                sb.append("Refcount is: ");
                sb.append(j);
                throw new AssertionError(sb.toString());
            }
            i2 = (int) j2;
            z = i == -2147483647;
            if (z) {
                i2++;
            }
        } while (!atomicLong.compareAndSet(j, (((long) i2) << 32) | (4294967295L & ((long) (i - 1)))));
        if (z) {
            while (true) {
                lld lldVar = (lld) atomicReference.get();
                if (lldVar != null) {
                    if (lldVar.f49810h <= this.f47503i) {
                        lldVar.cancel(true);
                        while (!atomicReference.compareAndSet(lldVar, null)) {
                            if (atomicReference.get() != lldVar) {
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b
    /* JADX INFO: renamed from: k */
    public final String mo43k() {
        InterfaceC3016fw interfaceC3016fw;
        a34 a34Var = this.f47502h;
        if (a34Var == null || (interfaceC3016fw = (InterfaceC3016fw) ((kj3) a34Var.f173a).f47375b) == null) {
            return null;
        }
        String string = interfaceC3016fw.toString();
        String strM17739n = AbstractC3393o1.m17739n(new StringBuilder(string.length() + 11), "callable=[", string, "]");
        lld lldVar = (lld) ((AtomicReference) this.f47502h.f175c).get();
        if (lldVar == null) {
            return strM17739n;
        }
        int length = strM17739n.length();
        String string2 = lldVar.toString();
        return wq1.m24125u(new StringBuilder(string2.length() + length + 9 + 1), strM17739n, ", trial=[", string2, "]");
    }
}
