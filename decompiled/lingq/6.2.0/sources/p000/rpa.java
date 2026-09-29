package p000;

import androidx.compose.p002ui.layout.InterfaceC0338e;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class rpa implements InterfaceC0338e {

    /* JADX INFO: renamed from: a */
    public final mv9 f59690a;

    /* JADX INFO: renamed from: b */
    public final int f59691b;

    /* JADX INFO: renamed from: c */
    public final n9a f59692c;

    /* JADX INFO: renamed from: d */
    public final ui3 f59693d;

    public rpa(mv9 mv9Var, int i, n9a n9aVar, ui3 ui3Var) {
        this.f59690a = mv9Var;
        this.f59691b = i;
        this.f59692c = n9aVar;
        this.f59693d = ui3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rpa) {
            rpa rpaVar = (rpa) obj;
            if (this.f59690a == rpaVar.f59690a && this.f59691b == rpaVar.f59691b && this.f59692c.equals(rpaVar.f59692c) && fa4.m11650l(this.f59693d, rpaVar.f59693d)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.p002ui.layout.InterfaceC0338e
    /* JADX INFO: renamed from: f */
    public final it5 mo1491f(jt5 jt5Var, ct5 ct5Var, long j) {
        l87 l87VarMo1514r = ct5Var.mo1514r(bk1.m3794b(0, 0, 0, Integer.MAX_VALUE, 7, j));
        int iMin = Math.min(l87VarMo1514r.f49302b, bk1.m3800h(j));
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, iMin, AbstractC3194a.m15360M(), new m85(this, l87VarMo1514r, iMin));
    }

    public final int hashCode() {
        return this.f59693d.hashCode() + ((this.f59692c.hashCode() + wq1.m24106b(this.f59691b, this.f59690a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f59690a + ", cursorOffset=" + this.f59691b + ", transformedText=" + this.f59692c + ", textLayoutResultProvider=" + this.f59693d + ')';
    }
}
