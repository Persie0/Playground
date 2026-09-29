package p000;

import com.lingq.core.analytics.data.LqAnalyticsValues$UpgradePopupSource;
import com.lingq.core.settings.SettingsManageSubscriptionsFragment;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j29 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44970a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SettingsManageSubscriptionsFragment f44971b;

    public /* synthetic */ j29(SettingsManageSubscriptionsFragment settingsManageSubscriptionsFragment, int i) {
        this.f44970a = i;
        this.f44971b = settingsManageSubscriptionsFragment;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f44970a;
        xfa xfaVar = xfa.f68157a;
        final SettingsManageSubscriptionsFragment settingsManageSubscriptionsFragment = this.f44971b;
        final int i2 = 2;
        final int i3 = 0;
        final int i4 = 1;
        ye1 ye1Var = (ye1) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bh4[] bh4VarArr = SettingsManageSubscriptionsFragment.f22660U0;
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    fy9.m12246a(false, null, ci8.m4703P(-903854050, new j29(settingsManageSubscriptionsFragment, i4), tj3Var), tj3Var, 384);
                }
                break;
            default:
                bh4[] bh4VarArr2 = SettingsManageSubscriptionsFragment.f22660U0;
                tj3 tj3Var2 = (tj3) ye1Var;
                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    boolean zM22124i = tj3Var2.m22124i(settingsManageSubscriptionsFragment);
                    Object objM22097O = tj3Var2.m22097O();
                    p84 p84Var = we1.f66679a;
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new ui3() { // from class: k29
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i5 = i3;
                                xfa xfaVar2 = xfa.f68157a;
                                SettingsManageSubscriptionsFragment settingsManageSubscriptionsFragment2 = settingsManageSubscriptionsFragment;
                                switch (i5) {
                                    case 0:
                                        bh4[] bh4VarArr3 = SettingsManageSubscriptionsFragment.f22660U0;
                                        b34.m3244j(settingsManageSubscriptionsFragment2).m22691h();
                                        return xfaVar2;
                                    case 1:
                                        w41 w41Var = settingsManageSubscriptionsFragment2.f22662T0;
                                        if (w41Var != null) {
                                            w41Var.m23737z(new pa6(LqAnalyticsValues$UpgradePopupSource.SettingsButtonClick.getValue(), 14, null));
                                            return xfaVar2;
                                        }
                                        fa4.m11636J("navGraphController");
                                        throw null;
                                    default:
                                        bh4[] bh4VarArr4 = SettingsManageSubscriptionsFragment.f22660U0;
                                        id3 id3VarM2089Q = settingsManageSubscriptionsFragment2.m2089Q();
                                        b34.m3244j(settingsManageSubscriptionsFragment2);
                                        mbd.m16755c(id3VarM2089Q, "https://play.google.com/store/account/subscriptions", null, 18);
                                        return xfaVar2;
                                }
                            }
                        };
                        tj3Var2.m22131l0(objM22097O);
                    }
                    ui3 ui3Var = (ui3) objM22097O;
                    boolean zM22124i2 = tj3Var2.m22124i(settingsManageSubscriptionsFragment);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22124i2 || objM22097O2 == p84Var) {
                        objM22097O2 = new ui3() { // from class: k29
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i5 = i4;
                                xfa xfaVar2 = xfa.f68157a;
                                SettingsManageSubscriptionsFragment settingsManageSubscriptionsFragment2 = settingsManageSubscriptionsFragment;
                                switch (i5) {
                                    case 0:
                                        bh4[] bh4VarArr3 = SettingsManageSubscriptionsFragment.f22660U0;
                                        b34.m3244j(settingsManageSubscriptionsFragment2).m22691h();
                                        return xfaVar2;
                                    case 1:
                                        w41 w41Var = settingsManageSubscriptionsFragment2.f22662T0;
                                        if (w41Var != null) {
                                            w41Var.m23737z(new pa6(LqAnalyticsValues$UpgradePopupSource.SettingsButtonClick.getValue(), 14, null));
                                            return xfaVar2;
                                        }
                                        fa4.m11636J("navGraphController");
                                        throw null;
                                    default:
                                        bh4[] bh4VarArr4 = SettingsManageSubscriptionsFragment.f22660U0;
                                        id3 id3VarM2089Q = settingsManageSubscriptionsFragment2.m2089Q();
                                        b34.m3244j(settingsManageSubscriptionsFragment2);
                                        mbd.m16755c(id3VarM2089Q, "https://play.google.com/store/account/subscriptions", null, 18);
                                        return xfaVar2;
                                }
                            }
                        };
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    ui3 ui3Var2 = (ui3) objM22097O2;
                    boolean zM22124i3 = tj3Var2.m22124i(settingsManageSubscriptionsFragment);
                    Object objM22097O3 = tj3Var2.m22097O();
                    if (zM22124i3 || objM22097O3 == p84Var) {
                        objM22097O3 = new ui3() { // from class: k29
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i5 = i2;
                                xfa xfaVar2 = xfa.f68157a;
                                SettingsManageSubscriptionsFragment settingsManageSubscriptionsFragment2 = settingsManageSubscriptionsFragment;
                                switch (i5) {
                                    case 0:
                                        bh4[] bh4VarArr3 = SettingsManageSubscriptionsFragment.f22660U0;
                                        b34.m3244j(settingsManageSubscriptionsFragment2).m22691h();
                                        return xfaVar2;
                                    case 1:
                                        w41 w41Var = settingsManageSubscriptionsFragment2.f22662T0;
                                        if (w41Var != null) {
                                            w41Var.m23737z(new pa6(LqAnalyticsValues$UpgradePopupSource.SettingsButtonClick.getValue(), 14, null));
                                            return xfaVar2;
                                        }
                                        fa4.m11636J("navGraphController");
                                        throw null;
                                    default:
                                        bh4[] bh4VarArr4 = SettingsManageSubscriptionsFragment.f22660U0;
                                        id3 id3VarM2089Q = settingsManageSubscriptionsFragment2.m2089Q();
                                        b34.m3244j(settingsManageSubscriptionsFragment2);
                                        mbd.m16755c(id3VarM2089Q, "https://play.google.com/store/account/subscriptions", null, 18);
                                        return xfaVar2;
                                }
                            }
                        };
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    t2d.m21820a(ui3Var, ui3Var2, (ui3) objM22097O3, tj3Var2, 0);
                }
                break;
        }
        return xfaVar;
    }
}
