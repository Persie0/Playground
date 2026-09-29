package p302oi;

import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import com.lingq.p055ui.MainActivity;
import com.linguist.R;
import dm.C5207g;
import mo.C7661i;
import p040c4.C1688m;

/* JADX INFO: renamed from: oi.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8053d implements NavController.InterfaceC1074a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NavController f43742a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MainActivity f43743b;

    public C8053d(C1688m c1688m, MainActivity mainActivity) {
        this.f43742a = c1688m;
        this.f43743b = mainActivity;
    }

    @Override // androidx.navigation.NavController.InterfaceC1074a
    /* JADX INFO: renamed from: a */
    public final void mo4010a(NavController navController, NavDestination navDestination) {
        C5207g.m11111f(navController, "<anonymous parameter 0>");
        C5207g.m11111f(navDestination, "<anonymous parameter 1>");
        NavController navController2 = this.f43742a;
        NavDestination navDestinationM3986g = navController2.m3986g();
        if (navDestinationM3986g != null && navDestinationM3986g.f6834h == R.id.fragment_home) {
            MainActivity mainActivity = this.f43743b;
            if (!C7661i.m15250P2(mainActivity.f22172Z)) {
                mainActivity.m9709Q(mainActivity.f22172Z, navController2, true);
                mainActivity.f22172Z = "";
            }
        }
    }
}
