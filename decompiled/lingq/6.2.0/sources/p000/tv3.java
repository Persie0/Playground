package p000;

import androidx.compose.foundation.C0123j;

/* JADX INFO: loaded from: classes.dex */
final class tv3 extends i16 {

    /* JADX INFO: renamed from: b */
    public final v56 f62944b;

    public tv3(v56 v56Var) {
        this.f62944b = v56Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv3) && fa4.m11650l(((tv3) obj).f62944b, this.f62944b);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        C0123j c0123j = new C0123j();
        c0123j.f2396J = this.f62944b;
        return c0123j;
    }

    public final int hashCode() {
        return this.f62944b.hashCode() * 31;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "hoverable";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f62944b, "interactionSource");
        z91Var.m25511b(Boolean.TRUE, "enabled");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0123j c0123j = (C0123j) d16Var;
        v56 v56Var = c0123j.f2396J;
        v56 v56Var2 = this.f62944b;
        if (fa4.m11650l(v56Var, v56Var2)) {
            return;
        }
        c0123j.m960b1();
        c0123j.f2396J = v56Var2;
    }
}
