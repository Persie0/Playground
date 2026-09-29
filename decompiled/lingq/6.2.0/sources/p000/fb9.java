package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fb9 {

    /* JADX INFO: renamed from: a */
    public final cb9 f38800a;

    /* JADX INFO: renamed from: b */
    public int[] f38801b;

    /* JADX INFO: renamed from: c */
    public Object[] f38802c;

    /* JADX INFO: renamed from: d */
    public ArrayList f38803d;

    /* JADX INFO: renamed from: e */
    public HashMap f38804e;

    /* JADX INFO: renamed from: f */
    public t56 f38805f;

    /* JADX INFO: renamed from: g */
    public int f38806g;

    /* JADX INFO: renamed from: h */
    public int f38807h;

    /* JADX INFO: renamed from: i */
    public int f38808i;

    /* JADX INFO: renamed from: j */
    public int f38809j;

    /* JADX INFO: renamed from: k */
    public int f38810k;

    /* JADX INFO: renamed from: l */
    public int f38811l;

    /* JADX INFO: renamed from: m */
    public int f38812m;

    /* JADX INFO: renamed from: n */
    public int f38813n;

    /* JADX INFO: renamed from: o */
    public int f38814o;

    /* JADX INFO: renamed from: p */
    public final o84 f38815p;

    /* JADX INFO: renamed from: q */
    public final o84 f38816q;

    /* JADX INFO: renamed from: r */
    public final o84 f38817r;

    /* JADX INFO: renamed from: s */
    public t56 f38818s;

    /* JADX INFO: renamed from: t */
    public int f38819t;

    /* JADX INFO: renamed from: u */
    public int f38820u;

    /* JADX INFO: renamed from: v */
    public int f38821v;

    /* JADX INFO: renamed from: w */
    public boolean f38822w;

    /* JADX INFO: renamed from: x */
    public s56 f38823x;

    public fb9(cb9 cb9Var) {
        this.f38800a = cb9Var;
        int[] iArr = cb9Var.f9842a;
        this.f38801b = iArr;
        Object[] objArr = cb9Var.f9844c;
        this.f38802c = objArr;
        this.f38803d = cb9Var.f9850i;
        this.f38804e = cb9Var.f9851j;
        this.f38805f = cb9Var.f9852k;
        int i = cb9Var.f9843b;
        this.f38806g = i;
        this.f38807h = (iArr.length / 5) - i;
        int i2 = cb9Var.f9845d;
        this.f38810k = i2;
        this.f38811l = objArr.length - i2;
        this.f38812m = i;
        this.f38815p = new o84();
        this.f38816q = new o84();
        this.f38817r = new o84();
        this.f38820u = i;
        this.f38821v = -1;
    }

    /* JADX INFO: renamed from: i */
    public static int m11704i(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    /* JADX INFO: renamed from: z */
    public static void m11705z(fb9 fb9Var) {
        int i = fb9Var.f38821v;
        int iM11743r = fb9Var.m11743r(i);
        int[] iArr = fb9Var.f38801b;
        int i2 = (iM11743r * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        fb9Var.m11725T(fb9Var.m11710E(iArr, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final void m11706A(cb9 cb9Var, int i) {
        if (this.f38813n <= 0) {
            cf1.m4605a("Check failed");
        }
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i == 0 && this.f38819t == 0 && this.f38800a.f9843b == 0) {
            int[] iArr = cb9Var.f9842a;
            int i2 = iArr[(i * 5) + 3];
            int i3 = cb9Var.f9843b;
            if (i2 == i3) {
                int[] iArr2 = this.f38801b;
                Object[] objArr3 = this.f38802c;
                ArrayList arrayList = this.f38803d;
                HashMap map = this.f38804e;
                t56 t56Var = this.f38805f;
                Object[] objArr4 = cb9Var.f9844c;
                int i4 = cb9Var.f9845d;
                HashMap map2 = cb9Var.f9851j;
                t56 t56Var2 = cb9Var.f9852k;
                this.f38801b = iArr;
                this.f38802c = objArr4;
                this.f38803d = cb9Var.f9850i;
                this.f38806g = i3;
                this.f38807h = (iArr.length / 5) - i3;
                this.f38810k = i4;
                this.f38811l = objArr4.length - i4;
                this.f38812m = i3;
                this.f38804e = map2;
                this.f38805f = t56Var2;
                cb9Var.f9842a = iArr2;
                cb9Var.f9843b = objArr2 == true ? 1 : 0;
                cb9Var.f9844c = objArr3;
                cb9Var.f9845d = objArr == true ? 1 : 0;
                cb9Var.f9850i = arrayList;
                cb9Var.f9851j = map;
                cb9Var.f9852k = t56Var;
                return;
            }
        }
        fb9 fb9VarM4492h = cb9Var.m4492h();
        try {
            pk9.m19379t(fb9VarM4492h, i, this, true, true, false);
            boolean z2 = true;
        } finally {
            fb9VarM4492h.m11731e(z);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m11707B(int i) {
        oj3 oj3Var;
        int i2;
        oj3 oj3Var2;
        int i3;
        int i4;
        int i5 = this.f38807h;
        int i6 = this.f38806g;
        if (i6 != i) {
            if (!this.f38803d.isEmpty()) {
                int iM11740o = m11740o() - this.f38807h;
                ArrayList arrayList = this.f38803d;
                if (i6 < i) {
                    for (int iM11010a = eb9.m11010a(arrayList, i6, iM11740o); iM11010a < this.f38803d.size() && (i3 = (oj3Var2 = (oj3) this.f38803d.get(iM11010a)).f54459a) < 0 && (i4 = i3 + iM11740o) < i; iM11010a++) {
                        oj3Var2.f54459a = i4;
                    }
                } else {
                    for (int iM11010a2 = eb9.m11010a(arrayList, i, iM11740o); iM11010a2 < this.f38803d.size() && (i2 = (oj3Var = (oj3) this.f38803d.get(iM11010a2)).f54459a) >= 0; iM11010a2++) {
                        oj3Var.f54459a = -(iM11740o - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.f38801b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    AbstractC3550rv.m20825S(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    AbstractC3550rv.m20825S(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iM11740o2 = m11740o();
            if (i6 >= iM11740o2) {
                cf1.m4605a("Check failed");
            }
            while (i6 < iM11740o2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.f38801b[i10];
                int iM11741p = i11 > -2 ? i11 : (m11741p() + i11) - (-2);
                if (iM11741p >= i) {
                    iM11741p = -((m11741p() - iM11741p) - (-2));
                }
                if (iM11741p != i11) {
                    this.f38801b[i10] = iM11741p;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.f38806g = i;
    }

    /* JADX INFO: renamed from: C */
    public final void m11708C(int i, int i2) {
        int i3 = this.f38811l;
        int i4 = this.f38810k;
        int i5 = this.f38812m;
        if (i4 != i) {
            Object[] objArr = this.f38802c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, m11741p());
        if (i5 != iMin) {
            int length = this.f38802c.length - i3;
            if (iMin < i5) {
                int iM11743r = m11743r(iMin);
                int iM11743r2 = m11743r(i5);
                int i7 = this.f38806g;
                while (iM11743r < iM11743r2) {
                    int i8 = (iM11743r * 5) + 4;
                    int i9 = this.f38801b[i8];
                    if (i9 < 0) {
                        cf1.m4605a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f38801b[i8] = -((length - i9) + 1);
                    iM11743r++;
                    if (iM11743r == i7) {
                        iM11743r += this.f38807h;
                    }
                }
            } else {
                int iM11743r3 = m11743r(i5);
                int iM11743r4 = m11743r(iMin);
                while (iM11743r3 < iM11743r4) {
                    int i10 = (iM11743r3 * 5) + 4;
                    int i11 = this.f38801b[i10];
                    if (i11 >= 0) {
                        cf1.m4605a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f38801b[i10] = i11 + length + 1;
                    iM11743r3++;
                    if (iM11743r3 == this.f38806g) {
                        iM11743r3 += this.f38807h;
                    }
                }
            }
            this.f38812m = iMin;
        }
        this.f38810k = i;
    }

    /* JADX INFO: renamed from: D */
    public final Object m11709D(int i) {
        int iM11743r = m11743r(i);
        int[] iArr = this.f38801b;
        if ((iArr[(iM11743r * 5) + 1] & 1073741824) != 0) {
            return this.f38802c[m11734h(m11733g(iArr, iM11743r))];
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final int m11710E(int[] iArr, int i) {
        int i2 = iArr[(m11743r(i) * 5) + 2];
        return i2 > -2 ? i2 : (m11741p() + i2) - (-2);
    }

    /* JADX INFO: renamed from: F */
    public final Object m11711F(Object obj) {
        if (this.f38813n > 0) {
            m11749x(1, this.f38821v);
        }
        Object[] objArr = this.f38802c;
        int i = this.f38808i;
        this.f38808i = i + 1;
        Object obj2 = objArr[m11734h(i)];
        if (this.f38808i > this.f38809j) {
            cf1.m4605a("Writing to an invalid slot");
        }
        this.f38802c[m11734h(this.f38808i - 1)] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: G */
    public final void m11712G() {
        int i;
        s56 s56Var = this.f38823x;
        if (s56Var != null) {
            while (s56Var.f60382b != 0) {
                int iM18150g0 = omd.m18150g0(s56Var);
                int iM11743r = m11743r(iM18150g0);
                int iM11746u = iM18150g0 + 1;
                int iM11746u2 = m11746u(iM18150g0) + iM18150g0;
                while (true) {
                    if (iM11746u >= iM11746u2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.f38801b[(m11743r(iM11746u) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iM11746u += m11746u(iM11746u);
                    }
                }
                int[] iArr = this.f38801b;
                int i2 = (iM11743r * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iM11710E = m11710E(iArr, iM18150g0);
                    if (iM11710E >= 0) {
                        omd.m18159o(s56Var, iM11710E);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m11713H() {
        if (this.f38813n != 0) {
            cf1.m4605a("Cannot remove group while inserting");
        }
        int i = this.f38819t;
        int i2 = this.f38808i;
        int iM11733g = m11733g(this.f38801b, m11743r(i));
        int iM11717L = m11717L();
        m11720O(this.f38821v);
        s56 s56Var = this.f38823x;
        if (s56Var != null) {
            while (true) {
                int i3 = s56Var.f60382b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    uk9.m22775i("IntList is empty.");
                    return false;
                }
                if (s56Var.f60381a[0] < i) {
                    break;
                }
                omd.m18150g0(s56Var);
            }
        }
        boolean zM11714I = m11714I(i, this.f38819t - i);
        m11715J(iM11733g, this.f38808i - iM11733g, i - 1);
        this.f38819t = i;
        this.f38808i = i2;
        this.f38814o -= iM11717L;
        return zM11714I;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m11714I(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.f38803d;
            m11707B(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f38804e;
                int i3 = i + i2;
                int iM11010a = eb9.m11010a(this.f38803d, i3, m11740o() - this.f38807h);
                if (iM11010a >= this.f38803d.size()) {
                    iM11010a--;
                }
                int i4 = iM11010a + 1;
                int i5 = 0;
                while (iM11010a >= 0) {
                    oj3 oj3Var = (oj3) this.f38803d.get(iM11010a);
                    int iM11729c = m11729c(oj3Var);
                    if (iM11729c < i) {
                        break;
                    }
                    if (iM11729c < i3) {
                        oj3Var.f54459a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iM11010a + 1;
                        }
                        i4 = iM11010a;
                    }
                    iM11010a--;
                }
                z = i4 < i5;
                if (z) {
                    this.f38803d.subList(i4, i5).clear();
                }
            }
            this.f38806g = i;
            this.f38807h += i2;
            int i6 = this.f38812m;
            if (i6 > i) {
                this.f38812m = Math.max(i, i6 - i2);
            }
            int i7 = this.f38820u;
            if (i7 >= this.f38806g) {
                this.f38820u = i7 - i2;
            }
            int i8 = this.f38821v;
            if (i8 >= 0 && (this.f38801b[(m11743r(i8) * 5) + 1] & 67108864) != 0) {
                m11725T(i8);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: J */
    public final void m11715J(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f38811l;
            int i5 = i + i2;
            m11708C(i5, i3);
            this.f38810k = i;
            this.f38811l = i4 + i2;
            Arrays.fill(this.f38802c, i, i5, (Object) null);
            int i6 = this.f38809j;
            if (i6 >= i) {
                this.f38809j = i6 - i2;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final Object m11716K(int i, Object obj, int i2) {
        int iM11719N = m11719N(this.f38801b, m11743r(i));
        int iM11733g = m11733g(this.f38801b, m11743r(i + 1));
        int i3 = iM11719N + i2;
        if (i3 < iM11719N || i3 >= iM11733g) {
            cf1.m4605a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iM11734h = m11734h(i3);
        Object[] objArr = this.f38802c;
        Object obj2 = objArr[iM11734h];
        objArr[iM11734h] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: L */
    public final int m11717L() {
        int iM11743r = m11743r(this.f38819t);
        int i = this.f38819t;
        int[] iArr = this.f38801b;
        int i2 = iM11743r * 5;
        int i3 = iArr[i2 + 3] + i;
        this.f38819t = i3;
        this.f38808i = m11733g(iArr, m11743r(i3));
        int i4 = this.f38801b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    /* JADX INFO: renamed from: M */
    public final void m11718M() {
        int i = this.f38820u;
        this.f38819t = i;
        this.f38808i = m11733g(this.f38801b, m11743r(i));
    }

    /* JADX INFO: renamed from: N */
    public final int m11719N(int[] iArr, int i) {
        if (i >= m11740o()) {
            return this.f38802c.length - this.f38811l;
        }
        int iM11011b = eb9.m11011b(iArr, i);
        return iM11011b < 0 ? (this.f38802c.length - this.f38811l) + iM11011b + 1 : iM11011b;
    }

    /* JADX INFO: renamed from: O */
    public final vj3 m11720O(int i) {
        oj3 oj3VarM11723R;
        HashMap map = this.f38804e;
        if (map == null || (oj3VarM11723R = m11723R(i)) == null) {
            return null;
        }
        return (vj3) map.get(oj3VarM11723R);
    }

    /* JADX INFO: renamed from: P */
    public final void m11721P() {
        if (this.f38813n != 0) {
            cf1.m4605a("Key must be supplied when inserting");
        }
        p84 p84Var = we1.f66679a;
        m11722Q(p84Var, p84Var, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final void m11722Q(Object obj, Object obj2, boolean z, int i) {
        int i2;
        int i3 = this.f38821v;
        Object[] objArr = this.f38813n > 0;
        this.f38817r.m17840c(this.f38814o);
        p84 p84Var = we1.f66679a;
        if (objArr == true) {
            int i4 = this.f38819t;
            int iM11733g = m11733g(this.f38801b, m11743r(i4));
            m11748w(1);
            this.f38808i = iM11733g;
            this.f38809j = iM11733g;
            int iM11743r = m11743r(i4);
            int i5 = obj != p84Var ? 1 : 0;
            int i6 = (z || obj2 == p84Var) ? 0 : 1;
            int iM11704i = m11704i(iM11733g, this.f38810k, this.f38811l, this.f38802c.length);
            if (iM11704i >= 0 && this.f38812m < i4) {
                iM11704i = -(((this.f38802c.length - this.f38811l) - iM11704i) + 1);
            }
            int[] iArr = this.f38801b;
            int i7 = this.f38821v;
            int i8 = iM11743r * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iM11704i;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                m11749x(i9, i4);
                Object[] objArr2 = this.f38802c;
                int i10 = this.f38808i;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.f38808i = i10;
            }
            this.f38814o = 0;
            i2 = i4 + 1;
            this.f38821v = i4;
            this.f38819t = i2;
            if (i3 >= 0) {
                m11720O(i3);
            }
        } else {
            this.f38815p.m17840c(i3);
            this.f38816q.m17840c((m11740o() - this.f38807h) - this.f38820u);
            int i11 = this.f38819t;
            int iM11743r2 = m11743r(i11);
            if (!fa4.m11650l(obj2, p84Var)) {
                if (z) {
                    m11726U(this.f38819t, obj2);
                } else {
                    m11724S(obj2);
                }
            }
            this.f38808i = m11719N(this.f38801b, iM11743r2);
            this.f38809j = m11733g(this.f38801b, m11743r(this.f38819t + 1));
            int[] iArr2 = this.f38801b;
            int i12 = iM11743r2 * 5;
            this.f38814o = iArr2[i12 + 1] & 67108863;
            this.f38821v = i11;
            this.f38819t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.f38820u = i2;
    }

    /* JADX INFO: renamed from: R */
    public final oj3 m11723R(int i) {
        ArrayList arrayList;
        int iM11014e;
        if (i < 0 || i >= m11741p() || (iM11014e = eb9.m11014e((arrayList = this.f38803d), i, m11741p())) < 0) {
            return null;
        }
        return (oj3) arrayList.get(iM11014e);
    }

    /* JADX INFO: renamed from: S */
    public final void m11724S(Object obj) {
        int iM11743r = m11743r(this.f38819t);
        int i = (iM11743r * 5) + 1;
        if ((this.f38801b[i] & 268435456) == 0) {
            cf1.m4605a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f38802c;
        int[] iArr = this.f38801b;
        objArr[m11734h(Integer.bitCount(iArr[i] >> 29) + m11733g(iArr, iM11743r))] = obj;
    }

    /* JADX INFO: renamed from: T */
    public final void m11725T(int i) {
        if (i >= 0) {
            s56 s56Var = this.f38823x;
            if (s56Var == null) {
                s56Var = new s56();
                this.f38823x = s56Var;
            }
            omd.m18159o(s56Var, i);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m11726U(int i, Object obj) {
        int iM11743r = m11743r(i);
        int[] iArr = this.f38801b;
        if (iM11743r >= iArr.length || (iArr[(iM11743r * 5) + 1] & 1073741824) == 0) {
            cf1.m4605a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.f38802c[m11734h(m11733g(this.f38801b, iM11743r))] = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m11727a(int i) {
        if (i < 0) {
            cf1.m4605a("Cannot seek backwards");
        }
        if (this.f38813n > 0) {
            hi7.m13279b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.f38819t + i;
        if (i2 < this.f38821v || i2 > this.f38820u) {
            cf1.m4605a("Cannot seek outside the current group (" + this.f38821v + '-' + this.f38820u + ')');
        }
        this.f38819t = i2;
        int iM11733g = m11733g(this.f38801b, m11743r(i2));
        this.f38808i = iM11733g;
        this.f38809j = iM11733g;
    }

    /* JADX INFO: renamed from: b */
    public final oj3 m11728b(int i) {
        ArrayList arrayList = this.f38803d;
        int iM11014e = eb9.m11014e(arrayList, i, m11741p());
        if (iM11014e >= 0) {
            return (oj3) arrayList.get(iM11014e);
        }
        if (i > this.f38806g) {
            i = -(m11741p() - i);
        }
        oj3 oj3Var = new oj3(i);
        arrayList.add(-(iM11014e + 1), oj3Var);
        return oj3Var;
    }

    /* JADX INFO: renamed from: c */
    public final int m11729c(oj3 oj3Var) {
        int i = oj3Var.f54459a;
        return i < 0 ? m11741p() + i : i;
    }

    /* JADX INFO: renamed from: d */
    public final void m11730d() {
        int i = this.f38813n;
        this.f38813n = i + 1;
        if (i == 0) {
            this.f38816q.m17840c((m11740o() - this.f38807h) - this.f38820u);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11731e(boolean z) {
        this.f38822w = true;
        if (z && this.f38815p.f53974b == 0) {
            m11707B(m11741p());
            m11708C(this.f38802c.length - this.f38811l, this.f38806g);
            int i = this.f38810k;
            Arrays.fill(this.f38802c, i, this.f38811l + i, (Object) null);
            m11712G();
        }
        int[] iArr = this.f38801b;
        int i2 = this.f38806g;
        Object[] objArr = this.f38802c;
        int i3 = this.f38810k;
        ArrayList arrayList = this.f38803d;
        HashMap map = this.f38804e;
        t56 t56Var = this.f38805f;
        cb9 cb9Var = this.f38800a;
        if (!cb9Var.f9848g) {
            hi7.m13278a("Unexpected writer close()");
        }
        cb9Var.f9848g = false;
        cb9Var.f9842a = iArr;
        cb9Var.f9843b = i2;
        cb9Var.f9844c = objArr;
        cb9Var.f9845d = i3;
        cb9Var.f9850i = arrayList;
        cb9Var.f9851j = map;
        cb9Var.f9852k = t56Var;
    }

    /* JADX INFO: renamed from: f */
    public final int m11732f(int i) {
        return m11733g(this.f38801b, m11743r(i));
    }

    /* JADX INFO: renamed from: g */
    public final int m11733g(int[] iArr, int i) {
        if (i >= m11740o()) {
            return this.f38802c.length - this.f38811l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.f38802c.length - this.f38811l) + i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: h */
    public final int m11734h(int i) {
        return (this.f38811l * (i < this.f38810k ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: j */
    public final void m11735j() {
        h66 h66Var;
        boolean z = this.f38813n > 0;
        int i = this.f38819t;
        int i2 = this.f38820u;
        int i3 = this.f38821v;
        int iM11743r = m11743r(i3);
        int i4 = this.f38814o;
        int i5 = i - i3;
        int i6 = iM11743r * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.f38801b[i7] & 1073741824) != 0;
        o84 o84Var = this.f38817r;
        if (z) {
            t56 t56Var = this.f38818s;
            if (t56Var != null && (h66Var = (h66) t56Var.m10152b(i3)) != null) {
                Object[] objArr = h66Var.f1293a;
                int i8 = h66Var.f1294b;
                for (int i9 = 0; i9 < i8; i9++) {
                    m11711F(objArr[i9]);
                }
            }
            int[] iArr = this.f38801b;
            iArr[i6 + 3] = i5;
            eb9.m11012c(iM11743r, i4, iArr);
            int iM17839b = o84Var.m17839b();
            if (z2) {
                i4 = 1;
            }
            this.f38814o = iM17839b + i4;
            int iM11710E = m11710E(this.f38801b, i3);
            this.f38821v = iM11710E;
            int iM11741p = iM11710E < 0 ? m11741p() : m11743r(iM11710E + 1);
            int iM11733g = iM11741p >= 0 ? m11733g(this.f38801b, iM11741p) : 0;
            this.f38808i = iM11733g;
            this.f38809j = iM11733g;
            return;
        }
        if (i != i2) {
            cf1.m4605a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f38801b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        eb9.m11012c(iM11743r, i4, iArr2);
        int iM17839b2 = this.f38815p.m17839b();
        this.f38820u = (m11740o() - this.f38807h) - this.f38816q.m17839b();
        this.f38821v = iM17839b2;
        int iM11710E2 = m11710E(this.f38801b, i3);
        int iM17839b3 = o84Var.m17839b();
        this.f38814o = iM17839b3;
        if (iM11710E2 == iM17839b2) {
            this.f38814o = iM17839b3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iM11710E2 != 0 && iM11710E2 != iM17839b2 && (i14 != 0 || i13 != 0)) {
                int iM11743r2 = m11743r(iM11710E2);
                if (i13 != 0) {
                    int[] iArr3 = this.f38801b;
                    int i15 = (iM11743r2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.f38801b;
                    eb9.m11012c(iM11743r2, (iArr4[(iM11743r2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.f38801b;
                if ((iArr5[(iM11743r2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iM11710E2 = m11710E(iArr5, iM11710E2);
            }
        }
        this.f38814o += i14;
    }

    /* JADX INFO: renamed from: k */
    public final void m11736k() {
        if (this.f38813n <= 0) {
            hi7.m13279b("Unbalanced begin/end insert");
        }
        int i = this.f38813n - 1;
        this.f38813n = i;
        if (i == 0) {
            if (this.f38817r.f53974b != this.f38815p.f53974b) {
                cf1.m4605a("startGroup/endGroup mismatch while inserting");
            }
            this.f38820u = (m11740o() - this.f38807h) - this.f38816q.m17839b();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m11737l(int i) {
        boolean z = false;
        if (!(this.f38813n <= 0)) {
            cf1.m4605a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.f38821v;
        if (i2 != i) {
            if (i >= i2 && i < this.f38820u) {
                z = true;
            }
            if (!z) {
                cf1.m4605a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.f38819t;
            int i4 = this.f38808i;
            int i5 = this.f38809j;
            this.f38819t = i;
            m11721P();
            this.f38819t = i3;
            this.f38808i = i4;
            this.f38809j = i5;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m11738m(int i, int i2, int i3) {
        if (i >= this.f38806g) {
            i = -((m11741p() - i) + 2);
        }
        while (i3 < i2) {
            this.f38801b[(m11743r(i3) * 5) + 2] = i;
            int i4 = this.f38801b[(m11743r(i3) * 5) + 3] + i3;
            m11738m(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX INFO: renamed from: n */
    public final void m11739n(int i, zi3 zi3Var) {
        int i2;
        int i3;
        int i4;
        int iM11710E = m11710E(this.f38801b, i);
        int iM11741p = m11741p();
        int iM11746u = m11746u(i) + i;
        int i5 = i;
        u56 u56Var = null;
        s56 s56Var = null;
        while (i5 < iM11746u) {
            int iM11732f = m11732f(i5);
            int i6 = i5 + 1;
            int iM11732f2 = m11732f(i6);
            while (iM11732f < iM11732f2) {
                Object obj = this.f38802c[m11734h(iM11732f)];
                if (obj instanceof xj3) {
                    xj3 xj3Var = (xj3) obj;
                    if (!(xj3Var instanceof xj3)) {
                        xj3Var = null;
                    }
                    if (xj3Var == null) {
                        cf1.m4606b("Inconsistent composition");
                        C3386nv.m17631r();
                        return;
                    }
                    int i7 = xj3Var.f68287b;
                    if (i7 >= 0) {
                        int iM11746u2 = m11746u(i5) + i5;
                        int i8 = i6;
                        int i9 = 0;
                        while (i8 < iM11746u2 && i9 < i7) {
                            int iM11743r = m11743r(i8);
                            int i10 = iM11710E;
                            int[] iArr = this.f38801b;
                            int i11 = iM11743r * 5;
                            i8 = iArr[i11 + 3] + i8;
                            if (i8 < iM11746u2 && (iArr[i11 + 1] & 536870912) == 0) {
                                i9++;
                            }
                            iM11710E = i10;
                        }
                        i4 = iM11710E;
                        if (u56Var == null) {
                            int[] iArr2 = m84.f50750a;
                            u56Var = new u56();
                        }
                        if (s56Var == null) {
                            s56Var = new s56();
                        }
                        u56Var.m22474a(i8);
                        s56Var.m21101a(i8);
                        s56Var.m21101a(iM11732f);
                    } else {
                        i4 = iM11710E;
                        zi3Var.invoke(Integer.valueOf(iM11732f), obj);
                    }
                } else {
                    i4 = iM11710E;
                    zi3Var.invoke(Integer.valueOf(iM11732f), obj);
                }
                iM11732f++;
                iM11710E = i4;
            }
            int i12 = iM11710E;
            iM11710E = i6 < iM11741p ? m11710E(this.f38801b, i6) : -1;
            if (iM11710E != i5) {
                int iM11710E2 = i12;
                while (true) {
                    if (s56Var == null || u56Var == null || !u56Var.m22480g(i5)) {
                        i2 = iM11741p;
                    } else {
                        int i13 = s56Var.f60382b;
                        int i14 = i13 / 2;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < i14) {
                            int i17 = i15 * 2;
                            int i18 = iM11741p;
                            int iM21103c = s56Var.m21103c(i17);
                            if (iM21103c == i5) {
                                int iM21103c2 = s56Var.m21103c(i17 + 1);
                                zi3Var.invoke(Integer.valueOf(iM21103c2), this.f38802c[m11734h(iM21103c2)]);
                            } else if (i17 != i16) {
                                int i19 = i16 + 1;
                                s56Var.m21106f(i16, iM21103c);
                                i16 += 2;
                                s56Var.m21106f(i19, s56Var.m21103c(i17 + 1));
                            } else {
                                i16 += 2;
                            }
                            i15++;
                            zi3Var = zi3Var;
                            iM11741p = i18;
                        }
                        i2 = iM11741p;
                        if (i16 != i13) {
                            if (i16 < 0 || i16 > (i3 = s56Var.f60382b) || i13 < 0 || i13 > i3) {
                                v63.m23143u("Index must be between 0 and size");
                                return;
                            }
                            if (i13 < i16) {
                                C3386nv.m17626m("The end index must be < start index");
                                return;
                            } else if (i13 != i16) {
                                if (i13 < i3) {
                                    int[] iArr3 = s56Var.f60381a;
                                    AbstractC3550rv.m20825S(i16, i13, i3, iArr3, iArr3);
                                }
                                s56Var.f60382b -= i13 - i16;
                            }
                        }
                    }
                    if (i5 == i || iM11710E2 == iM11710E) {
                        break;
                    }
                    i5 = iM11710E2;
                    iM11741p = i2;
                    iM11710E2 = m11710E(this.f38801b, iM11710E2);
                    zi3Var = zi3Var;
                }
            } else {
                i2 = iM11741p;
            }
            i5 = i6;
            iM11741p = i2;
        }
    }

    /* JADX INFO: renamed from: o */
    public final int m11740o() {
        return this.f38801b.length / 5;
    }

    /* JADX INFO: renamed from: p */
    public final int m11741p() {
        return m11740o() - this.f38807h;
    }

    /* JADX INFO: renamed from: q */
    public final Object m11742q(int i) {
        int iM11743r = m11743r(i);
        int[] iArr = this.f38801b;
        int i2 = (iM11743r * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return we1.f66679a;
        }
        return this.f38802c[Integer.bitCount(iArr[i2] >> 29) + m11733g(iArr, iM11743r)];
    }

    /* JADX INFO: renamed from: r */
    public final int m11743r(int i) {
        return (this.f38807h * (i < this.f38806g ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: s */
    public final int m11744s(int i) {
        return this.f38801b[m11743r(i) * 5];
    }

    /* JADX INFO: renamed from: t */
    public final Object m11745t(int i) {
        int iM11743r = m11743r(i);
        int[] iArr = this.f38801b;
        int i2 = iM11743r * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f38802c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f38819t + " end=" + this.f38820u + " size = " + m11741p() + " gap=" + this.f38806g + '-' + (this.f38806g + this.f38807h) + ')';
    }

    /* JADX INFO: renamed from: u */
    public final int m11746u(int i) {
        return this.f38801b[(m11743r(i) * 5) + 3];
    }

    /* JADX INFO: renamed from: v */
    public final boolean m11747v(int i, int i2) {
        int iM11740o;
        int iM11746u;
        if (i2 == this.f38821v) {
            iM11740o = this.f38820u;
        } else {
            o84 o84Var = this.f38815p;
            if (i2 > o84Var.m17838a(0)) {
                iM11746u = m11746u(i2);
            } else {
                int[] iArr = o84Var.f53973a;
                int iMin = Math.min(iArr.length, o84Var.f53974b);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iM11746u = m11746u(i2);
                } else {
                    iM11740o = (m11740o() - this.f38807h) - this.f38816q.f53973a[i3];
                }
            }
            iM11740o = iM11746u + i2;
        }
        return i > i2 && i < iM11740o;
    }

    /* JADX INFO: renamed from: w */
    public final void m11748w(int i) {
        if (i > 0) {
            int i2 = this.f38819t;
            m11707B(i2);
            int i3 = this.f38806g;
            int i4 = this.f38807h;
            int[] iArr = this.f38801b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                AbstractC3550rv.m20825S(0, 0, i3 * 5, iArr, iArr2);
                AbstractC3550rv.m20825S((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.f38801b = iArr2;
                i4 = i6;
            }
            int i7 = this.f38820u;
            if (i7 >= i3) {
                this.f38820u = i7 + i;
            }
            int i8 = i3 + i;
            this.f38806g = i8;
            this.f38807h = i4 - i;
            int iM11704i = m11704i(i5 > 0 ? m11732f(i2 + i) : 0, this.f38812m >= i3 ? this.f38810k : 0, this.f38811l, this.f38802c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.f38801b[(i9 * 5) + 4] = iM11704i;
            }
            int i10 = this.f38812m;
            if (i10 >= i3) {
                this.f38812m = i10 + i;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m11749x(int i, int i2) {
        if (i > 0) {
            m11708C(this.f38808i, i2);
            int i3 = this.f38810k;
            int i4 = this.f38811l;
            if (i4 < i) {
                Object[] objArr = this.f38802c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.f38802c = objArr2;
                i4 = i7;
            }
            int i9 = this.f38809j;
            if (i9 >= i3) {
                this.f38809j = i9 + i;
            }
            this.f38810k = i3 + i;
            this.f38811l = i4 - i;
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m11750y(int i) {
        return (this.f38801b[(m11743r(i) * 5) + 1] & 1073741824) != 0;
    }
}
