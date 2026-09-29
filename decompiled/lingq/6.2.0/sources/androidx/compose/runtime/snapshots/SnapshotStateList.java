package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p000.AbstractC3096i1;
import p000.AbstractC3584sr;
import p000.C3059h1;
import p000.ad9;
import p000.au3;
import p000.bt4;
import p000.fa4;
import p000.hi7;
import p000.jb9;
import p000.jc9;
import p000.kv4;
import p000.lh9;
import p000.nc9;
import p000.nm9;
import p000.ph9;
import p000.rh9;
import p000.ss5;
import p000.vg4;
import p000.x77;
import p000.yn3;

/* JADX INFO: loaded from: classes.dex */
public final class SnapshotStateList<T> implements Parcelable, ph9, List<T>, RandomAccess, vg4 {
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new ad9();

    /* JADX INFO: renamed from: a */
    public lh9 f3798a;

    public SnapshotStateList(AbstractC3096i1 abstractC3096i1) {
        jc9 jc9VarM17358j = nc9.m17358j();
        lh9 lh9Var = new lh9(jc9VarM17358j.mo3582g(), abstractC3096i1);
        if (!(jc9VarM17358j instanceof yn3)) {
            lh9Var.f59323b = new lh9(1L, abstractC3096i1);
        }
        this.f3798a = lh9Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        AbstractC3096i1 abstractC3096i1;
        jc9 jc9VarM17358j;
        boolean zM21641s;
        do {
            synchronized (AbstractC3584sr.f61285l) {
                lh9 lh9Var = this.f3798a;
                lh9Var.getClass();
                lh9 lh9Var2 = (lh9) nc9.m17356h(lh9Var);
                i = lh9Var2.f49673d;
                abstractC3096i1 = lh9Var2.f49672c;
            }
            abstractC3096i1.getClass();
            AbstractC3096i1 abstractC3096i1Mo13605g = abstractC3096i1.mo13605g(obj);
            if (abstractC3096i1Mo13605g.equals(abstractC3096i1)) {
                return false;
            }
            lh9 lh9Var3 = this.f3798a;
            lh9Var3.getClass();
            synchronized (nc9.f52602c) {
                jc9VarM17358j = nc9.m17358j();
                zM21641s = AbstractC3584sr.m21641s((lh9) nc9.m17371w(lh9Var3, this, jc9VarM17358j), i, abstractC3096i1Mo13605g, true);
            }
            nc9.m17362n(jc9VarM17358j, this);
        } while (!zM21641s);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        AbstractC3096i1 abstractC3096i1;
        jc9 jc9VarM17358j;
        boolean zM21641s;
        do {
            synchronized (AbstractC3584sr.f61285l) {
                lh9 lh9Var = this.f3798a;
                lh9Var.getClass();
                lh9 lh9Var2 = (lh9) nc9.m17356h(lh9Var);
                i = lh9Var2.f49673d;
                abstractC3096i1 = lh9Var2.f49672c;
            }
            abstractC3096i1.getClass();
            AbstractC3096i1 abstractC3096i1Mo13606h = abstractC3096i1.mo13606h(collection);
            if (fa4.m11650l(abstractC3096i1Mo13606h, abstractC3096i1)) {
                return false;
            }
            lh9 lh9Var3 = this.f3798a;
            lh9Var3.getClass();
            synchronized (nc9.f52602c) {
                jc9VarM17358j = nc9.m17358j();
                zM21641s = AbstractC3584sr.m21641s((lh9) nc9.m17371w(lh9Var3, this, jc9VarM17358j), i, abstractC3096i1Mo13606h, true);
            }
            nc9.m17362n(jc9VarM17358j, this);
        } while (!zM21641s);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        jc9 jc9VarM17358j;
        lh9 lh9Var = this.f3798a;
        lh9Var.getClass();
        synchronized (nc9.f52602c) {
            jc9VarM17358j = nc9.m17358j();
            lh9 lh9Var2 = (lh9) nc9.m17371w(lh9Var, this, jc9VarM17358j);
            synchronized (AbstractC3584sr.f61285l) {
                lh9Var2.f49672c = jb9.f45384b;
                lh9Var2.f49673d++;
                lh9Var2.f49674e++;
            }
        }
        nc9.m17362n(jc9VarM17358j, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC3584sr.m21598I(this).f49672c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return AbstractC3584sr.m21598I(this).f49672c.containsAll(collection);
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: d */
    public final rh9 mo1310d() {
        return this.f3798a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: g */
    public final void mo1311g(rh9 rh9Var) {
        rh9Var.f59323b = this.f3798a;
        this.f3798a = (lh9) rh9Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return AbstractC3584sr.m21598I(this).f49672c.get(i);
    }

    /* JADX INFO: renamed from: h */
    public final void m1312h(int i, int i2) {
        int i3;
        AbstractC3096i1 abstractC3096i1;
        jc9 jc9VarM17358j;
        boolean zM21641s;
        do {
            synchronized (AbstractC3584sr.f61285l) {
                lh9 lh9Var = this.f3798a;
                lh9Var.getClass();
                lh9 lh9Var2 = (lh9) nc9.m17356h(lh9Var);
                i3 = lh9Var2.f49673d;
                abstractC3096i1 = lh9Var2.f49672c;
            }
            abstractC3096i1.getClass();
            x77 x77VarMo13607i = abstractC3096i1.mo13607i();
            x77VarMo13607i.subList(i, i2).clear();
            AbstractC3096i1 abstractC3096i1M24385g = x77VarMo13607i.m24385g();
            if (fa4.m11650l(abstractC3096i1M24385g, abstractC3096i1)) {
                return;
            }
            lh9 lh9Var3 = this.f3798a;
            lh9Var3.getClass();
            synchronized (nc9.f52602c) {
                jc9VarM17358j = nc9.m17358j();
                zM21641s = AbstractC3584sr.m21641s((lh9) nc9.m17371w(lh9Var3, this, jc9VarM17358j), i3, abstractC3096i1M24385g, true);
            }
            nc9.m17362n(jc9VarM17358j, this);
        } while (!zM21641s);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return AbstractC3584sr.m21598I(this).f49672c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AbstractC3584sr.m21598I(this).f49672c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC3584sr.m21598I(this).f49672c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new au3(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        AbstractC3096i1 abstractC3096i1;
        jc9 jc9VarM17358j;
        boolean zM21641s;
        do {
            synchronized (AbstractC3584sr.f61285l) {
                lh9 lh9Var = this.f3798a;
                lh9Var.getClass();
                lh9 lh9Var2 = (lh9) nc9.m17356h(lh9Var);
                i = lh9Var2.f49673d;
                abstractC3096i1 = lh9Var2.f49672c;
            }
            abstractC3096i1.getClass();
            int iIndexOf = abstractC3096i1.indexOf(obj);
            AbstractC3096i1 abstractC3096i1Mo13609k = iIndexOf != -1 ? abstractC3096i1.mo13609k(iIndexOf) : abstractC3096i1;
            if (abstractC3096i1Mo13609k.equals(abstractC3096i1)) {
                return false;
            }
            lh9 lh9Var3 = this.f3798a;
            lh9Var3.getClass();
            synchronized (nc9.f52602c) {
                jc9VarM17358j = nc9.m17358j();
                zM21641s = AbstractC3584sr.m21641s((lh9) nc9.m17371w(lh9Var3, this, jc9VarM17358j), i, abstractC3096i1Mo13609k, true);
            }
            nc9.m17362n(jc9VarM17358j, this);
        } while (!zM21641s);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        AbstractC3096i1 abstractC3096i1;
        jc9 jc9VarM17358j;
        boolean zM21641s;
        do {
            synchronized (AbstractC3584sr.f61285l) {
                lh9 lh9Var = this.f3798a;
                lh9Var.getClass();
                lh9 lh9Var2 = (lh9) nc9.m17356h(lh9Var);
                i = lh9Var2.f49673d;
                abstractC3096i1 = lh9Var2.f49672c;
            }
            abstractC3096i1.getClass();
            AbstractC3096i1 abstractC3096i1Mo13608j = abstractC3096i1.mo13608j(new C3059h1(0, collection));
            if (fa4.m11650l(abstractC3096i1Mo13608j, abstractC3096i1)) {
                return false;
            }
            lh9 lh9Var3 = this.f3798a;
            lh9Var3.getClass();
            synchronized (nc9.f52602c) {
                jc9VarM17358j = nc9.m17358j();
                zM21641s = AbstractC3584sr.m21641s((lh9) nc9.m17371w(lh9Var3, this, jc9VarM17358j), i, abstractC3096i1Mo13608j, true);
            }
            nc9.m17362n(jc9VarM17358j, this);
        } while (!zM21641s);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return AbstractC3584sr.m21605P(this, new kv4(collection, 24));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        AbstractC3096i1 abstractC3096i1;
        jc9 jc9VarM17358j;
        boolean zM21641s;
        Object obj2 = get(i);
        do {
            synchronized (AbstractC3584sr.f61285l) {
                lh9 lh9Var = this.f3798a;
                lh9Var.getClass();
                lh9 lh9Var2 = (lh9) nc9.m17356h(lh9Var);
                i2 = lh9Var2.f49673d;
                abstractC3096i1 = lh9Var2.f49672c;
            }
            abstractC3096i1.getClass();
            AbstractC3096i1 abstractC3096i1Mo13610l = abstractC3096i1.mo13610l(i, obj);
            if (abstractC3096i1Mo13610l.equals(abstractC3096i1)) {
                break;
            }
            lh9 lh9Var3 = this.f3798a;
            lh9Var3.getClass();
            synchronized (nc9.f52602c) {
                jc9VarM17358j = nc9.m17358j();
                zM21641s = AbstractC3584sr.m21641s((lh9) nc9.m17371w(lh9Var3, this, jc9VarM17358j), i2, abstractC3096i1Mo13610l, false);
            }
            nc9.m17362n(jc9VarM17358j, this);
        } while (!zM21641s);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return AbstractC3584sr.m21598I(this).f49672c.mo3718d();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            hi7.m13278a("fromIndex or toIndex are out of bounds");
        }
        return new nm9(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ss5.m21699Z(this);
    }

    public final String toString() {
        lh9 lh9Var = this.f3798a;
        lh9Var.getClass();
        return "SnapshotStateList(value=" + ((lh9) nc9.m17356h(lh9Var)).f49672c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC3096i1 abstractC3096i1 = AbstractC3584sr.m21598I(this).f49672c;
        int iMo3718d = abstractC3096i1.mo3718d();
        parcel.writeInt(iMo3718d);
        for (int i2 = 0; i2 < iMo3718d; i2++) {
            parcel.writeValue(abstractC3096i1.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ss5.m21701a0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new au3(this, i);
    }

    public SnapshotStateList() {
        this(jb9.f45384b);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        AbstractC3096i1 abstractC3096i1;
        jc9 jc9VarM17358j;
        boolean zM21641s;
        do {
            synchronized (AbstractC3584sr.f61285l) {
                lh9 lh9Var = this.f3798a;
                lh9Var.getClass();
                lh9 lh9Var2 = (lh9) nc9.m17356h(lh9Var);
                i2 = lh9Var2.f49673d;
                abstractC3096i1 = lh9Var2.f49672c;
            }
            abstractC3096i1.getClass();
            AbstractC3096i1 abstractC3096i1Mo13604f = abstractC3096i1.mo13604f(i, obj);
            if (abstractC3096i1Mo13604f.equals(abstractC3096i1)) {
                return;
            }
            lh9 lh9Var3 = this.f3798a;
            lh9Var3.getClass();
            synchronized (nc9.f52602c) {
                jc9VarM17358j = nc9.m17358j();
                zM21641s = AbstractC3584sr.m21641s((lh9) nc9.m17371w(lh9Var3, this, jc9VarM17358j), i2, abstractC3096i1Mo13604f, true);
            }
            nc9.m17362n(jc9VarM17358j, this);
        } while (!zM21641s);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return AbstractC3584sr.m21605P(this, new bt4(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        AbstractC3096i1 abstractC3096i1;
        jc9 jc9VarM17358j;
        boolean zM21641s;
        Object obj = get(i);
        do {
            synchronized (AbstractC3584sr.f61285l) {
                lh9 lh9Var = this.f3798a;
                lh9Var.getClass();
                lh9 lh9Var2 = (lh9) nc9.m17356h(lh9Var);
                i2 = lh9Var2.f49673d;
                abstractC3096i1 = lh9Var2.f49672c;
            }
            abstractC3096i1.getClass();
            AbstractC3096i1 abstractC3096i1Mo13609k = abstractC3096i1.mo13609k(i);
            if (abstractC3096i1Mo13609k.equals(abstractC3096i1)) {
                break;
            }
            lh9 lh9Var3 = this.f3798a;
            lh9Var3.getClass();
            synchronized (nc9.f52602c) {
                jc9VarM17358j = nc9.m17358j();
                zM21641s = AbstractC3584sr.m21641s((lh9) nc9.m17371w(lh9Var3, this, jc9VarM17358j), i2, abstractC3096i1Mo13609k, true);
            }
            nc9.m17362n(jc9VarM17358j, this);
        } while (!zM21641s);
        return obj;
    }
}
