package com.google.common.collect;

import dm.C5212l;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: b */
    public static final C3147b f16043b = new C3147b(0, RegularImmutableList.f16116e);

    public static class SerializedForm implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Object[] f16044a;

        public SerializedForm(Object[] objArr) {
            this.f16044a = objArr;
        }

        public Object readResolve() {
            return ImmutableList.m9061U(this.f16044a);
        }
    }

    public class SubList extends ImmutableList<E> {

        /* JADX INFO: renamed from: c */
        public final transient int f16045c;

        /* JADX INFO: renamed from: d */
        public final transient int f16046d;

        public SubList(int i10, int i11) {
            this.f16045c = i10;
            this.f16046d = i11;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
        public final ImmutableList<E> subList(int i10, int i11) {
            C8573r0.m16689O(i10, i11, this.f16046d);
            int i12 = this.f16045c;
            return ImmutableList.this.subList(i10 + i12, i11 + i12);
        }

        @Override // java.util.List
        public final E get(int i10) {
            C8573r0.m16683L(i10, this.f16046d);
            return ImmutableList.this.get(i10 + this.f16045c);
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return listIterator(i10);
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: q */
        public final Object[] mo9051q() {
            return ImmutableList.this.mo9051q();
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: s */
        public final int mo9052s() {
            return ImmutableList.this.mo9053t() + this.f16045c + this.f16046d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f16046d;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: t */
        public final int mo9053t() {
            return ImmutableList.this.mo9053t() + this.f16045c;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: y */
        public final boolean mo9054y() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableList$a */
    public static final class C3146a<E> extends ImmutableCollection.AbstractC3144a<E> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: d */
        public final void m9067d(List list) {
            if (list instanceof Collection) {
                m9056c(list.size() + this.f16039b);
                if (list instanceof ImmutableCollection) {
                    this.f16039b = ((ImmutableCollection) list).mo9050l(this.f16039b, this.f16038a);
                    return;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m9055b(it.next());
            }
        }

        /* JADX INFO: renamed from: e */
        public final ImmutableList<E> m9068e() {
            this.f16040c = true;
            return ImmutableList.m9058D(this.f16039b, this.f16038a);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableList$b */
    public static class C3147b<E> extends AbstractC3176a<E> {

        /* JADX INFO: renamed from: c */
        public final ImmutableList<E> f16048c;

        public C3147b(int i10, ImmutableList immutableList) {
            super(immutableList.size(), i10);
            this.f16048c = immutableList;
        }
    }

    /* JADX INFO: renamed from: D */
    public static ImmutableList m9058D(int i10, Object[] objArr) {
        return i10 == 0 ? RegularImmutableList.f16116e : new RegularImmutableList(i10, objArr);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: G */
    public static <E> ImmutableList<E> m9059G(Object... objArr) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (objArr[i10] == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i10);
                throw new NullPointerException(sb2.toString());
            }
        }
        return m9058D(objArr.length, objArr);
    }

    /* JADX INFO: renamed from: Q */
    public static <E> ImmutableList<E> m9060Q(Collection<? extends E> collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return m9059G(collection.toArray());
        }
        ImmutableList<E> immutableListMo9049a = ((ImmutableCollection) collection).mo9049a();
        if (!immutableListMo9049a.mo9054y()) {
            return immutableListMo9049a;
        }
        Object[] array = immutableListMo9049a.toArray();
        return m9058D(array.length, array);
    }

    /* JADX INFO: renamed from: U */
    public static <E> ImmutableList<E> m9061U(E[] eArr) {
        return eArr.length == 0 ? (ImmutableList<E>) RegularImmutableList.f16116e : m9059G((Object[]) eArr.clone());
    }

    /* JADX INFO: renamed from: Y */
    public static <E> ImmutableList<E> m9062Y() {
        return (ImmutableList<E>) RegularImmutableList.f16116e;
    }

    /* JADX INFO: renamed from: a0 */
    public static ImmutableList m9063a0(Long l10, Long l11, Long l12, Long l13, Long l14) {
        return m9059G(l10, l11, l12, l13, l14);
    }

    /* JADX INFO: renamed from: b0 */
    public static <E> ImmutableList<E> m9064b0(E e10) {
        return m9059G(e10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: C */
    public final AbstractC3187f0<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C3147b listIterator(int i10) {
        C8573r0.m16687N(i10, size());
        return isEmpty() ? f16043b : new C3147b(i10, this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    @Deprecated
    /* JADX INFO: renamed from: a */
    public final ImmutableList<E> mo9049a() {
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: d0 */
    public ImmutableList<E> subList(int i10, int i11) {
        C8573r0.m16689O(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? (ImmutableList<E>) RegularImmutableList.f16116e : new SubList(i10, i12);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (C5212l.m11140M(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && C5212l.m11140M(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
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

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: l */
    public int mo9050l(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
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
    public ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }
}
