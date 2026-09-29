package p000;

import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.layout.AbstractC0334a;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class j7a implements ht5 {

    /* JADX INFO: renamed from: a */
    public final k73 f45165a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3735wu f45166b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3457pe f45167c;

    /* JADX INFO: renamed from: d */
    public final int f45168d;

    /* JADX INFO: renamed from: e */
    public final float f45169e;

    /* JADX INFO: renamed from: f */
    public final t17 f45170f;

    public j7a(k73 k73Var, InterfaceC3735wu interfaceC3735wu, InterfaceC3457pe interfaceC3457pe, int i, float f, t17 t17Var) {
        this.f45165a = k73Var;
        this.f45166b = interfaceC3735wu;
        this.f45167c = interfaceC3457pe;
        this.f45168d = i;
        this.f45169e = f;
        this.f45170f = t17Var;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: a */
    public final int mo737a(aa4 aa4Var, List list, int i) {
        int size = list.size();
        int iMo1513p = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iMo1513p += ((ct5) list.get(i2)).mo1513p(i);
        }
        return iMo1513p;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, final long j) {
        int iM3801i;
        int i;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ct5 ct5Var = (ct5) list.get(i2);
            if (fa4.m11650l(l70.m15957t(ct5Var), "navigationIcon")) {
                final l87 l87VarMo1514r = ct5Var.mo1514r(bk1.m3794b(0, 0, 0, 0, 14, j));
                List list2 = list;
                int size2 = list2.size();
                int i3 = 0;
                while (i3 < size2) {
                    ct5 ct5Var2 = (ct5) list.get(i3);
                    if (fa4.m11650l(l70.m15957t(ct5Var2), "actionIcons")) {
                        final l87 l87VarMo1514r2 = ct5Var2.mo1514r(bk1.m3794b(0, 0, 0, 0, 14, j));
                        LayoutDirection layoutDirection = jt5Var.getLayoutDirection();
                        t17 t17Var = this.f45170f;
                        float fM21643u = AbstractC3584sr.m21643u(t17Var, layoutDirection);
                        float fM21642t = AbstractC3584sr.m21642t(t17Var, jt5Var.getLayoutDirection());
                        int iMax = Math.max(jt5Var.mo916w0(AbstractC0218a.f3367g), l87VarMo1514r.f49301a);
                        int i4 = Integer.MAX_VALUE;
                        if (bk1.m3801i(j) == Integer.MAX_VALUE) {
                            iM3801i = bk1.m3801i(j);
                        } else {
                            int iM3801i2 = (((bk1.m3801i(j) - iMax) - l87VarMo1514r2.f49301a) - jt5Var.mo916w0(fM21643u)) - jt5Var.mo916w0(fM21642t);
                            iM3801i = iM3801i2 < 0 ? 0 : iM3801i2;
                        }
                        int size3 = list2.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            ct5 ct5Var3 = (ct5) list.get(i5);
                            if (fa4.m11650l(l70.m15957t(ct5Var3), "title")) {
                                int i6 = i4;
                                final l87 l87VarMo1514r3 = ct5Var3.mo1514r(bk1.m3794b(0, iM3801i, 0, 0, 12, j));
                                iv3 iv3Var = AbstractC0334a.f4180b;
                                final int iMo1630V = l87VarMo1514r3.mo1630V(iv3Var) != Integer.MIN_VALUE ? l87VarMo1514r3.mo1630V(iv3Var) : 0;
                                float fMo169a = this.f45165a.mo169a();
                                int iM21693T = Float.isNaN(fMo169a) ? 0 : ss5.m21693T(fMo169a);
                                final int iMax2 = Math.max(jt5Var.mo916w0(this.f45169e), l87VarMo1514r3.f49302b) + jt5Var.mo916w0(t17Var.mo14021d()) + jt5Var.mo916w0(t17Var.mo14018a());
                                if (bk1.m3800h(j) == i6) {
                                    i = iMax2;
                                } else {
                                    int i7 = iM21693T + iMax2;
                                    i = i7 >= 0 ? i7 : 0;
                                }
                                int iMo916w0 = jt5Var.mo916w0(t17Var.mo14021d());
                                int iMo916w1 = jt5Var.mo916w0(t17Var.mo14018a());
                                final int iMo916w2 = jt5Var.mo916w0(AbstractC3584sr.m21643u(t17Var, jt5Var.getLayoutDirection()));
                                final int iMo916w3 = jt5Var.mo916w0(AbstractC3584sr.m21642t(t17Var, jt5Var.getLayoutDirection()));
                                final int i8 = (iMo916w0 + i) - iMo916w1;
                                return jt5Var.mo9895M0(bk1.m3801i(j), i, AbstractC3194a.m15360M(), new vi3() { // from class: i7a
                                    /* JADX WARN: Code duplicated, block: B:11:0x0059  */
                                    /* JADX WARN: Code duplicated, block: B:12:0x0060  */
                                    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
                                    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
                                    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
                                    /* JADX WARN: Code duplicated, block: B:19:0x007d  */
                                    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
                                    @Override // p000.vi3
                                    public final Object invoke(Object obj) {
                                        int iM3801i3;
                                        InterfaceC3735wu interfaceC3735wu;
                                        int iMax3;
                                        int i9;
                                        int i10;
                                        int i11;
                                        int i12;
                                        int i13;
                                        AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                                        l87 l87Var = l87VarMo1514r;
                                        int i14 = l87Var.f49302b;
                                        int i15 = i8;
                                        int i16 = iMo916w2;
                                        AbstractC0343j.m1521j(abstractC0343j, l87Var, i16, (i15 - i14) / 2);
                                        int iMax4 = Math.max(abstractC0343j.mo916w0(AbstractC0218a.f3367g), l87Var.f49301a);
                                        l87 l87Var2 = l87VarMo1514r2;
                                        int i17 = l87Var2.f49301a;
                                        j7a j7aVar = this;
                                        InterfaceC3457pe interfaceC3457pe = j7aVar.f45167c;
                                        l87 l87Var3 = l87VarMo1514r3;
                                        int i18 = l87Var3.f49301a;
                                        long j2 = j;
                                        int iMo4499a = interfaceC3457pe.mo4499a(i18, bk1.m3801i(j2), LayoutDirection.Ltr);
                                        if (iMo4499a >= iMax4) {
                                            if (l87Var3.f49301a + iMo4499a > bk1.m3801i(j2) - i17) {
                                                iM3801i3 = (bk1.m3801i(j2) - i17) - (l87Var3.f49301a + iMo4499a);
                                            }
                                            interfaceC3735wu = j7aVar.f45166b;
                                            if (interfaceC3735wu.equals(eh0.f37240f)) {
                                                iMax3 = (i15 - l87Var3.f49302b) / 2;
                                            } else if (interfaceC3735wu.equals(eh0.f37239e)) {
                                                i9 = j7aVar.f45168d;
                                                i10 = l87Var3.f49302b;
                                                if (i9 == 0) {
                                                    iMax3 = i15 - i10;
                                                } else {
                                                    i11 = i9 - (i10 - iMo1630V);
                                                    i12 = i11 + i10;
                                                    i13 = iMax2;
                                                    if (i12 > i13) {
                                                        i11 -= i12 - i13;
                                                    }
                                                    iMax3 = (i15 - i10) - Math.max(0, i11);
                                                }
                                            } else {
                                                iMax3 = 0;
                                            }
                                            AbstractC0343j.m1521j(abstractC0343j, l87Var3, iMo4499a, iMax3);
                                            AbstractC0343j.m1521j(abstractC0343j, l87Var2, (bk1.m3801i(j2) - l87Var2.f49301a) - iMo916w3, (i15 - l87Var2.f49302b) / 2);
                                            return xfa.f68157a;
                                        }
                                        iM3801i3 = iMax4 - iMo4499a;
                                        iMo4499a += iM3801i3 + i16;
                                        interfaceC3735wu = j7aVar.f45166b;
                                        if (interfaceC3735wu.equals(eh0.f37240f)) {
                                            iMax3 = (i15 - l87Var3.f49302b) / 2;
                                        } else if (interfaceC3735wu.equals(eh0.f37239e)) {
                                            i9 = j7aVar.f45168d;
                                            i10 = l87Var3.f49302b;
                                            if (i9 == 0) {
                                                iMax3 = i15 - i10;
                                            } else {
                                                i11 = i9 - (i10 - iMo1630V);
                                                i12 = i11 + i10;
                                                i13 = iMax2;
                                                if (i12 > i13) {
                                                    i11 -= i12 - i13;
                                                }
                                                iMax3 = (i15 - i10) - Math.max(0, i11);
                                            }
                                        } else {
                                            iMax3 = 0;
                                        }
                                        AbstractC0343j.m1521j(abstractC0343j, l87Var3, iMo4499a, iMax3);
                                        AbstractC0343j.m1521j(abstractC0343j, l87Var2, (bk1.m3801i(j2) - l87Var2.f49301a) - iMo916w3, (i15 - l87Var2.f49302b) / 2);
                                        return xfa.f68157a;
                                    }
                                });
                            }
                            i5++;
                            i4 = i4;
                            iM3801i = iM3801i;
                            this = this;
                        }
                        hg5.m13230b("Collection contains no element matching the predicate.");
                        C3386nv.m17631r();
                        return null;
                    }
                    i3++;
                    this = this;
                }
                hg5.m13230b("Collection contains no element matching the predicate.");
                C3386nv.m17631r();
                return null;
            }
        }
        hg5.m13230b("Collection contains no element matching the predicate.");
        C3386nv.m17631r();
        return null;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: c */
    public final int mo739c(aa4 aa4Var, List list, int i) {
        int size = list.size();
        int iMo1512l = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iMo1512l += ((ct5) list.get(i2)).mo1512l(i);
        }
        return iMo1512l;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: d */
    public final int mo740d(aa4 aa4Var, List list, int i) {
        Integer numValueOf;
        int iMo916w0 = aa4Var.mo916w0(this.f45169e);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((ct5) list.get(0)).mo1511c(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ct5) list.get(i2)).mo1511c(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iMo916w0, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: e */
    public final int mo741e(aa4 aa4Var, List list, int i) {
        Integer numValueOf;
        int iMo916w0 = aa4Var.mo916w0(this.f45169e);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((ct5) list.get(0)).mo1510U(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ct5) list.get(i2)).mo1510U(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iMo916w0, numValueOf != null ? numValueOf.intValue() : 0);
    }
}
