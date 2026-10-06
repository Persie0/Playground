package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mvn extends mvq implements Map {
    protected mvn() {
    }

    @Override // p000.mvq
    /* JADX INFO: renamed from: a */
    protected /* bridge */ /* synthetic */ Object mo3816a() {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    protected abstract Map mo15848c();

    public void clear() {
        mo15848c().clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return mo15848c().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return mo15848c().containsValue(obj);
    }

    public Set entrySet() {
        return mo15848c().entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || mo15848c().equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return mo15848c().get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return mo15848c().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return mo15848c().isEmpty();
    }

    public Set keySet() {
        return mo15848c().keySet();
    }

    public Object put(Object obj, Object obj2) {
        return mo15848c().put(obj, obj2);
    }

    public void putAll(Map map) {
        mo15848c().putAll(map);
    }

    public Object remove(Object obj) {
        return mo15848c().remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return mo15848c().size();
    }

    public Collection values() {
        return mo15848c().values();
    }
}
