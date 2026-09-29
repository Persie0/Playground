package p000;

import androidx.compose.foundation.lazy.layout.C0134c;
import androidx.compose.foundation.lazy.layout.C0135d;
import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class iv4 implements du4 {

    /* JADX INFO: renamed from: a */
    public final int f44648a;

    /* JADX INFO: renamed from: b */
    public final List f44649b;

    /* JADX INFO: renamed from: c */
    public final boolean f44650c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3457pe f44651d;

    /* JADX INFO: renamed from: e */
    public final fc0 f44652e;

    /* JADX INFO: renamed from: f */
    public final LayoutDirection f44653f;

    /* JADX INFO: renamed from: g */
    public final int f44654g;

    /* JADX INFO: renamed from: h */
    public final int f44655h;

    /* JADX INFO: renamed from: i */
    public final int f44656i;

    /* JADX INFO: renamed from: j */
    public final long f44657j;

    /* JADX INFO: renamed from: k */
    public final Object f44658k;

    /* JADX INFO: renamed from: l */
    public final Object f44659l;

    /* JADX INFO: renamed from: m */
    public final C0135d f44660m;

    /* JADX INFO: renamed from: n */
    public final long f44661n;

    /* JADX INFO: renamed from: o */
    public int f44662o;

    /* JADX INFO: renamed from: p */
    public final int f44663p;

    /* JADX INFO: renamed from: q */
    public final int f44664q;

    /* JADX INFO: renamed from: r */
    public final int f44665r;

    /* JADX INFO: renamed from: s */
    public final int f44666s;

    /* JADX INFO: renamed from: t */
    public final int f44667t;

    /* JADX INFO: renamed from: u */
    public final int f44668u;

    /* JADX INFO: renamed from: v */
    public boolean f44669v;

    /* JADX INFO: renamed from: w */
    public int f44670w = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: x */
    public int f44671x;

    /* JADX INFO: renamed from: y */
    public int f44672y;

    /* JADX INFO: renamed from: z */
    public final int[] f44673z;

    public iv4(int i, List list, boolean z, InterfaceC3457pe interfaceC3457pe, fc0 fc0Var, LayoutDirection layoutDirection, int i2, int i3, int i4, long j, Object obj, Object obj2, C0135d c0135d, long j2) {
        this.f44648a = i;
        this.f44649b = list;
        this.f44650c = z;
        this.f44651d = interfaceC3457pe;
        this.f44652e = fc0Var;
        this.f44653f = layoutDirection;
        this.f44654g = i2;
        this.f44655h = i3;
        this.f44656i = i4;
        this.f44657j = j;
        this.f44658k = obj;
        this.f44659l = obj2;
        this.f44660m = c0135d;
        this.f44661n = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            l87 l87Var = (l87) list.get(i6);
            boolean z2 = this.f44650c;
            i5 += z2 ? l87Var.f49302b : l87Var.f49301a;
            iMax = Math.max(iMax, !z2 ? l87Var.f49302b : l87Var.f49301a);
        }
        this.f44663p = i5;
        this.f44668u = iMax;
        this.f44673z = new int[this.f44649b.size() * 2];
        if (this.f44650c) {
            this.f44667t = this.f44656i;
            this.f44665r = i5;
            this.f44664q = iMax;
            this.f44666s = 0;
            return;
        }
        this.f44667t = 0;
        this.f44665r = iMax;
        this.f44664q = i5;
        this.f44666s = this.f44656i;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: a */
    public final int mo10667a() {
        return this.f44666s;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: b */
    public final int mo10668b() {
        return 1;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: c */
    public final int mo10669c() {
        return this.f44665r;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: d */
    public final long mo10670d() {
        return this.f44661n;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: e */
    public final List mo10671e() {
        return this.f44649b;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: f */
    public final int mo10672f() {
        return this.f44667t;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: g */
    public final long mo10673g(int i) {
        if (i == 0 && this.f44649b.size() == 0) {
            int i2 = this.f44662o;
            return this.f44650c ? ((long) i2) & 4294967295L : ((long) i2) << 32;
        }
        int i3 = i * 2;
        int[] iArr = this.f44673z;
        return (((long) iArr[i3 + 1]) & 4294967295L) | (((long) iArr[i3]) << 32);
    }

    @Override // p000.du4
    public final int getIndex() {
        return this.f44648a;
    }

    @Override // p000.du4
    public final Object getKey() {
        return this.f44658k;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: h */
    public final int mo10674h() {
        return 0;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: i */
    public final int mo10675i() {
        return this.f44664q;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: j */
    public final void mo10676j() {
        this.f44669v = true;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: k */
    public final void mo10677k(int i, int i2, int i3, int i4) {
        m14160o(i, i3, i4);
    }

    /* JADX INFO: renamed from: l */
    public final int m14157l(long j) {
        return (int) (this.f44650c ? j & 4294967295L : j >> 32);
    }

    /* JADX INFO: renamed from: m */
    public final int m14158m() {
        int i;
        int i2;
        if (this.f44650c) {
            i = this.f44665r;
            i2 = this.f44667t;
        } else {
            i = this.f44664q;
            i2 = this.f44666s;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    /* JADX INFO: renamed from: n */
    public final void m14159n(AbstractC0343j abstractC0343j, boolean z) {
        C0312a c0312a;
        if (this.f44670w == Integer.MIN_VALUE) {
            l54.m15814a("position() should be called first");
        }
        List list = this.f44649b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            l87 l87Var = (l87) list.get(i);
            int i2 = this.f44671x;
            boolean z2 = this.f44650c;
            int i3 = i2 - (z2 ? l87Var.f49302b : l87Var.f49301a);
            int i4 = this.f44672y;
            long jMo10673g = mo10673g(i);
            C0134c c0134cM1009a = this.f44660m.m1009a(i, this.f44658k);
            if (c0134cM1009a != null) {
                if (z) {
                    c0134cM1009a.f2549n = jMo10673g;
                } else {
                    if (!f84.m11593b(c0134cM1009a.f2549n, 9223372034707292159L)) {
                        jMo10673g = c0134cM1009a.f2549n;
                    }
                    long jM11595d = f84.m11595d(jMo10673g, ((f84) ((xc9) c0134cM1009a.f2553r).getValue()).f38612a);
                    if ((m14157l(jMo10673g) <= i3 && m14157l(jM11595d) <= i3) || (m14157l(jMo10673g) >= i4 && m14157l(jM11595d) >= i4)) {
                        c0134cM1009a.m1000b();
                    }
                    jMo10673g = jM11595d;
                }
                c0312a = c0134cM1009a.f2550o;
            } else {
                c0312a = null;
            }
            long jM11595d2 = f84.m11595d(jMo10673g, this.f44657j);
            if (!z && c0134cM1009a != null) {
                c0134cM1009a.f2548m = jM11595d2;
            }
            if (z2) {
                if (c0312a != null) {
                    abstractC0343j.getClass();
                    AbstractC0343j.m1518b(abstractC0343j, l87Var);
                    l87Var.mo1545j0(f84.m11595d(jM11595d2, l87Var.f49305e), 0.0f, c0312a);
                } else {
                    AbstractC0343j.m1526q(abstractC0343j, l87Var, jM11595d2);
                }
            } else if (c0312a != null) {
                AbstractC0343j.m1524n(abstractC0343j, l87Var, jM11595d2, c0312a);
            } else {
                AbstractC0343j.m1523m(abstractC0343j, l87Var, jM11595d2);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m14160o(int i, int i2, int i3) {
        int i4;
        this.f44662o = i;
        boolean z = this.f44650c;
        this.f44670w = z ? i3 : i2;
        List list = this.f44649b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            l87 l87Var = (l87) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.f44673z;
            if (z) {
                InterfaceC3457pe interfaceC3457pe = this.f44651d;
                if (interfaceC3457pe == null) {
                    throw wq1.m24126v("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = interfaceC3457pe.mo4499a(l87Var.f49301a, i2, this.f44653f);
                iArr[i6 + 1] = i;
                i4 = l87Var.f49302b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                fc0 fc0Var = this.f44652e;
                if (fc0Var == null) {
                    throw wq1.m24126v("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = fc0Var.m11762a(l87Var.f49302b, i3);
                i4 = l87Var.f49301a;
            }
            i += i4;
        }
        this.f44671x = -this.f44654g;
        this.f44672y = this.f44670w + this.f44655h;
    }
}
