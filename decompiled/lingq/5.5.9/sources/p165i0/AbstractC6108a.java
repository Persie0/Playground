package p165i0;

import dm.C5207g;
import java.util.Map;
import java.util.Map.Entry;
import tl.AbstractC9317e;

/* JADX INFO: renamed from: i0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6108a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC9317e<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C5207g.m11111f(entry, "element");
        Object key = entry.getKey();
        C6113f<K, V> c6113f = ((C6115h) this).f35940a;
        V v10 = c6113f.get(key);
        if (v10 != null) {
            return C5207g.m11106a(v10, entry.getValue());
        }
        return entry.getValue() == null && c6113f.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C5207g.m11111f(entry, "element");
        return ((C6115h) this).f35940a.remove(entry.getKey(), entry.getValue());
    }
}
