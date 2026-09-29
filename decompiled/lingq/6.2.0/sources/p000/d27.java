package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d27 {

    /* JADX INFO: renamed from: a */
    public final List f34869a;

    /* JADX INFO: renamed from: b */
    public final List f34870b;

    /* JADX INFO: renamed from: c */
    public final List f34871c;

    public d27(List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f34869a = list;
        this.f34870b = list2;
        this.f34871c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d27)) {
            return false;
        }
        d27 d27Var = (d27) obj;
        return fa4.m11650l(this.f34869a, d27Var.f34869a) && fa4.m11650l(this.f34870b, d27Var.f34870b) && fa4.m11650l(this.f34871c, d27Var.f34871c);
    }

    public final int hashCode() {
        return this.f34871c.hashCode() + ux5.m22979b(this.f34869a.hashCode() * 31, 31, this.f34870b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PageHighlightData(wordHighlights=");
        sb.append(this.f34869a);
        sb.append(", phraseHighlights=");
        sb.append(this.f34870b);
        sb.append(", phraseStructures=");
        return hn1.m13356f(sb, this.f34871c, ")");
    }
}
