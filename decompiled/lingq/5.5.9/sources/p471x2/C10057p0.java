package p471x2;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: x2.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10057p0 {
    /* JADX INFO: renamed from: a */
    public static void m18849a(Window window, boolean z10) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
