package p000;

import java.util.List;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class bb1 implements ht5, oj8 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3735wu f8265a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3457pe f8266b;

    public bb1(InterfaceC3735wu interfaceC3735wu, InterfaceC3457pe interfaceC3457pe) {
        this.f8265a = interfaceC3735wu;
        this.f8266b = interfaceC3457pe;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: a */
    public final int mo737a(aa4 aa4Var, List list, int i) {
        int iMo916w0 = aa4Var.mo916w0(this.f8265a.m24157a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo916w0, i);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            ct5 ct5Var = (ct5) list.get(i2);
            float fM15227v = AbstractC3184kh.m15227v(AbstractC3184kh.m15225s(ct5Var));
            if (fM15227v == 0.0f) {
                int iMin2 = Math.min(ct5Var.mo1511c(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, ct5Var.mo1513p(iMin2));
            } else if (fM15227v > 0.0f) {
                f += fM15227v;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ct5 ct5Var2 = (ct5) list.get(i3);
            float fM15227v2 = AbstractC3184kh.m15227v(AbstractC3184kh.m15225s(ct5Var2));
            if (fM15227v2 > 0.0f) {
                iMax = Math.max(iMax, ct5Var2.mo1513p(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM15227v2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, long j) {
        return AbstractC3423or.m18234S(this, bk1.m3802j(j), bk1.m3803k(j), bk1.m3800h(j), bk1.m3801i(j), jt5Var.mo916w0(this.f8265a.m24157a()), jt5Var, list, new l87[list.size()], 0, list.size(), null, 0);
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: c */
    public final int mo739c(aa4 aa4Var, List list, int i) {
        int iMo916w0 = aa4Var.mo916w0(this.f8265a.m24157a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo916w0, i);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            ct5 ct5Var = (ct5) list.get(i2);
            float fM15227v = AbstractC3184kh.m15227v(AbstractC3184kh.m15225s(ct5Var));
            if (fM15227v == 0.0f) {
                int iMin2 = Math.min(ct5Var.mo1511c(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, ct5Var.mo1512l(iMin2));
            } else if (fM15227v > 0.0f) {
                f += fM15227v;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ct5 ct5Var2 = (ct5) list.get(i3);
            float fM15227v2 = AbstractC3184kh.m15227v(AbstractC3184kh.m15225s(ct5Var2));
            if (fM15227v2 > 0.0f) {
                iMax = Math.max(iMax, ct5Var2.mo1512l(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM15227v2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: d */
    public final int mo740d(aa4 aa4Var, List list, int i) {
        int iMo916w0 = aa4Var.mo916w0(this.f8265a.m24157a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            ct5 ct5Var = (ct5) list.get(i3);
            float fM15227v = AbstractC3184kh.m15227v(AbstractC3184kh.m15225s(ct5Var));
            int iMo1511c = ct5Var.mo1511c(i);
            if (fM15227v == 0.0f) {
                i2 += iMo1511c;
            } else if (fM15227v > 0.0f) {
                f += fM15227v;
                iMax = Math.max(iMax, Math.round(iMo1511c / fM15227v));
            }
        }
        return ((list.size() - 1) * iMo916w0) + Math.round(iMax * f) + i2;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: e */
    public final int mo741e(aa4 aa4Var, List list, int i) {
        int iMo916w0 = aa4Var.mo916w0(this.f8265a.m24157a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            ct5 ct5Var = (ct5) list.get(i3);
            float fM15227v = AbstractC3184kh.m15227v(AbstractC3184kh.m15225s(ct5Var));
            int iMo1510U = ct5Var.mo1510U(i);
            if (fM15227v == 0.0f) {
                i2 += iMo1510U;
            } else if (fM15227v > 0.0f) {
                f += fM15227v;
                iMax = Math.max(iMax, Math.round(iMo1510U / fM15227v));
            }
        }
        return ((list.size() - 1) * iMo916w0) + Math.round(iMax * f) + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb1)) {
            return false;
        }
        bb1 bb1Var = (bb1) obj;
        return this.f8265a.equals(bb1Var.f8265a) && fa4.m11650l(this.f8266b, bb1Var.f8266b);
    }

    @Override // p000.oj8
    /* JADX INFO: renamed from: f */
    public final void mo3550f(int i, int[] iArr, int[] iArr2, jt5 jt5Var) {
        this.f8265a.mo10843k(jt5Var, i, iArr, iArr2);
    }

    @Override // p000.oj8
    /* JADX INFO: renamed from: g */
    public final long mo3551g(int i, int i2, int i3, boolean z) {
        return !z ? dk1.m10423a(0, i3, i, i2) : AbstractC3423or.m18276r(0, i3, i, i2);
    }

    @Override // p000.oj8
    /* JADX INFO: renamed from: h */
    public final it5 mo3552h(l87[] l87VarArr, jt5 jt5Var, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return jt5Var.mo9895M0(i3, i2, AbstractC3194a.m15360M(), new rh0(l87VarArr, this, i3, i, jt5Var, iArr));
    }

    public final int hashCode() {
        return this.f8266b.hashCode() + (this.f8265a.hashCode() * 31);
    }

    @Override // p000.oj8
    /* JADX INFO: renamed from: i */
    public final int mo3553i(l87 l87Var) {
        return l87Var.f49301a;
    }

    @Override // p000.oj8
    /* JADX INFO: renamed from: j */
    public final int mo3554j(l87 l87Var) {
        return l87Var.f49302b;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f8265a + ", horizontalAlignment=" + this.f8266b + ')';
    }
}
