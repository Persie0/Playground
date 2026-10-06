package p000;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mvt extends mvs implements SortedSet {
    protected mvt() {
    }

    @Override // p000.mvs
    /* JADX INFO: renamed from: c */
    protected /* bridge */ /* synthetic */ Set mo16874c() {
        throw null;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return mo17032e().comparator();
    }

    /* JADX INFO: renamed from: e */
    protected abstract SortedSet mo17032e();

    @Override // java.util.SortedSet
    public final Object first() {
        return mo17032e().first();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return mo17032e().headSet(obj);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo17032e().last();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return mo17032e().subSet(obj, obj2);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return mo17032e().tailSet(obj);
    }
}
