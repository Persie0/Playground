package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class pp5 implements Map.Entry, wg4 {

    /* JADX INFO: renamed from: a */
    public final MapBuilder f56633a;

    /* JADX INFO: renamed from: b */
    public final int f56634b;

    /* JADX INFO: renamed from: c */
    public final int f56635c;

    public pp5(MapBuilder mapBuilder, int i) {
        mapBuilder.getClass();
        this.f56633a = mapBuilder;
        this.f56634b = i;
        this.f56635c = mapBuilder.f47668h;
    }

    /* JADX INFO: renamed from: a */
    public final void m19437a() {
        if (this.f56633a.f47668h != this.f56635c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return fa4.m11650l(entry.getKey(), getKey()) && fa4.m11650l(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m19437a();
        return this.f56633a.f47661a[this.f56634b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m19437a();
        Object[] objArr = this.f56633a.f47662b;
        objArr.getClass();
        return objArr[this.f56634b];
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
        m19437a();
        MapBuilder mapBuilder = this.f56633a;
        mapBuilder.m15393c();
        Object[] objArr = mapBuilder.f47662b;
        if (objArr == null) {
            int length = mapBuilder.f47661a.length;
            if (length < 0) {
                C3386nv.m17626m("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            mapBuilder.f47662b = objArr;
        }
        int i = this.f56634b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
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
