package p000;

import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t07 implements ht5 {

    /* JADX INFO: renamed from: a */
    public final vi3 f61717a;

    /* JADX INFO: renamed from: b */
    public final boolean f61718b;

    /* JADX INFO: renamed from: c */
    public final cv9 f61719c;

    /* JADX INFO: renamed from: d */
    public final su9 f61720d;

    /* JADX INFO: renamed from: e */
    public final su9 f61721e;

    /* JADX INFO: renamed from: f */
    public final su9 f61722f;

    /* JADX INFO: renamed from: g */
    public final t17 f61723g;

    /* JADX INFO: renamed from: h */
    public final float f61724h;

    public t07(vi3 vi3Var, boolean z, cv9 cv9Var, su9 su9Var, su9 su9Var2, su9 su9Var3, t17 t17Var, float f) {
        this.f61717a = vi3Var;
        this.f61718b = z;
        this.f61719c = cv9Var;
        this.f61720d = su9Var;
        this.f61721e = su9Var2;
        this.f61722f = su9Var3;
        this.f61723g = t17Var;
        this.f61724h = f;
    }

    /* JADX INFO: renamed from: j */
    public static final int m21807j(int i, t07 t07Var, int i2, int i3, l87 l87Var, l87 l87Var2) {
        if (t07Var.f61718b) {
            i3 = Math.round(((i2 - l87Var2.f49302b) / 2.0f) * 1.0f);
        }
        return Math.max(i + i3, (l87Var != null ? l87Var.f49302b : 0) / 2);
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: a */
    public final int mo737a(aa4 aa4Var, List list, int i) {
        return m21811i(aa4Var, list, i, new yu4(21));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v7 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final p000.it5 mo738b(p000.jt5 r44, java.util.List r45, long r46) {
        /*
            Method dump skipped, instruction units count: 1137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.t07.mo738b(jt5, java.util.List, long):it5");
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: c */
    public final int mo739c(aa4 aa4Var, List list, int i) {
        return m21811i(aa4Var, list, i, new yu4(23));
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: d */
    public final int mo740d(aa4 aa4Var, List list, int i) {
        return m21810h(aa4Var, list, i, new yu4(22));
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: e */
    public final int mo741e(aa4 aa4Var, List list, int i) {
        return m21810h(aa4Var, list, i, new yu4(20));
    }

    /* JADX INFO: renamed from: f */
    public final int m21808f(aa4 aa4Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int iM21690Q = ss5.m21690Q(new int[]{i7, i3, i4, AbstractC3423or.m18233R(i6, f, 0)}, i5);
        t17 t17Var = this.f61723g;
        float fMo912g0 = aa4Var.mo912g0(t17Var.mo14021d());
        return dk1.m10428f(Math.max(i, Math.max(i2, ss5.m21693T(AbstractC3423or.m18232Q(fMo912g0, Math.max(fMo912g0, i6 / 2.0f), f) + iM21690Q + aa4Var.mo912g0(t17Var.mo14018a())))) + i8, j);
    }

    /* JADX INFO: renamed from: g */
    public final int m21809g(aa4 aa4Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, AbstractC3423or.m18233R(i6, f, 0))) + i + i2;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        t17 t17Var = this.f61723g;
        return dk1.m10429g(Math.max(iMax, ss5.m21693T((i6 + aa4Var.mo912g0(t17Var.mo14020c(layoutDirection) + t17Var.mo14019b(layoutDirection))) * f)), j);
    }

    /* JADX INFO: renamed from: h */
    public final int m21810h(aa4 aa4Var, List list, int i, zi3 zi3Var) {
        Object obj;
        int iM13291b;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        int i2;
        Object obj6;
        Object obj7;
        t07 t07Var = this;
        float fMo169a = t07Var.f61720d.mo169a();
        List list2 = list;
        int size = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i3);
            if (fa4.m11650l(hid.m13290a((ct5) obj), "Leading")) {
                break;
            }
            i3++;
        }
        ct5 ct5Var = (ct5) obj;
        if (ct5Var != null) {
            iM13291b = hid.m13291b(i, ct5Var.mo1513p(Integer.MAX_VALUE));
            iIntValue = ((Number) zi3Var.invoke(ct5Var, Integer.valueOf(i))).intValue();
        } else {
            iM13291b = i;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (fa4.m11650l(hid.m13290a((ct5) obj2), "Trailing")) {
                break;
            }
            i4++;
        }
        ct5 ct5Var2 = (ct5) obj2;
        if (ct5Var2 != null) {
            iM13291b = hid.m13291b(iM13291b, ct5Var2.mo1513p(Integer.MAX_VALUE));
            iIntValue2 = ((Number) zi3Var.invoke(ct5Var2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i5);
            if (fa4.m11650l(hid.m13290a((ct5) obj3), "Label")) {
                break;
            }
            i5++;
        }
        Object obj8 = (ct5) obj3;
        int iIntValue5 = obj8 != null ? ((Number) zi3Var.invoke(obj8, Integer.valueOf(AbstractC3423or.m18233R(iM13291b, fMo169a, i)))).intValue() : 0;
        int size4 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i6);
            if (fa4.m11650l(hid.m13290a((ct5) obj4), "Prefix")) {
                break;
            }
            i6++;
        }
        ct5 ct5Var3 = (ct5) obj4;
        if (ct5Var3 != null) {
            iIntValue3 = ((Number) zi3Var.invoke(ct5Var3, Integer.valueOf(iM13291b))).intValue();
            iM13291b = hid.m13291b(iM13291b, ct5Var3.mo1513p(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i7);
            if (fa4.m11650l(hid.m13290a((ct5) obj5), "Suffix")) {
                break;
            }
            i7++;
        }
        ct5 ct5Var4 = (ct5) obj5;
        if (ct5Var4 != null) {
            iIntValue4 = ((Number) zi3Var.invoke(ct5Var4, Integer.valueOf(iM13291b))).intValue();
            iM13291b = hid.m13291b(iM13291b, ct5Var4.mo1513p(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list2.size();
        int i8 = 0;
        while (i8 < size6) {
            Object obj9 = list.get(i8);
            if (fa4.m11650l(hid.m13290a((ct5) obj9), "TextField")) {
                int iIntValue6 = ((Number) zi3Var.invoke(obj9, Integer.valueOf(iM13291b))).intValue();
                int size7 = list2.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        i2 = iIntValue6;
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i9);
                    i2 = iIntValue6;
                    if (fa4.m11650l(hid.m13290a((ct5) obj6), "Hint")) {
                        break;
                    }
                    i9++;
                    iIntValue6 = i2;
                }
                Object obj10 = (ct5) obj6;
                int iIntValue7 = obj10 != null ? ((Number) zi3Var.invoke(obj10, Integer.valueOf(iM13291b))).intValue() : 0;
                int size8 = list2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i10);
                    if (fa4.m11650l(hid.m13290a((ct5) obj7), "Supporting")) {
                        break;
                    }
                    i10++;
                }
                Object obj11 = (ct5) obj7;
                return t07Var.m21808f(aa4Var, iIntValue, iIntValue2, iIntValue3, iIntValue4, i2, iIntValue5, iIntValue7, obj11 != null ? ((Number) zi3Var.invoke(obj11, Integer.valueOf(i))).intValue() : 0, dk1.m10424b(0, 0, 0, 0, 15), fMo169a);
            }
            i8++;
            iIntValue3 = iIntValue3;
            t07Var = this;
        }
        hg5.m13230b("Collection contains no element matching the predicate.");
        C3386nv.m17631r();
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final int m21811i(aa4 aa4Var, List list, int i, zi3 zi3Var) {
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
                    if (fa4.m11650l(hid.m13290a((ct5) obj4), "Leading")) {
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
                    if (fa4.m11650l(hid.m13290a((ct5) obj5), "Prefix")) {
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
                    if (fa4.m11650l(hid.m13290a((ct5) obj6), "Suffix")) {
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
                return m21809g(aa4Var, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, ct5Var6 != null ? ((Number) zi3Var.invoke(ct5Var6, Integer.valueOf(i))).intValue() : 0, dk1.m10424b(0, 0, 0, 0, 15), this.f61720d.mo169a());
            }
        }
        hg5.m13230b("Collection contains no element matching the predicate.");
        C3386nv.m17631r();
        return 0;
    }
}
