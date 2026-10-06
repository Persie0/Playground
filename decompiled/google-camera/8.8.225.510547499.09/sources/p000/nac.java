package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nac extends mvt implements NavigableSet, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    private final NavigableSet f41889a;

    /* JADX INFO: renamed from: b */
    private final SortedSet f41890b;

    /* JADX INFO: renamed from: c */
    private transient nac f41891c;

    public nac(NavigableSet navigableSet) {
        navigableSet.getClass();
        this.f41889a = navigableSet;
        this.f41890b = Collections.unmodifiableSortedSet(navigableSet);
    }

    @Override // p000.mvl, p000.mvq
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object mo3817b() {
        return this.f41890b;
    }

    @Override // p000.mvs, p000.mvl
    /* JADX INFO: renamed from: b */
    protected final /* synthetic */ Collection mo3817b() {
        return this.f41890b;
    }

    @Override // p000.mvt, p000.mvs
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ Set mo3816a() {
        return this.f41890b;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return this.f41889a.ceiling(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return mkv.m16507O(this.f41889a.descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        nac nacVar = this.f41891c;
        if (nacVar != null) {
            return nacVar;
        }
        nac nacVar2 = new nac(this.f41889a.descendingSet());
        this.f41891c = nacVar2;
        nacVar2.f41891c = this;
        return nacVar2;
    }

    @Override // p000.mvt
    /* JADX INFO: renamed from: e */
    protected final SortedSet mo17032e() {
        return this.f41890b;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return this.f41889a.floor(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return mpw.m16751C(this.f41889a.headSet(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return this.f41889a.higher(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return this.f41889a.lower(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return mpw.m16751C(this.f41889a.subSet(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return mpw.m16751C(this.f41889a.tailSet(obj, z));
    }
}
