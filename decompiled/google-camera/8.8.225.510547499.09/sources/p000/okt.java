package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class okt extends okq {

    /* JADX INFO: renamed from: b */
    private static final Object[] f46210b = new Object[0];

    /* JADX INFO: renamed from: a */
    public int f46211a;

    /* JADX INFO: renamed from: c */
    private int f46212c;

    /* JADX INFO: renamed from: d */
    private Object[] f46213d = f46210b;

    /* JADX INFO: renamed from: d */
    private final int m18597d(int i) {
        return i == 0 ? omn.m18686Z(this.f46213d) : i - 1;
    }

    /* JADX INFO: renamed from: e */
    private final int m18598e(int i) {
        if (i == omn.m18686Z(this.f46213d)) {
            return 0;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: f */
    private final int m18599f(int i) {
        return i < 0 ? i + this.f46213d.length : i;
    }

    /* JADX INFO: renamed from: g */
    private final int m18600g(int i) {
        int length = this.f46213d.length;
        return i >= length ? i - length : i;
    }

    /* JADX INFO: renamed from: h */
    private final void m18601h(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f46213d.length;
        while (i < length && it.hasNext()) {
            this.f46213d[i] = it.next();
            i++;
        }
        int i2 = this.f46212c;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f46213d[i3] = it.next();
        }
        this.f46211a += collection.size();
    }

    /* JADX INFO: renamed from: i */
    private final void m18602i(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f46213d;
        int length = objArr.length;
        if (i <= length) {
            return;
        }
        if (objArr == f46210b) {
            this.f46213d = new Object[ook.m18789c(i, 10)];
            return;
        }
        Object[] objArr2 = new Object[lkm.m15586m(length, i)];
        omn.m18693ag(objArr, objArr2, 0, this.f46212c, length);
        Object[] objArr3 = this.f46213d;
        int length2 = objArr3.length;
        int i2 = this.f46212c;
        omn.m18693ag(objArr3, objArr2, length2 - i2, 0, i2);
        this.f46212c = 0;
        this.f46213d = objArr2;
    }

    @Override // p000.okq
    /* JADX INFO: renamed from: a */
    public final int mo18594a() {
        return this.f46211a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        lkm.m15588o(i, this.f46211a);
        int i2 = this.f46211a;
        if (i == i2) {
            m18603c(obj);
            return;
        }
        if (i == 0) {
            m18602i(i2 + 1);
            int iM18597d = m18597d(this.f46212c);
            this.f46212c = iM18597d;
            this.f46213d[iM18597d] = obj;
            this.f46211a++;
            return;
        }
        m18602i(i2 + 1);
        int iM18600g = m18600g(this.f46212c + i);
        int i3 = this.f46211a;
        if (i < ((i3 + 1) >> 1)) {
            int iM18597d2 = m18597d(iM18600g);
            int iM18597d3 = m18597d(this.f46212c);
            int i4 = this.f46212c;
            if (iM18597d2 >= i4) {
                Object[] objArr = this.f46213d;
                objArr[iM18597d3] = objArr[i4];
                omn.m18693ag(objArr, objArr, i4, i4 + 1, iM18597d2 + 1);
            } else {
                Object[] objArr2 = this.f46213d;
                omn.m18693ag(objArr2, objArr2, i4 - 1, i4, objArr2.length);
                Object[] objArr3 = this.f46213d;
                objArr3[objArr3.length - 1] = objArr3[0];
                omn.m18693ag(objArr3, objArr3, 0, 1, iM18597d2 + 1);
            }
            this.f46213d[iM18597d2] = obj;
            this.f46212c = iM18597d3;
        } else {
            int iM18600g2 = m18600g(this.f46212c + i3);
            if (iM18600g < iM18600g2) {
                Object[] objArr4 = this.f46213d;
                omn.m18693ag(objArr4, objArr4, iM18600g + 1, iM18600g, iM18600g2);
            } else {
                Object[] objArr5 = this.f46213d;
                omn.m18693ag(objArr5, objArr5, 1, 0, iM18600g2);
                Object[] objArr6 = this.f46213d;
                int length = objArr6.length - 1;
                objArr6[0] = objArr6[length];
                omn.m18693ag(objArr6, objArr6, iM18600g + 1, iM18600g, length);
            }
            this.f46213d[iM18600g] = obj;
        }
        this.f46211a++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        lkm.m15588o(i, this.f46211a);
        if (collection.isEmpty()) {
            return false;
        }
        int i2 = this.f46211a;
        if (i == i2) {
            return addAll(collection);
        }
        m18602i(i2 + collection.size());
        int iM18600g = m18600g(this.f46212c + this.f46211a);
        int iM18600g2 = m18600g(this.f46212c + i);
        int size = collection.size();
        if (i < ((this.f46211a + 1) >> 1)) {
            int i3 = this.f46212c;
            int i4 = i3 - size;
            if (iM18600g2 < i3) {
                Object[] objArr = this.f46213d;
                omn.m18693ag(objArr, objArr, i4, i3, objArr.length);
                if (size >= iM18600g2) {
                    Object[] objArr2 = this.f46213d;
                    omn.m18693ag(objArr2, objArr2, objArr2.length - size, 0, iM18600g2);
                } else {
                    Object[] objArr3 = this.f46213d;
                    omn.m18693ag(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f46213d;
                    omn.m18693ag(objArr4, objArr4, 0, size, iM18600g2);
                }
            } else if (i4 >= 0) {
                Object[] objArr5 = this.f46213d;
                omn.m18693ag(objArr5, objArr5, i4, i3, iM18600g2);
            } else {
                Object[] objArr6 = this.f46213d;
                int length = objArr6.length;
                i4 += length;
                int i5 = length - i4;
                if (i5 >= iM18600g2 - i3) {
                    omn.m18693ag(objArr6, objArr6, i4, i3, iM18600g2);
                } else {
                    omn.m18693ag(objArr6, objArr6, i4, i3, i3 + i5);
                    Object[] objArr7 = this.f46213d;
                    omn.m18693ag(objArr7, objArr7, 0, this.f46212c + i5, iM18600g2);
                }
            }
            this.f46212c = i4;
            m18601h(m18599f(iM18600g2 - size), collection);
        } else {
            int i6 = iM18600g2 + size;
            if (iM18600g2 < iM18600g) {
                int i7 = size + iM18600g;
                Object[] objArr8 = this.f46213d;
                int length2 = objArr8.length;
                if (i7 <= length2) {
                    omn.m18693ag(objArr8, objArr8, i6, iM18600g2, iM18600g);
                } else if (i6 >= length2) {
                    omn.m18693ag(objArr8, objArr8, i6 - length2, iM18600g2, iM18600g);
                } else {
                    int i8 = iM18600g - (i7 - length2);
                    omn.m18693ag(objArr8, objArr8, 0, i8, iM18600g);
                    Object[] objArr9 = this.f46213d;
                    omn.m18693ag(objArr9, objArr9, i6, iM18600g2, i8);
                }
            } else {
                Object[] objArr10 = this.f46213d;
                omn.m18693ag(objArr10, objArr10, size, 0, iM18600g);
                Object[] objArr11 = this.f46213d;
                int length3 = objArr11.length;
                if (i6 >= length3) {
                    omn.m18693ag(objArr11, objArr11, i6 - length3, iM18600g2, length3);
                } else {
                    omn.m18693ag(objArr11, objArr11, 0, length3 - size, length3);
                    Object[] objArr12 = this.f46213d;
                    omn.m18693ag(objArr12, objArr12, i6, iM18600g2, objArr12.length - size);
                }
            }
            m18601h(iM18600g2, collection);
        }
        return true;
    }

    @Override // p000.okq
    /* JADX INFO: renamed from: b */
    public final Object mo18595b(int i) {
        lkm.m15587n(i, this.f46211a);
        if (i == omn.m18667G(this)) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            int iM18600g = m18600g(this.f46212c + omn.m18667G(this));
            Object[] objArr = this.f46213d;
            Object obj = objArr[iM18600g];
            objArr[iM18600g] = null;
            this.f46211a--;
            return obj;
        }
        if (i == 0) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            Object[] objArr2 = this.f46213d;
            int i2 = this.f46212c;
            Object obj2 = objArr2[i2];
            objArr2[i2] = null;
            this.f46212c = m18598e(i2);
            this.f46211a--;
            return obj2;
        }
        int iM18600g2 = m18600g(this.f46212c + i);
        Object[] objArr3 = this.f46213d;
        Object obj3 = objArr3[iM18600g2];
        if (i < (this.f46211a >> 1)) {
            int i3 = this.f46212c;
            if (iM18600g2 >= i3) {
                omn.m18693ag(objArr3, objArr3, i3 + 1, i3, iM18600g2);
            } else {
                omn.m18693ag(objArr3, objArr3, 1, 0, iM18600g2);
                Object[] objArr4 = this.f46213d;
                int length = objArr4.length - 1;
                objArr4[0] = objArr4[length];
                int i4 = this.f46212c;
                omn.m18693ag(objArr4, objArr4, i4 + 1, i4, length);
            }
            Object[] objArr5 = this.f46213d;
            int i5 = this.f46212c;
            objArr5[i5] = null;
            this.f46212c = m18598e(i5);
        } else {
            int iM18600g3 = m18600g(this.f46212c + omn.m18667G(this));
            if (iM18600g2 <= iM18600g3) {
                Object[] objArr6 = this.f46213d;
                omn.m18693ag(objArr6, objArr6, iM18600g2, iM18600g2 + 1, iM18600g3 + 1);
            } else {
                Object[] objArr7 = this.f46213d;
                omn.m18693ag(objArr7, objArr7, iM18600g2, iM18600g2 + 1, objArr7.length);
                Object[] objArr8 = this.f46213d;
                objArr8[objArr8.length - 1] = objArr8[0];
                omn.m18693ag(objArr8, objArr8, 0, 1, iM18600g3 + 1);
            }
            this.f46213d[iM18600g3] = null;
        }
        this.f46211a--;
        return obj3;
    }

    /* JADX INFO: renamed from: c */
    public final void m18603c(Object obj) {
        m18602i(this.f46211a + 1);
        this.f46213d[m18600g(this.f46212c + this.f46211a)] = obj;
        this.f46211a++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iM18600g = m18600g(this.f46212c + this.f46211a);
        int i = this.f46212c;
        if (i < iM18600g) {
            omn.m18684X(this.f46213d, null, i, iM18600g);
        } else if (!isEmpty()) {
            Object[] objArr = this.f46213d;
            omn.m18684X(objArr, null, i, objArr.length);
            omn.m18684X(this.f46213d, null, 0, iM18600g);
        }
        this.f46212c = 0;
        this.f46211a = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        lkm.m15587n(i, this.f46211a);
        return this.f46213d[m18600g(this.f46212c + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int iM18600g = m18600g(this.f46212c + this.f46211a);
        int i = this.f46212c;
        if (i < iM18600g) {
            while (i < iM18600g) {
                if (ooc.m18737c(obj, this.f46213d[i])) {
                    return i - this.f46212c;
                }
                i++;
            }
            return -1;
        }
        if (i < iM18600g) {
            return -1;
        }
        int length = this.f46213d.length;
        while (i < length) {
            if (ooc.m18737c(obj, this.f46213d[i])) {
                return i - this.f46212c;
            }
            i++;
        }
        for (int i2 = 0; i2 < iM18600g; i2++) {
            if (ooc.m18737c(obj, this.f46213d[i2])) {
                return (i2 + this.f46213d.length) - this.f46212c;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f46211a == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int iM18600g = m18600g(this.f46212c + this.f46211a);
        int i = this.f46212c;
        if (i < iM18600g) {
            int i2 = iM18600g - 1;
            if (i <= i2) {
                while (!ooc.m18737c(obj, this.f46213d[i2])) {
                    if (i2 != i) {
                        i2--;
                    }
                }
                return i2 - this.f46212c;
            }
        } else if (i > iM18600g) {
            for (int i3 = iM18600g - 1; i3 >= 0; i3--) {
                if (ooc.m18737c(obj, this.f46213d[i3])) {
                    return (i3 + this.f46213d.length) - this.f46212c;
                }
            }
            int iM18686Z = omn.m18686Z(this.f46213d);
            int i4 = this.f46212c;
            if (i4 <= iM18686Z) {
                while (!ooc.m18737c(obj, this.f46213d[iM18686Z])) {
                    if (iM18686Z != i4) {
                        iM18686Z--;
                    }
                }
                return iM18686Z - this.f46212c;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo18595b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM18600g;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f46213d.length != 0) {
            int iM18600g2 = m18600g(this.f46212c + this.f46211a);
            int i = this.f46212c;
            if (i < iM18600g2) {
                iM18600g = i;
                while (i < iM18600g2) {
                    Object obj = this.f46213d[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f46213d[iM18600g] = obj;
                        iM18600g++;
                    }
                    i++;
                }
                omn.m18684X(this.f46213d, null, iM18600g, iM18600g2);
            } else {
                int length = this.f46213d.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.f46213d;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f46213d[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM18600g = m18600g(i2);
                for (int i3 = 0; i3 < iM18600g2; i3++) {
                    Object[] objArr2 = this.f46213d;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f46213d[iM18600g] = obj3;
                        iM18600g = m18598e(iM18600g);
                    }
                }
                z = z2;
            }
            if (z) {
                this.f46211a = m18599f(iM18600g - this.f46212c);
                return true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM18600g;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f46213d.length != 0) {
            int iM18600g2 = m18600g(this.f46212c + this.f46211a);
            int i = this.f46212c;
            if (i < iM18600g2) {
                iM18600g = i;
                while (i < iM18600g2) {
                    Object obj = this.f46213d[i];
                    if (collection.contains(obj)) {
                        this.f46213d[iM18600g] = obj;
                        iM18600g++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                omn.m18684X(this.f46213d, null, iM18600g, iM18600g2);
            } else {
                int length = this.f46213d.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.f46213d;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f46213d[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM18600g = m18600g(i2);
                for (int i3 = 0; i3 < iM18600g2; i3++) {
                    Object[] objArr2 = this.f46213d;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f46213d[iM18600g] = obj3;
                        iM18600g = m18598e(iM18600g);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.f46211a = m18599f(iM18600g - this.f46212c);
                return true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        lkm.m15587n(i, this.f46211a);
        int iM18600g = m18600g(this.f46212c + i);
        Object[] objArr = this.f46213d;
        Object obj2 = objArr[iM18600g];
        objArr[iM18600g] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f46211a]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f46211a;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iM18600g = m18600g(this.f46212c + this.f46211a);
        int i2 = this.f46212c;
        if (i2 < iM18600g) {
            omn.m18696aj(this.f46213d, objArr, 0, i2, iM18600g, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f46213d;
            omn.m18693ag(objArr2, objArr, 0, i2, objArr2.length);
            Object[] objArr3 = this.f46213d;
            omn.m18693ag(objArr3, objArr, objArr3.length - this.f46212c, 0, iM18600g);
        }
        int length2 = objArr.length;
        int i3 = this.f46211a;
        if (length2 > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m18603c(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        m18602i(this.f46211a + collection.size());
        m18601h(m18600g(this.f46212c + this.f46211a), collection);
        return true;
    }
}
