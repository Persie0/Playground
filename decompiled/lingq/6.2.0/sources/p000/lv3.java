package p000;

import androidx.compose.p002ui.layout.InterfaceC0338e;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class lv3 implements InterfaceC0338e {

    /* JADX INFO: renamed from: a */
    public final mv9 f50182a;

    /* JADX INFO: renamed from: b */
    public final int f50183b;

    /* JADX INFO: renamed from: c */
    public final n9a f50184c;

    /* JADX INFO: renamed from: d */
    public final ui3 f50185d;

    public lv3(mv9 mv9Var, int i, n9a n9aVar, ui3 ui3Var) {
        this.f50182a = mv9Var;
        this.f50183b = i;
        this.f50184c = n9aVar;
        this.f50185d = ui3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lv3) {
            lv3 lv3Var = (lv3) obj;
            if (this.f50182a == lv3Var.f50182a && this.f50183b == lv3Var.f50183b && this.f50184c.equals(lv3Var.f50184c) && fa4.m11650l(this.f50185d, lv3Var.f50185d)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.p002ui.layout.InterfaceC0338e
    /* JADX INFO: renamed from: f */
    public final it5 mo1491f(jt5 jt5Var, ct5 ct5Var, long j) {
        long j2;
        if (ct5Var.mo1513p(bk1.m3800h(j)) < bk1.m3801i(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = bk1.m3794b(0, Integer.MAX_VALUE, 0, 0, 13, j2);
        }
        l87 l87VarMo1514r = ct5Var.mo1514r(j);
        int iMin = Math.min(l87VarMo1514r.f49301a, bk1.m3801i(j2));
        return jt5Var.mo9895M0(iMin, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new ec2(iMin, 1, this, jt5Var, l87VarMo1514r));
    }

    public final int hashCode() {
        return this.f50185d.hashCode() + ((this.f50184c.hashCode() + wq1.m24106b(this.f50183b, this.f50182a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f50182a + ", cursorOffset=" + this.f50183b + ", transformedText=" + this.f50184c + ", textLayoutResultProvider=" + this.f50185d + ')';
    }
}
