package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import ae.C0062b;
import cm.InterfaceC2052l;
import dm.C5201a;
import dm.C5207g;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p080e.C5288t;
import p100em.InterfaceC5430b;
import p126g0.InterfaceC5633c;
import p141h0.AbstractC5864a;
import p141h0.C5865b;
import p141h0.C5866c;
import p141h0.C5868e;
import p141h0.C5869f;
import p260m8.C7499b;
import p338qd.C8573r0;
import tl.AbstractC9315c;
import tl.C9322j;

/* JADX INFO: loaded from: classes.dex */
public final class PersistentVectorBuilder<E> extends AbstractC9315c<E> implements Collection, InterfaceC5430b {

    /* JADX INFO: renamed from: a */
    public InterfaceC5633c<? extends E> f3188a;

    /* JADX INFO: renamed from: b */
    public Object[] f3189b;

    /* JADX INFO: renamed from: c */
    public Object[] f3190c;

    /* JADX INFO: renamed from: d */
    public int f3191d;

    /* JADX INFO: renamed from: e */
    public C8573r0 f3192e;

    /* JADX INFO: renamed from: f */
    public Object[] f3193f;

    /* JADX INFO: renamed from: g */
    public Object[] f3194g;

    /* JADX INFO: renamed from: h */
    public int f3195h;

    public PersistentVectorBuilder(InterfaceC5633c<? extends E> interfaceC5633c, Object[] objArr, Object[] objArr2, int i10) {
        C5207g.m11111f(interfaceC5633c, "vector");
        C5207g.m11111f(objArr2, "vectorTail");
        this.f3188a = interfaceC5633c;
        this.f3189b = objArr;
        this.f3190c = objArr2;
        this.f3191d = i10;
        this.f3192e = new C8573r0();
        this.f3193f = objArr;
        this.f3194g = objArr2;
        this.f3195h = interfaceC5633c.size();
    }

