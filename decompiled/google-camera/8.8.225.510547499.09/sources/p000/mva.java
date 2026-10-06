package p000;

import java.util.NavigableSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mva extends mxt {

    /* JADX INFO: renamed from: a */
    private final mxt f41673a;

    public mva(mxt mxtVar) {
        super(mzh.m17166b(mxtVar.f41779b).mo17165a());
        this.f41673a = mxtVar;
    }

    @Override // p000.mxt, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return this.f41673a.floor(obj);
    }

    @Override // p000.mwj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f41673a.contains(obj);
    }

    @Override // p000.mxt
    /* JADX INFO: renamed from: cp */
    public final mxt descendingSet() {
        return this.f41673a;
    }

    @Override // p000.mxt, java.util.NavigableSet
    /* JADX INFO: renamed from: cq */
    public final naz descendingIterator() {
        return this.f41673a.listIterator();
    }

    @Override // p000.mxt, p000.mxk, p000.mwj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: cr */
    public final naz listIterator() {
        return this.f41673a.descendingIterator();
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return this.f41673a.mo17014cs();
    }

    @Override // p000.mxt, java.util.NavigableSet
    public final /* synthetic */ NavigableSet descendingSet() {
        return this.f41673a;
    }

    @Override // p000.mxt, java.util.NavigableSet
    public final Object floor(Object obj) {
        return this.f41673a.ceiling(obj);
    }

    @Override // p000.mxt, java.util.NavigableSet
    public final Object higher(Object obj) {
        return this.f41673a.lower(obj);
    }

    @Override // p000.mxt
    /* JADX INFO: renamed from: k */
    public final mxt mo16989k() {
        throw new AssertionError("should never be called");
    }

    @Override // p000.mxt, java.util.NavigableSet
    public final Object lower(Object obj) {
        return this.f41673a.higher(obj);
    }

    @Override // p000.mxt
    /* JADX INFO: renamed from: n */
    public final mxt mo16992n(Object obj, boolean z) {
        return this.f41673a.tailSet(obj, z).descendingSet();
    }

    @Override // p000.mxt
    /* JADX INFO: renamed from: q */
    public final mxt mo16995q(Object obj, boolean z, Object obj2, boolean z2) {
        return this.f41673a.subSet(obj2, z2, obj, z).descendingSet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41673a.size();
    }

    @Override // p000.mxt
    /* JADX INFO: renamed from: t */
    public final mxt mo16998t(Object obj, boolean z) {
        return this.f41673a.mo16991m(obj, z).descendingSet();
    }
}
