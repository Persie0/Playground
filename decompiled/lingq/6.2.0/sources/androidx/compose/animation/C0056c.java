package androidx.compose.animation;

import p000.C3189km;
import p000.d16;
import p000.fa4;
import p000.i16;
import p000.t66;
import p000.v9a;
import p000.y64;
import p000.z91;

/* JADX INFO: renamed from: androidx.compose.animation.c */
/* JADX INFO: loaded from: classes.dex */
final class C0056c<S> extends i16 {

    /* JADX INFO: renamed from: b */
    public final v9a f1488b;

    /* JADX INFO: renamed from: c */
    public final t66 f1489c;

    /* JADX INFO: renamed from: d */
    public final C3189km f1490d;

    public C0056c(v9a v9aVar, t66 t66Var, C3189km c3189km) {
        this.f1488b = v9aVar;
        this.f1489c = t66Var;
        this.f1490d = c3189km;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0056c)) {
            return false;
        }
        C0056c c0056c = (C0056c) obj;
        return fa4.m11650l(c0056c.f1488b, this.f1488b) && c0056c.f1489c.equals(this.f1489c);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        C0065d c0065d = new C0065d(1);
        c0065d.f1558K = this.f1488b;
        c0065d.f1559L = this.f1489c;
        c0065d.f1560M = this.f1490d;
        c0065d.f1561N = -9223372034707292160L;
        return c0065d;
    }

    public final int hashCode() {
        int iHashCode = this.f1490d.hashCode() * 31;
        v9a v9aVar = this.f1488b;
        return this.f1489c.hashCode() + ((iHashCode + (v9aVar != null ? v9aVar.hashCode() : 0)) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "sizeTransform";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f1488b, "sizeAnimation");
        z91Var.m25511b(this.f1489c, "sizeTransform");
        z91Var.m25511b(this.f1490d, "scope");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0065d c0065d = (C0065d) d16Var;
        c0065d.f1558K = this.f1488b;
        c0065d.f1559L = this.f1489c;
        c0065d.f1560M = this.f1490d;
    }
}
