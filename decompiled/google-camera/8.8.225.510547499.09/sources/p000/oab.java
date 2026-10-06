package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class oab extends AbstractList implements RandomAccess, nyj {

    /* JADX INFO: renamed from: a */
    public final nyj f45119a;

    public oab(nyj nyjVar) {
        this.f45119a = nyjVar;
    }

    @Override // p000.nyj
    /* JADX INFO: renamed from: d */
    public final nyj mo18174d() {
        return this;
    }

    @Override // p000.nyj
    /* JADX INFO: renamed from: f */
    public final Object mo18175f(int i) {
        return this.f45119a.mo18175f(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((nyi) this.f45119a).get(i);
    }

    @Override // p000.nyj
    /* JADX INFO: renamed from: h */
    public final List mo18177h() {
        return this.f45119a.mo18177h();
    }

    @Override // p000.nyj
    /* JADX INFO: renamed from: i */
    public final void mo18178i(nwr nwrVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new oaa(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new nzz(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45119a.size();
    }
}
