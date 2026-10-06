package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class mti extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    final Object f41590a;

    /* JADX INFO: renamed from: b */
    Collection f41591b;

    /* JADX INFO: renamed from: c */
    final mti f41592c;

    /* JADX INFO: renamed from: d */
    final Collection f41593d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ mtm f41594e;

    public mti(mtm mtmVar, Object obj, Collection collection, mti mtiVar) {
        this.f41594e = mtmVar;
        this.f41590a = obj;
        this.f41591b = collection;
        this.f41592c = mtiVar;
        this.f41593d = mtiVar == null ? null : mtiVar.f41591b;
    }

    /* JADX INFO: renamed from: a */
    final void m16892a() {
        mti mtiVar = this.f41592c;
        if (mtiVar != null) {
            mtiVar.m16892a();
        } else {
            this.f41594e.f41598a.put(this.f41590a, this.f41591b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        m16893b();
        boolean zIsEmpty = this.f41591b.isEmpty();
        boolean zAdd = this.f41591b.add(obj);
        if (!zAdd) {
            return zAdd;
        }
        mtm.m16897l(this.f41594e);
        if (!zIsEmpty) {
            return zAdd;
        }
        m16892a();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f41591b.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        mtm.m16899n(this.f41594e, this.f41591b.size() - size);
        if (size != 0) {
            return zAddAll;
        }
        m16892a();
        return true;
    }

    /* JADX INFO: renamed from: b */
    final void m16893b() {
        Collection collection;
        mti mtiVar = this.f41592c;
        if (mtiVar != null) {
            mtiVar.m16893b();
            if (this.f41592c.f41591b != this.f41593d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f41591b.isEmpty() || (collection = (Collection) this.f41594e.f41598a.get(this.f41590a)) == null) {
                return;
            }
            this.f41591b = collection;
        }
    }

    /* JADX INFO: renamed from: c */
    final void m16894c() {
        mti mtiVar = this.f41592c;
        if (mtiVar != null) {
            mtiVar.m16894c();
        } else if (this.f41591b.isEmpty()) {
            this.f41594e.f41598a.remove(this.f41590a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f41591b.clear();
        mtm.m16900o(this.f41594e, size);
        m16894c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        m16893b();
        return this.f41591b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        m16893b();
        return this.f41591b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m16893b();
        return this.f41591b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        m16893b();
        return this.f41591b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        m16893b();
        return new mth(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        m16893b();
        boolean zRemove = this.f41591b.remove(obj);
        if (zRemove) {
            mtm.m16898m(this.f41594e);
            m16894c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f41591b.removeAll(collection);
        if (zRemoveAll) {
            mtm.m16899n(this.f41594e, this.f41591b.size() - size);
            m16894c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f41591b.retainAll(collection);
        if (zRetainAll) {
            mtm.m16899n(this.f41594e, this.f41591b.size() - size);
            m16894c();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        m16893b();
        return this.f41591b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m16893b();
        return this.f41591b.toString();
    }
}
