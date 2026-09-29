package p411u9;

import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: u9.n */
/* JADX INFO: loaded from: classes.dex */
public final class C9491n {

    /* JADX INFO: renamed from: a */
    public final C9488k f48762a;

    /* JADX INFO: renamed from: b */
    public final int f48763b;

    /* JADX INFO: renamed from: c */
    public final long[] f48764c;

    /* JADX INFO: renamed from: d */
    public final int[] f48765d;

    /* JADX INFO: renamed from: e */
    public final int f48766e;

    /* JADX INFO: renamed from: f */
    public final long[] f48767f;

    /* JADX INFO: renamed from: g */
    public final int[] f48768g;

    /* JADX INFO: renamed from: h */
    public final long f48769h;

    public C9491n(C9488k c9488k, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10 = false;
        C10129a.m18990b(iArr.length == jArr2.length);
        C10129a.m18990b(jArr.length == jArr2.length);
        C10129a.m18990b(iArr2.length == jArr2.length ? true : z10);
        this.f48762a = c9488k;
        this.f48764c = jArr;
        this.f48765d = iArr;
        this.f48766e = i10;
        this.f48767f = jArr2;
        this.f48768g = iArr2;
        this.f48769h = j10;
        this.f48763b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m17931a(long j10) {
        long[] jArr = this.f48767f;
        for (int iM19035b = C10134c0.m19035b(jArr, j10, true); iM19035b < jArr.length; iM19035b++) {
            if ((this.f48768g[iM19035b] & 1) != 0) {
                return iM19035b;
            }
        }
        return -1;
    }
}
