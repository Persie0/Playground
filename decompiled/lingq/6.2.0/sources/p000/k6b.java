package p000;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class k6b {

    /* JADX INFO: renamed from: a */
    public final bca f46789a;

    public k6b(Window window, View view) {
        cc4 cc4Var = new cc4(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f46789a = new j6b(window, cc4Var);
        } else if (i >= 30) {
            this.f46789a = new h6b(window, cc4Var);
        } else {
            this.f46789a = new g6b(window, cc4Var);
        }
    }

    public k6b(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f46789a = new j6b(windowInsetsController, new cc4(windowInsetsController));
        } else {
            this.f46789a = new h6b(windowInsetsController, new cc4(windowInsetsController));
        }
    }
}
