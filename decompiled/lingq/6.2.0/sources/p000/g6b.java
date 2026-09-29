package p000;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public final class g6b extends bca {

    /* JADX INFO: renamed from: a */
    public final Window f40284a;

    /* JADX INFO: renamed from: b */
    public final cc4 f40285b;

    public g6b(Window window, cc4 cc4Var) {
        this.f40284a = window;
        this.f40285b = cc4Var;
    }

    @Override // p000.bca
    /* JADX INFO: renamed from: d */
    public final void mo3615d() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((8 & i) != 0) {
                if (i == 1) {
                    m12386k(4);
                } else if (i == 2) {
                    m12386k(2);
                } else if (i == 8) {
                    ((or3) this.f40285b.f9881a).mo17933F();
                }
            }
        }
    }

    @Override // p000.bca
    /* JADX INFO: renamed from: g */
    public final boolean mo3616g() {
        return (this.f40284a.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // p000.bca
    /* JADX INFO: renamed from: h */
    public final void mo3617h(boolean z) {
        if (!z) {
            m12387l(16);
            return;
        }
        Window window = this.f40284a;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        m12386k(16);
    }

    @Override // p000.bca
    /* JADX INFO: renamed from: i */
    public final void mo3618i(boolean z) {
        if (!z) {
            m12387l(8192);
            return;
        }
        Window window = this.f40284a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        m12386k(8192);
    }

    /* JADX INFO: renamed from: k */
    public final void m12386k(int i) {
        View decorView = this.f40284a.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: l */
    public final void m12387l(int i) {
        View decorView = this.f40284a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
