package p521z1;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import dm.C5207g;

/* JADX INFO: renamed from: z1.g */
/* JADX INFO: loaded from: classes.dex */
public class C10433g implements InterfaceC10431e {
    @Override // p521z1.InterfaceC10431e
    /* JADX INFO: renamed from: a */
    public final void mo19405a(WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        C5207g.m11111f(windowManager, "windowManager");
        C5207g.m11111f(view, "popupView");
        C5207g.m11111f(layoutParams, "params");
        windowManager.updateViewLayout(view, layoutParams);
    }

    @Override // p521z1.InterfaceC10431e
    /* JADX INFO: renamed from: b */
    public void mo19406b(View view, int i10, int i11) {
        C5207g.m11111f(view, "composeView");
    }

    @Override // p521z1.InterfaceC10431e
    /* JADX INFO: renamed from: c */
    public final void mo19407c(View view, Rect rect) {
        C5207g.m11111f(view, "composeView");
        C5207g.m11111f(rect, "outRect");
        view.getWindowVisibleDisplayFrame(rect);
    }
}
