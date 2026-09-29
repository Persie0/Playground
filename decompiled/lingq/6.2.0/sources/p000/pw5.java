package p000;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes2.dex */
public final class pw5 implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnActionExpandListener f56904a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qw5 f56905b;

    public pw5(qw5 qw5Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f56905b = qw5Var;
        this.f56904a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f56904a.onMenuItemActionCollapse(this.f56905b.m15761f(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f56904a.onMenuItemActionExpand(this.f56905b.m15761f(menuItem));
    }
}
