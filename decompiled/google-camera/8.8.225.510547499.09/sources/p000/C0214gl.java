package p000;

import android.support.v7.view.menu.ActionMenuItemView;
import androidx.wear.ambient.AmbientMode;

/* JADX INFO: renamed from: gl */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0214gl extends AbstractViewOnTouchListenerC0777kq {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ActionMenuItemView f25447a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214gl(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f25447a = actionMenuItemView;
    }

    @Override // p000.AbstractViewOnTouchListenerC0777kq
    /* JADX INFO: renamed from: a */
    public final InterfaceC0243hn mo9397a() {
        C0254hy c0254hy;
        AmbientMode.AmbientController ambientController = this.f25447a.f911c;
        if (ambientController == null || (c0254hy = ((C0259ic) ambientController.f1697a).f30285j) == null) {
            return null;
        }
        return c0254hy.m10274a();
    }

    @Override // p000.AbstractViewOnTouchListenerC0777kq
    /* JADX INFO: renamed from: b */
    public final boolean mo9398b() {
        InterfaceC0243hn interfaceC0243hnMo9397a;
        ActionMenuItemView actionMenuItemView = this.f25447a;
        InterfaceC0224gv interfaceC0224gv = actionMenuItemView.f910b;
        return interfaceC0224gv != null && interfaceC0224gv.mo1037b(actionMenuItemView.f909a) && (interfaceC0243hnMo9397a = mo9397a()) != null && interfaceC0243hnMo9397a.mo9636u();
    }
}
