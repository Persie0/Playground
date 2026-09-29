package p000;

import android.view.ActionProvider;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class nw5 implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a */
    public web f53326a;

    /* JADX INFO: renamed from: b */
    public final ActionProvider f53327b;

    public nw5(qw5 qw5Var, ActionProvider actionProvider) {
        this.f53327b = actionProvider;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17656a() {
        return this.f53327b.hasSubMenu();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17657b() {
        return this.f53327b.isVisible();
    }

    /* JADX INFO: renamed from: c */
    public final View m17658c(mw5 mw5Var) {
        return this.f53327b.onCreateActionView(mw5Var);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m17659d() {
        return this.f53327b.onPerformDefaultAction();
    }

    /* JADX INFO: renamed from: e */
    public final void m17660e(om9 om9Var) {
        this.f53327b.onPrepareSubMenu(om9Var);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m17661f() {
        return this.f53327b.overridesItemVisibility();
    }

    /* JADX INFO: renamed from: g */
    public final void m17662g(web webVar) {
        this.f53326a = webVar;
        this.f53327b.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        web webVar = this.f53326a;
        if (webVar != null) {
            hw5 hw5Var = ((mw5) webVar.f66742a).f51955n;
            hw5Var.f43044h = true;
            hw5Var.m13533p(true);
        }
    }
}
