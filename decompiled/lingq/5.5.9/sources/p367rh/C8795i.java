package p367rh;

import android.support.v4.media.session.C0166e;
import dm.C5207g;

/* JADX INFO: renamed from: rh.i */
/* JADX INFO: loaded from: classes.dex */
public final class C8795i {

    /* JADX INFO: renamed from: a */
    public final String f46645a;

    /* JADX INFO: renamed from: b */
    public final String f46646b;

    /* JADX INFO: renamed from: c */
    public final int f46647c;

    public C8795i(String str, int i10, String str2) {
        C5207g.m11111f(str, "code");
        C5207g.m11111f(str2, "name");
        this.f46645a = str;
        this.f46646b = str2;
        this.f46647c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8795i)) {
            return false;
        }
        C8795i c8795i = (C8795i) obj;
        return C5207g.m11106a(this.f46645a, c8795i.f46645a) && C5207g.m11106a(this.f46646b, c8795i.f46646b) && this.f46647c == c8795i.f46647c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46647c) + C0166e.m758d(this.f46646b, this.f46645a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LanguageAndTtsVoicesJoin(code=");
        sb2.append(this.f46645a);
        sb2.append(", name=");
        sb2.append(this.f46646b);
        sb2.append(", voiceOrder=");
        return C0166e.m768o(sb2, this.f46647c, ")");
    }
}
