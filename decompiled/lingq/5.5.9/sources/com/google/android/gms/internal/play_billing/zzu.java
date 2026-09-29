package com.google.android.gms.internal.play_billing;

import android.support.v4.media.session.C0166e;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p338qd.C8573r0;
import p480xb.C10164g;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzu extends zzr implements List, RandomAccess {

    /* JADX INFO: renamed from: b */
    public static final C10164g f14589b = new C10164g(zzaa.f14569e, 0);

    /* JADX INFO: renamed from: G */
    public static zzu m8527G(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof zzr) {
            zzu zzuVarMo8525s = ((zzr) abstractCollection).mo8525s();
            if (zzuVarMo8525s.mo8522y()) {
                Object[] array = zzuVarMo8525s.toArray();
                int length = array.length;
                if (length == 0) {
                    return zzaa.f14569e;
                }
                zzuVarMo8525s = new zzaa(length, array);
            }
            return zzuVarMo8525s;
        }
        Object[] array2 = abstractCollection.toArray();
        int length2 = array2.length;
        for (int i10 = 0; i10 < length2; i10++) {
            if (array2[i10] == null) {
                throw new NullPointerException(C0166e.m761g("at index ", i10));
            }
        }
        return length2 == 0 ? zzaa.f14569e : new zzaa(length2, array2);
    }

    /* JADX INFO: renamed from: Q */
    public static zzu m8528Q() {
        return zzaa.f14569e;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: D */
    public zzu subList(int i10, int i11) {
        C8573r0.m16760t1(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? zzaa.f14569e : new zzt(this, i10, i12);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final C10164g listIterator(int i10) {
        C8573r0.m16754r1(i10, size());
        return isEmpty() ? f14589b : new C10164g(this, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: a */
    public int mo8519a(Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = get(i10);
        }
        return size;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0088 A[EDGE_INSN: B:47:0x0088->B:48:0x0089 BREAK  A[LOOP:0: B:14:0x0027->B:26:0x0046], EDGE_INSN: B:45:0x0085->B:47:0x0088 BREAK  A[LOOP:1: B:28:0x0053->B:57:?], EDGE_INSN: B:54:0x0088->B:47:0x0088 BREAK  A[LOOP:1: B:28:0x0053->B:57:?]] */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
    
        if (r6.hasNext() == false) goto L49;
     */
    @Override // java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        boolean z10 = true;
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = get(i10);
                            Object obj3 = list.get(i10);
                            if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                            }
                        }
                    } else {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        do {
                            if (it.hasNext()) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                next = it.next();
                                next2 = it2.next();
                            }
                        } while (next == next2 || (next != null && next.equals(next2)));
                    }
                    z10 = false;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
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
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    @Deprecated
    /* JADX INFO: renamed from: s */
    public final zzu mo8525s() {
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: t */
    public final C10164g iterator() {
        return listIterator(0);
    }
}
