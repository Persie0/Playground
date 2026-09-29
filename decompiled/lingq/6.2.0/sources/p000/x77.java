package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class x77 extends AbstractC2985f1 implements Collection, ug4 {

    /* JADX INFO: renamed from: a */
    public AbstractC3096i1 f67892a;

    /* JADX INFO: renamed from: b */
    public Object[] f67893b;

    /* JADX INFO: renamed from: c */
    public Object[] f67894c;

    /* JADX INFO: renamed from: d */
    public int f67895d;

    /* JADX INFO: renamed from: e */
    public u06 f67896e = new u06(13);

    /* JADX INFO: renamed from: f */
    public Object[] f67897f;

    /* JADX INFO: renamed from: g */
    public Object[] f67898g;

    /* JADX INFO: renamed from: h */
    public int f67899h;

    public x77(AbstractC3096i1 abstractC3096i1, Object[] objArr, Object[] objArr2, int i) {
        this.f67892a = abstractC3096i1;
        this.f67893b = objArr;
        this.f67894c = objArr2;
        this.f67895d = i;
        this.f67897f = objArr;
        this.f67898g = objArr2;
        this.f67899h = abstractC3096i1.mo3718d();
    }

    /* JADX INFO: renamed from: h */
    public static void m24370h(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    /* JADX INFO: renamed from: B */
    public final Object[] m24371B(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            hi7.m13278a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            hi7.m13278a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM24392o = m24392o(objArr);
        int iM3613f = bca.m3613f(i, i2);
        int i3 = i2 - 5;
        objArrM24392o[iM3613f] = m24371B((Object[]) objArrM24392o[iM3613f], i, i3, it);
        while (true) {
            iM3613f++;
            if (iM3613f >= 32 || !it.hasNext()) {
                break;
            }
            objArrM24392o[iM3613f] = m24371B((Object[]) objArrM24392o[iM3613f], 0, i3, it);
        }
        return objArrM24392o;
    }

    /* JADX INFO: renamed from: C */
    public final Object[] m24372C(Object[] objArr, int i, Object[][] objArr2) {
        C3705w0 c3705w0 = new C3705w0(objArr2);
        int i2 = i >> 5;
        int i3 = this.f67895d;
        Object[] objArrM24371B = i2 < (1 << i3) ? m24371B(objArr, i, i3, c3705w0) : m24392o(objArr);
        while (c3705w0.hasNext()) {
            this.f67895d += 5;
            objArrM24371B = m24395t(objArrM24371B);
            int i4 = this.f67895d;
            m24371B(objArrM24371B, 1 << i4, i4, c3705w0);
        }
        return objArrM24371B;
    }

    /* JADX INFO: renamed from: D */
    public final void m24373D(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f67899h;
        int i2 = i >> 5;
        int i3 = this.f67895d;
        if (i2 > (1 << i3)) {
            this.f67897f = m24374E(m24395t(objArr), objArr2, this.f67895d + 5);
            this.f67898g = objArr3;
            this.f67895d += 5;
            this.f67899h++;
            return;
        }
        if (objArr == null) {
            this.f67897f = objArr2;
            this.f67898g = objArr3;
            this.f67899h = i + 1;
        } else {
            this.f67897f = m24374E(objArr, objArr2, i3);
            this.f67898g = objArr3;
            this.f67899h++;
        }
    }

    /* JADX INFO: renamed from: E */
    public final Object[] m24374E(Object[] objArr, Object[] objArr2, int i) {
        int iM3613f = bca.m3613f(mo4182d() - 1, i);
        Object[] objArrM24392o = m24392o(objArr);
        if (i == 5) {
            objArrM24392o[iM3613f] = objArr2;
            return objArrM24392o;
        }
        objArrM24392o[iM3613f] = m24374E((Object[]) objArrM24392o[iM3613f], objArr2, i - 5);
        return objArrM24392o;
    }

    /* JADX INFO: renamed from: F */
    public final int m24375F(vi3 vi3Var, Object[] objArr, int i, int i2, C0006a4 c0006a4, ArrayList arrayList, ArrayList arrayList2) {
        if (m24390m(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c0006a4.f193a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM24394s = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) vi3Var.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrM24394s = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m24394s();
                    i2 = 0;
                }
                objArrM24394s[i2] = obj2;
                i2++;
            }
        }
        c0006a4.f193a = objArrM24394s;
        if (objArr2 != objArrM24394s) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* JADX INFO: renamed from: G */
    public final int m24376G(vi3 vi3Var, Object[] objArr, int i, C0006a4 c0006a4) {
        Object[] objArrM24392o = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) vi3Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrM24392o = m24392o(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrM24392o[i2] = obj;
                i2++;
            }
        }
        c0006a4.f193a = objArrM24392o;
        return i2;
    }

    /* JADX INFO: renamed from: H */
    public final int m24377H(vi3 vi3Var, int i, C0006a4 c0006a4) {
        int iM24376G = m24376G(vi3Var, this.f67898g, i, c0006a4);
        Object obj = c0006a4.f193a;
        if (iM24376G == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM24376G, i, (Object) null);
        this.f67898g = objArr;
        this.f67899h -= i - iM24376G;
        return iM24376G;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m24378I(vi3 vi3Var) {
        int i;
        vi3 vi3Var2 = vi3Var;
        int iM24384P = m24384P();
        Object[] objArrM24396v = null;
        C0006a4 c0006a4 = new C0006a4(objArrM24396v);
        boolean z = false;
        if (this.f67897f != null) {
            AbstractC0003a1 abstractC0003a1M24391n = m24391n(0);
            int iM24376G = 32;
            while (iM24376G == 32 && abstractC0003a1M24391n.hasNext()) {
                iM24376G = m24376G(vi3Var2, (Object[]) abstractC0003a1M24391n.next(), 32, c0006a4);
            }
            if (iM24376G == 32) {
                int iM24377H = m24377H(vi3Var2, iM24384P, c0006a4);
                if (iM24377H == 0) {
                    m24398y(this.f67897f, this.f67899h, this.f67895d);
                }
                if (iM24377H != iM24384P) {
                }
            } else {
                int i2 = (abstractC0003a1M24391n.f41a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM24375F = iM24376G;
                while (abstractC0003a1M24391n.hasNext()) {
                    iM24375F = m24375F(vi3Var2, (Object[]) abstractC0003a1M24391n.next(), 32, iM24375F, c0006a4, arrayList2, arrayList);
                    vi3Var2 = vi3Var;
                }
                int iM24375F2 = m24375F(vi3Var, this.f67898g, iM24384P, iM24375F, c0006a4, arrayList2, arrayList);
                Object obj = c0006a4.f193a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iM24375F2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrM24371B = this.f67897f;
                if (zIsEmpty) {
                    objArrM24371B.getClass();
                } else {
                    objArrM24371B = m24371B(objArrM24371B, i2, this.f67895d, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    hi7.m13278a("invalid size");
                }
                if (size == 0) {
                    this.f67895d = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.f67895d;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.f67895d = i - 5;
                        Object[] objArr2 = objArrM24371B[0];
                        objArr2.getClass();
                        objArrM24371B = objArr2;
                    }
                    objArrM24396v = m24396v(objArrM24371B, i3, i);
                }
                this.f67897f = objArrM24396v;
                this.f67898g = objArr;
                this.f67899h = size + iM24375F2;
            }
            z = true;
        } else if (m24377H(vi3Var2, iM24384P, c0006a4) != iM24384P) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    /* JADX INFO: renamed from: J */
    public final Object[] m24379J(Object[] objArr, int i, int i2, C0006a4 c0006a4) {
        int iM3613f = bca.m3613f(i2, i);
        if (i == 0) {
            Object obj = objArr[iM3613f];
            Object[] objArrM24392o = m24392o(objArr);
            AbstractC3550rv.m20826T(iM3613f, iM3613f + 1, 32, objArr, objArrM24392o);
            objArrM24392o[31] = c0006a4.f193a;
            c0006a4.f193a = obj;
            return objArrM24392o;
        }
        int iM3613f2 = objArr[31] == null ? bca.m3613f(m24381L() - 1, i) : 31;
        Object[] objArrM24392o2 = m24392o(objArr);
        int i3 = i - 5;
        int i4 = iM3613f + 1;
        if (i4 <= iM3613f2) {
            while (true) {
                Object obj2 = objArrM24392o2[iM3613f2];
                obj2.getClass();
                objArrM24392o2[iM3613f2] = m24379J((Object[]) obj2, i3, 0, c0006a4);
                if (iM3613f2 == i4) {
                    break;
                }
                iM3613f2--;
            }
        }
        Object obj3 = objArrM24392o2[iM3613f];
        obj3.getClass();
        objArrM24392o2[iM3613f] = m24379J((Object[]) obj3, i3, i2, c0006a4);
        return objArrM24392o2;
    }

    /* JADX INFO: renamed from: K */
    public final Object m24380K(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f67899h - i;
        Object[] objArr2 = this.f67898g;
        if (i4 == 1) {
            Object obj = objArr2[0];
            m24398y(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrM24392o = m24392o(objArr2);
        AbstractC3550rv.m20826T(i3, i3 + 1, i4, objArr2, objArrM24392o);
        objArrM24392o[i4 - 1] = null;
        this.f67897f = objArr;
        this.f67898g = objArrM24392o;
        this.f67899h = (i + i4) - 1;
        this.f67895d = i2;
        return obj2;
    }

    /* JADX INFO: renamed from: L */
    public final int m24381L() {
        int i = this.f67899h;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    /* JADX INFO: renamed from: M */
    public final Object[] m24382M(Object[] objArr, int i, int i2, Object obj, C0006a4 c0006a4) {
        int iM3613f = bca.m3613f(i2, i);
        Object[] objArrM24392o = m24392o(objArr);
        if (i != 0) {
            Object obj2 = objArrM24392o[iM3613f];
            obj2.getClass();
            objArrM24392o[iM3613f] = m24382M((Object[]) obj2, i - 5, i2, obj, c0006a4);
            return objArrM24392o;
        }
        if (objArrM24392o != objArr) {
            ((AbstractList) this).modCount++;
        }
        c0006a4.f193a = objArrM24392o[iM3613f];
        objArrM24392o[iM3613f] = obj;
        return objArrM24392o;
    }

    /* JADX INFO: renamed from: O */
    public final void m24383O(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM24394s;
        if (i3 < 1) {
            hi7.m13278a("requires at least one nullBuffer");
        }
        Object[] objArrM24392o = m24392o(objArr);
        objArr2[0] = objArrM24392o;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            AbstractC3550rv.m20826T(size + 1, i4, i2, objArrM24392o, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM24394s = objArrM24392o;
            } else {
                objArrM24394s = m24394s();
                i3--;
                objArr2[i3] = objArrM24394s;
            }
            int i7 = i2 - i6;
            AbstractC3550rv.m20826T(0, i7, i2, objArrM24392o, objArr3);
            AbstractC3550rv.m20826T(size + 1, i4, i7, objArrM24392o, objArrM24394s);
            objArr3 = objArrM24394s;
        }
        Iterator it = collection.iterator();
        m24370h(objArrM24392o, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM24394s2 = m24394s();
            m24370h(objArrM24394s2, 0, it);
            objArr2[i8] = objArrM24394s2;
        }
        m24370h(objArr3, 0, it);
    }

    /* JADX INFO: renamed from: P */
    public final int m24384P() {
        int i = this.f67899h;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        vz1.m23644o(i, mo4182d());
        if (i == mo4182d()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM24381L = m24381L();
        if (i >= iM24381L) {
            m24389l(i - iM24381L, obj, this.f67897f);
            return;
        }
        C0006a4 c0006a4 = new C0006a4(null);
        Object[] objArr = this.f67897f;
        objArr.getClass();
        m24389l(0, c0006a4.f193a, m24388k(objArr, this.f67895d, i, obj, c0006a4));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrM24394s;
        vz1.m23644o(i, this.f67899h);
        if (i == this.f67899h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f67899h - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f67898g;
            Object[] objArrM24392o = m24392o(objArr);
            AbstractC3550rv.m20826T(size2 + 1, i3, m24384P(), objArr, objArrM24392o);
            m24370h(objArrM24392o, i3, collection.iterator());
            this.f67898g = objArrM24392o;
            this.f67899h = collection.size() + this.f67899h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM24384P = m24384P();
        int size3 = collection.size() + this.f67899h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= m24381L()) {
            objArrM24394s = m24394s();
            collection2 = collection;
            m24383O(collection2, i, this.f67898g, iM24384P, objArr2, size, objArrM24394s);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.f67898g;
            if (size3 > iM24384P) {
                int i4 = size3 - iM24384P;
                Object[] objArrM24393r = m24393r(objArr3, i4);
                m24387j(collection2, i, i4, objArr2, size, objArrM24393r);
                objArr2 = objArr2;
                objArrM24394s = objArrM24393r;
            } else {
                objArrM24394s = m24394s();
                int i5 = iM24384P - size3;
                AbstractC3550rv.m20826T(0, i5, iM24384P, objArr3, objArrM24394s);
                int i6 = 32 - i5;
                Object[] objArrM24393r2 = m24393r(this.f67898g, i6);
                int i7 = size - 1;
                objArr2[i7] = objArrM24393r2;
                m24387j(collection2, i, i6, objArr2, i7, objArrM24393r2);
                collection2 = collection2;
            }
        }
        this.f67897f = m24372C(this.f67897f, i2, objArr2);
        this.f67898g = objArrM24394s;
        this.f67899h = collection2.size() + this.f67899h;
        return true;
    }

    @Override // p000.AbstractC2985f1
    /* JADX INFO: renamed from: d */
    public final int mo4182d() {
        return this.f67899h;
    }

    @Override // p000.AbstractC2985f1
    /* JADX INFO: renamed from: f */
    public final Object mo4183f(int i) {
        vz1.m23642n(i, mo4182d());
        ((AbstractList) this).modCount++;
        int iM24381L = m24381L();
        if (i >= iM24381L) {
            return m24380K(this.f67897f, iM24381L, this.f67895d, i - iM24381L);
        }
        C0006a4 c0006a4 = new C0006a4(this.f67898g[0]);
        Object[] objArr = this.f67897f;
        objArr.getClass();
        m24380K(m24379J(objArr, this.f67895d, i, c0006a4), iM24381L, this.f67895d, 0);
        return c0006a4.f193a;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC3096i1 m24385g() {
        AbstractC3096i1 w77Var;
        Object[] objArr = this.f67897f;
        if (objArr == this.f67893b && this.f67898g == this.f67894c) {
            w77Var = this.f67892a;
        } else {
            this.f67896e = new u06(13);
            this.f67893b = objArr;
            Object[] objArr2 = this.f67898g;
            this.f67894c = objArr2;
            if (objArr == null) {
                w77Var = objArr2.length == 0 ? jb9.f45384b : new jb9(Arrays.copyOf(objArr2, this.f67899h));
            } else {
                w77Var = new w77(this.f67899h, this.f67895d, objArr, objArr2);
            }
        }
        this.f67892a = w77Var;
        return w77Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        vz1.m23642n(i, mo4182d());
        if (m24381L() <= i) {
            objArr = this.f67898g;
        } else {
            Object[] objArr2 = this.f67897f;
            objArr2.getClass();
            for (int i2 = this.f67895d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[bca.m3613f(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    /* JADX INFO: renamed from: i */
    public final int m24386i() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final void m24387j(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f67897f == null) {
            C3386nv.m17633t("root is null");
            return;
        }
        int i4 = i >> 5;
        AbstractC0003a1 abstractC0003a1M24391n = m24391n(m24381L() >> 5);
        int i5 = i3;
        Object[] objArrM24393r = objArr2;
        while (abstractC0003a1M24391n.f41a - 1 != i4) {
            Object[] objArr3 = (Object[]) abstractC0003a1M24391n.previous();
            AbstractC3550rv.m20826T(0, 32 - i2, 32, objArr3, objArrM24393r);
            objArrM24393r = m24393r(objArr3, i2);
            i5--;
            objArr[i5] = objArrM24393r;
        }
        Object[] objArr4 = (Object[]) abstractC0003a1M24391n.previous();
        int iM24381L = i3 - (((m24381L() >> 5) - 1) - i4);
        if (iM24381L < i3) {
            objArr2 = objArr[iM24381L];
            objArr2.getClass();
        }
        m24383O(collection, i, objArr4, 32, objArr, iM24381L, objArr2);
    }

    /* JADX INFO: renamed from: k */
    public final Object[] m24388k(Object[] objArr, int i, int i2, Object obj, C0006a4 c0006a4) {
        Object obj2;
        int iM3613f = bca.m3613f(i2, i);
        if (i == 0) {
            c0006a4.f193a = objArr[31];
            Object[] objArrM24392o = m24392o(objArr);
            AbstractC3550rv.m20826T(iM3613f + 1, iM3613f, 31, objArr, objArrM24392o);
            objArrM24392o[iM3613f] = obj;
            return objArrM24392o;
        }
        Object[] objArrM24392o2 = m24392o(objArr);
        int i3 = i - 5;
        Object obj3 = objArrM24392o2[iM3613f];
        obj3.getClass();
        objArrM24392o2[iM3613f] = m24388k((Object[]) obj3, i3, i2, obj, c0006a4);
        while (true) {
            iM3613f++;
            if (iM3613f >= 32 || (obj2 = objArrM24392o2[iM3613f]) == null) {
                break;
            }
            objArrM24392o2[iM3613f] = m24388k((Object[]) obj2, i3, 0, c0006a4.f193a, c0006a4);
        }
        return objArrM24392o2;
    }

    /* JADX INFO: renamed from: l */
    public final void m24389l(int i, Object obj, Object[] objArr) {
        int iM24384P = m24384P();
        Object[] objArrM24392o = m24392o(this.f67898g);
        Object[] objArr2 = this.f67898g;
        if (iM24384P >= 32) {
            Object obj2 = objArr2[31];
            AbstractC3550rv.m20826T(i + 1, i, 31, objArr2, objArrM24392o);
            objArrM24392o[i] = obj;
            m24373D(objArr, objArrM24392o, m24395t(obj2));
            return;
        }
        AbstractC3550rv.m20826T(i + 1, i, iM24384P, objArr2, objArrM24392o);
        objArrM24392o[i] = obj;
        this.f67897f = objArr;
        this.f67898g = objArrM24392o;
        this.f67899h++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        vz1.m23644o(i, this.f67899h);
        return new z77(this, i);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m24390m(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f67896e;
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC0003a1 m24391n(int i) {
        Object[] objArr = this.f67897f;
        if (objArr == null) {
            C3386nv.m17633t("Invalid root");
            return null;
        }
        int iM24381L = m24381L() >> 5;
        vz1.m23644o(i, iM24381L);
        int i2 = this.f67895d;
        return i2 == 0 ? new cj0(objArr, i) : new xba(objArr, i, iM24381L, i2 / 5);
    }

    /* JADX INFO: renamed from: o */
    public final Object[] m24392o(Object[] objArr) {
        if (objArr == null) {
            return m24394s();
        }
        if (m24390m(objArr)) {
            return objArr;
        }
        Object[] objArrM24394s = m24394s();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC3550rv.m20830X(0, length, 6, objArr, objArrM24394s);
        return objArrM24394s;
    }

    /* JADX INFO: renamed from: r */
    public final Object[] m24393r(Object[] objArr, int i) {
        if (m24390m(objArr)) {
            AbstractC3550rv.m20826T(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrM24394s = m24394s();
        AbstractC3550rv.m20826T(i, 0, 32 - i, objArr, objArrM24394s);
        return objArrM24394s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return m24378I(new C3059h1(1, collection));
    }

    /* JADX INFO: renamed from: s */
    public final Object[] m24394s() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f67896e;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        vz1.m23642n(i, mo4182d());
        if (m24381L() > i) {
            C0006a4 c0006a4 = new C0006a4(null);
            Object[] objArr = this.f67897f;
            objArr.getClass();
            this.f67897f = m24382M(objArr, this.f67895d, i, obj, c0006a4);
            return c0006a4.f193a;
        }
        Object[] objArrM24392o = m24392o(this.f67898g);
        if (objArrM24392o != this.f67898g) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrM24392o[i2];
        objArrM24392o[i2] = obj;
        this.f67898g = objArrM24392o;
        return obj2;
    }

    /* JADX INFO: renamed from: t */
    public final Object[] m24395t(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f67896e;
        return objArr;
    }

    /* JADX INFO: renamed from: v */
    public final Object[] m24396v(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            hi7.m13278a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iM3613f = bca.m3613f(i, i2);
        Object obj = objArr[iM3613f];
        obj.getClass();
        Object objM24396v = m24396v((Object[]) obj, i, i2 - 5);
        if (iM3613f < 31) {
            int i3 = iM3613f + 1;
            if (objArr[i3] != null) {
                if (m24390m(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrM24394s = m24394s();
                AbstractC3550rv.m20826T(0, 0, i3, objArr, objArrM24394s);
                objArr = objArrM24394s;
            }
        }
        if (objM24396v == objArr[iM3613f]) {
            return objArr;
        }
        Object[] objArrM24392o = m24392o(objArr);
        objArrM24392o[iM3613f] = objM24396v;
        return objArrM24392o;
    }

    /* JADX INFO: renamed from: w */
    public final Object[] m24397w(Object[] objArr, int i, int i2, C0006a4 c0006a4) {
        Object[] objArrM24397w;
        int iM3613f = bca.m3613f(i2 - 1, i);
        if (i == 5) {
            c0006a4.f193a = objArr[iM3613f];
            objArrM24397w = null;
        } else {
            Object obj = objArr[iM3613f];
            obj.getClass();
            objArrM24397w = m24397w((Object[]) obj, i - 5, i2, c0006a4);
        }
        if (objArrM24397w == null && iM3613f == 0) {
            return null;
        }
        Object[] objArrM24392o = m24392o(objArr);
        objArrM24392o[iM3613f] = objArrM24397w;
        return objArrM24392o;
    }

    /* JADX INFO: renamed from: y */
    public final void m24398y(Object[] objArr, int i, int i2) {
        Object obj = null;
        if (i2 == 0) {
            this.f67897f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f67898g = objArr;
            this.f67899h = i;
            this.f67895d = i2;
            return;
        }
        C0006a4 c0006a4 = new C0006a4(obj);
        objArr.getClass();
        Object[] objArrM24397w = m24397w(objArr, i2, i, c0006a4);
        objArrM24397w.getClass();
        Object obj2 = c0006a4.f193a;
        obj2.getClass();
        this.f67898g = (Object[]) obj2;
        this.f67899h = i;
        if (objArrM24397w[1] == null) {
            this.f67897f = (Object[]) objArrM24397w[0];
            this.f67895d = i2 - 5;
        } else {
            this.f67897f = objArrM24397w;
            this.f67895d = i2;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM24384P = m24384P();
        if (iM24384P < 32) {
            Object[] objArrM24392o = m24392o(this.f67898g);
            objArrM24392o[iM24384P] = obj;
            this.f67898g = objArrM24392o;
            this.f67899h = mo4182d() + 1;
        } else {
            m24373D(this.f67897f, this.f67898g, m24395t(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM24384P = m24384P();
        Iterator it = collection.iterator();
        if (32 - iM24384P >= collection.size()) {
            Object[] objArrM24392o = m24392o(this.f67898g);
            m24370h(objArrM24392o, iM24384P, it);
            this.f67898g = objArrM24392o;
            this.f67899h = collection.size() + this.f67899h;
            return true;
        }
        int size = ((collection.size() + iM24384P) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM24392o2 = m24392o(this.f67898g);
        m24370h(objArrM24392o2, iM24384P, it);
        objArr[0] = objArrM24392o2;
        for (int i = 1; i < size; i++) {
            Object[] objArrM24394s = m24394s();
            m24370h(objArrM24394s, 0, it);
            objArr[i] = objArrM24394s;
        }
        this.f67897f = m24372C(this.f67897f, m24381L(), objArr);
        Object[] objArrM24394s2 = m24394s();
        m24370h(objArrM24394s2, 0, it);
        this.f67898g = objArrM24394s2;
        this.f67899h = collection.size() + this.f67899h;
        return true;
    }
}
