package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import p000.bdd;
import p000.rla;
import p000.yqb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbw extends zzbt implements List, RandomAccess {

    /* JADX INFO: renamed from: b */
    public static final yqb f12205b = new yqb(zzcd.f12210e, 0);

    /* JADX INFO: renamed from: l */
    public static zzbw m5667l(Object[] objArr, int i) {
        return i == 0 ? zzcd.f12210e : new zzcd(objArr, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static zzbw m5668m(List list) {
        if (!(list instanceof zzbt)) {
            Object[] array = list.toArray();
            int length = array.length;
            bdd.m3656b(array, length);
            return m5667l(array, length);
        }
        zzbw zzbwVarMo5663h = ((zzbt) list).mo5663h();
        if (!zzbwVarMo5663h.mo5664i()) {
            return zzbwVarMo5663h;
        }
        Object[] array2 = zzbwVarMo5663h.toArray(zzbt.f12201a);
        return m5667l(array2, array2.length);
    }

    /* JADX INFO: renamed from: n */
    public static zzbw m5669n() {
        return zzcd.f12210e;
    }

    /* JADX INFO: renamed from: o */
    public static zzbw m5670o() {
        Object[] objArr = {"inapp"};
        bdd.m3656b(objArr, 1);
        return m5667l(objArr, 1);
    }

    /* JADX INFO: renamed from: r */
    public static zzbw m5671r() {
        Object[] objArr = {"subs", "inapp"};
        bdd.m3656b(objArr, 2);
        return m5667l(objArr, 2);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: d */
    public int mo5660d(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!Objects.equals(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: h */
    public final zzbw mo5663h() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: k */
    public zzbw subList(int i, int i2) {
        rla.m20709c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? zzcd.f12210e : new zzbv(this, i, i3);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final yqb listIterator(int i) {
        rla.m20708b(i, size());
        return isEmpty() ? f12205b : new yqb(this, i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
