package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$string;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b05 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7723a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d05 f7724b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f7725c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gf5 f7726d;

    public /* synthetic */ b05(vi3 vi3Var, gf5 gf5Var, d05 d05Var, int i) {
        this.f7723a = i;
        this.f7725c = vi3Var;
        this.f7726d = gf5Var;
        this.f7724b = d05Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f7723a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        b16 b16Var = b16.f7762a;
        vi3 vi3Var = this.f7725c;
        final d05 d05Var = this.f7724b;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    boolean zM22120g = tj3Var.m22120g(vi3Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new fl4(vi3Var, 19);
                        tj3Var.m22131l0(objM22097O);
                    }
                    final int i4 = 5;
                    of5.m17959a(ci8.m4703P(85683106, new zi3() { // from class: c05
                        @Override // p000.zi3
                        public final Object invoke(Object obj4, Object obj5) {
                            int i5 = i4;
                            b16 b16Var2 = b16.f7762a;
                            xfa xfaVar2 = xfa.f68157a;
                            d05 d05Var2 = d05Var;
                            switch (i5) {
                                case 0:
                                    ye1 ye1Var2 = (ye1) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var2, d05Var2.f34796a ? R$string.lingq_likes_past : R$string.lingq_like_present), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                                    }
                                    break;
                                case 1:
                                    ye1 ye1Var3 = (ye1) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                    if (!tj3Var3.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                        tj3Var3.m22102U();
                                    } else {
                                        y27 y27VarM18236U = AbstractC3423or.m18236U(d05Var2.f34796a ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var3, 0);
                                        ((fe9) tj3Var3.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var3, 56, 8);
                                    }
                                    break;
                                case 2:
                                    ye1 ye1Var4 = (ye1) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    tj3 tj3Var4 = (tj3) ye1Var4;
                                    if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        tj3Var4.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var4, d05Var2.f34797b ? R$string.lingq_import_lesson : R$string.lingq_open_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
                                    }
                                    break;
                                case 3:
                                    ye1 ye1Var5 = (ye1) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    tj3 tj3Var5 = (tj3) ye1Var5;
                                    if (!tj3Var5.m22099R(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                                        tj3Var5.m22102U();
                                    } else {
                                        y27 y27VarM18236U2 = AbstractC3423or.m18236U(d05Var2.f34797b ? R$drawable.ic_import_s : R$drawable.ic_lesson_s, tj3Var5, 0);
                                        ((fe9) tj3Var5.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U2, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var5, 56, 8);
                                    }
                                    break;
                                case 4:
                                    ye1 ye1Var6 = (ye1) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    tj3 tj3Var6 = (tj3) ye1Var6;
                                    if (!tj3Var6.m22099R(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                                        tj3Var6.m22102U();
                                    } else {
                                        y27 y27VarM18236U3 = AbstractC3423or.m18236U(d05Var2.f34798c ? R$drawable.ic_trash : R$drawable.ic_bookmark, tj3Var6, 0);
                                        ((fe9) tj3Var6.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U3, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var6, 56, 8);
                                    }
                                    break;
                                case 5:
                                    ye1 ye1Var7 = (ye1) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    tj3 tj3Var7 = (tj3) ye1Var7;
                                    if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        tj3Var7.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var7, d05Var2.f34804i ? R$string.content_unarchive : R$string.content_archive), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var7, 0, 0, 262142);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var8 = (ye1) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    tj3 tj3Var8 = (tj3) ye1Var8;
                                    if (!tj3Var8.m22099R(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                                        tj3Var8.m22102U();
                                    } else {
                                        y27 y27VarM18236U4 = AbstractC3423or.m18236U(d05Var2.f34802g ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var8, 0);
                                        ((fe9) tj3Var8.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U4, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var8, 56, 8);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }, tj3Var), AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15), jtb.f46143g, this.f7726d, tj3Var, 24582, 428);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    int i5 = d05Var.f34802g ? R$string.course_unsubscribe : R$string.course_subscribe_lesson;
                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new fl4(vi3Var, 21);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    final int i6 = 6;
                    of5.m17959a(ci8.m4703P(2145605603, new ex0(i5, 9), tj3Var2), AbstractC0080f.m815b(null, false, (ui3) objM22097O2, b16Var, 15), ci8.m4703P(-237710873, new zi3() { // from class: c05
                        @Override // p000.zi3
                        public final Object invoke(Object obj4, Object obj5) {
                            int i7 = i6;
                            b16 b16Var2 = b16.f7762a;
                            xfa xfaVar2 = xfa.f68157a;
                            d05 d05Var2 = d05Var;
                            switch (i7) {
                                case 0:
                                    ye1 ye1Var3 = (ye1) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                    if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        tj3Var3.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var3, d05Var2.f34796a ? R$string.lingq_likes_past : R$string.lingq_like_present), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                                    }
                                    break;
                                case 1:
                                    ye1 ye1Var4 = (ye1) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    tj3 tj3Var4 = (tj3) ye1Var4;
                                    if (!tj3Var4.m22099R(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                                        tj3Var4.m22102U();
                                    } else {
                                        y27 y27VarM18236U = AbstractC3423or.m18236U(d05Var2.f34796a ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var4, 0);
                                        ((fe9) tj3Var4.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var4, 56, 8);
                                    }
                                    break;
                                case 2:
                                    ye1 ye1Var5 = (ye1) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    tj3 tj3Var5 = (tj3) ye1Var5;
                                    if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        tj3Var5.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var5, d05Var2.f34797b ? R$string.lingq_import_lesson : R$string.lingq_open_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var5, 0, 0, 262142);
                                    }
                                    break;
                                case 3:
                                    ye1 ye1Var6 = (ye1) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    tj3 tj3Var6 = (tj3) ye1Var6;
                                    if (!tj3Var6.m22099R(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                                        tj3Var6.m22102U();
                                    } else {
                                        y27 y27VarM18236U2 = AbstractC3423or.m18236U(d05Var2.f34797b ? R$drawable.ic_import_s : R$drawable.ic_lesson_s, tj3Var6, 0);
                                        ((fe9) tj3Var6.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U2, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var6, 56, 8);
                                    }
                                    break;
                                case 4:
                                    ye1 ye1Var7 = (ye1) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    tj3 tj3Var7 = (tj3) ye1Var7;
                                    if (!tj3Var7.m22099R(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                                        tj3Var7.m22102U();
                                    } else {
                                        y27 y27VarM18236U3 = AbstractC3423or.m18236U(d05Var2.f34798c ? R$drawable.ic_trash : R$drawable.ic_bookmark, tj3Var7, 0);
                                        ((fe9) tj3Var7.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U3, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var7, 56, 8);
                                    }
                                    break;
                                case 5:
                                    ye1 ye1Var8 = (ye1) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    tj3 tj3Var8 = (tj3) ye1Var8;
                                    if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        tj3Var8.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var8, d05Var2.f34804i ? R$string.content_unarchive : R$string.content_archive), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var8, 0, 0, 262142);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var9 = (ye1) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    tj3 tj3Var9 = (tj3) ye1Var9;
                                    if (!tj3Var9.m22099R(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                                        tj3Var9.m22102U();
                                    } else {
                                        y27 y27VarM18236U4 = AbstractC3423or.m18236U(d05Var2.f34802g ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var9, 0);
                                        ((fe9) tj3Var9.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U4, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var9, 56, 8);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }, tj3Var2), this.f7726d, tj3Var2, 24582, 428);
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    tj3Var3.m22102U();
                } else {
                    boolean zM22120g3 = tj3Var3.m22120g(vi3Var);
                    Object objM22097O3 = tj3Var3.m22097O();
                    if (zM22120g3 || objM22097O3 == p84Var) {
                        objM22097O3 = new fl4(vi3Var, 14);
                        tj3Var3.m22131l0(objM22097O3);
                    }
                    e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O3, b16Var, 15);
                    final int i7 = 2;
                    C0282a c0282aM4703P = ci8.m4703P(791726917, new zi3() { // from class: c05
                        @Override // p000.zi3
                        public final Object invoke(Object obj4, Object obj5) {
                            int i8 = i7;
                            b16 b16Var2 = b16.f7762a;
                            xfa xfaVar2 = xfa.f68157a;
                            d05 d05Var2 = d05Var;
                            switch (i8) {
                                case 0:
                                    ye1 ye1Var4 = (ye1) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    tj3 tj3Var4 = (tj3) ye1Var4;
                                    if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        tj3Var4.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var4, d05Var2.f34796a ? R$string.lingq_likes_past : R$string.lingq_like_present), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
                                    }
                                    break;
                                case 1:
                                    ye1 ye1Var5 = (ye1) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    tj3 tj3Var5 = (tj3) ye1Var5;
                                    if (!tj3Var5.m22099R(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                                        tj3Var5.m22102U();
                                    } else {
                                        y27 y27VarM18236U = AbstractC3423or.m18236U(d05Var2.f34796a ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var5, 0);
                                        ((fe9) tj3Var5.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var5, 56, 8);
                                    }
                                    break;
                                case 2:
                                    ye1 ye1Var6 = (ye1) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    tj3 tj3Var6 = (tj3) ye1Var6;
                                    if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        tj3Var6.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var6, d05Var2.f34797b ? R$string.lingq_import_lesson : R$string.lingq_open_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var6, 0, 0, 262142);
                                    }
                                    break;
                                case 3:
                                    ye1 ye1Var7 = (ye1) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    tj3 tj3Var7 = (tj3) ye1Var7;
                                    if (!tj3Var7.m22099R(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                                        tj3Var7.m22102U();
                                    } else {
                                        y27 y27VarM18236U2 = AbstractC3423or.m18236U(d05Var2.f34797b ? R$drawable.ic_import_s : R$drawable.ic_lesson_s, tj3Var7, 0);
                                        ((fe9) tj3Var7.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U2, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var7, 56, 8);
                                    }
                                    break;
                                case 4:
                                    ye1 ye1Var8 = (ye1) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    tj3 tj3Var8 = (tj3) ye1Var8;
                                    if (!tj3Var8.m22099R(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                                        tj3Var8.m22102U();
                                    } else {
                                        y27 y27VarM18236U3 = AbstractC3423or.m18236U(d05Var2.f34798c ? R$drawable.ic_trash : R$drawable.ic_bookmark, tj3Var8, 0);
                                        ((fe9) tj3Var8.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U3, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var8, 56, 8);
                                    }
                                    break;
                                case 5:
                                    ye1 ye1Var9 = (ye1) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    tj3 tj3Var9 = (tj3) ye1Var9;
                                    if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        tj3Var9.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var9, d05Var2.f34804i ? R$string.content_unarchive : R$string.content_archive), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var9, 0, 0, 262142);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var10 = (ye1) obj4;
                                    int iIntValue10 = ((Integer) obj5).intValue();
                                    tj3 tj3Var10 = (tj3) ye1Var10;
                                    if (!tj3Var10.m22099R(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                                        tj3Var10.m22102U();
                                    } else {
                                        y27 y27VarM18236U4 = AbstractC3423or.m18236U(d05Var2.f34802g ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var10, 0);
                                        ((fe9) tj3Var10.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U4, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var10, 56, 8);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }, tj3Var3);
                    final int i8 = 3;
                    of5.m17959a(c0282aM4703P, e16VarM815b, ci8.m4703P(609106505, new zi3() { // from class: c05
                        @Override // p000.zi3
                        public final Object invoke(Object obj4, Object obj5) {
                            int i9 = i8;
                            b16 b16Var2 = b16.f7762a;
                            xfa xfaVar2 = xfa.f68157a;
                            d05 d05Var2 = d05Var;
                            switch (i9) {
                                case 0:
                                    ye1 ye1Var4 = (ye1) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    tj3 tj3Var4 = (tj3) ye1Var4;
                                    if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        tj3Var4.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var4, d05Var2.f34796a ? R$string.lingq_likes_past : R$string.lingq_like_present), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
                                    }
                                    break;
                                case 1:
                                    ye1 ye1Var5 = (ye1) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    tj3 tj3Var5 = (tj3) ye1Var5;
                                    if (!tj3Var5.m22099R(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                                        tj3Var5.m22102U();
                                    } else {
                                        y27 y27VarM18236U = AbstractC3423or.m18236U(d05Var2.f34796a ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var5, 0);
                                        ((fe9) tj3Var5.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var5, 56, 8);
                                    }
                                    break;
                                case 2:
                                    ye1 ye1Var6 = (ye1) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    tj3 tj3Var6 = (tj3) ye1Var6;
                                    if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        tj3Var6.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var6, d05Var2.f34797b ? R$string.lingq_import_lesson : R$string.lingq_open_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var6, 0, 0, 262142);
                                    }
                                    break;
                                case 3:
                                    ye1 ye1Var7 = (ye1) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    tj3 tj3Var7 = (tj3) ye1Var7;
                                    if (!tj3Var7.m22099R(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                                        tj3Var7.m22102U();
                                    } else {
                                        y27 y27VarM18236U2 = AbstractC3423or.m18236U(d05Var2.f34797b ? R$drawable.ic_import_s : R$drawable.ic_lesson_s, tj3Var7, 0);
                                        ((fe9) tj3Var7.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U2, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var7, 56, 8);
                                    }
                                    break;
                                case 4:
                                    ye1 ye1Var8 = (ye1) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    tj3 tj3Var8 = (tj3) ye1Var8;
                                    if (!tj3Var8.m22099R(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                                        tj3Var8.m22102U();
                                    } else {
                                        y27 y27VarM18236U3 = AbstractC3423or.m18236U(d05Var2.f34798c ? R$drawable.ic_trash : R$drawable.ic_bookmark, tj3Var8, 0);
                                        ((fe9) tj3Var8.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U3, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var8, 56, 8);
                                    }
                                    break;
                                case 5:
                                    ye1 ye1Var9 = (ye1) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    tj3 tj3Var9 = (tj3) ye1Var9;
                                    if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        tj3Var9.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var9, d05Var2.f34804i ? R$string.content_unarchive : R$string.content_archive), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var9, 0, 0, 262142);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var10 = (ye1) obj4;
                                    int iIntValue10 = ((Integer) obj5).intValue();
                                    tj3 tj3Var10 = (tj3) ye1Var10;
                                    if (!tj3Var10.m22099R(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                                        tj3Var10.m22102U();
                                    } else {
                                        y27 y27VarM18236U4 = AbstractC3423or.m18236U(d05Var2.f34802g ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var10, 0);
                                        ((fe9) tj3Var10.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U4, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var10, 56, 8);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }, tj3Var3), this.f7726d, tj3Var3, 24582, 428);
                }
                break;
            case 3:
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    tj3Var4.m22102U();
                } else {
                    boolean zM22120g4 = tj3Var4.m22120g(vi3Var);
                    Object objM22097O4 = tj3Var4.m22097O();
                    if (zM22120g4 || objM22097O4 == p84Var) {
                        objM22097O4 = new fl4(vi3Var, 13);
                        tj3Var4.m22131l0(objM22097O4);
                    }
                    of5.m17959a(ci8.m4703P(616604615, new zi3() { // from class: c05
                        @Override // p000.zi3
                        public final Object invoke(Object obj4, Object obj5) {
                            int i9 = i3;
                            b16 b16Var2 = b16.f7762a;
                            xfa xfaVar2 = xfa.f68157a;
                            d05 d05Var2 = d05Var;
                            switch (i9) {
                                case 0:
                                    ye1 ye1Var5 = (ye1) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    tj3 tj3Var5 = (tj3) ye1Var5;
                                    if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        tj3Var5.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var5, d05Var2.f34796a ? R$string.lingq_likes_past : R$string.lingq_like_present), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var5, 0, 0, 262142);
                                    }
                                    break;
                                case 1:
                                    ye1 ye1Var6 = (ye1) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    tj3 tj3Var6 = (tj3) ye1Var6;
                                    if (!tj3Var6.m22099R(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                                        tj3Var6.m22102U();
                                    } else {
                                        y27 y27VarM18236U = AbstractC3423or.m18236U(d05Var2.f34796a ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var6, 0);
                                        ((fe9) tj3Var6.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var6, 56, 8);
                                    }
                                    break;
                                case 2:
                                    ye1 ye1Var7 = (ye1) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    tj3 tj3Var7 = (tj3) ye1Var7;
                                    if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        tj3Var7.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var7, d05Var2.f34797b ? R$string.lingq_import_lesson : R$string.lingq_open_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var7, 0, 0, 262142);
                                    }
                                    break;
                                case 3:
                                    ye1 ye1Var8 = (ye1) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    tj3 tj3Var8 = (tj3) ye1Var8;
                                    if (!tj3Var8.m22099R(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                                        tj3Var8.m22102U();
                                    } else {
                                        y27 y27VarM18236U2 = AbstractC3423or.m18236U(d05Var2.f34797b ? R$drawable.ic_import_s : R$drawable.ic_lesson_s, tj3Var8, 0);
                                        ((fe9) tj3Var8.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U2, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var8, 56, 8);
                                    }
                                    break;
                                case 4:
                                    ye1 ye1Var9 = (ye1) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    tj3 tj3Var9 = (tj3) ye1Var9;
                                    if (!tj3Var9.m22099R(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                                        tj3Var9.m22102U();
                                    } else {
                                        y27 y27VarM18236U3 = AbstractC3423or.m18236U(d05Var2.f34798c ? R$drawable.ic_trash : R$drawable.ic_bookmark, tj3Var9, 0);
                                        ((fe9) tj3Var9.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U3, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var9, 56, 8);
                                    }
                                    break;
                                case 5:
                                    ye1 ye1Var10 = (ye1) obj4;
                                    int iIntValue10 = ((Integer) obj5).intValue();
                                    tj3 tj3Var10 = (tj3) ye1Var10;
                                    if (!tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                                        tj3Var10.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var10, d05Var2.f34804i ? R$string.content_unarchive : R$string.content_archive), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var10, 0, 0, 262142);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var11 = (ye1) obj4;
                                    int iIntValue11 = ((Integer) obj5).intValue();
                                    tj3 tj3Var11 = (tj3) ye1Var11;
                                    if (!tj3Var11.m22099R(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                                        tj3Var11.m22102U();
                                    } else {
                                        y27 y27VarM18236U4 = AbstractC3423or.m18236U(d05Var2.f34802g ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var11, 0);
                                        ((fe9) tj3Var11.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U4, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var11, 56, 8);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }, tj3Var4), AbstractC0080f.m815b(null, false, (ui3) objM22097O4, b16Var, 15), ci8.m4703P(433984203, new zi3() { // from class: c05
                        @Override // p000.zi3
                        public final Object invoke(Object obj4, Object obj5) {
                            int i9 = i2;
                            b16 b16Var2 = b16.f7762a;
                            xfa xfaVar2 = xfa.f68157a;
                            d05 d05Var2 = d05Var;
                            switch (i9) {
                                case 0:
                                    ye1 ye1Var5 = (ye1) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    tj3 tj3Var5 = (tj3) ye1Var5;
                                    if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        tj3Var5.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var5, d05Var2.f34796a ? R$string.lingq_likes_past : R$string.lingq_like_present), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var5, 0, 0, 262142);
                                    }
                                    break;
                                case 1:
                                    ye1 ye1Var6 = (ye1) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    tj3 tj3Var6 = (tj3) ye1Var6;
                                    if (!tj3Var6.m22099R(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                                        tj3Var6.m22102U();
                                    } else {
                                        y27 y27VarM18236U = AbstractC3423or.m18236U(d05Var2.f34796a ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var6, 0);
                                        ((fe9) tj3Var6.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var6, 56, 8);
                                    }
                                    break;
                                case 2:
                                    ye1 ye1Var7 = (ye1) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    tj3 tj3Var7 = (tj3) ye1Var7;
                                    if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        tj3Var7.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var7, d05Var2.f34797b ? R$string.lingq_import_lesson : R$string.lingq_open_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var7, 0, 0, 262142);
                                    }
                                    break;
                                case 3:
                                    ye1 ye1Var8 = (ye1) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    tj3 tj3Var8 = (tj3) ye1Var8;
                                    if (!tj3Var8.m22099R(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                                        tj3Var8.m22102U();
                                    } else {
                                        y27 y27VarM18236U2 = AbstractC3423or.m18236U(d05Var2.f34797b ? R$drawable.ic_import_s : R$drawable.ic_lesson_s, tj3Var8, 0);
                                        ((fe9) tj3Var8.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U2, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var8, 56, 8);
                                    }
                                    break;
                                case 4:
                                    ye1 ye1Var9 = (ye1) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    tj3 tj3Var9 = (tj3) ye1Var9;
                                    if (!tj3Var9.m22099R(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                                        tj3Var9.m22102U();
                                    } else {
                                        y27 y27VarM18236U3 = AbstractC3423or.m18236U(d05Var2.f34798c ? R$drawable.ic_trash : R$drawable.ic_bookmark, tj3Var9, 0);
                                        ((fe9) tj3Var9.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U3, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var9, 56, 8);
                                    }
                                    break;
                                case 5:
                                    ye1 ye1Var10 = (ye1) obj4;
                                    int iIntValue10 = ((Integer) obj5).intValue();
                                    tj3 tj3Var10 = (tj3) ye1Var10;
                                    if (!tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                                        tj3Var10.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var10, d05Var2.f34804i ? R$string.content_unarchive : R$string.content_archive), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var10, 0, 0, 262142);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var11 = (ye1) obj4;
                                    int iIntValue11 = ((Integer) obj5).intValue();
                                    tj3 tj3Var11 = (tj3) ye1Var11;
                                    if (!tj3Var11.m22099R(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                                        tj3Var11.m22102U();
                                    } else {
                                        y27 y27VarM18236U4 = AbstractC3423or.m18236U(d05Var2.f34802g ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var11, 0);
                                        ((fe9) tj3Var11.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U4, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var11, 56, 8);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }, tj3Var4), this.f7726d, tj3Var4, 24582, 428);
                }
                break;
            default:
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(1 & iIntValue5, (iIntValue5 & 17) != 16)) {
                    tj3Var5.m22102U();
                } else {
                    int i9 = d05Var.f34798c ? R$string.lesson_unsave_lesson : R$string.lesson_save_lesson;
                    boolean zM22120g5 = tj3Var5.m22120g(vi3Var);
                    Object objM22097O5 = tj3Var5.m22097O();
                    if (zM22120g5 || objM22097O5 == p84Var) {
                        objM22097O5 = new fl4(vi3Var, 16);
                        tj3Var5.m22131l0(objM22097O5);
                    }
                    final int i10 = 4;
                    of5.m17959a(ci8.m4703P(2031186025, new ex0(i9, 8), tj3Var5), AbstractC0080f.m815b(null, false, (ui3) objM22097O5, b16Var, 15), ci8.m4703P(-27157651, new zi3() { // from class: c05
                        @Override // p000.zi3
                        public final Object invoke(Object obj4, Object obj5) {
                            int i11 = i10;
                            b16 b16Var2 = b16.f7762a;
                            xfa xfaVar2 = xfa.f68157a;
                            d05 d05Var2 = d05Var;
                            switch (i11) {
                                case 0:
                                    ye1 ye1Var6 = (ye1) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    tj3 tj3Var6 = (tj3) ye1Var6;
                                    if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        tj3Var6.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var6, d05Var2.f34796a ? R$string.lingq_likes_past : R$string.lingq_like_present), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var6, 0, 0, 262142);
                                    }
                                    break;
                                case 1:
                                    ye1 ye1Var7 = (ye1) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    tj3 tj3Var7 = (tj3) ye1Var7;
                                    if (!tj3Var7.m22099R(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                                        tj3Var7.m22102U();
                                    } else {
                                        y27 y27VarM18236U = AbstractC3423or.m18236U(d05Var2.f34796a ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var7, 0);
                                        ((fe9) tj3Var7.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var7, 56, 8);
                                    }
                                    break;
                                case 2:
                                    ye1 ye1Var8 = (ye1) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    tj3 tj3Var8 = (tj3) ye1Var8;
                                    if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        tj3Var8.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var8, d05Var2.f34797b ? R$string.lingq_import_lesson : R$string.lingq_open_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var8, 0, 0, 262142);
                                    }
                                    break;
                                case 3:
                                    ye1 ye1Var9 = (ye1) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    tj3 tj3Var9 = (tj3) ye1Var9;
                                    if (!tj3Var9.m22099R(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                                        tj3Var9.m22102U();
                                    } else {
                                        y27 y27VarM18236U2 = AbstractC3423or.m18236U(d05Var2.f34797b ? R$drawable.ic_import_s : R$drawable.ic_lesson_s, tj3Var9, 0);
                                        ((fe9) tj3Var9.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U2, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var9, 56, 8);
                                    }
                                    break;
                                case 4:
                                    ye1 ye1Var10 = (ye1) obj4;
                                    int iIntValue10 = ((Integer) obj5).intValue();
                                    tj3 tj3Var10 = (tj3) ye1Var10;
                                    if (!tj3Var10.m22099R(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                                        tj3Var10.m22102U();
                                    } else {
                                        y27 y27VarM18236U3 = AbstractC3423or.m18236U(d05Var2.f34798c ? R$drawable.ic_trash : R$drawable.ic_bookmark, tj3Var10, 0);
                                        ((fe9) tj3Var10.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U3, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var10, 56, 8);
                                    }
                                    break;
                                case 5:
                                    ye1 ye1Var11 = (ye1) obj4;
                                    int iIntValue11 = ((Integer) obj5).intValue();
                                    tj3 tj3Var11 = (tj3) ye1Var11;
                                    if (!tj3Var11.m22099R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                                        tj3Var11.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var11, d05Var2.f34804i ? R$string.content_unarchive : R$string.content_archive), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var11, 0, 0, 262142);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var12 = (ye1) obj4;
                                    int iIntValue12 = ((Integer) obj5).intValue();
                                    tj3 tj3Var12 = (tj3) ye1Var12;
                                    if (!tj3Var12.m22099R(1 & iIntValue12, (iIntValue12 & 3) != 2)) {
                                        tj3Var12.m22102U();
                                    } else {
                                        y27 y27VarM18236U4 = AbstractC3423or.m18236U(d05Var2.f34802g ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var12, 0);
                                        ((fe9) tj3Var12.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U4, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var12, 56, 8);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }, tj3Var5), this.f7726d, tj3Var5, 24582, 428);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ b05(d05 d05Var, vi3 vi3Var, gf5 gf5Var, int i) {
        this.f7723a = i;
        this.f7724b = d05Var;
        this.f7725c = vi3Var;
        this.f7726d = gf5Var;
    }
}
