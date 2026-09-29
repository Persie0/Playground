package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d30 extends aq1 {

    /* JADX INFO: renamed from: a */
    public final List f34887a;

    /* JADX INFO: renamed from: b */
    public final String f34888b;

    public d30(List list, String str) {
        this.f34887a = list;
        this.f34888b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aq1) {
            d30 d30Var = (d30) ((aq1) obj);
            if (this.f34887a.equals(d30Var.f34887a)) {
                String str = d30Var.f34888b;
                String str2 = this.f34888b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f34887a.hashCode() ^ 1000003) * 1000003;
        String str = this.f34888b;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f34887a);
        sb.append(", orgId=");
        return AbstractC3393o1.m17738m(sb, this.f34888b, "}");
    }
}
