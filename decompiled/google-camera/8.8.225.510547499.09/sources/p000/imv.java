package p000;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import p021j$.util.DesugarArrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imv {

    /* JADX INFO: renamed from: a */
    public final float f31555a;

    public imv(float f, byte[] bArr) {
        this.f31555a = f;
    }

    public imv(Window window) {
        WindowManager windowManager = (WindowManager) window.getContext().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        this.f31555a = displayMetrics.xdpi * displayMetrics.ydpi;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11497a(gsu[] gsuVarArr, Rect rect) {
        if (gsuVarArr == null || rect == null) {
            return false;
        }
        int i = 0;
        for (Rect rect2 : (Rect[]) DesugarArrays.stream(gsuVarArr).map(cqk.f8922i).toArray(dgh.f10884a)) {
            if ((rect2.width() / rect.width()) * (rect2.height() / rect.height()) > this.f31555a) {
                i++;
            }
        }
        return i > 0;
    }

    public imv(float f) {
        lku.m15669w(f > 0.0f);
        this.f31555a = f;
    }
}
