package p367rh;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: rh.q */
/* JADX INFO: loaded from: classes.dex */
public final class C8803q {

    /* JADX INFO: renamed from: a */
    public final String f46668a;

    /* JADX INFO: renamed from: b */
    public final int f46669b;

    /* JADX INFO: renamed from: c */
    public final String f46670c;

    /* JADX INFO: renamed from: d */
    public final int f46671d;

    /* JADX INFO: renamed from: e */
    public final String f46672e;

    public C8803q(String str, int i10, String str2, int i11, String str3) {
        C5207g.m11111f(str, "codeWithLanguage");
        C5207g.m11111f(str2, "type");
        C5207g.m11111f(str3, "ofQuery");
        this.f46668a = str;
        this.f46669b = i10;
        this.f46670c = str2;
        this.f46671d = i11;
        this.f46672e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8803q)) {
            return false;
        }
        C8803q c8803q = (C8803q) obj;
        return C5207g.m11106a(this.f46668a, c8803q.f46668a) && this.f46669b == c8803q.f46669b && C5207g.m11106a(this.f46670c, c8803q.f46670c) && this.f46671d == c8803q.f46671d && C5207g.m11106a(this.f46672e, c8803q.f46672e);
    }

    public final int hashCode() {
        return this.f46672e.hashCode() + C0009a.m16d(this.f46671d, C0166e.m758d(this.f46670c, C0009a.m16d(this.f46669b, this.f46668a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryShelfAndContentJoin(codeWithLanguage=");
        sb2.append(this.f46668a);
        sb2.append(", id=");
        sb2.append(this.f46669b);
        sb2.append(", type=");
        sb2.append(this.f46670c);
        sb2.append(", order=");
        sb2.append(this.f46671d);
        sb2.append(", ofQuery=");
        return C0009a.m23l(sb2, this.f46672e, ")");
    }
}
