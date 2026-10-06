package p000;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import androidx.wear.ambient.AmbientMode;

/* JADX INFO: renamed from: ha */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ActionProviderVisibilityListenerC0230ha extends C0228gz implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: c */
    private AmbientMode.AmbientController f27081c;

    public ActionProviderVisibilityListenerC0230ha(ActionProvider actionProvider) {
        super(actionProvider);
    }

    @Override // p000.aej
    /* JADX INFO: renamed from: e */
    public final View mo338e(MenuItem menuItem) {
        return this.f26920a.onCreateActionView(menuItem);
    }

    @Override // p000.aej
    /* JADX INFO: renamed from: f */
    public final boolean mo339f() {
        return this.f26920a.isVisible();
    }

    @Override // p000.aej
    /* JADX INFO: renamed from: g */
    public final boolean mo340g() {
        return this.f26920a.overridesItemVisibility();
    }

    @Override // p000.aej
    /* JADX INFO: renamed from: h */
    public final void mo341h(AmbientMode.AmbientController ambientController) {
        this.f27081c = ambientController;
        this.f26920a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        AmbientMode.AmbientController ambientController = this.f27081c;
        if (ambientController != null) {
            ((C0227gy) ambientController.f1697a).f26796j.m9819C();
        }
    }
}
