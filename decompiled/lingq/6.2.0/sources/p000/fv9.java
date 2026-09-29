package p000;

import androidx.compose.material3.internal.AbstractC0246h;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes2.dex */
public final class fv9 implements ht5 {

    /* JADX INFO: renamed from: a */
    public final boolean f39762a;

    /* JADX INFO: renamed from: b */
    public final cv9 f39763b;

    /* JADX INFO: renamed from: c */
    public final su9 f39764c;

    /* JADX INFO: renamed from: d */
    public final su9 f39765d;

    /* JADX INFO: renamed from: e */
    public final su9 f39766e;

    /* JADX INFO: renamed from: f */
    public final t17 f39767f;

    /* JADX INFO: renamed from: g */
    public final float f39768g;

    public fv9(boolean z, cv9 cv9Var, su9 su9Var, su9 su9Var2, su9 su9Var3, t17 t17Var, float f) {
        this.f39762a = z;
        this.f39763b = cv9Var;
        this.f39764c = su9Var;
        this.f39765d = su9Var2;
        this.f39766e = su9Var3;
        this.f39767f = t17Var;
        this.f39768g = f;
    }

    /* JADX INFO: renamed from: h */
    public static int m12213h(List list, int i, zi3 zi3Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (fa4.m11650l(hid.m13290a((ct5) obj7), "TextField")) {
                int iIntValue = ((Number) zi3Var.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (fa4.m11650l(hid.m13290a((ct5) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                ct5 ct5Var = (ct5) obj2;
                int iIntValue2 = ct5Var != null ? ((Number) zi3Var.invoke(ct5Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (fa4.m11650l(hid.m13290a((ct5) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                ct5 ct5Var2 = (ct5) obj3;
                int iIntValue3 = ct5Var2 != null ? ((Number) zi3Var.invoke(ct5Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (fa4.m11650l(hid.m13290a((ct5) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                ct5 ct5Var3 = (ct5) obj4;
                int iIntValue4 = ct5Var3 != null ? ((Number) zi3Var.invoke(ct5Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (fa4.m11650l(hid.m13290a((ct5) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                ct5 ct5Var4 = (ct5) obj5;
                int iIntValue5 = ct5Var4 != null ? ((Number) zi3Var.invoke(ct5Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list2.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (fa4.m11650l(hid.m13290a((ct5) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                ct5 ct5Var5 = (ct5) obj6;
                int iIntValue6 = ct5Var5 != null ? ((Number) zi3Var.invoke(ct5Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list2.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    Object obj8 = list.get(i8);
                    if (fa4.m11650l(hid.m13290a((ct5) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                ct5 ct5Var6 = (ct5) obj;
                int i9 = iIntValue4 + iIntValue5;
                return dk1.m10429g(Math.max(iIntValue + i9, Math.max((ct5Var6 != null ? ((Number) zi3Var.invoke(ct5Var6, Integer.valueOf(i))).intValue() : 0) + i9, iIntValue2)) + iIntValue6 + iIntValue3, dk1.m10424b(0, 0, 0, 0, 15));
            }
        }
        hg5.m13230b("Collection contains no element matching the predicate.");
        C3386nv.m17631r();
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static final int m12214i(fv9 fv9Var, int i, int i2, l87 l87Var) {
        return fv9Var.f39762a ? Math.round(((i - l87Var.f49302b) / 2.0f) * 1.0f) : i2;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: a */
    public final int mo737a(aa4 aa4Var, List list, int i) {
        return m12213h(list, i, new cx7(12));
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(final jt5 jt5Var, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        l87 l87Var;
        Object obj4;
        int i;
        l87 l87VarMo1514r;
        l87 l87Var2;
        Object obj5;
        int i2;
        Object obj6;
        Object obj7;
        l87 l87Var3;
        int i3;
        Ref$ObjectRef ref$ObjectRef;
        int i4;
        float f;
        int i5;
        int i6;
        float fMo169a = this.f39764c.mo169a();
        t17 t17Var = this.f39767f;
        final int iMo916w0 = jt5Var.mo916w0(t17Var.mo14021d());
        int iMo916w1 = jt5Var.mo916w0(t17Var.mo14018a());
        long jM3794b = bk1.m3794b(0, 0, 0, 0, 10, j);
        List list2 = list;
        int size = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i7);
            if (fa4.m11650l(l70.m15957t((ct5) obj), "Leading")) {
                break;
            }
            i7++;
        }
        ct5 ct5Var = (ct5) obj;
        l87 l87VarMo1514r2 = ct5Var != null ? ct5Var.mo1514r(jM3794b) : null;
        int i8 = l87VarMo1514r2 != null ? l87VarMo1514r2.f49301a : 0;
        int iMax = Math.max(0, l87VarMo1514r2 != null ? l87VarMo1514r2.f49302b : 0);
        int size2 = list2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i9);
            if (fa4.m11650l(l70.m15957t((ct5) obj2), "Trailing")) {
                break;
            }
            i9++;
        }
        ct5 ct5Var2 = (ct5) obj2;
        l87 l87VarMo1514r3 = ct5Var2 != null ? ct5Var2.mo1514r(dk1.m10432j(-i8, 0, 2, jM3794b)) : null;
        int i10 = i8 + (l87VarMo1514r3 != null ? l87VarMo1514r3.f49301a : 0);
        int iMax2 = Math.max(iMax, l87VarMo1514r3 != null ? l87VarMo1514r3.f49302b : 0);
        int size3 = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i11);
            if (fa4.m11650l(l70.m15957t((ct5) obj3), "Prefix")) {
                break;
            }
            i11++;
        }
        ct5 ct5Var3 = (ct5) obj3;
        l87 l87VarMo1514r4 = ct5Var3 != null ? ct5Var3.mo1514r(dk1.m10432j(-i10, 0, 2, jM3794b)) : null;
        int i12 = i10 + (l87VarMo1514r4 != null ? l87VarMo1514r4.f49301a : 0);
        int iMax3 = Math.max(iMax2, l87VarMo1514r4 != null ? l87VarMo1514r4.f49302b : 0);
        int size4 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size4) {
                l87Var = l87VarMo1514r3;
                obj4 = null;
                break;
            }
            obj4 = list.get(i13);
            l87Var = l87VarMo1514r3;
            if (fa4.m11650l(l70.m15957t((ct5) obj4), "Suffix")) {
                break;
            }
            i13++;
            l87VarMo1514r3 = l87Var;
        }
        ct5 ct5Var4 = (ct5) obj4;
        if (ct5Var4 != null) {
            i = 0;
            l87VarMo1514r = ct5Var4.mo1514r(dk1.m10432j(-i12, 0, 2, jM3794b));
        } else {
            i = 0;
            l87VarMo1514r = null;
        }
        int i14 = i12 + (l87VarMo1514r != null ? l87VarMo1514r.f49301a : i);
        int iMax4 = Math.max(iMax3, l87VarMo1514r != null ? l87VarMo1514r.f49302b : i);
        int size5 = list2.size();
        int i15 = i;
        while (true) {
            if (i15 >= size5) {
                l87Var2 = l87VarMo1514r;
                obj5 = null;
                break;
            }
            obj5 = list.get(i15);
            l87Var2 = l87VarMo1514r;
            if (fa4.m11650l(l70.m15957t((ct5) obj5), "Label")) {
                break;
            }
            i15++;
            l87VarMo1514r = l87Var2;
        }
        ct5 ct5Var5 = (ct5) obj5;
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        int i16 = -i14;
        ref$ObjectRef2.f47718a = ct5Var5 != null ? ct5Var5.mo1514r(dk1.m10431i(jM3794b, i16, -iMo916w1)) : null;
        int size6 = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size6) {
                i2 = iMo916w1;
                obj6 = null;
                break;
            }
            obj6 = list.get(i17);
            i2 = iMo916w1;
            if (fa4.m11650l(l70.m15957t((ct5) obj6), "Supporting")) {
                break;
            }
            i17++;
            iMo916w1 = i2;
        }
        ct5 ct5Var6 = (ct5) obj6;
        int iMo1510U = ct5Var6 != null ? ct5Var6.mo1510U(bk1.m3803k(j)) : 0;
        l87 l87Var4 = (l87) ref$ObjectRef2.f47718a;
        int i18 = (l87Var4 != null ? l87Var4.f49302b : 0) + iMo916w0;
        final l87 l87Var5 = l87Var;
        long j2 = jM3794b;
        l87 l87Var6 = l87Var2;
        ct5 ct5Var7 = ct5Var6;
        final l87 l87Var7 = l87VarMo1514r2;
        Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef2;
        long jM10431i = dk1.m10431i(bk1.m3794b(0, 0, 0, 0, 11, j), i16, ((-i18) - i2) - iMo1510U);
        int size7 = list2.size();
        int i19 = 0;
        while (i19 < size7) {
            ct5 ct5Var8 = (ct5) list.get(i19);
            if (fa4.m11650l(l70.m15957t(ct5Var8), "TextField")) {
                l87 l87VarMo1514r5 = ct5Var8.mo1514r(jM10431i);
                long jM3794b2 = bk1.m3794b(0, 0, 0, 0, 14, jM10431i);
                List list3 = list;
                int size8 = list3.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i20);
                    if (fa4.m11650l(l70.m15957t((ct5) obj7), "Hint")) {
                        break;
                    }
                    i20++;
                }
                ct5 ct5Var9 = (ct5) obj7;
                l87 l87VarMo1514r6 = ct5Var9 != null ? ct5Var9.mo1514r(jM3794b2) : null;
                int iMax5 = Math.max(iMax4, Math.max(l87VarMo1514r5.f49302b, l87VarMo1514r6 != null ? l87VarMo1514r6.f49302b : 0) + i18 + i2);
                int i21 = l87Var7 != null ? l87Var7.f49301a : 0;
                int i22 = l87Var5 != null ? l87Var5.f49301a : 0;
                int i23 = l87VarMo1514r4 != null ? l87VarMo1514r4.f49301a : 0;
                int i24 = l87Var6 != null ? l87Var6.f49301a : 0;
                int i25 = l87VarMo1514r5.f49301a;
                l87 l87Var8 = (l87) ref$ObjectRef3.f47718a;
                int i26 = i23 + i24;
                final int iM10429g = dk1.m10429g(Math.max(i25 + i26, Math.max((l87VarMo1514r6 != null ? l87VarMo1514r6.f49301a : 0) + i26, l87Var8 != null ? l87Var8.f49301a : 0)) + i21 + i22, j);
                l87 l87VarMo1514r7 = ct5Var7 != null ? ct5Var7.mo1514r(bk1.m3794b(0, iM10429g, 0, 0, 9, dk1.m10432j(0, -iMax5, 1, j2))) : null;
                int i27 = l87VarMo1514r7 != null ? l87VarMo1514r7.f49302b : 0;
                int i28 = l87VarMo1514r5.f49302b;
                l87 l87Var9 = (l87) ref$ObjectRef3.f47718a;
                int i29 = l87Var9 != null ? l87Var9.f49302b : 0;
                int i30 = l87Var7 != null ? l87Var7.f49302b : 0;
                int i31 = l87Var5 != null ? l87Var5.f49302b : 0;
                int i32 = l87VarMo1514r4 != null ? l87VarMo1514r4.f49302b : 0;
                final l87 l87Var10 = l87VarMo1514r4;
                if (l87Var6 != null) {
                    i3 = l87Var6.f49302b;
                    l87Var3 = l87VarMo1514r5;
                } else {
                    l87Var3 = l87VarMo1514r5;
                    i3 = 0;
                }
                final l87 l87Var11 = l87Var3;
                if (l87VarMo1514r6 != null) {
                    i4 = l87VarMo1514r6.f49302b;
                    ref$ObjectRef = ref$ObjectRef3;
                } else {
                    ref$ObjectRef = ref$ObjectRef3;
                    i4 = 0;
                }
                if (l87VarMo1514r7 != null) {
                    f = fMo169a;
                    i5 = l87VarMo1514r7.f49302b;
                    i6 = 0;
                } else {
                    f = fMo169a;
                    i5 = 0;
                    i6 = 0;
                }
                final int iM12215f = m12215f(jt5Var, i28, i29, i30, i31, i32, i3, i4, i5, j, f);
                final int i33 = iM12215f - i27;
                int size9 = list3.size();
                for (int i34 = i6; i34 < size9; i34++) {
                    ct5 ct5Var10 = (ct5) list.get(i34);
                    if (fa4.m11650l(l70.m15957t(ct5Var10), "Container")) {
                        final l87 l87VarMo1514r8 = ct5Var10.mo1514r(dk1.m10423a(iM10429g != 2147483647 ? iM10429g : i6, iM10429g, i33 != Integer.MAX_VALUE ? i33 : i6, i33));
                        final l87 l87Var12 = l87VarMo1514r6;
                        final Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef;
                        final l87 l87Var13 = l87VarMo1514r7;
                        final float f2 = f;
                        final l87 l87Var14 = l87Var6;
                        return jt5Var.mo9895M0(iM10429g, iM12215f, AbstractC3194a.m15360M(), new vi3() { // from class: ev9
                            /* JADX WARN: Code duplicated, block: B:20:0x009a  */
                            @Override // p000.vi3
                            public final Object invoke(Object obj8) {
                                int i35;
                                int iMo916w2;
                                int i36;
                                l87 l87Var15;
                                int i37;
                                fv9 fv9Var = this;
                                final su9 su9Var = fv9Var.f39766e;
                                final su9 su9Var2 = fv9Var.f39765d;
                                AbstractC0343j abstractC0343j = (AbstractC0343j) obj8;
                                Ref$ObjectRef ref$ObjectRef5 = ref$ObjectRef4;
                                Object obj9 = ref$ObjectRef5.f47718a;
                                int i38 = iM10429g;
                                int i39 = iM12215f;
                                l87 l87Var16 = l87Var11;
                                l87 l87Var17 = l87Var12;
                                l87 l87Var18 = l87Var7;
                                l87 l87Var19 = l87Var5;
                                l87 l87Var20 = l87Var10;
                                l87 l87Var21 = l87Var14;
                                l87 l87Var22 = l87VarMo1514r8;
                                l87 l87Var23 = l87Var13;
                                if (obj9 != null) {
                                    boolean z = fv9Var.f39762a;
                                    int i40 = iMo916w0;
                                    if (z) {
                                        iMo916w2 = Math.round(((i33 - ((l87) obj9).f49302b) / 2.0f) * 1.0f);
                                    } else {
                                        iMo916w2 = abstractC0343j.mo916w0(fv9Var.f39768g) + i40;
                                    }
                                    l87 l87Var24 = (l87) ref$ObjectRef5.f47718a;
                                    int i41 = l87Var24.f49302b + i40;
                                    LayoutDirection layoutDirection = jt5Var.getLayoutDirection();
                                    cv9 cv9Var = fv9Var.f39763b;
                                    abstractC0343j.m1530f(l87Var22, 0, 0, 0.0f);
                                    int i42 = i39 - (l87Var23 != null ? l87Var23.f49302b : 0);
                                    if (l87Var18 != null) {
                                        AbstractC0343j.m1521j(abstractC0343j, l87Var18, 0, Math.round(((i42 - l87Var18.f49302b) / 2.0f) * 1.0f));
                                    }
                                    float f3 = f2;
                                    int iM18233R = AbstractC3423or.m18233R(iMo916w2, f3, i40);
                                    if (layoutDirection == LayoutDirection.Ltr) {
                                        if (l87Var18 != null) {
                                            i36 = l87Var18.f49301a;
                                        } else {
                                            i36 = 0;
                                        }
                                    } else if (l87Var19 != null) {
                                        i36 = l87Var19.f49301a;
                                    } else {
                                        i36 = 0;
                                    }
                                    abstractC0343j.m1530f(l87Var24, AbstractC3423or.m18233R(cv9Var.f34615b.mo4499a(l87Var24.f49301a, (i38 - (l87Var18 != null ? l87Var18.f49301a : 0)) - (l87Var19 != null ? l87Var19.f49301a : 0), layoutDirection) + i36, f3, ((ec0) AbstractC0246h.m1171f(cv9Var)).mo4499a(l87Var24.f49301a, (i38 - (l87Var18 != null ? l87Var18.f49301a : 0)) - (l87Var19 != null ? l87Var19.f49301a : 0), layoutDirection) + i36), iM18233R, 0.0f);
                                    if (l87Var20 != null) {
                                        final int i43 = 1;
                                        l87Var15 = l87Var20;
                                        i37 = i41;
                                        AbstractC0343j.m1522l(abstractC0343j, l87Var15, l87Var18 != null ? l87Var18.f49301a : 0, i37, new vi3() { // from class: dv9
                                            @Override // p000.vi3
                                            public final Object invoke(Object obj10) {
                                                int i44 = i43;
                                                xfa xfaVar = xfa.f68157a;
                                                su9 su9Var3 = su9Var;
                                                q98 q98Var = (q98) obj10;
                                                switch (i44) {
                                                    case 0:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 1:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 2:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 3:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 4:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    default:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                }
                                                return xfaVar;
                                            }
                                        }, 4);
                                    } else {
                                        l87Var15 = l87Var20;
                                        i37 = i41;
                                    }
                                    int i44 = (l87Var18 != null ? l87Var18.f49301a : 0) + (l87Var15 != null ? l87Var15.f49301a : 0);
                                    AbstractC0343j.m1521j(abstractC0343j, l87Var16, i44, i37);
                                    if (l87Var17 != null) {
                                        final int i45 = 2;
                                        AbstractC0343j.m1522l(abstractC0343j, l87Var17, i44, i37, new vi3() { // from class: dv9
                                            @Override // p000.vi3
                                            public final Object invoke(Object obj10) {
                                                int i46 = i45;
                                                xfa xfaVar = xfa.f68157a;
                                                su9 su9Var3 = su9Var2;
                                                q98 q98Var = (q98) obj10;
                                                switch (i46) {
                                                    case 0:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 1:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 2:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 3:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 4:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    default:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                }
                                                return xfaVar;
                                            }
                                        }, 4);
                                    }
                                    if (l87Var21 != null) {
                                        final int i46 = 3;
                                        AbstractC0343j.m1522l(abstractC0343j, l87Var21, (i38 - (l87Var19 != null ? l87Var19.f49301a : 0)) - l87Var21.f49301a, i37, new vi3() { // from class: dv9
                                            @Override // p000.vi3
                                            public final Object invoke(Object obj10) {
                                                int i47 = i46;
                                                xfa xfaVar = xfa.f68157a;
                                                su9 su9Var3 = su9Var;
                                                q98 q98Var = (q98) obj10;
                                                switch (i47) {
                                                    case 0:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 1:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 2:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 3:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 4:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    default:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                }
                                                return xfaVar;
                                            }
                                        }, 4);
                                    }
                                    if (l87Var19 != null) {
                                        AbstractC0343j.m1521j(abstractC0343j, l87Var19, i38 - l87Var19.f49301a, Math.round(((i42 - l87Var19.f49302b) / 2.0f) * 1.0f));
                                    }
                                    if (l87Var23 != 0) {
                                        AbstractC0343j.m1521j(abstractC0343j, l87Var23, 0, i42);
                                    }
                                } else {
                                    float fMo594a = abstractC0343j.mo594a();
                                    AbstractC0343j.m1520i(abstractC0343j, l87Var22, 0L);
                                    int i47 = i39 - (l87Var23 != null ? l87Var23.f49302b : 0);
                                    int iM21693T = ss5.m21693T(fv9Var.f39767f.mo14021d() * fMo594a);
                                    if (l87Var18 != null) {
                                        AbstractC0343j.m1521j(abstractC0343j, l87Var18, 0, Math.round(((i47 - l87Var18.f49302b) / 2.0f) * 1.0f));
                                    }
                                    if (l87Var20 != null) {
                                        int i48 = l87Var18 != null ? l87Var18.f49301a : 0;
                                        int iM12214i = fv9.m12214i(fv9Var, i47, iM21693T, l87Var20);
                                        final int i49 = 4;
                                        vi3 vi3Var = new vi3() { // from class: dv9
                                            @Override // p000.vi3
                                            public final Object invoke(Object obj10) {
                                                int i410 = i49;
                                                xfa xfaVar = xfa.f68157a;
                                                su9 su9Var3 = su9Var;
                                                q98 q98Var = (q98) obj10;
                                                switch (i410) {
                                                    case 0:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 1:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 2:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 3:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 4:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    default:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                }
                                                return xfaVar;
                                            }
                                        };
                                        i35 = iM21693T;
                                        abstractC0343j = abstractC0343j;
                                        AbstractC0343j.m1522l(abstractC0343j, l87Var20, i48, iM12214i, vi3Var, 4);
                                    } else {
                                        i35 = iM21693T;
                                    }
                                    int i50 = (l87Var18 != null ? l87Var18.f49301a : 0) + (l87Var20 != null ? l87Var20.f49301a : 0);
                                    AbstractC0343j.m1521j(abstractC0343j, l87Var16, i50, fv9.m12214i(fv9Var, i47, i35, l87Var16));
                                    if (l87Var17 != null) {
                                        final int i51 = 5;
                                        AbstractC0343j.m1522l(abstractC0343j, l87Var17, i50, fv9.m12214i(fv9Var, i47, i35, l87Var17), new vi3() { // from class: dv9
                                            @Override // p000.vi3
                                            public final Object invoke(Object obj10) {
                                                int i410 = i51;
                                                xfa xfaVar = xfa.f68157a;
                                                su9 su9Var3 = su9Var2;
                                                q98 q98Var = (q98) obj10;
                                                switch (i410) {
                                                    case 0:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 1:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 2:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 3:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 4:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    default:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                }
                                                return xfaVar;
                                            }
                                        }, 4);
                                    }
                                    if (l87Var21 != null) {
                                        final int i52 = 0;
                                        AbstractC0343j.m1522l(abstractC0343j, l87Var21, (i38 - (l87Var19 != null ? l87Var19.f49301a : 0)) - l87Var21.f49301a, fv9.m12214i(fv9Var, i47, i35, l87Var21), new vi3() { // from class: dv9
                                            @Override // p000.vi3
                                            public final Object invoke(Object obj10) {
                                                int i410 = i52;
                                                xfa xfaVar = xfa.f68157a;
                                                su9 su9Var3 = su9Var;
                                                q98 q98Var = (q98) obj10;
                                                switch (i410) {
                                                    case 0:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 1:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 2:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 3:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    case 4:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                    default:
                                                        q98Var.m19813c(su9Var3.mo169a());
                                                        break;
                                                }
                                                return xfaVar;
                                            }
                                        }, 4);
                                    }
                                    if (l87Var19 != null) {
                                        AbstractC0343j.m1521j(abstractC0343j, l87Var19, i38 - l87Var19.f49301a, Math.round(((i47 - l87Var19.f49302b) / 2.0f) * 1.0f));
                                    }
                                    if (r0 != 0) {
                                        AbstractC0343j.m1521j(abstractC0343j, l87Var23, 0, i47);
                                    }
                                }
                                return xfa.f68157a;
                            }
                        });
                    }
                }
                hg5.m13230b("Collection contains no element matching the predicate.");
                C3386nv.m17631r();
                return null;
            }
            i19++;
            ct5Var7 = ct5Var7;
            l87VarMo1514r4 = l87VarMo1514r4;
            l87Var6 = l87Var6;
            ref$ObjectRef3 = ref$ObjectRef3;
            j2 = j2;
        }
        hg5.m13230b("Collection contains no element matching the predicate.");
        C3386nv.m17631r();
        return null;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: c */
    public final int mo739c(aa4 aa4Var, List list, int i) {
        return m12213h(list, i, new cx7(11));
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: d */
    public final int mo740d(aa4 aa4Var, List list, int i) {
        return m12216g(aa4Var, list, i, new cx7(14));
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: e */
    public final int mo741e(aa4 aa4Var, List list, int i) {
        return m12216g(aa4Var, list, i, new cx7(13));
    }

    /* JADX INFO: renamed from: f */
    public final int m12215f(aa4 aa4Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        t17 t17Var = this.f39767f;
        return dk1.m10428f(Math.max(i3, Math.max(i4, aa4Var.mo916w0(t17Var.mo14018a() + t17Var.mo14021d()) + (i2 > 0 ? Math.max(aa4Var.mo916w0(this.f39768g * 2.0f), AbstractC3423or.m18233R(0, u36.f63351a.mo12780a(f), i2)) : 0) + ss5.m21690Q(new int[]{i7, i5, i6, AbstractC3423or.m18233R(i2, f, 0)}, i))) + i8, j);
    }

    /* JADX INFO: renamed from: g */
    public final int m12216g(aa4 aa4Var, List list, int i, zi3 zi3Var) {
        Object obj;
        int i2;
        int iM13291b;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i3;
        Object obj5;
        int i4;
        Object obj6;
        Object obj7;
        List list2 = list;
        int size = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (fa4.m11650l(hid.m13290a((ct5) obj), "Leading")) {
                break;
            }
            i5++;
        }
        ct5 ct5Var = (ct5) obj;
        if (ct5Var != null) {
            i2 = i;
            iM13291b = hid.m13291b(i2, ct5Var.mo1513p(Integer.MAX_VALUE));
            iIntValue = ((Number) zi3Var.invoke(ct5Var, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            iM13291b = i2;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (fa4.m11650l(hid.m13290a((ct5) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        ct5 ct5Var2 = (ct5) obj2;
        if (ct5Var2 != null) {
            iM13291b = hid.m13291b(iM13291b, ct5Var2.mo1513p(Integer.MAX_VALUE));
            iIntValue2 = ((Number) zi3Var.invoke(ct5Var2, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (fa4.m11650l(hid.m13290a((ct5) obj3), "Label")) {
                break;
            }
            i7++;
        }
        Object obj8 = (ct5) obj3;
        int iIntValue3 = obj8 != null ? ((Number) zi3Var.invoke(obj8, Integer.valueOf(iM13291b))).intValue() : 0;
        int size4 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (fa4.m11650l(hid.m13290a((ct5) obj4), "Prefix")) {
                break;
            }
            i8++;
        }
        ct5 ct5Var3 = (ct5) obj4;
        if (ct5Var3 != null) {
            int iIntValue4 = ((Number) zi3Var.invoke(ct5Var3, Integer.valueOf(iM13291b))).intValue();
            iM13291b = hid.m13291b(iM13291b, ct5Var3.mo1513p(Integer.MAX_VALUE));
            i3 = iIntValue4;
        } else {
            i3 = 0;
        }
        int size5 = list2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            if (fa4.m11650l(hid.m13290a((ct5) obj5), "Suffix")) {
                break;
            }
            i9++;
        }
        ct5 ct5Var4 = (ct5) obj5;
        if (ct5Var4 != null) {
            int iIntValue5 = ((Number) zi3Var.invoke(ct5Var4, Integer.valueOf(iM13291b))).intValue();
            iM13291b = hid.m13291b(iM13291b, ct5Var4.mo1513p(Integer.MAX_VALUE));
            i4 = iIntValue5;
        } else {
            i4 = 0;
        }
        int size6 = list2.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj9 = list.get(i10);
            if (fa4.m11650l(hid.m13290a((ct5) obj9), "TextField")) {
                int iIntValue6 = ((Number) zi3Var.invoke(obj9, Integer.valueOf(iM13291b))).intValue();
                int size7 = list2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i11);
                    if (fa4.m11650l(hid.m13290a((ct5) obj6), "Hint")) {
                        break;
                    }
                    i11++;
                }
                Object obj10 = (ct5) obj6;
                int iIntValue7 = obj10 != null ? ((Number) zi3Var.invoke(obj10, Integer.valueOf(iM13291b))).intValue() : 0;
                int size8 = list2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i12);
                    if (fa4.m11650l(hid.m13290a((ct5) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i12++;
                }
                Object obj12 = (ct5) obj7;
                return m12215f(aa4Var, iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i4, iIntValue7, obj12 != null ? ((Number) zi3Var.invoke(obj12, Integer.valueOf(i2))).intValue() : 0, dk1.m10424b(0, 0, 0, 0, 15), this.f39764c.mo169a());
            }
        }
        hg5.m13230b("Collection contains no element matching the predicate.");
        C3386nv.m17631r();
        return 0;
    }
}
