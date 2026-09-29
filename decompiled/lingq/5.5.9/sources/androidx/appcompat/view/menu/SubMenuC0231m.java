package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.C0166e;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.m */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC0231m extends C0224f implements SubMenu {

    /* JADX INFO: renamed from: A */
    public final C0226h f785A;

    /* JADX INFO: renamed from: z */
    public final C0224f f786z;

    public SubMenuC0231m(Context context, C0224f c0224f, C0226h c0226h) {
        super(context);
        this.f786z = c0224f;
        this.f785A = c0226h;
    }

    @Override // androidx.appcompat.view.menu.C0224f
    /* JADX INFO: renamed from: d */
    public final boolean mo920d(C0226h c0226h) {
        return this.f786z.mo920d(c0226h);
    }

    @Override // androidx.appcompat.view.menu.C0224f
    /* JADX INFO: renamed from: e */
    public final boolean mo921e(C0224f c0224f, MenuItem menuItem) {
        return super.mo921e(c0224f, menuItem) || this.f786z.mo921e(c0224f, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0224f
    /* JADX INFO: renamed from: f */
    public final boolean mo922f(C0226h c0226h) {
        return this.f786z.mo922f(c0226h);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f785A;
    }

    @Override // androidx.appcompat.view.menu.C0224f
    /* JADX INFO: renamed from: j */
    public final String mo926j() {
        C0226h c0226h = this.f785A;
        int i10 = c0226h != null ? c0226h.f723a : 0;
        if (i10 == 0) {
            return null;
        }
        return C0166e.m761g("android:menu:actionviewstates:", i10);
    }

    @Override // androidx.appcompat.view.menu.C0224f
    /* JADX INFO: renamed from: k */
    public final C0224f mo927k() {
        return this.f786z.mo927k();
    }

    @Override // androidx.appcompat.view.menu.C0224f
    /* JADX INFO: renamed from: m */
    public final boolean mo929m() {
        return this.f786z.mo929m();
    }

    @Override // androidx.appcompat.view.menu.C0224f
    /* JADX INFO: renamed from: n */
    public final boolean mo930n() {
        return this.f786z.mo930n();
    }

    @Override // androidx.appcompat.view.menu.C0224f
    /* JADX INFO: renamed from: o */
    public final boolean mo931o() {
        return this.f786z.mo931o();
    }

    @Override // androidx.appcompat.view.menu.C0224f, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f786z.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        m937u(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m937u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        m937u(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m937u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m937u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.f785A.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f785A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0224f, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f786z.setQwertyMode(z10);
    }
}
