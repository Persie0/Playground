package com.google.android.material.navigation;

import android.view.MenuItem;
import androidx.appcompat.view.menu.C0224f;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.lingq.p055ui.home.HomeFragment;
import com.linguist.R;
import dm.C5207g;
import dm.C5212l;
import km.InterfaceC6727j;
import p040c4.C1688m;
import p040c4.C1690o;
import p402u0.C9369l;
import p402u0.C9371n;

/* JADX INFO: renamed from: com.google.android.material.navigation.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3045a implements C0224f.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NavigationBarView f15428a;

    public C3045a(BottomNavigationView bottomNavigationView) {
        this.f15428a = bottomNavigationView;
    }

    @Override // androidx.appcompat.view.menu.C0224f.a
    /* JADX INFO: renamed from: a */
    public final boolean mo940a(C0224f c0224f, MenuItem menuItem) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        NavDestination navDestination;
        NavigationBarView navigationBarView = this.f15428a;
        if (navigationBarView.f15426f != null && menuItem.getItemId() == navigationBarView.getSelectedItemId()) {
            HomeFragment homeFragment = (HomeFragment) ((C9371n) navigationBarView.f15426f).f48145b;
            InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
            C5207g.m11111f(homeFragment, "this$0");
            C1688m c1688m = homeFragment.f22656C0;
            if (c1688m == null) {
                C5207g.m11117l("navController");
                throw null;
            }
            NavBackStackEntry navBackStackEntryM17663G = c1688m.f6758g.m17663G();
            Integer numValueOf = (navBackStackEntryM17663G == null || (navDestination = navBackStackEntryM17663G.f6731b) == null) ? null : Integer.valueOf(navDestination.f6834h);
            if (numValueOf != null) {
                numValueOf.intValue();
                if (menuItem.getItemId() != numValueOf.intValue()) {
                    C1690o c1690o = new C1690o(false, false, menuItem.getItemId(), true, false, -1, -1, -1, -1);
                    try {
                        C1688m c1688m2 = homeFragment.f22656C0;
                        if (c1688m2 == null) {
                            C5207g.m11117l("navController");
                            throw null;
                        }
                        c1688m2.m3992m(menuItem.getItemId(), null, c1690o);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
            return true;
        }
        NavigationBarView.InterfaceC3044b interfaceC3044b = navigationBarView.f15425e;
        if (interfaceC3044b != null) {
            NavController navController = (NavController) ((C9369l) interfaceC3044b).f48141b;
            C5207g.m11111f(navController, "$navController");
            C5207g.m11111f(menuItem, "item");
            boolean z12 = false;
            NavDestination navDestinationM3986g = navController.m3986g();
            C5207g.m11108c(navDestinationM3986g);
            NavGraph navGraph = navDestinationM3986g.f6828b;
            C5207g.m11108c(navGraph);
            if (navGraph.m4024t(menuItem.getItemId(), true) instanceof ActivityNavigator.C1068a) {
                i10 = R.anim.nav_default_enter_anim;
                i11 = R.anim.nav_default_exit_anim;
                i12 = R.anim.nav_default_pop_enter_anim;
                i13 = R.anim.nav_default_pop_exit_anim;
            } else {
                i10 = R.animator.nav_default_enter_anim;
                i11 = R.animator.nav_default_exit_anim;
                i12 = R.animator.nav_default_pop_enter_anim;
                i13 = R.animator.nav_default_pop_exit_anim;
            }
            int i15 = i10;
            int i16 = i11;
            int i17 = i12;
            int i18 = i13;
            if ((menuItem.getOrder() & 196608) == 0) {
                int i19 = NavGraph.f6842J;
                i14 = NavGraph.Companion.m4026a(navController.m3988i()).f6834h;
                z10 = true;
            } else {
                i14 = -1;
                z10 = false;
            }
            try {
                navController.m3992m(menuItem.getItemId(), null, new C1690o(true, true, i14, false, z10, i15, i16, i17, i18));
                NavDestination navDestinationM3986g2 = navController.m3986g();
                if (navDestinationM3986g2 != null) {
                    z11 = true;
                    if (C5212l.m11155b0(navDestinationM3986g2, menuItem.getItemId())) {
                        z12 = true;
                    }
                } else {
                    z11 = true;
                }
            } catch (IllegalArgumentException unused2) {
            }
            if (!z12) {
                return z11;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.C0224f.a
    /* JADX INFO: renamed from: b */
    public final void mo941b(C0224f c0224f) {
    }
}
