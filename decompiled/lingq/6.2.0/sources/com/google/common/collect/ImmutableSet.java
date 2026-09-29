package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p000.C3386nv;
import p000.bna;
import p000.d14;
import p000.omd;
import p000.r2d;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f13401c = 0;

    /* JADX INFO: renamed from: b */
    public transient ImmutableList f13402b;

    /* JADX INFO: loaded from: classes2.dex */
    public static class SerializedForm implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Object[] f13403a;

        public SerializedForm(Object[] objArr) {
            this.f13403a = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.m6309o(this.f13403a);
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m6306l(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            bna.m3967p("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: m */
    public static ImmutableSet m6307m(Object[] objArr, int i) {
        if (i == 0) {
            return RegularImmutableSet.f13433j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new SingletonImmutableSet(obj);
        }
        int iM6306l = m6306l(i);
        Object[] objArr2 = new Object[iM6306l];
        int i2 = iM6306l - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                C3386nv.m17635v(ux5.m22988k(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iM18146e0 = omd.m18146e0(iHashCode);
            while (true) {
                int i6 = iM18146e0 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM18146e0++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new SingletonImmutableSet(obj4);
        }
        if (m6306l(i4) < iM6306l / 2) {
            return m6307m(objArr, i4);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new RegularImmutableSet(i3, i2, i4, objArr, objArr2);
    }

    /* JADX INFO: renamed from: n */
    public static ImmutableSet m6308n(Collection collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) collection;
            if (!immutableSet.mo6278j()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return m6307m(array, array.length);
    }

    /* JADX INFO: renamed from: o */
    public static ImmutableSet m6309o(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return RegularImmutableSet.f13433j;
        }
        if (length == 1) {
            return new SingletonImmutableSet(objArr[0]);
        }
        return m6307m((Object[]) objArr.clone(), objArr.length);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: renamed from: s */
    public static ImmutableSet m6310s() {
        return RegularImmutableSet.f13433j;
    }

    /* JADX INFO: renamed from: t */
    public static ImmutableSet m6311t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        bna.m3967p("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return m6307m(objArr2, length);
    }

    /* JADX INFO: renamed from: v */
    public static ImmutableSet m6312v() {
        return new SingletonImmutableSet("CH");
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: d */
    public ImmutableList mo6273d() {
        ImmutableList immutableList = this.f13402b;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList immutableListMo6313r = mo6313r();
        this.f13402b = immutableListMo6313r;
        return immutableListMo6313r;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && (this instanceof RegularImmutableSet) && (((ImmutableSet) obj) instanceof RegularImmutableSet) && ((RegularImmutableSet) this).f13435e != obj.hashCode()) {
            return false;
        }
        return r2d.m20262b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return r2d.m20264d(this);
    }

    /* JADX INFO: renamed from: r */
    public ImmutableList mo6313r() {
        Object[] array = toArray();
        d14 d14Var = ImmutableList.f13390b;
        return ImmutableList.m6283l(array, array.length);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray(ImmutableCollection.f13387a));
    }
}
