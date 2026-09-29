package p000;

import android.graphics.Insets;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* JADX INFO: renamed from: yn */
/* JADX INFO: loaded from: classes2.dex */
public final class C3802yn {

    /* JADX INFO: renamed from: a */
    public static final C3802yn f70089a = new C3802yn();

    /* JADX INFO: renamed from: a */
    public final int m25207a(Window window) {
        WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
        Insets insets = currentWindowMetrics.getWindowInsets().getInsets(WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }

    /* JADX INFO: renamed from: b */
    public final void m25208b(WindowManager.LayoutParams layoutParams, int i) {
        layoutParams.setFitInsetsSides(i);
    }

    /* JADX INFO: renamed from: c */
    public final void m25209c(WindowManager.LayoutParams layoutParams, int i) {
        layoutParams.setFitInsetsTypes(i);
    }
}
