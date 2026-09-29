package androidx.compose.material3.pulltorefresh;

import p000.d16;
import p000.fa4;
import p000.g9a;
import p000.i16;
import p000.mp7;
import p000.ui3;
import p000.wfb;
import p000.xj2;
import p000.y64;
import p000.z91;

/* JADX INFO: renamed from: androidx.compose.material3.pulltorefresh.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0258a extends i16 {

    /* JADX INFO: renamed from: b */
    public final boolean f3597b;

    /* JADX INFO: renamed from: c */
    public final ui3 f3598c;

    /* JADX INFO: renamed from: d */
    public final boolean f3599d;

    /* JADX INFO: renamed from: e */
    public final mp7 f3600e;

    /* JADX INFO: renamed from: f */
    public final float f3601f;

    public C0258a(boolean z, ui3 ui3Var, boolean z2, mp7 mp7Var, float f) {
        this.f3597b = z;
        this.f3598c = ui3Var;
        this.f3599d = z2;
        this.f3600e = mp7Var;
        this.f3601f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0258a)) {
            return false;
        }
        C0258a c0258a = (C0258a) obj;
        return this.f3597b == c0258a.f3597b && this.f3599d == c0258a.f3599d && this.f3598c == c0258a.f3598c && fa4.m11650l(this.f3600e, c0258a.f3600e) && xj2.m24560b(this.f3601f, c0258a.f3601f);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0259b(this.f3597b, this.f3598c, this.f3599d, this.f3600e, this.f3601f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f3601f) + ((this.f3600e.hashCode() + ((this.f3598c.hashCode() + g9a.m12428e(Boolean.hashCode(this.f3597b) * 31, 31, this.f3599d)) * 31)) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "PullToRefreshModifierNode";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(Boolean.valueOf(this.f3597b), "isRefreshing");
        z91Var.m25511b(this.f3598c, "onRefresh");
        z91Var.m25511b(Boolean.valueOf(this.f3599d), "enabled");
        z91Var.m25511b(this.f3600e, "state");
        z91Var.m25511b(new xj2(this.f3601f), "threshold");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0259b c0259b = (C0259b) d16Var;
        c0259b.f3603M = this.f3598c;
        c0259b.f3604N = this.f3599d;
        c0259b.f3605O = this.f3600e;
        c0259b.f3606P = this.f3601f;
        boolean z = c0259b.f3602L;
        boolean z2 = this.f3597b;
        if (z != z2) {
            c0259b.f3602L = z2;
            wfb.m23926u(c0259b.m9971N0(), null, null, new PullToRefreshModifierNode$update$1(c0259b, null), 3);
        }
    }
}
