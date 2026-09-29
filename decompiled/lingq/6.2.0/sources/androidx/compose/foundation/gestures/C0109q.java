package androidx.compose.foundation.gestures;

import p000.d16;
import p000.do8;
import p000.fa4;
import p000.g9a;
import p000.i16;
import p000.v56;
import p000.y64;
import p000.z91;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.q */
/* JADX INFO: loaded from: classes.dex */
final class C0109q extends i16 {

    /* JADX INFO: renamed from: b */
    public final do8 f2305b;

    /* JADX INFO: renamed from: c */
    public final Orientation f2306c;

    /* JADX INFO: renamed from: d */
    public final boolean f2307d;

    /* JADX INFO: renamed from: e */
    public final boolean f2308e;

    /* JADX INFO: renamed from: f */
    public final v56 f2309f;

    public C0109q(do8 do8Var, Orientation orientation, boolean z, boolean z2, v56 v56Var) {
        this.f2305b = do8Var;
        this.f2306c = orientation;
        this.f2307d = z;
        this.f2308e = z2;
        this.f2309f = v56Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0109q)) {
            return false;
        }
        C0109q c0109q = (C0109q) obj;
        return fa4.m11650l(this.f2305b, c0109q.f2305b) && this.f2306c == c0109q.f2306c && this.f2307d == c0109q.f2307d && this.f2308e == c0109q.f2308e && fa4.m11650l(this.f2309f, c0109q.f2309f);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0115u(null, null, this.f2309f, this.f2305b, null, this.f2306c, this.f2307d, this.f2308e);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(g9a.m12428e((this.f2306c.hashCode() + (this.f2305b.hashCode() * 31)) * 961, 31, this.f2307d), 961, this.f2308e);
        v56 v56Var = this.f2309f;
        return (iM12428e + (v56Var != null ? v56Var.hashCode() : 0)) * 31;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "scrollable";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f2306c, "orientation");
        z91Var.m25511b(this.f2305b, "state");
        z91Var.m25511b(null, "overscrollEffect");
        z91Var.m25511b(Boolean.valueOf(this.f2307d), "enabled");
        z91Var.m25511b(Boolean.valueOf(this.f2308e), "reverseDirection");
        z91Var.m25511b(null, "flingBehavior");
        z91Var.m25511b(this.f2309f, "interactionSource");
        z91Var.m25511b(null, "bringIntoViewSpec");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((C0115u) d16Var).m928u1(null, null, this.f2309f, this.f2305b, null, this.f2306c, this.f2307d, this.f2308e);
    }
}
