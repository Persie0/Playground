package p000;

import androidx.collection.C0038a;
import androidx.collection.C0043f;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class cq5 implements Map, tg4 {

    /* JADX INFO: renamed from: a */
    public final n66 f34383a;

    /* JADX INFO: renamed from: b */
    public C0038a f34384b;

    /* JADX INFO: renamed from: c */
    public C0038a f34385c;

    /* JADX INFO: renamed from: d */
    public C0043f f34386d;

    public cq5(n66 n66Var) {
        n66Var.getClass();
        this.f34383a = n66Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f34383a.m17251c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f34383a.m17252d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0038a c0038a = this.f34384b;
        if (c0038a != null) {
            return c0038a;
        }
        C0038a c0038a2 = new C0038a(this.f34383a, 0);
        this.f34384b = c0038a2;
        return c0038a2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cq5.class != obj.getClass()) {
            return false;
        }
        return fa4.m11650l(this.f34383a, ((cq5) obj).f34383a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f34383a.m17255g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f34383a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f34383a.m17257i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0038a c0038a = this.f34385c;
        if (c0038a != null) {
            return c0038a;
        }
        C0038a c0038a2 = new C0038a(this.f34383a, 1);
        this.f34385c = c0038a2;
        return c0038a2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f34383a.f52403e;
    }

    public final String toString() {
        return this.f34383a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C0043f c0043f = this.f34386d;
        if (c0043f != null) {
            return c0043f;
        }
        C0043f c0043f2 = new C0043f(this.f34383a);
        this.f34386d = c0043f2;
        return c0043f2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
