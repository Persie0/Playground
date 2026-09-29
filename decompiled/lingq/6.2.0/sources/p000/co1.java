package p000;

import androidx.compose.foundation.AbstractC0080f;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$string;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class co1 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10342a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f10343b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gf5 f10344c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ do1 f10345d;

    public /* synthetic */ co1(vi3 vi3Var, gf5 gf5Var, do1 do1Var) {
        this.f10342a = 1;
        this.f10343b = vi3Var;
        this.f10344c = gf5Var;
        this.f10345d = do1Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f10342a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        b16 b16Var = b16.f7762a;
        vi3 vi3Var = this.f10343b;
        final do1 do1Var = this.f10345d;
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
                    int i4 = do1Var.f35929a ? R$string.lingq_likes_past : R$string.lingq_like_present;
                    boolean zM22120g = tj3Var.m22120g(vi3Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new f91(vi3Var, 14);
                        tj3Var.m22131l0(objM22097O);
                    }
                    of5.m17959a(ci8.m4703P(-1404100599, new ex0(i4, 3), tj3Var), AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15), ci8.m4703P(-1586721011, new zi3() { // from class: bo1
                        @Override // p000.zi3
                        public final Object invoke(Object obj4, Object obj5) {
                            int i5 = i2;
                            b16 b16Var2 = b16.f7762a;
                            xfa xfaVar2 = xfa.f68157a;
                            do1 do1Var2 = do1Var;
                            switch (i5) {
                                case 0:
                                    ye1 ye1Var2 = (ye1) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var2, do1Var2.f35935g ? R$string.content_unarchive : R$string.content_archive), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                                    }
                                    break;
                                case 1:
                                    ye1 ye1Var3 = (ye1) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                    if (!tj3Var3.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                        tj3Var3.m22102U();
                                    } else {
                                        y27 y27VarM18236U = AbstractC3423or.m18236U(do1Var2.f35929a ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var3, 0);
                                        ((fe9) tj3Var3.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var3, 56, 8);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var4 = (ye1) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    tj3 tj3Var4 = (tj3) ye1Var4;
                                    if (!tj3Var4.m22099R(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                                        tj3Var4.m22102U();
                                    } else {
                                        y27 y27VarM18236U2 = AbstractC3423or.m18236U(do1Var2.f35933e ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var4, 0);
                                        ((fe9) tj3Var4.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U2, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var4, 56, 8);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }, tj3Var), this.f10344c, tj3Var, 24582, 428);
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
                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new f91(vi3Var, 10);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    of5.m17959a(ci8.m4703P(2070403308, new zi3() { // from class: bo1
                        @Override // p000.zi3
                        public final Object invoke(Object obj4, Object obj5) {
                            int i5 = i3;
                            b16 b16Var2 = b16.f7762a;
                            xfa xfaVar2 = xfa.f68157a;
                            do1 do1Var2 = do1Var;
                            switch (i5) {
                                case 0:
                                    ye1 ye1Var3 = (ye1) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                    if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        tj3Var3.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var3, do1Var2.f35935g ? R$string.content_unarchive : R$string.content_archive), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                                    }
                                    break;
                                case 1:
                                    ye1 ye1Var4 = (ye1) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    tj3 tj3Var4 = (tj3) ye1Var4;
                                    if (!tj3Var4.m22099R(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                                        tj3Var4.m22102U();
                                    } else {
                                        y27 y27VarM18236U = AbstractC3423or.m18236U(do1Var2.f35929a ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var4, 0);
                                        ((fe9) tj3Var4.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var4, 56, 8);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var5 = (ye1) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    tj3 tj3Var5 = (tj3) ye1Var5;
                                    if (!tj3Var5.m22099R(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                                        tj3Var5.m22102U();
                                    } else {
                                        y27 y27VarM18236U2 = AbstractC3423or.m18236U(do1Var2.f35933e ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var5, 0);
                                        ((fe9) tj3Var5.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U2, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var5, 56, 8);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }, tj3Var2), AbstractC0080f.m815b(null, false, (ui3) objM22097O2, b16Var, 15), wob.f67140e, this.f10344c, tj3Var2, 24582, 428);
                }
                break;
            default:
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    tj3Var3.m22102U();
                } else {
                    int i5 = do1Var.f35933e ? R$string.course_unsubscribe : R$string.course_subscribe;
                    boolean zM22120g3 = tj3Var3.m22120g(vi3Var);
                    Object objM22097O3 = tj3Var3.m22097O();
                    if (zM22120g3 || objM22097O3 == p84Var) {
                        objM22097O3 = new f91(vi3Var, 15);
                        tj3Var3.m22131l0(objM22097O3);
                    }
                    final int i6 = 2;
                    of5.m17959a(ci8.m4703P(300022691, new ex0(i5, 4), tj3Var3), AbstractC0080f.m815b(null, false, (ui3) objM22097O3, b16Var, 15), ci8.m4703P(-2083293785, new zi3() { // from class: bo1
                        @Override // p000.zi3
                        public final Object invoke(Object obj4, Object obj5) {
                            int i7 = i6;
                            b16 b16Var2 = b16.f7762a;
                            xfa xfaVar2 = xfa.f68157a;
                            do1 do1Var2 = do1Var;
                            switch (i7) {
                                case 0:
                                    ye1 ye1Var4 = (ye1) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    tj3 tj3Var4 = (tj3) ye1Var4;
                                    if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        tj3Var4.m22102U();
                                    } else {
                                        lw9.m16554b(vz1.m23620a0(tj3Var4, do1Var2.f35935g ? R$string.content_unarchive : R$string.content_archive), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
                                    }
                                    break;
                                case 1:
                                    ye1 ye1Var5 = (ye1) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    tj3 tj3Var5 = (tj3) ye1Var5;
                                    if (!tj3Var5.m22099R(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                                        tj3Var5.m22102U();
                                    } else {
                                        y27 y27VarM18236U = AbstractC3423or.m18236U(do1Var2.f35929a ? R$drawable.ic_heart_filled_s : R$drawable.ic_heart_s, tj3Var5, 0);
                                        ((fe9) tj3Var5.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var5, 56, 8);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var6 = (ye1) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    tj3 tj3Var6 = (tj3) ye1Var6;
                                    if (!tj3Var6.m22099R(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                                        tj3Var6.m22102U();
                                    } else {
                                        y27 y27VarM18236U2 = AbstractC3423or.m18236U(do1Var2.f35933e ? R$drawable.ic_bell_filled_s : R$drawable.ic_bell_s, tj3Var6, 0);
                                        ((fe9) tj3Var6.m22128k(ge9.f40637a)).getClass();
                                        ty3.m22352b(y27VarM18236U2, null, c99.m4422o(b16Var2, 16.0f), 0L, tj3Var6, 56, 8);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }, tj3Var3), this.f10344c, tj3Var3, 24582, 428);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ co1(do1 do1Var, vi3 vi3Var, gf5 gf5Var, int i) {
        this.f10342a = i;
        this.f10345d = do1Var;
        this.f10343b = vi3Var;
        this.f10344c = gf5Var;
    }
}
