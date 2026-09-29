package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class p62 extends eh0 implements Map {

    /* JADX INFO: renamed from: P */
    public final Map f55631P;

    public p62(Map map) {
        this.f55631P = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f55631P.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f55631P.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((d09) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return r2d.m20263c(this.f55631P.entrySet(), new o62(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && xnb.m24620a(obj, this);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f55631P.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return r2d.m20264d(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f55631P;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return r2d.m20263c(this.f55631P.keySet(), new o62(1));
    }

    @Override // p000.eh0
    /* JADX INFO: renamed from: n */
    public final Object mo53n() {
        return this.f55631P;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f55631P.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f55631P.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f55631P.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f55631P;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f55631P.values();
    }
}
