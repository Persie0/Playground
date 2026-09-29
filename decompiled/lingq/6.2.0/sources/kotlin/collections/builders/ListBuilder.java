package kotlin.collections.builders;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p000.AbstractC2985f1;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.au3;
import p000.b34;
import p000.bq1;
import p000.fa4;
import p000.ij6;
import p000.v63;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
public final class ListBuilder<E> extends AbstractC2985f1 implements List<E>, RandomAccess, Serializable {

    /* JADX INFO: renamed from: d */
    public static final ListBuilder f47650d;

    /* JADX INFO: renamed from: a */
    public Object[] f47651a;

    /* JADX INFO: renamed from: b */
    public int f47652b;

    /* JADX INFO: renamed from: c */
    public boolean f47653c;

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.f47653c = true;
        f47650d = listBuilder;
    }

    public ListBuilder(int i) {
        if (i >= 0) {
            this.f47651a = new Object[i];
        } else {
            C3386nv.m17626m("capacity must be non-negative.");
            throw null;
        }
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f47653c) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m15378j();
        int i2 = this.f47652b;
        if (i < 0 || i > i2) {
            v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        m15379k(i, 1);
        this.f47651a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        m15378j();
        int i2 = this.f47652b;
        if (i < 0 || i > i2) {
            v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
            return false;
        }
        int size = collection.size();
        m15376h(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m15378j();
        m15381m(0, this.f47652b);
    }

    @Override // p000.AbstractC2985f1
    /* JADX INFO: renamed from: d */
    public final int mo4182d() {
        return this.f47652b;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f47651a;
            int i = this.f47652b;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (fa4.m11650l(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC2985f1
    /* JADX INFO: renamed from: f */
    public final Object mo4183f(int i) {
        m15378j();
        int i2 = this.f47652b;
        if (i >= 0 && i < i2) {
            return m15380l(i);
        }
        v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f47652b;
        if (i >= 0 && i < i2) {
            return this.f47651a[i];
        }
        v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m15376h(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        m15379k(i, i2);
        Iterator<E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f47651a[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f47651a;
        int i = this.f47652b;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m15377i(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m15379k(i, 1);
        this.f47651a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f47652b; i++) {
            if (fa4.m11650l(this.f47651a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f47652b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final void m15378j() {
        if (this.f47653c) {
            ij6.m13946b();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m15379k(int i, int i2) {
        int i3 = this.f47652b + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f47651a;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f47651a = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.f47651a;
        AbstractC3550rv.m20826T(i + i2, i, this.f47652b, objArr2, objArr2);
        this.f47652b += i2;
    }

    /* JADX INFO: renamed from: l */
    public final Object m15380l(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f47651a;
        Object obj = objArr[i];
        AbstractC3550rv.m20826T(i, i + 1, this.f47652b, objArr, objArr);
        Object[] objArr2 = this.f47651a;
        int i2 = this.f47652b - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.f47652b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f47652b - 1; i >= 0; i--) {
            if (fa4.m11650l(this.f47651a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f47652b;
        if (i >= 0 && i <= i2) {
            return new au3(this, i);
        }
        v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m15381m(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f47651a;
        AbstractC3550rv.m20826T(i, i + i2, this.f47652b, objArr, objArr);
        Object[] objArr2 = this.f47651a;
        int i3 = this.f47652b;
        bq1.m4068u0(objArr2, i3 - i2, i3);
        this.f47652b -= i2;
    }

    /* JADX INFO: renamed from: n */
    public final int m15382n(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.f47651a;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.f47651a;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        AbstractC3550rv.m20826T(i + i4, i2 + i, this.f47652b, objArr, objArr);
        Object[] objArr3 = this.f47651a;
        int i7 = this.f47652b;
        bq1.m4068u0(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f47652b -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m15378j();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo4183f(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        m15378j();
        return m15382n(0, this.f47652b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        m15378j();
        return m15382n(0, this.f47652b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m15378j();
        int i2 = this.f47652b;
        if (i < 0 || i >= i2) {
            v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
            return null;
        }
        Object[] objArr = this.f47651a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        b34.m3239f(i, i2, this.f47652b);
        return new BuilderSubList(this.f47651a, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f47652b;
        Object[] objArr2 = this.f47651a;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        AbstractC3550rv.m20826T(0, 0, i, objArr2, objArr);
        int i2 = this.f47652b;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return bq1.m4047W(this.f47651a, 0, this.f47652b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class BuilderSubList<E> extends AbstractC2985f1 implements List<E>, RandomAccess, Serializable {

        /* JADX INFO: renamed from: a */
        public Object[] f47654a;

        /* JADX INFO: renamed from: b */
        public final int f47655b;

        /* JADX INFO: renamed from: c */
        public int f47656c;

        /* JADX INFO: renamed from: d */
        public final BuilderSubList f47657d;

        /* JADX INFO: renamed from: e */
        public final ListBuilder f47658e;

        public BuilderSubList(Object[] objArr, int i, int i2, BuilderSubList builderSubList, ListBuilder listBuilder) {
            objArr.getClass();
            listBuilder.getClass();
            this.f47654a = objArr;
            this.f47655b = i;
            this.f47656c = i2;
            this.f47657d = builderSubList;
            this.f47658e = listBuilder;
            ((AbstractList) this).modCount = ((AbstractList) listBuilder).modCount;
        }

        private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() throws NotSerializableException {
            if (this.f47658e.f47653c) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, Object obj) {
            m15387k();
            m15386j();
            int i2 = this.f47656c;
            if (i < 0 || i > i2) {
                v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
            } else {
                m15385i(this.f47655b + i, obj);
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i, Collection collection) {
            collection.getClass();
            m15387k();
            m15386j();
            int i2 = this.f47656c;
            if (i < 0 || i > i2) {
                v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
                return false;
            }
            int size = collection.size();
            m15384h(this.f47655b + i, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            m15387k();
            m15386j();
            m15389m(this.f47655b, this.f47656c);
        }

        @Override // p000.AbstractC2985f1
        /* JADX INFO: renamed from: d */
        public final int mo4182d() {
            m15386j();
            return this.f47656c;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            m15386j();
            if (obj == this) {
                return true;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.f47654a;
                int i = this.f47656c;
                if (i == list.size()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (fa4.m11650l(objArr[this.f47655b + i2], list.get(i2))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // p000.AbstractC2985f1
        /* JADX INFO: renamed from: f */
        public final Object mo4183f(int i) {
            m15387k();
            m15386j();
            int i2 = this.f47656c;
            if (i >= 0 && i < i2) {
                return m15388l(this.f47655b + i);
            }
            v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
            return null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            m15386j();
            int i2 = this.f47656c;
            if (i >= 0 && i < i2) {
                return this.f47654a[this.f47655b + i];
            }
            v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
            return null;
        }

        /* JADX INFO: renamed from: h */
        public final void m15384h(int i, Collection collection, int i2) {
            ((AbstractList) this).modCount++;
            ListBuilder listBuilder = this.f47658e;
            BuilderSubList builderSubList = this.f47657d;
            if (builderSubList != null) {
                builderSubList.m15384h(i, collection, i2);
            } else {
                ListBuilder listBuilder2 = ListBuilder.f47650d;
                listBuilder.m15376h(i, collection, i2);
            }
            this.f47654a = listBuilder.f47651a;
            this.f47656c += i2;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            m15386j();
            Object[] objArr = this.f47654a;
            int i = this.f47656c;
            int iHashCode = 1;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[this.f47655b + i2];
                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
            }
            return iHashCode;
        }

        /* JADX INFO: renamed from: i */
        public final void m15385i(int i, Object obj) {
            ((AbstractList) this).modCount++;
            ListBuilder listBuilder = this.f47658e;
            BuilderSubList builderSubList = this.f47657d;
            if (builderSubList != null) {
                builderSubList.m15385i(i, obj);
            } else {
                ListBuilder listBuilder2 = ListBuilder.f47650d;
                listBuilder.m15377i(i, obj);
            }
            this.f47654a = listBuilder.f47651a;
            this.f47656c++;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            m15386j();
            for (int i = 0; i < this.f47656c; i++) {
                if (fa4.m11650l(this.f47654a[this.f47655b + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            m15386j();
            return this.f47656c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator iterator() {
            return listIterator(0);
        }

        /* JADX INFO: renamed from: j */
        public final void m15386j() {
            if (((AbstractList) this.f47658e).modCount == ((AbstractList) this).modCount) {
                return;
            }
            C3386nv.m17619e();
        }

        /* JADX INFO: renamed from: k */
        public final void m15387k() {
            if (this.f47658e.f47653c) {
                ij6.m13946b();
            }
        }

        /* JADX INFO: renamed from: l */
        public final Object m15388l(int i) {
            Object objM15380l;
            ((AbstractList) this).modCount++;
            BuilderSubList builderSubList = this.f47657d;
            if (builderSubList != null) {
                objM15380l = builderSubList.m15388l(i);
            } else {
                ListBuilder listBuilder = ListBuilder.f47650d;
                objM15380l = this.f47658e.m15380l(i);
            }
            this.f47656c--;
            return objM15380l;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            m15386j();
            for (int i = this.f47656c - 1; i >= 0; i--) {
                if (fa4.m11650l(this.f47654a[this.f47655b + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i) {
            m15386j();
            int i2 = this.f47656c;
            if (i >= 0 && i <= i2) {
                return new C3196a(this, i);
            }
            v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
            return null;
        }

        /* JADX INFO: renamed from: m */
        public final void m15389m(int i, int i2) {
            if (i2 > 0) {
                ((AbstractList) this).modCount++;
            }
            BuilderSubList builderSubList = this.f47657d;
            if (builderSubList != null) {
                builderSubList.m15389m(i, i2);
            } else {
                ListBuilder listBuilder = ListBuilder.f47650d;
                this.f47658e.m15381m(i, i2);
            }
            this.f47656c -= i2;
        }

        /* JADX INFO: renamed from: n */
        public final int m15390n(int i, int i2, Collection collection, boolean z) {
            int iM15382n;
            BuilderSubList builderSubList = this.f47657d;
            if (builderSubList != null) {
                iM15382n = builderSubList.m15390n(i, i2, collection, z);
            } else {
                ListBuilder listBuilder = ListBuilder.f47650d;
                iM15382n = this.f47658e.m15382n(i, i2, collection, z);
            }
            if (iM15382n > 0) {
                ((AbstractList) this).modCount++;
            }
            this.f47656c -= iM15382n;
            return iM15382n;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            m15387k();
            m15386j();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                mo4183f(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            m15387k();
            m15386j();
            return m15390n(this.f47655b, this.f47656c, collection, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection collection) {
            collection.getClass();
            m15387k();
            m15386j();
            return m15390n(this.f47655b, this.f47656c, collection, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            m15387k();
            m15386j();
            int i2 = this.f47656c;
            if (i < 0 || i >= i2) {
                v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
                return null;
            }
            Object[] objArr = this.f47654a;
            int i3 = this.f47655b;
            Object obj2 = objArr[i3 + i];
            objArr[i3 + i] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i, int i2) {
            b34.m3239f(i, i2, this.f47656c);
            return new BuilderSubList(this.f47654a, this.f47655b + i, i2 - i, this, this.f47658e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray(Object[] objArr) {
            objArr.getClass();
            m15386j();
            int length = objArr.length;
            int i = this.f47656c;
            Object[] objArr2 = this.f47654a;
            int i2 = this.f47655b;
            if (length < i) {
                Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
                objArrCopyOfRange.getClass();
                return objArrCopyOfRange;
            }
            AbstractC3550rv.m20826T(0, i2, i + i2, objArr2, objArr);
            int i3 = this.f47656c;
            if (i3 < objArr.length) {
                objArr[i3] = null;
            }
            return objArr;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            m15386j();
            return bq1.m4047W(this.f47654a, this.f47655b, this.f47656c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(Object obj) {
            m15387k();
            m15386j();
            m15385i(this.f47655b + this.f47656c, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            m15386j();
            Object[] objArr = this.f47654a;
            int i = this.f47656c;
            int i2 = this.f47655b;
            return AbstractC3550rv.m20832Z(objArr, i2, i + i2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection collection) {
            collection.getClass();
            m15387k();
            m15386j();
            int size = collection.size();
            m15384h(this.f47655b + this.f47656c, collection, size);
            return size > 0;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m15378j();
        int i = this.f47652b;
        ((AbstractList) this).modCount++;
        m15379k(i, 1);
        this.f47651a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC3550rv.m20832Z(this.f47651a, 0, this.f47652b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        m15378j();
        int size = collection.size();
        m15376h(this.f47652b, collection, size);
        return size > 0;
    }
}
