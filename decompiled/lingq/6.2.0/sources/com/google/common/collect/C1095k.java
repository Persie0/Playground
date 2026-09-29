package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p000.C0831c1;
import p000.C3386nv;

/* JADX INFO: renamed from: com.google.common.collect.k */
/* JADX INFO: loaded from: classes2.dex */
public class C1095k extends AbstractCollection implements List {

    /* JADX INFO: renamed from: a */
    public final Object f13466a;

    /* JADX INFO: renamed from: b */
    public Collection f13467b;

    /* JADX INFO: renamed from: c */
    public final C1095k f13468c;

    /* JADX INFO: renamed from: d */
    public final Collection f13469d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractMapBasedMultimap f13470e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractMapBasedMultimap f13471f;

    public C1095k(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, List list, C1095k c1095k) {
        this.f13471f = abstractMapBasedMultimap;
        this.f13470e = abstractMapBasedMultimap;
        this.f13466a = obj;
        this.f13467b = list;
        this.f13468c = c1095k;
        this.f13469d = c1095k == null ? null : c1095k.f13467b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m6337f();
        boolean zIsEmpty = this.f13467b.isEmpty();
        boolean zAdd = this.f13467b.add(obj);
        if (zAdd) {
            this.f13470e.f13382e++;
            if (zIsEmpty) {
                m6336d();
            }
        }
        return zAdd;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f13467b).addAll(i, collection);
        if (zAddAll) {
            this.f13471f.f13382e += this.f13467b.size() - size;
            if (size == 0) {
                m6336d();
            }
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f13467b.clear();
        this.f13470e.f13382e -= size;
        m6338g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        m6337f();
        return this.f13467b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        m6337f();
        return this.f13467b.containsAll(collection);
    }

    /* JADX INFO: renamed from: d */
    public final void m6336d() {
        C1095k c1095k = this.f13468c;
        if (c1095k != null) {
            c1095k.m6336d();
        } else {
            this.f13470e.f13381d.put(this.f13466a, this.f13467b);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m6337f();
        return this.f13467b.equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public final void m6337f() {
        Collection collection;
        C1095k c1095k = this.f13468c;
        if (c1095k != null) {
            c1095k.m6337f();
            if (c1095k.f13467b == this.f13469d) {
                return;
            }
            C3386nv.m17619e();
            return;
        }
        if (!this.f13467b.isEmpty() || (collection = (Collection) this.f13470e.f13381d.get(this.f13466a)) == null) {
            return;
        }
        this.f13467b = collection;
    }

    /* JADX INFO: renamed from: g */
    public final void m6338g() {
        C1095k c1095k = this.f13468c;
        if (c1095k != null) {
            c1095k.m6338g();
        } else if (this.f13467b.isEmpty()) {
            this.f13470e.f13381d.remove(this.f13466a);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        m6337f();
        return ((List) this.f13467b).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        m6337f();
        return this.f13467b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m6337f();
        return ((List) this.f13467b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        m6337f();
        return new C1086b(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m6337f();
        return ((List) this.f13467b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        m6337f();
        return new C1094j(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m6337f();
        boolean zRemove = this.f13467b.remove(obj);
        if (zRemove) {
            this.f13470e.f13382e--;
            m6338g();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f13467b.removeAll(collection);
        if (zRemoveAll) {
            this.f13470e.f13382e += this.f13467b.size() - size;
            m6338g();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f13467b.retainAll(collection);
        if (zRetainAll) {
            this.f13470e.f13382e += this.f13467b.size() - size;
            m6338g();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        m6337f();
        return ((List) this.f13467b).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        m6337f();
        return this.f13467b.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        m6337f();
        List listSubList = ((List) this.f13467b).subList(i, i2);
        C1095k c1095k = this.f13468c;
        if (c1095k == null) {
            c1095k = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.f13471f;
        Object obj = this.f13466a;
        return z ? new C0831c1(abstractMapBasedMultimap, obj, listSubList, c1095k) : new C1095k(abstractMapBasedMultimap, obj, listSubList, c1095k);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m6337f();
        return this.f13467b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m6337f();
        return new C1094j(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m6337f();
        Object objRemove = ((List) this.f13467b).remove(i);
        this.f13471f.f13382e--;
        m6338g();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m6337f();
        boolean zIsEmpty = this.f13467b.isEmpty();
        ((List) this.f13467b).add(i, obj);
        this.f13471f.f13382e++;
        if (zIsEmpty) {
            m6336d();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f13467b.addAll(collection);
        if (zAddAll) {
            this.f13470e.f13382e += this.f13467b.size() - size;
            if (size == 0) {
                m6336d();
            }
        }
        return zAddAll;
    }
}
