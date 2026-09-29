package p367rh;

import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: rh.o */
/* JADX INFO: loaded from: classes.dex */
public final class C8801o {

    /* JADX INFO: renamed from: a */
    public final int f46660a;

    /* JADX INFO: renamed from: b */
    public final int f46661b;

    /* JADX INFO: renamed from: c */
    public final String f46662c;

    public C8801o(String str, int i10, int i11) {
        C5207g.m11111f(str, "language");
        this.f46660a = i10;
        this.f46661b = i11;
        this.f46662c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8801o)) {
            return false;
        }
        C8801o c8801o = (C8801o) obj;
        return this.f46660a == c8801o.f46660a && this.f46661b == c8801o.f46661b && C5207g.m11106a(this.f46662c, c8801o.f46662c);
    }

    public final int hashCode() {
        return this.f46662c.hashCode() + C0009a.m16d(this.f46661b, Integer.hashCode(this.f46660a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LessonsWithPlaylistJoin(playlistId=");
        sb2.append(this.f46660a);
        sb2.append(", contentId=");
        sb2.append(this.f46661b);
        sb2.append(", language=");
        return C0009a.m23l(sb2, this.f46662c, ")");
    }
}
