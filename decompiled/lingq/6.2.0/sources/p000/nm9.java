package p000;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes.dex */
public final class nm9 implements List, vg4 {

    /* JADX INFO: renamed from: a */
    public final SnapshotStateList f52970a;

    /* JADX INFO: renamed from: b */
    public final int f52971b;

    /* JADX INFO: renamed from: c */
    public int f52972c;

    /* JADX INFO: renamed from: d */
    public int f52973d;

    public nm9(SnapshotStateList snapshotStateList, int i, int i2) {
        this.f52970a = snapshotStateList;
        this.f52971b = i;
        this.f52972c = AbstractC3584sr.m21599J(snapshotStateList);
        this.f52973d = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        m17498d();
        int i = this.f52971b + this.f52973d;
        SnapshotStateList snapshotStateList = this.f52970a;
        snapshotStateList.add(i, obj);
        this.f52973d++;
        this.f52972c = AbstractC3584sr.m21599J(snapshotStateList);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        m17498d();
        int i2 = i + this.f52971b;
        SnapshotStateList snapshotStateList = this.f52970a;
        boolean zAddAll = snapshotStateList.addAll(i2, collection);
        if (zAddAll) {
            this.f52973d = collection.size() + this.f52973d;
            this.f52972c = AbstractC3584sr.m21599J(snapshotStateList);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f52973d > 0) {
            m17498d();
            int i = this.f52973d;
            int i2 = this.f52971b;
            SnapshotStateList snapshotStateList = this.f52970a;
            snapshotStateList.m1312h(i2, i + i2);
            this.f52973d = 0;
            this.f52972c = AbstractC3584sr.m21599J(snapshotStateList);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m17498d() {
        if (AbstractC3584sr.m21599J(this.f52970a) == this.f52972c) {
            return;
        }
        C3386nv.m17619e();
    }

    @Override // java.util.List
    public final Object get(int i) {
        m17498d();
        AbstractC3584sr.m21640r(i, this.f52973d);
        return this.f52970a.get(this.f52971b + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m17498d();
        int i = this.f52973d;
        int i2 = this.f52971b;
        Iterator it = l70.m15922M(i2, i + i2).iterator();
        while (((h84) it).f41941c) {
            int iNextInt = ((a84) it).nextInt();
            if (fa4.m11650l(obj, this.f52970a.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f52973d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m17498d();
        int i = this.f52973d;
        int i2 = this.f52971b;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (fa4.m11650l(obj, this.f52970a.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m17498d();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f47716a = i - 1;
        return new mm9(ref$IntRef, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m17498d();
        int i2 = this.f52971b + i;
        SnapshotStateList snapshotStateList = this.f52970a;
        Object objRemove = snapshotStateList.remove(i2);
        this.f52973d--;
        this.f52972c = AbstractC3584sr.m21599J(snapshotStateList);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        AbstractC3096i1 abstractC3096i1;
        jc9 jc9VarM17358j;
        boolean zM21641s;
        m17498d();
        SnapshotStateList snapshotStateList = this.f52970a;
        int i2 = this.f52971b;
        int i3 = this.f52973d + i2;
        int size = snapshotStateList.size();
        do {
            synchronized (AbstractC3584sr.f61285l) {
                lh9 lh9Var = snapshotStateList.f3798a;
                lh9Var.getClass();
                lh9 lh9Var2 = (lh9) nc9.m17356h(lh9Var);
                i = lh9Var2.f49673d;
                abstractC3096i1 = lh9Var2.f49672c;
            }
            abstractC3096i1.getClass();
            x77 x77VarMo13607i = abstractC3096i1.mo13607i();
            x77VarMo13607i.subList(i2, i3).retainAll(collection);
            AbstractC3096i1 abstractC3096i1M24385g = x77VarMo13607i.m24385g();
            if (fa4.m11650l(abstractC3096i1M24385g, abstractC3096i1)) {
                break;
            }
            lh9 lh9Var3 = snapshotStateList.f3798a;
            lh9Var3.getClass();
            synchronized (nc9.f52602c) {
                jc9VarM17358j = nc9.m17358j();
                zM21641s = AbstractC3584sr.m21641s((lh9) nc9.m17371w(lh9Var3, snapshotStateList, jc9VarM17358j), i, abstractC3096i1M24385g, true);
            }
            nc9.m17362n(jc9VarM17358j, snapshotStateList);
        } while (!zM21641s);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.f52972c = AbstractC3584sr.m21599J(this.f52970a);
            this.f52973d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        AbstractC3584sr.m21640r(i, this.f52973d);
        m17498d();
        int i2 = i + this.f52971b;
        SnapshotStateList snapshotStateList = this.f52970a;
        Object obj2 = snapshotStateList.set(i2, obj);
        this.f52972c = AbstractC3584sr.m21599J(snapshotStateList);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f52973d;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.f52973d) {
            hi7.m13278a("fromIndex or toIndex are out of bounds");
        }
        m17498d();
        int i3 = this.f52971b;
        return new nm9(this.f52970a, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ss5.m21699Z(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ss5.m21701a0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m17498d();
        int i2 = this.f52971b + i;
        SnapshotStateList snapshotStateList = this.f52970a;
        snapshotStateList.add(i2, obj);
        this.f52973d++;
        this.f52972c = AbstractC3584sr.m21599J(snapshotStateList);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f52973d, collection);
    }
}
