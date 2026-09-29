package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p000.AbstractC3489q9;
import p000.atb;
import p000.bga;
import p000.bna;
import p000.c14;
import p000.d14;
import p000.d32;
import p000.tgd;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: b */
    public static final d14 f13390b = new d14(0, RegularImmutableList.f13416e);

    /* JADX INFO: loaded from: classes2.dex */
    public static class SerializedForm implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Object[] f13392a;

        public SerializedForm(Object[] objArr) {
            this.f13392a = objArr;
        }

        public Object readResolve() {
            return ImmutableList.m6288s(this.f13392a);
        }
    }

    /* JADX INFO: renamed from: B */
    public static ImmutableList m6280B(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        d32.m10011I(objArr, 2);
        return m6283l(objArr, 2);
    }

    /* JADX INFO: renamed from: C */
    public static ImmutableList m6281C(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        bna.m3967p("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        d32.m10011I(objArr2, length);
        return m6283l(objArr2, length);
    }

    /* JADX INFO: renamed from: E */
    public static ImmutableList m6282E(AbstractC1104t abstractC1104t, List list) {
        List list2;
        abstractC1104t.getClass();
        if (list instanceof Collection) {
            list2 = list;
        } else {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            tgd.m22031a(arrayList, it);
            list2 = arrayList;
        }
        Object[] array = list2.toArray();
        d32.m10011I(array, array.length);
        Arrays.sort(array, abstractC1104t);
        return m6283l(array, array.length);
    }

    /* JADX INFO: renamed from: l */
    public static ImmutableList m6283l(Object[] objArr, int i) {
        return i == 0 ? RegularImmutableList.f13416e : new RegularImmutableList(objArr, i);
    }

    /* JADX INFO: renamed from: m */
    public static c14 m6284m() {
        return new c14(4);
    }

    /* JADX INFO: renamed from: n */
    public static c14 m6285n(int i) {
        AbstractC3489q9.m19779i(i, "expectedSize");
        return new c14(i);
    }

    /* JADX INFO: renamed from: o */
    public static ImmutableList m6286o(Iterable iterable) {
        if (iterable instanceof Collection) {
            return m6287r((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return RegularImmutableList.f13416e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m6291y(next);
        }
        c14 c14Var = new c14(4);
        c14Var.m3157b(next);
        while (it.hasNext()) {
            c14Var.m3157b(it.next());
        }
        return c14Var.m4280g();
    }

    /* JADX INFO: renamed from: r */
    public static ImmutableList m6287r(Collection collection) {
        if (!(collection instanceof ImmutableCollection)) {
            Object[] array = collection.toArray();
            d32.m10011I(array, array.length);
            return m6283l(array, array.length);
        }
        ImmutableList immutableListMo6273d = ((ImmutableCollection) collection).mo6273d();
        if (!immutableListMo6273d.mo6278j()) {
            return immutableListMo6273d;
        }
        Object[] array2 = immutableListMo6273d.toArray(ImmutableCollection.f13387a);
        return m6283l(array2, array2.length);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: renamed from: s */
    public static ImmutableList m6288s(Object[] objArr) {
        if (objArr.length == 0) {
            return RegularImmutableList.f13416e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        d32.m10011I(objArr2, objArr2.length);
        return m6283l(objArr2, objArr2.length);
    }

    /* JADX INFO: renamed from: v */
    public static ImmutableList m6289v() {
        return RegularImmutableList.f13416e;
    }

    /* JADX INFO: renamed from: w */
    public static ImmutableList m6290w(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        d32.m10011I(objArr, 5);
        return m6283l(objArr, 5);
    }

    /* JADX INFO: renamed from: y */
    public static ImmutableList m6291y(Object obj) {
        Object[] objArr = {obj};
        d32.m10011I(objArr, 1);
        return m6283l(objArr, 1);
    }

    /* JADX INFO: renamed from: D */
    public ImmutableList mo6292D() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: F */
    public ImmutableList subList(int i, int i2) {
        bna.m3983x(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? RegularImmutableList.f13416e : new SubList(i, i3);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: d */
    public final ImmutableList mo6273d() {
        return this;
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
                if (!(list instanceof RandomAccess)) {
                    return tgd.m22032b(iterator(), list.iterator());
                }
                for (int i = 0; i < size; i++) {
                    if (atb.m3037a(get(i), list.get(i))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: f */
    public int mo6274f(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
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

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: k */
    public final bga iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
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

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final d14 listIterator(int i) {
        bna.m3981w(i, size());
        return isEmpty() ? f13390b : new d14(i, this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray(ImmutableCollection.f13387a));
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ReverseImmutableList<E> extends ImmutableList<E> {

        /* JADX INFO: renamed from: c */
        public final transient ImmutableList f13391c;

        public ReverseImmutableList(ImmutableList immutableList) {
            this.f13391c = immutableList;
        }

        @Override // com.google.common.collect.ImmutableList
        /* JADX INFO: renamed from: D */
        public final ImmutableList mo6292D() {
            return this.f13391c;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public final ImmutableList subList(int i, int i2) {
            ImmutableList immutableList = this.f13391c;
            bna.m3983x(i, i2, immutableList.size());
            return immutableList.subList(immutableList.size() - i2, immutableList.size() - i).mo6292D();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f13391c.contains(obj);
        }

        @Override // java.util.List
        public final Object get(int i) {
            ImmutableList immutableList = this.f13391c;
            bna.m3973s(i, immutableList.size());
            return immutableList.get((immutableList.size() - 1) - i);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int indexOf(Object obj) {
            ImmutableList immutableList = this.f13391c;
            int iLastIndexOf = immutableList.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return (immutableList.size() - 1) - iLastIndexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: j */
        public final boolean mo6278j() {
            return this.f13391c.mo6278j();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int lastIndexOf(Object obj) {
            ImmutableList immutableList = this.f13391c;
            int iIndexOf = immutableList.indexOf(obj);
            if (iIndexOf >= 0) {
                return (immutableList.size() - 1) - iIndexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f13391c.size();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SubList extends ImmutableList<E> {

        /* JADX INFO: renamed from: c */
        public final transient int f13393c;

        /* JADX INFO: renamed from: d */
        public final transient int f13394d;

        public SubList(int i, int i2) {
            this.f13393c = i;
            this.f13394d = i2;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: F */
        public final ImmutableList subList(int i, int i2) {
            bna.m3983x(i, i2, this.f13394d);
            int i3 = this.f13393c;
            return ImmutableList.this.subList(i + i3, i2 + i3);
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: g */
        public final Object[] mo6275g() {
            return ImmutableList.this.mo6275g();
        }

        @Override // java.util.List
        public final Object get(int i) {
            bna.m3973s(i, this.f13394d);
            return ImmutableList.this.get(i + this.f13393c);
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: h */
        public final int mo6276h() {
            return ImmutableList.this.mo6277i() + this.f13393c + this.f13394d;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: i */
        public final int mo6277i() {
            return ImmutableList.this.mo6277i() + this.f13393c;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: j */
        public final boolean mo6278j() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f13394d;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }
}
