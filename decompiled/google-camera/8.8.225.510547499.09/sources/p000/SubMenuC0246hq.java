package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: hq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC0246hq extends C0225gw implements SubMenu {

    /* JADX INFO: renamed from: j */
    public final C0225gw f29024j;

    /* JADX INFO: renamed from: k */
    public final C0227gy f29025k;

    public SubMenuC0246hq(Context context, C0225gw c0225gw, C0227gy c0227gy) {
        super(context);
        this.f29024j = c0225gw;
        this.f29025k = c0227gy;
    }

    @Override // p000.C0225gw
    /* JADX INFO: renamed from: a */
    public final C0225gw mo9821a() {
        return this.f29024j.mo9821a();
    }

    @Override // p000.C0225gw
    /* JADX INFO: renamed from: d */
    public final String mo9824d() {
        int i = this.f29025k.f26787a;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f29025k;
    }

    @Override // p000.C0225gw
    /* JADX INFO: renamed from: p */
    public final void mo9836p(InterfaceC0223gu interfaceC0223gu) {
        this.f29024j.mo9836p(interfaceC0223gu);
    }

    @Override // p000.C0225gw, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f29024j.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.m9837q(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.m9837q(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.m9837q(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f29025k.setIcon(i);
        return this;
    }

    @Override // p000.C0225gw, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f29024j.setQwertyMode(z);
    }

    @Override // p000.C0225gw
    /* JADX INFO: renamed from: t */
    public final boolean mo9840t(C0227gy c0227gy) {
        return this.f29024j.mo9840t(c0227gy);
    }

    @Override // p000.C0225gw
    /* JADX INFO: renamed from: u */
    public final boolean mo9841u(C0225gw c0225gw, MenuItem menuItem) {
        return super.mo9841u(c0225gw, menuItem) || this.f29024j.mo9841u(c0225gw, menuItem);
    }

    @Override // p000.C0225gw
    /* JADX INFO: renamed from: v */
    public final boolean mo9842v(C0227gy c0227gy) {
        return this.f29024j.mo9842v(c0227gy);
    }

    @Override // p000.C0225gw
    /* JADX INFO: renamed from: w */
    public final boolean mo9843w() {
        return this.f29024j.mo9843w();
    }

    @Override // p000.C0225gw
    /* JADX INFO: renamed from: x */
    public final boolean mo9844x() {
        return this.f29024j.mo9844x();
    }

    @Override // p000.C0225gw
    /* JADX INFO: renamed from: y */
    public final boolean mo9845y() {
        return this.f29024j.mo9845y();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.m9837q(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.m9837q(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f29025k.setIcon(drawable);
        return this;
    }
}
