package p000;

import androidx.compose.material3.AbstractC0218a;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.glance.appwidget.lazy.AbstractC0665a;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.feature.onboarding.p014v2.OnboardingYesNoQuestion;
import com.lingq.feature.reader.rating.p016ui.AbstractC2474a;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ks3 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48380a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f48381b;

    public /* synthetic */ ks3(e1b e1bVar, vi3 vi3Var) {
        this.f48380a = 5;
        this.f48381b = vi3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f48380a;
        int i2 = 12;
        int i3 = 26;
        int i4 = 6;
        p84 p84Var = we1.f66679a;
        int i5 = 2;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f48381b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ls3.m16525c(vi3Var, (ye1) obj, pk9.m19383z(1));
                break;
            case 1:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    AbstractC0218a.m1125e(mqb.f51748a, null, ci8.m4703P(1710820562, new ks3(vi3Var, i5), tj3Var), null, 0.0f, null, null, null, null, tj3Var, 390, 506);
                }
                break;
            case 2:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    boolean zM22120g = tj3Var2.m22120g(vi3Var);
                    Object objM22097O = tj3Var2.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new nw1(vi3Var, 21);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    omd.m18141c((ui3) objM22097O, null, false, null, null, mqb.f51749b, tj3Var2, 1572864, 62);
                }
                break;
            case 3:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    boolean zM22120g2 = tj3Var3.m22120g(vi3Var);
                    Object objM22097O2 = tj3Var3.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new fl4(vi3Var, 9);
                        tj3Var3.m22131l0(objM22097O2);
                    }
                    omd.m18141c((ui3) objM22097O2, null, false, null, null, atb.f7474a, tj3Var3, 1572864, 62);
                }
                break;
            case 4:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    AbstractC0218a.m1121a(gtb.f41309a, null, ci8.m4703P(1197743285, new ks3(vi3Var, i4), tj3Var4), null, 0.0f, null, h7a.m13119f(tj3Var4), null, null, tj3Var4, 390, 442);
                }
                break;
            case 5:
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    tj3Var5.m22102U();
                } else {
                    tj3Var5.m22111b0(-719540541);
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM10007D = d32.m10007D(c99.m4430w(b16Var, null, 3), d32.m10035e(285212672), ss5.f61356d);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var5, 0);
                    int iHashCode = Long.hashCode(tj3Var5.f62385T);
                    l77 l77VarM22132m = tj3Var5.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var5, e16VarM10007D);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var5.m22119f0();
                    if (tj3Var5.f62384S) {
                        tj3Var5.m22130l(ui3Var);
                    } else {
                        tj3Var5.m22137o0();
                    }
                    oha.m18001g(tj3Var5, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var5, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var5, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var5, C0352b.f4305h);
                    oha.m18001g(tj3Var5, C0352b.f4301d, e16VarM1322c);
                    e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var5.m22128k(ge9.f40637a)).f38960i, 0.0f, 2);
                    boolean zM22120g3 = tj3Var5.m22120g(vi3Var);
                    Object objM22097O3 = tj3Var5.m22097O();
                    if (zM22120g3 || objM22097O3 == p84Var) {
                        objM22097O3 = new fl4(vi3Var, 12);
                        tj3Var5.m22131l0(objM22097O3);
                    }
                    ss5.m21708e(1572864, 30, null, tj3Var5, (ui3) objM22097O3, gtb.f41311c, e16VarM21609V, null, null, false);
                    WeakHashMap weakHashMap = l6b.f49204w;
                    thb.m22044c(tj3Var5, pvc.m19502J(ho5.m13397r(tj3Var5).f49211g));
                    tj3Var5.m22139q(true);
                    tj3Var5.m22139q(false);
                }
                break;
            case 6:
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    tj3Var6.m22102U();
                } else {
                    boolean zM22120g4 = tj3Var6.m22120g(vi3Var);
                    Object objM22097O4 = tj3Var6.m22097O();
                    if (zM22120g4 || objM22097O4 == p84Var) {
                        objM22097O4 = new fl4(vi3Var, 11);
                        tj3Var6.m22131l0(objM22097O4);
                    }
                    omd.m18141c((ui3) objM22097O4, null, false, null, null, gtb.f41310b, tj3Var6, 1572864, 62);
                }
                break;
            case 7:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                vi3Var.invoke(new kt7(str, str2));
                break;
            case 8:
                String str3 = (String) obj;
                TokenStatus tokenStatus = (TokenStatus) obj2;
                str3.getClass();
                tokenStatus.getClass();
                vi3Var.invoke(new lt7(str3, tokenStatus));
                break;
            case 9:
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    tj3Var7.m22102U();
                } else {
                    AbstractC0218a.m1125e(l1c.f48906a, null, null, ci8.m4703P(864504501, new qe0(vi3Var, i3), tj3Var7), 0.0f, null, null, null, null, tj3Var7, 3078, 502);
                }
                break;
            case 10:
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    tj3Var8.m22102U();
                } else {
                    boolean zM22120g5 = tj3Var8.m22120g(vi3Var);
                    Object objM22097O5 = tj3Var8.m22097O();
                    if (zM22120g5 || objM22097O5 == p84Var) {
                        objM22097O5 = new q65(vi3Var, 23);
                        tj3Var8.m22131l0(objM22097O5);
                    }
                    omd.m18141c((ui3) objM22097O5, null, false, null, null, c2c.f9377b, tj3Var8, 1572864, 62);
                }
                break;
            case 11:
                ye1 ye1Var9 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    tj3Var9.m22102U();
                } else {
                    AbstractC0218a.m1125e(g2c.f40086a, null, ci8.m4703P(-28711882, new ks3(vi3Var, i2), tj3Var9), null, 0.0f, null, h7a.m13119f(tj3Var9), null, null, tj3Var9, 390, 442);
                }
                break;
            case 12:
                ye1 ye1Var10 = (ye1) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (!tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    tj3Var10.m22102U();
                } else {
                    boolean zM22120g6 = tj3Var10.m22120g(vi3Var);
                    Object objM22097O6 = tj3Var10.m22097O();
                    if (zM22120g6 || objM22097O6 == p84Var) {
                        objM22097O6 = new q65(vi3Var, 24);
                        tj3Var10.m22131l0(objM22097O6);
                    }
                    omd.m18141c((ui3) objM22097O6, null, false, null, null, g2c.f40087b, tj3Var10, 1572864, 62);
                }
                break;
            case 13:
                ye1 ye1Var11 = (ye1) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (!tj3Var11.m22099R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    tj3Var11.m22102U();
                } else {
                    boolean zM22120g7 = tj3Var11.m22120g(vi3Var);
                    Object objM22097O7 = tj3Var11.m22097O();
                    if (zM22120g7 || objM22097O7 == p84Var) {
                        objM22097O7 = new q65(vi3Var, 26);
                        tj3Var11.m22131l0(objM22097O7);
                    }
                    omd.m18141c((ui3) objM22097O7, null, false, null, null, j2c.f44982b, tj3Var11, 1572864, 62);
                }
                break;
            case 14:
                ((Integer) obj2).getClass();
                jtb.m14645a(vi3Var, (ye1) obj, pk9.m19383z(1));
                break;
            case 15:
                ye1 ye1Var12 = (ye1) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                tj3 tj3Var12 = (tj3) ye1Var12;
                if (!tj3Var12.m22099R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    tj3Var12.m22102U();
                } else {
                    boolean zM22120g8 = tj3Var12.m22120g(vi3Var);
                    Object objM22097O8 = tj3Var12.m22097O();
                    if (zM22120g8 || objM22097O8 == p84Var) {
                        objM22097O8 = new q65(vi3Var, 27);
                        tj3Var12.m22131l0(objM22097O8);
                    }
                    omd.m18141c((ui3) objM22097O8, null, false, null, null, n2c.f52245b, tj3Var12, 1572864, 62);
                }
                break;
            case 16:
                ye1 ye1Var13 = (ye1) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                tj3 tj3Var13 = (tj3) ye1Var13;
                if (!tj3Var13.m22099R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    tj3Var13.m22102U();
                } else {
                    boolean zM22120g9 = tj3Var13.m22120g(vi3Var);
                    Object objM22097O9 = tj3Var13.m22097O();
                    if (zM22120g9 || objM22097O9 == p84Var) {
                        objM22097O9 = new q65(vi3Var, 29);
                        tj3Var13.m22131l0(objM22097O9);
                    }
                    omd.m18141c((ui3) objM22097O9, null, false, null, null, q2c.f57175b, tj3Var13, 1572864, 62);
                }
                break;
            case 17:
                ye1 ye1Var14 = (ye1) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                tj3 tj3Var14 = (tj3) ye1Var14;
                if (!tj3Var14.m22099R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    tj3Var14.m22102U();
                } else {
                    boolean zM22120g10 = tj3Var14.m22120g(vi3Var);
                    Object objM22097O10 = tj3Var14.m22097O();
                    if (zM22120g10 || objM22097O10 == p84Var) {
                        objM22097O10 = new et6(vi3Var, 5);
                        tj3Var14.m22131l0(objM22097O10);
                    }
                    omd.m18141c((ui3) objM22097O10, null, false, null, null, k3c.f46669b, tj3Var14, 1572864, 62);
                }
                break;
            case 18:
                ye1 ye1Var15 = (ye1) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                tj3 tj3Var15 = (tj3) ye1Var15;
                if (!tj3Var15.m22099R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    tj3Var15.m22102U();
                } else {
                    boolean zM22120g11 = tj3Var15.m22120g(vi3Var);
                    Object objM22097O11 = tj3Var15.m22097O();
                    if (zM22120g11 || objM22097O11 == p84Var) {
                        objM22097O11 = new et6(vi3Var, 11);
                        tj3Var15.m22131l0(objM22097O11);
                    }
                    omd.m18141c((ui3) objM22097O11, null, false, null, null, dfc.f35575b, tj3Var15, 1572864, 62);
                }
                break;
            case 19:
                vi3Var.invoke(new xc7(((Integer) obj).intValue(), ((Integer) obj2).intValue()));
                break;
            case 20:
                ye1 ye1Var16 = (ye1) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                tj3 tj3Var16 = (tj3) ye1Var16;
                if (!tj3Var16.m22099R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    tj3Var16.m22102U();
                } else {
                    boolean zM22120g12 = tj3Var16.m22120g(vi3Var);
                    Object objM22097O12 = tj3Var16.m22097O();
                    if (zM22120g12 || objM22097O12 == p84Var) {
                        objM22097O12 = new et6(vi3Var, 25);
                        tj3Var16.m22131l0(objM22097O12);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var16, (ui3) objM22097O12, cgc.f10035a, null, null, null, false);
                }
                break;
            case 21:
                OnboardingYesNoQuestion onboardingYesNoQuestion = (OnboardingYesNoQuestion) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                onboardingYesNoQuestion.getClass();
                vi3Var.invoke(new uv6(onboardingYesNoQuestion, zBooleanValue));
                break;
            case 22:
                ((Integer) obj2).getClass();
                AbstractC2474a.m9385d(vi3Var, (ye1) obj, pk9.m19383z(1));
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                vi3Var.invoke(new vr7((e28) obj, (xz7) obj2));
                break;
            case 24:
                ye1 ye1Var17 = (ye1) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                tj3 tj3Var17 = (tj3) ye1Var17;
                if (!tj3Var17.m22099R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    tj3Var17.m22102U();
                } else {
                    boolean zM22120g13 = tj3Var17.m22120g(vi3Var);
                    Object objM22097O13 = tj3Var17.m22097O();
                    if (zM22120g13 || objM22097O13 == p84Var) {
                        objM22097O13 = new nc8(vi3Var, 6);
                        tj3Var17.m22131l0(objM22097O13);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var17, (ui3) objM22097O13, mjc.f51423j, null, null, null, false);
                }
                break;
            case 25:
                ye1 ye1Var18 = (ye1) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                tj3 tj3Var18 = (tj3) ye1Var18;
                if (!tj3Var18.m22099R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    tj3Var18.m22102U();
                } else {
                    boolean zM22120g14 = tj3Var18.m22120g(vi3Var);
                    Object objM22097O14 = tj3Var18.m22097O();
                    if (zM22120g14 || objM22097O14 == p84Var) {
                        objM22097O14 = new nc8(vi3Var, 4);
                        tj3Var18.m22131l0(objM22097O14);
                    }
                    omd.m18141c((ui3) objM22097O14, null, false, null, null, mjc.f51415b, tj3Var18, 1572864, 62);
                }
                break;
            case 26:
                ye1 ye1Var19 = (ye1) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                tj3 tj3Var19 = (tj3) ye1Var19;
                if (!tj3Var19.m22099R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    tj3Var19.m22102U();
                } else {
                    boolean zM22120g15 = tj3Var19.m22120g(vi3Var);
                    Object objM22097O15 = tj3Var19.m22097O();
                    if (zM22120g15 || objM22097O15 == p84Var) {
                        objM22097O15 = new nc8(vi3Var, 5);
                        tj3Var19.m22131l0(objM22097O15);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var19, (ui3) objM22097O15, mjc.f51419f, null, null, null, false);
                }
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ye1 ye1Var20 = (ye1) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                tj3 tj3Var20 = (tj3) ye1Var20;
                if (!tj3Var20.m22099R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    tj3Var20.m22102U();
                } else {
                    boolean zM22120g16 = tj3Var20.m22120g(vi3Var);
                    Object objM22097O16 = tj3Var20.m22097O();
                    if (zM22120g16 || objM22097O16 == p84Var) {
                        objM22097O16 = new nc8(vi3Var, 3);
                        tj3Var20.m22131l0(objM22097O16);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var20, (ui3) objM22097O16, mjc.f51420g, null, null, null, false);
                }
                break;
            case 28:
                ye1 ye1Var21 = (ye1) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                tj3 tj3Var21 = (tj3) ye1Var21;
                if (!tj3Var21.m22099R(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    tj3Var21.m22102U();
                } else {
                    AbstractC0665a.m2256a(null, vi3Var, tj3Var21, 0);
                }
                break;
            default:
                ye1 ye1Var22 = (ye1) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                tj3 tj3Var22 = (tj3) ye1Var22;
                if (!tj3Var22.m22099R(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    tj3Var22.m22102U();
                } else {
                    boolean zM22120g17 = tj3Var22.m22120g(vi3Var);
                    Object objM22097O17 = tj3Var22.m22097O();
                    if (zM22120g17 || objM22097O17 == p84Var) {
                        objM22097O17 = new nc8(vi3Var, 19);
                        tj3Var22.m22131l0(objM22097O17);
                    }
                    omd.m18141c((ui3) objM22097O17, null, false, null, null, slc.f61007q, tj3Var22, 1572864, 62);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ks3(vi3 vi3Var, int i, int i2) {
        this.f48380a = i2;
        this.f48381b = vi3Var;
    }

    public /* synthetic */ ks3(vi3 vi3Var, int i) {
        this.f48380a = i;
        this.f48381b = vi3Var;
    }
}
