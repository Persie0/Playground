package gi;

import dm.C5207g;
import java.util.List;

/* JADX INFO: renamed from: gi.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5803a {

    /* JADX INFO: renamed from: a */
    public final String f35071a;

    /* JADX INFO: renamed from: b */
    public final List<String> f35072b;

    public C5803a(List list, String str) {
        C5207g.m11111f(str, "code");
        C5207g.m11111f(list, "tags");
        this.f35071a = str;
        this.f35072b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5803a)) {
            return false;
        }
        C5803a c5803a = (C5803a) obj;
        return C5207g.m11106a(this.f35071a, c5803a.f35071a) && C5207g.m11106a(this.f35072b, c5803a.f35072b);
    }

    public final int hashCode() {
        return this.f35072b.hashCode() + (this.f35071a.hashCode() * 31);
    }

    public final String toString() {
        return "UserLanguageTags(code=" + this.f35071a + ", tags=" + this.f35072b + ")";
    }
}
