package com.lingq.feature.collections;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.p012ui.LessonInfoSource;
import com.lingq.feature.collections.AbstractC2030a;
import com.lingq.feature.collections.R$string;
import com.lingq.feature.collections.components.AbstractC2033a;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3584sr;
import p000.C2956e9;
import p000.C3072he;
import p000.C3353mz;
import p000.C3386nv;
import p000.C3445p2;
import p000.C3539rk;
import p000.C3598t4;
import p000.C3836zk;
import p000.aj3;
import p000.b34;
import p000.bia;
import p000.c91;
import p000.ci8;
import p000.d32;
import p000.dq0;
import p000.dua;
import p000.gi5;
import p000.gr3;
import p000.i91;
import p000.ik0;
import p000.mv4;
import p000.or1;
import p000.p84;
import p000.pfa;
import p000.q2d;
import p000.q91;
import p000.s70;
import p000.sc9;
import p000.si5;
import p000.sob;
import p000.t61;
import p000.t66;
import p000.tj3;
import p000.u61;
import p000.ub5;
import p000.uc9;
import p000.ud6;
import p000.ui3;
import p000.ux5;
import p000.v61;
import p000.vi3;
import p000.w41;
import p000.w61;
import p000.we1;
import p000.x18;
import p000.x61;
import p000.xwc;
import p000.xy0;
import p000.y38;
import p000.y61;
import p000.y7d;
import p000.ye1;
import p000.ys0;
import p000.z61;
import p000.z7d;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.collections.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2030a {
    /* JADX INFO: renamed from: a */
    public static final void m8934a(final z7d z7dVar, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(823419360);
        int i2 = 4;
        final int i3 = 2;
        int i4 = i | (tj3Var.m22120g(z7dVar) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        final int i5 = 0;
        final int i6 = 1;
        if (tj3Var.m22099R(i4 & 1, (i4 & 19) != 18)) {
            boolean z = z7dVar instanceof w61;
            p84 p84Var = we1.f66679a;
            if (z) {
                tj3Var.m22111b0(1928141384);
                i6 = (i4 & 112) != 32 ? 0 : 1;
                Object objM22097O = tj3Var.m22097O();
                if (i6 != 0 || objM22097O == p84Var) {
                    objM22097O = new C3353mz(vi3Var, 19);
                    tj3Var.m22131l0(objM22097O);
                }
                q2d.m19625a((ui3) objM22097O, ci8.m4703P(-924615152, new dq0(vi3Var, 7), tj3Var), null, ci8.m4703P(-1189262642, new dq0(vi3Var, 10), tj3Var), null, sob.f61119c, ci8.m4703P(-1586233877, new zi3() { // from class: d91
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i7 = i3;
                        xfa xfaVar = xfa.f68157a;
                        z7d z7dVar2 = z7dVar;
                        switch (i7) {
                            case 0:
                                ye1 ye1Var2 = (ye1) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var2.m22102U();
                                } else {
                                    lw9.m16554b(vz1.m23620a0(tj3Var2, ((v61) z7dVar2).f64910c ? R$string.premium_course : com.lingq.core.p012ui.R$string.premium_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                                }
                                break;
                            case 1:
                                ye1 ye1Var3 = (ye1) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                tj3 tj3Var3 = (tj3) ye1Var3;
                                if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    tj3Var3.m22102U();
                                } else {
                                    v61 v61Var = (v61) z7dVar2;
                                    lw9.m16554b(vz1.m23618Z(v61Var.f64910c ? R$string.not_enough_balance_purchase_course_details : com.lingq.core.p012ui.R$string.not_enough_balance_purchase_lesson_details, new Object[]{Integer.valueOf(v61Var.f64908a), Integer.valueOf(v61Var.f64909b)}, tj3Var3), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                                }
                                break;
                            case 2:
                                ye1 ye1Var4 = (ye1) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                tj3 tj3Var4 = (tj3) ye1Var4;
                                if (!tj3Var4.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    tj3Var4.m22102U();
                                } else {
                                    w61 w61Var = (w61) z7dVar2;
                                    lw9.m16554b(vz1.m23618Z(com.lingq.core.p012ui.R$string.purchase_item_details, new Object[]{Integer.valueOf(w61Var.f66443a), Integer.valueOf(w61Var.f66444b)}, tj3Var4), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
                                }
                                break;
                            default:
                                ye1 ye1Var5 = (ye1) obj;
                                int iIntValue4 = ((Integer) obj2).intValue();
                                tj3 tj3Var5 = (tj3) ye1Var5;
                                if (!tj3Var5.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                    tj3Var5.m22102U();
                                } else {
                                    x61 x61Var = (x61) z7dVar2;
                                    lw9.m16554b(vz1.m23618Z(com.lingq.core.p012ui.R$string.purchase_item_details, new Object[]{Integer.valueOf(x61Var.f67810a), Integer.valueOf(x61Var.f67811b)}, tj3Var5), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var5, 0, 0, 262142);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var), null, 0L, 0L, 0L, 0L, null, tj3Var, 1772592, 16276);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                final int i7 = 3;
                if (z7dVar instanceof x61) {
                    tj3Var.m22111b0(1929202886);
                    i6 = (i4 & 112) != 32 ? 0 : 1;
                    Object objM22097O2 = tj3Var.m22097O();
                    if (i6 != 0 || objM22097O2 == p84Var) {
                        objM22097O2 = new C3353mz(vi3Var, 23);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    q2d.m19625a((ui3) objM22097O2, ci8.m4703P(-1198726407, new dq0(vi3Var, 11), tj3Var), null, ci8.m4703P(-2121893833, new dq0(vi3Var, 12), tj3Var), null, sob.f61122f, ci8.m4703P(-1359161324, new zi3() { // from class: d91
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            int i8 = i7;
                            xfa xfaVar = xfa.f68157a;
                            z7d z7dVar2 = z7dVar;
                            switch (i8) {
                                case 0:
                                    ye1 ye1Var2 = (ye1) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var2, ((v61) z7dVar2).f64910c ? R$string.premium_course : com.lingq.core.p012ui.R$string.premium_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                                    }
                                    break;
                                case 1:
                                    ye1 ye1Var3 = (ye1) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                    if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        tj3Var3.m22102U();
                                    } else {
                                        v61 v61Var = (v61) z7dVar2;
                                        lw9.m16554b(vz1.m23618Z(v61Var.f64910c ? R$string.not_enough_balance_purchase_course_details : com.lingq.core.p012ui.R$string.not_enough_balance_purchase_lesson_details, new Object[]{Integer.valueOf(v61Var.f64908a), Integer.valueOf(v61Var.f64909b)}, tj3Var3), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                                    }
                                    break;
                                case 2:
                                    ye1 ye1Var4 = (ye1) obj;
                                    int iIntValue3 = ((Integer) obj2).intValue();
                                    tj3 tj3Var4 = (tj3) ye1Var4;
                                    if (!tj3Var4.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        tj3Var4.m22102U();
                                    } else {
                                        w61 w61Var = (w61) z7dVar2;
                                        lw9.m16554b(vz1.m23618Z(com.lingq.core.p012ui.R$string.purchase_item_details, new Object[]{Integer.valueOf(w61Var.f66443a), Integer.valueOf(w61Var.f66444b)}, tj3Var4), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var5 = (ye1) obj;
                                    int iIntValue4 = ((Integer) obj2).intValue();
                                    tj3 tj3Var5 = (tj3) ye1Var5;
                                    if (!tj3Var5.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        tj3Var5.m22102U();
                                    } else {
                                        x61 x61Var = (x61) z7dVar2;
                                        lw9.m16554b(vz1.m23618Z(com.lingq.core.p012ui.R$string.purchase_item_details, new Object[]{Integer.valueOf(x61Var.f67810a), Integer.valueOf(x61Var.f67811b)}, tj3Var5), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var5, 0, 0, 262142);
                                    }
                                    break;
                            }
                            return xfaVar;
                        }
                    }, tj3Var), null, 0L, 0L, 0L, 0L, null, tj3Var, 1772592, 16276);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(false);
                } else if (z7dVar instanceof v61) {
                    tj3Var.m22111b0(1930280539);
                    boolean z2 = (i4 & 112) == 32;
                    Object objM22097O3 = tj3Var.m22097O();
                    if (z2 || objM22097O3 == p84Var) {
                        objM22097O3 = new C3353mz(vi3Var, 24);
                        tj3Var.m22131l0(objM22097O3);
                    }
                    q2d.m19625a((ui3) objM22097O3, ci8.m4703P(-725207464, new dq0(vi3Var, 13), tj3Var), null, ci8.m4703P(-1648374890, new dq0(vi3Var, i3), tj3Var), null, ci8.m4703P(1723424980, new zi3() { // from class: d91
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            int i8 = i5;
                            xfa xfaVar = xfa.f68157a;
                            z7d z7dVar2 = z7dVar;
                            switch (i8) {
                                case 0:
                                    ye1 ye1Var2 = (ye1) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var2, ((v61) z7dVar2).f64910c ? R$string.premium_course : com.lingq.core.p012ui.R$string.premium_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                                    }
                                    break;
                                case 1:
                                    ye1 ye1Var3 = (ye1) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                    if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        tj3Var3.m22102U();
                                    } else {
                                        v61 v61Var = (v61) z7dVar2;
                                        lw9.m16554b(vz1.m23618Z(v61Var.f64910c ? R$string.not_enough_balance_purchase_course_details : com.lingq.core.p012ui.R$string.not_enough_balance_purchase_lesson_details, new Object[]{Integer.valueOf(v61Var.f64908a), Integer.valueOf(v61Var.f64909b)}, tj3Var3), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                                    }
                                    break;
                                case 2:
                                    ye1 ye1Var4 = (ye1) obj;
                                    int iIntValue3 = ((Integer) obj2).intValue();
                                    tj3 tj3Var4 = (tj3) ye1Var4;
                                    if (!tj3Var4.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        tj3Var4.m22102U();
                                    } else {
                                        w61 w61Var = (w61) z7dVar2;
                                        lw9.m16554b(vz1.m23618Z(com.lingq.core.p012ui.R$string.purchase_item_details, new Object[]{Integer.valueOf(w61Var.f66443a), Integer.valueOf(w61Var.f66444b)}, tj3Var4), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var5 = (ye1) obj;
                                    int iIntValue4 = ((Integer) obj2).intValue();
                                    tj3 tj3Var5 = (tj3) ye1Var5;
                                    if (!tj3Var5.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        tj3Var5.m22102U();
                                    } else {
                                        x61 x61Var = (x61) z7dVar2;
                                        lw9.m16554b(vz1.m23618Z(com.lingq.core.p012ui.R$string.purchase_item_details, new Object[]{Integer.valueOf(x61Var.f67810a), Integer.valueOf(x61Var.f67811b)}, tj3Var5), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var5, 0, 0, 262142);
                                    }
                                    break;
                            }
                            return xfaVar;
                        }
                    }, tj3Var), ci8.m4703P(-885642381, new zi3() { // from class: d91
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            int i8 = i6;
                            xfa xfaVar = xfa.f68157a;
                            z7d z7dVar2 = z7dVar;
                            switch (i8) {
                                case 0:
                                    ye1 ye1Var2 = (ye1) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var2, ((v61) z7dVar2).f64910c ? R$string.premium_course : com.lingq.core.p012ui.R$string.premium_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                                    }
                                    break;
                                case 1:
                                    ye1 ye1Var3 = (ye1) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                    if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        tj3Var3.m22102U();
                                    } else {
                                        v61 v61Var = (v61) z7dVar2;
                                        lw9.m16554b(vz1.m23618Z(v61Var.f64910c ? R$string.not_enough_balance_purchase_course_details : com.lingq.core.p012ui.R$string.not_enough_balance_purchase_lesson_details, new Object[]{Integer.valueOf(v61Var.f64908a), Integer.valueOf(v61Var.f64909b)}, tj3Var3), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                                    }
                                    break;
                                case 2:
                                    ye1 ye1Var4 = (ye1) obj;
                                    int iIntValue3 = ((Integer) obj2).intValue();
                                    tj3 tj3Var4 = (tj3) ye1Var4;
                                    if (!tj3Var4.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        tj3Var4.m22102U();
                                    } else {
                                        w61 w61Var = (w61) z7dVar2;
                                        lw9.m16554b(vz1.m23618Z(com.lingq.core.p012ui.R$string.purchase_item_details, new Object[]{Integer.valueOf(w61Var.f66443a), Integer.valueOf(w61Var.f66444b)}, tj3Var4), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var5 = (ye1) obj;
                                    int iIntValue4 = ((Integer) obj2).intValue();
                                    tj3 tj3Var5 = (tj3) ye1Var5;
                                    if (!tj3Var5.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        tj3Var5.m22102U();
                                    } else {
                                        x61 x61Var = (x61) z7dVar2;
                                        lw9.m16554b(vz1.m23618Z(com.lingq.core.p012ui.R$string.purchase_item_details, new Object[]{Integer.valueOf(x61Var.f67810a), Integer.valueOf(x61Var.f67811b)}, tj3Var5), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var5, 0, 0, 262142);
                                    }
                                    break;
                            }
                            return xfaVar;
                        }
                    }, tj3Var), null, 0L, 0L, 0L, 0L, null, tj3Var, 1772592, 16276);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(false);
                } else if (z7dVar instanceof z61) {
                    tj3Var.m22111b0(1931694325);
                    i6 = (i4 & 112) != 32 ? 0 : 1;
                    Object objM22097O4 = tj3Var.m22097O();
                    if (i6 != 0 || objM22097O4 == p84Var) {
                        objM22097O4 = new C3353mz(vi3Var, 20);
                        tj3Var.m22131l0(objM22097O4);
                    }
                    q2d.m19625a((ui3) objM22097O4, ci8.m4703P(-251688521, new dq0(vi3Var, i7), tj3Var), null, ci8.m4703P(-1174855947, new dq0(vi3Var, i2), tj3Var), null, null, sob.f61127k, null, 0L, 0L, 0L, 0L, null, tj3Var, 1575984, 16308);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(false);
                } else if (z7dVar instanceof y61) {
                    tj3Var.m22111b0(1932462970);
                    boolean z3 = (i4 & 112) == 32;
                    Object objM22097O5 = tj3Var.m22097O();
                    if (z3 || objM22097O5 == p84Var) {
                        objM22097O5 = new C3353mz(vi3Var, 21);
                        tj3Var.m22131l0(objM22097O5);
                    }
                    q2d.m19625a((ui3) objM22097O5, ci8.m4703P(221830422, new dq0(vi3Var, 5), tj3Var), null, ci8.m4703P(-701337004, new dq0(vi3Var, 6), tj3Var), null, null, sob.f61130n, null, 0L, 0L, 0L, 0L, null, tj3Var, 1575984, 16308);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(false);
                } else if (z7dVar instanceof u61) {
                    tj3Var.m22111b0(1933224640);
                    boolean z4 = (i4 & 112) == 32;
                    Object objM22097O6 = tj3Var.m22097O();
                    if (z4 || objM22097O6 == p84Var) {
                        objM22097O6 = new C3353mz(vi3Var, 22);
                        tj3Var.m22131l0(objM22097O6);
                    }
                    q2d.m19625a((ui3) objM22097O6, ci8.m4703P(695349365, new dq0(vi3Var, 8), tj3Var), null, ci8.m4703P(-227818061, new dq0(vi3Var, 9), tj3Var), null, sob.f61133q, sob.f61134r, null, 0L, 0L, 0L, 0L, null, tj3Var, 1772592, 16276);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(false);
                } else {
                    if (z7dVar != null) {
                        throw ux5.m23001x(tj3Var, 1032032176, false);
                    }
                    tj3Var.m22111b0(1032218852);
                    tj3Var.m22139q(false);
                }
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3598t4(z7dVar, i, 14, vi3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x038a  */
    /* JADX WARN: Code duplicated, block: B:82:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:83:0x02da  */
    /* JADX WARN: Code duplicated, block: B:86:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:90:0x030a  */
    /* JADX WARN: Code duplicated, block: B:94:0x034b  */
    /* JADX INFO: renamed from: b */
    public static final void m8935b(final LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath, final ud6 ud6Var, final w41 w41Var, bia biaVar, C2034d c2034d, ye1 ye1Var, int i) {
        tj3 tj3Var;
        C2034d c2034d2;
        C2034d c2034d3;
        ub5 ub5Var;
        Context context;
        Object obj;
        q91 q91Var;
        Object obj2;
        final t66 t66Var;
        Object obj3;
        final t66 t66Var2;
        final sc9 sc9Var;
        Context context2;
        t66 t66Var3;
        C2034d c2034d4;
        t66 t66Var4;
        t66 t66Var5;
        sc9 sc9Var2;
        Context context3;
        t66 t66Var6;
        t61 t61Var;
        boolean zM22124i;
        Object objM22097O;
        boolean zM22124i2;
        Object objM22097O2;
        boolean zM22120g;
        Object objM22097O3;
        t61 t61Var2;
        C2034d c2034d5;
        boolean zM22124i3;
        Object objM22097O4;
        ud6Var.getClass();
        w41Var.getClass();
        biaVar.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-383800108);
        int i2 = i | (tj3Var2.m22124i(lqAnalyticsValues$LessonPath) ? 4 : 2) | (tj3Var2.m22124i(ud6Var) ? 32 : 16) | (tj3Var2.m22124i(w41Var) ? 256 : 128) | (tj3Var2.m22124i(biaVar) ? 2048 : 1024) | 8192;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            tj3Var2.m22104W();
            if ((i & 1) == 0 || tj3Var2.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var2);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c2034d3 = (C2034d) pfa.m19114d(y38.m24933a(C2034d.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var2), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var2);
            } else {
                tj3Var2.m22102U();
                c2034d3 = c2034d;
            }
            tj3Var2.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2034d3.f25556O, tj3Var2);
            Context context4 = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            ub5 ub5Var2 = (ub5) tj3Var2.m22128k(gi5.f40854a);
            Object[] objArr = new Object[0];
            Object objM22097O5 = tj3Var2.m22097O();
            Object obj4 = we1.f66679a;
            if (objM22097O5 == obj4) {
                objM22097O5 = new C3072he(26);
                tj3Var2.m22131l0(objM22097O5);
            }
            final t66 t66Var7 = (t66) xwc.m24745R(objArr, (ui3) objM22097O5, tj3Var2, 48);
            Object[] objArr2 = new Object[0];
            Object objM22097O6 = tj3Var2.m22097O();
            if (objM22097O6 == obj4) {
                objM22097O6 = new C3072he(27);
                tj3Var2.m22131l0(objM22097O6);
            }
            sc9 sc9Var3 = (sc9) xwc.m24745R(objArr2, (ui3) objM22097O6, tj3Var2, 48);
            Object[] objArr3 = new Object[0];
            Object objM22097O7 = tj3Var2.m22097O();
            if (objM22097O7 == obj4) {
                objM22097O7 = new C3072he(28);
                tj3Var2.m22131l0(objM22097O7);
            }
            t66 t66Var8 = (t66) xwc.m24745R(objArr3, (ui3) objM22097O7, tj3Var2, 48);
            Object[] objArr4 = new Object[0];
            Object objM22097O8 = tj3Var2.m22097O();
            if (objM22097O8 == obj4) {
                objM22097O8 = new C3072he(29);
                tj3Var2.m22131l0(objM22097O8);
            }
            t66 t66Var9 = (t66) xwc.m24745R(objArr4, (ui3) objM22097O8, tj3Var2, 48);
            String str = ((q91) t66VarM2513c.getValue()).f57444f;
            boolean zM22120g2 = tj3Var2.m22120g(t66VarM2513c) | tj3Var2.m22124i(context4) | tj3Var2.m22124i(ud6Var) | tj3Var2.m22124i(c2034d3);
            Object objM22097O9 = tj3Var2.m22097O();
            if (zM22120g2 || objM22097O9 == obj4) {
                objM22097O9 = new CollectionScreenKt$CollectionRoute$1$1(context4, ud6Var, c2034d3, t66VarM2513c, null);
                tj3Var2.m22131l0(objM22097O9);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O9, str);
            t66 t66VarM1263m = AbstractC0278f.m1263m((q91) t66VarM2513c.getValue(), tj3Var2);
            boolean zM22124i4 = tj3Var2.m22124i(ud6Var) | tj3Var2.m22120g(t66VarM1263m) | tj3Var2.m22124i(c2034d3) | tj3Var2.m22124i(ub5Var2);
            Object objM22097O10 = tj3Var2.m22097O();
            if (zM22124i4 || objM22097O10 == obj4) {
                ub5Var = ub5Var2;
                C3445p2 c3445p2 = new C3445p2(ub5Var, ud6Var, c2034d3, t66VarM1263m, 7);
                tj3Var2.m22131l0(c3445p2);
                objM22097O10 = c3445p2;
            } else {
                ub5Var = ub5Var2;
            }
            d32.m10041h(ub5Var, (vi3) objM22097O10, tj3Var2);
            boolean zM22124i5 = tj3Var2.m22124i(c2034d3) | tj3Var2.m22124i(w41Var) | tj3Var2.m22124i(lqAnalyticsValues$LessonPath);
            Object objM22097O11 = tj3Var2.m22097O();
            if (zM22124i5 || objM22097O11 == obj4) {
                objM22097O11 = new ik0(c2034d3, w41Var, lqAnalyticsValues$LessonPath, 8);
                tj3Var2.m22131l0(objM22097O11);
            }
            final aj3 aj3Var = (aj3) objM22097O11;
            q91 q91Var2 = (q91) t66VarM2513c.getValue();
            boolean zM22124i6 = tj3Var2.m22124i(c2034d3);
            Object objM22097O12 = tj3Var2.m22097O();
            if (zM22124i6 || objM22097O12 == obj4) {
                context = context4;
                obj = obj4;
                q91Var = q91Var2;
                CollectionScreenKt$CollectionRoute$3$1 collectionScreenKt$CollectionRoute$3$1 = new CollectionScreenKt$CollectionRoute$3$1(1, c2034d3, C2034d.class, "handleAction", "handleAction(Lcom/lingq/feature/collections/data/CollectionActions;)V", 0);
                tj3Var2.m22131l0(collectionScreenKt$CollectionRoute$3$1);
                objM22097O12 = collectionScreenKt$CollectionRoute$3$1;
            } else {
                obj = obj4;
                q91Var = q91Var2;
                context = context4;
            }
            vi3 vi3Var = (vi3) ((FunctionReference) objM22097O12);
            final Context context5 = context;
            boolean zM22124i7 = tj3Var2.m22124i(ud6Var) | tj3Var2.m22120g(aj3Var) | tj3Var2.m22124i(w41Var) | tj3Var2.m22124i(lqAnalyticsValues$LessonPath) | tj3Var2.m22120g(sc9Var3) | tj3Var2.m22120g(t66Var8) | tj3Var2.m22120g(t66Var9) | tj3Var2.m22120g(t66Var7) | tj3Var2.m22124i(context5) | tj3Var2.m22124i(c2034d3);
            Object objM22097O13 = tj3Var2.m22097O();
            if (zM22124i7) {
                obj2 = obj;
            } else {
                obj2 = obj;
                if (objM22097O13 != obj2) {
                    t66Var3 = t66Var7;
                    t66Var = t66Var8;
                    sc9Var = sc9Var3;
                    obj3 = obj2;
                    context2 = context5;
                    t66Var2 = t66Var9;
                    c2034d4 = c2034d3;
                }
                m8937d(q91Var, vi3Var, (vi3) objM22097O13, tj3Var2, 0);
                t66Var4 = t66Var2;
                t66Var5 = t66Var3;
                sc9Var2 = sc9Var;
                context3 = context2;
                t66Var6 = t66Var;
                d32.m10060t(((Boolean) t66Var3.getValue()).booleanValue(), sc9Var.m21222h(), (String) t66Var.getValue(), ((Boolean) t66Var2.getValue()).booleanValue(), false, new i91(t66Var3, biaVar, 0), null, tj3Var2, 0, 80);
                t61Var = ((q91) t66VarM2513c.getValue()).f57442d;
                if (t61Var == null) {
                    tj3Var2.m22111b0(-578176117);
                    tj3Var2.m22139q(false);
                    tj3Var = tj3Var2;
                    c2034d5 = c2034d4;
                } else {
                    tj3Var2.m22111b0(-578176116);
                    zM22124i = tj3Var2.m22124i(c2034d4);
                    objM22097O = tj3Var2.m22097O();
                    if (zM22124i || objM22097O == obj3) {
                        objM22097O = new C3539rk(c2034d4, 6);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    ui3 ui3Var = (ui3) objM22097O;
                    zM22124i2 = tj3Var2.m22124i(c2034d4) | tj3Var2.m22120g(t61Var);
                    objM22097O2 = tj3Var2.m22097O();
                    if (zM22124i2 || objM22097O2 == obj3) {
                        objM22097O2 = new s70(23, c2034d4, t61Var);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    vi3 vi3Var2 = (vi3) objM22097O2;
                    zM22120g = tj3Var2.m22120g(t66Var5) | tj3Var2.m22120g(sc9Var2) | tj3Var2.m22120g(t61Var) | tj3Var2.m22120g(t66Var6) | tj3Var2.m22120g(t66Var4) | tj3Var2.m22124i(w41Var) | tj3Var2.m22124i(context3) | tj3Var2.m22124i(c2034d4);
                    objM22097O3 = tj3Var2.m22097O();
                    if (!zM22120g || objM22097O3 == obj3) {
                        t61Var2 = t61Var;
                        C2034d c2034d6 = c2034d4;
                        c91 c91Var = new c91(t61Var2, w41Var, context3, c2034d6, t66Var5, sc9Var2, t66Var6, t66Var4);
                        c2034d5 = c2034d6;
                        tj3Var2.m22131l0(c91Var);
                        objM22097O3 = c91Var;
                    } else {
                        t61Var2 = t61Var;
                        c2034d5 = c2034d4;
                    }
                    y7d.m24982a(t61Var2, ui3Var, vi3Var2, (vi3) objM22097O3, tj3Var2, 0);
                    tj3Var = tj3Var2;
                    tj3Var.m22139q(false);
                }
                z7d z7dVar = ((q91) t66VarM2513c.getValue()).f57443e;
                zM22124i3 = tj3Var.m22124i(c2034d5);
                objM22097O4 = tj3Var.m22097O();
                if (!zM22124i3 || objM22097O4 == obj3) {
                    c2034d2 = c2034d5;
                    CollectionScreenKt$CollectionRoute$7$1 collectionScreenKt$CollectionRoute$7$1 = new CollectionScreenKt$CollectionRoute$7$1(1, c2034d2, C2034d.class, "handleAction", "handleAction(Lcom/lingq/feature/collections/data/CollectionActions;)V", 0);
                    tj3Var.m22131l0(collectionScreenKt$CollectionRoute$7$1);
                    objM22097O4 = collectionScreenKt$CollectionRoute$7$1;
                } else {
                    c2034d2 = c2034d5;
                }
                m8934a(z7dVar, (vi3) ((FunctionReference) objM22097O4), tj3Var, 0);
            }
            t66Var = t66Var8;
            obj3 = obj2;
            final C2034d c2034d7 = c2034d3;
            t66Var2 = t66Var9;
            sc9Var = sc9Var3;
            vi3 vi3Var3 = new vi3() { // from class: h91
                @Override // p000.vi3
                public final Object invoke(Object obj5) {
                    v81 v81Var = (v81) obj5;
                    v81Var.getClass();
                    if (v81Var.equals(m81.f50745a)) {
                        ud6Var.m22689f();
                    } else {
                        boolean z = v81Var instanceof p81;
                        aj3 aj3Var2 = aj3Var;
                        if (z) {
                            p81 p81Var = (p81) v81Var;
                            h81 h81Var = p81Var.f55721a;
                            aj3Var2.invoke(h81Var.f41930a, Boolean.valueOf(p81Var.f55722b), h81Var.f41935f);
                        } else {
                            boolean z2 = v81Var instanceof r81;
                            w41 w41Var2 = w41Var;
                            if (z2) {
                                h81 h81Var2 = ((r81) v81Var).f58870a;
                                LibraryItem libraryItem = h81Var2.f41930a;
                                int i3 = libraryItem.f19426a;
                                String str2 = libraryItem.f19433e;
                                String str3 = str2 == null ? "" : str2;
                                String str4 = libraryItem.f19436h;
                                String str5 = str4 == null ? "" : str4;
                                String str6 = libraryItem.f19409J;
                                String str7 = (str6 == null && (str6 = libraryItem.f19402C) == null) ? "" : str6;
                                String str8 = libraryItem.f19434f;
                                w41Var2.m23737z(new da6(i3, str3, str5, str7, str8 == null ? "" : str8, LessonInfoSource.Course, h81Var2.f41935f));
                            } else {
                                if (v81Var instanceof q81) {
                                    h81 h81Var3 = ((q81) v81Var).f57376a;
                                    Integer num = h81Var3.f41930a.f19441m;
                                    int iIntValue = num != null ? num.intValue() : 0;
                                    LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath2 = lqAnalyticsValues$LessonPath;
                                    if (lqAnalyticsValues$LessonPath2 == null) {
                                        lqAnalyticsValues$LessonPath2 = LqAnalyticsValues$LessonPath.Unknown.f14315a;
                                    }
                                    w41Var2.m23737z(new s96(iIntValue, h81Var3.f41935f, lqAnalyticsValues$LessonPath2));
                                } else {
                                    boolean z3 = v81Var instanceof l81;
                                    sc9 sc9Var4 = sc9Var;
                                    t66 t66Var10 = t66Var;
                                    t66 t66Var11 = t66Var2;
                                    t66 t66Var12 = t66Var7;
                                    if (z3) {
                                        h81 h81Var4 = ((l81) v81Var).f49289a;
                                        sc9Var4.m21223i(h81Var4.f41930a.f19426a);
                                        String str9 = h81Var4.f41930a.f19430c;
                                        t66Var10.setValue(str9 != null ? str9 : "");
                                        t66Var11.setValue(Boolean.FALSE);
                                        AbstractC2030a.m8936c(t66Var12, true);
                                    } else {
                                        boolean z4 = v81Var instanceof t81;
                                        Context context6 = context5;
                                        if (z4) {
                                            String str10 = ((t81) v81Var).f61974a.f41930a.f19433e;
                                            new qn2(context6, str10 != null ? str10 : "", new C3598t4(15, c2034d7, v81Var)).m20043h();
                                        } else if (v81Var instanceof u81) {
                                            h81 h81Var5 = ((u81) v81Var).f63536a;
                                            aj3Var2.invoke(h81Var5.f41930a, Boolean.TRUE, h81Var5.f41935f);
                                        } else if (v81Var instanceof k81) {
                                            k81 k81Var = (k81) v81Var;
                                            sc9Var4.m21223i(k81Var.f46847a);
                                            t66Var10.setValue(k81Var.f46848b);
                                            t66Var11.setValue(Boolean.TRUE);
                                            AbstractC2030a.m8936c(t66Var12, true);
                                        } else if (v81Var instanceof s81) {
                                            Activity activity = context6 instanceof Activity ? (Activity) context6 : null;
                                            if (activity != null) {
                                                mbd.m16755c(activity, ((s81) v81Var).f60503a, null, 26);
                                            }
                                        } else if (v81Var instanceof o81) {
                                            String str11 = ((o81) v81Var).f53967a;
                                            Object systemService = context6.getSystemService("clipboard");
                                            systemService.getClass();
                                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Course Link", str11));
                                            Toast.makeText(context6, context6.getString(com.lingq.core.p012ui.R$string.share_copied_clipboard), 0).show();
                                        } else {
                                            if (!v81Var.equals(n81.f52475a)) {
                                                gm5.m12750e();
                                                return null;
                                            }
                                            Activity activity2 = context6 instanceof Activity ? (Activity) context6 : null;
                                            if (activity2 != null) {
                                                mbd.m16755c(activity2, "https://forum.lingq.com/t/how-to-remove-courses-or-content-sources-from-your-library-feed/87124", null, 26);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return xfa.f68157a;
                }
            };
            context2 = context5;
            t66Var3 = t66Var7;
            c2034d4 = c2034d7;
            tj3Var2.m22131l0(vi3Var3);
            objM22097O13 = vi3Var3;
            m8937d(q91Var, vi3Var, (vi3) objM22097O13, tj3Var2, 0);
            t66Var4 = t66Var2;
            t66Var5 = t66Var3;
            sc9Var2 = sc9Var;
            context3 = context2;
            t66Var6 = t66Var;
            d32.m10060t(((Boolean) t66Var3.getValue()).booleanValue(), sc9Var.m21222h(), (String) t66Var.getValue(), ((Boolean) t66Var2.getValue()).booleanValue(), false, new i91(t66Var3, biaVar, 0), null, tj3Var2, 0, 80);
            t61Var = ((q91) t66VarM2513c.getValue()).f57442d;
            if (t61Var == null) {
                tj3Var2.m22111b0(-578176117);
                tj3Var2.m22139q(false);
                tj3Var = tj3Var2;
                c2034d5 = c2034d4;
            } else {
                tj3Var2.m22111b0(-578176116);
                zM22124i = tj3Var2.m22124i(c2034d4);
                objM22097O = tj3Var2.m22097O();
                if (zM22124i) {
                    objM22097O = new C3539rk(c2034d4, 6);
                    tj3Var2.m22131l0(objM22097O);
                } else {
                    objM22097O = new C3539rk(c2034d4, 6);
                    tj3Var2.m22131l0(objM22097O);
                }
                ui3 ui3Var2 = (ui3) objM22097O;
                zM22124i2 = tj3Var2.m22124i(c2034d4) | tj3Var2.m22120g(t61Var);
                objM22097O2 = tj3Var2.m22097O();
                if (zM22124i2) {
                    objM22097O2 = new s70(23, c2034d4, t61Var);
                    tj3Var2.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new s70(23, c2034d4, t61Var);
                    tj3Var2.m22131l0(objM22097O2);
                }
                vi3 vi3Var4 = (vi3) objM22097O2;
                zM22120g = tj3Var2.m22120g(t66Var5) | tj3Var2.m22120g(sc9Var2) | tj3Var2.m22120g(t61Var) | tj3Var2.m22120g(t66Var6) | tj3Var2.m22120g(t66Var4) | tj3Var2.m22124i(w41Var) | tj3Var2.m22124i(context3) | tj3Var2.m22124i(c2034d4);
                objM22097O3 = tj3Var2.m22097O();
                if (zM22120g) {
                    t61Var2 = t61Var;
                    C2034d c2034d8 = c2034d4;
                    c91 c91Var2 = new c91(t61Var2, w41Var, context3, c2034d8, t66Var5, sc9Var2, t66Var6, t66Var4);
                    c2034d5 = c2034d8;
                    tj3Var2.m22131l0(c91Var2);
                    objM22097O3 = c91Var2;
                } else {
                    t61Var2 = t61Var;
                    C2034d c2034d9 = c2034d4;
                    c91 c91Var3 = new c91(t61Var2, w41Var, context3, c2034d9, t66Var5, sc9Var2, t66Var6, t66Var4);
                    c2034d5 = c2034d9;
                    tj3Var2.m22131l0(c91Var3);
                    objM22097O3 = c91Var3;
                }
                y7d.m24982a(t61Var2, ui3Var2, vi3Var4, (vi3) objM22097O3, tj3Var2, 0);
                tj3Var = tj3Var2;
                tj3Var.m22139q(false);
            }
            z7d z7dVar2 = ((q91) t66VarM2513c.getValue()).f57443e;
            zM22124i3 = tj3Var.m22124i(c2034d5);
            objM22097O4 = tj3Var.m22097O();
            if (zM22124i3) {
                c2034d2 = c2034d5;
                CollectionScreenKt$CollectionRoute$7$1 collectionScreenKt$CollectionRoute$7$2 = new CollectionScreenKt$CollectionRoute$7$1(1, c2034d2, C2034d.class, "handleAction", "handleAction(Lcom/lingq/feature/collections/data/CollectionActions;)V", 0);
                tj3Var.m22131l0(collectionScreenKt$CollectionRoute$7$2);
                objM22097O4 = collectionScreenKt$CollectionRoute$7$2;
            } else {
                c2034d2 = c2034d5;
                CollectionScreenKt$CollectionRoute$7$1 collectionScreenKt$CollectionRoute$7$3 = new CollectionScreenKt$CollectionRoute$7$1(1, c2034d2, C2034d.class, "handleAction", "handleAction(Lcom/lingq/feature/collections/data/CollectionActions;)V", 0);
                tj3Var.m22131l0(collectionScreenKt$CollectionRoute$7$3);
                objM22097O4 = collectionScreenKt$CollectionRoute$7$3;
            }
            m8934a(z7dVar2, (vi3) ((FunctionReference) objM22097O4), tj3Var, 0);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            c2034d2 = c2034d;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xy0(lqAnalyticsValues$LessonPath, ud6Var, w41Var, biaVar, c2034d2, i, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8936c(t66 t66Var, boolean z) {
        t66Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: d */
    public static final void m8937d(q91 q91Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1197142766);
        int i2 = (tj3Var2.m22124i(q91Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var2) ? 256 : 128;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            C0127b c0127bM17056a = mv4.m17056a(0, tj3Var2, 3);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            Object objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1258h(0L);
                tj3Var2.m22131l0(objM22097O2);
            }
            uc9 uc9Var = (uc9) objM22097O2;
            Boolean boolValueOf = Boolean.valueOf(q91Var.f57441c);
            Boolean bool = (Boolean) t66Var.getValue();
            bool.booleanValue();
            boolean zM22124i = tj3Var2.m22124i(q91Var);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22124i || objM22097O3 == p84Var) {
                objM22097O3 = new CollectionScreenKt$CollectionScreen$1$1(q91Var, t66Var, uc9Var, null);
                tj3Var2.m22131l0(objM22097O3);
            }
            d32.m10049l(boolValueOf, bool, (zi3) objM22097O3, tj3Var2);
            AbstractC2033a.m8939a(c0127bM17056a, vi3Var, tj3Var2, i2 & 112);
            tj3Var = tj3Var2;
            b34.m3232b(null, ci8.m4703P(-66227798, new C3836zk(q91Var, vi3Var2, vi3Var, 5), tj3Var2), null, null, null, 0, 0L, 0L, null, ci8.m4703P(1743106687, new ys0(q91Var, vi3Var, t66Var, uc9Var, c0127bM17056a, vi3Var2, 1), tj3Var2), tj3Var, 805306416, 509);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 10, q91Var, vi3Var, vi3Var2);
        }
    }
}
