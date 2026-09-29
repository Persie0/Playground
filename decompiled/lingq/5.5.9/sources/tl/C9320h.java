package tl;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import dm.C5207g;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.C6744b;
import p385sf.C9000b;

/* JADX INFO: renamed from: tl.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C9320h<E> extends AbstractC9315c<E> {

    /* JADX INFO: renamed from: d */
    public static final Object[] f48058d = new Object[0];

    /* JADX INFO: renamed from: a */
    public int f48059a;

    /* JADX INFO: renamed from: b */
    public Object[] f48060b;

    /* JADX INFO: renamed from: c */
    public int f48061c;

    public C9320h() {
        this.f48060b = f48058d;
    }

    public C9320h(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f48058d;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException(C0166e.m761g("Illegal Capacity: ", i10));
            }
            objArr = new Object[i10];
        }
        this.f48060b = objArr;
    }

    /* JADX INFO: renamed from: C */
    public final void m17661C(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f48060b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f48058d) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f48060b = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        C9322j.m17673a0(0, this.f48059a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f48060b;
        int length2 = objArr3.length;
        int i12 = this.f48059a;
        C9322j.m17673a0(length2 - i12, 0, i12, objArr3, objArr2);
        this.f48059a = 0;
        this.f48060b = objArr2;
    }

    /* JADX INFO: renamed from: D */
    public final int m17662D(int i10) {
        if (i10 == C6744b.m13381m0(this.f48060b)) {
            return 0;
        }
        return i10 + 1;
    }

    /* JADX INFO: renamed from: G */
    public final E m17663G() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f48060b[m17664Q(C9000b.m17249o(this) + this.f48059a)];
    }

    /* JADX INFO: renamed from: Q */
    public final int m17664Q(int i10) {
        Object[] objArr = this.f48060b;
        if (i10 >= objArr.length) {
            i10 -= objArr.length;
        }
        return i10;
    }

    /* JADX INFO: renamed from: U */
    public final E m17665U() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f48060b;
        int i10 = this.f48059a;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.f48059a = m17662D(i10);
        this.f48061c = mo1822a() - 1;
        return e10;
    }

    /* JADX INFO: renamed from: X */
    public final E m17666X() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iM17664Q = m17664Q(C9000b.m17249o(this) + this.f48059a);
        Object[] objArr = this.f48060b;
        E e10 = (E) objArr[iM17664Q];
        objArr[iM17664Q] = null;
        this.f48061c = mo1822a() - 1;
        return e10;
    }

    @Override // tl.AbstractC9315c
    /* JADX INFO: renamed from: a */
    public final int mo1822a() {
        return this.f48061c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11 = this.f48061c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(C0204c.m851j("index: ", i10, ", size: ", i11));
        }
        if (i10 == i11) {
            m17668t(e10);
            return;
        }
        if (i10 == 0) {
            m17667q(e10);
            return;
        }
        m17661C(i11 + 1);
        int iM17664Q = m17664Q(this.f48059a + i10);
        int i12 = this.f48061c;
        if (i10 < ((i12 + 1) >> 1)) {
            int iM13381m0 = iM17664Q == 0 ? C6744b.m13381m0(this.f48060b) : iM17664Q - 1;
            int i13 = this.f48059a;
            int iM13381m1 = i13 == 0 ? C6744b.m13381m0(this.f48060b) : i13 - 1;
            int i14 = this.f48059a;
            if (iM13381m0 >= i14) {
                Object[] objArr = this.f48060b;
                objArr[iM13381m1] = objArr[i14];
                C9322j.m17673a0(i14, i14 + 1, iM13381m0 + 1, objArr, objArr);
            } else {
                Object[] objArr2 = this.f48060b;
                C9322j.m17673a0(i14 - 1, i14, objArr2.length, objArr2, objArr2);
                Object[] objArr3 = this.f48060b;
                objArr3[objArr3.length - 1] = objArr3[0];
                C9322j.m17673a0(0, 1, iM13381m0 + 1, objArr3, objArr3);
            }
            this.f48060b[iM13381m0] = e10;
            this.f48059a = iM13381m1;
        } else {
            int iM17664Q2 = m17664Q(i12 + this.f48059a);
            if (iM17664Q < iM17664Q2) {
                Object[] objArr4 = this.f48060b;
                C9322j.m17673a0(iM17664Q + 1, iM17664Q, iM17664Q2, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f48060b;
                C9322j.m17673a0(1, 0, iM17664Q2, objArr5, objArr5);
                Object[] objArr6 = this.f48060b;
                objArr6[0] = objArr6[objArr6.length - 1];
                C9322j.m17673a0(iM17664Q + 1, iM17664Q, objArr6.length - 1, objArr6, objArr6);
            }
            this.f48060b[iM17664Q] = e10;
        }
        this.f48061c++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        m17668t(e10);
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        C5207g.m11111f(collection, "elements");
        int i11 = this.f48061c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(C0204c.m851j("index: ", i10, ", size: ", i11));
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i12 = this.f48061c;
        if (i10 == i12) {
            return addAll(collection);
        }
        m17661C(collection.size() + i12);
        int iM17664Q = m17664Q(this.f48061c + this.f48059a);
        int iM17664Q2 = m17664Q(this.f48059a + i10);
        int size = collection.size();
        if (i10 < ((this.f48061c + 1) >> 1)) {
            int i13 = this.f48059a;
            int length = i13 - size;
            if (iM17664Q2 < i13) {
                Object[] objArr = this.f48060b;
                C9322j.m17673a0(length, i13, objArr.length, objArr, objArr);
                if (size >= iM17664Q2) {
                    Object[] objArr2 = this.f48060b;
                    C9322j.m17673a0(objArr2.length - size, 0, iM17664Q2, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.f48060b;
                    C9322j.m17673a0(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.f48060b;
                    C9322j.m17673a0(0, size, iM17664Q2, objArr4, objArr4);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f48060b;
                C9322j.m17673a0(length, i13, iM17664Q2, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.f48060b;
                length += objArr6.length;
                int i14 = iM17664Q2 - i13;
                int length2 = objArr6.length - length;
                if (length2 >= i14) {
                    C9322j.m17673a0(length, i13, iM17664Q2, objArr6, objArr6);
                } else {
                    C9322j.m17673a0(length, i13, i13 + length2, objArr6, objArr6);
                    Object[] objArr7 = this.f48060b;
                    C9322j.m17673a0(0, this.f48059a + length2, iM17664Q2, objArr7, objArr7);
                }
            }
            this.f48059a = length;
            int length3 = iM17664Q2 - size;
            if (length3 < 0) {
                length3 += this.f48060b.length;
            }
            m17669y(length3, collection);
        } else {
            int i15 = iM17664Q2 + size;
            if (iM17664Q2 < iM17664Q) {
                int i16 = size + iM17664Q;
                Object[] objArr8 = this.f48060b;
                if (i16 <= objArr8.length) {
                    C9322j.m17673a0(i15, iM17664Q2, iM17664Q, objArr8, objArr8);
                } else if (i15 >= objArr8.length) {
                    C9322j.m17673a0(i15 - objArr8.length, iM17664Q2, iM17664Q, objArr8, objArr8);
                } else {
                    int length4 = iM17664Q - (i16 - objArr8.length);
                    C9322j.m17673a0(0, length4, iM17664Q, objArr8, objArr8);
                    Object[] objArr9 = this.f48060b;
                    C9322j.m17673a0(i15, iM17664Q2, length4, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.f48060b;
                C9322j.m17673a0(size, 0, iM17664Q, objArr10, objArr10);
                Object[] objArr11 = this.f48060b;
                if (i15 >= objArr11.length) {
                    C9322j.m17673a0(i15 - objArr11.length, iM17664Q2, objArr11.length, objArr11, objArr11);
                } else {
                    C9322j.m17673a0(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.f48060b;
                    C9322j.m17673a0(i15, iM17664Q2, objArr12.length - size, objArr12, objArr12);
                }
            }
            m17669y(iM17664Q2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        C5207g.m11111f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m17661C(collection.size() + mo1822a());
        m17669y(m17664Q(mo1822a() + this.f48059a), collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iM17664Q = m17664Q(this.f48061c + this.f48059a);
        int i10 = this.f48059a;
        if (i10 < iM17664Q) {
            C9322j.m17678f0(i10, iM17664Q, this.f48060b);
        } else if (!isEmpty()) {
            Object[] objArr = this.f48060b;
            C9322j.m17678f0(this.f48059a, objArr.length, objArr);
            C9322j.m17678f0(0, iM17664Q, this.f48060b);
        }
        this.f48059a = 0;
        this.f48061c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f48060b[this.f48059a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        int iMo1822a = mo1822a();
        if (i10 < 0 || i10 >= iMo1822a) {
            throw new IndexOutOfBoundsException(C0204c.m851j("index: ", i10, ", size: ", iMo1822a));
        }
        return (E) this.f48060b[m17664Q(this.f48059a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int iM17664Q = m17664Q(mo1822a() + this.f48059a);
        int length = this.f48059a;
        if (length < iM17664Q) {
            while (length < iM17664Q) {
                if (C5207g.m11106a(obj, this.f48060b[length])) {
                    i10 = this.f48059a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM17664Q) {
            return -1;
        }
        int length2 = this.f48060b.length;
        while (length < length2) {
            if (C5207g.m11106a(obj, this.f48060b[length])) {
                i10 = this.f48059a;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iM17664Q; i11++) {
            if (C5207g.m11106a(obj, this.f48060b[i11])) {
                length = i11 + this.f48060b.length;
                i10 = this.f48059a;
            }
        }
        return -1;
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo1822a() == 0;
    }

    @Override // tl.AbstractC9315c
    /* JADX INFO: renamed from: l */
    public final E mo1830l(int i10) {
        int i11 = this.f48061c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(C0204c.m851j("index: ", i10, ", size: ", i11));
        }
        if (i10 == C9000b.m17249o(this)) {
            return m17666X();
        }
        if (i10 == 0) {
            return m17665U();
        }
        int iM17664Q = m17664Q(this.f48059a + i10);
        Object[] objArr = this.f48060b;
        E e10 = (E) objArr[iM17664Q];
        if (i10 < (this.f48061c >> 1)) {
            int i12 = this.f48059a;
            if (iM17664Q >= i12) {
                C9322j.m17673a0(i12 + 1, i12, iM17664Q, objArr, objArr);
            } else {
                C9322j.m17673a0(1, 0, iM17664Q, objArr, objArr);
                Object[] objArr2 = this.f48060b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.f48059a;
                C9322j.m17673a0(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f48060b;
            int i14 = this.f48059a;
            objArr3[i14] = null;
            this.f48059a = m17662D(i14);
        } else {
            int iM17664Q2 = m17664Q(C9000b.m17249o(this) + this.f48059a);
            if (iM17664Q <= iM17664Q2) {
                Object[] objArr4 = this.f48060b;
                C9322j.m17673a0(iM17664Q, iM17664Q + 1, iM17664Q2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f48060b;
                C9322j.m17673a0(iM17664Q, iM17664Q + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f48060b;
                objArr6[objArr6.length - 1] = objArr6[0];
                C9322j.m17673a0(0, 1, iM17664Q2 + 1, objArr6, objArr6);
            }
            this.f48060b[iM17664Q2] = null;
        }
        this.f48061c--;
        return e10;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f48060b[m17664Q(C9000b.m17249o(this) + this.f48059a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int iM13381m0;
        int i10;
        int iM17664Q = m17664Q(mo1822a() + this.f48059a);
        int i11 = this.f48059a;
        if (i11 < iM17664Q) {
            iM13381m0 = iM17664Q - 1;
            if (i11 <= iM13381m0) {
                while (!C5207g.m11106a(obj, this.f48060b[iM13381m0])) {
                    if (iM13381m0 != i11) {
                        iM13381m0--;
                    }
                }
                i10 = this.f48059a;
                return iM13381m0 - i10;
            }
            return -1;
        }
        if (i11 > iM17664Q) {
            for (int i12 = iM17664Q - 1; -1 < i12; i12--) {
                if (C5207g.m11106a(obj, this.f48060b[i12])) {
                    iM13381m0 = i12 + this.f48060b.length;
                    i10 = this.f48059a;
                    return iM13381m0 - i10;
                }
            }
            iM13381m0 = C6744b.m13381m0(this.f48060b);
            int i13 = this.f48059a;
            if (i13 <= iM13381m0) {
                while (!C5207g.m11106a(obj, this.f48060b[iM13381m0])) {
                    if (iM13381m0 != i13) {
                        iM13381m0--;
                    }
                }
                i10 = this.f48059a;
                return iM13381m0 - i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: q */
    public final void m17667q(E e10) {
        m17661C(this.f48061c + 1);
        int i10 = this.f48059a;
        int iM13381m0 = i10 == 0 ? C6744b.m13381m0(this.f48060b) : i10 - 1;
        this.f48059a = iM13381m0;
        this.f48060b[iM13381m0] = e10;
        this.f48061c++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo1830l(iIndexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        int iM17664Q;
        C5207g.m11111f(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f48060b.length == 0) == false) {
                int iM17664Q2 = m17664Q(this.f48061c + this.f48059a);
                int i10 = this.f48059a;
                if (i10 < iM17664Q2) {
                    iM17664Q = i10;
                    while (i10 < iM17664Q2) {
                        Object obj = this.f48060b[i10];
                        if (!collection.contains(obj)) {
                            this.f48060b[iM17664Q] = obj;
                            iM17664Q++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    C9322j.m17678f0(iM17664Q, iM17664Q2, this.f48060b);
                } else {
                    int length = this.f48060b.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f48060b;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (!collection.contains(obj2)) {
                            this.f48060b[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    iM17664Q = m17664Q(i11);
                    for (int i12 = 0; i12 < iM17664Q2; i12++) {
                        Object[] objArr2 = this.f48060b;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (!collection.contains(obj3)) {
                            this.f48060b[iM17664Q] = obj3;
                            iM17664Q = m17662D(iM17664Q);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    int length2 = iM17664Q - this.f48059a;
                    if (length2 < 0) {
                        length2 += this.f48060b.length;
                    }
                    this.f48061c = length2;
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> collection) {
        int iM17664Q;
        boolean z10;
        C5207g.m11111f(collection, "elements");
        boolean z11 = false;
        if (!isEmpty()) {
            if (!(this.f48060b.length == 0)) {
                int iM17664Q2 = m17664Q(this.f48061c + this.f48059a);
                int i10 = this.f48059a;
                if (i10 < iM17664Q2) {
                    iM17664Q = i10;
                    while (i10 < iM17664Q2) {
                        Object obj = this.f48060b[i10];
                        if (collection.contains(obj)) {
                            z10 = z11;
                            this.f48060b[iM17664Q] = obj;
                            iM17664Q++;
                        } else {
                            z10 = z11;
                            z10 = true;
                        }
                        i10++;
                        z10 = z10;
                    }
                    z10 = z11;
                    C9322j.m17678f0(iM17664Q, iM17664Q2, this.f48060b);
                    z11 = z10;
                } else {
                    int length = this.f48060b.length;
                    boolean z12 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f48060b;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (collection.contains(obj2)) {
                            this.f48060b[i11] = obj2;
                            i11++;
                        } else {
                            z12 = true;
                        }
                        i10++;
                    }
                    iM17664Q = m17664Q(i11);
                    for (?? r10 = z11; r10 < iM17664Q2; r10++) {
                        Object[] objArr2 = this.f48060b;
                        Object obj3 = objArr2[r10];
                        objArr2[r10] = null;
                        if (collection.contains(obj3)) {
                            this.f48060b[iM17664Q] = obj3;
                            iM17664Q = m17662D(iM17664Q);
                        } else {
                            z12 = true;
                        }
                    }
                    z11 = z12;
                }
                if (z11) {
                    int length2 = iM17664Q - this.f48059a;
                    if (length2 < 0) {
                        length2 += this.f48060b.length;
                    }
                    this.f48061c = length2;
                }
            }
        }
        return z11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        int iMo1822a = mo1822a();
        if (i10 < 0 || i10 >= iMo1822a) {
            throw new IndexOutOfBoundsException(C0204c.m851j("index: ", i10, ", size: ", iMo1822a));
        }
        int iM17664Q = m17664Q(this.f48059a + i10);
        Object[] objArr = this.f48060b;
        E e11 = (E) objArr[iM17664Q];
        objArr[iM17664Q] = e10;
        return e11;
    }

    /* JADX INFO: renamed from: t */
    public final void m17668t(E e10) {
        m17661C(mo1822a() + 1);
        this.f48060b[m17664Q(mo1822a() + this.f48059a)] = e10;
        this.f48061c = mo1822a() + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo1822a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        C5207g.m11111f(tArr, "array");
        int length = tArr.length;
        int i10 = this.f48061c;
        if (length < i10) {
            Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), i10);
            C5207g.m11109d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            tArr = (T[]) ((Object[]) objNewInstance);
        }
        int iM17664Q = m17664Q(this.f48061c + this.f48059a);
        int i11 = this.f48059a;
        if (i11 < iM17664Q) {
            C9322j.m17675c0(this.f48060b, tArr, 0, i11, iM17664Q, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f48060b;
            C9322j.m17673a0(0, this.f48059a, objArr.length, objArr, tArr);
            Object[] objArr2 = this.f48060b;
            C9322j.m17673a0(objArr2.length - this.f48059a, 0, iM17664Q, objArr2, tArr);
        }
        int length2 = tArr.length;
        int i12 = this.f48061c;
        if (length2 > i12) {
            tArr[i12] = null;
        }
        return tArr;
    }

    /* JADX INFO: renamed from: y */
    public final void m17669y(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f48060b.length;
        while (i10 < length && it.hasNext()) {
            this.f48060b[i10] = it.next();
            i10++;
        }
        int i11 = this.f48059a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f48060b[i12] = it.next();
        }
        this.f48061c = collection.size() + mo1822a();
    }
}
