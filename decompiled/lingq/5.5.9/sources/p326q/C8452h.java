package p326q;

import ae.C0062b;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: q.h */
/* JADX INFO: loaded from: classes.dex */
public class C8452h<K, V> {

    /* JADX INFO: renamed from: d */
    public static Object[] f45613d;

    /* JADX INFO: renamed from: e */
    public static int f45614e;

    /* JADX INFO: renamed from: f */
    public static Object[] f45615f;

    /* JADX INFO: renamed from: g */
    public static int f45616g;

    /* JADX INFO: renamed from: a */
    public int[] f45617a;

    /* JADX INFO: renamed from: b */
    public Object[] f45618b;

    /* JADX INFO: renamed from: c */
    public int f45619c;

    public C8452h() {
        this.f45617a = C0062b.f152N;
        this.f45618b = C0062b.f153O;
        this.f45619c = 0;
    }

    public C8452h(int i10) {
        if (i10 == 0) {
            this.f45617a = C0062b.f152N;
            this.f45618b = C0062b.f153O;
        } else {
            m16522a(i10);
        }
        this.f45619c = 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    private void m16522a(int i10) {
        if (i10 == 8) {
            synchronized (C8452h.class) {
                Object[] objArr = f45615f;
                if (objArr != null) {
                    this.f45618b = objArr;
                    f45615f = (Object[]) objArr[0];
                    this.f45617a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f45616g--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (C8452h.class) {
                Object[] objArr2 = f45613d;
                if (objArr2 != null) {
                    this.f45618b = objArr2;
                    f45613d = (Object[]) objArr2[0];
                    this.f45617a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f45614e--;
                    return;
                }
            }
        }
        this.f45617a = new int[i10];
        this.f45618b = new Object[i10 << 1];
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static void m16523c(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (C8452h.class) {
                if (f45616g < 10) {
                    objArr[0] = f45615f;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f45615f = objArr;
                    f45616g++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C8452h.class) {
                if (f45614e < 10) {
                    objArr[0] = f45613d;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f45613d = objArr;
                    f45614e++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16524b(int i10) {
        int i11 = this.f45619c;
        int[] iArr = this.f45617a;
        if (iArr.length < i10) {
            Object[] objArr = this.f45618b;
            m16522a(i10);
            if (this.f45619c > 0) {
                System.arraycopy(iArr, 0, this.f45617a, 0, i11);
                System.arraycopy(objArr, 0, this.f45618b, 0, i11 << 1);
            }
            m16523c(iArr, objArr, i11);
        }
        if (this.f45619c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f45619c;
        if (i10 > 0) {
            int[] iArr = this.f45617a;
            Object[] objArr = this.f45618b;
            this.f45617a = C0062b.f152N;
            this.f45618b = C0062b.f153O;
            this.f45619c = 0;
            m16523c(iArr, objArr, i10);
        }
        if (this.f45619c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m16526e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return m16528g(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m16525d(int i10, Object obj) {
        int i11 = this.f45619c;
        if (i11 == 0) {
            return -1;
        }
        try {
            int iM318W = C0062b.m318W(i11, i10, this.f45617a);
            if (iM318W >= 0 && !obj.equals(this.f45618b[iM318W << 1])) {
                int i12 = iM318W + 1;
                while (i12 < i11 && this.f45617a[i12] == i10) {
                    if (obj.equals(this.f45618b[i12 << 1])) {
                        return i12;
                    }
                    i12++;
                }
                for (int i13 = iM318W - 1; i13 >= 0 && this.f45617a[i13] == i10; i13--) {
                    if (obj.equals(this.f45618b[i13 << 1])) {
                        return i13;
                    }
                }
                return ~i12;
            }
            return iM318W;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m16526e(Object obj) {
        return obj == null ? m16527f() : m16525d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8452h) {
            C8452h c8452h = (C8452h) obj;
            if (this.f45619c != c8452h.f45619c) {
                return false;
            }
            for (int i10 = 0; i10 < this.f45619c; i10++) {
                try {
                    K kM16529h = m16529h(i10);
                    V vM16530m = m16530m(i10);
                    Object orDefault = c8452h.getOrDefault(kM16529h, null);
                    if (vM16530m == null) {
                        if (orDefault == null && c8452h.containsKey(kM16529h)) {
                        }
                        return false;
                    }
                    if (!vM16530m.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f45619c != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f45619c; i11++) {
                try {
                    K kM16529h2 = m16529h(i11);
                    V vM16530m2 = m16530m(i11);
                    Object obj2 = map.get(kM16529h2);
                    if (vM16530m2 == null) {
                        if (obj2 == null && map.containsKey(kM16529h2)) {
                        }
                        return false;
                    }
                    if (!vM16530m2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m16527f() {
        int i10 = this.f45619c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int iM318W = C0062b.m318W(i10, 0, this.f45617a);
            if (iM318W < 0 || this.f45618b[iM318W << 1] == null) {
                return iM318W;
            }
            int i11 = iM318W + 1;
            while (i11 < i10 && this.f45617a[i11] == 0) {
                if (this.f45618b[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = iM318W - 1; i12 >= 0 && this.f45617a[i12] == 0; i12--) {
                if (this.f45618b[i12 << 1] == null) {
                    return i12;
                }
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: g */
    final int m16528g(Object obj) {
        int i10 = this.f45619c * 2;
        Object[] objArr = this.f45618b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
        } else {
            for (int i12 = 1; i12 < i10; i12 += 2) {
                if (obj.equals(objArr[i12])) {
                    return i12 >> 1;
                }
            }
        }
        return -1;
    }

    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V getOrDefault(Object obj, V v10) {
        int iM16526e = m16526e(obj);
        if (iM16526e >= 0) {
            v10 = (V) this.f45618b[(iM16526e << 1) + 1];
        }
        return v10;
    }

    /* JADX INFO: renamed from: h */
    public final K m16529h(int i10) {
        return (K) this.f45618b[i10 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f45617a;
        Object[] objArr = this.f45618b;
        int i10 = this.f45619c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public void mo14868i(C8446b c8446b) {
        int i10 = c8446b.f45619c;
        m16524b(this.f45619c + i10);
        if (this.f45619c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(c8446b.m16529h(i11), c8446b.m16530m(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(c8446b.f45617a, 0, this.f45617a, 0, i10);
            System.arraycopy(c8446b.f45618b, 0, this.f45618b, 0, i10 << 1);
            this.f45619c = i10;
        }
    }

    public final boolean isEmpty() {
        return this.f45619c <= 0;
    }

    /* JADX INFO: renamed from: k */
    public V mo14869k(int i10) {
        Object[] objArr = this.f45618b;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f45619c;
        int i13 = 0;
        if (i12 <= 1) {
            m16523c(this.f45617a, objArr, i12);
            this.f45617a = C0062b.f152N;
            this.f45618b = C0062b.f153O;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f45617a;
            int i15 = 8;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i16 = i10 + 1;
                    int i17 = i14 - i10;
                    System.arraycopy(iArr, i16, iArr, i10, i17);
                    Object[] objArr2 = this.f45618b;
                    System.arraycopy(objArr2, i16 << 1, objArr2, i11, i17 << 1);
                }
                Object[] objArr3 = this.f45618b;
                int i18 = i14 << 1;
                objArr3[i18] = null;
                objArr3[i18 + 1] = null;
            } else {
                if (i12 > 8) {
                    i15 = i12 + (i12 >> 1);
                }
                m16522a(i15);
                if (i12 != this.f45619c) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f45617a, 0, i10);
                    System.arraycopy(objArr, 0, this.f45618b, 0, i11);
                }
                if (i10 < i14) {
                    int i19 = i10 + 1;
                    int i20 = i14 - i10;
                    System.arraycopy(iArr, i19, this.f45617a, i10, i20);
                    System.arraycopy(objArr, i19 << 1, this.f45618b, i11, i20 << 1);
                }
                i13 = i14;
            }
            i13 = i14;
        }
        if (i12 != this.f45619c) {
            throw new ConcurrentModificationException();
        }
        this.f45619c = i13;
        return v10;
    }

    /* JADX INFO: renamed from: l */
    public V mo14870l(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f45618b;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    /* JADX INFO: renamed from: m */
    public final V m16530m(int i10) {
        return (V) this.f45618b[(i10 << 1) + 1];
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public V put(K k10, V v10) {
        int i10;
        int iM16525d;
        int i11 = this.f45619c;
        if (k10 == null) {
            iM16525d = m16527f();
            i10 = 0;
        } else {
            int iHashCode = k10.hashCode();
            i10 = iHashCode;
            iM16525d = m16525d(iHashCode, k10);
        }
        if (iM16525d >= 0) {
            int i12 = (iM16525d << 1) + 1;
            Object[] objArr = this.f45618b;
            V v11 = (V) objArr[i12];
            objArr[i12] = v10;
            return v11;
        }
        int i13 = ~iM16525d;
        int[] iArr = this.f45617a;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            Object[] objArr2 = this.f45618b;
            m16522a(i14);
            if (i11 != this.f45619c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f45617a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f45618b, 0, objArr2.length);
            }
            m16523c(iArr, objArr2, i11);
        }
        if (i13 < i11) {
            int[] iArr3 = this.f45617a;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f45618b;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f45619c - i13) << 1);
        }
        int i16 = this.f45619c;
        if (i11 == i16) {
            int[] iArr4 = this.f45617a;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f45618b;
                int i17 = i13 << 1;
                objArr4[i17] = k10;
                objArr4[i17 + 1] = v10;
                this.f45619c = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k10, V v10) {
        V orDefault = getOrDefault(k10, null);
        if (orDefault == null) {
            orDefault = put(k10, v10);
        }
        return orDefault;
    }

    public final V remove(Object obj) {
        int iM16526e = m16526e(obj);
        if (iM16526e >= 0) {
            return mo14869k(iM16526e);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM16526e = m16526e(obj);
        if (iM16526e < 0) {
            return false;
        }
        V vM16530m = m16530m(iM16526e);
        if (obj2 != vM16530m && (obj2 == null || !obj2.equals(vM16530m))) {
            return false;
        }
        mo14869k(iM16526e);
        return true;
    }

    public final V replace(K k10, V v10) {
        int iM16526e = m16526e(k10);
        if (iM16526e >= 0) {
            return mo14870l(iM16526e, v10);
        }
        return null;
    }

    public final boolean replace(K k10, V v10, V v11) {
        V vM16530m;
        int iM16526e = m16526e(k10);
        if (iM16526e < 0 || ((vM16530m = m16530m(iM16526e)) != v10 && (v10 == null || !v10.equals(vM16530m)))) {
            return false;
        }
        mo14870l(iM16526e, v11);
        return true;
    }

    public final int size() {
        return this.f45619c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f45619c * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f45619c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            K kM16529h = m16529h(i10);
            if (kM16529h != this) {
                sb2.append(kM16529h);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V vM16530m = m16530m(i10);
            if (vM16530m != this) {
                sb2.append(vM16530m);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
