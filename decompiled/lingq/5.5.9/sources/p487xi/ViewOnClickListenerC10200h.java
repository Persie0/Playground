package p487xi;

import android.os.Build;
import android.view.View;
import androidx.fragment.app.AbstractC0986x;
import androidx.fragment.app.C0964m;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.language.stats.StatsShareFragment;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import p254m2.C7472a;
import p274n8.DialogInterfaceOnClickListenerC7720e;
import tc.C9249b;

/* JADX INFO: renamed from: xi.h */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC10200h implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51572a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f51573b;

    public /* synthetic */ ViewOnClickListenerC10200h(int i10, Object obj) {
        this.f51572a = i10;
        this.f51573b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f51572a;
        Object obj = this.f51573b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C10201i c10201i = (C10201i) obj;
                C5207g.m11111f(c10201i, "this$0");
                c10201i.f51574e.mo9916h();
                return;
            default:
                StatsShareFragment statsShareFragment = (StatsShareFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = StatsShareFragment.f24390T0;
                C5207g.m11111f(statsShareFragment, "this$0");
                if (Build.VERSION.SDK_INT >= 29) {
                    statsShareFragment.m9922v0().m9924m2();
                    return;
                }
                if (C7472a.m14841a(statsShareFragment.m3578a0(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    statsShareFragment.m9922v0().m9924m2();
                    return;
                }
                AbstractC0986x<?> abstractC0986x = statsShareFragment.f6078P;
                if (!(abstractC0986x != null ? abstractC0986x.mo3810n0("android.permission.WRITE_EXTERNAL_STORAGE") : false)) {
                    C0964m c0964m = statsShareFragment.f24393S0;
                    if (c0964m != null) {
                        c0964m.mo844a("android.permission.WRITE_EXTERNAL_STORAGE");
                        return;
                    } else {
                        C5207g.m11117l("requestPermissionLauncher");
                        throw null;
                    }
                }
                C9249b c9249b = new C9249b(statsShareFragment.m3578a0());
                c9249b.setTitle(statsShareFragment.m3600t(R.string.share_image_permission_title));
                c9249b.f599a.f579f = statsShareFragment.m3600t(R.string.share_image_permission_desc);
                c9249b.m17612e(statsShareFragment.m3600t(R.string.ui_ok), new DialogInterfaceOnClickListenerC7720e(1, statsShareFragment));
                c9249b.m17610c(statsShareFragment.m3600t(R.string.ui_cancel), null);
                c9249b.m876a();
                return;
        }
    }
}
