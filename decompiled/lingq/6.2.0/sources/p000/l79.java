package p000;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class l79 {

    /* JADX INFO: renamed from: a */
    public int[] f49252a;

    /* JADX INFO: renamed from: b */
    public Object[] f49253b;

    /* JADX INFO: renamed from: c */
    public int f49254c;

    public l79(int i) {
        this.f49252a = i == 0 ? AbstractC3423or.f54764b : new int[i];
        this.f49253b = i == 0 ? AbstractC3423or.f54766d : new Object[i << 1];
    }

    /* JADX INFO: renamed from: a */
    public final int m15969a(Object obj) {
        int i = this.f49254c * 2;
        Object[] objArr = this.f49253b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final void m15970b(int i) {
        int i2 = this.f49254c;
        int[] iArr = this.f49252a;
        if (iArr.length < i) {
            this.f49252a = Arrays.copyOf(iArr, i);
            this.f49253b = Arrays.copyOf(this.f49253b, i * 2);
        }
        if (this.f49254c == i2) {
            return;
        }
        C3386nv.m17619e();
    }

    /* JADX INFO: renamed from: c */
    public final int m15971c(int i, Object obj) {
        int i2 = this.f49254c;
        if (i2 == 0) {
            return -1;
        }
        int iM18260j = AbstractC3423or.m18260j(i2, i, this.f49252a);
        if (iM18260j < 0 || fa4.m11650l(obj, this.f49253b[iM18260j << 1])) {
            return iM18260j;
        }
        int i3 = iM18260j + 1;
        while (i3 < i2 && this.f49252a[i3] == i) {
            if (fa4.m11650l(obj, this.f49253b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM18260j - 1; i4 >= 0 && this.f49252a[i4] == i; i4--) {
            if (fa4.m11650l(obj, this.f49253b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void clear() {
        if (this.f49254c > 0) {
            this.f49252a = AbstractC3423or.f54764b;
            this.f49253b = AbstractC3423or.f54766d;
            this.f49254c = 0;
        }
        if (this.f49254c <= 0) {
            return;
        }
        C3386nv.m17619e();
    }

    public boolean containsKey(Object obj) {
        return m15972d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m15969a(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m15972d(Object obj) {
        return obj == null ? m15973e() : m15971c(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: e */
    public final int m15973e() {
        int i = this.f49254c;
        if (i == 0) {
            return -1;
        }
        int iM18260j = AbstractC3423or.m18260j(i, 0, this.f49252a);
        if (iM18260j < 0 || this.f49253b[iM18260j << 1] == null) {
            return iM18260j;
        }
        int i2 = iM18260j + 1;
        while (i2 < i && this.f49252a[i2] == 0) {
            if (this.f49253b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM18260j - 1; i3 >= 0 && this.f49252a[i3] == 0; i3--) {
            if (this.f49253b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof l79) {
                int i = this.f49254c;
                if (i != ((l79) obj).f49254c) {
                    return false;
                }
                l79 l79Var = (l79) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM15974f = m15974f(i2);
                    Object objM15977i = m15977i(i2);
                    Object obj2 = l79Var.get(objM15974f);
                    if (objM15977i == null) {
                        if (obj2 != null || !l79Var.containsKey(objM15974f)) {
                            return false;
                        }
                    } else if (!objM15977i.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f49254c != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f49254c;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM15974f2 = m15974f(i4);
                Object objM15977i2 = m15977i(i4);
                Object obj3 = ((Map) obj).get(objM15974f2);
                if (objM15977i2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM15974f2)) {
                        return false;
                    }
                } else if (!objM15977i2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m15974f(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f49254c) {
            z = true;
        }
        if (z) {
            return this.f49253b[i << 1];
        }
        C3386nv.m17626m(ux5.m22988k(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Object m15975g(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f49254c)) {
            C3386nv.m17626m(ux5.m22988k(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.f49253b;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f49252a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                AbstractC3550rv.m20825S(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.f49253b;
                AbstractC3550rv.m20826T(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f49253b;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.f49252a = Arrays.copyOf(iArr, i7);
            this.f49253b = Arrays.copyOf(this.f49253b, i7 << 1);
            if (i2 != this.f49254c) {
                C3386nv.m17619e();
                return null;
            }
            if (i > 0) {
                AbstractC3550rv.m20825S(0, 0, i, iArr, this.f49252a);
                AbstractC3550rv.m20826T(0, 0, i3, objArr, this.f49253b);
            }
            if (i < i4) {
                int i8 = i + 1;
                AbstractC3550rv.m20825S(i, i8, i2, iArr, this.f49252a);
                AbstractC3550rv.m20826T(i3, i8 << 1, i2 << 1, objArr, this.f49253b);
            }
        }
        if (i2 == this.f49254c) {
            this.f49254c = i4;
            return obj;
        }
        C3386nv.m17619e();
        return null;
    }

    public Object get(Object obj) {
        int iM15972d = m15972d(obj);
        if (iM15972d >= 0) {
            return this.f49253b[(iM15972d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM15972d = m15972d(obj);
        return iM15972d >= 0 ? this.f49253b[(iM15972d << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public final Object m15976h(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.f49254c) {
            z = true;
        }
        if (!z) {
            C3386nv.m17626m(ux5.m22988k(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f49253b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f49252a;
        Object[] objArr = this.f49253b;
        int i = this.f49254c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final Object m15977i(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f49254c) {
            z = true;
        }
        if (z) {
            return this.f49253b[(i << 1) + 1];
        }
        C3386nv.m17626m(ux5.m22988k(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final boolean isEmpty() {
        return this.f49254c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f49254c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM15971c = obj != null ? m15971c(iHashCode, obj) : m15973e();
        if (iM15971c >= 0) {
            int i2 = (iM15971c << 1) + 1;
            Object[] objArr = this.f49253b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM15971c;
        int[] iArr = this.f49252a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f49252a = Arrays.copyOf(iArr, i4);
            this.f49253b = Arrays.copyOf(this.f49253b, i4 << 1);
            if (i != this.f49254c) {
                C3386nv.m17619e();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f49252a;
            int i5 = i3 + 1;
            AbstractC3550rv.m20825S(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.f49253b;
            AbstractC3550rv.m20826T(i5 << 1, i3 << 1, this.f49254c << 1, objArr2, objArr2);
        }
        int i6 = this.f49254c;
        if (i == i6) {
            int[] iArr3 = this.f49252a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f49253b;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f49254c = i6 + 1;
                return null;
            }
        }
        C3386nv.m17619e();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM15972d = m15972d(obj);
        if (iM15972d < 0 || !fa4.m11650l(obj2, m15977i(iM15972d))) {
            return false;
        }
        m15975g(iM15972d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM15972d = m15972d(obj);
        if (iM15972d < 0 || !fa4.m11650l(obj2, m15977i(iM15972d))) {
            return false;
        }
        m15976h(iM15972d, obj3);
        return true;
    }

    public final int size() {
        return this.f49254c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f49254c * 28);
        sb.append('{');
        int i = this.f49254c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM15974f = m15974f(i2);
            if (objM15974f != sb) {
                sb.append(objM15974f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM15977i = m15977i(i2);
            if (objM15977i != sb) {
                sb.append(objM15977i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int iM15972d = m15972d(obj);
        if (iM15972d >= 0) {
            return m15975g(iM15972d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM15972d = m15972d(obj);
        if (iM15972d >= 0) {
            return m15976h(iM15972d, obj2);
        }
        return null;
    }
}
