package p000;

import android.view.MenuItem;

/* JADX INFO: renamed from: hc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnActionExpandListenerC0232hc implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MenuItemC0234he f27216a;

    /* JADX INFO: renamed from: b */
    private final MenuItem.OnActionExpandListener f27217b;

    public MenuItemOnActionExpandListenerC0232hc(MenuItemC0234he menuItemC0234he, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f27216a = menuItemC0234he;
        this.f27217b = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f27217b.onMenuItemActionCollapse(this.f27216a.m9544a(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f27217b.onMenuItemActionExpand(this.f27216a.m9544a(menuItem));
    }
}
