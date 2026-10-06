package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mta extends myr {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mtc f41572a;

    public mta(mtc mtcVar) {
        this.f41572a = mtcVar;
    }

    @Override // p000.myr
    /* JADX INFO: renamed from: a */
    public final Map mo16889a() {
        return this.f41572a;
    }

    @Override // p000.myr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return lku.m15652f(this.f41572a.f41576a.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new mtb(this.f41572a);
    }

    @Override // p000.myr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        mtm mtmVar = this.f41572a.f41577b;
        Object key = entry.getKey();
        Map map = mtmVar.f41598a;
        map.getClass();
        try {
            objRemove = map.remove(key);
        } catch (ClassCastException | NullPointerException e) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        mtmVar.f41599b -= size;
        return true;
    }
}
