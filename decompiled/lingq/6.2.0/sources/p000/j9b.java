package p000;

import androidx.compose.foundation.layout.Direction;

/* JADX INFO: loaded from: classes.dex */
final class j9b extends i16 {

    /* JADX INFO: renamed from: b */
    public final Direction f45266b;

    /* JADX INFO: renamed from: c */
    public final zi3 f45267c;

    /* JADX INFO: renamed from: d */
    public final Object f45268d;

    /* JADX INFO: renamed from: e */
    public final String f45269e;

    public j9b(Direction direction, zi3 zi3Var, Object obj, String str) {
        this.f45266b = direction;
        this.f45267c = zi3Var;
        this.f45268d = obj;
        this.f45269e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j9b.class != obj.getClass()) {
            return false;
        }
        j9b j9bVar = (j9b) obj;
        return this.f45266b == j9bVar.f45266b && fa4.m11650l(this.f45268d, j9bVar.f45268d);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        k9b k9bVar = new k9b();
        k9bVar.f46918J = this.f45266b;
        k9bVar.f46919K = this.f45267c;
        return k9bVar;
    }

    public final int hashCode() {
        return this.f45268d.hashCode() + g9a.m12428e(this.f45266b.hashCode() * 31, 31, false);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = this.f45269e;
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f45268d, "align");
        z91Var.m25511b(Boolean.FALSE, "unbounded");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        k9b k9bVar = (k9b) d16Var;
        k9bVar.f46918J = this.f45266b;
        k9bVar.f46919K = this.f45267c;
    }
}
