package com.google.common.collect;

import dm.C5206f;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p001a0.C0005d;
import p338qd.C8573r0;
import p482xd.InterfaceC10173e;

/* JADX INFO: renamed from: com.google.common.collect.e */
/* JADX INFO: loaded from: classes.dex */
public class C3184e<E> extends AbstractCollection<E> {

    /* JADX INFO: renamed from: a */
    public final Collection<E> f16153a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10173e<? super E> f16154b;

    public C3184e(Collection<E> collection, InterfaceC10173e<? super E> interfaceC10173e) {
        this.f16153a = collection;
        this.f16154b = interfaceC10173e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e10) {
        C8573r0.m16681K(this.f16154b.apply(e10));
        return this.f16153a.add(e10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            C8573r0.m16681K(this.f16154b.apply(it.next()));
        }
        return this.f16153a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Collection<E> collection = this.f16153a;
        boolean z10 = collection instanceof RandomAccess;
        InterfaceC10173e<? super E> interfaceC10173e = this.f16154b;
        if (!z10 || !(collection instanceof List)) {
            Iterator<T> it = collection.iterator();
            interfaceC10173e.getClass();
            while (it.hasNext()) {
                if (interfaceC10173e.apply((Object) it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        interfaceC10173e.getClass();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            C0005d c0005d = (Object) list.get(i11);
            if (!interfaceC10173e.apply(c0005d)) {
                if (i11 > i10) {
                    try {
                        list.set(i10, c0005d);
                    } catch (IllegalArgumentException unused) {
                        C5206f.m11022s1(list, interfaceC10173e, i10, i11);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        C5206f.m11022s1(list, interfaceC10173e, i10, i11);
                        return;
                    }
                }
                i10++;
            }
        }
        list.subList(i10, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        boolean zContains;
        Collection<E> collection = this.f16153a;
        collection.getClass();
        try {
            zContains = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f16154b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Iterator<T> it = this.f16153a.iterator();
        InterfaceC10173e<? super E> interfaceC10173e = this.f16154b;
        C8573r0.m16685M(interfaceC10173e, "predicate");
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (interfaceC10173e.apply((Object) it.next())) {
                break;
            }
            i10++;
        }
        return true ^ (i10 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.f16153a.iterator();
        it.getClass();
        InterfaceC10173e<? super E> interfaceC10173e = this.f16154b;
        interfaceC10173e.getClass();
        return new C3194m(it, interfaceC10173e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f16153a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.f16153a.iterator();
        boolean z10 = false;
        while (true) {
            while (it.hasNext()) {
                E next = it.next();
                if (this.f16154b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.f16153a.iterator();
        boolean z10 = false;
        while (true) {
            while (it.hasNext()) {
                E next = it.next();
                if (this.f16154b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.f16153a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f16154b.apply(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        C3194m c3194m = (C3194m) iterator();
        ArrayList arrayList = new ArrayList();
        while (c3194m.hasNext()) {
            arrayList.add(c3194m.next());
        }
        return arrayList.toArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C3194m c3194m = (C3194m) iterator();
        ArrayList arrayList = new ArrayList();
        while (c3194m.hasNext()) {
            arrayList.add(c3194m.next());
        }
        return (T[]) arrayList.toArray(tArr);
    }
}
