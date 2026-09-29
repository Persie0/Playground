package com.google.common.collect;

import androidx.fragment.app.C0987y;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final Object[] f16037a = new Object[0];

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableCollection$a */
    public static abstract class AbstractC3144a<E> extends AbstractC3145b<E> {

        /* JADX INFO: renamed from: a */
        public Object[] f16038a;

        /* JADX INFO: renamed from: b */
        public int f16039b;

        /* JADX INFO: renamed from: c */
        public boolean f16040c;

        public AbstractC3144a() {
            C0987y.m3820b("initialCapacity", 4);
            this.f16038a = new Object[4];
            this.f16039b = 0;
        }

        /* JADX INFO: renamed from: b */
        public final void m9055b(Object obj) {
            obj.getClass();
            m9056c(this.f16039b + 1);
            Object[] objArr = this.f16038a;
            int i10 = this.f16039b;
            this.f16039b = i10 + 1;
            objArr[i10] = obj;
        }

        /* JADX INFO: renamed from: c */
        public final void m9056c(int i10) {
            Object[] objArr = this.f16038a;
            if (objArr.length < i10) {
                this.f16038a = Arrays.copyOf(objArr, AbstractC3145b.m9057a(objArr.length, i10));
                this.f16040c = false;
            } else {
                if (this.f16040c) {
                    this.f16038a = (Object[]) objArr.clone();
                    this.f16040c = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableCollection$b */
    public static abstract class AbstractC3145b<E> {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static int m9057a(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC3187f0<E> iterator();

    /* JADX INFO: renamed from: a */
    public ImmutableList<E> mo9049a() {
        if (isEmpty()) {
            ImmutableList.C3147b c3147b = ImmutableList.f16043b;
            return (ImmutableList<E>) RegularImmutableList.f16116e;
        }
        Object[] array = toArray();
        ImmutableList.C3147b c3147b2 = ImmutableList.f16043b;
        return ImmutableList.m9058D(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    /* JADX INFO: renamed from: l */
    public int mo9050l(int i10, Object[] objArr) {
        AbstractC3187f0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    /* JADX INFO: renamed from: q */
    public Object[] mo9051q() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: s */
    public int mo9052s() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: t */
    public int mo9053t() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f16037a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] objArrMo9051q = mo9051q();
            if (objArrMo9051q != null) {
                return (T[]) Arrays.copyOfRange(objArrMo9051q, mo9053t(), mo9052s(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo9050l(0, tArr);
        return tArr;
    }

    Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    /* JADX INFO: renamed from: y */
    public abstract boolean mo9054y();
}
