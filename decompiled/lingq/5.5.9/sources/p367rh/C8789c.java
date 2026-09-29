package p367rh;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: rh.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8789c {

    /* JADX INFO: renamed from: a */
    public final String f46624a;

    /* JADX INFO: renamed from: b */
    public final String f46625b;

    /* JADX INFO: renamed from: c */
    public final String f46626c;

    /* JADX INFO: renamed from: d */
    public final int f46627d;

    /* JADX INFO: renamed from: e */
    public final String f46628e;

    public C8789c(int i10, String str, String str2, String str3, String str4) {
        this.f46624a = str;
        this.f46625b = str2;
        this.f46626c = str3;
        this.f46627d = i10;
        this.f46628e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8789c)) {
            return false;
        }
        C8789c c8789c = (C8789c) obj;
        if (C5207g.m11106a(this.f46624a, c8789c.f46624a) && C5207g.m11106a(this.f46625b, c8789c.f46625b) && C5207g.m11106a(this.f46626c, c8789c.f46626c) && this.f46627d == c8789c.f46627d && C5207g.m11106a(this.f46628e, c8789c.f46628e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f46627d, C0166e.m758d(this.f46626c, C0166e.m758d(this.f46625b, this.f46624a.hashCode() * 31, 31), 31), 31);
        String str = this.f46628e;
        return iM16d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChallengeDetailStats(language=");
        sb2.append(this.f46624a);
        sb2.append(", challengeCode=");
        sb2.append(this.f46625b);
        sb2.append(", code=");
        sb2.append(this.f46626c);
        sb2.append(", value=");
        sb2.append(this.f46627d);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f46628e, ")");
    }
}
