package p000;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public abstract class bta {
    /* JADX INFO: renamed from: a */
    public static WindowInsets m4163a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m4164b(View view) {
        return view.getStateDescription();
    }

    /* JADX INFO: renamed from: c */
    public static k6b m4165c(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new k6b(windowInsetsController);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m4166d(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
