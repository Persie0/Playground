package p165i0;

import dm.C5207g;
import java.util.Iterator;
import java.util.Map;
import p126g0.InterfaceC5632b;
import tl.AbstractC9318f;

/* JADX INFO: renamed from: i0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6121n<K, V> extends AbstractC9318f<Map.Entry<? extends K, ? extends V>> implements InterfaceC5632b<Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: a */
    public final C6111d<K, V> f35946a;

    public C6121n(C6111d<K, V> c6111d) {
        C5207g.m11111f(c6111d, "map");
        this.f35946a = c6111d;
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: a */
    public final int mo1847a() {
        C6111d<K, V> c6111d = this.f35946a;
        c6111d.getClass();
        return c6111d.f35926b;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C5207g.m11111f(entry, "element");
        Object key = entry.getKey();
        C6111d<K, V> c6111d = this.f35946a;
        V v10 = c6111d.get(key);
        if (v10 != null) {
            return C5207g.m11106a(v10, entry.getValue());
        }
        if (entry.getValue() == null && c6111d.containsKey(entry.getKey())) {
            z10 = true;
        }
        return z10;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C6122o(this.f35946a.f35925a);
    }
}
