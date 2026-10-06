package p000;

import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class mnw extends nnz {

    /* JADX INFO: renamed from: a */
    private mny f41142a;

    /* JADX INFO: renamed from: b */
    private final int f41143b;

    public mnw(mny mnyVar, int i) {
        this.f41142a = mnyVar;
        this.f41143b = i;
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: bQ */
    protected final String mo14892bQ() {
        Object obj;
        mny mnyVar = this.f41142a;
        if (mnyVar == null || (obj = mnyVar.f41148d.f44024a) == null) {
            return null;
        }
        String str = VzWFSVj.reUiFVBKpKPZIjA + obj.toString() + "]";
        mnx mnxVar = (mnx) this.f41142a.f41146b.get();
        if (mnxVar == null) {
            return str;
        }
        return str + ", trial=[" + mnxVar.toString() + "]";
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: c */
    protected final void mo14893c() {
        long j;
        int i;
        int iM16666a;
        boolean z;
        mny mnyVar = this.f41142a;
        this.f41142a = null;
        if (mnyVar == null) {
            return;
        }
        do {
            j = mnyVar.f41145a.get();
            i = (int) j;
            iM16666a = mny.m16666a(j);
            if (i == Integer.MIN_VALUE) {
                throw new AssertionError("Refcount is: " + j);
            }
            z = i == -2147483647;
            if (z) {
                iM16666a++;
            }
        } while (!mnyVar.f41145a.compareAndSet(j, mny.m16667b(iM16666a, i - 1)));
        if (z) {
            while (true) {
                mnx mnxVar = (mnx) mnyVar.f41146b.get();
                if (mnxVar == null || mnxVar.f41144a > this.f41143b) {
                    return;
                }
                mnxVar.cancel(true);
                AtomicReference atomicReference = mnyVar.f41146b;
                while (!atomicReference.compareAndSet(mnxVar, null)) {
                    if (atomicReference.get() != mnxVar) {
                    }
                }
                return;
            }
        }
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: f */
    protected final boolean mo16665f(nps npsVar) {
        return super.mo16665f(npsVar);
    }
}
