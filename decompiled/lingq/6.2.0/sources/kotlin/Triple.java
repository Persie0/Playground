package kotlin;

import java.io.Serializable;
import p000.fa4;

/* JADX INFO: loaded from: classes.dex */
public final class Triple<A, B, C> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f47633a;

    /* JADX INFO: renamed from: b */
    public final Object f47634b;

    /* JADX INFO: renamed from: c */
    public final Object f47635c;

    public Triple(Object obj, Object obj2, Object obj3) {
        this.f47633a = obj;
        this.f47634b = obj2;
        this.f47635c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return fa4.m11650l(this.f47633a, triple.f47633a) && fa4.m11650l(this.f47634b, triple.f47634b) && fa4.m11650l(this.f47635c, triple.f47635c);
    }

    public final int hashCode() {
        Object obj = this.f47633a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f47634b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f47635c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f47633a + ", " + this.f47634b + ", " + this.f47635c + ')';
    }
}
