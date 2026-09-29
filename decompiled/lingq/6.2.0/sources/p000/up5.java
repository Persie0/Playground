package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class up5 implements Map.Entry, tg4 {

    /* JADX INFO: renamed from: a */
    public final Object f64171a;

    /* JADX INFO: renamed from: b */
    public final Object f64172b;

    public up5(Object obj, Object obj2) {
        this.f64171a = obj;
        this.f64172b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up5)) {
            return false;
        }
        up5 up5Var = (up5) obj;
        return fa4.m11650l(this.f64171a, up5Var.f64171a) && fa4.m11650l(this.f64172b, up5Var.f64172b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f64171a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f64172b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f64171a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f64172b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f64171a + ", value=" + this.f64172b + ')';
    }
}
