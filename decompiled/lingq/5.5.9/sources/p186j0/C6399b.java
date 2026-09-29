package p186j0;

import androidx.compose.runtime.Recomposer;
import dm.C5206f;
import dm.C5207g;
import java.util.Iterator;
import p126g0.InterfaceC5635e;
import p165i0.C6111d;
import p165i0.C6127t;
import tl.AbstractC9318f;

/* JADX INFO: renamed from: j0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6399b<E> extends AbstractC9318f<E> implements InterfaceC5635e<E> {

    /* JADX INFO: renamed from: d */
    public static final C6399b f36854d;

    /* JADX INFO: renamed from: a */
    public final Object f36855a;

    /* JADX INFO: renamed from: b */
    public final Object f36856b;

    /* JADX INFO: renamed from: c */
    public final C6111d<E, C6398a> f36857c;

    static {
        C5206f c5206f = C5206f.f33270e;
        C6111d c6111d = C6111d.f35924c;
        C5207g.m11109d(c6111d, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        f36854d = new C6399b(c5206f, c5206f, c6111d);
    }

    public C6399b(Object obj, Object obj2, C6111d<E, C6398a> c6111d) {
        this.f36855a = obj;
        this.f36856b = obj2;
        this.f36857c = c6111d;
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: a */
    public final int mo1847a() {
        C6111d<E, C6398a> c6111d = this.f36857c;
        c6111d.getClass();
        return c6111d.f35926b;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f36857c.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new C6400c(this.f36855a, this.f36857c);
    }

    @Override // java.util.Collection, java.util.Set, p126g0.InterfaceC5635e
    public final C6399b remove(Object obj) {
        C6111d<E, C6398a> c6111dM12613a = this.f36857c;
        C6398a c6398a = c6111dM12613a.get(obj);
        if (c6398a == null) {
            return this;
        }
        int iHashCode = obj != null ? obj.hashCode() : 0;
        C6127t<E, C6398a> c6127t = c6111dM12613a.f35925a;
        C6127t<E, C6398a> c6127tM12643v = c6127t.m12643v(iHashCode, 0, obj);
        if (c6127t != c6127tM12643v) {
            if (c6127tM12643v == null) {
                c6111dM12613a = C6111d.f35924c;
                C5207g.m11109d(c6111dM12613a, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            } else {
                c6111dM12613a = new C6111d<>(c6127tM12643v, c6111dM12613a.f35926b - 1);
            }
        }
        C5206f c5206f = C5206f.f33270e;
        Object obj2 = c6398a.f36852a;
        boolean z10 = obj2 != c5206f;
        Object obj3 = c6398a.f36853b;
        if (z10) {
            C6398a c6398a2 = c6111dM12613a.get(obj2);
            C5207g.m11108c(c6398a2);
            c6111dM12613a = c6111dM12613a.m12613a(obj2, new C6398a(c6398a2.f36852a, obj3));
        }
        if (obj3 != c5206f) {
            C6398a c6398a3 = c6111dM12613a.get(obj3);
            C5207g.m11108c(c6398a3);
            c6111dM12613a = c6111dM12613a.m12613a(obj3, new C6398a(obj2, c6398a3.f36853b));
        }
        Object obj4 = !(obj2 != c5206f) ? obj3 : this.f36855a;
        if (obj3 != c5206f) {
            obj2 = this.f36856b;
        }
        return new C6399b(obj4, obj2, c6111dM12613a);
    }

    @Override // p126g0.InterfaceC5635e
    /* JADX INFO: renamed from: w */
    public final C6399b mo12009w(Recomposer.C0472c c0472c) {
        C6111d<E, C6398a> c6111d = this.f36857c;
        if (c6111d.containsKey(c0472c)) {
            return this;
        }
        if (isEmpty()) {
            return new C6399b(c0472c, c0472c, c6111d.m12613a(c0472c, new C6398a()));
        }
        Object obj = this.f36856b;
        C6398a c6398a = c6111d.get(obj);
        C5207g.m11108c(c6398a);
        return new C6399b(this.f36855a, c0472c, c6111d.m12613a(obj, new C6398a(c6398a.f36852a, c0472c)).m12613a(c0472c, new C6398a(obj, C5206f.f33270e)));
    }
}
