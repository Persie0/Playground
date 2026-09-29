package p000;

import android.content.Context;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.domain.model.language.Language;
import com.lingq.p020ui.C2888d;
import com.lingq.p020ui.HomeFragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class su3 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61408a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HomeFragment f61409b;

    public /* synthetic */ su3(HomeFragment homeFragment, int i) {
        this.f61408a = i;
        this.f61409b = homeFragment;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        int i = this.f61408a;
        xfa xfaVar = xfa.f68157a;
        final HomeFragment homeFragment = this.f61409b;
        final int i2 = 0;
        final int i3 = 1;
        ye1 ye1Var = (ye1) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bh4[] bh4VarArr = HomeFragment.f33886N0;
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    fy9.m12246a(false, null, ci8.m4703P(-1436456759, new su3(homeFragment, i3), tj3Var), tj3Var, 384);
                }
                break;
            default:
                bh4[] bh4VarArr2 = HomeFragment.f33886N0;
                tj3 tj3Var2 = (tj3) ye1Var;
                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    t66 t66VarM2513c = AbstractC0711a.m2513c(homeFragment.m9798k0().f34190y, tj3Var2);
                    final t66 t66VarM2513c2 = AbstractC0711a.m2513c(homeFragment.m9798k0().f34167b.mo4572B0(), tj3Var2);
                    Context contextM2090R = homeFragment.m2090R();
                    Language language = (Language) t66VarM2513c2.getValue();
                    String str3 = "";
                    if (language == null || (str = language.f19024a) == null) {
                        str = "";
                    }
                    String strM17093L = AbstractC3352my.m17093L(contextM2090R, str);
                    Language language2 = (Language) t66VarM2513c2.getValue();
                    if (language2 != null && (str2 = language2.f19024a) != null) {
                        str3 = str2;
                    }
                    String strM24118n = wq1.m24118n("https://www.lingq.com/static/webapp/images/public/landingpages/sm/landing-bg-", str3, "-sm.webp");
                    boolean zBooleanValue = ((Boolean) t66VarM2513c.getValue()).booleanValue();
                    boolean zM22124i = tj3Var2.m22124i(homeFragment) | tj3Var2.m22120g(t66VarM2513c2);
                    Object objM22097O = tj3Var2.m22097O();
                    p84 p84Var = we1.f66679a;
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new ui3() { // from class: tu3
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                String str4;
                                String str5;
                                int i4 = i2;
                                xfa xfaVar2 = xfa.f68157a;
                                String str6 = "";
                                t66 t66Var = t66VarM2513c2;
                                HomeFragment homeFragment2 = homeFragment;
                                switch (i4) {
                                    case 0:
                                        bh4[] bh4VarArr3 = HomeFragment.f33886N0;
                                        C2888d c2888dM9798k0 = homeFragment2.m9798k0();
                                        Language language3 = (Language) t66Var.getValue();
                                        if (language3 != null && (str4 = language3.f19024a) != null) {
                                            str6 = str4;
                                        }
                                        c2888dM9798k0.m9813b3(str6, false);
                                        break;
                                    default:
                                        bh4[] bh4VarArr4 = HomeFragment.f33886N0;
                                        C2888d c2888dM9798k1 = homeFragment2.m9798k0();
                                        Language language4 = (Language) t66Var.getValue();
                                        if (language4 != null && (str5 = language4.f19024a) != null) {
                                            str6 = str5;
                                        }
                                        c2888dM9798k1.m9813b3(str6, false);
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var2.m22131l0(objM22097O);
                    }
                    ui3 ui3Var = (ui3) objM22097O;
                    boolean zM22124i2 = tj3Var2.m22124i(homeFragment) | tj3Var2.m22120g(t66VarM2513c2);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22124i2 || objM22097O2 == p84Var) {
                        objM22097O2 = new ui3() { // from class: tu3
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                String str4;
                                String str5;
                                int i4 = i3;
                                xfa xfaVar2 = xfa.f68157a;
                                String str6 = "";
                                t66 t66Var = t66VarM2513c2;
                                HomeFragment homeFragment2 = homeFragment;
                                switch (i4) {
                                    case 0:
                                        bh4[] bh4VarArr3 = HomeFragment.f33886N0;
                                        C2888d c2888dM9798k0 = homeFragment2.m9798k0();
                                        Language language3 = (Language) t66Var.getValue();
                                        if (language3 != null && (str4 = language3.f19024a) != null) {
                                            str6 = str4;
                                        }
                                        c2888dM9798k0.m9813b3(str6, false);
                                        break;
                                    default:
                                        bh4[] bh4VarArr4 = HomeFragment.f33886N0;
                                        C2888d c2888dM9798k1 = homeFragment2.m9798k0();
                                        Language language4 = (Language) t66Var.getValue();
                                        if (language4 != null && (str5 = language4.f19024a) != null) {
                                            str6 = str5;
                                        }
                                        c2888dM9798k1.m9813b3(str6, false);
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    omd.m18151h(0, tj3Var2, ui3Var, (ui3) objM22097O2, strM17093L, strM24118n, zBooleanValue);
                }
                break;
        }
        return xfaVar;
    }
}
