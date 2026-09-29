package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ijb implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a */
    public final Comparable f44203a;

    /* JADX INFO: renamed from: b */
    public Object f44204b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hjb f44205c;

    public ijb(hjb hjbVar, Comparable comparable, Object obj) {
        this.f44205c = hjbVar;
        this.f44203a = comparable;
        this.f44204b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f44203a.compareTo(((ijb) obj).f44203a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f44203a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f44204b;
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
    public final /* synthetic */ Object getKey() {
        return this.f44203a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f44204b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f44203a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f44204b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f44205c.m13300f();
        Object obj2 = this.f44204b;
        this.f44204b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f44203a);
        String strValueOf2 = String.valueOf(this.f44204b);
        return AbstractC3393o1.m17739n(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
