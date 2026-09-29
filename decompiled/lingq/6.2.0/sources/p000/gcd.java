package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.analytics.embedded.EmbeddedMessageElements;
import com.lingq.core.analytics.embedded.EmbeddedMessageMetadata;
import com.lingq.core.analytics.embedded.LibraryPlacement;
import com.lingq.core.analytics.embedded.PlacementImage;
import com.lingq.feature.onboarding.R$string;
import com.lingq.feature.onboarding.p014v2.OnboardingYesNoQuestion;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gcd {
    /* JADX INFO: renamed from: a */
    public static final void m12481a(final String str, final OnboardingYesNoQuestion onboardingYesNoQuestion, final Boolean bool, final zi3 zi3Var, final boolean z, final ui3 ui3Var, e16 e16Var, final int i, final int i2, final String str2, final String str3, final boolean z2, ye1 ye1Var, final int i3) {
        String str4;
        int i4;
        Boolean bool2;
        zi3 zi3Var2;
        ui3 ui3Var2;
        int i5;
        e16 e16Var2;
        e16 e16Var3;
        str.getClass();
        onboardingYesNoQuestion.getClass();
        zi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2123992542);
        if ((i3 & 6) == 0) {
            str4 = str;
            i4 = (tj3Var.m22120g(str4) ? 4 : 2) | i3;
        } else {
            str4 = str;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= tj3Var.m22116e(onboardingYesNoQuestion.ordinal()) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            bool2 = bool;
            i4 |= tj3Var.m22120g(bool2) ? 256 : 128;
        } else {
            bool2 = bool;
        }
        if ((i3 & 3072) == 0) {
            zi3Var2 = zi3Var;
            i4 |= tj3Var.m22124i(zi3Var2) ? 2048 : 1024;
        } else {
            zi3Var2 = zi3Var;
        }
        if ((i3 & 24576) == 0) {
            i4 |= tj3Var.m22122h(z) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            ui3Var2 = ui3Var;
            i4 |= tj3Var.m22124i(ui3Var2) ? 131072 : 65536;
        } else {
            ui3Var2 = ui3Var;
        }
        int i6 = i4 | 1572864;
        if ((12582912 & i3) == 0) {
            i6 |= tj3Var.m22116e(i) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i5 = i2;
            i6 |= tj3Var.m22116e(i5) ? 67108864 : 33554432;
        } else {
            i5 = i2;
        }
        if ((805306368 & i3) == 0) {
            i6 |= tj3Var.m22120g(str2) ? 536870912 : 268435456;
        }
        if (tj3Var.m22099R(i6 & 1, ((306783379 & i6) == 306783378 && (((tj3Var.m22120g(str3) ? (char) 4 : (char) 2) | (tj3Var.m22122h(z2) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            tj3Var.m22104W();
            if ((i3 & 1) == 0 || tj3Var.m22084B()) {
                e16Var3 = b16.f7762a;
            } else {
                tj3Var.m22102U();
                e16Var3 = e16Var;
            }
            tj3Var.m22140r();
            final Boolean bool3 = bool2;
            final zi3 zi3Var3 = zi3Var2;
            final int i7 = i5;
            int i8 = (i6 & 14) | 1572864 | ((i6 >> 9) & 112);
            int i9 = i6 >> 6;
            int i10 = i8 | (i9 & 7168) | (i9 & 57344);
            e16Var2 = e16Var3;
            gxb.m12966b(str4, z, vz1.m23620a0(tj3Var, R$string.onboarding_v2_continue), ui3Var2, e16Var2, null, ci8.m4703P(-1962636372, new aj3() { // from class: pab
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((db1) obj).getClass();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final int i11 = 0;
                        final int i12 = i;
                        final Boolean bool4 = bool3;
                        final zi3 zi3Var4 = zi3Var3;
                        final OnboardingYesNoQuestion onboardingYesNoQuestion2 = onboardingYesNoQuestion;
                        final String str5 = str2;
                        C0282a c0282aM4703P = ci8.m4703P(-1002372342, new zi3() { // from class: rab
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // p000.zi3
                            public final Object invoke(Object obj4, Object obj5) {
                                int i13 = i11;
                                xfa xfaVar = xfa.f68157a;
                                p84 p84Var = we1.f66679a;
                                final OnboardingYesNoQuestion onboardingYesNoQuestion3 = onboardingYesNoQuestion2;
                                final zi3 zi3Var5 = zi3Var4;
                                Boolean bool5 = bool4;
                                int i14 = i12;
                                final int i15 = 1;
                                Object[] objArr = 0;
                                switch (i13) {
                                    case 0:
                                        ye1 ye1Var3 = (ye1) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        tj3 tj3Var3 = (tj3) ye1Var3;
                                        if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            tj3Var3.m22102U();
                                        } else {
                                            String strM23620a0 = vz1.m23620a0(tj3Var3, i14);
                                            boolean zM11650l = fa4.m11650l(bool5, Boolean.TRUE);
                                            boolean zM22120g = tj3Var3.m22120g(zi3Var5) | tj3Var3.m22116e(onboardingYesNoQuestion3.ordinal());
                                            Object objM22097O = tj3Var3.m22097O();
                                            if (zM22120g || objM22097O == p84Var) {
                                                objM22097O = new ui3() { // from class: sab
                                                    @Override // p000.ui3
                                                    /* JADX INFO: renamed from: a */
                                                    public final Object mo0a() {
                                                        int i16 = i15;
                                                        xfa xfaVar2 = xfa.f68157a;
                                                        OnboardingYesNoQuestion onboardingYesNoQuestion4 = onboardingYesNoQuestion3;
                                                        zi3 zi3Var6 = zi3Var5;
                                                        switch (i16) {
                                                            case 0:
                                                                zi3Var6.invoke(onboardingYesNoQuestion4, Boolean.FALSE);
                                                                break;
                                                            default:
                                                                zi3Var6.invoke(onboardingYesNoQuestion4, Boolean.TRUE);
                                                                break;
                                                        }
                                                        return xfaVar2;
                                                    }
                                                };
                                                tj3Var3.m22131l0(objM22097O);
                                            }
                                            txb.m22338d(0, tj3Var3, (ui3) objM22097O, null, strM23620a0, str5, zM11650l);
                                        }
                                        break;
                                    default:
                                        ye1 ye1Var4 = (ye1) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        tj3 tj3Var4 = (tj3) ye1Var4;
                                        if (!tj3Var4.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                            tj3Var4.m22102U();
                                        } else {
                                            String strM23620a1 = vz1.m23620a0(tj3Var4, i14);
                                            boolean zM11650l2 = fa4.m11650l(bool5, Boolean.FALSE);
                                            boolean zM22120g2 = tj3Var4.m22120g(zi3Var5) | tj3Var4.m22116e(onboardingYesNoQuestion3.ordinal());
                                            Object objM22097O2 = tj3Var4.m22097O();
                                            if (zM22120g2 || objM22097O2 == p84Var) {
                                                final Object[] objArr2 = objArr == true ? 1 : 0;
                                                objM22097O2 = new ui3() { // from class: sab
                                                    @Override // p000.ui3
                                                    /* JADX INFO: renamed from: a */
                                                    public final Object mo0a() {
                                                        int i16 = objArr2;
                                                        xfa xfaVar2 = xfa.f68157a;
                                                        OnboardingYesNoQuestion onboardingYesNoQuestion4 = onboardingYesNoQuestion3;
                                                        zi3 zi3Var6 = zi3Var5;
                                                        switch (i16) {
                                                            case 0:
                                                                zi3Var6.invoke(onboardingYesNoQuestion4, Boolean.FALSE);
                                                                break;
                                                            default:
                                                                zi3Var6.invoke(onboardingYesNoQuestion4, Boolean.TRUE);
                                                                break;
                                                        }
                                                        return xfaVar2;
                                                    }
                                                };
                                                tj3Var4.m22131l0(objM22097O2);
                                            }
                                            txb.m22338d(0, tj3Var4, (ui3) objM22097O2, null, strM23620a1, str5, zM11650l2);
                                        }
                                        break;
                                }
                                return xfaVar;
                            }
                        }, tj3Var2);
                        final int i13 = 1;
                        final int i14 = i7;
                        final String str6 = str3;
                        C0282a c0282aM4703P2 = ci8.m4703P(1535964734, new zi3() { // from class: rab
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // p000.zi3
                            public final Object invoke(Object obj4, Object obj5) {
                                int i15 = i13;
                                xfa xfaVar = xfa.f68157a;
                                p84 p84Var = we1.f66679a;
                                final OnboardingYesNoQuestion onboardingYesNoQuestion3 = onboardingYesNoQuestion2;
                                final zi3 zi3Var5 = zi3Var4;
                                Boolean bool5 = bool4;
                                int i16 = i14;
                                final int i17 = 1;
                                Object[] objArr = 0;
                                switch (i15) {
                                    case 0:
                                        ye1 ye1Var3 = (ye1) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        tj3 tj3Var3 = (tj3) ye1Var3;
                                        if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            tj3Var3.m22102U();
                                        } else {
                                            String strM23620a0 = vz1.m23620a0(tj3Var3, i16);
                                            boolean zM11650l = fa4.m11650l(bool5, Boolean.TRUE);
                                            boolean zM22120g = tj3Var3.m22120g(zi3Var5) | tj3Var3.m22116e(onboardingYesNoQuestion3.ordinal());
                                            Object objM22097O = tj3Var3.m22097O();
                                            if (zM22120g || objM22097O == p84Var) {
                                                objM22097O = new ui3() { // from class: sab
                                                    @Override // p000.ui3
                                                    /* JADX INFO: renamed from: a */
                                                    public final Object mo0a() {
                                                        int i18 = i17;
                                                        xfa xfaVar2 = xfa.f68157a;
                                                        OnboardingYesNoQuestion onboardingYesNoQuestion4 = onboardingYesNoQuestion3;
                                                        zi3 zi3Var6 = zi3Var5;
                                                        switch (i18) {
                                                            case 0:
                                                                zi3Var6.invoke(onboardingYesNoQuestion4, Boolean.FALSE);
                                                                break;
                                                            default:
                                                                zi3Var6.invoke(onboardingYesNoQuestion4, Boolean.TRUE);
                                                                break;
                                                        }
                                                        return xfaVar2;
                                                    }
                                                };
                                                tj3Var3.m22131l0(objM22097O);
                                            }
                                            txb.m22338d(0, tj3Var3, (ui3) objM22097O, null, strM23620a0, str6, zM11650l);
                                        }
                                        break;
                                    default:
                                        ye1 ye1Var4 = (ye1) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        tj3 tj3Var4 = (tj3) ye1Var4;
                                        if (!tj3Var4.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                            tj3Var4.m22102U();
                                        } else {
                                            String strM23620a1 = vz1.m23620a0(tj3Var4, i16);
                                            boolean zM11650l2 = fa4.m11650l(bool5, Boolean.FALSE);
                                            boolean zM22120g2 = tj3Var4.m22120g(zi3Var5) | tj3Var4.m22116e(onboardingYesNoQuestion3.ordinal());
                                            Object objM22097O2 = tj3Var4.m22097O();
                                            if (zM22120g2 || objM22097O2 == p84Var) {
                                                final int objArr2 = objArr == true ? 1 : 0;
                                                objM22097O2 = new ui3() { // from class: sab
                                                    @Override // p000.ui3
                                                    /* JADX INFO: renamed from: a */
                                                    public final Object mo0a() {
                                                        int i18 = objArr2;
                                                        xfa xfaVar2 = xfa.f68157a;
                                                        OnboardingYesNoQuestion onboardingYesNoQuestion4 = onboardingYesNoQuestion3;
                                                        zi3 zi3Var6 = zi3Var5;
                                                        switch (i18) {
                                                            case 0:
                                                                zi3Var6.invoke(onboardingYesNoQuestion4, Boolean.FALSE);
                                                                break;
                                                            default:
                                                                zi3Var6.invoke(onboardingYesNoQuestion4, Boolean.TRUE);
                                                                break;
                                                        }
                                                        return xfaVar2;
                                                    }
                                                };
                                                tj3Var4.m22131l0(objM22097O2);
                                            }
                                            txb.m22338d(0, tj3Var4, (ui3) objM22097O2, null, strM23620a1, str6, zM11650l2);
                                        }
                                        break;
                                }
                                return xfaVar;
                            }
                        }, tj3Var2);
                        e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
                        bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), nj0.f52791J, tj3Var2, 0);
                        int iHashCode = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m = tj3Var2.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e);
                        se1.f60731q.getClass();
                        ui3 ui3Var3 = C0352b.f4299b;
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var3);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
                        oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                        oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                        oha.m18000f(tj3Var2, C0352b.f4305h);
                        oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                        if (z2) {
                            tj3Var2.m22111b0(519149226);
                            c0282aM4703P2.invoke(tj3Var2, 6);
                            c0282aM4703P.invoke(tj3Var2, 6);
                            tj3Var2.m22139q(false);
                        } else {
                            tj3Var2.m22111b0(519220650);
                            c0282aM4703P.invoke(tj3Var2, 6);
                            c0282aM4703P2.invoke(tj3Var2, 6);
                            tj3Var2.m22139q(false);
                        }
                        tj3Var2.m22139q(true);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, i10, 32);
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final e16 e16Var4 = e16Var2;
            x18VarM22143u.f67642d = new zi3() { // from class: qab
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i3 | 1);
                    gcd.m12481a(str, onboardingYesNoQuestion, bool, zi3Var, z, ui3Var, e16Var4, i, i2, str2, str3, z2, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final LibraryPlacement m12482b(EmbeddedMessageMetadata embeddedMessageMetadata) {
        embeddedMessageMetadata.getClass();
        long j = embeddedMessageMetadata.f14334b;
        if (j == 957 || j == 984 || j == 986 || j == 987) {
            return LibraryPlacement.Top;
        }
        if (j == 985 || j == 1001 || j == 1002) {
            return LibraryPlacement.AboveContinueStudying;
        }
        return (j == 978 || j == 989 || j == 990) ? LibraryPlacement.BelowContinueStudying : LibraryPlacement.Top;
    }

    /* JADX INFO: renamed from: c */
    public static final PlacementImage m12483c(EmbeddedMessageElements embeddedMessageElements) {
        embeddedMessageElements.getClass();
        String str = embeddedMessageElements.f14332h.f14337a;
        int iHashCode = str.hashCode();
        if (iHashCode != -1778180552) {
            if (iHashCode != -877824911) {
                if (iHashCode == 1301162642 && str.equals("image_background")) {
                    return PlacementImage.Background;
                }
            } else if (str.equals("image_top")) {
                return PlacementImage.Top;
            }
        } else if (str.equals("image_right")) {
            return PlacementImage.Right;
        }
        return PlacementImage.No;
    }
}
