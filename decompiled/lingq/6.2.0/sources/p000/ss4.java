package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.C0134c;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ss4 implements it5 {

    /* JADX INFO: renamed from: a */
    public final us4 f61334a;

    /* JADX INFO: renamed from: b */
    public final int f61335b;

    /* JADX INFO: renamed from: c */
    public final boolean f61336c;

    /* JADX INFO: renamed from: d */
    public final float f61337d;

    /* JADX INFO: renamed from: e */
    public final it5 f61338e;

    /* JADX INFO: renamed from: f */
    public final float f61339f;

    /* JADX INFO: renamed from: g */
    public final boolean f61340g;

    /* JADX INFO: renamed from: h */
    public final un1 f61341h;

    /* JADX INFO: renamed from: i */
    public final fb2 f61342i;

    /* JADX INFO: renamed from: j */
    public final int f61343j;

    /* JADX INFO: renamed from: k */
    public final vi3 f61344k;

    /* JADX INFO: renamed from: l */
    public final vi3 f61345l;

    /* JADX INFO: renamed from: m */
    public final List f61346m;

    /* JADX INFO: renamed from: n */
    public final int f61347n;

    /* JADX INFO: renamed from: o */
    public final int f61348o;

    /* JADX INFO: renamed from: p */
    public final int f61349p;

    /* JADX INFO: renamed from: q */
    public final Orientation f61350q;

    /* JADX INFO: renamed from: r */
    public final int f61351r;

    /* JADX INFO: renamed from: s */
    public final int f61352s;

    public ss4(us4 us4Var, int i, boolean z, float f, it5 it5Var, float f2, boolean z2, un1 un1Var, fb2 fb2Var, int i2, vi3 vi3Var, vi3 vi3Var2, List list, int i3, int i4, int i5, Orientation orientation, int i6, int i7) {
        this.f61334a = us4Var;
        this.f61335b = i;
        this.f61336c = z;
        this.f61337d = f;
        this.f61338e = it5Var;
        this.f61339f = f2;
        this.f61340g = z2;
        this.f61341h = un1Var;
        this.f61342i = fb2Var;
        this.f61343j = i2;
        this.f61344k = vi3Var;
        this.f61345l = vi3Var2;
        this.f61346m = list;
        this.f61347n = i3;
        this.f61348o = i4;
        this.f61349p = i5;
        this.f61350q = orientation;
        this.f61351r = i6;
        this.f61352s = i7;
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: a */
    public final int mo10623a() {
        return this.f61338e.mo10623a();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: b */
    public final Map mo10624b() {
        return this.f61338e.mo10624b();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: c */
    public final void mo10625c() {
        this.f61338e.mo10625c();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: d */
    public final int mo10626d() {
        return this.f61338e.mo10626d();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: e */
    public final vi3 mo10691e() {
        return this.f61338e.mo10691e();
    }

    /* JADX INFO: renamed from: f */
    public final ss4 m21674f(int i, boolean z) {
        us4 us4Var;
        if (this.f61340g) {
            return null;
        }
        List list = this.f61346m;
        if (list.isEmpty() || (us4Var = this.f61334a) == null) {
            return null;
        }
        int i2 = us4Var.f64293g;
        int i3 = this.f61335b - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        ts4 ts4Var = (ts4) u91.m22589G0(list);
        ts4 ts4Var2 = (ts4) u91.m22597O0(list);
        if (ts4Var.f62823z || ts4Var2.f62823z) {
            return null;
        }
        int i4 = this.f61348o;
        int i5 = this.f61347n;
        Orientation orientation = this.f61350q;
        if (i < 0) {
            if (Math.min((ts4Var.m22283l() + r46.m20363F(ts4Var, orientation)) - i5, (ts4Var2.m22283l() + r46.m20363F(ts4Var2, orientation)) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - r46.m20363F(ts4Var, orientation), i4 - r46.m20363F(ts4Var2, orientation)) <= i) {
            return null;
        }
        int size = list.size();
        int i6 = 0;
        while (i6 < size) {
            ts4 ts4Var3 = (ts4) list.get(i6);
            ts4Var3.getClass();
            if (!ts4Var3.f62823z) {
                long j = ts4Var3.f62820w;
                ts4Var3.f62820w = (((long) (((int) (j & 4294967295L)) + i)) & 4294967295L) | (((long) ((int) (j >> 32))) << 32);
                if (z) {
                    int size2 = ts4Var3.f62804g.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        C0134c c0134cM1009a = ts4Var3.f62807j.m1009a(i7, ts4Var3.f62799b);
                        if (c0134cM1009a != null) {
                            long j2 = c0134cM1009a.f2547l;
                            c0134cM1009a.f2547l = (((long) (((int) (j2 & 4294967295L)) + i)) & 4294967295L) | (((long) ((int) (j2 >> 32))) << 32);
                        }
                        i7++;
                        i3 = i3;
                    }
                }
            }
            i6++;
            i3 = i3;
        }
        return new ss4(this.f61334a, i3, this.f61336c || i > 0, i, this.f61338e, this.f61339f, this.f61340g, this.f61341h, this.f61342i, this.f61343j, this.f61344k, this.f61345l, list, this.f61347n, this.f61348o, this.f61349p, this.f61350q, this.f61351r, this.f61352s);
    }

    /* JADX INFO: renamed from: g */
    public final long m21675g() {
        it5 it5Var = this.f61338e;
        return (((long) it5Var.mo10626d()) << 32) | (((long) it5Var.mo10623a()) & 4294967295L);
    }
}
