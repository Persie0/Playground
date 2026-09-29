package p521z1;

import androidx.compose.p017ui.window.PopupLayout;
import androidx.view.ViewTreeLifecycleOwner;
import p081e0.InterfaceC5327o;

/* JADX INFO: renamed from: z1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10427a implements InterfaceC5327o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PopupLayout f52270a;

    public C10427a(PopupLayout popupLayout) {
        this.f52270a = popupLayout;
    }

    @Override // p081e0.InterfaceC5327o
    /* JADX INFO: renamed from: a */
    public final void mo2504a() {
        PopupLayout popupLayout = this.f52270a;
        popupLayout.m2242c();
        popupLayout.getClass();
        ViewTreeLifecycleOwner.m3912b(popupLayout, null);
        popupLayout.f4732I.removeViewImmediate(popupLayout);
    }
}
