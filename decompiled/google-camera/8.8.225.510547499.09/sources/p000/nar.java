package p000;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class nar extends nap implements SortedSet {
    private static final long serialVersionUID = 0;

    public nar(SortedSet sortedSet, Object obj) {
        super(sortedSet, obj);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        Comparator comparator;
        synchronized (this.f41902h) {
            comparator = mo17199a().comparator();
        }
        return comparator;
    }

    @Override // p000.nap
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SortedSet mo17206d() {
        return (SortedSet) super.mo17206d();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Object objFirst;
        synchronized (this.f41902h) {
            objFirst = mo17199a().first();
        }
        return objFirst;
    }

    public SortedSet headSet(Object obj) {
        SortedSet sortedSetM16783v;
        synchronized (this.f41902h) {
            sortedSetM16783v = mpw.m16783v(mo17199a().headSet(obj), this.f41902h);
        }
        return sortedSetM16783v;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        Object objLast;
        synchronized (this.f41902h) {
            objLast = mo17199a().last();
        }
        return objLast;
    }

    public SortedSet subSet(Object obj, Object obj2) {
        SortedSet sortedSetM16783v;
        synchronized (this.f41902h) {
            sortedSetM16783v = mpw.m16783v(mo17199a().subSet(obj, obj2), this.f41902h);
        }
        return sortedSetM16783v;
    }

    public SortedSet tailSet(Object obj) {
        SortedSet sortedSetM16783v;
        synchronized (this.f41902h) {
            sortedSetM16783v = mpw.m16783v(mo17199a().tailSet(obj), this.f41902h);
        }
        return sortedSetM16783v;
    }
}
