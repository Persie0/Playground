package p350r;

import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: r.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8670d {

    /* JADX INFO: renamed from: a */
    public static final C8671e f46255a = new C8671e(new C8681o(null, null, null, 15));

    /* JADX INFO: renamed from: a */
    public abstract C8681o mo16925a();

    /* JADX INFO: renamed from: b */
    public final C8671e m16926b(C8671e c8671e) {
        C8681o c8681o = ((C8671e) this).f46256b;
        C8674h c8674h = c8681o.f46272a;
        C8681o c8681o2 = c8671e.f46256b;
        if (c8674h == null) {
            c8674h = c8681o2.f46272a;
        }
        C8678l c8678l = c8681o.f46273b;
        if (c8678l == null) {
            c8678l = c8681o2.f46273b;
        }
        C8669c c8669c = c8681o.f46274c;
        if (c8669c == null) {
            c8669c = c8681o2.f46274c;
        }
        c8681o.getClass();
        c8681o2.getClass();
        return new C8671e(new C8681o(c8674h, c8678l, c8669c));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC8670d) && C5207g.m11106a(((AbstractC8670d) obj).mo16925a(), mo16925a());
    }

    public final int hashCode() {
        return mo16925a().hashCode();
    }

    public final String toString() {
        if (C5207g.m11106a(this, f46255a)) {
            return "EnterTransition.None";
        }
        C8681o c8681oMo16925a = mo16925a();
        StringBuilder sb2 = new StringBuilder("EnterTransition: \nFade - ");
        C8674h c8674h = c8681oMo16925a.f46272a;
        sb2.append(c8674h != null ? c8674h.toString() : null);
        sb2.append(",\nSlide - ");
        C8678l c8678l = c8681oMo16925a.f46273b;
        sb2.append(c8678l != null ? c8678l.toString() : null);
        sb2.append(",\nShrink - ");
        C8669c c8669c = c8681oMo16925a.f46274c;
        return C0009a.m23l(sb2, c8669c != null ? c8669c.toString() : null, ",\nScale - null");
    }
}
