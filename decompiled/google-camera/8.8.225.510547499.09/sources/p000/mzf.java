package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class mzf extends mvp implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final myy f41836a;

    /* JADX INFO: renamed from: b */
    transient Set f41837b;

    /* JADX INFO: renamed from: c */
    transient Set f41838c;

    public mzf(myy myyVar) {
        this.f41836a = myyVar;
    }

    @Override // p000.mvl, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.mvl, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public Set mo17164c() {
        return Collections.unmodifiableSet(this.f41836a.mo16920f());
    }

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.mvp, p000.myy
    /* JADX INFO: renamed from: d */
    public final int mo16918d(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.mvp, p000.myy
    /* JADX INFO: renamed from: f */
    public Set mo16920f() {
        Set set = this.f41837b;
        if (set != null) {
            return set;
        }
        Set setMo17164c = mo17164c();
        this.f41837b = setMo17164c;
        return setMo17164c;
    }

    @Override // p000.mvp, p000.myy
    /* JADX INFO: renamed from: g */
    public final Set mo16921g() {
        Set set = this.f41838c;
        if (set != null) {
            return set;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(this.f41836a.mo16921g());
        this.f41838c = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    @Override // p000.mvp, p000.myy
    /* JADX INFO: renamed from: h */
    public final void mo16922h(Object obj, int i) {
        throw null;
    }

    @Override // p000.mvp, p000.myy
    /* JADX INFO: renamed from: i */
    public final boolean mo16923i(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.mvl, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return mkv.m16507O(this.f41836a.iterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.mvp, p000.mvl
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public myy mo3817b() {
        return this.f41836a;
    }

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }
}
