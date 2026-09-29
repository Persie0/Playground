package p000;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class w77 extends AbstractC3096i1 {

    /* JADX INFO: renamed from: a */
    public final Object[] f66483a;

    /* JADX INFO: renamed from: b */
    public final Object[] f66484b;

    /* JADX INFO: renamed from: c */
    public final int f66485c;

    /* JADX INFO: renamed from: d */
    public final int f66486d;

    public w77(int i, int i2, Object[] objArr, Object[] objArr2) {
        this.f66483a = objArr;
        this.f66484b = objArr2;
        this.f66485c = i;
        this.f66486d = i2;
        if (!(mo3718d() > 32)) {
            hi7.m13278a("Trie-based persistent vector should have at least 33 elements, got " + mo3718d());
        }
        int length = objArr2.length;
    }

    /* JADX INFO: renamed from: m */
    public static Object[] m23795m(Object[] objArr, int i, int i2, Object obj, C0006a4 c0006a4) {
        int iM3613f = bca.m3613f(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM3613f == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC3550rv.m20826T(iM3613f + 1, iM3613f, 31, objArr, objArrCopyOf);
            c0006a4.f193a = objArr[31];
            objArrCopyOf[iM3613f] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iM3613f];
        obj2.getClass();
        objArrCopyOf2[iM3613f] = m23795m((Object[]) obj2, i3, i2, obj, c0006a4);
        while (true) {
            iM3613f++;
            if (iM3613f >= 32 || objArrCopyOf2[iM3613f] == null) {
                break;
            }
            Object obj3 = objArr[iM3613f];
            obj3.getClass();
            objArrCopyOf2[iM3613f] = m23795m((Object[]) obj3, i3, 0, c0006a4.f193a, c0006a4);
        }
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: o */
    public static Object[] m23796o(Object[] objArr, int i, int i2, C0006a4 c0006a4) {
        Object[] objArrM23796o;
        int iM3613f = bca.m3613f(i2, i);
        if (i == 5) {
            c0006a4.f193a = objArr[iM3613f];
            objArrM23796o = null;
        } else {
            Object obj = objArr[iM3613f];
            obj.getClass();
            objArrM23796o = m23796o((Object[]) obj, i - 5, i2, c0006a4);
        }
        if (objArrM23796o == null && iM3613f == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iM3613f] = objArrM23796o;
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: y */
    public static Object[] m23797y(int i, int i2, Object obj, Object[] objArr) {
        int iM3613f = bca.m3613f(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iM3613f] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iM3613f];
        obj2.getClass();
        objArrCopyOf[iM3613f] = m23797y(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // p000.AbstractC3778y
    /* JADX INFO: renamed from: d */
    public final int mo3718d() {
        return this.f66485c;
    }

    @Override // p000.AbstractC3096i1
    /* JADX INFO: renamed from: f */
    public final AbstractC3096i1 mo13604f(int i, Object obj) {
        int i2 = this.f66485c;
        vz1.m23644o(i, i2);
        if (i == i2) {
            return mo13605g(obj);
        }
        int iM23803w = m23803w();
        Object[] objArr = this.f66483a;
        if (i >= iM23803w) {
            return m23798n(i - iM23803w, obj, objArr);
        }
        C0006a4 c0006a4 = new C0006a4(null);
        return m23798n(0, c0006a4.f193a, m23795m(objArr, this.f66486d, i, obj, c0006a4));
    }

    @Override // p000.AbstractC3096i1
    /* JADX INFO: renamed from: g */
    public final AbstractC3096i1 mo13605g(Object obj) {
        int iM23803w = m23803w();
        int i = this.f66485c;
        int i2 = i - iM23803w;
        Object[] objArr = this.f66483a;
        Object[] objArr2 = this.f66484b;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new w77(i + 1, this.f66486d, objArr, objArrCopyOf);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return m23799r(objArr, objArr2, objArr3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        vz1.m23642n(i, mo3718d());
        if (m23803w() <= i) {
            objArr = this.f66484b;
        } else {
            Object[] objArr2 = this.f66483a;
            for (int i2 = this.f66486d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[bca.m3613f(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // p000.AbstractC3096i1
    /* JADX INFO: renamed from: i */
    public final x77 mo13607i() {
        return new x77(this, this.f66483a, this.f66484b, this.f66486d);
    }

    @Override // p000.AbstractC3096i1
    /* JADX INFO: renamed from: j */
    public final AbstractC3096i1 mo13608j(C3059h1 c3059h1) {
        x77 x77Var = new x77(this, this.f66483a, this.f66484b, this.f66486d);
        x77Var.m24378I(c3059h1);
        return x77Var.m24385g();
    }

    @Override // p000.AbstractC3096i1
    /* JADX INFO: renamed from: k */
    public final AbstractC3096i1 mo13609k(int i) {
        vz1.m23642n(i, mo3718d());
        int iM23803w = m23803w();
        int i2 = this.f66486d;
        Object[] objArr = this.f66483a;
        return i >= iM23803w ? m23802v(objArr, iM23803w, i2, i - iM23803w) : m23802v(m23801t(objArr, i2, i, new C0006a4(this.f66484b[0])), iM23803w, i2, 0);
    }

    @Override // p000.AbstractC3096i1
    /* JADX INFO: renamed from: l */
    public final AbstractC3096i1 mo13610l(int i, Object obj) {
        int i2 = this.f66485c;
        vz1.m23642n(i, i2);
        int iM23803w = m23803w();
        Object[] objArr = this.f66483a;
        Object[] objArr2 = this.f66484b;
        int i3 = this.f66486d;
        if (iM23803w > i) {
            return new w77(i2, i3, m23797y(i3, i, obj, objArr), objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new w77(i2, i3, objArr, objArrCopyOf);
    }

    @Override // p000.AbstractC3816z0, java.util.List
    public final ListIterator listIterator(int i) {
        vz1.m23644o(i, this.f66485c);
        return new y77(i, this.f66485c, (this.f66486d / 5) + 1, this.f66483a, this.f66484b);
    }

    /* JADX INFO: renamed from: n */
    public final w77 m23798n(int i, Object obj, Object[] objArr) {
        int iM23803w = m23803w();
        int i2 = this.f66485c;
        int i3 = i2 - iM23803w;
        Object[] objArr2 = this.f66484b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            AbstractC3550rv.m20826T(i + 1, i, i3, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new w77(i2 + 1, this.f66486d, objArr, objArrCopyOf);
        }
        Object obj2 = objArr2[31];
        AbstractC3550rv.m20826T(i + 1, i, i3 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m23799r(objArr, objArrCopyOf, objArr3);
    }

    /* JADX INFO: renamed from: r */
    public final w77 m23799r(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f66485c;
        int i2 = i >> 5;
        int i3 = this.f66486d;
        if (i2 <= (1 << i3)) {
            return new w77(i + 1, i3, m23800s(objArr, objArr2, i3), objArr3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new w77(i + 1, i4, m23800s(objArr4, objArr2, i4), objArr3);
    }

    /* JADX INFO: renamed from: s */
    public final Object[] m23800s(Object[] objArr, Object[] objArr2, int i) {
        int iM3613f = bca.m3613f(mo3718d() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iM3613f] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iM3613f] = m23800s((Object[]) objArrCopyOf[iM3613f], objArr2, i - 5);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: t */
    public final Object[] m23801t(Object[] objArr, int i, int i2, C0006a4 c0006a4) {
        int iM3613f = bca.m3613f(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM3613f == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC3550rv.m20826T(iM3613f, iM3613f + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = c0006a4.f193a;
            c0006a4.f193a = objArr[iM3613f];
            return objArrCopyOf;
        }
        int iM3613f2 = objArr[31] == null ? bca.m3613f(m23803w() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iM3613f + 1;
        if (i4 <= iM3613f2) {
            while (true) {
                Object obj = objArrCopyOf2[iM3613f2];
                obj.getClass();
                objArrCopyOf2[iM3613f2] = m23801t((Object[]) obj, i3, 0, c0006a4);
                if (iM3613f2 == i4) {
                    break;
                }
                iM3613f2--;
            }
        }
        Object obj2 = objArrCopyOf2[iM3613f];
        obj2.getClass();
        objArrCopyOf2[iM3613f] = m23801t((Object[]) obj2, i3, i2, c0006a4);
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC3096i1 m23802v(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f66485c - i;
        Object obj = null;
        if (i4 != 1) {
            Object[] objArr2 = this.f66484b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                AbstractC3550rv.m20826T(i3, i3 + 1, i4, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i5] = null;
            return new w77((i + i4) - 1, i2, objArr, objArrCopyOf);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new jb9(objArr);
        }
        C0006a4 c0006a4 = new C0006a4(obj);
        Object[] objArrM23796o = m23796o(objArr, i2, i - 1, c0006a4);
        objArrM23796o.getClass();
        Object obj2 = c0006a4.f193a;
        obj2.getClass();
        Object[] objArr3 = (Object[]) obj2;
        if (objArrM23796o[1] != null) {
            return new w77(i, i2, objArrM23796o, objArr3);
        }
        Object obj3 = objArrM23796o[0];
        obj3.getClass();
        return new w77(i, i2 - 5, (Object[]) obj3, objArr3);
    }

    /* JADX INFO: renamed from: w */
    public final int m23803w() {
        return (this.f66485c - 1) & (-32);
    }
}
