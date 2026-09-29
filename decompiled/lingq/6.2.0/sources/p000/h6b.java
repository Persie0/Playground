package p000;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public class h6b extends bca {

    /* JADX INFO: renamed from: a */
    public final WindowInsetsController f41852a;

    /* JADX INFO: renamed from: b */
    public final cc4 f41853b;

    /* JADX INFO: renamed from: c */
    public final Window f41854c;

    public h6b(Window window, cc4 cc4Var) {
        this(window.getInsetsController(), cc4Var);
        this.f41854c = window;
    }

    @Override // p000.bca
    /* JADX INFO: renamed from: d */
    public final void mo3615d() {
        ((or3) this.f41853b.f9881a).mo17933F();
        this.f41852a.hide(0);
    }

    @Override // p000.bca
    /* JADX INFO: renamed from: g */
    public boolean mo3616g() {
        Window window = this.f41854c;
        if (window != null) {
            return (window.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }
        this.f41852a.setSystemBarsAppearance(0, 0);
        return (this.f41852a.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // p000.bca
    /* JADX INFO: renamed from: h */
    public void mo3617h(boolean z) {
        m13101k(16, 16, z);
    }

    @Override // p000.bca
    /* JADX INFO: renamed from: i */
    public void mo3618i(boolean z) {
        m13101k(8192, 8, z);
    }

    /* JADX INFO: renamed from: k */
    public final void m13101k(int i, int i2, boolean z) {
        Window window = this.f41854c;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.f41852a;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }

    public h6b(WindowInsetsController windowInsetsController, cc4 cc4Var) {
        this.f41852a = windowInsetsController;
        this.f41853b = cc4Var;
    }
}
