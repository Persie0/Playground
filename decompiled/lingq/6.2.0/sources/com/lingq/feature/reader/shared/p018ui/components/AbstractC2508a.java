package com.lingq.feature.reader.shared.p018ui.components;

import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.animation.core.AbstractC0060b;
import androidx.compose.material3.AbstractC0226d0;
import androidx.compose.material3.C0228e0;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.lingq.feature.reader.shared.p018ui.components.AbstractC2508a;
import p000.AbstractC3393o1;
import p000.C0023al;
import p000.C3516qz;
import p000.a65;
import p000.aa1;
import p000.aj3;
import p000.b16;
import p000.b65;
import p000.bs0;
import p000.bu7;
import p000.bx2;
import p000.c99;
import p000.ci8;
import p000.cu7;
import p000.cx2;
import p000.d32;
import p000.dh9;
import p000.du7;
import p000.e16;
import p000.eh0;
import p000.fb2;
import p000.h41;
import p000.ht5;
import p000.im3;
import p000.l70;
import p000.l77;
import p000.ms5;
import p000.nj0;
import p000.oha;
import p000.p84;
import p000.pb1;
import p000.ps5;
import p000.pvc;
import p000.qc9;
import p000.qh0;
import p000.qv2;
import p000.ry4;
import p000.se1;
import p000.ss5;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.ux5;
import p000.v56;
import p000.vh9;
import p000.vi3;
import p000.vs2;
import p000.we1;
import p000.wx8;
import p000.x18;
import p000.xc9;
import p000.xg0;
import p000.xj2;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.reader.shared.ui.components.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2508a {
    /* JADX WARN: Code duplicated, block: B:183:0x0584  */
    /* JADX INFO: renamed from: a */
    public static final void m9431a(e16 e16Var, du7 du7Var, boolean z, int i, vi3 vi3Var, vi3 vi3Var2, ui3 ui3Var, ye1 ye1Var, int i2) {
        du7 du7Var2;
        vi3 vi3Var3;
        e16 e16Var2;
        int i3;
        float fM19861h;
        boolean z2;
        e16 e16VarM4414g;
        Object c3516qz;
        qc9 qc9Var;
        int i4;
        t66 t66Var;
        int i5;
        p84 p84Var;
        Object objM22097O;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1074764273);
        int i6 = i2 | 6 | (tj3Var.m22120g(du7Var) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i6 |= tj3Var.m22122h(z) ? 256 : 128;
        }
        int i7 = i6 | (tj3Var.m22116e(i) ? 2048 : 1024) | (tj3Var.m22124i(vi3Var) ? 16384 : 8192) | (tj3Var.m22124i(vi3Var2) ? 131072 : 65536);
        if ((1572864 & i2) == 0) {
            i7 |= tj3Var.m22124i(ui3Var) ? 1048576 : 524288;
        }
        int i8 = i7;
        if (tj3Var.m22099R(i8 & 1, (i8 & 599187) != 599186)) {
            boolean zEquals = du7Var.equals(bu7.f9026a);
            p84 p84Var2 = we1.f66679a;
            b16 b16Var = b16.f7762a;
            if (zEquals) {
                tj3Var.m22111b0(679104042);
                e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                Object objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var2) {
                    objM22097O2 = new wx8(5);
                    tj3Var.m22131l0(objM22097O2);
                }
                AbstractC0226d0.m1132c(0.0f, (vi3) objM22097O2, e16VarM4412e, false, null, 0, null, null, null, tj3Var, 3126, 496);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
                du7Var2 = du7Var;
                vi3Var3 = vi3Var2;
            } else {
                if (!(du7Var instanceof cu7)) {
                    throw ux5.m23001x(tj3Var, -2056295434, false);
                }
                tj3Var.m22111b0(679629492);
                cu7 cu7Var = (cu7) du7Var;
                int i9 = cu7Var.f34548a;
                if (i9 <= 1) {
                    tj3Var.m22111b0(679372223);
                    e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                    Object objM22097O3 = tj3Var.m22097O();
                    if (objM22097O3 == p84Var2) {
                        objM22097O3 = new wx8(5);
                        tj3Var.m22131l0(objM22097O3);
                    }
                    AbstractC0226d0.m1132c(1.0f, (vi3) objM22097O3, e16VarM4412e2, false, null, 0, null, null, null, tj3Var, 3126, 496);
                    tj3Var.m22139q(false);
                    tj3Var.m22139q(false);
                    x18 x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new b65(du7Var, z, i, vi3Var, vi3Var2, ui3Var, i2);
                        return;
                    }
                    return;
                }
                vi3Var3 = vi3Var2;
                tj3Var.m22111b0(679606707);
                tj3Var.m22139q(false);
                int i10 = i9 - 1;
                int iM15945h = l70.m15945h(cu7Var.f34549b - 1, 0, i10);
                final int iM15945h2 = l70.m15945h(cu7Var.f34550c, 0, i10);
                int iM15945h3 = l70.m15945h(i - 1, 0, i10);
                final long j = ((aa1) ((xc9) ((bx2) tj3Var.m22128k(cx2.f34676a)).f9120h).getValue()).f414a;
                vh9 vh9Var = ps5.f56764b;
                final long j2 = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55823H;
                final long j3 = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A;
                Object objM22097O4 = tj3Var.m22097O();
                if (objM22097O4 == p84Var2) {
                    objM22097O4 = AbstractC3393o1.m17729d(tj3Var);
                }
                final v56 v56Var = (v56) objM22097O4;
                Object objM22097O5 = tj3Var.m22097O();
                if (objM22097O5 == p84Var2) {
                    objM22097O5 = new SnapshotStateList();
                    tj3Var.m22131l0(objM22097O5);
                }
                SnapshotStateList snapshotStateList = (SnapshotStateList) objM22097O5;
                Object objM22097O6 = tj3Var.m22097O();
                if (objM22097O6 == p84Var2) {
                    objM22097O6 = new LessonProgressBarKt$LessonProgressBar$7$1(v56Var, snapshotStateList, null);
                    tj3Var.m22131l0(objM22097O6);
                }
                d32.m10047k(tj3Var, (zi3) objM22097O6, v56Var);
                boolean zIsEmpty = snapshotStateList.isEmpty();
                boolean z3 = !zIsEmpty;
                final dh9 dh9VarM749a = AbstractC0060b.m749a(!zIsEmpty ? 16.0f : 12.0f, ss5.m21703b0(150, 0, null, 6), "trackHeight", tj3Var, 432, 8);
                final dh9 dh9VarM749a2 = AbstractC0060b.m749a(!zIsEmpty ? 3.0f : 4.0f, ss5.m21703b0(150, 0, null, 6), "thumbWidth", tj3Var, 432, 8);
                final dh9 dh9VarM749a3 = AbstractC0060b.m749a(!zIsEmpty ? 36.0f : 34.0f, ss5.m21703b0(150, 0, null, 6), "thumbHeight", tj3Var, 432, 8);
                final dh9 dh9VarM750b = AbstractC0060b.m750b(i10 > 0 ? iM15945h2 / i10 : 0.0f, null, "progress", null, tj3Var, 3072, 22);
                fb2 fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
                final float fMo912g0 = fb2Var.mo912g0(((xj2) dh9VarM749a2.getValue()).f68285a);
                final float fMo912g1 = fb2Var.mo912g0(4.0f);
                int i11 = (2 > i10 || i10 >= 11) ? 0 : i9 - 2;
                boolean zM22116e = tj3Var.m22116e(i10);
                Object objM22097O7 = tj3Var.m22097O();
                if (zM22116e || objM22097O7 == p84Var2) {
                    objM22097O7 = AbstractC0278f.m1256f(iM15945h);
                    tj3Var.m22131l0(objM22097O7);
                }
                qc9 qc9Var2 = (qc9) objM22097O7;
                Object objM22097O8 = tj3Var.m22097O();
                if (objM22097O8 == p84Var2) {
                    objM22097O8 = AbstractC0278f.m1260j(Boolean.FALSE);
                    tj3Var.m22131l0(objM22097O8);
                }
                t66 t66Var2 = (t66) objM22097O8;
                int iM15945h4 = !zIsEmpty ? l70.m15945h(ss5.m21693T(qc9Var2.m19861h()), 0, i10) + 1 : iM15945h + 1;
                Object objM22097O9 = tj3Var.m22097O();
                if (objM22097O9 == p84Var2) {
                    objM22097O9 = AbstractC0278f.m1260j(Boolean.FALSE);
                    tj3Var.m22131l0(objM22097O9);
                }
                t66 t66Var3 = (t66) objM22097O9;
                Boolean boolValueOf = Boolean.valueOf(z3);
                boolean zM22122h = tj3Var.m22122h(z3);
                Object objM22097O10 = tj3Var.m22097O();
                if (zM22122h || objM22097O10 == p84Var2) {
                    objM22097O10 = new LessonProgressBarKt$LessonProgressBar$8$1(z3, t66Var3, null);
                    tj3Var.m22131l0(objM22097O10);
                }
                d32.m10047k(tj3Var, (zi3) objM22097O10, boolValueOf);
                Integer numValueOf = Integer.valueOf(iM15945h);
                boolean zM22122h2 = tj3Var.m22122h(z3);
                Object objM22097O11 = tj3Var.m22097O();
                if (zM22122h2 || objM22097O11 == p84Var2) {
                    objM22097O11 = new LessonProgressBarKt$LessonProgressBar$9$1(z3, t66Var3, null);
                    tj3Var.m22131l0(objM22097O11);
                }
                d32.m10047k(tj3Var, (zi3) objM22097O11, numValueOf);
                Integer numValueOf2 = Integer.valueOf(iM15945h);
                boolean zM22122h3 = tj3Var.m22122h(z3) | tj3Var.m22120g(qc9Var2) | tj3Var.m22116e(iM15945h);
                Object objM22097O12 = tj3Var.m22097O();
                if (zM22122h3 || objM22097O12 == p84Var2) {
                    objM22097O12 = new LessonProgressBarKt$LessonProgressBar$10$1(z3, iM15945h, t66Var2, qc9Var2, null);
                    tj3Var.m22131l0(objM22097O12);
                }
                d32.m10047k(tj3Var, (zi3) objM22097O12, numValueOf2);
                Boolean boolValueOf2 = Boolean.valueOf(z3);
                boolean zM22122h4 = tj3Var.m22122h(z3) | tj3Var.m22120g(qc9Var2) | tj3Var.m22116e(iM15945h);
                Object objM22097O13 = tj3Var.m22097O();
                if (zM22122h4 || objM22097O13 == p84Var2) {
                    i3 = iM15945h;
                    objM22097O13 = new LessonProgressBarKt$LessonProgressBar$11$1(z3, i3, t66Var2, qc9Var2, null);
                    tj3Var.m22131l0(objM22097O13);
                } else {
                    i3 = iM15945h;
                }
                d32.m10047k(tj3Var, (zi3) objM22097O13, boolValueOf2);
                Object objM22097O14 = tj3Var.m22097O();
                if (objM22097O14 == p84Var2) {
                    objM22097O14 = AbstractC0278f.m1260j(0);
                    tj3Var.m22131l0(objM22097O14);
                }
                t66 t66Var4 = (t66) objM22097O14;
                float fMo912g2 = fb2Var.mo912g0(10.0f);
                Object objM22097O15 = tj3Var.m22097O();
                if (objM22097O15 == p84Var2) {
                    objM22097O15 = AbstractC0278f.m1260j(0);
                    tj3Var.m22131l0(objM22097O15);
                }
                t66 t66Var5 = (t66) objM22097O15;
                if (i10 > 0) {
                    fM19861h = qc9Var2.m19861h() / i10;
                    if (z) {
                        fM19861h = 1.0f - fM19861h;
                    }
                } else {
                    fM19861h = 0.0f;
                }
                float fIntValue = (((((Number) t66Var4.getValue()).intValue() - (2.0f * fMo912g2)) * fM19861h) + fMo912g2) - (((Number) t66Var5.getValue()).intValue() / 2.0f);
                e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
                Object objM22097O16 = tj3Var.m22097O();
                if (objM22097O16 == p84Var2) {
                    objM22097O16 = new C0023al(25, t66Var4);
                    tj3Var.m22131l0(objM22097O16);
                }
                e16 e16VarM19025M = pb1.m19025M(e16VarM4412e3, (vi3) objM22097O16);
                if (z) {
                    tj3Var.m22111b0(685538495);
                    e16 e16VarM4414g2 = c99.m4414g(e16VarM19025M, 48.0f);
                    Object objM22097O17 = tj3Var.m22097O();
                    if (objM22097O17 == p84Var2) {
                        objM22097O17 = new ry4(9);
                        tj3Var.m22131l0(objM22097O17);
                    }
                    e16VarM4414g = AbstractC0309d.m1406a(e16VarM4414g2, (vi3) objM22097O17);
                    z2 = false;
                    tj3Var.m22139q(false);
                } else {
                    z2 = false;
                    tj3Var.m22111b0(685781380);
                    tj3Var.m22139q(false);
                    e16VarM4414g = c99.m4414g(e16VarM19025M, 48.0f);
                }
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, z2);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
                se1.f60731q.getClass();
                e16 e16Var3 = e16VarM4414g;
                ui3 ui3Var2 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                float fM19861h2 = qc9Var2.m19861h();
                h41 h41Var = new h41(0.0f, i10);
                boolean zM22120g = ((i8 & 3670016) == 1048576) | tj3Var.m22120g(qc9Var2) | tj3Var.m22116e(iM15945h3) | ((i8 & 57344) == 16384);
                Object objM22097O18 = tj3Var.m22097O();
                if (zM22120g || objM22097O18 == p84Var2) {
                    qc9Var = qc9Var2;
                    i4 = iM15945h3;
                    t66Var = t66Var3;
                    i5 = 2;
                    c3516qz = new C3516qz(ui3Var, i4, vi3Var, t66Var2, qc9Var);
                    tj3Var.m22131l0(c3516qz);
                } else {
                    qc9Var = qc9Var2;
                    i4 = iM15945h3;
                    t66Var = t66Var3;
                    i5 = 2;
                    c3516qz = objM22097O18;
                }
                vi3 vi3Var4 = (vi3) c3516qz;
                boolean zM22120g2 = tj3Var.m22120g(qc9Var) | tj3Var.m22116e(i4) | ((i8 & 458752) == 131072);
                Object objM22097O19 = tj3Var.m22097O();
                if (zM22120g2 || objM22097O19 == p84Var2) {
                    objM22097O19 = new im3(i4, vi3Var3, qc9Var);
                    tj3Var.m22131l0(objM22097O19);
                }
                final int i12 = i3;
                AbstractC0226d0.m1133d(fM19861h2, vi3Var4, e16Var3, false, (ui3) objM22097O19, null, v56Var, i11, ci8.m4703P(1361510924, new aj3() { // from class: w55
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        ye1 ye1Var2 = (ye1) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((C0228e0) obj).getClass();
                        tj3 tj3Var2 = (tj3) ye1Var2;
                        if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                            la9.f49371a.m16045a(v56Var, null, la9.m16040g(i12 <= iM15945h2 ? j : j3, 0L, 0L, 0L, tj3Var2, 1022), false, AbstractC3584sr.m21614a(((xj2) dh9VarM749a2.getValue()).f68285a, ((xj2) dh9VarM749a3.getValue()).f68285a), tj3Var2, 196614, 10);
                        } else {
                            tj3Var2.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var), ci8.m4703P(1611612203, new aj3() { // from class: z55
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        C0228e0 c0228e0 = (C0228e0) obj;
                        ye1 ye1Var2 = (ye1) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        c0228e0.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= (iIntValue & 8) == 0 ? ((tj3) ye1Var2).m22120g(c0228e0) : ((tj3) ye1Var2).m22124i(c0228e0) ? 4 : 2;
                        }
                        tj3 tj3Var2 = (tj3) ye1Var2;
                        if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                            AbstractC2508a.m9432b(c0228e0, ((Number) dh9VarM750b.getValue()).floatValue(), j, j2, ((xj2) dh9VarM749a.getValue()).f68285a, fMo912g0, fMo912g1, null, tj3Var2, 8 | (iIntValue & 14));
                        } else {
                            tj3Var2.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var), h41Var, tj3Var, 907542528, 0, 40);
                boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
                vs2 vs2VarM772g = AbstractC0070i.m772g(ss5.m21703b0(150, 0, null, 6), 0.0f, i5);
                qv2 qv2VarM773h = AbstractC0070i.m773h(ss5.m21703b0(200, 0, null, 6), i5);
                boolean zM22114d = tj3Var.m22114d(fIntValue) | tj3Var.m22120g(fb2Var);
                Object objM22097O20 = tj3Var.m22097O();
                if (zM22114d) {
                    p84Var = p84Var2;
                } else {
                    p84Var = p84Var2;
                    if (objM22097O20 == p84Var) {
                    }
                    e16 e16VarM19527w = pvc.m19527w(b16Var, (vi3) objM22097O20);
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = new C0023al(24, t66Var5);
                        tj3Var.m22131l0(objM22097O);
                    }
                    du7Var2 = du7Var;
                    AbstractC0054a.m729d(zBooleanValue, pb1.m19025M(e16VarM19527w, (vi3) objM22097O), vs2VarM772g, qv2VarM773h, null, ci8.m4703P(-898091280, new bs0(iM15945h4, du7Var2, 4), tj3Var), tj3Var, 200064, 16);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(true);
                    tj3Var.m22139q(false);
                }
                objM22097O20 = new xg0(fIntValue, fb2Var);
                tj3Var.m22131l0(objM22097O20);
                e16 e16VarM19527w2 = pvc.m19527w(b16Var, (vi3) objM22097O20);
                objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = new C0023al(24, t66Var5);
                    tj3Var.m22131l0(objM22097O);
                }
                du7Var2 = du7Var;
                AbstractC0054a.m729d(zBooleanValue, pb1.m19025M(e16VarM19527w2, (vi3) objM22097O), vs2VarM772g, qv2VarM773h, null, ci8.m4703P(-898091280, new bs0(iM15945h4, du7Var2, 4), tj3Var), tj3Var, 200064, 16);
                tj3Var = tj3Var;
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            }
            e16Var2 = b16Var;
        } else {
            du7Var2 = du7Var;
            vi3Var3 = vi3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u2 = tj3Var.m22143u();
        if (x18VarM22143u2 != null) {
            x18VarM22143u2.f67642d = new a65(e16Var2, du7Var2, z, i, vi3Var, vi3Var3, ui3Var, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [e16] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [b16] */
    /* JADX INFO: renamed from: b */
    public static final void m9432b(final C0228e0 c0228e0, final float f, final long j, final long j2, final float f2, final float f3, final float f4, e16 e16Var, ye1 ye1Var, final int i) {
        int i2;
        float f5;
        ?? r12;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(963105921);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? tj3Var.m22120g(c0228e0) : tj3Var.m22124i(c0228e0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22114d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22118f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22118f(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22114d(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            f5 = f3;
            i2 |= tj3Var.m22114d(f5) ? 131072 : 65536;
        } else {
            f5 = f3;
        }
        if ((i & 1572864) == 0) {
            i2 |= tj3Var.m22114d(f4) ? 1048576 : 524288;
        }
        int i3 = i2 | 12582912;
        if (tj3Var.m22099R(i3 & 1, (i3 & 4793491) != 4793490)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4414g = c99.m4414g(c99.m4412e(b16Var, 1.0f), f2);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new ry4(8);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM1406a = AbstractC0309d.m1406a(e16VarM4414g, (vi3) objM22097O);
            boolean z = ((458752 & i3) == 131072) | ((i3 & 14) == 4 || ((i3 & 8) != 0 && tj3Var.m22124i(c0228e0))) | ((3670016 & i3) == 1048576) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objM22097O2 = tj3Var.m22097O();
            if (z || objM22097O2 == p84Var) {
                final float f6 = f5;
                vi3 vi3Var = new vi3() { // from class: x55
                    /* JADX WARN: Failed to calculate best type for var: r0v3 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v3 ??, new type: long
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r0v4 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: long
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r0v6 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v6 ??, new type: long
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r0v7 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v7 ??, new type: long
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r17v1 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v1 ??, new type: long
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r17v1 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v1 ??, new type: long
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r17v2 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v2 ??, new type: long
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r17v3 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v3 ??, new type: long
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r6v12 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v12 ??, new type: long
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r6v13 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v13 ??, new type: long
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r6v14 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v14 ??, new type: long
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r8v2 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v2 ??, new type: long
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r8v3 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v3 ??, new type: long
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r8v4 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v4 ??, new type: long
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                    Caused by: java.lang.NullPointerException
                     */
                    /*  JADX ERROR: Types fix failed
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v1 ??, new type: long
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                        Caused by: java.lang.NullPointerException
                        */
                    @Override // p000.vi3
                    public final java.lang.Object invoke(java.lang.Object r25) {
                        /*
                            Method dump skipped, instruction units count: 278
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p000.x55.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                tj3Var.m22131l0(vi3Var);
                objM22097O2 = vi3Var;
            }
            eh0.m11124d(e16VarM1406a, (vi3) objM22097O2, tj3Var, 0);
            r12 = b16Var;
        } else {
            tj3Var.m22102U();
            r12 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final ?? r10 = r12;
            x18VarM22143u.f67642d = new zi3() { // from class: y55
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC2508a.m9432b(c0228e0, f, j, j2, f2, f3, f4, r10, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }
}
