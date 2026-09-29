package p000;

import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: renamed from: s5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3561s5 extends tc3 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ActionMenuItemView f60310j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3561s5(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f60310j = actionMenuItemView;
    }

    @Override // p000.tc3
    /* JADX INFO: renamed from: b */
    public final k69 mo19446b() {
        C3636u5 c3636u5;
        AbstractC3599t5 abstractC3599t5 = this.f60310j.f1027l;
        if (abstractC3599t5 == null || (c3636u5 = ((C3673v5) abstractC3599t5).f64873a.f1209P) == null) {
            return null;
        }
        return c3636u5.m24177b();
    }

    @Override // p000.tc3
    /* JADX INFO: renamed from: c */
    public final boolean mo19447c() {
        k69 k69VarMo19446b;
        ActionMenuItemView actionMenuItemView = this.f60310j;
        gw5 gw5Var = actionMenuItemView.f1025j;
        return gw5Var != null && gw5Var.mo647a(actionMenuItemView.f1022g) && (k69VarMo19446b = mo19446b()) != null && k69VarMo19446b.mo10357a();
    }
}
