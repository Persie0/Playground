package com.google.common.collect;

import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f16056c = 0;

    /* JADX INFO: renamed from: b */
    @RetainedWith
    public transient ImmutableList<E> f16057b;

    public static class SerializedForm implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Object[] f16058a;

        public SerializedForm(Object[] objArr) {
            this.f16058a = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.m9080U(this.f16058a);
        }
    }

    /* JADX INFO: renamed from: D */
    public static int m9077D(int i10) {
        int iMax = Math.max(i10, 2);
        boolean z10 = true;
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        if (iMax >= 1073741824) {
            z10 = false;
        }
        C8573r0.m16679J("collection too large", z10);
        return 1073741824;
    }

    /* JADX INFO: renamed from: G */
    public static <E> ImmutableSet<E> m9078G(int i10, Object... objArr) {
        if (i10 == 0) {
            return RegularImmutableSet.f16134j;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new SingletonImmutableSet(obj);
        }
        int iM9077D = m9077D(i10);
        Object[] objArr2 = new Object[iM9077D];
        int i11 = iM9077D - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i14);
                throw new NullPointerException(sb2.toString());
            }
            int iHashCode = obj2.hashCode();
            int iM16720d1 = C8573r0.m16720d1(iHashCode);
            while (true) {
                int i15 = iM16720d1 & i11;
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
                iM16720d1++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new SingletonImmutableSet(obj4);
        }
        if (m9077D(i13) < iM9077D / 2) {
            return m9078G(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new RegularImmutableSet(i12, i11, i13, objArr, objArr2);
    }

    /* JADX INFO: renamed from: Q */
    public static ImmutableSet m9079Q(Set set) {
        if ((set instanceof ImmutableSet) && !(set instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) set;
            if (!immutableSet.mo9054y()) {
                return immutableSet;
            }
        }
        Object[] array = set.toArray();
        return m9078G(array.length, array);
    }

    /* JADX INFO: renamed from: U */
    public static <E> ImmutableSet<E> m9080U(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            return length != 1 ? m9078G(eArr.length, (Object[]) eArr.clone()) : new SingletonImmutableSet(eArr[0]);
        }
        return RegularImmutableSet.f16134j;
    }

    /* JADX INFO: renamed from: Y */
    public static <E> ImmutableSet<E> m9081Y() {
        return RegularImmutableSet.f16134j;
    }

    /* JADX INFO: renamed from: a0 */
    public static ImmutableSet m9082a0(String str, String str2, String str3) {
        return m9078G(3, str, str2, str3);
    }

    /* JADX INFO: renamed from: X */
    public ImmutableList<E> mo9083X() {
        Object[] array = toArray();
        ImmutableList.C3147b c3147b = ImmutableList.f16043b;
        return ImmutableList.m9058D(array.length, array);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: a */
    public ImmutableList<E> mo9049a() {
        ImmutableList<E> immutableList = this.f16057b;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListMo9083X = mo9083X();
        this.f16057b = immutableListMo9083X;
        return immutableListMo9083X;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && (this instanceof RegularImmutableSet)) {
            ImmutableSet immutableSet = (ImmutableSet) obj;
            immutableSet.getClass();
            if ((immutableSet instanceof RegularImmutableSet) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return C3183d0.m9125a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C3183d0.m9127c(this);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }
}
