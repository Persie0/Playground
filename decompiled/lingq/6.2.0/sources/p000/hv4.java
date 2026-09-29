package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.C0134c;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hv4 implements it5 {

    /* JADX INFO: renamed from: a */
    public final iv4 f42975a;

    /* JADX INFO: renamed from: b */
    public final int f42976b;

    /* JADX INFO: renamed from: c */
    public final boolean f42977c;

    /* JADX INFO: renamed from: d */
    public final float f42978d;

    /* JADX INFO: renamed from: e */
    public final it5 f42979e;

    /* JADX INFO: renamed from: f */
    public final float f42980f;

    /* JADX INFO: renamed from: g */
    public final boolean f42981g;

    /* JADX INFO: renamed from: h */
    public final un1 f42982h;

    /* JADX INFO: renamed from: i */
    public final fb2 f42983i;

    /* JADX INFO: renamed from: j */
    public final long f42984j;

    /* JADX INFO: renamed from: k */
    public final List f42985k;

    /* JADX INFO: renamed from: l */
    public final int f42986l;

    /* JADX INFO: renamed from: m */
    public final int f42987m;

    /* JADX INFO: renamed from: n */
    public final int f42988n;

    /* JADX INFO: renamed from: o */
    public final Orientation f42989o;

    /* JADX INFO: renamed from: p */
    public final int f42990p;

    /* JADX INFO: renamed from: q */
    public final int f42991q;

    public hv4(iv4 iv4Var, int i, boolean z, float f, it5 it5Var, float f2, boolean z2, un1 un1Var, fb2 fb2Var, long j, List list, int i2, int i3, int i4, Orientation orientation, int i5, int i6) {
        this.f42975a = iv4Var;
        this.f42976b = i;
        this.f42977c = z;
        this.f42978d = f;
        this.f42979e = it5Var;
        this.f42980f = f2;
        this.f42981g = z2;
        this.f42982h = un1Var;
        this.f42983i = fb2Var;
        this.f42984j = j;
        this.f42985k = list;
        this.f42986l = i2;
        this.f42987m = i3;
        this.f42988n = i4;
        this.f42989o = orientation;
        this.f42990p = i5;
        this.f42991q = i6;
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: a */
    public final int mo10623a() {
        return this.f42979e.mo10623a();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: b */
    public final Map mo10624b() {
        return this.f42979e.mo10624b();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: c */
    public final void mo10625c() {
        this.f42979e.mo10625c();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: d */
    public final int mo10626d() {
        return this.f42979e.mo10626d();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: e */
    public final vi3 mo10691e() {
        return this.f42979e.mo10691e();
    }

    /* JADX INFO: renamed from: f */
    public final hv4 m13485f(int i, boolean z) {
        iv4 iv4Var;
        int i2;
        int i3;
        if (this.f42981g) {
            return null;
        }
        List list = this.f42985k;
        if (list.isEmpty() || (iv4Var = this.f42975a) == null) {
            return null;
        }
        int iM14158m = iv4Var.m14158m();
        int i4 = this.f42976b - i;
        if (i4 < 0 || i4 >= iM14158m) {
            return null;
        }
        iv4 iv4Var2 = (iv4) u91.m22589G0(list);
        iv4 iv4Var3 = (iv4) u91.m22597O0(list);
        if (iv4Var2.f44669v || iv4Var3.f44669v) {
            return null;
        }
        int i5 = iv4Var2.f44662o;
        int i6 = this.f42987m;
        int i7 = this.f42986l;
        if (i < 0) {
            if (Math.min((iv4Var2.m14158m() + i5) - i7, (iv4Var3.m14158m() + iv4Var3.f44662o) - i6) <= (-i)) {
                return null;
            }
        } else if (Math.min(i7 - i5, i6 - iv4Var3.f44662o) <= i) {
            return null;
        }
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            iv4 iv4Var4 = (iv4) list.get(i8);
            boolean z2 = iv4Var4.f44650c;
            int[] iArr = iv4Var4.f44673z;
            if (!iv4Var4.f44669v) {
                iv4Var4.f44662o += i;
                int length = iArr.length;
                for (int i9 = 0; i9 < length; i9++) {
                    int i10 = i9 & 1;
                    if ((z2 && i10 != 0) || (!z2 && i10 == 0)) {
                        iArr[i9] = iArr[i9] + i;
                    }
                }
                if (z) {
                    int size2 = iv4Var4.f44649b.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        C0134c c0134cM1009a = iv4Var4.f44660m.m1009a(i11, iv4Var4.f44658k);
                        if (c0134cM1009a != null) {
                            long j = c0134cM1009a.f2547l;
                            if (z2) {
                                i2 = (int) (j >> 32);
                                i3 = ((int) (j & 4294967295L)) + i;
                            } else {
                                i2 = ((int) (j >> 32)) + i;
                                i3 = (int) (j & 4294967295L);
                            }
                            c0134cM1009a.f2547l = (((long) i3) & 4294967295L) | (((long) i2) << 32);
                        } else {
                            i8 = i8;
                        }
                        i11++;
                        i8 = i8;
                    }
                }
            }
            i8++;
        }
        return new hv4(this.f42975a, i4, this.f42977c || i > 0, i, this.f42979e, this.f42980f, this.f42981g, this.f42982h, this.f42983i, this.f42984j, list, this.f42986l, this.f42987m, this.f42988n, this.f42989o, this.f42990p, this.f42991q);
    }

    /* JADX INFO: renamed from: g */
    public final long m13486g() {
        it5 it5Var = this.f42979e;
        return (((long) it5Var.mo10626d()) << 32) | (((long) it5Var.mo10623a()) & 4294967295L);
    }
}
