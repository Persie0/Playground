package p350r;

import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: r.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8672f {

    /* JADX INFO: renamed from: a */
    public static final C8673g f46257a = new C8673g(new C8681o(null, null, null, 15));

    /* JADX INFO: renamed from: a */
    public abstract C8681o mo16927a();

    /* JADX INFO: renamed from: b */
    public final C8673g m16928b(C8673g c8673g) {
        C8681o c8681o = ((C8673g) this).f46258b;
        C8674h c8674h = c8681o.f46272a;
        C8681o c8681o2 = c8673g.f46258b;
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
        return new C8673g(new C8681o(c8674h, c8678l, c8669c));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC8672f) && C5207g.m11106a(((AbstractC8672f) obj).mo16927a(), mo16927a());
    }

    public final int hashCode() {
        return mo16927a().hashCode();
    }

    public final String toString() {
        if (C5207g.m11106a(this, f46257a)) {
            return "ExitTransition.None";
        }
        C8681o c8681oMo16927a = mo16927a();
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
        C8674h c8674h = c8681oMo16927a.f46272a;
        String string = null;
        sb2.append(c8674h != null ? c8674h.toString() : null);
        sb2.append(",\nSlide - ");
        C8678l c8678l = c8681oMo16927a.f46273b;
        sb2.append(c8678l != null ? c8678l.toString() : null);
        sb2.append(",\nShrink - ");
        C8669c c8669c = c8681oMo16927a.f46274c;
        if (c8669c != null) {
            string = c8669c.toString();
        }
        return C0009a.m23l(sb2, string, ",\nScale - null");
    }
}
