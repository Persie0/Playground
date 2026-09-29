package p000;

import androidx.compose.runtime.snapshots.C0285a;

/* JADX INFO: loaded from: classes.dex */
public final class xn3 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68392a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f68393b;

    public /* synthetic */ xn3(vi3 vi3Var, int i) {
        this.f68392a = i;
        this.f68393b = vi3Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        long j;
        switch (this.f68392a) {
            case 0:
                C0285a c0285a = (C0285a) obj;
                synchronized (nc9.f52602c) {
                    j = nc9.f52604e;
                    nc9.f52604e = 1 + j;
                }
                return new b18(j, c0285a, this.f68393b);
            default:
                return this.f68393b.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
