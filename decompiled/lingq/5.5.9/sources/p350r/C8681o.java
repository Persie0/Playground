package p350r;

import dm.C5207g;

/* JADX INFO: renamed from: r.o */
/* JADX INFO: loaded from: classes.dex */
public final class C8681o {

    /* JADX INFO: renamed from: a */
    public final C8674h f46272a;

    /* JADX INFO: renamed from: b */
    public final C8678l f46273b;

    /* JADX INFO: renamed from: c */
    public final C8669c f46274c;

    /* JADX WARN: Multi-variable type inference failed */
    public C8681o() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15);
    }

    public C8681o(C8674h c8674h, C8678l c8678l, C8669c c8669c) {
        this.f46272a = c8674h;
        this.f46273b = c8678l;
        this.f46274c = c8669c;
    }

    public /* synthetic */ C8681o(C8674h c8674h, C8678l c8678l, C8669c c8669c, int i10) {
        this((i10 & 1) != 0 ? null : c8674h, (i10 & 2) != 0 ? null : c8678l, (i10 & 4) != 0 ? null : c8669c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8681o)) {
            return false;
        }
        C8681o c8681o = (C8681o) obj;
        if (C5207g.m11106a(this.f46272a, c8681o.f46272a) && C5207g.m11106a(this.f46273b, c8681o.f46273b) && C5207g.m11106a(this.f46274c, c8681o.f46274c) && C5207g.m11106a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        C8674h c8674h = this.f46272a;
        int iHashCode = (c8674h == null ? 0 : c8674h.hashCode()) * 31;
        C8678l c8678l = this.f46273b;
        int iHashCode2 = (iHashCode + (c8678l == null ? 0 : c8678l.hashCode())) * 31;
        C8669c c8669c = this.f46274c;
        return ((iHashCode2 + (c8669c == null ? 0 : c8669c.hashCode())) * 31) + 0;
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f46272a + ", slide=" + this.f46273b + ", changeSize=" + this.f46274c + ", scale=null)";
    }
}
