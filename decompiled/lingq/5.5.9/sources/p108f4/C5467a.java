package p108f4;

import android.view.Menu;
import android.view.MenuItem;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import com.google.android.material.navigation.NavigationBarView;
import dm.C5207g;
import dm.C5212l;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: f4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5467a implements NavController.InterfaceC1074a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WeakReference<NavigationBarView> f34047a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NavController f34048b;

    public C5467a(WeakReference<NavigationBarView> weakReference, NavController navController) {
        this.f34047a = weakReference;
        this.f34048b = navController;
    }

    @Override // androidx.navigation.NavController.InterfaceC1074a
    /* JADX INFO: renamed from: a */
    public final void mo4010a(NavController navController, NavDestination navDestination) {
        C5207g.m11111f(navController, "controller");
        C5207g.m11111f(navDestination, "destination");
        NavigationBarView navigationBarView = this.f34047a.get();
        if (navigationBarView == null) {
            NavController navController2 = this.f34048b;
            navController2.getClass();
            navController2.f6767p.remove(this);
            return;
        }
        Menu menu = navigationBarView.getMenu();
        C5207g.m11110e(menu, "view.menu");
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = menu.getItem(i10);
            C5207g.m11107b(item, "getItem(index)");
            if (C5212l.m11155b0(navDestination, item.getItemId())) {
                item.setChecked(true);
            }
        }
    }
}
