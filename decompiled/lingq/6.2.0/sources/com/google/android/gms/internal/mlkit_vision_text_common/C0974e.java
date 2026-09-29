package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import p000.C3386nv;
import p000.dib;
import p000.mjb;
import p000.slb;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_text_common.e */
/* JADX INFO: loaded from: classes2.dex */
public class C0974e extends AbstractCollection implements List {

    /* JADX INFO: renamed from: a */
    public final Object f12028a;

    /* JADX INFO: renamed from: b */
    public Collection f12029b;

    /* JADX INFO: renamed from: c */
    public final C0974e f12030c;

    /* JADX INFO: renamed from: d */
    public final Collection f12031d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzal f12032e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zzal f12033f;

    public C0974e(zzal zzalVar, Object obj, List list, C0974e c0974e) {
        this.f12033f = zzalVar;
        this.f12032e = zzalVar;
        this.f12028a = obj;
        this.f12029b = list;
        this.f12030c = c0974e;
        this.f12031d = c0974e == null ? null : c0974e.f12029b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f12029b.isEmpty();
        boolean zAdd = this.f12029b.add(obj);
        if (!zAdd || !zIsEmpty) {
            return zAdd;
        }
        m5471d();
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f12029b).addAll(i, collection);
        if (zAddAll) {
            this.f12029b.size();
            if (size == 0) {
                m5471d();
                return true;
            }
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (size() == 0) {
            return;
        }
        this.f12029b.clear();
        m5472f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        zzb();
        return this.f12029b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f12029b.containsAll(collection);
    }

    /* JADX INFO: renamed from: d */
    public final void m5471d() {
        C0974e c0974e = this.f12030c;
        if (c0974e != null) {
            c0974e.m5471d();
            return;
        }
        Map map = this.f12032e.f12070c;
        ((zzba) map).put(this.f12028a, this.f12029b);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f12029b.equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public final void m5472f() {
        C0974e c0974e = this.f12030c;
        if (c0974e != null) {
            c0974e.m5472f();
        } else if (this.f12029b.isEmpty()) {
            ((zzba) this.f12032e.f12070c).remove(this.f12028a);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.f12029b).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        zzb();
        return this.f12029b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f12029b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        zzb();
        return new dib(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f12029b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new slb(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object objRemove = ((List) this.f12029b).remove(i);
        m5472f();
        return objRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        size();
        boolean zRemoveAll = this.f12029b.removeAll(collection);
        if (zRemoveAll) {
            this.f12029b.size();
            m5472f();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        size();
        boolean zRetainAll = this.f12029b.retainAll(collection);
        if (zRetainAll) {
            this.f12029b.size();
            m5472f();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f12029b).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzb();
        return this.f12029b.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        List listSubList = ((List) this.f12029b).subList(i, i2);
        C0974e c0974e = this.f12030c;
        if (c0974e == null) {
            c0974e = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        Object obj = this.f12028a;
        zzal zzalVar = this.f12033f;
        return z ? new mjb(zzalVar, obj, listSubList, c0974e) : new C0974e(zzalVar, obj, listSubList, c0974e);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f12029b.toString();
    }

    public final void zzb() {
        Collection collection;
        C0974e c0974e = this.f12030c;
        if (c0974e != null) {
            c0974e.zzb();
            if (c0974e.f12029b == this.f12031d) {
                return;
            }
            C3386nv.m17619e();
            return;
        }
        if (!this.f12029b.isEmpty() || (collection = (Collection) ((zzba) this.f12032e.f12070c).get(this.f12028a)) == null) {
            return;
        }
        this.f12029b = collection;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new slb(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f12029b.remove(obj);
        if (zRemove) {
            m5472f();
        }
        return zRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean zIsEmpty = this.f12029b.isEmpty();
        ((List) this.f12029b).add(i, obj);
        if (zIsEmpty) {
            m5471d();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f12029b.addAll(collection);
        if (zAddAll) {
            this.f12029b.size();
            if (size == 0) {
                m5471d();
                return true;
            }
        }
        return zAddAll;
    }
}
