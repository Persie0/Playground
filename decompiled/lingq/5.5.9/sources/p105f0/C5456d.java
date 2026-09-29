package p105f0;

import dm.C5207g;
import java.util.Arrays;
import tl.C9322j;

/* JADX INFO: renamed from: f0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5456d<T> {

    /* JADX INFO: renamed from: a */
    public int[] f34012a;

    /* JADX INFO: renamed from: b */
    public Object[] f34013b;

    /* JADX INFO: renamed from: c */
    public C5455c<T>[] f34014c;

    /* JADX INFO: renamed from: d */
    public int f34015d;

    public C5456d() {
        int[] iArr = new int[50];
        for (int i10 = 0; i10 < 50; i10++) {
            iArr[i10] = i10;
        }
        this.f34012a = iArr;
        this.f34013b = new Object[50];
        this.f34014c = new C5455c[50];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m11679a(Object obj, Object obj2) {
        int iM11682d;
        C5455c<T> c5455c;
        C5207g.m11111f(obj, "value");
        C5207g.m11111f(obj2, "scope");
        if (this.f34015d > 0) {
            iM11682d = m11682d(obj);
            if (iM11682d >= 0) {
                c5455c = m11685g(iM11682d);
            }
            c5455c.add(obj2);
        }
        iM11682d = -1;
        int i10 = -(iM11682d + 1);
        int i11 = this.f34015d;
        int[] iArr = this.f34012a;
        if (i11 < iArr.length) {
            int i12 = iArr[i11];
            this.f34013b[i12] = obj;
            c5455c = this.f34014c[i12];
            if (c5455c == null) {
                c5455c = new C5455c<>();
                this.f34014c[i12] = c5455c;
            }
            int i13 = this.f34015d;
            if (i10 < i13) {
                int[] iArr2 = this.f34012a;
                C9322j.m17672Z(i10 + 1, i10, i13, iArr2, iArr2);
            }
            this.f34012a[i10] = i12;
            this.f34015d++;
        } else {
            int length = iArr.length * 2;
            Object[] objArrCopyOf = Arrays.copyOf(this.f34014c, length);
            C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
            this.f34014c = (C5455c[]) objArrCopyOf;
            C5455c<T> c5455c2 = new C5455c<>();
            this.f34014c[i11] = c5455c2;
            Object[] objArrCopyOf2 = Arrays.copyOf(this.f34013b, length);
            C5207g.m11110e(objArrCopyOf2, "copyOf(this, newSize)");
            this.f34013b = objArrCopyOf2;
            objArrCopyOf2[i11] = obj;
            int[] iArr3 = new int[length];
            int i14 = this.f34015d;
            while (true) {
                i14++;
                if (i14 >= length) {
                    break;
                } else {
                    iArr3[i14] = i14;
                }
            }
            int i15 = this.f34015d;
            if (i10 < i15) {
                C9322j.m17672Z(i10 + 1, i10, i15, this.f34012a, iArr3);
            }
            iArr3[i10] = i11;
            if (i10 > 0) {
                C9322j.m17674b0(this.f34012a, iArr3, i10, 6);
            }
            this.f34012a = iArr3;
            this.f34015d++;
            c5455c = c5455c2;
        }
        c5455c.add(obj2);
    }

    /* JADX INFO: renamed from: b */
    public final void m11680b() {
        int length = this.f34014c.length;
        for (int i10 = 0; i10 < length; i10++) {
            C5455c<T> c5455c = this.f34014c[i10];
            if (c5455c != null) {
                c5455c.clear();
            }
            this.f34012a[i10] = i10;
            this.f34013b[i10] = null;
        }
        this.f34015d = 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11681c(Object obj) {
        C5207g.m11111f(obj, "element");
        return m11682d(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m11682d(Object obj) {
        int iIdentityHashCode = System.identityHashCode(obj);
        int i10 = this.f34015d - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj2 = this.f34013b[this.f34012a[i12]];
            C5207g.m11108c(obj2);
            int iIdentityHashCode2 = System.identityHashCode(obj2);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i11 = i12 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    if (obj == obj2) {
                        return i12;
                    }
                    for (int i13 = i12 - 1; -1 < i13; i13--) {
                        Object obj3 = this.f34013b[this.f34012a[i13]];
                        C5207g.m11108c(obj3);
                        if (obj3 == obj) {
                            return i13;
                        }
                        if (System.identityHashCode(obj3) != iIdentityHashCode) {
                            break;
                        }
                    }
                    int i14 = i12 + 1;
                    int i15 = this.f34015d;
                    while (i14 < i15) {
                        Object obj4 = this.f34013b[this.f34012a[i14]];
                        C5207g.m11108c(obj4);
                        if (obj4 == obj) {
                            return i14;
                        }
                        if (System.identityHashCode(obj4) != iIdentityHashCode) {
                            return -(i14 + 1);
                        }
                        i14++;
                    }
                    i14 = this.f34015d;
                    return -(i14 + 1);
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m11683e(Object obj, T t10) {
        int i10;
        C5455c<T> c5455c;
        C5207g.m11111f(obj, "value");
        int iM11682d = m11682d(obj);
        if (iM11682d >= 0 && (c5455c = this.f34014c[(i10 = this.f34012a[iM11682d])]) != null) {
            boolean zRemove = c5455c.remove(t10);
            if (c5455c.f34008a == 0) {
                int i11 = iM11682d + 1;
                int i12 = this.f34015d;
                if (i11 < i12) {
                    int[] iArr = this.f34012a;
                    C9322j.m17672Z(iM11682d, i11, i12, iArr, iArr);
                }
                int[] iArr2 = this.f34012a;
                int i13 = this.f34015d - 1;
                iArr2[i13] = i10;
                this.f34013b[i10] = null;
                this.f34015d = i13;
            }
            return zRemove;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m11684f(T t10) {
        C5207g.m11111f(t10, "scope");
        int i10 = this.f34015d;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = this.f34012a[i12];
            C5455c<T> c5455c = this.f34014c[i13];
            C5207g.m11108c(c5455c);
            c5455c.remove(t10);
            if (c5455c.f34008a > 0) {
                if (i11 != i12) {
                    int[] iArr = this.f34012a;
                    int i14 = iArr[i11];
                    iArr[i11] = i13;
                    iArr[i12] = i14;
                }
                i11++;
            }
        }
        int i15 = this.f34015d;
        for (int i16 = i11; i16 < i15; i16++) {
            this.f34013b[this.f34012a[i16]] = null;
        }
        this.f34015d = i11;
    }

    /* JADX INFO: renamed from: g */
    public final C5455c<T> m11685g(int i10) {
        C5455c<T> c5455c = this.f34014c[this.f34012a[i10]];
        C5207g.m11108c(c5455c);
        return c5455c;
    }
}
