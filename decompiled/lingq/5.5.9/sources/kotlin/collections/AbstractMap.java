package kotlin.collections;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p100em.InterfaceC5429a;
import p165i0.C6111d;
import p165i0.C6121n;
import p165i0.C6123p;
import p165i0.C6125r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractMap<K, V> implements Map<K, V>, InterfaceC5429a {
    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if (setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (C5207g.m11106a(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new C6121n((C6111d) this);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:0: B:19:0x0038->B:41:?, LOOP_END, SYNTHETIC] */
    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        C6111d c6111d = (C6111d) this;
        Map map = (Map) obj;
        if (c6111d.f35926b != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = c6111d.get(key);
                if (C5207g.m11106a(value, obj2) && (obj2 != null || c6111d.containsKey(key))) {
                    z10 = true;
                }
                if (!z10) {
                    return false;
                }
            }
            z10 = false;
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((C6111d) this).f35926b == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return new C6123p((C6111d) this);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Map
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return ((C6111d) this).f35926b;
    }

    public final String toString() {
        return C6752c.m13430X(entrySet(), ", ", "{", "}", new InterfaceC2052l<Map.Entry<? extends K, ? extends V>, CharSequence>(this) { // from class: kotlin.collections.AbstractMap.toString.1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractMap<K, V> f38028b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.f38028b = this;
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final CharSequence mo528n(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                C5207g.m11111f(entry, "it");
                AbstractMap<K, V> abstractMap = this.f38028b;
                abstractMap.getClass();
                StringBuilder sb2 = new StringBuilder();
                Object key = entry.getKey();
                String strValueOf = "(this Map)";
                sb2.append(key == abstractMap ? strValueOf : String.valueOf(key));
                sb2.append('=');
                Object value = entry.getValue();
                if (value != abstractMap) {
                    strValueOf = String.valueOf(value);
                }
                sb2.append(strValueOf);
                return sb2.toString();
            }
        }, 24);
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return new C6125r((C6111d) this);
    }
}
