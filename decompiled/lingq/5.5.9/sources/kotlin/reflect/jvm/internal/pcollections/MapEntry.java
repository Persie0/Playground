package kotlin.reflect.jvm.internal.pcollections;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class MapEntry<K, V> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final K f39954a;

    /* JADX INFO: renamed from: b */
    public final V f39955b;

    /* JADX WARN: Multi-variable type inference failed */
    public MapEntry(String str, Object obj) {
        this.f39954a = str;
        this.f39955b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MapEntry)) {
            return false;
        }
        MapEntry mapEntry = (MapEntry) obj;
        K k10 = this.f39954a;
        if (k10 == null) {
            if (mapEntry.f39954a != null) {
                return false;
            }
        } else if (!k10.equals(mapEntry.f39954a)) {
            return false;
        }
        V v10 = this.f39955b;
        V v11 = mapEntry.f39955b;
        if (v10 == null) {
            if (v11 != null) {
                return false;
            }
        } else if (!v10.equals(v11)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        K k10 = this.f39954a;
        int iHashCode2 = k10 == null ? 0 : k10.hashCode();
        V v10 = this.f39955b;
        if (v10 != null) {
            iHashCode = v10.hashCode();
        }
        return iHashCode ^ iHashCode2;
    }

    public final String toString() {
        return this.f39954a + "=" + this.f39955b;
    }
}