    /* JADX INFO: renamed from: t */
    public static void m1814t(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m1815C(Collection<? extends E> collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f3193f == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int i13 = i10 >> 5;
        AbstractC5864a abstractC5864aM1819U = m1819U(m1840t0() >> 5);
        int i14 = i12;
        Object[] objArrM1821Y = objArr2;
        while (abstractC5864aM1819U.f35132a - 1 != i13) {
            Object[] objArr3 = (Object[]) abstractC5864aM1819U.previous();
            C9322j.m17673a0(0, 32 - i11, 32, objArr3, objArrM1821Y);
            objArrM1821Y = m1821Y(i11, objArr3);
            i14--;
            objArr[i14] = objArrM1821Y;
        }
        Object[] objArr4 = (Object[]) abstractC5864aM1819U.previous();
        int iM1840t0 = i12 - (((m1840t0() >> 5) - 1) - i13);
        if (iM1840t0 < i12) {
            objArr2 = objArr[iM1840t0];
            C5207g.m11108c(objArr2);
        }
        m1842v0(collection, i10, objArr4, 32, objArr, iM1840t0, objArr2);
    }

    /* JADX INFO: renamed from: D */
    public final Object[] m1816D(Object[] objArr, int i10, int i11, Object obj, C5288t c5288t) {
        Object obj2;
        int i12 = (i11 >> i10) & 31;
        if (i10 == 0) {
            c5288t.f33503b = objArr[31];
            Object[] objArrM1820X = m1820X(objArr);
            C9322j.m17673a0(i12 + 1, i12, 31, objArr, objArrM1820X);
            objArrM1820X[i12] = obj;
            return objArrM1820X;
        }
        Object[] objArrM1820X2 = m1820X(objArr);
        int i13 = i10 - 5;
        Object obj3 = objArrM1820X2[i12];
        C5207g.m11109d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrM1820X2[i12] = m1816D((Object[]) obj3, i13, i11, obj, c5288t);
        while (true) {
            i12++;
            if (i12 >= 32 || (obj2 = objArrM1820X2[i12]) == null) {
                break;
            }
            objArrM1820X2[i12] = m1816D((Object[]) obj2, i13, 0, c5288t.f33503b, c5288t);
        }
        return objArrM1820X2;
    }

    /* JADX INFO: renamed from: G */
    public final void m1817G(int i10, Object obj, Object[] objArr) {
        int iM1843w0 = m1843w0();
        Object[] objArrM1820X = m1820X(this.f3194g);
        if (iM1843w0 >= 32) {
            Object[] objArr2 = this.f3194g;
            Object obj2 = objArr2[31];
            C9322j.m17673a0(i10 + 1, i10, 31, objArr2, objArrM1820X);
            objArrM1820X[i10] = obj;
            m1831l0(objArr, objArrM1820X, m1824b0(obj2));
            return;
        }
        C9322j.m17673a0(i10 + 1, i10, iM1843w0, this.f3194g, objArrM1820X);
        objArrM1820X[i10] = obj;
        this.f3193f = objArr;
        this.f3194g = objArrM1820X;
        this.f3195h++;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m1818Q(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f3192e;
    }

    /* JADX INFO: renamed from: U */
    public final AbstractC5864a m1819U(int i10) {
        if (this.f3193f == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int iM1840t0 = m1840t0() >> 5;
        C0062b.m348g0(i10, iM1840t0);
        int i11 = this.f3191d;
        if (i11 == 0) {
            Object[] objArr = this.f3193f;
            C5207g.m11108c(objArr);
            return new C5865b(i10, objArr);
        }
        Object[] objArr2 = this.f3193f;
        C5207g.m11108c(objArr2);
        return new C5869f(objArr2, i10, iM1840t0, i11 / 5);
    }

    /* JADX INFO: renamed from: X */
    public final Object[] m1820X(Object[] objArr) {
        if (objArr == null) {
            return m1823a0();
        }
        if (m1818Q(objArr)) {
            return objArr;
        }
        Object[] objArrM1823a0 = m1823a0();
        int length = objArr.length;
        C9322j.m17675c0(objArr, objArrM1823a0, 0, 0, length > 32 ? 32 : length, 6);
        return objArrM1823a0;
    }

    /* JADX INFO: renamed from: Y */
    public final Object[] m1821Y(int i10, Object[] objArr) {
        if (m1818Q(objArr)) {
            C9322j.m17673a0(i10, 0, 32 - i10, objArr, objArr);
            return objArr;
        }
        Object[] objArrM1823a0 = m1823a0();
        C9322j.m17673a0(i10, 0, 32 - i10, objArr, objArrM1823a0);
        return objArrM1823a0;
    }

    @Override // tl.AbstractC9315c
    /* JADX INFO: renamed from: a */
    public final int mo1822a() {
        return this.f3195h;
    }

    /* JADX INFO: renamed from: a0 */
    public final Object[] m1823a0() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f3192e;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        C0062b.m348g0(i10, mo1822a());
        if (i10 == mo1822a()) {
            add(e10);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM1840t0 = m1840t0();
        if (i10 >= iM1840t0) {
            m1817G(i10 - iM1840t0, e10, this.f3193f);
            return;
        }
        C5288t c5288t = new C5288t(2, (Object) null);
        Object[] objArr = this.f3193f;
        C5207g.m11108c(objArr);
        m1817G(0, c5288t.f33503b, m1816D(objArr, this.f3191d, i10, e10, c5288t));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        ((AbstractList) this).modCount++;
        int iM1843w0 = m1843w0();
        if (iM1843w0 < 32) {
            Object[] objArrM1820X = m1820X(this.f3194g);
            objArrM1820X[iM1843w0] = e10;
            this.f3194g = objArrM1820X;
            this.f3195h = mo1822a() + 1;
        } else {
            m1831l0(this.f3193f, this.f3194g, m1824b0(e10));
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        Object[] objArrM1823a0;
        C5207g.m11111f(collection, "elements");
        C0062b.m348g0(i10, this.f3195h);
        if (i10 == this.f3195h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (this.f3195h - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            int size2 = ((collection.size() + i10) - 1) & 31;
            Object[] objArr = this.f3194g;
            Object[] objArrM1820X = m1820X(objArr);
            C9322j.m17673a0(size2 + 1, i12, m1843w0(), objArr, objArrM1820X);
            m1814t(objArrM1820X, i12, collection.iterator());
            this.f3194g = objArrM1820X;
            this.f3195h = collection.size() + this.f3195h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM1843w0 = m1843w0();
        int size3 = collection.size() + this.f3195h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i10 >= m1840t0()) {
            objArrM1823a0 = m1823a0();
            m1842v0(collection, i10, this.f3194g, iM1843w0, objArr2, size, objArrM1823a0);
        } else if (size3 > iM1843w0) {
            int i13 = size3 - iM1843w0;
            objArrM1823a0 = m1821Y(i13, this.f3194g);
            m1815C(collection, i10, i13, objArr2, size, objArrM1823a0);
        } else {
            Object[] objArr3 = this.f3194g;
            objArrM1823a0 = m1823a0();
            int i14 = iM1843w0 - size3;
            C9322j.m17673a0(0, i14, iM1843w0, objArr3, objArrM1823a0);
            int i15 = 32 - i14;
            Object[] objArrM1821Y = m1821Y(i15, this.f3194g);
            int i16 = size - 1;
            objArr2[i16] = objArrM1821Y;
            m1815C(collection, i10, i15, objArr2, i16, objArrM1821Y);
        }
        this.f3193f = m1829k0(this.f3193f, i11, objArr2);
        this.f3194g = objArrM1823a0;
        this.f3195h = collection.size() + this.f3195h;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        C5207g.m11111f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM1843w0 = m1843w0();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iM1843w0 >= collection.size()) {
            Object[] objArrM1820X = m1820X(this.f3194g);
            m1814t(objArrM1820X, iM1843w0, it);
            this.f3194g = objArrM1820X;
            this.f3195h = collection.size() + this.f3195h;
        } else {
            int size = ((collection.size() + iM1843w0) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] objArrM1820X2 = m1820X(this.f3194g);
            m1814t(objArrM1820X2, iM1843w0, it);
            objArr[0] = objArrM1820X2;
            for (int i10 = 1; i10 < size; i10++) {
                Object[] objArrM1823a0 = m1823a0();
                m1814t(objArrM1823a0, 0, it);
                objArr[i10] = objArrM1823a0;
            }
            this.f3193f = m1829k0(this.f3193f, m1840t0(), objArr);
            Object[] objArrM1823a1 = m1823a0();
            m1814t(objArrM1823a1, 0, it);
            this.f3194g = objArrM1823a1;
            this.f3195h = collection.size() + this.f3195h;
        }
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public final Object[] m1824b0(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f3192e;
        return objArr;
    }

    /* JADX INFO: renamed from: d0 */
    public final Object[] m1825d0(int i10, int i11, Object[] objArr) {
        if (!(i11 >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i11 == 0) {
            return objArr;
        }
        int i12 = (i10 >> i11) & 31;
        Object obj = objArr[i12];
        C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objM1825d0 = m1825d0(i10, i11 - 5, (Object[]) obj);
        if (i12 < 31) {
            int i13 = i12 + 1;
            if (objArr[i13] != null) {
                if (m1818Q(objArr)) {
                    Arrays.fill(objArr, i13, 32, (Object) null);
                }
                Object[] objArrM1823a0 = m1823a0();
                C9322j.m17673a0(0, 0, i13, objArr, objArrM1823a0);
                objArr = objArrM1823a0;
            }
        }
        if (objM1825d0 != objArr[i12]) {
            objArr = m1820X(objArr);
            objArr[i12] = objM1825d0;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: e0 */
    public final Object[] m1826e0(Object[] objArr, int i10, int i11, C5288t c5288t) {
        Object[] objArrM1826e0;
        int i12 = ((i11 - 1) >> i10) & 31;
        if (i10 == 5) {
            c5288t.f33503b = objArr[i12];
            objArrM1826e0 = null;
        } else {
            Object obj = objArr[i12];
            C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM1826e0 = m1826e0((Object[]) obj, i10 - 5, i11, c5288t);
        }
        if (objArrM1826e0 == null && i12 == 0) {
            return null;
        }
        Object[] objArrM1820X = m1820X(objArr);
        objArrM1820X[i12] = objArrM1826e0;
        return objArrM1820X;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m1827f0(int i10, int i11, Object[] objArr) {
        if (i11 == 0) {
            this.f3193f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f3194g = objArr;
            this.f3195h = i10;
            this.f3191d = i11;
            return;
        }
        C5288t c5288t = new C5288t(2, (Object) null);
        C5207g.m11108c(objArr);
        Object[] objArrM1826e0 = m1826e0(objArr, i11, i10, c5288t);
        C5207g.m11108c(objArrM1826e0);
        Object obj = c5288t.f33503b;
        C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f3194g = (Object[]) obj;
        this.f3195h = i10;
        if (objArrM1826e0[1] == null) {
            this.f3193f = (Object[]) objArrM1826e0[0];
            this.f3191d = i11 - 5;
        } else {
            this.f3193f = objArrM1826e0;
            this.f3191d = i11;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        Object[] objArr;
        C0062b.m342e0(i10, mo1822a());
        if (m1840t0() <= i10) {
            objArr = this.f3194g;
        } else {
            objArr = this.f3193f;
            C5207g.m11108c(objArr);
            for (int i11 = this.f3191d; i11 > 0; i11 -= 5) {
                Object obj = objArr[(i10 >> i11) & 31];
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i10 & 31];
    }

    /* JADX INFO: renamed from: h0 */
    public final Object[] m1828h0(Object[] objArr, int i10, int i11, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(i11 >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i11 == 0) {
            return it.next();
        }
        Object[] objArrM1820X = m1820X(objArr);
        int i12 = (i10 >> i11) & 31;
        int i13 = i11 - 5;
        objArrM1820X[i12] = m1828h0((Object[]) objArrM1820X[i12], i10, i13, it);
        while (true) {
            i12++;
            if (i12 >= 32 || !it.hasNext()) {
                break;
            }
            objArrM1820X[i12] = m1828h0((Object[]) objArrM1820X[i12], 0, i13, it);
        }
        return objArrM1820X;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: k0 */
    public final Object[] m1829k0(Object[] objArr, int i10, Object[][] objArr2) {
        C5201a c5201aM14931b0 = C7499b.m14931b0(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f3191d;
        Object[] objArrM1828h0 = i11 < (1 << i12) ? m1828h0(objArr, i10, i12, c5201aM14931b0) : m1820X(objArr);
        while (c5201aM14931b0.hasNext()) {
            this.f3191d += 5;
            objArrM1828h0 = m1824b0(objArrM1828h0);
            int i13 = this.f3191d;
            m1828h0(objArrM1828h0, 1 << i13, i13, c5201aM14931b0);
        }
        return objArrM1828h0;
    }

    @Override // tl.AbstractC9315c
    /* JADX INFO: renamed from: l */
    public final E mo1830l(int i10) {
        C0062b.m342e0(i10, mo1822a());
        ((AbstractList) this).modCount++;
        int iM1840t0 = m1840t0();
        if (i10 >= iM1840t0) {
            return (E) m1839s0(this.f3193f, iM1840t0, this.f3191d, i10 - iM1840t0);
        }
        C5288t c5288t = new C5288t(2, this.f3194g[0]);
        Object[] objArr = this.f3193f;
        C5207g.m11108c(objArr);
        m1839s0(m1838r0(objArr, this.f3191d, i10, c5288t), iM1840t0, this.f3191d, 0);
        return (E) c5288t.f33503b;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m1831l0(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f3195h;
        int i11 = i10 >> 5;
        int i12 = this.f3191d;
        if (i11 > (1 << i12)) {
            this.f3193f = m1832m0(this.f3191d + 5, m1824b0(objArr), objArr2);
            this.f3194g = objArr3;
            this.f3191d += 5;
            this.f3195h++;
            return;
        }
        if (objArr == null) {
            this.f3193f = objArr2;
            this.f3194g = objArr3;
            this.f3195h = i10 + 1;
        } else {
            this.f3193f = m1832m0(i12, objArr, objArr2);
            this.f3194g = objArr3;
            this.f3195h++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        C0062b.m348g0(i10, mo1822a());
        return new C5868e(this, i10);
    }

    /* JADX INFO: renamed from: m0 */
    public final Object[] m1832m0(int i10, Object[] objArr, Object[] objArr2) {
        int iMo1822a = ((mo1822a() - 1) >> i10) & 31;
        Object[] objArrM1820X = m1820X(objArr);
        if (i10 == 5) {
            objArrM1820X[iMo1822a] = objArr2;
        } else {
            objArrM1820X[iMo1822a] = m1832m0(i10 - 5, (Object[]) objArrM1820X[iMo1822a], objArr2);
        }
        return objArrM1820X;
    }

    /* JADX INFO: renamed from: n0 */
    public final int m1833n0(InterfaceC2052l interfaceC2052l, Object[] objArr, int i10, int i11, C5288t c5288t, ArrayList arrayList, ArrayList arrayList2) {
        if (m1818Q(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c5288t.f33503b;
        C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM1823a0 = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!((Boolean) interfaceC2052l.mo528n(obj2)).booleanValue()) {
                if (i11 == 32) {
                    objArrM1823a0 = arrayList.isEmpty() ^ true ? (Object[]) arrayList.remove(arrayList.size() - 1) : m1823a0();
                    i11 = 0;
                }
                objArrM1823a0[i11] = obj2;
                i11++;
            }
        }
        c5288t.f33503b = objArrM1823a0;
        if (objArr2 != objArrM1823a0) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    /* JADX INFO: renamed from: o0 */
    public final int m1834o0(InterfaceC2052l<? super E, Boolean> interfaceC2052l, Object[] objArr, int i10, C5288t c5288t) {
        Object[] objArrM1820X = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (interfaceC2052l.mo528n(obj).booleanValue()) {
                if (!z10) {
                    objArrM1820X = m1820X(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrM1820X[i11] = obj;
                i11++;
            }
        }
        c5288t.f33503b = objArrM1820X;
        return i11;
    }

    /* JADX INFO: renamed from: p0 */
    public final int m1835p0(InterfaceC2052l<? super E, Boolean> interfaceC2052l, int i10, C5288t c5288t) {
        int iM1834o0 = m1834o0(interfaceC2052l, this.f3194g, i10, c5288t);
        if (iM1834o0 == i10) {
            return i10;
        }
        Object obj = c5288t.f33503b;
        C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM1834o0, i10, (Object) null);
        this.f3194g = objArr;
        this.f3195h -= i10 - iM1834o0;
        return iM1834o0;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC5633c<E> m1836q() {
        C5866c c5866c;
        Object[] objArr = this.f3193f;
        if (objArr == this.f3189b && this.f3194g == this.f3190c) {
            c5866c = this.f3188a;
        } else {
            this.f3192e = new C8573r0();
            this.f3189b = objArr;
            Object[] objArr2 = this.f3194g;
            this.f3190c = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    c5866c = C0483a.f3197b;
                } else {
                    Object[] objArrCopyOf = Arrays.copyOf(this.f3194g, mo1822a());
                    C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
                    c5866c = new C0483a(objArrCopyOf);
                }
            } else {
                C5207g.m11108c(objArr);
                c5866c = new C5866c(mo1822a(), this.f3191d, objArr, this.f3194g);
            }
        }
        this.f3188a = c5866c;
        return (InterfaceC5633c<E>) c5866c;
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m1837q0(InterfaceC2052l<? super E, Boolean> interfaceC2052l) {
        Object[] objArrM1828h0;
        int i10;
        int iM1843w0 = m1843w0();
        Object[] objArrM1825d0 = null;
        C5288t c5288t = new C5288t(2, (Object) null);
        boolean z10 = false;
        if (this.f3193f != null) {
            AbstractC5864a abstractC5864aM1819U = m1819U(0);
            int i11 = 32;
            int iM1834o0 = 32;
            while (iM1834o0 == 32 && abstractC5864aM1819U.hasNext()) {
                iM1834o0 = m1834o0(interfaceC2052l, (Object[]) abstractC5864aM1819U.next(), 32, c5288t);
            }
            if (iM1834o0 == 32) {
                int iM1835p0 = m1835p0(interfaceC2052l, iM1843w0, c5288t);
                if (iM1835p0 == 0) {
                    m1827f0(this.f3195h, this.f3191d, this.f3193f);
                }
                if (iM1835p0 != iM1843w0) {
                }
            } else {
                int i12 = (abstractC5864aM1819U.f35132a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM1833n0 = iM1834o0;
                while (abstractC5864aM1819U.hasNext()) {
                    iM1833n0 = m1833n0(interfaceC2052l, (Object[]) abstractC5864aM1819U.next(), 32, iM1833n0, c5288t, arrayList2, arrayList);
                    i12 = i12;
                    i11 = i11;
                }
                int i13 = i12;
                int iM1833n1 = m1833n0(interfaceC2052l, this.f3194g, iM1843w0, iM1833n0, c5288t, arrayList2, arrayList);
                Object obj = c5288t.f33503b;
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iM1833n1, i11, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrM1828h0 = this.f3193f;
                    C5207g.m11108c(objArrM1828h0);
                } else {
                    objArrM1828h0 = m1828h0(this.f3193f, i13, this.f3191d, arrayList.iterator());
                }
                int size = i13 + (arrayList.size() << 5);
                if (!((size & 31) == 0)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (size == 0) {
                    this.f3191d = 0;
                } else {
                    int i14 = size - 1;
                    while (true) {
                        i10 = this.f3191d;
                        if ((i14 >> i10) != 0) {
                            break;
                        }
                        this.f3191d = i10 - 5;
                        Object[] objArr2 = objArrM1828h0[0];
                        C5207g.m11109d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrM1828h0 = objArr2;
                    }
                    objArrM1825d0 = m1825d0(i14, i10, objArrM1828h0);
                }
                this.f3193f = objArrM1825d0;
                this.f3194g = objArr;
                this.f3195h = size + iM1833n1;
            }
            z10 = true;
        } else if (m1835p0(interfaceC2052l, iM1843w0, c5288t) != iM1843w0) {
            z10 = true;
        }
        if (z10) {
            ((AbstractList) this).modCount++;
        }
        return z10;
    }

    /* JADX INFO: renamed from: r0 */
    public final Object[] m1838r0(Object[] objArr, int i10, int i11, C5288t c5288t) {
        int i12 = (i11 >> i10) & 31;
        if (i10 == 0) {
            Object obj = objArr[i12];
            Object[] objArrM1820X = m1820X(objArr);
            C9322j.m17673a0(i12, i12 + 1, 32, objArr, objArrM1820X);
            objArrM1820X[31] = c5288t.f33503b;
            c5288t.f33503b = obj;
            return objArrM1820X;
        }
        int iM1840t0 = objArr[31] == null ? 31 & ((m1840t0() - 1) >> i10) : 31;
        Object[] objArrM1820X2 = m1820X(objArr);
        int i13 = i10 - 5;
        int i14 = i12 + 1;
        if (i14 <= iM1840t0) {
            while (true) {
                Object obj2 = objArrM1820X2[iM1840t0];
                C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrM1820X2[iM1840t0] = m1838r0((Object[]) obj2, i13, 0, c5288t);
                if (iM1840t0 == i14) {
                    break;
                }
                iM1840t0--;
            }
        }
        Object obj3 = objArrM1820X2[i12];
        C5207g.m11109d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrM1820X2[i12] = m1838r0((Object[]) obj3, i13, i11, c5288t);
        return objArrM1820X2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(final Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        return m1837q0(new InterfaceC2052l<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.removeAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(Object obj) {
                return Boolean.valueOf(collection.contains(obj));
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final Object m1839s0(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f3195h - i10;
        if (i13 == 1) {
            Object obj = this.f3194g[0];
            m1827f0(i10, i11, objArr);
            return obj;
        }
        Object[] objArr2 = this.f3194g;
        Object obj2 = objArr2[i12];
        Object[] objArrM1820X = m1820X(objArr2);
        C9322j.m17673a0(i12, i12 + 1, i13, objArr2, objArrM1820X);
        objArrM1820X[i13 - 1] = null;
        this.f3193f = objArr;
        this.f3194g = objArrM1820X;
        this.f3195h = (i10 + i13) - 1;
        this.f3191d = i11;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        C0062b.m342e0(i10, mo1822a());
        if (m1840t0() > i10) {
            C5288t c5288t = new C5288t(2, (Object) null);
            Object[] objArr = this.f3193f;
            C5207g.m11108c(objArr);
            this.f3193f = m1841u0(objArr, this.f3191d, i10, e10, c5288t);
            return (E) c5288t.f33503b;
        }
        Object[] objArrM1820X = m1820X(this.f3194g);
        if (objArrM1820X != this.f3194g) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        E e11 = (E) objArrM1820X[i11];
        objArrM1820X[i11] = e10;
        this.f3194g = objArrM1820X;
        return e11;
    }

    /* JADX INFO: renamed from: t0 */
    public final int m1840t0() {
        if (mo1822a() <= 32) {
            return 0;
        }
        return (mo1822a() - 1) & (-32);
    }

    /* JADX INFO: renamed from: u0 */
    public final Object[] m1841u0(Object[] objArr, int i10, int i11, E e10, C5288t c5288t) {
        int i12 = (i11 >> i10) & 31;
        Object[] objArrM1820X = m1820X(objArr);
        if (i10 != 0) {
            Object obj = objArrM1820X[i12];
            C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM1820X[i12] = m1841u0((Object[]) obj, i10 - 5, i11, e10, c5288t);
            return objArrM1820X;
        }
        if (objArrM1820X != objArr) {
            ((AbstractList) this).modCount++;
        }
        c5288t.f33503b = objArrM1820X[i12];
        objArrM1820X[i12] = e10;
        return objArrM1820X;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m1842v0(Collection<? extends E> collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrM1823a0;
        if (!(i12 >= 1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Object[] objArrM1820X = m1820X(objArr);
        objArr2[0] = objArrM1820X;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            C9322j.m17673a0(size + 1, i13, i11, objArrM1820X, objArr3);
        } else {
            int i15 = (i14 - 32) + 1;
            if (i12 == 1) {
                objArrM1823a0 = objArrM1820X;
            } else {
                objArrM1823a0 = m1823a0();
                i12--;
                objArr2[i12] = objArrM1823a0;
            }
            int i16 = i11 - i15;
            C9322j.m17673a0(0, i16, i11, objArrM1820X, objArr3);
            C9322j.m17673a0(size + 1, i13, i16, objArrM1820X, objArrM1823a0);
            objArr3 = objArrM1823a0;
        }
        Iterator<? extends E> it = collection.iterator();
        m1814t(objArrM1820X, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] objArrM1823a1 = m1823a0();
            m1814t(objArrM1823a1, 0, it);
            objArr2[i17] = objArrM1823a1;
        }
        m1814t(objArr3, 0, it);
    }

    /* JADX INFO: renamed from: w0 */
    public final int m1843w0() {
        int i10 = this.f3195h;
        return i10 <= 32 ? i10 : i10 - ((i10 - 1) & (-32));
    }

    /* JADX INFO: renamed from: y */
    public final int m1844y() {
        return ((AbstractList) this).modCount;
    }
}
