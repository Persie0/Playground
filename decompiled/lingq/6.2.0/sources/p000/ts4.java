package p000;

import androidx.compose.foundation.lazy.layout.C0134c;
import androidx.compose.foundation.lazy.layout.C0135d;
import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ts4 implements du4 {

    /* JADX INFO: renamed from: a */
    public final int f62798a;

    /* JADX INFO: renamed from: b */
    public final Object f62799b;

    /* JADX INFO: renamed from: c */
    public final int f62800c;

    /* JADX INFO: renamed from: d */
    public final LayoutDirection f62801d;

    /* JADX INFO: renamed from: e */
    public final int f62802e;

    /* JADX INFO: renamed from: f */
    public final int f62803f;

    /* JADX INFO: renamed from: g */
    public final List f62804g;

    /* JADX INFO: renamed from: h */
    public final long f62805h;

    /* JADX INFO: renamed from: i */
    public final Object f62806i;

    /* JADX INFO: renamed from: j */
    public final C0135d f62807j;

    /* JADX INFO: renamed from: k */
    public final long f62808k;

    /* JADX INFO: renamed from: l */
    public final int f62809l;

    /* JADX INFO: renamed from: m */
    public final int f62810m;

    /* JADX INFO: renamed from: n */
    public final int f62811n;

    /* JADX INFO: renamed from: o */
    public final int f62812o;

    /* JADX INFO: renamed from: p */
    public final int f62813p;

    /* JADX INFO: renamed from: q */
    public final int f62814q;

    /* JADX INFO: renamed from: r */
    public final int f62815r;

    /* JADX INFO: renamed from: s */
    public int f62816s = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: t */
    public int f62817t;

    /* JADX INFO: renamed from: u */
    public int f62818u;

    /* JADX INFO: renamed from: v */
    public final long f62819v;

    /* JADX INFO: renamed from: w */
    public long f62820w;

    /* JADX INFO: renamed from: x */
    public int f62821x;

    /* JADX INFO: renamed from: y */
    public int f62822y;

    /* JADX INFO: renamed from: z */
    public boolean f62823z;

    public ts4(int i, Object obj, int i2, int i3, LayoutDirection layoutDirection, int i4, int i5, List list, long j, Object obj2, C0135d c0135d, long j2, int i6, int i7) {
        this.f62798a = i;
        this.f62799b = obj;
        this.f62800c = i2;
        this.f62801d = layoutDirection;
        this.f62802e = i4;
        this.f62803f = i5;
        this.f62804g = list;
        this.f62805h = j;
        this.f62806i = obj2;
        this.f62807j = c0135d;
        this.f62808k = j2;
        this.f62809l = i6;
        this.f62810m = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iMax = Math.max(iMax, ((l87) list.get(i8)).f49302b);
        }
        this.f62811n = iMax;
        this.f62815r = i3;
        this.f62813p = iMax;
        int i9 = this.f62800c;
        this.f62812o = i9;
        this.f62814q = 0;
        this.f62819v = (((long) i9) << 32) | (((long) iMax) & 4294967295L);
        this.f62820w = 0L;
        this.f62821x = -1;
        this.f62822y = -1;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: a */
    public final int mo10667a() {
        return this.f62814q;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: b */
    public final int mo10668b() {
        return this.f62810m;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: c */
    public final int mo10669c() {
        return this.f62813p;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: d */
    public final long mo10670d() {
        return this.f62808k;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: e */
    public final List mo10671e() {
        return this.f62804g;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: f */
    public final int mo10672f() {
        return this.f62815r;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: g */
    public final long mo10673g(int i) {
        return this.f62820w;
    }

    @Override // p000.du4
    public final int getIndex() {
        return this.f62798a;
    }

    @Override // p000.du4
    public final Object getKey() {
        return this.f62799b;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: h */
    public final int mo10674h() {
        return this.f62809l;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: i */
    public final int mo10675i() {
        return this.f62812o;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: j */
    public final void mo10676j() {
        this.f62823z = true;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: k */
    public final void mo10677k(int i, int i2, int i3, int i4) {
        m22285n(i, i2, i3, i4, -1, -1);
    }

    /* JADX INFO: renamed from: l */
    public final int m22283l() {
        return this.f62813p + this.f62815r;
    }

    /* JADX INFO: renamed from: m */
    public final void m22284m(AbstractC0343j abstractC0343j, boolean z) {
        C0312a c0312a;
        if (this.f62816s == Integer.MIN_VALUE) {
            l54.m15814a("position() should be called first");
        }
        List list = this.f62804g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            l87 l87Var = (l87) list.get(i);
            int i2 = this.f62817t - l87Var.f49302b;
            int i3 = this.f62818u;
            long j = this.f62820w;
            C0134c c0134cM1009a = this.f62807j.m1009a(i, this.f62799b);
            if (c0134cM1009a != null) {
                if (z) {
                    c0134cM1009a.f2549n = j;
                } else {
                    long jM11595d = f84.m11595d(!f84.m11593b(c0134cM1009a.f2549n, 9223372034707292159L) ? c0134cM1009a.f2549n : j, ((f84) ((xc9) c0134cM1009a.f2553r).getValue()).f38612a);
                    int i4 = (int) (j & 4294967295L);
                    if ((i4 <= i2 && ((int) (jM11595d & 4294967295L)) <= i2) || (i4 >= i3 && ((int) (jM11595d & 4294967295L)) >= i3)) {
                        c0134cM1009a.m1000b();
                    }
                    j = jM11595d;
                }
                c0312a = c0134cM1009a.f2550o;
            } else {
                c0312a = null;
            }
            long jM11595d2 = f84.m11595d(j, this.f62805h);
            if (!z && c0134cM1009a != null) {
                c0134cM1009a.f2548m = jM11595d2;
            }
            if (c0312a != null) {
                abstractC0343j.getClass();
                AbstractC0343j.m1518b(abstractC0343j, l87Var);
                l87Var.mo1545j0(f84.m11595d(jM11595d2, l87Var.f49305e), 0.0f, c0312a);
            } else {
                AbstractC0343j.m1526q(abstractC0343j, l87Var, jM11595d2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m22285n(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f62816s = i4;
        if (this.f62801d == LayoutDirection.Rtl) {
            i2 = (i3 - i2) - this.f62800c;
        }
        this.f62820w = (((long) i2) << 32) | (((long) i) & 4294967295L);
        this.f62821x = i5;
        this.f62822y = i6;
        this.f62817t = -this.f62802e;
        this.f62818u = i4 + this.f62803f;
    }
}
