package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class muk extends AbstractSet {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mun f41640a;

    public muk(mun munVar) {
        this.f41640a = munVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f41640a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f41640a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        mun munVar = this.f41640a;
        Map mapM16954k = munVar.m16954k();
        return mapM16954k != null ? mapM16954k.keySet().iterator() : new muf(munVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapM16954k = this.f41640a.m16954k();
        if (mapM16954k != null) {
            return mapM16954k.keySet().remove(obj);
        }
        return this.f41640a.m16950g(obj) != mun.f41645a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41640a.size();
    }
}
