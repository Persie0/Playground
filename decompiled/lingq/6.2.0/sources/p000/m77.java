package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class m77 implements Map, tg4 {

    /* JADX INFO: renamed from: c */
    public static final m77 f50732c = new m77(yba.f69611e, 0);

    /* JADX INFO: renamed from: a */
    public final yba f50733a;

    /* JADX INFO: renamed from: b */
    public final int f50734b;

    public m77(yba ybaVar, int i) {
        this.f50733a = ybaVar;
        this.f50734b = i;
    }

    /* JADX INFO: renamed from: a */
    public o77 mo15966a() {
        return new o77(this);
    }

    /* JADX INFO: renamed from: b */
    public /* bridge */ o77 mo15967b() {
        return mo15966a();
    }

    /* JADX INFO: renamed from: c */
    public final m77 m16667c(Object obj, me5 me5Var) {
        C3126ix c3126ixM25054u = this.f50733a.m25054u(obj, obj != null ? obj.hashCode() : 0, 0, me5Var);
        return c3126ixM25054u == null ? this : new m77((yba) c3126ixM25054u.f44721c, this.f50734b + c3126ixM25054u.f44720b);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f50733a.m25038d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setEntrySet = entrySet();
        if (setEntrySet.isEmpty()) {
            return false;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (fa4.m11650l(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new t77(this, 0);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.f50734b != map.size()) {
            return false;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : setEntrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (fa4.m11650l(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f50733a.m25041g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f50734b == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new t77(this, 1);
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
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f50734b;
    }

    public final String toString() {
        return u91.m22596N0(entrySet(), ", ", "{", "}", new C3741x(this, 1), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new cr5(this, 1);
    }
}
