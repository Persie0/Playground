package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jq8 {

    /* JADX INFO: renamed from: a */
    public final List f46012a;

    public jq8(List list) {
        list.getClass();
        this.f46012a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jq8) && fa4.m11650l(this.f46012a, ((jq8) obj).f46012a);
    }

    public final int hashCode() {
        return this.f46012a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("SearchFilterState(settings=", ")", this.f46012a);
    }
}
