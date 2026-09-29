package kotlin;

import java.io.Serializable;
import p000.fa4;

/* JADX INFO: loaded from: classes.dex */
public final class Pair<A, B> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f47623a;

    /* JADX INFO: renamed from: b */
    public final Object f47624b;

    public Pair(Object obj, Object obj2) {
        this.f47623a = obj;
        this.f47624b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return fa4.m11650l(this.f47623a, pair.f47623a) && fa4.m11650l(this.f47624b, pair.f47624b);
    }

    public final int hashCode() {
        Object obj = this.f47623a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f47624b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f47623a + ", " + this.f47624b + ')';
    }
}
