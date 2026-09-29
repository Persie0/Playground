package p000;

import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.R$string;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.feature.reader.rating.p016ui.RatingContentType;
import com.lingq.p020ui.AbstractC2891g;
import com.lingq.p020ui.C2889e;
import com.lingq.p020ui.MainActivity;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class so5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61108a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MainActivity f61109b;

    public /* synthetic */ so5(MainActivity mainActivity, int i) {
        this.f61108a = i;
        this.f61109b = mainActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f61108a;
        p84 p84Var = we1.f66679a;
        final int i2 = 5;
        final int i3 = 4;
        xfa xfaVar = xfa.f68157a;
        final MainActivity mainActivity = this.f61109b;
        final int i4 = 1;
        final int i5 = 2;
        final int i6 = 3;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i7 = MainActivity.f33994m0;
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    fy9.m12246a(false, null, ci8.m4703P(-389277356, new so5(mainActivity, i5), tj3Var), tj3Var, 384);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i8 = MainActivity.f33994m0;
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    fy9.m12246a(false, null, ci8.m4703P(1896612775, new so5(mainActivity, i6), tj3Var2), tj3Var2, 384);
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i9 = MainActivity.f33994m0;
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    t66 t66VarM2513c = AbstractC0711a.m2513c(mainActivity.m9802q().f34209k.mo3740k2(), tj3Var3);
                    t66 t66VarM2513c2 = AbstractC0711a.m2513c(mainActivity.m9802q().f34193C, tj3Var3);
                    t66 t66VarM2513c3 = AbstractC0711a.m2513c(mainActivity.m9802q().f34194D, tj3Var3);
                    sha shaVar = (sha) t66VarM2513c.getValue();
                    boolean zM22124i = tj3Var3.m22124i(mainActivity);
                    Object objM22097O = tj3Var3.m22097O();
                    if (zM22124i || objM22097O == p84Var) {
                        final Object[] objArr = null == true ? 1 : 0;
                        objM22097O = new ui3() { // from class: vo5
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i10 = objArr;
                                xfa xfaVar2 = xfa.f68157a;
                                MainActivity mainActivity2 = mainActivity;
                                switch (i10) {
                                    case 0:
                                        int i11 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3739j2();
                                        break;
                                    case 1:
                                        int i12 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3008J2();
                                        break;
                                    case 2:
                                        int i13 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3004B2();
                                        break;
                                    default:
                                        int i14 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3005C();
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var3.m22131l0(objM22097O);
                    }
                    ui3 ui3Var = (ui3) objM22097O;
                    boolean zM22124i2 = tj3Var3.m22124i(mainActivity);
                    Object objM22097O2 = tj3Var3.m22097O();
                    if (zM22124i2 || objM22097O2 == p84Var) {
                        final Object[] objArr2 = null == true ? 1 : 0;
                        objM22097O2 = new vi3() { // from class: wo5
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                boolean zBooleanValue;
                                int i10 = objArr2;
                                boolean z = false;
                                xfa xfaVar2 = xfa.f68157a;
                                MainActivity mainActivity2 = mainActivity;
                                switch (i10) {
                                    case 0:
                                        UpgradeReason upgradeReason = (UpgradeReason) obj3;
                                        int i11 = MainActivity.f33994m0;
                                        upgradeReason.getClass();
                                        mainActivity2.m9802q().mo3739j2();
                                        String strM25660c = zha.m25660c(upgradeReason);
                                        boolean z2 = upgradeReason == UpgradeReason.LYNX_OUT_OF_CREDITS || upgradeReason == UpgradeReason.GATED_TOOL || upgradeReason == UpgradeReason.GATED_TOOL_PLUS;
                                        int i12 = yha.f69857a[upgradeReason.ordinal()];
                                        if (i12 != 9) {
                                            switch (i12) {
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                    z = true;
                                                    break;
                                                default:
                                                    if (z2 && mainActivity2.m9802q().f34200b.mo4593p0() && !mainActivity2.m9802q().f34200b.mo4588a0()) {
                                                        z = true;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            z = true;
                                        }
                                        mainActivity2.m9806w(strM25660c, null, z);
                                        break;
                                    case 1:
                                        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                                        int i13 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3014z2(zBooleanValue2);
                                        break;
                                    case 2:
                                        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                                        int i14 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3007G2(zBooleanValue3);
                                        break;
                                    case 3:
                                        String str = (String) obj3;
                                        int i15 = MainActivity.f33994m0;
                                        str.getClass();
                                        C2889e c2889eM9802q = mainActivity2.m9802q();
                                        c2889eM9802q.getClass();
                                        c2889eM9802q.f34211m.mo3006D2(str);
                                        break;
                                    case 4:
                                        RatingContentType ratingContentType = (RatingContentType) obj3;
                                        int i16 = MainActivity.f33994m0;
                                        ratingContentType.getClass();
                                        C2889e c2889eM9802q2 = mainActivity2.m9802q();
                                        c2889eM9802q2.getClass();
                                        c2889eM9802q2.f34211m.mo3013z(ratingContentType);
                                        break;
                                    default:
                                        boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                                        int i17 = MainActivity.f33994m0;
                                        AbstractC2891g.m9818b("launchPlayReview called (isNative=" + zBooleanValue4 + ")", null);
                                        if (zBooleanValue4) {
                                            try {
                                                Object obj4 = Class.forName(mainActivity2.getPackageName() + ".BuildConfig").getField("DEV_OPTIONS_AVAILABLE").get(null);
                                                obj4.getClass();
                                                zBooleanValue = ((Boolean) obj4).booleanValue();
                                            } catch (Exception unused) {
                                                zBooleanValue = (mainActivity2.getApplicationInfo().flags & 2) != 0;
                                            }
                                            kd8 c3156jq = zBooleanValue ? new C3156jq((Object) mainActivity2) : lwc.m16559a(mainActivity2);
                                            AbstractC2891g.m9818b("Using ".concat(zBooleanValue ? "FakeReviewManager (dev build)" : "Play ReviewManager"), null);
                                            c3156jq.mo6256g().m22200o(new vg1(15, c3156jq, mainActivity2));
                                        } else {
                                            AbstractC2891g.m9818b("Non-native prompt -> opening Play Store listing directly", null);
                                            AbstractC2891g.m9819c(mainActivity2);
                                        }
                                        mainActivity2.m9802q().mo3009L1();
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var3.m22131l0(objM22097O2);
                    }
                    zha.m25658a(shaVar, ui3Var, (vi3) objM22097O2, null, mainActivity.m9802q().f34200b.mo4593p0() && !mainActivity.m9802q().f34200b.mo4588a0(), mainActivity.m9802q().f34200b.mo4588a0(), (List) t66VarM2513c2.getValue(), (String) t66VarM2513c3.getValue(), tj3Var3, 0, 8);
                }
                break;
            case 3:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i10 = MainActivity.f33994m0;
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    Pair pair = (Pair) AbstractC0711a.m2512b(mainActivity.m9802q().f34201c.mo8556K2(), new Pair(Boolean.FALSE, 0), tj3Var4, 0).getValue();
                    boolean zBooleanValue = ((Boolean) pair.f47623a).booleanValue();
                    int iIntValue5 = ((Number) pair.f47624b).intValue();
                    boolean z = zBooleanValue && iIntValue5 > 0;
                    Locale locale = Locale.getDefault();
                    String string = mainActivity.getString(R$string.lingqs_offer_title);
                    string.getClass();
                    ci8.m4718c(0, tj3Var4, String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue5)}, 1)), z);
                }
                break;
            case 4:
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i11 = MainActivity.f33994m0;
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    tj3Var5.m22102U();
                } else {
                    AbstractC3122is.m14089c(mainActivity.m9802q(), mainActivity.m9800n(), (h24) AbstractC0711a.m2512b(mainActivity.m9802q().f34204f.mo7012d2(), null, tj3Var5, 48).getValue(), tj3Var5, 0);
                }
                break;
            case 5:
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i12 = MainActivity.f33994m0;
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (!tj3Var6.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    tj3Var6.m22102U();
                } else {
                    yq7 yq7Var = (yq7) AbstractC0711a.m2513c(mainActivity.m9802q().f34211m.mo3010a2(), tj3Var6).getValue();
                    boolean zM22124i3 = tj3Var6.m22124i(mainActivity);
                    Object objM22097O3 = tj3Var6.m22097O();
                    if (zM22124i3 || objM22097O3 == p84Var) {
                        objM22097O3 = new ui3() { // from class: vo5
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i13 = i4;
                                xfa xfaVar2 = xfa.f68157a;
                                MainActivity mainActivity2 = mainActivity;
                                switch (i13) {
                                    case 0:
                                        int i14 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3739j2();
                                        break;
                                    case 1:
                                        int i15 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3008J2();
                                        break;
                                    case 2:
                                        int i16 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3004B2();
                                        break;
                                    default:
                                        int i17 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3005C();
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var6.m22131l0(objM22097O3);
                    }
                    ui3 ui3Var2 = (ui3) objM22097O3;
                    boolean zM22124i4 = tj3Var6.m22124i(mainActivity);
                    Object objM22097O4 = tj3Var6.m22097O();
                    if (zM22124i4 || objM22097O4 == p84Var) {
                        objM22097O4 = new vi3() { // from class: wo5
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                boolean zBooleanValue2;
                                int i13 = i4;
                                boolean z2 = false;
                                xfa xfaVar2 = xfa.f68157a;
                                MainActivity mainActivity2 = mainActivity;
                                switch (i13) {
                                    case 0:
                                        UpgradeReason upgradeReason = (UpgradeReason) obj3;
                                        int i14 = MainActivity.f33994m0;
                                        upgradeReason.getClass();
                                        mainActivity2.m9802q().mo3739j2();
                                        String strM25660c = zha.m25660c(upgradeReason);
                                        boolean z3 = upgradeReason == UpgradeReason.LYNX_OUT_OF_CREDITS || upgradeReason == UpgradeReason.GATED_TOOL || upgradeReason == UpgradeReason.GATED_TOOL_PLUS;
                                        int i15 = yha.f69857a[upgradeReason.ordinal()];
                                        if (i15 != 9) {
                                            switch (i15) {
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                    z2 = true;
                                                    break;
                                                default:
                                                    if (z3 && mainActivity2.m9802q().f34200b.mo4593p0() && !mainActivity2.m9802q().f34200b.mo4588a0()) {
                                                        z2 = true;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            z2 = true;
                                        }
                                        mainActivity2.m9806w(strM25660c, null, z2);
                                        break;
                                    case 1:
                                        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                                        int i16 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3014z2(zBooleanValue3);
                                        break;
                                    case 2:
                                        boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                                        int i17 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3007G2(zBooleanValue4);
                                        break;
                                    case 3:
                                        String str = (String) obj3;
                                        int i18 = MainActivity.f33994m0;
                                        str.getClass();
                                        C2889e c2889eM9802q = mainActivity2.m9802q();
                                        c2889eM9802q.getClass();
                                        c2889eM9802q.f34211m.mo3006D2(str);
                                        break;
                                    case 4:
                                        RatingContentType ratingContentType = (RatingContentType) obj3;
                                        int i19 = MainActivity.f33994m0;
                                        ratingContentType.getClass();
                                        C2889e c2889eM9802q2 = mainActivity2.m9802q();
                                        c2889eM9802q2.getClass();
                                        c2889eM9802q2.f34211m.mo3013z(ratingContentType);
                                        break;
                                    default:
                                        boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                                        int i110 = MainActivity.f33994m0;
                                        AbstractC2891g.m9818b("launchPlayReview called (isNative=" + zBooleanValue5 + ")", null);
                                        if (zBooleanValue5) {
                                            try {
                                                Object obj4 = Class.forName(mainActivity2.getPackageName() + ".BuildConfig").getField("DEV_OPTIONS_AVAILABLE").get(null);
                                                obj4.getClass();
                                                zBooleanValue2 = ((Boolean) obj4).booleanValue();
                                            } catch (Exception unused) {
                                                zBooleanValue2 = (mainActivity2.getApplicationInfo().flags & 2) != 0;
                                            }
                                            kd8 c3156jq = zBooleanValue2 ? new C3156jq((Object) mainActivity2) : lwc.m16559a(mainActivity2);
                                            AbstractC2891g.m9818b("Using ".concat(zBooleanValue2 ? "FakeReviewManager (dev build)" : "Play ReviewManager"), null);
                                            c3156jq.mo6256g().m22200o(new vg1(15, c3156jq, mainActivity2));
                                        } else {
                                            AbstractC2891g.m9818b("Non-native prompt -> opening Play Store listing directly", null);
                                            AbstractC2891g.m9819c(mainActivity2);
                                        }
                                        mainActivity2.m9802q().mo3009L1();
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var6.m22131l0(objM22097O4);
                    }
                    vi3 vi3Var = (vi3) objM22097O4;
                    boolean zM22124i5 = tj3Var6.m22124i(mainActivity);
                    Object objM22097O5 = tj3Var6.m22097O();
                    if (zM22124i5 || objM22097O5 == p84Var) {
                        objM22097O5 = new vi3() { // from class: wo5
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                boolean zBooleanValue2;
                                int i13 = i5;
                                boolean z2 = false;
                                xfa xfaVar2 = xfa.f68157a;
                                MainActivity mainActivity2 = mainActivity;
                                switch (i13) {
                                    case 0:
                                        UpgradeReason upgradeReason = (UpgradeReason) obj3;
                                        int i14 = MainActivity.f33994m0;
                                        upgradeReason.getClass();
                                        mainActivity2.m9802q().mo3739j2();
                                        String strM25660c = zha.m25660c(upgradeReason);
                                        boolean z3 = upgradeReason == UpgradeReason.LYNX_OUT_OF_CREDITS || upgradeReason == UpgradeReason.GATED_TOOL || upgradeReason == UpgradeReason.GATED_TOOL_PLUS;
                                        int i15 = yha.f69857a[upgradeReason.ordinal()];
                                        if (i15 != 9) {
                                            switch (i15) {
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                    z2 = true;
                                                    break;
                                                default:
                                                    if (z3 && mainActivity2.m9802q().f34200b.mo4593p0() && !mainActivity2.m9802q().f34200b.mo4588a0()) {
                                                        z2 = true;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            z2 = true;
                                        }
                                        mainActivity2.m9806w(strM25660c, null, z2);
                                        break;
                                    case 1:
                                        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                                        int i16 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3014z2(zBooleanValue3);
                                        break;
                                    case 2:
                                        boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                                        int i17 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3007G2(zBooleanValue4);
                                        break;
                                    case 3:
                                        String str = (String) obj3;
                                        int i18 = MainActivity.f33994m0;
                                        str.getClass();
                                        C2889e c2889eM9802q = mainActivity2.m9802q();
                                        c2889eM9802q.getClass();
                                        c2889eM9802q.f34211m.mo3006D2(str);
                                        break;
                                    case 4:
                                        RatingContentType ratingContentType = (RatingContentType) obj3;
                                        int i19 = MainActivity.f33994m0;
                                        ratingContentType.getClass();
                                        C2889e c2889eM9802q2 = mainActivity2.m9802q();
                                        c2889eM9802q2.getClass();
                                        c2889eM9802q2.f34211m.mo3013z(ratingContentType);
                                        break;
                                    default:
                                        boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                                        int i110 = MainActivity.f33994m0;
                                        AbstractC2891g.m9818b("launchPlayReview called (isNative=" + zBooleanValue5 + ")", null);
                                        if (zBooleanValue5) {
                                            try {
                                                Object obj4 = Class.forName(mainActivity2.getPackageName() + ".BuildConfig").getField("DEV_OPTIONS_AVAILABLE").get(null);
                                                obj4.getClass();
                                                zBooleanValue2 = ((Boolean) obj4).booleanValue();
                                            } catch (Exception unused) {
                                                zBooleanValue2 = (mainActivity2.getApplicationInfo().flags & 2) != 0;
                                            }
                                            kd8 c3156jq = zBooleanValue2 ? new C3156jq((Object) mainActivity2) : lwc.m16559a(mainActivity2);
                                            AbstractC2891g.m9818b("Using ".concat(zBooleanValue2 ? "FakeReviewManager (dev build)" : "Play ReviewManager"), null);
                                            c3156jq.mo6256g().m22200o(new vg1(15, c3156jq, mainActivity2));
                                        } else {
                                            AbstractC2891g.m9818b("Non-native prompt -> opening Play Store listing directly", null);
                                            AbstractC2891g.m9819c(mainActivity2);
                                        }
                                        mainActivity2.m9802q().mo3009L1();
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var6.m22131l0(objM22097O5);
                    }
                    vi3 vi3Var2 = (vi3) objM22097O5;
                    boolean zM22124i6 = tj3Var6.m22124i(mainActivity);
                    Object objM22097O6 = tj3Var6.m22097O();
                    if (zM22124i6 || objM22097O6 == p84Var) {
                        objM22097O6 = new ui3() { // from class: vo5
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i13 = i5;
                                xfa xfaVar2 = xfa.f68157a;
                                MainActivity mainActivity2 = mainActivity;
                                switch (i13) {
                                    case 0:
                                        int i14 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3739j2();
                                        break;
                                    case 1:
                                        int i15 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3008J2();
                                        break;
                                    case 2:
                                        int i16 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3004B2();
                                        break;
                                    default:
                                        int i17 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3005C();
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var6.m22131l0(objM22097O6);
                    }
                    ui3 ui3Var3 = (ui3) objM22097O6;
                    boolean zM22124i7 = tj3Var6.m22124i(mainActivity);
                    Object objM22097O7 = tj3Var6.m22097O();
                    if (zM22124i7 || objM22097O7 == p84Var) {
                        objM22097O7 = new vi3() { // from class: wo5
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                boolean zBooleanValue2;
                                int i13 = i6;
                                boolean z2 = false;
                                xfa xfaVar2 = xfa.f68157a;
                                MainActivity mainActivity2 = mainActivity;
                                switch (i13) {
                                    case 0:
                                        UpgradeReason upgradeReason = (UpgradeReason) obj3;
                                        int i14 = MainActivity.f33994m0;
                                        upgradeReason.getClass();
                                        mainActivity2.m9802q().mo3739j2();
                                        String strM25660c = zha.m25660c(upgradeReason);
                                        boolean z3 = upgradeReason == UpgradeReason.LYNX_OUT_OF_CREDITS || upgradeReason == UpgradeReason.GATED_TOOL || upgradeReason == UpgradeReason.GATED_TOOL_PLUS;
                                        int i15 = yha.f69857a[upgradeReason.ordinal()];
                                        if (i15 != 9) {
                                            switch (i15) {
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                    z2 = true;
                                                    break;
                                                default:
                                                    if (z3 && mainActivity2.m9802q().f34200b.mo4593p0() && !mainActivity2.m9802q().f34200b.mo4588a0()) {
                                                        z2 = true;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            z2 = true;
                                        }
                                        mainActivity2.m9806w(strM25660c, null, z2);
                                        break;
                                    case 1:
                                        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                                        int i16 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3014z2(zBooleanValue3);
                                        break;
                                    case 2:
                                        boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                                        int i17 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3007G2(zBooleanValue4);
                                        break;
                                    case 3:
                                        String str = (String) obj3;
                                        int i18 = MainActivity.f33994m0;
                                        str.getClass();
                                        C2889e c2889eM9802q = mainActivity2.m9802q();
                                        c2889eM9802q.getClass();
                                        c2889eM9802q.f34211m.mo3006D2(str);
                                        break;
                                    case 4:
                                        RatingContentType ratingContentType = (RatingContentType) obj3;
                                        int i19 = MainActivity.f33994m0;
                                        ratingContentType.getClass();
                                        C2889e c2889eM9802q2 = mainActivity2.m9802q();
                                        c2889eM9802q2.getClass();
                                        c2889eM9802q2.f34211m.mo3013z(ratingContentType);
                                        break;
                                    default:
                                        boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                                        int i110 = MainActivity.f33994m0;
                                        AbstractC2891g.m9818b("launchPlayReview called (isNative=" + zBooleanValue5 + ")", null);
                                        if (zBooleanValue5) {
                                            try {
                                                Object obj4 = Class.forName(mainActivity2.getPackageName() + ".BuildConfig").getField("DEV_OPTIONS_AVAILABLE").get(null);
                                                obj4.getClass();
                                                zBooleanValue2 = ((Boolean) obj4).booleanValue();
                                            } catch (Exception unused) {
                                                zBooleanValue2 = (mainActivity2.getApplicationInfo().flags & 2) != 0;
                                            }
                                            kd8 c3156jq = zBooleanValue2 ? new C3156jq((Object) mainActivity2) : lwc.m16559a(mainActivity2);
                                            AbstractC2891g.m9818b("Using ".concat(zBooleanValue2 ? "FakeReviewManager (dev build)" : "Play ReviewManager"), null);
                                            c3156jq.mo6256g().m22200o(new vg1(15, c3156jq, mainActivity2));
                                        } else {
                                            AbstractC2891g.m9818b("Non-native prompt -> opening Play Store listing directly", null);
                                            AbstractC2891g.m9819c(mainActivity2);
                                        }
                                        mainActivity2.m9802q().mo3009L1();
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var6.m22131l0(objM22097O7);
                    }
                    vi3 vi3Var3 = (vi3) objM22097O7;
                    boolean zM22124i8 = tj3Var6.m22124i(mainActivity);
                    Object objM22097O8 = tj3Var6.m22097O();
                    if (zM22124i8 || objM22097O8 == p84Var) {
                        objM22097O8 = new vi3() { // from class: wo5
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                boolean zBooleanValue2;
                                int i13 = i3;
                                boolean z2 = false;
                                xfa xfaVar2 = xfa.f68157a;
                                MainActivity mainActivity2 = mainActivity;
                                switch (i13) {
                                    case 0:
                                        UpgradeReason upgradeReason = (UpgradeReason) obj3;
                                        int i14 = MainActivity.f33994m0;
                                        upgradeReason.getClass();
                                        mainActivity2.m9802q().mo3739j2();
                                        String strM25660c = zha.m25660c(upgradeReason);
                                        boolean z3 = upgradeReason == UpgradeReason.LYNX_OUT_OF_CREDITS || upgradeReason == UpgradeReason.GATED_TOOL || upgradeReason == UpgradeReason.GATED_TOOL_PLUS;
                                        int i15 = yha.f69857a[upgradeReason.ordinal()];
                                        if (i15 != 9) {
                                            switch (i15) {
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                    z2 = true;
                                                    break;
                                                default:
                                                    if (z3 && mainActivity2.m9802q().f34200b.mo4593p0() && !mainActivity2.m9802q().f34200b.mo4588a0()) {
                                                        z2 = true;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            z2 = true;
                                        }
                                        mainActivity2.m9806w(strM25660c, null, z2);
                                        break;
                                    case 1:
                                        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                                        int i16 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3014z2(zBooleanValue3);
                                        break;
                                    case 2:
                                        boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                                        int i17 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3007G2(zBooleanValue4);
                                        break;
                                    case 3:
                                        String str = (String) obj3;
                                        int i18 = MainActivity.f33994m0;
                                        str.getClass();
                                        C2889e c2889eM9802q = mainActivity2.m9802q();
                                        c2889eM9802q.getClass();
                                        c2889eM9802q.f34211m.mo3006D2(str);
                                        break;
                                    case 4:
                                        RatingContentType ratingContentType = (RatingContentType) obj3;
                                        int i19 = MainActivity.f33994m0;
                                        ratingContentType.getClass();
                                        C2889e c2889eM9802q2 = mainActivity2.m9802q();
                                        c2889eM9802q2.getClass();
                                        c2889eM9802q2.f34211m.mo3013z(ratingContentType);
                                        break;
                                    default:
                                        boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                                        int i110 = MainActivity.f33994m0;
                                        AbstractC2891g.m9818b("launchPlayReview called (isNative=" + zBooleanValue5 + ")", null);
                                        if (zBooleanValue5) {
                                            try {
                                                Object obj4 = Class.forName(mainActivity2.getPackageName() + ".BuildConfig").getField("DEV_OPTIONS_AVAILABLE").get(null);
                                                obj4.getClass();
                                                zBooleanValue2 = ((Boolean) obj4).booleanValue();
                                            } catch (Exception unused) {
                                                zBooleanValue2 = (mainActivity2.getApplicationInfo().flags & 2) != 0;
                                            }
                                            kd8 c3156jq = zBooleanValue2 ? new C3156jq((Object) mainActivity2) : lwc.m16559a(mainActivity2);
                                            AbstractC2891g.m9818b("Using ".concat(zBooleanValue2 ? "FakeReviewManager (dev build)" : "Play ReviewManager"), null);
                                            c3156jq.mo6256g().m22200o(new vg1(15, c3156jq, mainActivity2));
                                        } else {
                                            AbstractC2891g.m9818b("Non-native prompt -> opening Play Store listing directly", null);
                                            AbstractC2891g.m9819c(mainActivity2);
                                        }
                                        mainActivity2.m9802q().mo3009L1();
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var6.m22131l0(objM22097O8);
                    }
                    vi3 vi3Var4 = (vi3) objM22097O8;
                    boolean zM22124i9 = tj3Var6.m22124i(mainActivity);
                    Object objM22097O9 = tj3Var6.m22097O();
                    if (zM22124i9 || objM22097O9 == p84Var) {
                        objM22097O9 = new ui3() { // from class: vo5
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i13 = i6;
                                xfa xfaVar2 = xfa.f68157a;
                                MainActivity mainActivity2 = mainActivity;
                                switch (i13) {
                                    case 0:
                                        int i14 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3739j2();
                                        break;
                                    case 1:
                                        int i15 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3008J2();
                                        break;
                                    case 2:
                                        int i16 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3004B2();
                                        break;
                                    default:
                                        int i17 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3005C();
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var6.m22131l0(objM22097O9);
                    }
                    ui3 ui3Var4 = (ui3) objM22097O9;
                    boolean zM22124i10 = tj3Var6.m22124i(mainActivity);
                    Object objM22097O10 = tj3Var6.m22097O();
                    if (zM22124i10 || objM22097O10 == p84Var) {
                        objM22097O10 = new vi3() { // from class: wo5
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                boolean zBooleanValue2;
                                int i13 = i2;
                                boolean z2 = false;
                                xfa xfaVar2 = xfa.f68157a;
                                MainActivity mainActivity2 = mainActivity;
                                switch (i13) {
                                    case 0:
                                        UpgradeReason upgradeReason = (UpgradeReason) obj3;
                                        int i14 = MainActivity.f33994m0;
                                        upgradeReason.getClass();
                                        mainActivity2.m9802q().mo3739j2();
                                        String strM25660c = zha.m25660c(upgradeReason);
                                        boolean z3 = upgradeReason == UpgradeReason.LYNX_OUT_OF_CREDITS || upgradeReason == UpgradeReason.GATED_TOOL || upgradeReason == UpgradeReason.GATED_TOOL_PLUS;
                                        int i15 = yha.f69857a[upgradeReason.ordinal()];
                                        if (i15 != 9) {
                                            switch (i15) {
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                    z2 = true;
                                                    break;
                                                default:
                                                    if (z3 && mainActivity2.m9802q().f34200b.mo4593p0() && !mainActivity2.m9802q().f34200b.mo4588a0()) {
                                                        z2 = true;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            z2 = true;
                                        }
                                        mainActivity2.m9806w(strM25660c, null, z2);
                                        break;
                                    case 1:
                                        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                                        int i16 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3014z2(zBooleanValue3);
                                        break;
                                    case 2:
                                        boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                                        int i17 = MainActivity.f33994m0;
                                        mainActivity2.m9802q().mo3007G2(zBooleanValue4);
                                        break;
                                    case 3:
                                        String str = (String) obj3;
                                        int i18 = MainActivity.f33994m0;
                                        str.getClass();
                                        C2889e c2889eM9802q = mainActivity2.m9802q();
                                        c2889eM9802q.getClass();
                                        c2889eM9802q.f34211m.mo3006D2(str);
                                        break;
                                    case 4:
                                        RatingContentType ratingContentType = (RatingContentType) obj3;
                                        int i19 = MainActivity.f33994m0;
                                        ratingContentType.getClass();
                                        C2889e c2889eM9802q2 = mainActivity2.m9802q();
                                        c2889eM9802q2.getClass();
                                        c2889eM9802q2.f34211m.mo3013z(ratingContentType);
                                        break;
                                    default:
                                        boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                                        int i110 = MainActivity.f33994m0;
                                        AbstractC2891g.m9818b("launchPlayReview called (isNative=" + zBooleanValue5 + ")", null);
                                        if (zBooleanValue5) {
                                            try {
                                                Object obj4 = Class.forName(mainActivity2.getPackageName() + ".BuildConfig").getField("DEV_OPTIONS_AVAILABLE").get(null);
                                                obj4.getClass();
                                                zBooleanValue2 = ((Boolean) obj4).booleanValue();
                                            } catch (Exception unused) {
                                                zBooleanValue2 = (mainActivity2.getApplicationInfo().flags & 2) != 0;
                                            }
                                            kd8 c3156jq = zBooleanValue2 ? new C3156jq((Object) mainActivity2) : lwc.m16559a(mainActivity2);
                                            AbstractC2891g.m9818b("Using ".concat(zBooleanValue2 ? "FakeReviewManager (dev build)" : "Play ReviewManager"), null);
                                            c3156jq.mo6256g().m22200o(new vg1(15, c3156jq, mainActivity2));
                                        } else {
                                            AbstractC2891g.m9818b("Non-native prompt -> opening Play Store listing directly", null);
                                            AbstractC2891g.m9819c(mainActivity2);
                                        }
                                        mainActivity2.m9802q().mo3009L1();
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var6.m22131l0(objM22097O10);
                    }
                    AbstractC2891g.m9817a(yq7Var, ui3Var2, vi3Var, vi3Var2, ui3Var3, vi3Var3, vi3Var4, ui3Var4, (vi3) objM22097O10, tj3Var6, 0);
                }
                break;
            case 6:
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i13 = MainActivity.f33994m0;
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (!tj3Var7.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    tj3Var7.m22102U();
                } else {
                    fy9.m12246a(false, null, ci8.m4703P(-1812139549, new so5(mainActivity, i2), tj3Var7), tj3Var7, 384);
                }
                break;
            default:
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i14 = MainActivity.f33994m0;
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (!tj3Var8.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    tj3Var8.m22102U();
                } else {
                    fy9.m12246a(false, null, ci8.m4703P(1516057026, new so5(mainActivity, i3), tj3Var8), tj3Var8, 384);
                }
                break;
        }
        return xfaVar;
    }
}
