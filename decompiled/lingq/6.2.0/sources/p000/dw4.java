package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.C0134c;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dw4 implements it5 {

    /* JADX INFO: renamed from: a */
    public final int[] f36295a;

    /* JADX INFO: renamed from: b */
    public final int[] f36296b;

    /* JADX INFO: renamed from: c */
    public final float f36297c;

    /* JADX INFO: renamed from: d */
    public final it5 f36298d;

    /* JADX INFO: renamed from: e */
    public final float f36299e;

    /* JADX INFO: renamed from: f */
    public final boolean f36300f;

    /* JADX INFO: renamed from: g */
    public final boolean f36301g;

    /* JADX INFO: renamed from: h */
    public final boolean f36302h;

    /* JADX INFO: renamed from: i */
    public final xs4 f36303i;

    /* JADX INFO: renamed from: j */
    public final cc4 f36304j;

    /* JADX INFO: renamed from: k */
    public final fb2 f36305k;

    /* JADX INFO: renamed from: l */
    public final int f36306l;

    /* JADX INFO: renamed from: m */
    public final List f36307m;

    /* JADX INFO: renamed from: n */
    public final long f36308n;

    /* JADX INFO: renamed from: o */
    public final int f36309o;

    /* JADX INFO: renamed from: p */
    public final int f36310p;

    /* JADX INFO: renamed from: q */
    public final int f36311q;

    /* JADX INFO: renamed from: r */
    public final int f36312r;

    /* JADX INFO: renamed from: s */
    public final int f36313s;

    /* JADX INFO: renamed from: t */
    public final un1 f36314t;

    /* JADX INFO: renamed from: u */
    public final Orientation f36315u;

    public dw4(int[] iArr, int[] iArr2, float f, it5 it5Var, float f2, boolean z, boolean z2, boolean z3, xs4 xs4Var, cc4 cc4Var, fb2 fb2Var, int i, List list, long j, int i2, int i3, int i4, int i5, int i6, un1 un1Var) {
        this.f36295a = iArr;
        this.f36296b = iArr2;
        this.f36297c = f;
        this.f36298d = it5Var;
        this.f36299e = f2;
        this.f36300f = z;
        this.f36301g = z2;
        this.f36302h = z3;
        this.f36303i = xs4Var;
        this.f36304j = cc4Var;
        this.f36305k = fb2Var;
        this.f36306l = i;
        this.f36307m = list;
        this.f36308n = j;
        this.f36309o = i2;
        this.f36310p = i3;
        this.f36311q = i4;
        this.f36312r = i5;
        this.f36313s = i6;
        this.f36314t = un1Var;
        this.f36315u = z2 ? Orientation.Vertical : Orientation.Horizontal;
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: a */
    public final int mo10623a() {
        return this.f36298d.mo10623a();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: b */
    public final Map mo10624b() {
        return this.f36298d.mo10624b();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: c */
    public final void mo10625c() {
        this.f36298d.mo10625c();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: d */
    public final int mo10626d() {
        return this.f36298d.mo10626d();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: e */
    public final vi3 mo10691e() {
        return this.f36298d.mo10691e();
    }

    /* JADX INFO: renamed from: f */
    public final dw4 m10692f(int i, boolean z) {
        if (this.f36302h) {
            return null;
        }
        List list = this.f36307m;
        if (list.isEmpty()) {
            return null;
        }
        int[] iArr = this.f36295a;
        if (iArr.length == 0) {
            return null;
        }
        int[] iArr2 = this.f36296b;
        if (iArr2.length == 0) {
            return null;
        }
        int i2 = this.f36312r;
        int i3 = this.f36310p;
        int i4 = i3 - i2;
        List list2 = list;
        int size = list2.size();
        for (int i5 = 0; i5 < size; i5++) {
            fw4 fw4Var = (fw4) list.get(i5);
            if (fw4Var.f39805u) {
                return null;
            }
            if ((fw4Var.m12234m() <= 0) != (fw4Var.m12234m() + i <= 0)) {
                return null;
            }
            int iM12234m = fw4Var.m12234m();
            int i6 = this.f36309o;
            if (iM12234m <= i6) {
                if (i < 0) {
                    if ((fw4Var.m12235n() + fw4Var.m12234m()) - i6 <= (-i)) {
                        return null;
                    }
                } else if (i6 - fw4Var.m12234m() <= i) {
                    return null;
                }
            }
            if (fw4Var.m12235n() + fw4Var.m12234m() >= i4) {
                if (i < 0) {
                    if ((fw4Var.m12235n() + fw4Var.m12234m()) - i3 <= (-i)) {
                        return null;
                    }
                } else if (i3 - fw4Var.m12234m() <= i) {
                    return null;
                }
            }
        }
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            fw4 fw4Var2 = (fw4) list.get(i7);
            boolean z2 = fw4Var2.f39788d;
            if (!fw4Var2.f39805u) {
                long j = fw4Var2.f39807w;
                fw4Var2.f39807w = (((long) (z2 ? ((int) (j & 4294967295L)) + i : (int) (j & 4294967295L))) & 4294967295L) | (((long) (z2 ? (int) (j >> 32) : ((int) (j >> 32)) + i)) << 32);
                if (z) {
                    int size3 = fw4Var2.f39787c.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        C0134c c0134cM1009a = fw4Var2.f39794j.m1009a(i8, fw4Var2.f39786b);
                        if (c0134cM1009a != null) {
                            long j2 = c0134cM1009a.f2547l;
                            c0134cM1009a.f2547l = (((long) (z2 ? ((int) (j2 & 4294967295L)) + i : (int) (j2 & 4294967295L))) & 4294967295L) | (((long) (z2 ? (int) (j2 >> 32) : ((int) (j2 >> 32)) + i)) << 32);
                        }
                    }
                }
            }
        }
        int length = iArr2.length;
        int[] iArr3 = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            iArr3[i9] = iArr2[i9] - i;
        }
        return new dw4(iArr, iArr3, i, this.f36298d, this.f36299e, this.f36300f || i > 0, this.f36301g, this.f36302h, this.f36303i, this.f36304j, this.f36305k, this.f36306l, list, this.f36308n, this.f36309o, this.f36310p, this.f36311q, this.f36312r, this.f36313s, this.f36314t);
    }
}
