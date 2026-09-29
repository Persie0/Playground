package p387t0;

import dm.C5207g;

/* JADX INFO: renamed from: t0.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9156l0 extends AbstractC9161o {

    /* JADX INFO: renamed from: a */
    public final long f47684a;

    public C9156l0(long j10) {
        this.f47684a = j10;
    }

    @Override // p387t0.AbstractC9161o
    /* JADX INFO: renamed from: a */
    public final void mo17468a(float f3, long j10, C9147h c9147h) {
        C5207g.m11111f(c9147h, "p");
        c9147h.m17442d(1.0f);
        boolean z10 = f3 == 1.0f;
        long jM17496b = this.f47684a;
        if (!z10) {
            jM17496b = C9169u.m17496b(jM17496b, C9169u.m17498d(jM17496b) * f3);
        }
        c9147h.m17444f(jM17496b);
        if (c9147h.f47653c != null) {
            c9147h.m17446h(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9156l0) {
            return C9169u.m17497c(this.f47684a, ((C9156l0) obj).f47684a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = C9169u.f47704g;
        return Long.hashCode(this.f47684a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C9169u.m17503i(this.f47684a)) + ')';
    }
}
