package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a5a {

    /* JADX INFO: renamed from: a */
    public final List f273a;

    public a5a(List list) {
        list.getClass();
        this.f273a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5a) && fa4.m11650l(this.f273a, ((a5a) obj).f273a);
    }

    public final int hashCode() {
        return this.f273a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("TokenRelatedPhrases(relatedPhrases=", ")", this.f273a);
    }
}
