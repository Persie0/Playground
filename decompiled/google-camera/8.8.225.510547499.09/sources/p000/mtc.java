package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mtc extends myu {

    /* JADX INFO: renamed from: a */
    final transient Map f41576a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mtm f41577b;

    public mtc(mtm mtmVar, Map map) {
        this.f41577b = mtmVar;
        this.f41576a = map;
    }

    @Override // p000.myu
    /* JADX INFO: renamed from: a */
    public final Set mo16890a() {
        return new mta(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.f41576a;
        mtm mtmVar = this.f41577b;
        if (map == mtmVar.f41598a) {
            mtmVar.mo16906j();
        } else {
            mkv.m16511S(new mtb(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f41576a;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f41576a.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) mkv.m16561z(this.f41576a, obj);
        if (collection == null) {
            return null;
        }
        return this.f41577b.mo16886c(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f41576a.hashCode();
    }

    @Override // p000.myu, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f41577b.mo16913r();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f41576a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionMo16884a = this.f41577b.mo16884a();
        collectionMo16884a.addAll(collection);
        mtm.m16900o(this.f41577b, collection.size());
        collection.clear();
        return collectionMo16884a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f41576a.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f41576a.toString();
    }
}
