package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class po6 extends qo6 {

    /* JADX INFO: renamed from: a */
    public final List f56589a;

    public po6(List list) {
        list.getClass();
        this.f56589a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof po6) && fa4.m11650l(this.f56589a, ((po6) obj).f56589a);
    }

    public final int hashCode() {
        return this.f56589a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("Success(notifications=", ")", this.f56589a);
    }
}
