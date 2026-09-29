package p000;

import androidx.compose.foundation.gestures.C0116v;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.text.AbstractC0176d;
import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.material3.C0232g0;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C0282a;
import androidx.glance.AbstractC0640a;
import androidx.glance.layout.AbstractC0686a;
import com.lingq.core.tooltips.components.AbstractC1915b;
import com.lingq.feature.library.AbstractC2143d;
import com.lingq.feature.onboarding.p014v2.AbstractC2215c;
import com.lingq.p020ui.C2889e;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class di0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35668a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35669b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f35670c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f35671d;

    public /* synthetic */ di0(oa1 oa1Var, zz3 zz3Var, C0282a c0282a) {
        this.f35668a = 2;
        this.f35669b = zz3Var;
        this.f35671d = c0282a;
        this.f35670c = oa1Var;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:47:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:55:0x0227  */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.f35668a;
        mn3 mn3Var = mn3.f51554a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f35671d;
        Object obj4 = this.f35670c;
        Object obj5 = this.f35669b;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                pk9.m19366a((e16) obj5, (InterfaceC3571se) obj4, (C0282a) obj3, (ye1) obj, pk9.m19383z(3073));
                return xfaVar;
            case 1:
                oa1 oa1Var = (oa1) obj5;
                C0850ck c0850ck = (C0850ck) obj4;
                String str = (String) obj3;
                ye1 ye1Var = (ye1) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    tj3 tj3Var = (tj3) ye1Var;
                    if (tj3Var.m22086D()) {
                        tj3Var.m22102U();
                    } else {
                        AbstractC0640a.m2210a(c0850ck, str, ci8.m4706S(mn3Var, 24.0f), 0, new ea1(new j1a(oa1Var)), ye1Var, 32768, 8);
                    }
                } else {
                    AbstractC0640a.m2210a(c0850ck, str, ci8.m4706S(mn3Var, 24.0f), 0, new ea1(new j1a(oa1Var)), ye1Var, 32768, 8);
                }
                return xfaVar;
            case 2:
                final zz3 zz3Var = (zz3) obj5;
                final C0282a c0282a = (C0282a) obj3;
                final oa1 oa1Var2 = (oa1) obj4;
                ye1 ye1Var2 = (ye1) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22086D()) {
                        tj3Var2.m22102U();
                    } else if (zz3Var != null) {
                        tj3 tj3Var3 = (tj3) ye1Var2;
                        tj3Var3.m22111b0(-221026016);
                        AbstractC0686a.m2487c(null, 0, 1, ci8.m4703P(279032795, new aj3() { // from class: fk0
                            @Override // p000.aj3
                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                ye1 ye1Var3 = (ye1) obj7;
                                ((Integer) obj8).getClass();
                                ea1 ea1Var = new ea1(new j1a(oa1Var2));
                                mn3 mn3Var2 = mn3.f51554a;
                                AbstractC0640a.m2210a(zz3Var, null, ci8.m4706S(mn3Var2, 18.0f), 0, ea1Var, ye1Var3, 32816, 8);
                                AbstractC0686a.m2488d(ci8.m4717b0(mn3Var2, 8.0f), ye1Var3, 0);
                                c0282a.invoke(ye1Var3, 6);
                                return xfa.f68157a;
                            }
                        }, tj3Var3), tj3Var3, 3072, 3);
                        tj3Var3.m22139q(false);
                    } else {
                        tj3 tj3Var4 = (tj3) ye1Var2;
                        tj3Var4.m22111b0(-220542695);
                        AbstractC0686a.m2485a(ci8.m4706S(mn3Var, 18.0f), null, hnb.f42671a, tj3Var4, 384, 2);
                        wq1.m24128x(6, c0282a, tj3Var4, false);
                    }
                } else if (zz3Var != null) {
                    tj3 tj3Var5 = (tj3) ye1Var2;
                    tj3Var5.m22111b0(-221026016);
                    AbstractC0686a.m2487c(null, 0, 1, ci8.m4703P(279032795, new aj3() { // from class: fk0
                        @Override // p000.aj3
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            ye1 ye1Var3 = (ye1) obj7;
                            ((Integer) obj8).getClass();
                            ea1 ea1Var = new ea1(new j1a(oa1Var2));
                            mn3 mn3Var2 = mn3.f51554a;
                            AbstractC0640a.m2210a(zz3Var, null, ci8.m4706S(mn3Var2, 18.0f), 0, ea1Var, ye1Var3, 32816, 8);
                            AbstractC0686a.m2488d(ci8.m4717b0(mn3Var2, 8.0f), ye1Var3, 0);
                            c0282a.invoke(ye1Var3, 6);
                            return xfa.f68157a;
                        }
                    }, tj3Var5), tj3Var5, 3072, 3);
                    tj3Var5.m22139q(false);
                } else {
                    tj3 tj3Var6 = (tj3) ye1Var2;
                    tj3Var6.m22111b0(-220542695);
                    AbstractC0686a.m2485a(ci8.m4706S(mn3Var, 18.0f), null, hnb.f42671a, tj3Var6, 384, 2);
                    wq1.m24128x(6, c0282a, tj3Var6, false);
                }
                return xfaVar;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC0176d.m1069b((e16) obj5, (C0205f) obj4, (C0282a) obj3, (ye1) obj, pk9.m19383z(385));
                return xfaVar;
            case 4:
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                ui3 ui3Var = (ui3) obj3;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var3;
                if (tj3Var7.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    bq1.m4039O(AbstractC3423or.m18285y(c99.m4412e(b16.f7762a, 1.0f), IntrinsicSize.Min), ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51801c.f64858d, null, null, null, ci8.m4703P(617679803, new ik0((Object) str2, (Object) str3, ui3Var, 24), tj3Var7), tj3Var7, 196614, 28);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 5:
                t17 t17Var = (t17) obj5;
                kg9 kg9Var = (kg9) obj4;
                InterfaceC3624tu interfaceC3624tu = (InterfaceC3624tu) obj3;
                fb2 fb2Var = (fb2) obj;
                bk1 bk1Var = (bk1) obj2;
                if (bk1.m3801i(bk1Var.f8631a) == Integer.MAX_VALUE) {
                    l54.m15814a("LazyVerticalStaggeredGrid's width should be bound by parent.");
                }
                LayoutDirection layoutDirection = LayoutDirection.Ltr;
                int iM3801i = bk1.m3801i(bk1Var.f8631a) - fb2Var.mo916w0(AbstractC3584sr.m21642t(t17Var, layoutDirection) + AbstractC3584sr.m21643u(t17Var, layoutDirection));
                int iMo916w0 = fb2Var.mo916w0(interfaceC3624tu.mo9967a());
                int iMax = Math.max((iM3801i + iMo916w0) / (fb2Var.mo916w0(kg9Var.f47255a) + iMo916w0), 1);
                int i3 = iM3801i - ((iMax - 1) * iMo916w0);
                int i4 = i3 / iMax;
                int i5 = i3 % iMax;
                int[] iArr = new int[iMax];
                int i6 = 0;
                while (i6 < iMax) {
                    if (i4 < 0) {
                        i = 0;
                    } else {
                        i = (i6 < i5 ? 1 : 0) + i4;
                    }
                    iArr[i6] = i;
                    i6++;
                }
                int[] iArr2 = new int[iMax];
                interfaceC3624tu.mo9968j(fb2Var, iM3801i, iArr, LayoutDirection.Ltr, iArr2);
                return new xs4(iArr2, iArr);
            case 6:
                ((Integer) obj2).getClass();
                AbstractC2143d.m9059c((ja5) obj5, (b85) obj4, (n4b) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC3122is.m14089c((C2889e) obj5, (hm5) obj4, (h24) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC2215c.m9161e((ut6) obj5, (C0232g0) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(49));
                return xfaVar;
            case 9:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj5;
                C0116v c0116v = (C0116v) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jM936h = c0116v.m936h(c0116v.m932d(fFloatValue - ref$FloatRef.f47715a));
                C0116v c0116v2 = ((ho8) obj3).f42716a;
                ref$FloatRef.f47715a += c0116v.m932d(c0116v.m935g(c0116v2.m931c(c0116v2.f2370k, jM936h, 1)));
                return xfaVar;
            default:
                ((Integer) obj2).getClass();
                AbstractC1915b.m8789b((c7a) obj5, (ui3) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
        }
    }

    public /* synthetic */ di0(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f35668a = i2;
        this.f35669b = obj;
        this.f35670c = obj2;
        this.f35671d = obj3;
    }

    public /* synthetic */ di0(Object obj, Object obj2, Object obj3, int i) {
        this.f35668a = i;
        this.f35669b = obj;
        this.f35670c = obj2;
        this.f35671d = obj3;
    }
}
