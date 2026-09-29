package p000;

import android.animation.ValueAnimator;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.runtime.AbstractC0278f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$string;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: renamed from: d4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2914d4 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34979a;

    public /* synthetic */ C2914d4(int i) {
        this.f34979a = i;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue;
        int i = this.f34979a;
        xfa xfaVar = xfa.f68157a;
        final int i2 = 1;
        boolean z = false;
        switch (i) {
            case 0:
                jt5 jt5Var = (jt5) obj;
                final int iMo916w0 = jt5Var.mo916w0(10.0f);
                int i3 = iMo916w0 * 2;
                final l87 l87VarMo1514r = ((ct5) obj2).mo1514r(dk1.m10431i(((bk1) obj3).f8631a, i3, 0));
                int i4 = l87VarMo1514r.f49302b;
                int i5 = l87VarMo1514r.f49301a - i3;
                final int i6 = z ? 1 : 0;
                return jt5Var.mo9895M0(i5, i4, AbstractC3194a.m15360M(), new vi3() { // from class: f4
                    @Override // p000.vi3
                    public final Object invoke(Object obj4) {
                        int i7 = i6;
                        xfa xfaVar2 = xfa.f68157a;
                        int i8 = iMo916w0;
                        l87 l87Var = l87VarMo1514r;
                        AbstractC0343j abstractC0343j = (AbstractC0343j) obj4;
                        switch (i7) {
                            case 0:
                                abstractC0343j.m1530f(l87Var, -i8, 0, 0.0f);
                                break;
                            default:
                                abstractC0343j.m1530f(l87Var, 0, -i8, 0.0f);
                                break;
                        }
                        return xfaVar2;
                    }
                });
            case 1:
                jt5 jt5Var2 = (jt5) obj;
                final int iMo916w1 = jt5Var2.mo916w0(10.0f);
                int i7 = iMo916w1 * 2;
                final l87 l87VarMo1514r2 = ((ct5) obj2).mo1514r(dk1.m10431i(((bk1) obj3).f8631a, 0, i7));
                return jt5Var2.mo9895M0(l87VarMo1514r2.f49301a, l87VarMo1514r2.f49302b - i7, AbstractC3194a.m15360M(), new vi3() { // from class: f4
                    @Override // p000.vi3
                    public final Object invoke(Object obj4) {
                        int i8 = i2;
                        xfa xfaVar2 = xfa.f68157a;
                        int i9 = iMo916w1;
                        l87 l87Var = l87VarMo1514r2;
                        AbstractC0343j abstractC0343j = (AbstractC0343j) obj4;
                        switch (i8) {
                            case 0:
                                abstractC0343j.m1530f(l87Var, -i9, 0, 0.0f);
                                break;
                            default:
                                abstractC0343j.m1530f(l87Var, 0, -i9, 0.0f);
                                break;
                        }
                        return xfaVar2;
                    }
                });
            case 2:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(1 & iIntValue, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 3:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 4:
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 5:
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(1 & iIntValue4, (iIntValue4 & 17) != 16)) {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 6:
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(1 & iIntValue5, (iIntValue5 & 17) != 16)) {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 7:
                ye1 ye1Var6 = (ye1) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (!tj3Var6.m22099R(1 & iIntValue6, (iIntValue6 & 17) != 16)) {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 8:
                ye1 ye1Var7 = (ye1) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(1 & iIntValue7, (iIntValue7 & 17) != 16)) {
                    String strM23620a0 = vz1.m23620a0(tj3Var7, R$string.search_all);
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(strM23620a0, null, ((ms5) tj3Var7.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var7.m22128k(vh9Var)).f51800b.f71407k, tj3Var7, 0, 0, 131066);
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_chevron_right_s, tj3Var7, 0), vz1.m23620a0(tj3Var7, com.lingq.feature.library.R$string.library_all_items), AbstractC3584sr.m21611X(b16.f7762a, ((fe9) tj3Var7.m22128k(ge9.f40637a)).f38954c, 0.0f, 0.0f, 0.0f, 14), 0L, tj3Var7, 8, 8);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 9:
                ye1 ye1Var8 = (ye1) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(1 & iIntValue8, (iIntValue8 & 17) != 16)) {
                    String strM23620a1 = vz1.m23620a0(tj3Var8, R$string.search_all);
                    vh9 vh9Var2 = ps5.f56764b;
                    lw9.m16554b(strM23620a1, null, ((ms5) tj3Var8.m22128k(vh9Var2)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var8.m22128k(vh9Var2)).f51800b.f71407k, tj3Var8, 0, 0, 131066);
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_chevron_right_s, tj3Var8, 0), vz1.m23620a0(tj3Var8, com.lingq.feature.library.R$string.library_all_items), AbstractC3584sr.m21611X(b16.f7762a, ((fe9) tj3Var8.m22128k(ge9.f40637a)).f38954c, 0.0f, 0.0f, 0.0f, 14), 0L, tj3Var8, 8, 8);
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 10:
                ye1 ye1Var9 = (ye1) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (tj3Var9.m22099R(1 & iIntValue9, (iIntValue9 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var9, com.lingq.feature.onboarding.R$string.welcome_log_in_button), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var9, 0, 0, 262142);
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
            case 11:
                ye1 ye1Var10 = (ye1) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (tj3Var10.m22099R(1 & iIntValue10, (iIntValue10 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var10, R$string.ui_cancel), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var10.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var10, 0, 0, 131070);
                } else {
                    tj3Var10.m22102U();
                }
                return xfaVar;
            case 12:
                ye1 ye1Var11 = (ye1) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (tj3Var11.m22099R(1 & iIntValue11, (iIntValue11 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var11, com.lingq.feature.onboarding.R$string.activities_submit_answer), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var11.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var11, 0, 0, 131070);
                } else {
                    tj3Var11.m22102U();
                }
                return xfaVar;
            case 13:
                boolean z2 = true;
                sb9 sb9Var = (sb9) obj;
                ye1 ye1Var12 = (ye1) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= ((tj3) ye1Var12).m22120g(sb9Var) ? 4 : 2;
                }
                if ((iIntValue12 & 19) == 18) {
                    z2 = false;
                }
                tj3 tj3Var12 = (tj3) ye1Var12;
                if (tj3Var12.m22099R(iIntValue12 & 1, z2)) {
                    u3d.m22441c(sb9Var, null, null, 0L, 0L, 0L, 0L, 0L, tj3Var12, iIntValue12 & 14);
                } else {
                    tj3Var12.m22102U();
                }
                return xfaVar;
            case 14:
                ye1 ye1Var13 = (ye1) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var13 = (tj3) ye1Var13;
                if (tj3Var13.m22099R(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var13, com.lingq.feature.onboarding.R$string.onboarding_v2_get_started), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var13, 0, 0, 262142);
                } else {
                    tj3Var13.m22102U();
                }
                return xfaVar;
            case 15:
                ye1 ye1Var14 = (ye1) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var14 = (tj3) ye1Var14;
                if (tj3Var14.m22099R(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var14, com.lingq.feature.onboarding.R$string.onboarding_v2_already_have_account), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var14, 0, 0, 262142);
                } else {
                    tj3Var14.m22102U();
                }
                return xfaVar;
            default:
                e16 e16Var = (e16) obj;
                ((Integer) obj3).getClass();
                e16Var.getClass();
                tj3 tj3Var15 = (tj3) ((ye1) obj2);
                tj3Var15.m22111b0(-694883653);
                boolean zM18217B = AbstractC3423or.m18217B(tj3Var15);
                Object objM22097O = tj3Var15.m22097O();
                p84 p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1260j(new n84(0L));
                    tj3Var15.m22131l0(objM22097O);
                }
                t66 t66Var = (t66) objM22097O;
                Object objM22097O2 = tj3Var15.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = Boolean.valueOf(ValueAnimator.areAnimatorsEnabled());
                    tj3Var15.m22131l0(objM22097O2);
                }
                if (((Boolean) objM22097O2).booleanValue()) {
                    tj3Var15.m22111b0(464061940);
                    fFloatValue = ((Number) ss5.m21713i(ss5.m21691R("shimmerInfinite", tj3Var15, 0), ((int) (((n84) t66Var.getValue()).f52482a >> 32)) * (-2.0f), ((int) (((n84) t66Var.getValue()).f52482a >> 32)) * 2.0f, ss5.m21687N(ss5.m21703b0(DescriptorProtos.Edition.EDITION_2023_VALUE, 0, null, 6), null, 0L, 6), "shimmer", tj3Var15, 28680, 0).getValue()).floatValue();
                    tj3Var15.m22139q(false);
                } else {
                    tj3Var15.m22111b0(464455733);
                    tj3Var15.m22139q(false);
                    fFloatValue = 0.0f;
                }
                Object objM22097O3 = tj3Var15.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = AbstractC0278f.m1260j(new aa1(zM18217B ? d32.m10037f(4279900698L) : d32.m10037f(4293388263L)));
                    tj3Var15.m22131l0(objM22097O3);
                }
                t66 t66Var2 = (t66) objM22097O3;
                Object objM22097O4 = tj3Var15.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = AbstractC0278f.m1260j(new aa1(zM18217B ? d32.m10037f(4283058762L) : d32.m10037f(4291611595L)));
                    tj3Var15.m22131l0(objM22097O4);
                }
                t66 t66Var3 = (t66) objM22097O4;
                Object objM22097O5 = tj3Var15.m22097O();
                if (objM22097O5 == p84Var) {
                    objM22097O5 = AbstractC0278f.m1260j(new aa1(zM18217B ? d32.m10037f(4281019179L) : d32.m10037f(4294046193L)));
                    tj3Var15.m22131l0(objM22097O5);
                }
                e16 e16VarM10006C = d32.m10006C(e16Var, ui0.m22747c(vi0.Companion, vz1.m23605K(new aa1(((aa1) t66Var2.getValue()).f414a), new aa1(((aa1) t66Var3.getValue()).f414a), new aa1(((aa1) ((t66) objM22097O5).getValue()).f414a)), (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloatValue + ((int) (((n84) t66Var.getValue()).f52482a >> 32)))) << 32) | (((long) Float.floatToRawIntBits((int) (((n84) t66Var.getValue()).f52482a & 4294967295L))) & 4294967295L), 8));
                Object objM22097O6 = tj3Var15.m22097O();
                if (objM22097O6 == p84Var) {
                    objM22097O6 = new gb0(7, t66Var);
                    tj3Var15.m22131l0(objM22097O6);
                }
                e16 e16VarM18138a0 = omd.m18138a0(e16VarM10006C, (vi3) objM22097O6);
                tj3Var15.m22139q(false);
                return e16VarM18138a0;
        }
    }
}
