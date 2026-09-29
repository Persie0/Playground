package androidx.compose.runtime;

import ae.C0062b;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import p081e0.C5296b;
import p081e0.C5320k0;
import p081e0.C5339u;
import p081e0.C5342v0;
import tl.C9322j;

/* JADX INFO: renamed from: androidx.compose.runtime.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0480e {

    /* JADX INFO: renamed from: a */
    public final C5342v0 f3166a;

    /* JADX INFO: renamed from: b */
    public int[] f3167b;

    /* JADX INFO: renamed from: c */
    public Object[] f3168c;

    /* JADX INFO: renamed from: d */
    public ArrayList<C5296b> f3169d;

    /* JADX INFO: renamed from: e */
    public int f3170e;

    /* JADX INFO: renamed from: f */
    public int f3171f;

    /* JADX INFO: renamed from: g */
    public int f3172g;

    /* JADX INFO: renamed from: h */
    public int f3173h;

    /* JADX INFO: renamed from: i */
    public int f3174i;

    /* JADX INFO: renamed from: j */
    public int f3175j;

    /* JADX INFO: renamed from: k */
    public int f3176k;

    /* JADX INFO: renamed from: l */
    public int f3177l;

    /* JADX INFO: renamed from: m */
    public int f3178m;

    /* JADX INFO: renamed from: n */
    public int f3179n;

    /* JADX INFO: renamed from: o */
    public final C5339u f3180o;

    /* JADX INFO: renamed from: p */
    public final C5339u f3181p;

    /* JADX INFO: renamed from: q */
    public final C5339u f3182q;

    /* JADX INFO: renamed from: r */
    public int f3183r;

    /* JADX INFO: renamed from: s */
    public int f3184s;

    /* JADX INFO: renamed from: t */
    public boolean f3185t;

    /* JADX INFO: renamed from: u */
    public C5320k0 f3186u;

    /* JADX INFO: renamed from: androidx.compose.runtime.e$a */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:10:0x003c  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: a */
        public static final List m1813a(C0480e c0480e, int i10, C0480e c0480e2, boolean z10, boolean z11) {
            boolean z12;
            List list;
            int i11;
            boolean zM1776C;
            int iM1802o = c0480e.m1802o(i10);
            int i12 = i10 + iM1802o;
            int iM1794g = c0480e.m1794g(c0480e.f3167b, c0480e.m1801n(i10));
            int iM1794g2 = c0480e.m1794g(c0480e.f3167b, c0480e.m1801n(i12));
            int i13 = iM1794g2 - iM1794g;
            if (i10 < 0) {
                z12 = false;
            } else if ((c0480e.f3167b[(c0480e.m1801n(i10) * 5) + 1] & 201326592) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            c0480e2.m1804q(iM1802o);
            c0480e2.m1805r(i13, c0480e2.f3183r);
            if (c0480e.f3170e < i12) {
                c0480e.m1808v(i12);
            }
            if (c0480e.f3175j < iM1794g2) {
                c0480e.m1809w(iM1794g2, i12);
            }
            int[] iArr = c0480e2.f3167b;
            int i14 = c0480e2.f3183r;
            int i15 = i14 * 5;
            C9322j.m17672Z(i15, i10 * 5, i12 * 5, c0480e.f3167b, iArr);
            Object[] objArr = c0480e2.f3168c;
            int i16 = c0480e2.f3173h;
            C9322j.m17673a0(i16, iM1794g, iM1794g2, c0480e.f3168c, objArr);
            int i17 = c0480e2.f3184s;
            iArr[i15 + 2] = i17;
            int i18 = i14 - i10;
            int i19 = i14 + iM1802o;
            int iM1794g3 = i16 - c0480e2.m1794g(iArr, i14);
            int i20 = c0480e2.f3177l;
            int i21 = c0480e2.f3176k;
            int length = objArr.length;
            int i22 = i20;
            boolean z13 = z12;
            int i23 = i14;
            while (i23 < i19) {
                if (i23 != i14) {
                    int i24 = (i23 * 5) + 2;
                    iArr[i24] = iArr[i24] + i18;
                }
                int i25 = i16;
                int iM1794g4 = c0480e2.m1794g(iArr, i23) + iM1794g3;
                if (iM1794g4 > (i22 < i23 ? 0 : c0480e2.f3175j)) {
                    iM1794g4 = -(((length - i21) - iM1794g4) + 1);
                }
                iArr[(i23 * 5) + 4] = iM1794g4;
                if (i23 == i22) {
                    i22++;
                }
                i23++;
                i19 = i19;
                i16 = i25;
            }
            int i26 = i16;
            int i27 = i19;
            c0480e2.f3177l = i22;
            int iM420z = C0062b.m420z(c0480e.f3169d, i10, c0480e.m1800m());
            int iM420z2 = C0062b.m420z(c0480e.f3169d, i12, c0480e.m1800m());
            if (iM420z < iM420z2) {
                ArrayList<C5296b> arrayList = c0480e.f3169d;
                ArrayList arrayList2 = new ArrayList(iM420z2 - iM420z);
                for (int i28 = iM420z; i28 < iM420z2; i28++) {
                    C5296b c5296b = arrayList.get(i28);
                    C5207g.m11110e(c5296b, "sourceAnchors[anchorIndex]");
                    C5296b c5296b2 = c5296b;
                    c5296b2.f33569a += i18;
                    arrayList2.add(c5296b2);
                }
                c0480e2.f3169d.addAll(C0062b.m420z(c0480e2.f3169d, c0480e2.f3183r, c0480e2.m1800m()), arrayList2);
                arrayList.subList(iM420z, iM420z2).clear();
                list = arrayList2;
            } else {
                list = EmptyList.f38032a;
            }
            int iM1812z = c0480e.m1812z(i10);
            if (z10) {
                boolean z14 = iM1812z >= 0;
                if (z14) {
                    c0480e.m1782I();
                    c0480e.m1788a(iM1812z - c0480e.f3183r);
                    c0480e.m1782I();
                }
                c0480e.m1788a(i10 - c0480e.f3183r);
                zM1776C = c0480e.m1776C();
                if (z14) {
                    c0480e.m1780G();
                    c0480e.m1796i();
                    c0480e.m1780G();
                    c0480e.m1796i();
                }
                i11 = 1;
            } else {
                boolean zM1777D = c0480e.m1777D(i10, iM1802o);
                i11 = 1;
                c0480e.m1778E(iM1794g, i13, i10 - 1);
                zM1776C = zM1777D;
            }
            if (!(!zM1776C)) {
                ComposerKt.m1687c("Unexpectedly removed anchors".toString());
                throw null;
            }
            c0480e2.f3179n += C0062b.m416y(iArr, i14) ? i11 : C0062b.m256D(iArr, i14);
            if (z11) {
                c0480e2.f3183r = i27;
                c0480e2.f3173h = i26 + i13;
            }
            if (z13) {
                c0480e2.m1786M(i17);
            }
            return list;
        }
    }

    static {
        new a();
    }

    public C0480e(C5342v0 c5342v0) {
        C5207g.m11111f(c5342v0, "table");
        this.f3166a = c5342v0;
        int[] iArr = c5342v0.f33624a;
        this.f3167b = iArr;
        Object[] objArr = c5342v0.f33626c;
        this.f3168c = objArr;
        this.f3169d = c5342v0.f33631h;
        int i10 = c5342v0.f33625b;
        this.f3170e = i10;
        this.f3171f = (iArr.length / 5) - i10;
        this.f3172g = i10;
        int i11 = c5342v0.f33627d;
        this.f3175j = i11;
        this.f3176k = objArr.length - i11;
        this.f3177l = i10;
        this.f3180o = new C5339u();
        this.f3181p = new C5339u();
        this.f3182q = new C5339u();
        this.f3184s = -1;
    }

    /* JADX INFO: renamed from: t */
    public static void m1773t(C0480e c0480e) {
        int i10 = c0480e.f3184s;
        int iM1801n = c0480e.m1801n(i10);
        int[] iArr = c0480e.f3167b;
        boolean z10 = true;
        int i11 = (iM1801n * 5) + 1;
        int i12 = iArr[i11];
        if ((i12 & 134217728) == 0) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        iArr[i11] = i12 | 134217728;
        if (C0062b.m400u(iArr, iM1801n)) {
            return;
        }
        c0480e.m1786M(c0480e.m1812z(i10));
    }

    /* JADX INFO: renamed from: A */
    public final int m1774A(int[] iArr, int i10) {
        int i11 = iArr[(m1801n(i10) * 5) + 2];
        return i11 > -2 ? i11 : m1800m() + i11 + 2;
    }

    /* JADX INFO: renamed from: B */
    public final void m1775B() {
        boolean z10;
        C5320k0 c5320k0 = this.f3186u;
        if (c5320k0 != null) {
            loop0: while (true) {
                while (true) {
                    if (!(!c5320k0.f33593a.isEmpty())) {
                        break loop0;
                    }
                    int iM11454c = c5320k0.m11454c();
                    int iM1801n = m1801n(iM11454c);
                    int iM1802o = iM11454c + 1;
                    int iM1802o2 = m1802o(iM11454c) + iM11454c;
                    while (true) {
                        if (iM1802o >= iM1802o2) {
                            z10 = false;
                            break;
                        }
                        if ((this.f3167b[(m1801n(iM1802o) * 5) + 1] & 201326592) != 0) {
                            z10 = true;
                            break;
                        }
                        iM1802o += m1802o(iM1802o);
                    }
                    if (!(C0062b.m400u(this.f3167b, iM1801n) != z10)) {
                        break;
                    }
                    int[] iArr = this.f3167b;
                    int i10 = (iM1801n * 5) + 1;
                    if (z10) {
                        iArr[i10] = iArr[i10] | 67108864;
                    } else {
                        iArr[i10] = iArr[i10] & (-67108865);
                    }
                    int iM1812z = m1812z(iM11454c);
                    if (iM1812z < 0) {
                        break;
                    } else {
                        c5320k0.m11453b(iM1812z);
                    }
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: C */
    public final boolean m1776C() {
        if (!(this.f3178m == 0)) {
            ComposerKt.m1687c("Cannot remove group while inserting".toString());
            throw null;
        }
        int i10 = this.f3183r;
        int i11 = this.f3173h;
        int iM1779F = m1779F();
        C5320k0 c5320k0 = this.f3186u;
        if (c5320k0 != null) {
            while (true) {
                List list = c5320k0.f33593a;
                if (!(!list.isEmpty()) || ((Number) C6752c.m13423Q(list)).intValue() < i10) {
                    break;
                }
                c5320k0.m11454c();
            }
        }
        boolean zM1777D = m1777D(i10, this.f3183r - i10);
        m1778E(i11, this.f3173h - i11, i10 - 1);
        this.f3183r = i10;
        this.f3173h = i11;
        this.f3179n -= iM1779F;
        return zM1777D;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
    /* JADX INFO: renamed from: D */
    public final boolean m1777D(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        boolean z11 = false;
        if (i11 <= 0) {
            return false;
        }
        ArrayList<C5296b> arrayList = this.f3169d;
        m1808v(i10);
        if (!arrayList.isEmpty()) {
            int i15 = i11 + i10;
            int iM420z = C0062b.m420z(this.f3169d, i15, (this.f3167b.length / 5) - this.f3171f);
            if (iM420z >= this.f3169d.size()) {
                iM420z--;
            }
            int i16 = iM420z + 1;
            int i17 = 0;
            while (iM420z >= 0) {
                C5296b c5296b = this.f3169d.get(iM420z);
                C5207g.m11110e(c5296b, "anchors[index]");
                C5296b c5296b2 = c5296b;
                int iM1790c = m1790c(c5296b2);
                if (iM1790c < i10) {
                    break;
                }
                if (iM1790c < i15) {
                    c5296b2.f33569a = Integer.MIN_VALUE;
                    if (i17 == 0) {
                        i17 = iM420z + 1;
                    }
                    i16 = iM420z;
                }
                iM420z--;
            }
            z10 = i16 < i17;
            if (z10) {
                this.f3169d.subList(i16, i17).clear();
            }
            this.f3170e = i10;
            this.f3171f += i11;
            i12 = this.f3177l;
            if (i12 > i10) {
                this.f3177l = Math.max(i10, i12 - i11);
            }
            i13 = this.f3172g;
            if (i13 >= this.f3170e) {
                this.f3172g = i13 - i11;
            }
            i14 = this.f3184s;
            if (i14 >= 0 && C0062b.m400u(this.f3167b, m1801n(i14))) {
                z11 = true;
            }
            if (z11) {
                m1786M(this.f3184s);
            }
            return z10;
        }
        z10 = false;
        this.f3170e = i10;
        this.f3171f += i11;
        i12 = this.f3177l;
        if (i12 > i10) {
            this.f3177l = Math.max(i10, i12 - i11);
        }
        i13 = this.f3172g;
        if (i13 >= this.f3170e) {
            this.f3172g = i13 - i11;
        }
        i14 = this.f3184s;
        if (i14 >= 0) {
            z11 = true;
        }
        if (z11) {
            m1786M(this.f3184s);
        }
        return z10;
    }

    /* JADX INFO: renamed from: E */
    public final void m1778E(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f3176k;
            int i14 = i10 + i11;
            m1809w(i14, i12);
            this.f3175j = i10;
            this.f3176k = i13 + i11;
            C9322j.m17678f0(i10, i14, this.f3168c);
            int i15 = this.f3174i;
            if (i15 >= i10) {
                this.f3174i = i15 - i11;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final int m1779F() {
        int iM1801n = m1801n(this.f3183r);
        int iM404v = C0062b.m404v(this.f3167b, iM1801n) + this.f3183r;
        this.f3183r = iM404v;
        this.f3173h = m1794g(this.f3167b, m1801n(iM404v));
        if (C0062b.m416y(this.f3167b, iM1801n)) {
            return 1;
        }
        return C0062b.m256D(this.f3167b, iM1801n);
    }

    /* JADX INFO: renamed from: G */
    public final void m1780G() {
        int i10 = this.f3172g;
        this.f3183r = i10;
        this.f3173h = m1794g(this.f3167b, m1801n(i10));
    }

    /* JADX INFO: renamed from: H */
    public final int m1781H(int[] iArr, int i10) {
        if (i10 >= this.f3167b.length / 5) {
            return this.f3168c.length - this.f3176k;
        }
        int iM268G = C0062b.m268G(iArr, i10);
        return iM268G < 0 ? (this.f3168c.length - this.f3176k) + iM268G + 1 : iM268G;
    }

    /* JADX INFO: renamed from: I */
    public final void m1782I() {
        if (!(this.f3178m == 0)) {
            ComposerKt.m1687c("Key must be supplied when inserting".toString());
            throw null;
        }
        InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
        m1783J(0, c10586a, c10586a, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public final void m1783J(int i10, Object obj, Object obj2, boolean z10) {
        int iM404v;
        Object[] objArr = this.f3178m > 0;
        this.f3182q.m11467d(this.f3179n);
        InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
        if (objArr == true) {
            m1804q(1);
            int i11 = this.f3183r;
            int iM1801n = m1801n(i11);
            int i12 = obj != c10586a ? 1 : 0;
            int i13 = (z10 || obj2 == c10586a) ? 0 : 1;
            int[] iArr = this.f3167b;
            int i14 = this.f3184s;
            int i15 = this.f3173h;
            int i16 = z10 ? 1073741824 : 0;
            int i17 = i12 != 0 ? 536870912 : 0;
            int i18 = i13 != 0 ? 268435456 : 0;
            int i19 = iM1801n * 5;
            iArr[i19 + 0] = i10;
            iArr[i19 + 1] = i16 | i17 | i18;
            iArr[i19 + 2] = i14;
            iArr[i19 + 3] = 0;
            iArr[i19 + 4] = i15;
            this.f3174i = i15;
            int i20 = (z10 ? 1 : 0) + i12 + i13;
            if (i20 > 0) {
                m1805r(i20, i11);
                Object[] objArr2 = this.f3168c;
                int i21 = this.f3173h;
                if (z10) {
                    objArr2[i21] = obj2;
                    i21++;
                }
                if (i12 != 0) {
                    objArr2[i21] = obj;
                    i21++;
                }
                if (i13 != 0) {
                    objArr2[i21] = obj2;
                    i21++;
                }
                this.f3173h = i21;
            }
            this.f3179n = 0;
            iM404v = i11 + 1;
            this.f3184s = i11;
            this.f3183r = iM404v;
        } else {
            this.f3180o.m11467d(this.f3184s);
            this.f3181p.m11467d(((this.f3167b.length / 5) - this.f3171f) - this.f3172g);
            int i22 = this.f3183r;
            int iM1801n2 = m1801n(i22);
            if (!C5207g.m11106a(obj2, c10586a)) {
                if (z10) {
                    m1787N(this.f3183r, obj2);
                } else {
                    m1785L(obj2);
                }
            }
            this.f3173h = m1781H(this.f3167b, iM1801n2);
            this.f3174i = m1794g(this.f3167b, m1801n(this.f3183r + 1));
            this.f3179n = C0062b.m256D(this.f3167b, iM1801n2);
            this.f3184s = i22;
            this.f3183r = i22 + 1;
            iM404v = i22 + C0062b.m404v(this.f3167b, iM1801n2);
        }
        this.f3172g = iM404v;
    }

    /* JADX INFO: renamed from: K */
    public final void m1784K(Object obj) {
        if (this.f3178m > 0) {
            m1805r(1, this.f3184s);
        }
        Object[] objArr = this.f3168c;
        int i10 = this.f3173h;
        this.f3173h = i10 + 1;
        Object obj2 = objArr[m1795h(i10)];
        int i11 = this.f3173h;
        if (i11 <= this.f3174i) {
            this.f3168c[m1795h(i11 - 1)] = obj;
        } else {
            ComposerKt.m1687c("Writing to an invalid slot".toString());
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: L */
    public final void m1785L(Object obj) {
        int iM1801n = m1801n(this.f3183r);
        if (C0062b.m408w(this.f3167b, iM1801n)) {
            this.f3168c[m1795h(m1791d(this.f3167b, iM1801n))] = obj;
        } else {
            ComposerKt.m1687c("Updating the data of a group that was not created with a data slot".toString());
            throw null;
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m1786M(int i10) {
        if (i10 >= 0) {
            C5320k0 c5320k0 = this.f3186u;
            if (c5320k0 == null) {
                c5320k0 = new C5320k0(0);
                this.f3186u = c5320k0;
            }
            c5320k0.m11453b(i10);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m1787N(int i10, Object obj) {
        int iM1801n = m1801n(i10);
        int[] iArr = this.f3167b;
        if (iM1801n < iArr.length && C0062b.m416y(iArr, iM1801n)) {
            this.f3168c[m1795h(m1794g(this.f3167b, iM1801n))] = obj;
            return;
        }
        ComposerKt.m1687c(("Updating the node of a group at " + i10 + " that was not created with as a node group").toString());
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m1788a(int i10) {
        if (!(i10 >= 0)) {
            ComposerKt.m1687c("Cannot seek backwards".toString());
            throw null;
        }
        if (!(this.f3178m <= 0)) {
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f3183r + i10;
        if (i11 >= this.f3184s && i11 <= this.f3172g) {
            this.f3183r = i11;
            int iM1794g = m1794g(this.f3167b, m1801n(i11));
            this.f3173h = iM1794g;
            this.f3174i = iM1794g;
            return;
        }
        ComposerKt.m1687c(("Cannot seek outside the current group (" + this.f3184s + '-' + this.f3172g + ')').toString());
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final C5296b m1789b(int i10) {
        ArrayList<C5296b> arrayList = this.f3169d;
        int iM323X1 = C0062b.m323X1(arrayList, i10, m1800m());
        if (iM323X1 >= 0) {
            C5296b c5296b = arrayList.get(iM323X1);
            C5207g.m11110e(c5296b, "get(location)");
            return c5296b;
        }
        if (i10 > this.f3170e) {
            i10 = -(m1800m() - i10);
        }
        C5296b c5296b2 = new C5296b(i10);
        arrayList.add(-(iM323X1 + 1), c5296b2);
        return c5296b2;
    }

    /* JADX INFO: renamed from: c */
    public final int m1790c(C5296b c5296b) {
        C5207g.m11111f(c5296b, "anchor");
        int iM1800m = c5296b.f33569a;
        if (iM1800m < 0) {
            iM1800m += m1800m();
        }
        return iM1800m;
    }

    /* JADX INFO: renamed from: d */
    public final int m1791d(int[] iArr, int i10) {
        return C0062b.m249B0(iArr[(i10 * 5) + 1] >> 29) + m1794g(iArr, i10);
    }

    /* JADX INFO: renamed from: e */
    public final void m1792e() {
        int i10 = this.f3178m;
        this.f3178m = i10 + 1;
        if (i10 == 0) {
            this.f3181p.m11467d(((this.f3167b.length / 5) - this.f3171f) - this.f3172g);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final void m1793f() {
        boolean z10 = true;
        this.f3185t = true;
        if (this.f3180o.f33618a != 0) {
            z10 = false;
        }
        if (z10) {
            m1808v(m1800m());
            m1809w(this.f3168c.length - this.f3176k, this.f3170e);
            m1775B();
        }
        int[] iArr = this.f3167b;
        int i10 = this.f3170e;
        Object[] objArr = this.f3168c;
        int i11 = this.f3175j;
        ArrayList<C5296b> arrayList = this.f3169d;
        C5342v0 c5342v0 = this.f3166a;
        c5342v0.getClass();
        C5207g.m11111f(iArr, "groups");
        C5207g.m11111f(objArr, "slots");
        C5207g.m11111f(arrayList, "anchors");
        if (!c5342v0.f33629f) {
            throw new IllegalArgumentException("Unexpected writer close()".toString());
        }
        c5342v0.f33629f = false;
        c5342v0.f33624a = iArr;
        c5342v0.f33625b = i10;
        c5342v0.f33626c = objArr;
        c5342v0.f33627d = i11;
        c5342v0.f33631h = arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final int m1794g(int[] iArr, int i10) {
        if (i10 >= this.f3167b.length / 5) {
            return this.f3168c.length - this.f3176k;
        }
        int i11 = iArr[(i10 * 5) + 4];
        int i12 = this.f3176k;
        int length = this.f3168c.length;
        if (i11 < 0) {
            i11 = (length - i12) + i11 + 1;
        }
        return i11;
    }

    /* JADX INFO: renamed from: h */
    public final int m1795h(int i10) {
        return i10 < this.f3175j ? i10 : i10 + this.f3176k;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final void m1796i() {
        int i10 = 0;
        boolean z10 = this.f3178m > 0;
        int i11 = this.f3183r;
        int i12 = this.f3172g;
        int i13 = this.f3184s;
        int iM1801n = m1801n(i13);
        int i14 = this.f3179n;
        int i15 = i11 - i13;
        boolean zM416y = C0062b.m416y(this.f3167b, iM1801n);
        C5339u c5339u = this.f3182q;
        if (z10) {
            C0062b.m272H(iM1801n, i15, this.f3167b);
            C0062b.m276I(iM1801n, i14, this.f3167b);
            this.f3179n = c5339u.m11466c() + (zM416y ? 1 : i14);
            this.f3184s = m1774A(this.f3167b, i13);
            return;
        }
        if ((i11 != i12 ? 0 : 1) == 0) {
            ComposerKt.m1687c("Expected to be at the end of a group".toString());
            throw null;
        }
        int iM404v = C0062b.m404v(this.f3167b, iM1801n);
        int iM256D = C0062b.m256D(this.f3167b, iM1801n);
        C0062b.m272H(iM1801n, i15, this.f3167b);
        C0062b.m276I(iM1801n, i14, this.f3167b);
        int iM11466c = this.f3180o.m11466c();
        this.f3172g = ((this.f3167b.length / 5) - this.f3171f) - this.f3181p.m11466c();
        this.f3184s = iM11466c;
        int iM1774A = m1774A(this.f3167b, i13);
        int iM11466c2 = c5339u.m11466c();
        this.f3179n = iM11466c2;
        if (iM1774A == iM11466c) {
            if (!zM416y) {
                i10 = i14 - iM256D;
            }
            this.f3179n = iM11466c2 + i10;
            return;
        }
        int i16 = i15 - iM404v;
        int i17 = zM416y ? 0 : i14 - iM256D;
        if (i16 != 0 || i17 != 0) {
            while (iM1774A != 0 && iM1774A != iM11466c && (i17 != 0 || i16 != 0)) {
                int iM1801n2 = m1801n(iM1774A);
                if (i16 != 0) {
                    C0062b.m272H(iM1801n2, C0062b.m404v(this.f3167b, iM1801n2) + i16, this.f3167b);
                }
                if (i17 != 0) {
                    int[] iArr = this.f3167b;
                    C0062b.m276I(iM1801n2, C0062b.m256D(iArr, iM1801n2) + i17, iArr);
                }
                if (C0062b.m416y(this.f3167b, iM1801n2)) {
                    i17 = 0;
                }
                iM1774A = m1774A(this.f3167b, iM1774A);
            }
        }
        this.f3179n += i17;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final void m1797j() {
        int i10 = this.f3178m;
        if (!(i10 > 0)) {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
        int i11 = i10 - 1;
        this.f3178m = i11;
        if (i11 == 0) {
            if (this.f3182q.f33618a == this.f3180o.f33618a) {
                this.f3172g = ((this.f3167b.length / 5) - this.f3171f) - this.f3181p.m11466c();
            } else {
                ComposerKt.m1687c("startGroup/endGroup mismatch while inserting".toString());
                throw null;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: k */
    public final void m1798k(int i10) {
        boolean z10 = true;
        if (!(this.f3178m <= 0)) {
            ComposerKt.m1687c("Cannot call ensureStarted() while inserting".toString());
            throw null;
        }
        int i11 = this.f3184s;
        if (i11 != i10) {
            if (i10 < i11 || i10 >= this.f3172g) {
                z10 = false;
            }
            if (!z10) {
                ComposerKt.m1687c(("Started group at " + i10 + " must be a subgroup of the group at " + i11).toString());
                throw null;
            }
            int i12 = this.f3183r;
            int i13 = this.f3173h;
            int i14 = this.f3174i;
            this.f3183r = i10;
            m1782I();
            this.f3183r = i12;
            this.f3173h = i13;
            this.f3174i = i14;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1799l(int i10, int i11, int i12) {
        if (i10 >= this.f3170e) {
            i10 = -((m1800m() - i10) + 2);
        }
        while (i12 < i11) {
            this.f3167b[(m1801n(i12) * 5) + 2] = i10;
            int iM404v = C0062b.m404v(this.f3167b, m1801n(i12)) + i12;
            m1799l(i12, iM404v, i12 + 1);
            i12 = iM404v;
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m1800m() {
        return (this.f3167b.length / 5) - this.f3171f;
    }

    /* JADX INFO: renamed from: n */
    public final int m1801n(int i10) {
        return i10 < this.f3170e ? i10 : i10 + this.f3171f;
    }

    /* JADX INFO: renamed from: o */
    public final int m1802o(int i10) {
        return C0062b.m404v(this.f3167b, m1801n(i10));
    }

    /* JADX INFO: renamed from: p */
    public final boolean m1803p(int i10, int i11) {
        int length;
        int iM1802o;
        boolean z10 = false;
        if (i11 == this.f3184s) {
            length = this.f3172g;
        } else {
            C5339u c5339u = this.f3180o;
            int i12 = c5339u.f33618a;
            if (i11 > (i12 > 0 ? ((int[]) c5339u.f33619b)[i12 - 1] : 0)) {
                iM1802o = m1802o(i11);
            } else {
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        i13 = -1;
                        break;
                    }
                    if (((int[]) c5339u.f33619b)[i13] == i11) {
                        break;
                    }
                    i13++;
                }
                if (i13 < 0) {
                    iM1802o = m1802o(i11);
                } else {
                    length = ((this.f3167b.length / 5) - this.f3171f) - ((int[]) this.f3181p.f33619b)[i13];
                }
            }
            length = iM1802o + i11;
        }
        if (i10 > i11 && i10 < length) {
            z10 = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: q */
    public final void m1804q(int i10) {
        if (i10 > 0) {
            int i11 = this.f3183r;
            m1808v(i11);
            int i12 = this.f3170e;
            int i13 = this.f3171f;
            int[] iArr = this.f3167b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            int i15 = 0;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i16 = iMax - i14;
                C9322j.m17672Z(0, 0, i12 * 5, iArr, iArr2);
                C9322j.m17672Z((i12 + i16) * 5, (i13 + i12) * 5, length * 5, iArr, iArr2);
                this.f3167b = iArr2;
                i13 = i16;
            }
            int i17 = this.f3172g;
            if (i17 >= i12) {
                this.f3172g = i17 + i10;
            }
            int i18 = i12 + i10;
            this.f3170e = i18;
            this.f3171f = i13 - i10;
            int iM1794g = i14 > 0 ? m1794g(this.f3167b, m1801n(i11 + i10)) : 0;
            if (this.f3177l >= i12) {
                i15 = this.f3175j;
            }
            int i19 = this.f3176k;
            int length2 = this.f3168c.length;
            if (iM1794g > i15) {
                iM1794g = -(((length2 - i19) - iM1794g) + 1);
            }
            for (int i20 = i12; i20 < i18; i20++) {
                this.f3167b[(i20 * 5) + 4] = iM1794g;
            }
            int i21 = this.f3177l;
            if (i21 >= i12) {
                this.f3177l = i21 + i10;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1805r(int i10, int i11) {
        if (i10 > 0) {
            m1809w(this.f3173h, i11);
            int i12 = this.f3175j;
            int i13 = this.f3176k;
            if (i13 < i10) {
                Object[] objArr = this.f3168c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                C9322j.m17673a0(0, 0, i12, objArr, objArr2);
                C9322j.m17673a0(i12 + i16, i13 + i12, length, objArr, objArr2);
                this.f3168c = objArr2;
                i13 = i16;
            }
            int i17 = this.f3174i;
            if (i17 >= i12) {
                this.f3174i = i17 + i10;
            }
            this.f3175j = i12 + i10;
            this.f3176k = i13 - i10;
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m1806s(int i10) {
        return C0062b.m416y(this.f3167b, m1801n(i10));
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f3183r + " end=" + this.f3172g + " size = " + m1800m() + " gap=" + this.f3170e + '-' + (this.f3170e + this.f3171f) + ')';
    }

    /* JADX INFO: renamed from: u */
    public final void m1807u(C5342v0 c5342v0, int i10) {
        C5207g.m11111f(c5342v0, "table");
        ComposerKt.m1690f(this.f3178m > 0);
        if (i10 != 0 || this.f3183r != 0 || this.f3166a.f33625b != 0) {
            C0480e c0480eM11472l = c5342v0.m11472l();
            try {
                a.m1813a(c0480eM11472l, i10, this, true, true);
                c0480eM11472l.m1793f();
                return;
            } catch (Throwable th2) {
                c0480eM11472l.m1793f();
                throw th2;
            }
        }
        int[] iArr = this.f3167b;
        Object[] objArr = this.f3168c;
        ArrayList<C5296b> arrayList = this.f3169d;
        int[] iArr2 = c5342v0.f33624a;
        int i11 = c5342v0.f33625b;
        Object[] objArr2 = c5342v0.f33626c;
        int i12 = c5342v0.f33627d;
        this.f3167b = iArr2;
        this.f3168c = objArr2;
        this.f3169d = c5342v0.f33631h;
        this.f3170e = i11;
        this.f3171f = (iArr2.length / 5) - i11;
        this.f3175j = i12;
        this.f3176k = objArr2.length - i12;
        this.f3177l = i11;
        C5207g.m11111f(iArr, "groups");
        C5207g.m11111f(objArr, "slots");
        C5207g.m11111f(arrayList, "anchors");
        c5342v0.f33624a = iArr;
        c5342v0.f33625b = 0;
        c5342v0.f33626c = objArr;
        c5342v0.f33627d = 0;
        c5342v0.f33631h = arrayList;
    }

    /* JADX INFO: renamed from: v */
    public final void m1808v(int i10) {
        int i11;
        int i12 = this.f3171f;
        int i13 = this.f3170e;
        if (i13 != i10) {
            boolean z10 = true;
            if (!this.f3169d.isEmpty()) {
                int length = (this.f3167b.length / 5) - this.f3171f;
                if (i13 >= i10) {
                    for (int iM420z = C0062b.m420z(this.f3169d, i10, length); iM420z < this.f3169d.size(); iM420z++) {
                        C5296b c5296b = this.f3169d.get(iM420z);
                        C5207g.m11110e(c5296b, "anchors[index]");
                        C5296b c5296b2 = c5296b;
                        int i14 = c5296b2.f33569a;
                        if (i14 < 0) {
                            break;
                        }
                        c5296b2.f33569a = -(length - i14);
                    }
                } else {
                    for (int iM420z2 = C0062b.m420z(this.f3169d, i13, length); iM420z2 < this.f3169d.size(); iM420z2++) {
                        C5296b c5296b3 = this.f3169d.get(iM420z2);
                        C5207g.m11110e(c5296b3, "anchors[index]");
                        C5296b c5296b4 = c5296b3;
                        int i15 = c5296b4.f33569a;
                        if (i15 >= 0 || (i11 = i15 + length) >= i10) {
                            break;
                        }
                        c5296b4.f33569a = i11;
                    }
                }
            }
            if (i12 > 0) {
                int[] iArr = this.f3167b;
                int i16 = i10 * 5;
                int i17 = i12 * 5;
                int i18 = i13 * 5;
                if (i10 < i13) {
                    C9322j.m17672Z(i17 + i16, i16, i18, iArr, iArr);
                } else {
                    C9322j.m17672Z(i18, i18 + i17, i16 + i17, iArr, iArr);
                }
            }
            if (i10 < i13) {
                i13 = i10 + i12;
            }
            int length2 = this.f3167b.length / 5;
            if (i13 >= length2) {
                z10 = false;
            }
            ComposerKt.m1690f(z10);
            while (i13 < length2) {
                int i19 = (i13 * 5) + 2;
                int i20 = this.f3167b[i19];
                int iM1800m = i20 > -2 ? i20 : m1800m() + i20 + 2;
                if (iM1800m >= i10) {
                    iM1800m = -((m1800m() - iM1800m) + 2);
                }
                if (iM1800m != i20) {
                    this.f3167b[i19] = iM1800m;
                }
                i13++;
                if (i13 == i10) {
                    i13 += i12;
                }
            }
        }
        this.f3170e = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: w */
    public final void m1809w(int i10, int i11) {
        int i12 = this.f3176k;
        int i13 = this.f3175j;
        int i14 = this.f3177l;
        if (i13 != i10) {
            Object[] objArr = this.f3168c;
            if (i10 < i13) {
                C9322j.m17673a0(i10 + i12, i10, i13, objArr, objArr);
            } else {
                C9322j.m17673a0(i13, i13 + i12, i10 + i12, objArr, objArr);
            }
            C9322j.m17678f0(i10, i10 + i12, objArr);
        }
        int iMin = Math.min(i11 + 1, m1800m());
        if (i14 != iMin) {
            int length = this.f3168c.length - i12;
            if (iMin < i14) {
                int iM1801n = m1801n(iMin);
                int iM1801n2 = m1801n(i14);
                int i15 = this.f3170e;
                loop0: while (true) {
                    while (true) {
                        if (iM1801n >= iM1801n2) {
                            break loop0;
                        }
                        int[] iArr = this.f3167b;
                        int i16 = (iM1801n * 5) + 4;
                        int i17 = iArr[i16];
                        if (!(i17 >= 0)) {
                            ComposerKt.m1687c("Unexpected anchor value, expected a positive anchor".toString());
                            throw null;
                        }
                        iArr[i16] = -((length - i17) + 1);
                        iM1801n++;
                        if (iM1801n == i15) {
                            iM1801n += this.f3171f;
                        }
                    }
                }
            } else {
                int iM1801n3 = m1801n(i14);
                int iM1801n4 = m1801n(iMin);
                while (iM1801n3 < iM1801n4) {
                    int[] iArr2 = this.f3167b;
                    int i18 = (iM1801n3 * 5) + 4;
                    int i19 = iArr2[i18];
                    if (!(i19 < 0)) {
                        ComposerKt.m1687c("Unexpected anchor value, expected a negative anchor".toString());
                        throw null;
                    }
                    iArr2[i18] = i19 + length + 1;
                    iM1801n3++;
                    if (iM1801n3 == this.f3170e) {
                        iM1801n3 += this.f3171f;
                    }
                }
            }
            this.f3177l = iMin;
        }
        this.f3175j = i10;
    }

    /* JADX INFO: renamed from: x */
    public final void m1810x(C5296b c5296b, C0480e c0480e) {
        C5207g.m11111f(c5296b, "anchor");
        boolean z10 = true;
        ComposerKt.m1690f(c0480e.f3178m > 0);
        ComposerKt.m1690f(this.f3178m == 0);
        ComposerKt.m1690f(c5296b.m11434a());
        int iM1790c = m1790c(c5296b) + 1;
        int i10 = this.f3183r;
        ComposerKt.m1690f(i10 <= iM1790c && iM1790c < this.f3172g);
        int iM1812z = m1812z(iM1790c);
        int iM1802o = m1802o(iM1790c);
        int iM256D = m1806s(iM1790c) ? 1 : C0062b.m256D(this.f3167b, m1801n(iM1790c));
        a.m1813a(this, iM1790c, c0480e, false, false);
        m1786M(iM1812z);
        boolean z11 = iM256D > 0;
        while (iM1812z >= i10) {
            int iM1801n = m1801n(iM1812z);
            int[] iArr = this.f3167b;
            C0062b.m272H(iM1801n, C0062b.m404v(iArr, iM1801n) - iM1802o, iArr);
            if (z11) {
                if (C0062b.m416y(this.f3167b, iM1801n)) {
                    z11 = false;
                } else {
                    int[] iArr2 = this.f3167b;
                    C0062b.m276I(iM1801n, C0062b.m256D(iArr2, iM1801n) - iM256D, iArr2);
                }
            }
            iM1812z = m1812z(iM1812z);
        }
        if (z11) {
            if (this.f3179n < iM256D) {
                z10 = false;
            }
            ComposerKt.m1690f(z10);
            this.f3179n -= iM256D;
        }
    }

    /* JADX INFO: renamed from: y */
    public final Object m1811y(int i10) {
        int iM1801n = m1801n(i10);
        if (C0062b.m416y(this.f3167b, iM1801n)) {
            return this.f3168c[m1795h(m1794g(this.f3167b, iM1801n))];
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final int m1812z(int i10) {
        return m1774A(this.f3167b, i10);
    }
}
