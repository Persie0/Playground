package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.analytics.data.LqAnalyticsValues$UpgradePopupSource;
import com.lingq.core.domain.model.language.Language;
import com.lingq.feature.more.MoreFragment;
import kotlinx.coroutines.channels.C3211a;
import p000.b34;
import p000.cma;
import p000.ha6;
import p000.id3;
import p000.lda;
import p000.mbd;
import p000.mh6;
import p000.na6;
import p000.nh6;
import p000.oh6;
import p000.pa6;
import p000.ph6;
import p000.q96;
import p000.qh6;
import p000.rh6;
import p000.sh6;
import p000.tg6;
import p000.th6;
import p000.uh6;
import p000.v26;
import p000.vg6;
import p000.vh6;
import p000.wfb;
import p000.wh6;
import p000.x96;
import p000.xfa;
import p000.y96;
import p000.z96;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d26 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34867a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MoreFragment f34868b;

    public /* synthetic */ d26(MoreFragment moreFragment, int i) {
        this.f34867a = i;
        this.f34868b = moreFragment;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f34867a;
        xfa xfaVar = xfa.f68157a;
        final MoreFragment moreFragment = this.f34868b;
        switch (i) {
            case 0:
                Bundle bundle = (Bundle) obj2;
                ((String) obj).getClass();
                bundle.getClass();
                int i2 = bundle.getInt("lessonImportedId");
                if (i2 != 0) {
                    moreFragment.m9093R0().m23737z(new ja6(i2, 0, "", LqAnalyticsValues$LessonPath.Unknown.f14315a));
                }
                break;
            default:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    boolean zM22124i = tj3Var.m22124i(moreFragment);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22124i || objM22097O == we1.f66679a) {
                        objM22097O = new vi3() { // from class: com.lingq.feature.more.b
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                String str;
                                vg6 vg6Var = (vg6) obj3;
                                vg6Var.getClass();
                                boolean zEquals = vg6Var.equals(tg6.f62255a);
                                MoreFragment moreFragment2 = moreFragment;
                                if (zEquals) {
                                    b34.m3244j(moreFragment2).m22689f();
                                } else if (vg6Var.equals(wh6.f66830a)) {
                                    moreFragment2.m9093R0().m23737z(new na6(b34.m3244j(moreFragment2.m2091S())));
                                } else if (vg6Var.equals(uh6.f63928a)) {
                                    moreFragment2.m9093R0().m23737z(ha6.f42093b);
                                } else if (vg6Var.equals(oh6.f54353a)) {
                                    moreFragment2.m9093R0().m23737z(q96.f57452b);
                                } else if (vg6Var.equals(sh6.f60864a)) {
                                    moreFragment2.m9093R0().m23737z(new y96(b34.m3244j(moreFragment2)));
                                } else if (vg6Var.equals(qh6.f57784a)) {
                                    v26 v26VarM9094S0 = moreFragment2.m9094S0();
                                    C3211a c3211a = v26VarM9094S0.f64736e;
                                    cma cmaVar = v26VarM9094S0.f64735d;
                                    String strMo4580K1 = cmaVar.mo4580K1();
                                    Language language = (Language) cmaVar.mo4572B0().getValue();
                                    if (language == null || (str = language.f19033j) == null) {
                                        str = "";
                                    }
                                    c3211a.mo4677k("https://www.lingq.com/" + strMo4580K1 + "/grammar-resource/" + str);
                                } else if (vg6Var.equals(ph6.f56223a)) {
                                    id3 id3VarM2089Q = moreFragment2.m2089Q();
                                    int i3 = R$string.lingq_forum;
                                    b34.m3244j(moreFragment2);
                                    mbd.m16755c(id3VarM2089Q, "https://forum.lingq.com/", Integer.valueOf(i3), 16);
                                } else if (vg6Var.equals(rh6.f59311a)) {
                                    moreFragment2.m9093R0().m23737z(x96.f67977b);
                                } else if (vg6Var.equals(th6.f62291a)) {
                                    moreFragment2.m9093R0().m23737z(new z96(b34.m3244j(moreFragment2)));
                                } else if (vg6Var.equals(vh6.f65395a)) {
                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + moreFragment2.m2089Q().getPackageName()));
                                    intent.addFlags(1208483840);
                                    try {
                                        moreFragment2.m2100a0(intent);
                                    } catch (ActivityNotFoundException unused) {
                                        moreFragment2.m2100a0(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + moreFragment2.m2089Q().getPackageName())));
                                    }
                                } else if (vg6Var.equals(nh6.f52737a)) {
                                    v26 v26VarM9094S1 = moreFragment2.m9094S0();
                                    v26VarM9094S1.getClass();
                                    wfb.m23926u(lda.m16103C(v26VarM9094S1), null, null, new MoreViewModel$closePromo$1(v26VarM9094S1, null), 3);
                                } else if (vg6Var instanceof mh6) {
                                    moreFragment2.m9093R0().m23737z(new pa6(LqAnalyticsValues$UpgradePopupSource.HomeScreenButtonClick.getValue(), 6, ((mh6) vg6Var).f51326a));
                                }
                                return xfa.f68157a;
                            }
                        };
                        tj3Var.m22131l0(objM22097O);
                    }
                    cqb.m9853c(null, (vi3) objM22097O, tj3Var, 0);
                }
                break;
        }
        return xfaVar;
    }
}
