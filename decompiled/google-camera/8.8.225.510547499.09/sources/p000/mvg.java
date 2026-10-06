package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mvg extends muu {
    public mvg(mve mveVar) {
        super(mveVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // p000.mwj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // p000.mxt
    /* JADX INFO: renamed from: cq */
    public final naz descendingIterator() {
        return myc.f41797a;
    }

    @Override // p000.mxt, p000.mxk, p000.mwj
    /* JADX INFO: renamed from: cr */
    public final naz listIterator() {
        return myc.f41797a;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return false;
    }

    @Override // p000.muu
    /* JADX INFO: renamed from: d */
    public final muu mo16982d(Comparable comparable, boolean z) {
        return this;
    }

    @Override // p000.mxt, java.util.NavigableSet
    public final /* synthetic */ Iterator descendingIterator() {
        return myc.f41797a;
    }

    @Override // p000.mxk, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    @Override // p000.mxt, java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object first() {
        throw new NoSuchElementException();
    }

    @Override // p000.muu
    /* JADX INFO: renamed from: g */
    public final muu mo16985g(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        return this;
    }

    @Override // p000.mxk, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return true;
    }

    @Override // p000.mxt, p000.mxk, p000.mwj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: iterator */
    public final /* synthetic */ Iterator listIterator() {
        return myc.f41797a;
    }

    @Override // p000.muu
    /* JADX INFO: renamed from: j */
    public final muu mo16988j(Comparable comparable, boolean z) {
        return this;
    }

    @Override // p000.muu, p000.mxt
    /* JADX INFO: renamed from: k */
    public final mxt mo16989k() {
        return mxt.m17155Q(mzz.f41883a);
    }

    @Override // p000.mxt, java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object last() {
        throw new NoSuchElementException();
    }

    @Override // p000.muu, p000.mxt
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ mxt mo16992n(Object obj, boolean z) {
        return this;
    }

    @Override // p000.muu, p000.mxt
    /* JADX INFO: renamed from: q */
    public final /* bridge */ /* synthetic */ mxt mo16995q(Object obj, boolean z, Object obj2, boolean z2) {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    @Override // p000.muu, p000.mxt
    /* JADX INFO: renamed from: t */
    public final /* bridge */ /* synthetic */ mxt mo16998t(Object obj, boolean z) {
        return this;
    }

    @Override // p000.muu, java.util.AbstractCollection
    public final String toString() {
        return "[]";
    }

    @Override // p000.muu
    /* JADX INFO: renamed from: u */
    public final mzj mo16999u() {
        throw new NoSuchElementException();
    }

    @Override // p000.mxk, p000.mwj
    /* JADX INFO: renamed from: v */
    public final mws mo17025v() {
        int i = mws.f41739d;
        return mzr.f41857a;
    }

    @Override // p000.mxk
    /* JADX INFO: renamed from: w */
    public final boolean mo17026w() {
        return true;
    }

    @Override // p000.mxt, p000.mxk, p000.mwj
    Object writeReplace() {
        return new mvf(this.f41669a);
    }
}
