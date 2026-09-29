package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class tu2 implements e5b {

    /* JADX INFO: renamed from: a */
    public final e5b f62879a;

    /* JADX INFO: renamed from: b */
    public final e5b f62880b;

    public tu2(e5b e5bVar, e5b e5bVar2) {
        this.f62879a = e5bVar;
        this.f62880b = e5bVar2;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: a */
    public final int mo3999a(fb2 fb2Var) {
        int iMo3999a = this.f62879a.mo3999a(fb2Var) - this.f62880b.mo3999a(fb2Var);
        if (iMo3999a < 0) {
            return 0;
        }
        return iMo3999a;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: b */
    public final int mo4000b(fb2 fb2Var, LayoutDirection layoutDirection) {
        int iMo4000b = this.f62879a.mo4000b(fb2Var, layoutDirection) - this.f62880b.mo4000b(fb2Var, layoutDirection);
        if (iMo4000b < 0) {
            return 0;
        }
        return iMo4000b;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: c */
    public final int mo4001c(fb2 fb2Var) {
        int iMo4001c = this.f62879a.mo4001c(fb2Var) - this.f62880b.mo4001c(fb2Var);
        if (iMo4001c < 0) {
            return 0;
        }
        return iMo4001c;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: d */
    public final int mo4002d(fb2 fb2Var, LayoutDirection layoutDirection) {
        int iMo4002d = this.f62879a.mo4002d(fb2Var, layoutDirection) - this.f62880b.mo4002d(fb2Var, layoutDirection);
        if (iMo4002d < 0) {
            return 0;
        }
        return iMo4002d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu2)) {
            return false;
        }
        tu2 tu2Var = (tu2) obj;
        return fa4.m11650l(tu2Var.f62879a, this.f62879a) && fa4.m11650l(tu2Var.f62880b, this.f62880b);
    }

    public final int hashCode() {
        return this.f62880b.hashCode() + (this.f62879a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f62879a + " - " + this.f62880b + ')';
    }
}
