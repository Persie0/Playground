package p000;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;

/* JADX INFO: renamed from: wn */
/* JADX INFO: loaded from: classes2.dex */
public final class C3728wn {

    /* JADX INFO: renamed from: a */
    public static final C3728wn f67079a = new C3728wn();

    /* JADX INFO: renamed from: a */
    public final int m24065a(Window window) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i2 = rect.top;
        int i3 = rect.bottom;
        return i - (i2 + (i3 > i ? i3 - i : 0));
    }
}
