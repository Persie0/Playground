package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class nb9 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a */
    public final Comparable f52571a;

    /* JADX INFO: renamed from: b */
    public Object f52572b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kb9 f52573c;

    public nb9(kb9 kb9Var, Map.Entry entry) {
        this(kb9Var, (Comparable) entry.getKey(), entry.getValue());
    }

    /* JADX INFO: renamed from: a */
    public final Comparable m17317a() {
        return this.f52571a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f52571a.compareTo(((nb9) obj).f52571a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f52571a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f52572b;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f52571a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f52572b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f52571a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f52572b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f52573c.m15052b();
        Object obj2 = this.f52572b;
        this.f52572b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f52571a + "=" + this.f52572b;
    }

    public nb9(kb9 kb9Var, Comparable comparable, Object obj) {
        this.f52573c = kb9Var;
        this.f52571a = comparable;
        this.f52572b = obj;
    }
}
