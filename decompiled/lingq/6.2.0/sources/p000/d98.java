package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@ey8(with = e98.class)
public final class d98 {
    public static final c98 Companion = new c98();

    /* JADX INFO: renamed from: a */
    public final List f35220a;

    public d98(List list) {
        list.getClass();
        this.f35220a = list;
    }

    /* JADX INFO: renamed from: a */
    public final List m10169a() {
        return this.f35220a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d98) && fa4.m11650l(this.f35220a, ((d98) obj).f35220a);
    }

    public final int hashCode() {
        return this.f35220a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("ResultParagraph(sentences=", ")", this.f35220a);
    }
}
