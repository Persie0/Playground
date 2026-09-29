package androidx.compose.material3;

import androidx.compose.p002ui.layout.AbstractC0334a;
import androidx.compose.p002ui.layout.AbstractC0343j;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import p000.aa4;
import p000.bk1;
import p000.ct5;
import p000.d32;
import p000.dk1;
import p000.hid;
import p000.it5;
import p000.jt5;
import p000.l87;
import p000.of5;
import p000.p46;
import p000.u91;
import p000.vi3;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.material3.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C0263t implements p46 {
    /* JADX INFO: renamed from: f */
    public static int m1201f(aa4 aa4Var, ArrayList arrayList, int i, zi3 zi3Var) {
        int iIntValue;
        int iIntValue2;
        int i2;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        float f = of5.f54273a;
        int iM13291b = hid.m13291b(i, aa4Var.mo916w0(32.0f));
        ct5 ct5Var = (ct5) u91.m22591I0(list4);
        if (ct5Var != null) {
            iIntValue = ((Number) zi3Var.invoke(ct5Var, Integer.valueOf(iM13291b))).intValue();
            iM13291b = hid.m13291b(iM13291b, ct5Var.mo1513p(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        ct5 ct5Var2 = (ct5) u91.m22591I0(list5);
        if (ct5Var2 != null) {
            iIntValue2 = ((Number) zi3Var.invoke(ct5Var2, Integer.valueOf(iM13291b))).intValue();
            iM13291b = hid.m13291b(iM13291b, ct5Var2.mo1513p(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        Object obj = (ct5) u91.m22591I0(list2);
        int iIntValue3 = obj != null ? ((Number) zi3Var.invoke(obj, Integer.valueOf(iM13291b))).intValue() : 0;
        Object obj2 = (ct5) u91.m22591I0(list);
        int iIntValue4 = obj2 != null ? ((Number) zi3Var.invoke(obj2, Integer.valueOf(iM13291b))).intValue() : 0;
        Object obj3 = (ct5) u91.m22591I0(list3);
        int iIntValue5 = obj3 != null ? ((Number) zi3Var.invoke(obj3, Integer.valueOf(iM13291b))).intValue() : 0;
        boolean z = iIntValue5 > aa4Var.mo913q0(d32.m10018P(30));
        boolean z2 = iIntValue3 > 0;
        boolean z3 = iIntValue5 > 0;
        if ((z2 && z3) || z) {
            i2 = 3;
        } else {
            i2 = (z2 || z3) ? 2 : 1;
        }
        return of5.m17962d(aa4Var, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, i2, aa4Var.mo916w0((i2 == 3 ? 12.0f : 8.0f) * 2.0f), dk1.m10424b(0, 0, 0, 0, 15));
    }

    /* JADX INFO: renamed from: g */
    public static int m1202g(aa4 aa4Var, ArrayList arrayList, int i, zi3 zi3Var) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        ct5 ct5Var = (ct5) u91.m22591I0(list4);
        int iIntValue = ct5Var != null ? ((Number) zi3Var.invoke(ct5Var, Integer.valueOf(i))).intValue() : 0;
        ct5 ct5Var2 = (ct5) u91.m22591I0(list5);
        int iIntValue2 = ct5Var2 != null ? ((Number) zi3Var.invoke(ct5Var2, Integer.valueOf(i))).intValue() : 0;
        ct5 ct5Var3 = (ct5) u91.m22591I0(list);
        int iIntValue3 = ct5Var3 != null ? ((Number) zi3Var.invoke(ct5Var3, Integer.valueOf(i))).intValue() : 0;
        ct5 ct5Var4 = (ct5) u91.m22591I0(list2);
        int iIntValue4 = ct5Var4 != null ? ((Number) zi3Var.invoke(ct5Var4, Integer.valueOf(i))).intValue() : 0;
        ct5 ct5Var5 = (ct5) u91.m22591I0(list3);
        int iIntValue5 = ct5Var5 != null ? ((Number) zi3Var.invoke(ct5Var5, Integer.valueOf(i))).intValue() : 0;
        float f = of5.f54273a;
        int iMo916w0 = aa4Var.mo916w0(32.0f);
        long jM10424b = dk1.m10424b(0, 0, 0, 0, 15);
        if (bk1.m3797e(jM10424b)) {
            return bk1.m3801i(jM10424b);
        }
        return iMo916w0 + iIntValue + Math.max(iIntValue3, Math.max(iIntValue4, iIntValue5)) + iIntValue2;
    }

    @Override // p000.p46
    /* JADX INFO: renamed from: a */
    public final int mo1203a(aa4 aa4Var, List list, int i) {
        return m1202g(aa4Var, (ArrayList) list, i, ListItemMeasurePolicy$maxIntrinsicWidth$1.f3211i);
    }

    @Override // p000.p46
    /* JADX INFO: renamed from: b */
    public final it5 mo1204b(jt5 jt5Var, List list, long j) {
        int i;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        List list6 = (List) arrayList.get(4);
        long jM3794b = bk1.m3794b(0, 0, 0, 0, 10, j);
        float f = of5.f54273a;
        int iMo916w0 = jt5Var.mo916w0(32.0f);
        ct5 ct5Var = (ct5) u91.m22591I0(list5);
        int iMo1512l = ct5Var != null ? ct5Var.mo1512l(bk1.m3800h(j)) : 0;
        ct5 ct5Var2 = (ct5) u91.m22591I0(list6);
        int iM13291b = hid.m13291b(bk1.m3801i(jM3794b), iMo1512l + (ct5Var2 != null ? ct5Var2.mo1512l(bk1.m3800h(j)) : 0) + iMo916w0);
        ct5 ct5Var3 = (ct5) u91.m22591I0(list4);
        long jM10431i = dk1.m10431i(jM3794b, -iMo916w0, -jt5Var.mo916w0(((((u91.m22591I0(list3) != null) && (u91.m22591I0(list4) != null)) || ((ct5Var3 != null ? ct5Var3.mo1510U(iM13291b) : 0) > jt5Var.mo913q0(d32.m10018P(30)))) ? 12.0f : 8.0f) * 2.0f));
        ct5 ct5Var4 = (ct5) u91.m22591I0(list5);
        l87 l87VarMo1514r = ct5Var4 != null ? ct5Var4.mo1514r(jM10431i) : null;
        int i2 = l87VarMo1514r != null ? l87VarMo1514r.f49301a : 0;
        ct5 ct5Var5 = (ct5) u91.m22591I0(list6);
        l87 l87VarMo1514r2 = ct5Var5 != null ? ct5Var5.mo1514r(dk1.m10432j(-i2, 0, 2, jM10431i)) : null;
        int i3 = i2 + (l87VarMo1514r2 != null ? l87VarMo1514r2.f49301a : 0);
        ct5 ct5Var6 = (ct5) u91.m22591I0(list2);
        l87 l87VarMo1514r3 = ct5Var6 != null ? ct5Var6.mo1514r(dk1.m10432j(-i3, 0, 2, jM10431i)) : null;
        int i4 = l87VarMo1514r3 != null ? l87VarMo1514r3.f49302b : 0;
        ct5 ct5Var7 = (ct5) u91.m22591I0(list4);
        l87 l87VarMo1514r4 = ct5Var7 != null ? ct5Var7.mo1514r(dk1.m10431i(jM10431i, -i3, -i4)) : null;
        int i5 = i4 + (l87VarMo1514r4 != null ? l87VarMo1514r4.f49302b : 0);
        boolean z = (l87VarMo1514r4 == null || l87VarMo1514r4.mo1630V(AbstractC0334a.f4179a) == l87VarMo1514r4.mo1630V(AbstractC0334a.f4180b)) ? false : true;
        ct5 ct5Var8 = (ct5) u91.m22591I0(list3);
        l87 l87VarMo1514r5 = ct5Var8 != null ? ct5Var8.mo1514r(dk1.m10431i(jM10431i, -i3, -i5)) : null;
        boolean z2 = l87VarMo1514r5 != null;
        boolean z3 = l87VarMo1514r4 != null;
        if ((z2 && z3) || z) {
            i = 3;
        } else {
            i = (z2 || z3) ? 2 : 1;
        }
        float f2 = i == 3 ? 12.0f : 8.0f;
        float f3 = f2 * 2.0f;
        final int iM3801i = bk1.m3797e(j) ? bk1.m3801i(j) : iMo916w0 + (l87VarMo1514r != null ? l87VarMo1514r.f49301a : 0) + Math.max(l87VarMo1514r3 != null ? l87VarMo1514r3.f49301a : 0, Math.max(l87VarMo1514r5 != null ? l87VarMo1514r5.f49301a : 0, l87VarMo1514r4 != null ? l87VarMo1514r4.f49301a : 0)) + (l87VarMo1514r2 != null ? l87VarMo1514r2.f49301a : 0);
        final l87 l87Var = l87VarMo1514r5;
        float f4 = f2;
        final int iM17962d = of5.m17962d(jt5Var, l87VarMo1514r != null ? l87VarMo1514r.f49302b : 0, l87VarMo1514r2 != null ? l87VarMo1514r2.f49302b : 0, l87VarMo1514r3 != null ? l87VarMo1514r3.f49302b : 0, l87VarMo1514r5 != null ? l87VarMo1514r5.f49302b : 0, l87VarMo1514r4 != null ? l87VarMo1514r4.f49302b : 0, i, jt5Var.mo916w0(f3), j);
        final boolean z4 = i == 3;
        final int iMo916w1 = jt5Var.mo916w0(16.0f);
        final int iMo916w2 = jt5Var.mo916w0(16.0f);
        final int iMo916w3 = jt5Var.mo916w0(f4);
        final l87 l87Var2 = l87VarMo1514r2;
        final l87 l87Var3 = l87VarMo1514r3;
        final l87 l87Var4 = l87VarMo1514r4;
        final l87 l87Var5 = l87VarMo1514r;
        return jt5Var.mo9895M0(iM3801i, iM17962d, AbstractC3194a.m15360M(), new vi3() { // from class: kf5
            @Override // p000.vi3
            public final Object invoke(Object obj) {
                int iRound;
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                l87 l87Var6 = l87Var5;
                int i6 = iMo916w1;
                boolean z5 = z4;
                int iRound2 = iMo916w3;
                int i7 = iM17962d;
                if (l87Var6 != null) {
                    AbstractC0343j.m1521j(abstractC0343j, l87Var6, i6, z5 ? iRound2 : Math.round(((i7 - l87Var6.f49302b) / 2.0f) * 1.0f));
                }
                int i8 = i6 + (l87Var6 != null ? l87Var6.f49301a : 0);
                l87 l87Var7 = l87Var3;
                l87 l87Var8 = l87Var;
                l87 l87Var9 = l87Var4;
                if (z5) {
                    iRound = iRound2;
                } else {
                    iRound = Math.round(((i7 - (((l87Var7 != null ? l87Var7.f49302b : 0) + (l87Var8 != null ? l87Var8.f49302b : 0)) + (l87Var9 != null ? l87Var9.f49302b : 0))) / 2.0f) * 1.0f);
                }
                if (l87Var8 != null) {
                    AbstractC0343j.m1521j(abstractC0343j, l87Var8, i8, iRound);
                }
                int i9 = iRound + (l87Var8 != null ? l87Var8.f49302b : 0);
                if (l87Var7 != null) {
                    AbstractC0343j.m1521j(abstractC0343j, l87Var7, i8, i9);
                }
                int i10 = i9 + (l87Var7 != null ? l87Var7.f49302b : 0);
                if (l87Var9 != null) {
                    AbstractC0343j.m1521j(abstractC0343j, l87Var9, i8, i10);
                }
                l87 l87Var10 = l87Var2;
                if (l87Var10 != null) {
                    int i11 = (iM3801i - iMo916w2) - l87Var10.f49301a;
                    if (!z5) {
                        iRound2 = Math.round(((i7 - l87Var10.f49302b) / 2.0f) * 1.0f);
                    }
                    AbstractC0343j.m1521j(abstractC0343j, l87Var10, i11, iRound2);
                }
                return xfa.f68157a;
            }
        });
    }

    @Override // p000.p46
    /* JADX INFO: renamed from: c */
    public final int mo1205c(aa4 aa4Var, List list, int i) {
        return m1202g(aa4Var, (ArrayList) list, i, ListItemMeasurePolicy$minIntrinsicWidth$1.f3213i);
    }

    @Override // p000.p46
    /* JADX INFO: renamed from: d */
    public final int mo1206d(aa4 aa4Var, List list, int i) {
        return m1201f(aa4Var, (ArrayList) list, i, ListItemMeasurePolicy$maxIntrinsicHeight$1.f3210i);
    }

    @Override // p000.p46
    /* JADX INFO: renamed from: e */
    public final int mo1207e(aa4 aa4Var, List list, int i) {
        return m1201f(aa4Var, (ArrayList) list, i, ListItemMeasurePolicy$minIntrinsicHeight$1.f3212i);
    }
}
