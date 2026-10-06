package p000;

import android.view.MenuItem;

/* JADX INFO: renamed from: hd */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC0233hd implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MenuItemC0234he f27286a;

    /* JADX INFO: renamed from: b */
    private final MenuItem.OnMenuItemClickListener f27287b;

    public MenuItemOnMenuItemClickListenerC0233hd(MenuItemC0234he menuItemC0234he, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f27286a = menuItemC0234he;
        this.f27287b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f27287b.onMenuItemClick(this.f27286a.m9544a(menuItem));
    }
}
