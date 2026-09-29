package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.foundation.lazy.layout.C0135d;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class gv4 implements bu4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0127b f41375a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f41376b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t17 f41377c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f41378d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC3735wu f41379e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC3624tu f41380f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ un1 f41381g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ qp3 f41382h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ gz8 f41383i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC3457pe f41384j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ fc0 f41385k;

    public gv4(C0127b c0127b, boolean z, t17 t17Var, zg4 zg4Var, InterfaceC3735wu interfaceC3735wu, InterfaceC3624tu interfaceC3624tu, un1 un1Var, qp3 qp3Var, gz8 gz8Var, InterfaceC3457pe interfaceC3457pe, fc0 fc0Var) {
        this.f41375a = c0127b;
        this.f41376b = z;
        this.f41377c = t17Var;
        this.f41378d = zg4Var;
        this.f41379e = interfaceC3735wu;
        this.f41380f = interfaceC3624tu;
        this.f41381g = un1Var;
        this.f41382h = qp3Var;
        this.f41383i = gz8Var;
        this.f41384j = interfaceC3457pe;
        this.f41385k = fc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:307:0x070d  */
    /* JADX WARN: Code duplicated, block: B:321:0x0763  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f3  */
    @Override // p000.bu4
    /* JADX INFO: renamed from: a */
    public final it5 mo1021a(cu4 cu4Var, long j) {
        float fMo9967a;
        C0127b c0127b;
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM14158m;
        iv4 iv4Var;
        boolean z;
        int i6;
        List arrayList;
        int i7;
        boolean z2;
        ArrayList arrayList2;
        int i8;
        long j3;
        int i9;
        wu4 wu4Var;
        int i10;
        boolean z3;
        int i11;
        int i12;
        C0135d c0135d;
        int i13;
        int i14;
        int i15;
        Integer numValueOf;
        hv4 hv4Var;
        qm9 qm9Var;
        int[] iArr;
        int i16;
        int iM10429g;
        qm9 qm9Var2 = cu4Var.f34541b;
        C0127b c0127b2 = this.f41375a;
        c0127b2.f2455t.getValue();
        boolean z4 = c0127b2.f2437b || qm9Var2.mo211f0();
        boolean z5 = this.f41376b;
        thb.m22047f(j, z5 ? Orientation.Vertical : Orientation.Horizontal);
        t17 t17Var = this.f41377c;
        int iMo916w0 = z5 ? qm9Var2.mo916w0(t17Var.mo14019b(qm9Var2.getLayoutDirection())) : qm9Var2.mo916w0(AbstractC3584sr.m21643u(t17Var, qm9Var2.getLayoutDirection()));
        int iMo916w1 = z5 ? qm9Var2.mo916w0(t17Var.mo14020c(qm9Var2.getLayoutDirection())) : qm9Var2.mo916w0(AbstractC3584sr.m21642t(t17Var, qm9Var2.getLayoutDirection()));
        int iMo916w2 = qm9Var2.mo916w0(t17Var.mo14021d());
        int iMo916w3 = qm9Var2.mo916w0(t17Var.mo14018a()) + iMo916w2;
        int i17 = iMo916w0 + iMo916w1;
        int i18 = z5 ? iMo916w3 : i17;
        int i19 = z5 ? iMo916w2 : !z5 ? iMo916w0 : iMo916w1;
        int i20 = i18 - i19;
        long jM10431i = dk1.m10431i(j, -i17, -iMo916w3);
        wu4 wu4Var2 = (wu4) this.f41378d.mo0a();
        ft4 ft4Var = wu4Var2.f67300c;
        int iM3801i = bk1.m3801i(jM10431i);
        int iM3800h = bk1.m3800h(jM10431i);
        ft4Var.f39615a.m21223i(iM3801i);
        ft4Var.f39616b.m21223i(iM3800h);
        InterfaceC3624tu interfaceC3624tu = this.f41380f;
        InterfaceC3735wu interfaceC3735wu = this.f41379e;
        if (z5) {
            if (interfaceC3735wu == null) {
                throw wq1.m24126v("null verticalArrangement when isVertical == true");
            }
            fMo9967a = interfaceC3735wu.m24157a();
        } else {
            if (interfaceC3624tu == null) {
                throw wq1.m24126v("null horizontalAlignment when isVertical == false");
            }
            fMo9967a = interfaceC3624tu.mo9967a();
        }
        int iMo916w4 = qm9Var2.mo916w0(fMo9967a);
        int iMo15745a = wu4Var2.mo15745a();
        int iM3800h2 = z5 ? bk1.m3800h(j) - iMo916w3 : bk1.m3801i(j) - i17;
        int i21 = i19;
        fv4 fv4Var = new fv4(jM10431i, this.f41376b, wu4Var2, cu4Var, iMo15745a, iMo916w4, this.f41384j, this.f41385k, i21, i20, (((long) iMo916w0) << 32) | (((long) iMo916w2) & 4294967295L), this.f41375a);
        int i22 = i21;
        jc9 jc9VarM16139y = lda.m16139y();
        Integer numValueOf2 = null;
        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
        try {
            int iM978h = c0127b2.m978h();
            ws4 ws4Var = c0127b2.f2440e;
            int iM19375m = pk9.m19375m(iM978h, wu4Var2, ws4Var.f67248e);
            if (iM978h != iM19375m) {
                ws4Var.f67245b.m21223i(iM19375m);
                ws4Var.f67249f.m11342c(iM978h);
            }
            int iM979i = c0127b2.m979i();
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            List listM10531g = do7.m10531g(wu4Var2, c0127b2.f2454s, c0127b2.f2451p);
            float fFloatValue = (qm9Var2.mo211f0() || !z4) ? c0127b2.f2443h : ((Number) ((xc9) c0127b2.f2459x.f2565b.f8704b).getValue()).floatValue();
            C0135d c0135d2 = c0127b2.f2450o;
            boolean zMo211f0 = qm9Var2.mo211f0();
            t66 t66Var = c0127b2.f2458w;
            boolean z6 = c0127b2.f2444i;
            if (i22 < 0) {
                l54.m15814a("invalid beforeContentPadding");
            }
            if (r1 < 0) {
                l54.m15814a("invalid afterContentPadding");
            }
            wu4 wu4Var3 = fv4Var.f39738b;
            int i23 = iM979i;
            int i24 = iM19375m;
            boolean z7 = this.f41376b;
            un1 un1Var = this.f41381g;
            qp3 qp3Var = this.f41382h;
            EmptyList emptyList = EmptyList.f47638a;
            if (iMo15745a <= 0) {
                int iM3803k = bk1.m3803k(jM10431i);
                int iM3802j = bk1.m3802j(jM10431i);
                c0135d2.m1011d(0, iM3803k, iM3802j, new ArrayList(), wu4Var3.f67301d, fv4Var, z7, zMo211f0, 1, z4, 0, 0, un1Var, qp3Var);
                if (zMo211f0) {
                    iM10429g = iM3803k;
                } else {
                    long jM1010b = c0135d2.m1010b();
                    if (n84.m17279a(jM1010b, 0L)) {
                        iM10429g = iM3803k;
                    } else {
                        iM10429g = dk1.m10429g((int) (jM1010b >> 32), jM10431i);
                        iM3802j = dk1.m10428f((int) (jM1010b & 4294967295L), jM10431i);
                    }
                }
                qm9Var = qm9Var2;
                c0127b = c0127b2;
                hv4Var = new hv4(null, 0, false, 0.0f, qm9Var2.mo9895M0(dk1.m10429g(iM10429g + i17, j), dk1.m10428f(iM3802j + iMo916w3, j), AbstractC3194a.m15360M(), new C2951e4(29)), 0.0f, false, un1Var, cu4Var, fv4Var.f39740d, emptyList, -i22, iM3800h2 + r1, 0, z7 ? Orientation.Vertical : Orientation.Horizontal, i20, iMo916w4);
            } else {
                int i25 = iMo15745a;
                c0127b = c0127b2;
                if (i24 >= i25) {
                    i24 = i25 - 1;
                    i23 = 0;
                }
                int iRound = Math.round(fFloatValue);
                int i26 = i23 - iRound;
                if (i24 == 0 && i26 < 0) {
                    iRound += i26;
                    i26 = 0;
                }
                C0825bv c0825bv = new C0825bv();
                int i27 = -i22;
                int i28 = (iMo916w4 < 0 ? iMo916w4 : 0) + i27;
                float f = fFloatValue;
                int iM14158m2 = i26 + i28;
                int i29 = i24;
                int iMax = 0;
                while (true) {
                    j2 = fv4Var.f39740d;
                    if (iM14158m2 >= 0 || i29 <= 0) {
                        break;
                    }
                    int i30 = i27;
                    int i31 = i29 - 1;
                    iv4 iv4VarM12210E = fv4Var.m12210E(i31, j2);
                    c0825bv.add(0, iv4VarM12210E);
                    iMax = Math.max(iMax, iv4VarM12210E.f44668u);
                    iM14158m2 += iv4VarM12210E.m14158m();
                    i29 = i31;
                    i27 = i30;
                }
                int i32 = i27;
                if (iM14158m2 < i28) {
                    iRound -= i28 - iM14158m2;
                    iM14158m2 = i28;
                }
                int i33 = iRound;
                int i34 = iM14158m2 - i28;
                int i35 = iM3800h2 + r1;
                int i36 = i35 >= 0 ? i35 : 0;
                int i37 = iMax;
                int i38 = -i34;
                int i39 = i29;
                int i40 = 0;
                boolean z8 = false;
                while (i40 < c0825bv.f9041c) {
                    if (i38 >= i36) {
                        c0825bv.mo4183f(i40);
                        z8 = true;
                    } else {
                        i39++;
                        int iM14158m3 = ((iv4) c0825bv.get(i40)).m14158m() + i38;
                        i40++;
                        i38 = iM14158m3;
                    }
                }
                int iMax2 = i37;
                int iM14158m4 = i34;
                int i41 = i39;
                boolean z9 = z8;
                while (i41 < i25 && (i38 < i36 || i38 <= 0 || c0825bv.isEmpty())) {
                    int i42 = i25;
                    iv4 iv4VarM12210E2 = fv4Var.m12210E(i41, j2);
                    int iM14158m5 = iv4VarM12210E2.m14158m() + i38;
                    if (iM14158m5 <= i28) {
                        i16 = iM14158m5;
                        if (i41 != i42 - 1) {
                            i29 = i41 + 1;
                            iM14158m4 -= iv4VarM12210E2.m14158m();
                            z9 = true;
                        }
                        i41++;
                        i25 = i42;
                        i38 = i16;
                    } else {
                        i16 = iM14158m5;
                    }
                    int iMax3 = Math.max(iMax2, iv4VarM12210E2.f44668u);
                    c0825bv.addLast(iv4VarM12210E2);
                    iMax2 = iMax3;
                    i41++;
                    i25 = i42;
                    i38 = i16;
                }
                int i43 = i25;
                if (i38 < iM3800h2) {
                    int i44 = iM3800h2 - i38;
                    int i45 = i38 + i44;
                    iM14158m = iM14158m4 - i44;
                    while (iM14158m < i22 && i29 > 0) {
                        int i46 = i29 - 1;
                        int i47 = i45;
                        iv4 iv4VarM12210E3 = fv4Var.m12210E(i46, j2);
                        c0825bv.add(0, iv4VarM12210E3);
                        iMax2 = Math.max(iMax2, iv4VarM12210E3.f44668u);
                        iM14158m += iv4VarM12210E3.m14158m();
                        i29 = i46;
                        i45 = i47;
                        i22 = i22;
                    }
                    int i48 = i45;
                    i = i22;
                    i2 = i33;
                    int i49 = i2 + i44;
                    if (iM14158m < 0) {
                        i3 = i48 + iM14158m;
                        i5 = i29;
                        i4 = i49 + iM14158m;
                        iM14158m = 0;
                    } else {
                        i5 = i29;
                        i3 = i48;
                        i4 = i49;
                    }
                } else {
                    i = i22;
                    i2 = i33;
                    i3 = i38;
                    i4 = i2;
                    i5 = i29;
                    iM14158m = iM14158m4;
                }
                int i50 = iMax2;
                int i51 = i41;
                float f2 = (Integer.signum(Math.round(f)) != Integer.signum(i4) || Math.abs(Math.round(f)) < Math.abs(i4)) ? f : i4;
                float f3 = f - f2;
                float f4 = 0.0f;
                if (zMo211f0 && i4 > i2 && f3 <= 0.0f) {
                    f4 = (i4 - i2) + f3;
                }
                if (iM14158m < 0) {
                    l54.m15814a("negative currentFirstItemScrollOffset");
                }
                int i52 = -iM14158m;
                iv4 iv4Var2 = (iv4) c0825bv.first();
                if (i > 0 || iMo916w4 < 0) {
                    int iMo4182d = c0825bv.mo4182d();
                    int i53 = iM14158m;
                    iv4 iv4Var3 = iv4Var2;
                    int i54 = 0;
                    while (true) {
                        if (i54 < iMo4182d) {
                            iv4Var = iv4Var3;
                            int iM14158m6 = ((iv4) c0825bv.get(i54)).m14158m();
                            if (i53 != 0 && iM14158m6 <= i53) {
                                z = true;
                                if (i54 == c0825bv.mo4182d() - 1) {
                                    break;
                                }
                                i53 -= iM14158m6;
                                i54++;
                                iv4Var3 = (iv4) c0825bv.get(i54);
                            }
                        } else {
                            iv4Var = iv4Var3;
                        }
                        z = true;
                        break;
                    }
                    iM14158m = i53;
                    iv4Var2 = iv4Var;
                } else {
                    z = true;
                }
                int iMax4 = Math.max(0, i5);
                int i55 = i5 - 1;
                if (iMax4 <= i55) {
                    List arrayList3 = null;
                    while (true) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList = arrayList3;
                        i6 = iM14158m;
                        arrayList.add(fv4Var.m12210E(i55, j2));
                        if (i55 == iMax4) {
                            break;
                        }
                        i55--;
                        iM14158m = i6;
                        arrayList3 = arrayList;
                    }
                } else {
                    i6 = iM14158m;
                    arrayList = null;
                }
                List list = listM10531g;
                int size = list.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i56 = size - 1;
                        int iIntValue = ((Number) listM10531g.get(size)).intValue();
                        if (iIntValue < iMax4) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(fv4Var.m12210E(iIntValue, j2));
                        }
                        if (i56 < 0) {
                            break;
                        }
                        size = i56;
                    }
                }
                if (arrayList == null) {
                    arrayList = emptyList;
                }
                List list2 = arrayList;
                int size2 = list2.size();
                int iMax5 = i50;
                for (int i57 = 0; i57 < size2; i57++) {
                    iMax5 = Math.max(iMax5, ((iv4) arrayList.get(i57)).f44668u);
                }
                int iMin = Math.min(((iv4) u91.m22597O0(c0825bv)).f44648a, i43 - 1);
                int i58 = ((iv4) u91.m22597O0(c0825bv)).f44648a + 1;
                if (i58 <= iMin) {
                    ArrayList arrayList4 = null;
                    while (true) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        i7 = iMax5;
                        arrayList2 = arrayList4;
                        z2 = z7;
                        arrayList2.add(fv4Var.m12210E(i58, j2));
                        if (i58 == iMin) {
                            break;
                        }
                        i58++;
                        z7 = z2;
                        arrayList4 = arrayList2;
                        iMax5 = i7;
                    }
                } else {
                    i7 = iMax5;
                    z2 = z7;
                    arrayList2 = null;
                }
                if (arrayList2 != null && ((iv4) u91.m22597O0(arrayList2)).f44648a > iMin) {
                    iMin = ((iv4) u91.m22597O0(arrayList2)).f44648a;
                }
                int size3 = list.size();
                List arrayList5 = arrayList2;
                int i59 = 0;
                while (i59 < size3) {
                    int i60 = i59;
                    int iIntValue2 = ((Number) listM10531g.get(i59)).intValue();
                    if (iIntValue2 > iMin) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(fv4Var.m12210E(iIntValue2, j2));
                    }
                    i59 = i60 + 1;
                }
                if (arrayList5 == null) {
                    arrayList5 = emptyList;
                }
                List list3 = arrayList5;
                int size4 = list3.size();
                int iMax6 = i7;
                for (int i61 = 0; i61 < size4; i61++) {
                    iMax6 = Math.max(iMax6, ((iv4) arrayList5.get(i61)).f44668u);
                }
                boolean z10 = (fa4.m11650l(iv4Var2, c0825bv.first()) && arrayList.isEmpty() && arrayList5.isEmpty()) ? z : false;
                int iM10429g2 = dk1.m10429g(z2 ? iMax6 : i3, jM10431i);
                if (z2) {
                    iMax6 = i3;
                }
                int iM10428f = dk1.m10428f(iMax6, jM10431i);
                int i62 = z2 ? iM10428f : iM10429g2;
                boolean z11 = i3 < Math.min(i62, iM3800h2) ? z : false;
                if (z11 && i52 != 0) {
                    l54.m15816c("non-zero itemsScrollOffset");
                }
                boolean z12 = z11;
                ArrayList arrayList6 = new ArrayList(arrayList5.size() + arrayList.size() + c0825bv.mo4182d());
                if (z12) {
                    if (!arrayList.isEmpty() || !arrayList5.isEmpty()) {
                        l54.m15814a("no extra items");
                    }
                    int iMo4182d2 = c0825bv.mo4182d();
                    int[] iArr2 = new int[iMo4182d2];
                    int i63 = 0;
                    while (i63 < iMo4182d2) {
                        iArr2[i63] = ((iv4) c0825bv.get(i63)).f44663p;
                        i63++;
                        iM10428f = iM10428f;
                    }
                    int i64 = iM10428f;
                    int[] iArr3 = new int[iMo4182d2];
                    if (z2) {
                        if (interfaceC3735wu == null) {
                            throw wq1.m24126v("null verticalArrangement when isVertical == true");
                        }
                        interfaceC3735wu.mo10843k(cu4Var, i62, iArr2, iArr3);
                        j3 = jM10431i;
                        iArr = iArr3;
                    } else {
                        if (interfaceC3624tu == null) {
                            throw wq1.m24126v("null horizontalArrangement when isVertical == false");
                        }
                        iArr = iArr3;
                        j3 = jM10431i;
                        interfaceC3624tu.mo9968j(cu4Var, i62, iArr2, LayoutDirection.Ltr, iArr);
                    }
                    i84 i84VarM20840h0 = AbstractC3550rv.m20840h0(iArr);
                    int i65 = i84VarM20840h0.f40380b;
                    int i66 = i84VarM20840h0.f40381c;
                    if ((i66 > 0 && i65 >= 0) || (i66 < 0 && i65 <= 0)) {
                        int i67 = 0;
                        while (true) {
                            int i68 = iArr[i67];
                            iv4 iv4Var4 = (iv4) c0825bv.get(i67);
                            iv4Var4.m14160o(i68, iM10429g2, i64);
                            arrayList6.add(iv4Var4);
                            if (i67 == i65) {
                                break;
                            }
                            i67 += i66;
                        }
                    }
                    i8 = i64;
                } else {
                    i8 = iM10428f;
                    j3 = jM10431i;
                    int size5 = list2.size();
                    int iM14158m7 = i52;
                    for (int i69 = 0; i69 < size5; i69++) {
                        iv4 iv4Var5 = (iv4) arrayList.get(i69);
                        iM14158m7 -= iv4Var5.m14158m();
                        iv4Var5.m14160o(iM14158m7, iM10429g2, i8);
                        arrayList6.add(iv4Var5);
                    }
                    int iMo4182d3 = c0825bv.mo4182d();
                    int iM14158m8 = i52;
                    for (int i70 = 0; i70 < iMo4182d3; i70++) {
                        iv4 iv4Var6 = (iv4) c0825bv.get(i70);
                        iv4Var6.m14160o(iM14158m8, iM10429g2, i8);
                        arrayList6.add(iv4Var6);
                        iM14158m8 += iv4Var6.m14158m();
                    }
                    int size6 = list3.size();
                    for (int i71 = 0; i71 < size6; i71++) {
                        iv4 iv4Var7 = (iv4) arrayList5.get(i71);
                        iv4Var7.m14160o(iM14158m8, iM10429g2, i8);
                        arrayList6.add(iv4Var7);
                        iM14158m8 += iv4Var7.m14158m();
                    }
                }
                if (z6) {
                    i9 = iM10429g2;
                    wu4Var = wu4Var3;
                    i10 = i51;
                    z3 = z2;
                    i11 = i8;
                    i12 = i3;
                    c0135d = c0135d2;
                    i13 = i6;
                } else {
                    i9 = iM10429g2;
                    wu4Var = wu4Var3;
                    i10 = i51;
                    int i72 = i3;
                    c0135d = c0135d2;
                    int i73 = i6;
                    z3 = z2;
                    i11 = i8;
                    c0135d.m1011d((int) f2, i9, i11, arrayList6, wu4Var3.f67301d, fv4Var, z3, zMo211f0, 1, z4, i73, i72, un1Var, qp3Var);
                    i13 = i73;
                    i12 = i72;
                }
                iv4 iv4Var8 = iv4Var2;
                if (zMo211f0) {
                    i14 = i9;
                    i15 = i11;
                } else {
                    long jM1010b2 = c0135d.m1010b();
                    if (n84.m17279a(jM1010b2, 0L)) {
                        i14 = i9;
                        i15 = i11;
                    } else {
                        int i74 = z3 ? i11 : i9;
                        int iMax7 = Math.max(i9, (int) (jM1010b2 >> 32));
                        long j4 = j3;
                        int iM10429g3 = dk1.m10429g(iMax7, j4);
                        int iM10428f2 = dk1.m10428f(Math.max(i11, (int) (jM1010b2 & 4294967295L)), j4);
                        int i75 = z3 ? iM10428f2 : iM10429g3;
                        if (i75 != i74) {
                            int size7 = arrayList6.size();
                            for (int i76 = 0; i76 < size7; i76++) {
                                iv4 iv4Var9 = (iv4) arrayList6.get(i76);
                                iv4Var9.f44670w = i75;
                                iv4Var9.f44672y = iv4Var9.f44655h + i75;
                            }
                        }
                        i14 = iM10429g3;
                        i15 = iM10428f2;
                    }
                }
                iv4 iv4Var10 = (iv4) c0825bv.m4186i();
                int i77 = iv4Var10 != null ? iv4Var10.f44648a : 0;
                iv4 iv4Var11 = (iv4) c0825bv.m4188k();
                int i78 = iv4Var11 != null ? iv4Var11.f44648a : 0;
                wu4Var.f67299b.getClass();
                List listM23909d = wfb.m23909d(this.f41383i, i77, i78, arrayList6, b84.f8108a, i, i14, i15, z3, new l6a(fv4Var, 1));
                if (z10) {
                    iv4 iv4Var12 = (iv4) u91.m22591I0(arrayList6);
                    if (iv4Var12 != null) {
                        numValueOf = Integer.valueOf(iv4Var12.f44648a);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    iv4 iv4Var13 = (iv4) c0825bv.m4186i();
                    if (iv4Var13 != null) {
                        numValueOf = Integer.valueOf(iv4Var13.f44648a);
                    } else {
                        numValueOf = null;
                    }
                }
                if (z10) {
                    iv4 iv4Var14 = (iv4) u91.m22598P0(arrayList6);
                    if (iv4Var14 != null) {
                        numValueOf2 = Integer.valueOf(iv4Var14.f44648a);
                    }
                } else {
                    iv4 iv4Var15 = (iv4) c0825bv.m4188k();
                    if (iv4Var15 != null) {
                        numValueOf2 = Integer.valueOf(iv4Var15.f44648a);
                    }
                }
                qm9Var = qm9Var2;
                hv4Var = new hv4(iv4Var8, i13, i10 < i43 || i12 > iM3800h2, f2, qm9Var2.mo9895M0(dk1.m10429g(i14 + i17, j), dk1.m10428f(i15 + iMo916w3, j), AbstractC3194a.m15360M(), new rs4(t66Var, arrayList6, listM23909d, zMo211f0, 1)), f4, z9, un1Var, cu4Var, fv4Var.f39740d, b34.m3235c0(numValueOf != null ? numValueOf.intValue() : 0, numValueOf2 != null ? numValueOf2.intValue() : 0, arrayList6, listM23909d), i32, i35, i43, z3 ? Orientation.Vertical : Orientation.Horizontal, r1, iMo916w4);
            }
            C0127b c0127b3 = c0127b;
            c0127b3.m977g(hv4Var, qm9Var.mo211f0(), false);
            b72 b72Var = c0127b3.f2436a;
            return hv4Var;
        } catch (Throwable th) {
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            throw th;
        }
    }
}
