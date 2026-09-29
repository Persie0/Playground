package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class is7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final List f44512a;

    public is7(List list) {
        list.getClass();
        this.f44512a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof is7) && fa4.m11650l(this.f44512a, ((is7) obj).f44512a);
    }

    public final int hashCode() {
        return this.f44512a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("PagesCalculated(pages=", ")", this.f44512a);
    }
}
