package p386t;

import dm.C5207g;
import p338qd.C8584v;
import p387t0.C9169u;
import p443w.C9782m;
import p443w.InterfaceC9781l;

/* JADX INFO: renamed from: t.w */
/* JADX INFO: loaded from: classes.dex */
public final class C9131w {

    /* JADX INFO: renamed from: a */
    public final long f47639a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9781l f47640b;

    public C9131w() {
        long jM16784i = C8584v.m16784i(4284900966L);
        float f3 = 0;
        C9782m c9782m = new C9782m(f3, f3, f3, f3);
        this.f47639a = jM16784i;
        this.f47640b = c9782m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5207g.m11106a(C9131w.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C5207g.m11109d(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        C9131w c9131w = (C9131w) obj;
        return C9169u.m17497c(this.f47639a, c9131w.f47639a) && C5207g.m11106a(this.f47640b, c9131w.f47640b);
    }

    public final int hashCode() {
        int i10 = C9169u.f47704g;
        return this.f47640b.hashCode() + (Long.hashCode(this.f47639a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) C9169u.m17503i(this.f47639a)) + ", drawPadding=" + this.f47640b + ')';
    }
}
