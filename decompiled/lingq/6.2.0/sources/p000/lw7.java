package p000;

import android.view.View;
import android.widget.PopupWindow;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonExitPath;
import com.lingq.core.domain.model.language.Language;
import com.lingq.feature.reader.old.C2412n;
import com.lingq.feature.reader.old.ReaderFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class lw7 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50210a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f50211b;

    public /* synthetic */ lw7(ReaderFragment readerFragment, int i) {
        this.f50210a = i;
        this.f50211b = readerFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i = this.f50210a;
        ReaderFragment readerFragment = this.f50211b;
        switch (i) {
            case 0:
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                readerFragment.m9290W0().m9338r3();
                return;
            case 1:
                PopupWindow popupWindow = readerFragment.f28223G0;
                if (popupWindow == null) {
                    fa4.m11636J("popupSettings");
                    throw null;
                }
                popupWindow.dismiss();
                readerFragment.m9290W0().m9338r3();
                return;
            case 2:
                PopupWindow popupWindow2 = readerFragment.f28223G0;
                if (popupWindow2 == null) {
                    fa4.m11636J("popupSettings");
                    throw null;
                }
                popupWindow2.dismiss();
                readerFragment.m9291X0(true);
                readerFragment.m9290W0().m9336p3(true);
                return;
            case 3:
                PopupWindow popupWindow3 = readerFragment.f28223G0;
                if (popupWindow3 == null) {
                    fa4.m11636J("popupSettings");
                    throw null;
                }
                popupWindow3.dismiss();
                readerFragment.m9289V0().m23737z(fa6.f38722b);
                return;
            case 4:
                PopupWindow popupWindow4 = readerFragment.f28223G0;
                if (popupWindow4 == null) {
                    fa4.m11636J("popupSettings");
                    throw null;
                }
                popupWindow4.dismiss();
                C2412n c2412nM9290W0 = readerFragment.m9290W0();
                cma cmaVar = c2412nM9290W0.f29340b;
                String strMo4580K1 = cmaVar.mo4580K1();
                Language language = (Language) cmaVar.mo4572B0().getValue();
                if (language == null || (str = language.f19033j) == null) {
                    str = "";
                }
                c2412nM9290W0.f29405s1.mo4677k(new jx7(wq1.m24119o("https://www.lingq.com/", strMo4580K1, "/grammar-resource/", str)));
                return;
            case 5:
                PopupWindow popupWindow5 = readerFragment.f28223G0;
                if (popupWindow5 == null) {
                    fa4.m11636J("popupSettings");
                    throw null;
                }
                popupWindow5.dismiss();
                readerFragment.m9289V0().m23737z(x96.f67977b);
                return;
            case 6:
                PopupWindow popupWindow6 = readerFragment.f28223G0;
                if (popupWindow6 == null) {
                    fa4.m11636J("popupSettings");
                    throw null;
                }
                popupWindow6.dismiss();
                readerFragment.m9290W0().mo50y(LqAnalyticsValues$LessonExitPath.Other);
                vz1.m23640l0(readerFragment);
                yw7 yw7Var = zw7.Companion;
                int iM9332l3 = readerFragment.m9290W0().m9332l3();
                yw7Var.getClass();
                jfa.m14428k(b34.m3244j(readerFragment), new ww7(iM9332l3, false), null);
                return;
            default:
                readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, true));
                return;
        }
    }
}
