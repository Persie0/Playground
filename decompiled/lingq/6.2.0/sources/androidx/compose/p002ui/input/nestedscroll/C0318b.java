package androidx.compose.p002ui.input.nestedscroll;

import p000.d16;
import p000.fa4;
import p000.i16;
import p000.pj6;
import p000.y64;
import p000.z91;

/* JADX INFO: renamed from: androidx.compose.ui.input.nestedscroll.b */
/* JADX INFO: loaded from: classes.dex */
final class C0318b extends i16 {

    /* JADX INFO: renamed from: b */
    public final pj6 f4087b;

    /* JADX INFO: renamed from: c */
    public final C0317a f4088c;

    public C0318b(pj6 pj6Var, C0317a c0317a) {
        this.f4087b = pj6Var;
        this.f4088c = c0317a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0318b)) {
            return false;
        }
        C0318b c0318b = (C0318b) obj;
        return fa4.m11650l(c0318b.f4087b, this.f4087b) && fa4.m11650l(c0318b.f4088c, this.f4088c);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0320d(this.f4087b, this.f4088c);
    }

    public final int hashCode() {
        int iHashCode = this.f4087b.hashCode() * 31;
        C0317a c0317a = this.f4088c;
        return iHashCode + (c0317a != null ? c0317a.hashCode() : 0);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "nestedScroll";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f4087b, "connection");
        z91Var.m25511b(this.f4088c, "dispatcher");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0320d c0320d = (C0320d) d16Var;
        c0320d.f4089J = this.f4087b;
        C0317a c0317a = c0320d.f4090K;
        if (c0317a.f4083a == c0320d) {
            c0317a.f4083a = null;
        }
        C0317a c0317a2 = this.f4088c;
        if (c0317a2 == null) {
            c0320d.f4090K = new C0317a();
        } else if (c0317a2 != c0317a) {
            c0320d.f4090K = c0317a2;
        }
        if (c0320d.f34836I) {
            C0317a c0317a3 = c0320d.f4090K;
            c0317a3.f4083a = c0320d;
            c0317a3.f4084b = null;
            c0320d.f4091L = null;
            c0317a3.f4085c = new NestedScrollNode$updateDispatcherFields$1(c0320d);
            c0317a3.f4086d = c0320d.m9971N0();
        }
    }
}
