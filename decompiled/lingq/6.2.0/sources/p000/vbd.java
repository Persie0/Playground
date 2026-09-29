package p000;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vbd {

    /* JADX INFO: renamed from: a */
    public static p04 f65175a;

    /* JADX INFO: renamed from: a */
    public static void m23219a(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
