package p000;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ole implements Map.Entry {

    /* JADX INFO: renamed from: a */
    private final olh f46237a;

    /* JADX INFO: renamed from: b */
    private final int f46238b;

    public ole(olh olhVar, int i) {
        this.f46237a = olhVar;
        this.f46238b = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ooc.m18737c(entry.getKey(), getKey()) && ooc.m18737c(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f46237a.f46243a[this.f46238b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f46237a.f46244b;
        objArr.getClass();
        return objArr[this.f46238b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f46237a.m18628f();
        Object[] objArrM18632j = this.f46237a.m18632j();
        int i = this.f46238b;
        Object obj2 = objArrM18632j[i];
        objArrM18632j[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
