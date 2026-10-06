package p000;

import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nah extends nag implements NavigableSet {
    public nah(naf nafVar) {
        super(nafVar);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return mpw.m16784w(this.f41893a.mo17017s(obj, 2).mo16928j());
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new nah(this.f41893a.mo16932n());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return mpw.m16784w(this.f41893a.mo17016r(obj, 2).mo16929k());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new nah(this.f41893a.mo17016r(obj, lku.m15656j(z)));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return mpw.m16784w(this.f41893a.mo17017s(obj, 1).mo16928j());
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return mpw.m16784w(this.f41893a.mo17016r(obj, 1).mo16929k());
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return mpw.m16784w(this.f41893a.mo16930l());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return mpw.m16784w(this.f41893a.mo16931m());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        int iM15656j = lku.m15656j(z2);
        return new nah(this.f41893a.mo16935q(obj, lku.m15656j(z), obj2, iM15656j));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new nah(this.f41893a.mo17017s(obj, lku.m15656j(z)));
    }
}
