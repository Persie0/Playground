package p470x1;

import ae.C0062b;
import p003a2.C0009a;
import p385sf.C9000b;

/* JADX INFO: renamed from: x1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10014b {
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public static final long m18611a(int i10, int i11, int i12, int i13) {
        boolean z10 = true;
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("maxWidth(" + i11 + ") must be >= than minWidth(" + i10 + ')').toString());
        }
        if (i13 >= i12) {
            if (i10 < 0 || i12 < 0) {
                z10 = false;
            }
            if (z10) {
                return C10013a.a.m18608b(i10, i11, i12, i13);
            }
            throw new IllegalArgumentException(C0009a.m20h("minWidth(", i10, ") and minHeight(", i12, ") must be >= 0").toString());
        }
        throw new IllegalArgumentException(("maxHeight(" + i13 + ") must be >= than minHeight(" + i12 + ')').toString());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m18612b(int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return m18611a(0, i10, 0, i11);
    }

    /* JADX INFO: renamed from: c */
    public static final long m18613c(long j10, long j11) {
        return C9000b.m17236a(C0062b.m361k0((int) (j11 >> 32), C10013a.m18605j(j10), C10013a.m18603h(j10)), C0062b.m361k0(C10022j.m18628b(j11), C10013a.m18604i(j10), C10013a.m18602g(j10)));
    }

    /* JADX INFO: renamed from: d */
    public static final long m18614d(long j10, long j11) {
        return m18611a(C0062b.m361k0(C10013a.m18605j(j11), C10013a.m18605j(j10), C10013a.m18603h(j10)), C0062b.m361k0(C10013a.m18603h(j11), C10013a.m18605j(j10), C10013a.m18603h(j10)), C0062b.m361k0(C10013a.m18604i(j11), C10013a.m18604i(j10), C10013a.m18602g(j10)), C0062b.m361k0(C10013a.m18602g(j11), C10013a.m18604i(j10), C10013a.m18602g(j10)));
    }

    /* JADX INFO: renamed from: e */
    public static final int m18615e(int i10, long j10) {
        return C0062b.m361k0(i10, C10013a.m18604i(j10), C10013a.m18602g(j10));
    }

    /* JADX INFO: renamed from: f */
    public static final int m18616f(int i10, long j10) {
        return C0062b.m361k0(i10, C10013a.m18605j(j10), C10013a.m18603h(j10));
    }

    /* JADX INFO: renamed from: g */
    public static final long m18617g(int i10, int i11, long j10) {
        int iM18605j = C10013a.m18605j(j10) + i10;
        int i12 = 0;
        if (iM18605j < 0) {
            iM18605j = 0;
        }
        int iM18603h = C10013a.m18603h(j10);
        if (iM18603h != Integer.MAX_VALUE && (iM18603h = iM18603h + i10) < 0) {
            iM18603h = 0;
        }
        int iM18604i = C10013a.m18604i(j10) + i11;
        if (iM18604i < 0) {
            iM18604i = 0;
        }
        int iM18602g = C10013a.m18602g(j10);
        if (iM18602g == Integer.MAX_VALUE || (iM18602g = iM18602g + i11) >= 0) {
            i12 = iM18602g;
        }
        return m18611a(iM18605j, iM18603h, iM18604i, i12);
    }
}
