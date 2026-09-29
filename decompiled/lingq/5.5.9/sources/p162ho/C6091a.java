package p162ho;

import dm.C5207g;

/* JADX INFO: renamed from: ho.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6091a<T> {

    /* JADX INFO: renamed from: a */
    public final T f35844a;

    /* JADX INFO: renamed from: b */
    public final T f35845b;

    public C6091a(T t10, T t11) {
        this.f35844a = t10;
        this.f35845b = t11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6091a)) {
            return false;
        }
        C6091a c6091a = (C6091a) obj;
        if (C5207g.m11106a(this.f35844a, c6091a.f35844a) && C5207g.m11106a(this.f35845b, c6091a.f35845b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        T t10 = this.f35844a;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f35845b;
        return iHashCode + (t11 != null ? t11.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f35844a + ", upper=" + this.f35845b + ')';
    }
}
