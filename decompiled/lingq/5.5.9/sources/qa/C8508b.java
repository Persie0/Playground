package qa;

import java.util.Collections;
import java.util.List;
import p219ka.C6640a;
import p219ka.InterfaceC6646g;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: qa.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8508b implements InterfaceC6646g {

    /* JADX INFO: renamed from: a */
    public final C6640a[] f45777a;

    /* JADX INFO: renamed from: b */
    public final long[] f45778b;

    public C8508b(C6640a[] c6640aArr, long[] jArr) {
        this.f45777a = c6640aArr;
        this.f45778b = jArr;
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: a */
    public final int mo11452a(long j10) {
        long[] jArr = this.f45778b;
        int iM19035b = C10134c0.m19035b(jArr, j10, false);
        if (iM19035b < jArr.length) {
            return iM19035b;
        }
        return -1;
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: f */
    public final long mo11455f(int i10) {
        boolean z10 = true;
        C10129a.m18990b(i10 >= 0);
        long[] jArr = this.f45778b;
        if (i10 >= jArr.length) {
            z10 = false;
        }
        C10129a.m18990b(z10);
        return jArr[i10];
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: g */
    public final List<C6640a> mo11456g(long j10) {
        C6640a c6640a;
        int iM19039f = C10134c0.m19039f(this.f45778b, j10, false);
        return (iM19039f == -1 || (c6640a = this.f45777a[iM19039f]) == C6640a.f37635M) ? Collections.emptyList() : Collections.singletonList(c6640a);
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: i */
    public final int mo11457i() {
        return this.f45778b.length;
    }
}
