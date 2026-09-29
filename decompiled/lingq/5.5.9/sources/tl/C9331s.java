package tl;

import dm.C5207g;

/* JADX INFO: renamed from: tl.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C9331s<T> {

    /* JADX INFO: renamed from: a */
    public final int f48066a;

    /* JADX INFO: renamed from: b */
    public final T f48067b;

    public C9331s(int i10, T t10) {
        this.f48066a = i10;
        this.f48067b = t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9331s)) {
            return false;
        }
        C9331s c9331s = (C9331s) obj;
        return this.f48066a == c9331s.f48066a && C5207g.m11106a(this.f48067b, c9331s.f48067b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f48066a) * 31;
        T t10 = this.f48067b;
        return iHashCode + (t10 == null ? 0 : t10.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f48066a + ", value=" + this.f48067b + ')';
    }
}
