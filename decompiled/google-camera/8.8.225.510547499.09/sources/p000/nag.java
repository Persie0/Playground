package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
class nag extends mzb implements SortedSet {

    /* JADX INFO: renamed from: a */
    public final naf f41893a;

    public nag(naf nafVar) {
        this.f41893a = nafVar;
    }

    @Override // p000.mzb
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ myy mo17163a() {
        return this.f41893a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f41893a.comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mpw.m16785x(this.f41893a.mo16928j());
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return this.f41893a.mo17016r(obj, 1).mo16920f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new myz(this.f41893a.mo16921g().iterator());
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mpw.m16785x(this.f41893a.mo16929k());
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return this.f41893a.mo16935q(obj, 2, obj2, 1).mo16920f();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return this.f41893a.mo17017s(obj, 2).mo16920f();
    }
}
