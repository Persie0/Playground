package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.C0166e;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzjb extends zziw implements Set {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f14548c = 0;

    /* JADX INFO: renamed from: b */
    public transient zzja f14549b;

    /* JADX INFO: renamed from: C */
    public static zzjb m8485C(int i10, Object... objArr) {
        if (i10 == 0) {
            return zzjf.f14554j;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zzjg(obj);
        }
        int iM8486y = m8486y(i10);
        Object[] objArr2 = new Object[iM8486y];
        int i11 = iM8486y - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(C0166e.m761g("at index ", i14));
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i15 = iRotateLeft & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iRotateLeft++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzjg(obj4);
        }
        if (m8486y(i13) < iM8486y / 2) {
            return m8485C(i13, objArr);
        }
        if (i13 < 10) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new zzjf(i12, i11, i13, objArr, objArr2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: y */
    public static int m8486y(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzjb) && (this instanceof zzjf)) {
            zzjb zzjbVar = (zzjb) obj;
            zzjbVar.getClass();
            if ((zzjbVar instanceof zzjf) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC2728k5 iterator();
}
