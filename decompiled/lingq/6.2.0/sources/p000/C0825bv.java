package p000;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: bv */
/* JADX INFO: loaded from: classes.dex */
public final class C0825bv extends AbstractC2985f1 {

    /* JADX INFO: renamed from: d */
    public static final Object[] f9038d = new Object[0];

    /* JADX INFO: renamed from: a */
    public int f9039a;

    /* JADX INFO: renamed from: b */
    public Object[] f9040b;

    /* JADX INFO: renamed from: c */
    public int f9041c;

    public C0825bv(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f9038d;
        } else {
            if (i <= 0) {
                C3386nv.m17626m(ux5.m22988k(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.f9040b = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.f9041c;
        if (i < 0 || i > i2) {
            v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m4192o();
        m4185h(this.f9041c + 1);
        int iM4191n = m4191n(this.f9039a + i);
        int i3 = this.f9041c;
        if (i < ((i3 + 1) >> 1)) {
            if (iM4191n == 0) {
                Object[] objArr = this.f9040b;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iM4191n - 1;
            }
            int length2 = this.f9039a;
            if (length2 == 0) {
                Object[] objArr2 = this.f9040b;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i4 = length2 - 1;
            int i5 = this.f9039a;
            Object[] objArr3 = this.f9040b;
            if (length >= i5) {
                objArr3[i4] = objArr3[i5];
                AbstractC3550rv.m20826T(i5, i5 + 1, length + 1, objArr3, objArr3);
            } else {
                AbstractC3550rv.m20826T(i5 - 1, i5, objArr3.length, objArr3, objArr3);
                Object[] objArr4 = this.f9040b;
                objArr4[objArr4.length - 1] = objArr4[0];
                AbstractC3550rv.m20826T(0, 1, length + 1, objArr4, objArr4);
            }
            this.f9040b[length] = obj;
            this.f9039a = i4;
        } else {
            int iM4191n2 = m4191n(i3 + this.f9039a);
            Object[] objArr5 = this.f9040b;
            if (iM4191n < iM4191n2) {
                AbstractC3550rv.m20826T(iM4191n + 1, iM4191n, iM4191n2, objArr5, objArr5);
            } else {
                AbstractC3550rv.m20826T(1, 0, iM4191n2, objArr5, objArr5);
                Object[] objArr6 = this.f9040b;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC3550rv.m20826T(iM4191n + 1, iM4191n, objArr6.length - 1, objArr6, objArr6);
            }
            this.f9040b[iM4191n] = obj;
        }
        this.f9041c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.f9041c;
        if (i < 0 || i > i2) {
            v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f9041c) {
            return addAll(collection);
        }
        m4192o();
        m4185h(collection.size() + this.f9041c);
        int iM4191n = m4191n(this.f9041c + this.f9039a);
        int iM4191n2 = m4191n(this.f9039a + i);
        int size = collection.size();
        if (i >= ((this.f9041c + 1) >> 1)) {
            int i3 = iM4191n2 + size;
            Object[] objArr = this.f9040b;
            if (iM4191n2 < iM4191n) {
                int i4 = size + iM4191n;
                if (i4 <= objArr.length) {
                    AbstractC3550rv.m20826T(i3, iM4191n2, iM4191n, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    AbstractC3550rv.m20826T(i3 - objArr.length, iM4191n2, iM4191n, objArr, objArr);
                } else {
                    int length = iM4191n - (i4 - objArr.length);
                    AbstractC3550rv.m20826T(0, length, iM4191n, objArr, objArr);
                    Object[] objArr2 = this.f9040b;
                    AbstractC3550rv.m20826T(i3, iM4191n2, length, objArr2, objArr2);
                }
            } else {
                AbstractC3550rv.m20826T(size, 0, iM4191n, objArr, objArr);
                Object[] objArr3 = this.f9040b;
                if (i3 >= objArr3.length) {
                    AbstractC3550rv.m20826T(i3 - objArr3.length, iM4191n2, objArr3.length, objArr3, objArr3);
                } else {
                    AbstractC3550rv.m20826T(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.f9040b;
                    AbstractC3550rv.m20826T(i3, iM4191n2, objArr4.length - size, objArr4, objArr4);
                }
            }
            m4184g(iM4191n2, collection);
            return true;
        }
        int i5 = this.f9039a;
        int length2 = i5 - size;
        Object[] objArr5 = this.f9040b;
        if (iM4191n2 < i5) {
            AbstractC3550rv.m20826T(length2, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.f9040b;
            if (size >= iM4191n2) {
                AbstractC3550rv.m20826T(objArr6.length - size, 0, iM4191n2, objArr6, objArr6);
            } else {
                AbstractC3550rv.m20826T(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.f9040b;
                AbstractC3550rv.m20826T(0, size, iM4191n2, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            AbstractC3550rv.m20826T(length2, i5, iM4191n2, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i6 = iM4191n2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                AbstractC3550rv.m20826T(length2, i5, iM4191n2, objArr5, objArr5);
            } else {
                AbstractC3550rv.m20826T(length2, i5, i5 + length3, objArr5, objArr5);
                Object[] objArr8 = this.f9040b;
                AbstractC3550rv.m20826T(0, this.f9039a + length3, iM4191n2, objArr8, objArr8);
            }
        }
        this.f9039a = length2;
        m4184g(m4189l(iM4191n2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m4192o();
        m4185h(this.f9041c + 1);
        int length = this.f9039a;
        if (length == 0) {
            Object[] objArr = this.f9040b;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.f9039a = i;
        this.f9040b[i] = obj;
        this.f9041c++;
    }

    public final void addLast(Object obj) {
        m4192o();
        m4185h(mo4182d() + 1);
        this.f9040b[m4191n(mo4182d() + this.f9039a)] = obj;
        this.f9041c = mo4182d() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m4192o();
            m4190m(this.f9039a, m4191n(mo4182d() + this.f9039a));
        }
        this.f9039a = 0;
        this.f9041c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.AbstractC2985f1
    /* JADX INFO: renamed from: d */
    public final int mo4182d() {
        return this.f9041c;
    }

    @Override // p000.AbstractC2985f1
    /* JADX INFO: renamed from: f */
    public final Object mo4183f(int i) {
        int i2 = this.f9041c;
        if (i < 0 || i >= i2) {
            v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
            return null;
        }
        if (i == mo4182d() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m4192o();
        int iM4191n = m4191n(this.f9039a + i);
        Object[] objArr = this.f9040b;
        Object obj = objArr[iM4191n];
        int i3 = this.f9041c >> 1;
        int i4 = this.f9039a;
        if (i < i3) {
            if (iM4191n >= i4) {
                AbstractC3550rv.m20826T(i4 + 1, i4, iM4191n, objArr, objArr);
            } else {
                AbstractC3550rv.m20826T(1, 0, iM4191n, objArr, objArr);
                Object[] objArr2 = this.f9040b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f9039a;
                AbstractC3550rv.m20826T(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f9040b;
            int i6 = this.f9039a;
            objArr3[i6] = null;
            this.f9039a = m4187j(i6);
        } else {
            int iM4191n2 = m4191n((mo4182d() - 1) + i4);
            Object[] objArr4 = this.f9040b;
            if (iM4191n <= iM4191n2) {
                AbstractC3550rv.m20826T(iM4191n, iM4191n + 1, iM4191n2 + 1, objArr4, objArr4);
            } else {
                AbstractC3550rv.m20826T(iM4191n, iM4191n + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f9040b;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC3550rv.m20826T(0, 1, iM4191n2 + 1, objArr5, objArr5);
            }
            this.f9040b[iM4191n2] = null;
        }
        this.f9041c--;
        return obj;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f9040b[this.f9039a];
        }
        uk9.m22775i("ArrayDeque is empty.");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m4184g(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f9040b.length;
        while (i < length && it.hasNext()) {
            this.f9040b[i] = it.next();
            i++;
        }
        int i2 = this.f9039a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f9040b[i3] = it.next();
        }
        this.f9041c = collection.size() + this.f9041c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iMo4182d = mo4182d();
        if (i >= 0 && i < iMo4182d) {
            return this.f9040b[m4191n(this.f9039a + i)];
        }
        v63.m23143u(wq1.m24115k("index: ", i, iMo4182d, ", size: "));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m4185h(int i) {
        if (i < 0) {
            C3386nv.m17633t("Deque is too big.");
            return;
        }
        Object[] objArr = this.f9040b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f9038d) {
            if (i < 10) {
                i = 10;
            }
            this.f9040b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        AbstractC3550rv.m20826T(0, this.f9039a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f9040b;
        int length2 = objArr3.length;
        int i3 = this.f9039a;
        AbstractC3550rv.m20826T(length2 - i3, 0, i3, objArr3, objArr2);
        this.f9039a = 0;
        this.f9040b = objArr2;
    }

    /* JADX INFO: renamed from: i */
    public final Object m4186i() {
        if (isEmpty()) {
            return null;
        }
        return this.f9040b[this.f9039a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM4191n = m4191n(mo4182d() + this.f9039a);
        int length = this.f9039a;
        if (length < iM4191n) {
            while (length < iM4191n) {
                if (fa4.m11650l(obj, this.f9040b[length])) {
                    i = this.f9039a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f9039a) < iM4191n) {
            return -1;
        }
        int length2 = this.f9040b.length;
        while (length < length2) {
            if (fa4.m11650l(obj, this.f9040b[length])) {
                i = this.f9039a;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iM4191n; i2++) {
            if (fa4.m11650l(obj, this.f9040b[i2])) {
                length = i2 + this.f9040b.length;
                i = this.f9039a;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo4182d() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final int m4187j(int i) {
        Object[] objArr = this.f9040b;
        objArr.getClass();
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: k */
    public final Object m4188k() {
        if (isEmpty()) {
            return null;
        }
        return this.f9040b[m4191n((size() - 1) + this.f9039a)];
    }

    /* JADX INFO: renamed from: l */
    public final int m4189l(int i) {
        return i < 0 ? i + this.f9040b.length : i;
    }

    public final Object last() {
        if (isEmpty()) {
            uk9.m22775i("ArrayDeque is empty.");
            return null;
        }
        return this.f9040b[m4191n((size() - 1) + this.f9039a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iM4191n = m4191n(this.f9041c + this.f9039a);
        int i2 = this.f9039a;
        if (i2 < iM4191n) {
            length = iM4191n - 1;
            if (i2 <= length) {
                while (!fa4.m11650l(obj, this.f9040b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f9039a;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f9039a >= iM4191n) {
            do {
                iM4191n--;
                objArr = this.f9040b;
                if (-1 >= iM4191n) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.f9039a;
                    if (i3 <= length) {
                        while (!fa4.m11650l(obj, this.f9040b[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.f9039a;
                    }
                }
                return length - i;
            } while (!fa4.m11650l(obj, objArr[iM4191n]));
            length = iM4191n + this.f9040b.length;
            i = this.f9039a;
            return length - i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public final void m4190m(int i, int i2) {
        Object[] objArr = this.f9040b;
        if (i < i2) {
            AbstractC3550rv.m20833a0(i, i2, null, objArr);
        } else {
            AbstractC3550rv.m20833a0(i, objArr.length, null, objArr);
            AbstractC3550rv.m20833a0(0, i2, null, this.f9040b);
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m4191n(int i) {
        Object[] objArr = this.f9040b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX INFO: renamed from: o */
    public final void m4192o() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo4183f(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM4191n;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f9040b.length != 0) {
            int iM4191n2 = m4191n(mo4182d() + this.f9039a);
            int i = this.f9039a;
            if (i < iM4191n2) {
                iM4191n = i;
                while (true) {
                    objArr = this.f9040b;
                    if (i >= iM4191n2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f9040b[iM4191n] = obj;
                        iM4191n++;
                    }
                    i++;
                }
                AbstractC3550rv.m20833a0(iM4191n, iM4191n2, null, objArr);
            } else {
                int length = this.f9040b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f9040b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f9040b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM4191n = m4191n(i2);
                for (int i3 = 0; i3 < iM4191n2; i3++) {
                    Object[] objArr3 = this.f9040b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f9040b[iM4191n] = obj3;
                        iM4191n = m4187j(iM4191n);
                    }
                }
                z = z2;
            }
            if (z) {
                m4192o();
                this.f9041c = m4189l(iM4191n - this.f9039a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            uk9.m22775i("ArrayDeque is empty.");
            return null;
        }
        m4192o();
        Object[] objArr = this.f9040b;
        int i = this.f9039a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f9039a = m4187j(i);
        this.f9041c = mo4182d() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            uk9.m22775i("ArrayDeque is empty.");
            return null;
        }
        m4192o();
        int iM4191n = m4191n((size() - 1) + this.f9039a);
        Object[] objArr = this.f9040b;
        Object obj = objArr[iM4191n];
        objArr[iM4191n] = null;
        this.f9041c = mo4182d() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b34.m3239f(i, i2, this.f9041c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f9041c) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo4183f(i);
            return;
        }
        m4192o();
        int i4 = this.f9041c - i2;
        int i5 = this.f9039a;
        if (i < i4) {
            int iM4191n = m4191n((i - 1) + i5);
            int iM4191n2 = m4191n(this.f9039a + (i2 - 1));
            while (i > 0) {
                int i6 = iM4191n + 1;
                int iMin = Math.min(i, Math.min(i6, iM4191n2 + 1));
                Object[] objArr = this.f9040b;
                int i7 = iM4191n2 - iMin;
                int i8 = iM4191n - iMin;
                AbstractC3550rv.m20826T(i7 + 1, i8 + 1, i6, objArr, objArr);
                iM4191n = m4189l(i8);
                iM4191n2 = m4189l(i7);
                i -= iMin;
            }
            int iM4191n3 = m4191n(this.f9039a + i3);
            m4190m(this.f9039a, iM4191n3);
            this.f9039a = iM4191n3;
        } else {
            int iM4191n4 = m4191n(i5 + i2);
            int iM4191n5 = m4191n(this.f9039a + i);
            int i9 = this.f9041c;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f9040b;
                i2 = Math.min(i9, Math.min(objArr2.length - iM4191n4, objArr2.length - iM4191n5));
                Object[] objArr3 = this.f9040b;
                int i10 = iM4191n4 + i2;
                AbstractC3550rv.m20826T(iM4191n5, iM4191n4, i10, objArr3, objArr3);
                iM4191n4 = m4191n(i10);
                iM4191n5 = m4191n(iM4191n5 + i2);
            }
            int iM4191n6 = m4191n(this.f9041c + this.f9039a);
            m4190m(m4189l(iM4191n6 - i3), iM4191n6);
        }
        this.f9041c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM4191n;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f9040b.length != 0) {
            int iM4191n2 = m4191n(mo4182d() + this.f9039a);
            int i = this.f9039a;
            if (i < iM4191n2) {
                iM4191n = i;
                while (true) {
                    objArr = this.f9040b;
                    if (i >= iM4191n2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f9040b[iM4191n] = obj;
                        iM4191n++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                AbstractC3550rv.m20833a0(iM4191n, iM4191n2, null, objArr);
            } else {
                int length = this.f9040b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f9040b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f9040b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM4191n = m4191n(i2);
                for (int i3 = 0; i3 < iM4191n2; i3++) {
                    Object[] objArr3 = this.f9040b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f9040b[iM4191n] = obj3;
                        iM4191n = m4187j(iM4191n);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m4192o();
                this.f9041c = m4189l(iM4191n - this.f9039a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iMo4182d = mo4182d();
        if (i < 0 || i >= iMo4182d) {
            v63.m23143u(wq1.m24115k("index: ", i, iMo4182d, ", size: "));
            return null;
        }
        int iM4191n = m4191n(this.f9039a + i);
        Object[] objArr = this.f9040b;
        Object obj2 = objArr[iM4191n];
        objArr[iM4191n] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f9041c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iM4191n = m4191n(this.f9041c + this.f9039a);
        int i2 = this.f9039a;
        if (i2 < iM4191n) {
            AbstractC3550rv.m20830X(i2, iM4191n, 2, this.f9040b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f9040b;
            AbstractC3550rv.m20826T(0, this.f9039a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f9040b;
            AbstractC3550rv.m20826T(objArr3.length - this.f9039a, 0, iM4191n, objArr3, objArr);
        }
        int i3 = this.f9041c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public C0825bv() {
        this.f9040b = f9038d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo4182d()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        m4192o();
        m4185h(collection.size() + mo4182d());
        m4184g(m4191n(mo4182d() + this.f9039a), collection);
        return true;
    }
}
