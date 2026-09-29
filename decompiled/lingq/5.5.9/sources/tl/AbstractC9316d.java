package tl;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p100em.InterfaceC5432d;
import p165i0.C6113f;
import p165i0.C6115h;
import p165i0.C6117j;
import p165i0.C6119l;

/* JADX INFO: renamed from: tl.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9316d<K, V> extends AbstractMap<K, V> implements Map<K, V>, InterfaceC5432d {
    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new C6115h((C6113f) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return new C6117j((C6113f) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return ((C6113f) this).f35935f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        return new C6119l((C6113f) this);
    }
}
