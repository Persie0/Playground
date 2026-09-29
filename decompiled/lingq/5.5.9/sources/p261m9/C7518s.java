package p261m9;

import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: m9.s */
/* JADX INFO: loaded from: classes.dex */
public final class C7518s implements InterfaceC7520u {

    /* JADX INFO: renamed from: a */
    public final long[] f41512a;

    /* JADX INFO: renamed from: b */
    public final long[] f41513b;

    /* JADX INFO: renamed from: c */
    public final long f41514c;

    /* JADX INFO: renamed from: d */
    public final boolean f41515d;

    public C7518s(long j10, long[] jArr, long[] jArr2) {
        C10129a.m18990b(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f41515d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f41512a = jArr;
            this.f41513b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f41512a = jArr3;
            long[] jArr4 = new long[i10];
            this.f41513b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f41514c = j10;
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: b */
    public final boolean mo14982b() {
        return this.f41515d;
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: h */
    public final InterfaceC7520u.a mo14983h(long j10) {
        if (!this.f41515d) {
            C7521v c7521v = C7521v.f41521c;
            return new InterfaceC7520u.a(c7521v, c7521v);
        }
        long[] jArr = this.f41513b;
        int iM19039f = C10134c0.m19039f(jArr, j10, true);
        long j11 = jArr[iM19039f];
        long[] jArr2 = this.f41512a;
        C7521v c7521v2 = new C7521v(j11, jArr2[iM19039f]);
        if (j11 == j10 || iM19039f == jArr.length - 1) {
            return new InterfaceC7520u.a(c7521v2, c7521v2);
        }
        int i10 = iM19039f + 1;
        return new InterfaceC7520u.a(c7521v2, new C7521v(jArr[i10], jArr2[i10]));
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: i */
    public final long mo14984i() {
        return this.f41514c;
    }
}
