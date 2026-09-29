package p165i0;

import dm.C5207g;
import java.util.Map;
import p209k0.C6562a;
import p338qd.C8573r0;
import tl.AbstractC9316d;

/* JADX INFO: renamed from: i0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6113f<K, V> extends AbstractC9316d<K, V> {

    /* JADX INFO: renamed from: a */
    public C6111d<K, V> f35930a;

    /* JADX INFO: renamed from: b */
    public C8573r0 f35931b;

    /* JADX INFO: renamed from: c */
    public C6127t<K, V> f35932c;

    /* JADX INFO: renamed from: d */
    public V f35933d;

    /* JADX INFO: renamed from: e */
    public int f35934e;

    /* JADX INFO: renamed from: f */
    public int f35935f;

    public C6113f(C6111d<K, V> c6111d) {
        C5207g.m11111f(c6111d, "map");
        this.f35930a = c6111d;
        this.f35931b = new C8573r0();
        this.f35932c = c6111d.f35925a;
        this.f35935f = c6111d.f35926b;
    }

    /* JADX INFO: renamed from: a */
    public final C6111d<K, V> m12616a() {
        C6127t<K, V> c6127t = this.f35932c;
        C6111d<K, V> c6111d = this.f35930a;
        if (c6127t != c6111d.f35925a) {
            this.f35931b = new C8573r0();
            c6111d = new C6111d<>(this.f35932c, this.f35935f);
        }
        this.f35930a = c6111d;
        return c6111d;
    }

    /* JADX INFO: renamed from: b */
    public final void m12617b(int i10) {
        this.f35935f = i10;
        this.f35934e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C6127t c6127t = C6127t.f35949e;
        C6127t<K, V> c6127t2 = C6127t.f35949e;
        C5207g.m11109d(c6127t2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f35932c = c6127t2;
        m12617b(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f35932c.m12626d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        return (V) this.f35932c.m12629g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        this.f35933d = null;
        this.f35932c = this.f35932c.m12633l(k10 != null ? k10.hashCode() : 0, k10, v10, 0, this);
        return this.f35933d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        int i10;
        int i11;
        C5207g.m11111f(map, "from");
        C6111d<K, V> c6111dM12616a = null;
        C6111d<K, V> c6111d = map instanceof C6111d ? (C6111d) map : null;
        if (c6111d == null) {
            C6113f c6113f = map instanceof C6113f ? (C6113f) map : null;
            if (c6113f != null) {
                c6111dM12616a = c6113f.m12616a();
            }
            if (c6111dM12616a != null) {
                C6562a c6562a = new C6562a(0);
                i10 = this.f35935f;
                C6127t<K, V> c6127t = this.f35932c;
                C6127t<K, V> c6127t2 = c6111dM12616a.f35925a;
                C5207g.m11109d(c6127t2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
                this.f35932c = c6127t.m12634m(c6127t2, 0, c6562a, this);
                i11 = (c6111dM12616a.f35926b + i10) - c6562a.f37361a;
                if (i10 != i11) {
                    m12617b(i11);
                }
            } else {
                super.putAll(map);
            }
        }
        c6111dM12616a = c6111d;
        if (c6111dM12616a != null) {
            C6562a c6562a2 = new C6562a(0);
            i10 = this.f35935f;
            C6127t<K, V> c6127t3 = this.f35932c;
            C6127t<K, V> c6127t4 = c6111dM12616a.f35925a;
            C5207g.m11109d(c6127t4, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.f35932c = c6127t3.m12634m(c6127t4, 0, c6562a2, this);
            i11 = (c6111dM12616a.f35926b + i10) - c6562a2.f37361a;
            if (i10 != i11) {
                m12617b(i11);
            }
        } else {
            super.putAll(map);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        this.f35933d = null;
        C6127t<K, V> c6127tM12635n = this.f35932c.m12635n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (c6127tM12635n == null) {
            C6127t c6127t = C6127t.f35949e;
            c6127tM12635n = C6127t.f35949e;
            C5207g.m11109d(c6127tM12635n, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f35932c = c6127tM12635n;
        return this.f35933d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i10 = this.f35935f;
        C6127t<K, V> c6127tM12636o = this.f35932c.m12636o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (c6127tM12636o == null) {
            C6127t c6127t = C6127t.f35949e;
            c6127tM12636o = C6127t.f35949e;
            C5207g.m11109d(c6127tM12636o, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f35932c = c6127tM12636o;
        return i10 != this.f35935f;
    }
}
