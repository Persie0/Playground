package androidx.compose.p017ui.platform;

import android.view.PointerIcon;
import android.view.View;
import dm.C5207g;
import p060d1.C5014a;
import p060d1.C5015b;
import p060d1.InterfaceC5025l;

/* JADX INFO: renamed from: androidx.compose.ui.platform.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0672w {

    /* JADX INFO: renamed from: a */
    public static final C0672w f4360a = new C0672w();

    /* JADX INFO: renamed from: a */
    public final void m2496a(View view, InterfaceC5025l interfaceC5025l) {
        PointerIcon systemIcon;
        C5207g.m11111f(view, "view");
        if (interfaceC5025l instanceof C5014a) {
            ((C5014a) interfaceC5025l).getClass();
            systemIcon = null;
        } else if (interfaceC5025l instanceof C5015b) {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), ((C5015b) interfaceC5025l).f32807a);
            C5207g.m11110e(systemIcon, "getSystemIcon(view.context, icon.type)");
        } else {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
            C5207g.m11110e(systemIcon, "getSystemIcon(\n         …DEFAULT\n                )");
        }
        if (C5207g.m11106a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
