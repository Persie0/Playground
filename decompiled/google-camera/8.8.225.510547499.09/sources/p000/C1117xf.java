package p000;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: xf */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C1117xf {

    /* JADX INFO: renamed from: a */
    private int[] f48002a;

    /* JADX INFO: renamed from: b */
    private Object[] f48003b;

    /* JADX INFO: renamed from: d */
    public int f48004d;

    public C1117xf() {
        this((byte[]) null);
    }

    /* JADX INFO: renamed from: a */
    private final int m19555a(Object obj, int i) {
        int i2 = this.f48004d;
        if (i2 == 0) {
            return -1;
        }
        int iM19568a = C1120xi.m19568a(this.f48002a, i2, i);
        if (iM19568a < 0 || ooc.m18737c(obj, this.f48003b[iM19568a + iM19568a])) {
            return iM19568a;
        }
        int i3 = iM19568a + 1;
        while (i3 < i2 && this.f48002a[i3] == i) {
            if (ooc.m18737c(obj, this.f48003b[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM19568a - 1; i4 >= 0 && this.f48002a[i4] == i; i4--) {
            if (ooc.m18737c(obj, this.f48003b[i4 + i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    /* JADX INFO: renamed from: j */
    private final int m19556j() {
        int i = this.f48004d;
        if (i == 0) {
            return -1;
        }
        int iM19568a = C1120xi.m19568a(this.f48002a, i, 0);
        if (iM19568a < 0 || this.f48003b[iM19568a + iM19568a] == null) {
            return iM19568a;
        }
        int i2 = iM19568a + 1;
        while (i2 < i && this.f48002a[i2] == 0) {
            if (this.f48003b[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM19568a - 1; i3 >= 0 && this.f48002a[i3] == 0; i3--) {
            if (this.f48003b[i3 + i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    /* JADX INFO: renamed from: c */
    public final int m19558c(Object obj) {
        return obj == null ? m19556j() : m19555a(obj, obj.hashCode());
    }

    public void clear() {
        if (this.f48004d > 0) {
            this.f48002a = C1120xi.f48010a;
            this.f48003b = C1120xi.f48012c;
            this.f48004d = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        return m19558c(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return m19557b(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final Object m19559d(int i) {
        if (i >= 0 && i < this.f48004d) {
            return this.f48003b[i + i];
        }
        throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C1117xf) {
                int i = this.f48004d;
                C1117xf c1117xf = (C1117xf) obj;
                if (i != c1117xf.f48004d) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM19559d = m19559d(i2);
                    Object objM19560g = m19560g(i2);
                    Object obj2 = c1117xf.get(objM19559d);
                    if (objM19560g == null) {
                        if (obj2 != null || !c1117xf.containsKey(objM19559d)) {
                            return false;
                        }
                    } else if (!ooc.m18737c(objM19560g, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f48004d != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f48004d;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM19559d2 = m19559d(i4);
                Object objM19560g2 = m19560g(i4);
                Map map = (Map) obj;
                Object obj3 = map.get(objM19559d2);
                if (objM19560g2 == null) {
                    if (obj3 != null || !map.containsKey(objM19559d2)) {
                        return false;
                    }
                } else if (!ooc.m18737c(objM19560g2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException e) {
        } catch (NullPointerException e2) {
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public Object mo3367f(int i, Object obj) {
        if (i < 0 || i >= this.f48004d) {
            throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        Object[] objArr = this.f48003b;
        int i2 = i + i + 1;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: g */
    public final Object m19560g(int i) {
        if (i >= 0 && i < this.f48004d) {
            return this.f48003b[i + i + 1];
        }
        throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
    }

    public final Object get(Object obj) {
        int iM19558c = m19558c(obj);
        if (iM19558c >= 0) {
            return this.f48003b[iM19558c + iM19558c + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM19558c = m19558c(obj);
        return iM19558c >= 0 ? this.f48003b[iM19558c + iM19558c + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public final void m19561h(int i) {
        int i2 = this.f48004d;
        int[] iArr = this.f48002a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            iArrCopyOf.getClass();
            this.f48002a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f48003b, i + i);
            objArrCopyOf.getClass();
            this.f48003b = objArrCopyOf;
        }
        if (this.f48004d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public int hashCode() {
        int[] iArr = this.f48002a;
        Object[] objArr = this.f48003b;
        int i = this.f48004d;
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
    public void mo3368i(C1117xf c1117xf) {
        int i = c1117xf.f48004d;
        m19561h(this.f48004d + i);
        if (this.f48004d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c1117xf.m19559d(i2), c1117xf.m19560g(i2));
            }
        } else if (i > 0) {
            omn.m18692af(c1117xf.f48002a, this.f48002a, 0, 0, i);
            omn.m18693ag(c1117xf.f48003b, this.f48003b, 0, 0, i + i);
            this.f48004d = i;
        }
    }

    public final boolean isEmpty() {
        return this.f48004d <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.f48004d;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM19555a = obj != null ? m19555a(obj, iHashCode) : m19556j();
        if (iM19555a >= 0) {
            int i2 = iM19555a + iM19555a + 1;
            Object[] objArr = this.f48003b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = iM19555a ^ (-1);
        int[] iArr = this.f48002a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            iArrCopyOf.getClass();
            this.f48002a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f48003b, i4 + i4);
            objArrCopyOf.getClass();
            this.f48003b = objArrCopyOf;
            if (i != this.f48004d) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f48002a;
            int i5 = i3 + 1;
            omn.m18692af(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.f48003b;
            int i6 = this.f48004d;
            omn.m18693ag(objArr2, objArr2, i5 + i5, i3 + i3, i6 + i6);
        }
        int i7 = this.f48004d;
        if (i == i7) {
            int[] iArr3 = this.f48002a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f48003b;
                int i8 = i3 + i3;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.f48004d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final Object remove(Object obj) {
        int iM19558c = m19558c(obj);
        if (iM19558c >= 0) {
            return mo3366e(iM19558c);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM19558c = m19558c(obj);
        if (iM19558c >= 0) {
            return mo3367f(iM19558c, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f48004d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f48004d * 28);
        sb.append('{');
        int i = this.f48004d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM19559d = m19559d(i2);
            if (objM19559d != sb) {
                sb.append(objM19559d);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM19560g = m19560g(i2);
            if (objM19560g != sb) {
                sb.append(objM19560g);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C1117xf(int i) {
        this.f48002a = i == 0 ? C1120xi.f48010a : new int[i];
        this.f48003b = i == 0 ? C1120xi.f48012c : new Object[i + i];
    }

    /* JADX INFO: renamed from: b */
    public final int m19557b(Object obj) {
        int i = this.f48004d;
        int i2 = i + i;
        Object[] objArr = this.f48003b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (ooc.m18737c(obj, objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public /* synthetic */ C1117xf(byte[] bArr) {
        this(0);
    }

    /* JADX INFO: renamed from: e */
    public Object mo3366e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f48004d)) {
            throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        Object[] objArr = this.f48003b;
        int i3 = i + i;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
        } else {
            int i4 = i2 - 1;
            int[] iArr = this.f48002a;
            int length = iArr.length;
            if (length <= 8 || i2 >= length / 3) {
                if (i < i4) {
                    int i5 = i + 1;
                    int i6 = i4 + 1;
                    omn.m18692af(iArr, iArr, i, i5, i6);
                    Object[] objArr2 = this.f48003b;
                    omn.m18693ag(objArr2, objArr2, i3, i5 + i5, i6 + i6);
                }
                Object[] objArr3 = this.f48003b;
                int i7 = i4 + i4;
                objArr3[i7] = null;
                objArr3[i7 + 1] = null;
            } else {
                int i8 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                int[] iArrCopyOf = Arrays.copyOf(iArr, i8);
                iArrCopyOf.getClass();
                this.f48002a = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.f48003b, i8 + i8);
                objArrCopyOf.getClass();
                this.f48003b = objArrCopyOf;
                if (i2 != this.f48004d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    omn.m18692af(iArr, this.f48002a, 0, 0, i);
                    omn.m18693ag(objArr, this.f48003b, 0, 0, i3);
                }
                if (i < i4) {
                    int i9 = i + 1;
                    int i10 = i4 + 1;
                    omn.m18692af(iArr, this.f48002a, i, i9, i10);
                    omn.m18693ag(objArr, this.f48003b, i3, i9 + i9, i10 + i10);
                }
            }
            if (i2 != this.f48004d) {
                throw new ConcurrentModificationException();
            }
            this.f48004d = i4;
        }
        return obj;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM19558c = m19558c(obj);
        if (iM19558c < 0 || !ooc.m18737c(obj2, m19560g(iM19558c))) {
            return false;
        }
        mo3366e(iM19558c);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM19558c = m19558c(obj);
        if (iM19558c < 0 || !ooc.m18737c(obj2, m19560g(iM19558c))) {
            return false;
        }
        mo3367f(iM19558c, obj3);
        return true;
    }
}
