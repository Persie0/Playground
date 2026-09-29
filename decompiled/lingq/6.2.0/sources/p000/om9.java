package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class om9 extends hw5 implements SubMenu {

    /* JADX INFO: renamed from: A */
    public final mw5 f54591A;

    /* JADX INFO: renamed from: z */
    public final hw5 f54592z;

    public om9(Context context, hw5 hw5Var, mw5 mw5Var) {
        super(context);
        this.f54592z = hw5Var;
        this.f54591A = mw5Var;
    }

    @Override // p000.hw5
    /* JADX INFO: renamed from: d */
    public final boolean mo13521d(mw5 mw5Var) {
        return this.f54592z.mo13521d(mw5Var);
    }

    @Override // p000.hw5
    /* JADX INFO: renamed from: e */
    public final boolean mo13522e(hw5 hw5Var, MenuItem menuItem) {
        return super.mo13522e(hw5Var, menuItem) || this.f54592z.mo13522e(hw5Var, menuItem);
    }

    @Override // p000.hw5
    /* JADX INFO: renamed from: f */
    public final boolean mo13523f(mw5 mw5Var) {
        return this.f54592z.mo13523f(mw5Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f54591A;
    }

    @Override // p000.hw5
    /* JADX INFO: renamed from: j */
    public final String mo13527j() {
        mw5 mw5Var = this.f54591A;
        int i = mw5Var != null ? mw5Var.f51942a : 0;
        if (i == 0) {
            return null;
        }
        return ux5.m22988k(i, "android:menu:actionviewstates:");
    }

    @Override // p000.hw5
    /* JADX INFO: renamed from: k */
    public final hw5 mo13528k() {
        return this.f54592z.mo13528k();
    }

    @Override // p000.hw5
    /* JADX INFO: renamed from: m */
    public final boolean mo13530m() {
        return this.f54592z.mo13530m();
    }

    @Override // p000.hw5
    /* JADX INFO: renamed from: n */
    public final boolean mo13531n() {
        return this.f54592z.mo13531n();
    }

    @Override // p000.hw5
    /* JADX INFO: renamed from: o */
    public final boolean mo13532o() {
        return this.f54592z.mo13532o();
    }

    @Override // p000.hw5, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f54592z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m13538u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m13538u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m13538u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f54591A.setIcon(drawable);
        return this;
    }

    @Override // p000.hw5, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f54592z.setQwertyMode(z);
    }

    /* JADX INFO: renamed from: x */
    public final hw5 m18112x() {
        return this.f54592z;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f54591A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m13538u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m13538u(i, null, 0, null, null);
        return this;
    }
}
