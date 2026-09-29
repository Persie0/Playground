package ki;

import android.support.v4.media.session.C0166e;
import dm.C5207g;

/* JADX INFO: renamed from: ki.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6696b {

    /* JADX INFO: renamed from: a */
    public final int f37853a;

    /* JADX INFO: renamed from: b */
    public final String f37854b;

    /* JADX INFO: renamed from: c */
    public final int f37855c;

    public C6696b() {
        this("", 0, 0);
    }

    public C6696b(String str, int i10, int i11) {
        C5207g.m11111f(str, "title");
        this.f37853a = i10;
        this.f37854b = str;
        this.f37855c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6696b)) {
            return false;
        }
        C6696b c6696b = (C6696b) obj;
        return this.f37853a == c6696b.f37853a && C5207g.m11106a(this.f37854b, c6696b.f37854b) && this.f37855c == c6696b.f37855c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37855c) + C0166e.m758d(this.f37854b, Integer.hashCode(this.f37853a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaylistCourse(id=");
        sb2.append(this.f37853a);
        sb2.append(", title=");
        sb2.append(this.f37854b);
        sb2.append(", order=");
        return C0166e.m768o(sb2, this.f37855c, ")");
    }
}
