package p367rh;

import android.support.v4.media.session.C0166e;
import com.lingq.entity.Meaning;
import dm.C5207g;
import java.util.List;
import p003a2.C0009a;

/* JADX INFO: renamed from: rh.t */
/* JADX INFO: loaded from: classes.dex */
public final class C8806t {

    /* JADX INFO: renamed from: a */
    public final String f46678a;

    /* JADX INFO: renamed from: b */
    public final String f46679b;

    /* JADX INFO: renamed from: c */
    public final List<Meaning> f46680c;

    public C8806t(String str, String str2, List<Meaning> list) {
        C5207g.m11111f(str, "termWithLanguage");
        C5207g.m11111f(str2, "locale");
        C5207g.m11111f(list, "popularMeanings");
        this.f46678a = str;
        this.f46679b = str2;
        this.f46680c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8806t)) {
            return false;
        }
        C8806t c8806t = (C8806t) obj;
        return C5207g.m11106a(this.f46678a, c8806t.f46678a) && C5207g.m11106a(this.f46679b, c8806t.f46679b) && C5207g.m11106a(this.f46680c, c8806t.f46680c);
    }

    public final int hashCode() {
        return this.f46680c.hashCode() + C0166e.m758d(this.f46679b, this.f46678a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenAndPopularMeanings(termWithLanguage=");
        sb2.append(this.f46678a);
        sb2.append(", locale=");
        sb2.append(this.f46679b);
        sb2.append(", popularMeanings=");
        return C0009a.m24m(sb2, this.f46680c, ")");
    }
}
