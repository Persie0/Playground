package p000;

import java.util.List;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class sj8 implements ht5, oj8 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3624tu f60939a;

    /* JADX INFO: renamed from: b */
    public final fc0 f60940b;

    public sj8(InterfaceC3624tu interfaceC3624tu, fc0 fc0Var) {
        this.f60939a = interfaceC3624tu;
        this.f60940b = fc0Var;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: a */
    public final int mo737a(aa4 aa4Var, List list, int i) {
        int iMo916w0 = aa4Var.mo916w0(this.f60939a.mo9967a());
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
            int iMo1513p = ct5Var.mo1513p(i);
            if (fM15227v == 0.0f) {
                i2 += iMo1513p;
            } else if (fM15227v > 0.0f) {
                f += fM15227v;
                iMax = Math.max(iMax, Math.round(iMo1513p / fM15227v));
            }
        }
        return ((list.size() - 1) * iMo916w0) + Math.round(iMax * f) + i2;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, long j) {
        return AbstractC3423or.m18234S(this, bk1.m3803k(j), bk1.m3802j(j), bk1.m3801i(j), bk1.m3800h(j), jt5Var.mo916w0(this.f60939a.mo9967a()), jt5Var, list, new l87[list.size()], 0, list.size(), null, 0);
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: c */
    public final int mo739c(aa4 aa4Var, List list, int i) {
        int iMo916w0 = aa4Var.mo916w0(this.f60939a.mo9967a());
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
            int iMo1512l = ct5Var.mo1512l(i);
            if (fM15227v == 0.0f) {
                i2 += iMo1512l;
            } else if (fM15227v > 0.0f) {
                f += fM15227v;
                iMax = Math.max(iMax, Math.round(iMo1512l / fM15227v));
            }
        }
        return ((list.size() - 1) * iMo916w0) + Math.round(iMax * f) + i2;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: d */
    public final int mo740d(aa4 aa4Var, List list, int i) {
        int iMo916w0 = aa4Var.mo916w0(this.f60939a.mo9967a());
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
                int iMin2 = Math.min(ct5Var.mo1513p(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, ct5Var.mo1511c(iMin2));
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
                iMax = Math.max(iMax, ct5Var2.mo1511c(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM15227v2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: e */
    public final int mo741e(aa4 aa4Var, List list, int i) {
        int iMo916w0 = aa4Var.mo916w0(this.f60939a.mo9967a());
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
                int iMin2 = Math.min(ct5Var.mo1513p(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, ct5Var.mo1510U(iMin2));
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
                iMax = Math.max(iMax, ct5Var2.mo1510U(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM15227v2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj8)) {
            return false;
        }
        sj8 sj8Var = (sj8) obj;
        return fa4.m11650l(this.f60939a, sj8Var.f60939a) && fa4.m11650l(this.f60940b, sj8Var.f60940b);
    }

    @Override // p000.oj8
    /* JADX INFO: renamed from: f */
    public final void mo3550f(int i, int[] iArr, int[] iArr2, jt5 jt5Var) {
        this.f60939a.mo9968j(jt5Var, i, iArr, jt5Var.getLayoutDirection(), iArr2);
    }

    @Override // p000.oj8
    /* JADX INFO: renamed from: g */
    public final long mo3551g(int i, int i2, int i3, boolean z) {
        return !z ? dk1.m10423a(i, i2, 0, i3) : AbstractC3423or.m18278s(i, i2, 0, i3);
    }

    @Override // p000.oj8
    /* JADX INFO: renamed from: h */
    public final it5 mo3552h(l87[] l87VarArr, jt5 jt5Var, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return jt5Var.mo9895M0(i2, i3, AbstractC3194a.m15360M(), new rj8(l87VarArr, this, i3, i, iArr));
    }

    public final int hashCode() {
        return this.f60940b.hashCode() + (this.f60939a.hashCode() * 31);
    }

    @Override // p000.oj8
    /* JADX INFO: renamed from: i */
    public final int mo3553i(l87 l87Var) {
        return l87Var.f49302b;
    }

    @Override // p000.oj8
    /* JADX INFO: renamed from: j */
    public final int mo3554j(l87 l87Var) {
        return l87Var.f49301a;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f60939a + ", verticalAlignment=" + this.f60940b + ')';
    }
}
