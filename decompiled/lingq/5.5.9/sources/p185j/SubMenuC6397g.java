package p185j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p353r2.InterfaceSubMenuC8726c;

/* JADX INFO: renamed from: j.g */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC6397g extends MenuC6395e implements SubMenu {

    /* JADX INFO: renamed from: e */
    public final InterfaceSubMenuC8726c f36851e;

    public SubMenuC6397g(Context context, InterfaceSubMenuC8726c interfaceSubMenuC8726c) {
        super(context, interfaceSubMenuC8726c);
        this.f36851e = interfaceSubMenuC8726c;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f36851e.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return m13015d(this.f36851e.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        this.f36851e.setHeaderIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f36851e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        this.f36851e.setHeaderTitle(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f36851e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f36851e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.f36851e.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f36851e.setIcon(drawable);
        return this;
    }
}
