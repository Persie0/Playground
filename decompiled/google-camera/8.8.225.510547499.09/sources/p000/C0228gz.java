package p000;

import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: gz */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class C0228gz extends aej {

    /* JADX INFO: renamed from: a */
    final ActionProvider f26920a;

    public C0228gz(ActionProvider actionProvider) {
        this.f26920a = actionProvider;
    }

    @Override // p000.aej
    /* JADX INFO: renamed from: a */
    public final View mo334a() {
        return this.f26920a.onCreateActionView();
    }

    @Override // p000.aej
    /* JADX INFO: renamed from: b */
    public final void mo335b(SubMenu subMenu) {
        this.f26920a.onPrepareSubMenu(subMenu);
    }

    @Override // p000.aej
    /* JADX INFO: renamed from: c */
    public final boolean mo336c() {
        return this.f26920a.hasSubMenu();
    }

    @Override // p000.aej
    /* JADX INFO: renamed from: d */
    public final boolean mo337d() {
        return this.f26920a.onPerformDefaultAction();
    }
}
