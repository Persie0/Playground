package p000;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mum extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mun f41644a;

    public mum(mun munVar) {
        this.f41644a = munVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f41644a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        mun munVar = this.f41644a;
        Map mapM16954k = munVar.m16954k();
        return mapM16954k != null ? mapM16954k.values().iterator() : new muh(munVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f41644a.size();
    }
}
