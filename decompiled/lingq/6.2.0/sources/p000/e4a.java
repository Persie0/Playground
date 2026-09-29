package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e4a {

    /* JADX INFO: renamed from: a */
    public final List f36705a;

    public e4a(List list) {
        list.getClass();
        this.f36705a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e4a) && fa4.m11650l(this.f36705a, ((e4a) obj).f36705a);
    }

    public final int hashCode() {
        return this.f36705a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("TokenPopularMeanings(popularMeanings=", ")", this.f36705a);
    }
}
