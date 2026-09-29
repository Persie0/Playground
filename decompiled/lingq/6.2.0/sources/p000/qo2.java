package p000;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class qo2 extends po2 {
    @Override // p000.oo2
    /* JADX INFO: renamed from: b */
    public void mo18183b(kp9 kp9Var, kp9 kp9Var2, Window window, View view, boolean z, boolean z2) {
        bca h6bVar;
        kp9Var.getClass();
        kp9Var2.getClass();
        window.getClass();
        view.getClass();
        kaa.m15044f(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        cc4 cc4Var = new cc4(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            h6bVar = new j6b(window, cc4Var);
        } else {
            h6bVar = i >= 30 ? new h6b(window, cc4Var) : new g6b(window, cc4Var);
        }
        h6bVar.mo3618i(!z);
        h6bVar.mo3617h(true ^ z2);
    }
}
