package p000;

import androidx.compose.foundation.C0121i;

/* JADX INFO: loaded from: classes.dex */
final class na3 extends i16 {

    /* JADX INFO: renamed from: b */
    public final v56 f52535b;

    public na3(v56 v56Var) {
        this.f52535b = v56Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof na3) {
            return fa4.m11650l(this.f52535b, ((na3) obj).f52535b);
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0121i(this.f52535b, 1, null);
    }

    public final int hashCode() {
        v56 v56Var = this.f52535b;
        if (v56Var != null) {
            return v56Var.hashCode();
        }
        return 0;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "focusable";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(Boolean.TRUE, "enabled");
        z91Var.m25511b(this.f52535b, "interactionSource");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((C0121i) d16Var).m955d1(this.f52535b);
    }
}
