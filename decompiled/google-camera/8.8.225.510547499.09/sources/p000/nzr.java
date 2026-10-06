package p000;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nzr implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a */
    public final Comparable f45087a;

    /* JADX INFO: renamed from: b */
    public Object f45088b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ nzu f45089c;

    public nzr(nzu nzuVar, Comparable comparable, Object obj) {
        this.f45089c = nzuVar;
        this.f45087a = comparable;
        this.f45088b = obj;
    }

    /* JADX INFO: renamed from: a */
    private static final boolean m18317a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f45087a.compareTo(((nzr) obj).f45087a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m18317a(this.f45087a, entry.getKey()) && m18317a(this.f45088b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f45087a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f45088b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f45087a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f45088b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f45089c.m18327g();
        Object obj2 = this.f45088b;
        this.f45088b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f45087a) + "=" + String.valueOf(this.f45088b);
    }
}
