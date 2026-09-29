package p000;

import android.os.Trace;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class m27 implements bu4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0150d f50461a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Orientation f50462b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t17 f50463c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f50464d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ iy5 f50465e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ui3 f50466f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ui3 f50467g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ fc0 f50468h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f50469i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ gz8 f50470j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ un1 f50471k;

    public m27(AbstractC0150d abstractC0150d, Orientation orientation, t17 t17Var, boolean z, iy5 iy5Var, zg4 zg4Var, ui3 ui3Var, fc0 fc0Var, int i, gz8 gz8Var, un1 un1Var) {
        this.f50461a = abstractC0150d;
        this.f50462b = orientation;
        this.f50463c = t17Var;
        this.f50464d = z;
        this.f50465e = iy5Var;
        this.f50466f = zg4Var;
        this.f50467g = ui3Var;
        this.f50468h = fc0Var;
        this.f50469i = i;
        this.f50470j = gz8Var;
        this.f50471k = un1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v5 */
    @Override // p000.bu4
    /* JADX INFO: renamed from: a */
    public final it5 mo1021a(cu4 cu4Var, long j) {
        long j2;
        long j3;
        fc0 fc0Var;
        t66 t66Var;
        boolean z;
        AbstractC0150d abstractC0150d;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        lt5 lt5Var;
        int i11;
        C0825bv c0825bv;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList;
        int i15;
        List list;
        int i16;
        int i17;
        ArrayList arrayList2;
        int i18;
        boolean z2;
        qm9 qm9Var;
        C0825bv c0825bv2;
        ArrayList arrayList3;
        int i19;
        ArrayList arrayList4;
        List list2;
        int i20;
        Object obj;
        boolean z3;
        float fM15944g;
        n27 n27Var;
        qm9 qm9Var2;
        cu4 cu4Var2;
        int[] iArr;
        int i21;
        long j4;
        int iMax;
        C0825bv c0825bv3;
        m27 m27Var = this;
        qm9 qm9Var3 = cu4Var.f34541b;
        AbstractC0150d abstractC0150d2 = m27Var.f50461a;
        abstractC0150d2.f2666C.getValue();
        Orientation orientation = Orientation.Vertical;
        Orientation orientation2 = m27Var.f50462b;
        boolean z4 = orientation2 == orientation;
        thb.m22047f(j, z4 ? orientation : Orientation.Horizontal);
        t17 t17Var = m27Var.f50463c;
        int iMo916w0 = z4 ? qm9Var3.mo916w0(t17Var.mo14019b(qm9Var3.getLayoutDirection())) : qm9Var3.mo916w0(AbstractC3584sr.m21643u(t17Var, qm9Var3.getLayoutDirection()));
        int iMo916w1 = z4 ? qm9Var3.mo916w0(t17Var.mo14020c(qm9Var3.getLayoutDirection())) : qm9Var3.mo916w0(AbstractC3584sr.m21642t(t17Var, qm9Var3.getLayoutDirection()));
        int iMo916w2 = qm9Var3.mo916w0(t17Var.mo14021d());
        int iMo916w3 = qm9Var3.mo916w0(t17Var.mo14018a());
        int i22 = iMo916w2 + iMo916w3;
        int i23 = iMo916w0 + iMo916w1;
        int i24 = z4 ? i22 : i23;
        boolean z5 = m27Var.f50464d;
        if (z4 && !z5) {
            iMo916w3 = iMo916w2;
        } else if (!z4 || !z5) {
            iMo916w3 = (z4 || z5) ? iMo916w1 : iMo916w0;
        }
        int i25 = i24 - iMo916w3;
        long jM10431i = dk1.m10431i(j, -i23, -i22);
        abstractC0150d2.f2684n = cu4Var;
        int iMo916w4 = qm9Var3.mo916w0(0.0f);
        int iM3800h = z4 ? bk1.m3800h(j) - i22 : bk1.m3801i(j) - i23;
        if (!z5 || iM3800h > 0) {
            j2 = ((long) iMo916w0) << 32;
            j3 = ((long) iMo916w2) & 4294967295L;
        } else {
            if (!z4) {
                iMo916w0 += iM3800h;
            }
            if (z4) {
                iMo916w2 += iM3800h;
            }
            j2 = ((long) iMo916w0) << 32;
            j3 = ((long) iMo916w2) & 4294967295L;
        }
        long j5 = j2 | j3;
        m27Var.f50465e.getClass();
        int i26 = iM3800h < 0 ? 0 : iM3800h;
        dk1.m10424b(0, orientation2 == orientation ? bk1.m3801i(jM10431i) : i26, 0, orientation2 != orientation ? bk1.m3800h(jM10431i) : i26, 5);
        l27 l27Var = (l27) m27Var.f50466f.mo0a();
        gz8 gz8Var = m27Var.f50470j;
        jc9 jc9VarM16139y = lda.m16139y();
        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
        int i27 = iM3800h;
        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
        long j6 = j5;
        try {
            int iM1036k = abstractC0150d2.m1036k();
            tz1 tz1Var = abstractC0150d2.f2674d;
            int iM19375m = pk9.m19375m(iM1036k, l27Var, tz1Var.f63124c);
            if (iM1036k != iM19375m) {
                ((sc9) tz1Var.f63125d).m21223i(iM19375m);
                ((eu4) tz1Var.f63127f).m11342c(iM1036k);
            }
            abstractC0150d2.m1036k();
            float fM1037l = abstractC0150d2.m1037l();
            abstractC0150d2.mo1039n();
            gz8Var.getClass();
            int i28 = i26 + iMo916w4;
            int iM21693T = ss5.m21693T(0.0f - (fM1037l * i28));
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            List listM10531g = do7.m10531g(l27Var, abstractC0150d2.f2664A, abstractC0150d2.f2693w);
            t56 t56Var = e84.f36837a;
            t56 t56Var2 = new t56();
            int iIntValue = ((Number) m27Var.f50467g.mo0a()).intValue();
            t66 t66Var2 = abstractC0150d2.f2665B;
            if (iMo916w3 < 0) {
                l54.m15814a("negative beforeContentPadding");
            }
            if (i25 < 0) {
                l54.m15814a("negative afterContentPadding");
            }
            int i29 = i28 < 0 ? 0 : i28;
            int i30 = m27Var.f50469i;
            int i31 = i30 > iIntValue ? iIntValue : i30;
            Orientation orientation3 = m27Var.f50462b;
            int i32 = iM21693T;
            long jM10424b = dk1.m10424b(0, orientation3 == orientation ? bk1.m3801i(jM10431i) : i26, 0, orientation3 != orientation ? bk1.m3800h(jM10431i) : i26, 5);
            int i33 = iM19375m;
            gz8 gz8Var2 = m27Var.f50470j;
            int i34 = iIntValue;
            un1 un1Var = m27Var.f50471k;
            if (i34 <= 0) {
                n27Var = new n27(i26, iMo916w4, i25, orientation3, -iMo916w3, i27 + i25, i31, gz8Var2, qm9Var3.mo9895M0(dk1.m10429g(bk1.m3803k(jM10431i) + i23, j), dk1.m10428f(bk1.m3802j(jM10431i) + i22, j), AbstractC3194a.m15360M(), new C2951e4(29)), un1Var, cu4Var, jM10424b);
                cu4Var2 = cu4Var;
                qm9Var2 = qm9Var3;
                abstractC0150d = abstractC0150d2;
            } else {
                int i35 = i31;
                qm9 qm9Var4 = qm9Var3;
                int i36 = iMo916w4;
                AbstractC0150d abstractC0150d3 = abstractC0150d2;
                long j7 = jM10424b;
                int i37 = 0;
                while (i33 > 0 && i32 > 0) {
                    i33--;
                    i32 -= i29;
                }
                int i38 = i32 * (-1);
                if (i33 >= i34) {
                    i33 = i34 - 1;
                    i38 = 0;
                }
                C0825bv c0825bv4 = new C0825bv();
                int i39 = -iMo916w3;
                int i40 = i39 + (i36 < 0 ? i36 : 0);
                int i41 = i38 + i40;
                int i42 = iMo916w3;
                int iMax2 = 0;
                while (true) {
                    fc0Var = m27Var.f50468h;
                    t66Var = t66Var2;
                    z = m27Var.f50464d;
                    if (i41 >= 0 || i33 <= 0) {
                        break;
                    }
                    int i43 = i33 - 1;
                    int i44 = i28;
                    int i45 = i37;
                    long j8 = jM10431i;
                    int i46 = i34;
                    l27 l27Var2 = l27Var;
                    int i47 = i22;
                    long j9 = j6;
                    t56 t56Var3 = t56Var2;
                    int i48 = i26;
                    lt5 lt5VarM24788z = xwc.m24788z(cu4Var, i43, j7, l27Var2, j9, orientation3, fc0Var, qm9Var4.getLayoutDirection(), z, i48, t56Var3);
                    t56Var2 = t56Var3;
                    c0825bv4.add(i45, lt5VarM24788z);
                    iMax2 = Math.max(iMax2, lt5VarM24788z.f50109j);
                    i41 += i29;
                    i33 = i43;
                    j6 = j9;
                    i26 = i48;
                    i22 = i47;
                    i28 = i44;
                    qm9Var4 = qm9Var4;
                    i34 = i46;
                    jM10431i = j8;
                    i36 = i36;
                    t66Var2 = t66Var;
                    i35 = i35;
                    i37 = i45;
                    l27Var = l27Var2;
                    i27 = i27;
                    abstractC0150d3 = abstractC0150d3;
                    m27Var = this;
                }
                int i49 = i36;
                abstractC0150d = abstractC0150d3;
                int i50 = i28;
                l27 l27Var3 = l27Var;
                Orientation orientation4 = orientation3;
                fc0 fc0Var2 = fc0Var;
                int i51 = i35;
                int i52 = i37;
                int i53 = i27;
                long j10 = jM10431i;
                int i54 = i26;
                int i55 = i29;
                qm9 qm9Var5 = qm9Var4;
                int i56 = i34;
                int i57 = i22;
                long j11 = j6;
                int i58 = iMax2;
                if (i41 < i40) {
                    i41 = i40;
                }
                int i59 = i41 - i40;
                int i60 = i53 + i25;
                int i61 = i60 < 0 ? i52 : i60;
                int i62 = i33;
                int i63 = i62;
                int i64 = i58;
                int i65 = -i59;
                int i66 = i52;
                while (i52 < c0825bv4.f9041c) {
                    if (i65 >= i61) {
                        c0825bv4.mo4183f(i52);
                        i66 = 1;
                    } else {
                        i63++;
                        i65 += i55;
                        i52++;
                    }
                }
                int i67 = i56;
                int i68 = i59;
                int i69 = i65;
                int i70 = i63;
                boolean z6 = i66;
                while (true) {
                    if (i70 >= i67) {
                        i = i69;
                        break;
                    }
                    if (i69 >= i61 && i69 > 0 && !c0825bv4.isEmpty()) {
                        i = i69;
                        break;
                    }
                    int i71 = i67;
                    int i72 = i69;
                    int i73 = i53;
                    int i74 = i55;
                    int i75 = i64;
                    int i76 = i61;
                    C0825bv c0825bv5 = c0825bv4;
                    long j12 = j7;
                    lt5 lt5VarM24788z2 = xwc.m24788z(cu4Var, i70, j12, l27Var3, j11, orientation4, fc0Var2, qm9Var5.getLayoutDirection(), z, i54, t56Var2);
                    int i77 = i70;
                    int i78 = i71 - 1;
                    int i79 = i72 + (i77 == i78 ? i54 : i74);
                    if (i79 > i40 || i77 == i78) {
                        int iMax3 = Math.max(i75, lt5VarM24788z2.f50109j);
                        c0825bv3 = c0825bv5;
                        c0825bv3.addLast(lt5VarM24788z2);
                        i64 = iMax3;
                    } else {
                        i68 -= i74;
                        i62 = i77 + 1;
                        i64 = i75;
                        c0825bv3 = c0825bv5;
                        z6 = 1;
                    }
                    i70 = i77 + 1;
                    C0825bv c0825bv6 = c0825bv3;
                    i69 = i79;
                    c0825bv4 = c0825bv6;
                    i67 = i71;
                    j7 = j12;
                    i61 = i76;
                    i55 = i74;
                    i53 = i73;
                    z6 = z6;
                }
                if (i < i53) {
                    int i80 = i53 - i;
                    int i81 = i + i80;
                    int i82 = i68 - i80;
                    int i83 = i42;
                    while (true) {
                        if (i82 >= i83) {
                            iMax = i64;
                            break;
                        }
                        if (i62 <= 0) {
                            break;
                        }
                        i62--;
                        lt5 lt5VarM24788z3 = xwc.m24788z(cu4Var, i62, j7, l27Var3, j11, orientation4, fc0Var2, qm9Var5.getLayoutDirection(), z, i54, t56Var2);
                        c0825bv4.add(0, lt5VarM24788z3);
                        iMax = Math.max(iMax, lt5VarM24788z3.f50109j);
                        i82 += i55;
                        i70 = i70;
                        i83 = i83;
                    }
                    i2 = i70;
                    i3 = i83;
                    int i84 = i82;
                    int i85 = iMax;
                    if (i84 < 0) {
                        i4 = i85;
                        i6 = i81 + i84;
                        i5 = 0;
                    } else {
                        i4 = i85;
                        i6 = i81;
                        i5 = i84;
                    }
                } else {
                    i2 = i70;
                    i5 = i68;
                    i6 = i;
                }
                if (i5 < 0) {
                    i3 = i42;
                    i4 = i64;
                    l54.m15814a("invalid currentFirstPageScrollOffset");
                }
                i3 = i42;
                i4 = i64;
                int i86 = -i5;
                lt5 lt5Var2 = (lt5) c0825bv4.first();
                int i87 = i6;
                int i88 = i49;
                if (i3 > 0 || i88 < 0) {
                    int i89 = i5;
                    int iMo4182d = c0825bv4.mo4182d();
                    lt5 lt5Var3 = lt5Var2;
                    int i90 = i89;
                    int i91 = 0;
                    while (true) {
                        if (i91 >= iMo4182d || i90 == 0) {
                            i7 = i88;
                            i8 = i55;
                            i9 = 1;
                            break;
                        }
                        i7 = i88;
                        int i92 = i55;
                        if (i92 > i90) {
                            i8 = i92;
                            i9 = 1;
                            break;
                        }
                        i8 = i92;
                        i9 = 1;
                        if (i91 == c0825bv4.mo4182d() - 1) {
                            break;
                        }
                        i90 -= i8;
                        i91++;
                        lt5Var3 = (lt5) c0825bv4.get(i91);
                        i55 = i8;
                        i88 = i7;
                    }
                    i10 = i90;
                    lt5Var2 = lt5Var3;
                } else {
                    i7 = i88;
                    i8 = i55;
                    i9 = 1;
                    i10 = i5;
                }
                int iMax4 = Math.max(0, i62 - i51);
                int i93 = i62 - 1;
                if (iMax4 <= i93) {
                    ArrayList arrayList5 = null;
                    while (true) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        lt5Var = lt5Var2;
                        i12 = i10;
                        arrayList = arrayList5;
                        i11 = i53;
                        c0825bv = c0825bv4;
                        i13 = i51;
                        i14 = iMax4;
                        arrayList.add(xwc.m24788z(cu4Var, i93, j7, l27Var3, j11, orientation4, fc0Var2, qm9Var5.getLayoutDirection(), z, i54, t56Var2));
                        if (i93 == i14) {
                            break;
                        }
                        i93--;
                        iMax4 = i14;
                        i51 = i13;
                        c0825bv4 = c0825bv;
                        lt5Var2 = lt5Var;
                        i53 = i11;
                        arrayList5 = arrayList;
                        i10 = i12;
                    }
                } else {
                    lt5Var = lt5Var2;
                    i11 = i53;
                    c0825bv = c0825bv4;
                    i12 = i10;
                    i13 = i51;
                    i14 = iMax4;
                    arrayList = null;
                }
                List list3 = listM10531g;
                List list4 = list3;
                int size = list4.size();
                ArrayList arrayList6 = arrayList;
                int i94 = 0;
                while (i94 < size) {
                    List list5 = list3;
                    int iIntValue2 = ((Number) list3.get(i94)).intValue();
                    if (iIntValue2 < i14) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        ArrayList arrayList7 = arrayList6;
                        arrayList7.add(xwc.m24788z(cu4Var, iIntValue2, j7, l27Var3, j11, orientation4, fc0Var2, qm9Var5.getLayoutDirection(), z, i54, t56Var2));
                        arrayList6 = arrayList7;
                    }
                    i94++;
                    list3 = list5;
                    size = size;
                    i14 = i14;
                }
                List list6 = list3;
                EmptyList emptyList = EmptyList.f47638a;
                List list7 = arrayList6 == null ? emptyList : arrayList6;
                List list8 = list7;
                int size2 = list8.size();
                int i95 = i4;
                List list9 = emptyList;
                int iMax5 = i95;
                int i96 = 0;
                while (i96 < size2) {
                    iMax5 = Math.max(iMax5, ((lt5) list7.get(i96)).f50109j);
                    i96++;
                    list7 = list7;
                }
                List list10 = list7;
                int i97 = ((lt5) c0825bv.last()).f50100a;
                int iMin = Math.min(i13, (i67 - i97) - 1) + i97;
                int i98 = i97 + 1;
                if (i98 <= iMin) {
                    ArrayList arrayList8 = null;
                    while (true) {
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        int i99 = iMax5;
                        arrayList2 = arrayList8;
                        i15 = i99;
                        list = list10;
                        i16 = i13;
                        i17 = iMin;
                        int i100 = i98;
                        arrayList2.add(xwc.m24788z(cu4Var, i100, j7, l27Var3, j11, orientation4, fc0Var2, qm9Var5.getLayoutDirection(), z, i54, t56Var2));
                        if (i100 == i17) {
                            break;
                        }
                        i98 = i100 + 1;
                        iMin = i17;
                        arrayList8 = arrayList2;
                        iMax5 = i15;
                        i13 = i16;
                        list10 = list;
                    }
                } else {
                    i15 = iMax5;
                    list = list10;
                    i16 = i13;
                    i17 = iMin;
                    arrayList2 = null;
                }
                int size3 = list4.size();
                ArrayList arrayList9 = arrayList2;
                int i101 = 0;
                while (i101 < size3) {
                    int iIntValue3 = ((Number) list6.get(i101)).intValue();
                    int i102 = size3;
                    if (i17 + 1 <= iIntValue3) {
                        int i103 = i67;
                        if (iIntValue3 < i103) {
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                            }
                            int i104 = i17;
                            ArrayList arrayList10 = arrayList9;
                            i17 = i104;
                            list6 = list6;
                            i21 = i103;
                            lt5 lt5VarM24788z4 = xwc.m24788z(cu4Var, iIntValue3, j7, l27Var3, j11, orientation4, fc0Var2, qm9Var5.getLayoutDirection(), z, i54, t56Var2);
                            fc0Var2 = fc0Var2;
                            orientation4 = orientation4;
                            i60 = i60;
                            j4 = j7;
                            arrayList10.add(lt5VarM24788z4);
                            arrayList9 = arrayList10;
                        } else {
                            i21 = i103;
                        }
                        i101++;
                        i87 = i87;
                        j7 = j4;
                        i60 = i60;
                        orientation4 = orientation4;
                        fc0Var2 = fc0Var2;
                        i67 = i21;
                        size3 = i102;
                        i17 = i17;
                        list6 = list6;
                    } else {
                        i21 = i67;
                    }
                    j4 = j7;
                    i101++;
                    i87 = i87;
                    j7 = j4;
                    i60 = i60;
                    orientation4 = orientation4;
                    fc0Var2 = fc0Var2;
                    i67 = i21;
                    size3 = i102;
                    i17 = i17;
                    list6 = list6;
                }
                int i105 = i67;
                Orientation orientation5 = orientation4;
                int i106 = i60;
                long j13 = j7;
                int i107 = i87;
                List list11 = arrayList9 == null ? list9 : arrayList9;
                List list12 = list11;
                int size4 = list12.size();
                int iMax6 = i15;
                for (int i108 = 0; i108 < size4; i108++) {
                    iMax6 = Math.max(iMax6, ((lt5) list11.get(i108)).f50109j);
                }
                lt5 lt5Var4 = lt5Var;
                int i109 = (fa4.m11650l(lt5Var4, c0825bv.first()) && list.isEmpty() && list11.isEmpty()) ? i9 : 0;
                Orientation orientation6 = Orientation.Vertical;
                int iM10429g = dk1.m10429g(orientation5 == orientation6 ? iMax6 : i107, j10);
                if (orientation5 == orientation6) {
                    iMax6 = i107;
                }
                int iM10428f = dk1.m10428f(iMax6, j10);
                int i110 = orientation5 == orientation6 ? iM10428f : iM10429g;
                int i111 = i11;
                int i112 = i107 < Math.min(i110, i111) ? i9 : 0;
                if (i112 == 0 || i86 == 0) {
                    i18 = i86;
                } else {
                    StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
                    i18 = i86;
                    sb.append(i18);
                    l54.m15816c(sb.toString());
                }
                int i113 = i18;
                ArrayList arrayList11 = new ArrayList(list11.size() + list.size() + c0825bv.mo4182d());
                if (i112 != 0) {
                    if (!list.isEmpty() || !list11.isEmpty()) {
                        l54.m15814a("No extra pages");
                    }
                    int iMo4182d2 = c0825bv.mo4182d();
                    int[] iArr2 = new int[iMo4182d2];
                    arrayList3 = arrayList11;
                    for (int i114 = 0; i114 < iMo4182d2; i114++) {
                        iArr2[i114] = i54;
                    }
                    int[] iArr3 = new int[iMo4182d2];
                    qm9Var = qm9Var5;
                    z2 = z;
                    C3661uu c3661uu = new C3661uu(qm9Var.mo905T(i7), false, null);
                    if (orientation5 == Orientation.Vertical) {
                        c3661uu.mo10843k(cu4Var, i110, iArr2, iArr3);
                        i19 = i107;
                        iArr = iArr3;
                    } else {
                        i19 = i107;
                        iArr = iArr3;
                        c3661uu.mo9968j(cu4Var, i110, iArr2, LayoutDirection.Ltr, iArr);
                    }
                    g84 g84VarM20840h0 = AbstractC3550rv.m20840h0(iArr);
                    if (z2) {
                        g84VarM20840h0 = new g84(g84VarM20840h0.f40380b, 0, -g84VarM20840h0.f40381c);
                    }
                    int i115 = g84VarM20840h0.f40379a;
                    int i116 = g84VarM20840h0.f40380b;
                    int i117 = g84VarM20840h0.f40381c;
                    if ((i117 > 0 && i115 <= i116) || (i117 < 0 && i116 <= i115)) {
                        while (true) {
                            int i118 = iArr[i115];
                            int i119 = i110;
                            c0825bv2 = c0825bv;
                            lt5 lt5Var5 = (lt5) c0825bv2.get(!z2 ? i115 : (iMo4182d2 - i115) - 1);
                            if (z2) {
                                i118 = (i119 - i118) - lt5Var5.f50101b;
                            }
                            lt5Var5.m16541b(i118, iM10429g, iM10428f);
                            arrayList3.add(lt5Var5);
                            if (i115 == i116) {
                                break;
                            }
                            i115 += i117;
                            c0825bv = c0825bv2;
                            i117 = i117;
                            i110 = i119;
                        }
                    } else {
                        c0825bv2 = c0825bv;
                    }
                } else {
                    orientation5 = orientation5;
                    z2 = z;
                    qm9Var = qm9Var5;
                    c0825bv2 = c0825bv;
                    arrayList3 = arrayList11;
                    i19 = i107;
                    i111 = i111;
                    int size5 = list8.size();
                    int i120 = i113;
                    for (int i121 = 0; i121 < size5; i121++) {
                        lt5 lt5Var6 = (lt5) list.get(i121);
                        i120 -= i50;
                        lt5Var6.m16541b(i120, iM10429g, iM10428f);
                        arrayList3.add(lt5Var6);
                    }
                    int iMo4182d3 = c0825bv2.mo4182d();
                    int i122 = i113;
                    for (int i123 = 0; i123 < iMo4182d3; i123++) {
                        lt5 lt5Var7 = (lt5) c0825bv2.get(i123);
                        lt5Var7.m16541b(i122, iM10429g, iM10428f);
                        arrayList3.add(lt5Var7);
                        i122 += i50;
                    }
                    int size6 = list12.size();
                    for (int i124 = 0; i124 < size6; i124++) {
                        lt5 lt5Var8 = (lt5) list11.get(i124);
                        lt5Var8.m16541b(i122, iM10429g, iM10428f);
                        arrayList3.add(lt5Var8);
                        i122 += i50;
                    }
                }
                if (i109 != 0) {
                    arrayList4 = arrayList3;
                } else {
                    arrayList4 = new ArrayList(arrayList3.size());
                    int size7 = arrayList3.size();
                    int i125 = 0;
                    while (i125 < size7) {
                        Object obj2 = arrayList3.get(i125);
                        lt5 lt5Var9 = (lt5) obj2;
                        int i126 = size7;
                        C0825bv c0825bv7 = c0825bv2;
                        if (lt5Var9.f50100a >= ((lt5) c0825bv2.first()).f50100a && lt5Var9.f50100a <= ((lt5) c0825bv7.last()).f50100a) {
                            arrayList4.add(obj2);
                        }
                        i125++;
                        size7 = i126;
                        c0825bv2 = c0825bv7;
                    }
                }
                C0825bv c0825bv8 = c0825bv2;
                if (list.isEmpty()) {
                    list2 = list9;
                } else {
                    ArrayList arrayList12 = new ArrayList(arrayList3.size());
                    int size8 = arrayList3.size();
                    for (int i127 = 0; i127 < size8; i127++) {
                        Object obj3 = arrayList3.get(i127);
                        if (((lt5) obj3).f50100a < ((lt5) c0825bv8.first()).f50100a) {
                            arrayList12.add(obj3);
                        }
                    }
                    list2 = arrayList12;
                }
                if (!list11.isEmpty()) {
                    ArrayList arrayList13 = new ArrayList(arrayList3.size());
                    int size9 = arrayList3.size();
                    for (int i128 = 0; i128 < size9; i128++) {
                        Object obj4 = arrayList3.get(i128);
                        if (((lt5) obj4).f50100a > ((lt5) c0825bv8.last()).f50100a) {
                            arrayList13.add(obj4);
                        }
                    }
                    list9 = arrayList13;
                }
                if (arrayList4.isEmpty()) {
                    i20 = i9;
                    obj = null;
                } else {
                    Object obj5 = arrayList4.get(0);
                    int i129 = ((lt5) obj5).f50111l;
                    gz8Var2.getClass();
                    float f = -Math.abs(i129 - 0.0f);
                    int size10 = arrayList4.size() - 1;
                    i20 = i9;
                    if (i20 <= size10) {
                        int i130 = i20;
                        while (true) {
                            Object obj6 = arrayList4.get(i130);
                            float f2 = -Math.abs(((lt5) obj6).f50111l - 0.0f);
                            if (Float.compare(f, f2) < 0) {
                                obj5 = obj6;
                                f = f2;
                            }
                            if (i130 == size10) {
                                break;
                            }
                            i130++;
                        }
                    }
                    obj = obj5;
                }
                lt5 lt5Var10 = (lt5) obj;
                gz8Var2.getClass();
                int i131 = lt5Var10 != null ? lt5Var10.f50111l : 0;
                if (i8 == 0) {
                    fM15944g = 0.0f;
                    z3 = false;
                } else {
                    z3 = false;
                    fM15944g = l70.m15944g((0 - i131) / i8, -0.5f, 0.5f);
                }
                it5 it5VarMo9895M0 = qm9Var.mo9895M0(dk1.m10429g(iM10429g + i23, j), dk1.m10428f(iM10428f + i57, j), AbstractC3194a.m15360M(), new ui5(7, t66Var, arrayList3));
                qm9Var2 = qm9Var;
                n27Var = new n27(arrayList4, i54, i7, i25, orientation5, i39, i106, z2, i16, lt5Var4, lt5Var10, fM15944g, i12, (i2 < i105 || i19 > i111) ? i20 : z3, gz8Var2, it5VarMo9895M0, z6, list2, list9, un1Var, cu4Var, j13);
                cu4Var2 = cu4Var;
            }
            AbstractC0150d abstractC0150d4 = abstractC0150d;
            abstractC0150d4.m1033h(n27Var, qm9Var2.mo211f0(), false);
            h27 h27Var = abstractC0150d4.f2692v;
            List list13 = n27Var.f52219a;
            Trace.beginSection("compose:pager:cache_window:keepAroundItems");
            try {
                if (h27Var.m13004b() && !list13.isEmpty()) {
                    int i132 = ((lt5) u91.m22589G0(list13)).f50100a;
                    int i133 = ((lt5) u91.m22597O0(list13)).f50100a;
                    for (int i134 = h27Var.f41709h; i134 < i132; i134++) {
                        cu4Var2.m9896b(i134);
                    }
                    int i135 = i133 + 1;
                    int i136 = h27Var.f41710i;
                    if (i135 <= i136) {
                        while (true) {
                            cu4Var2.m9896b(i135);
                            if (i135 == i136) {
                                break;
                            }
                            i135++;
                        }
                    }
                }
                return n27Var;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            throw th;
        }
    }
}
