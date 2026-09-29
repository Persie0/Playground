package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public final class oh7 extends gna {
    @Override // p000.gna
    /* JADX INFO: renamed from: k */
    public final void mo12767k(View view, Rect rect) {
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        rect.set(((WindowManager) systemService).getCurrentWindowMetrics().getBounds());
    }
}
