package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class nak extends nan implements Map {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    transient Set f41894a;

    /* JADX INFO: renamed from: b */
    transient Collection f41895b;

    /* JADX INFO: renamed from: c */
    transient Set f41896c;

    public nak(Map map, Object obj) {
        super(map, obj);
    }

    /* JADX INFO: renamed from: a */
    public Map mo17203c() {
        return (Map) this.f41901g;
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.f41902h) {
            mo17203c().clear();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f41902h) {
            zContainsKey = mo17203c().containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f41902h) {
            zContainsValue = mo17203c().containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.f41902h) {
            if (this.f41896c == null) {
                this.f41896c = mpw.m16781t(mo17203c().entrySet(), this.f41902h);
            }
            set = this.f41896c;
        }
        return set;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f41902h) {
            zEquals = mo17203c().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f41902h) {
            obj2 = mo17203c().get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f41902h) {
            iHashCode = mo17203c().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f41902h) {
            zIsEmpty = mo17203c().isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public Set keySet() {
        Set set;
        synchronized (this.f41902h) {
            if (this.f41894a == null) {
                this.f41894a = mpw.m16781t(mo17203c().keySet(), this.f41902h);
            }
            set = this.f41894a;
        }
        return set;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.f41902h) {
            objPut = mo17203c().put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.f41902h) {
            mo17203c().putAll(map);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object objRemove;
        synchronized (this.f41902h) {
            objRemove = mo17203c().remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.f41902h) {
            size = mo17203c().size();
        }
        return size;
    }

    @Override // java.util.Map
    public final Collection values() {
        Collection collection;
        synchronized (this.f41902h) {
            if (this.f41895b == null) {
                this.f41895b = new nai(mo17203c().values(), this.f41902h);
            }
            collection = this.f41895b;
        }
        return collection;
    }
}
