package p000;

import android.os.Build;
import android.window.BackEvent;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hrb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f42849a = new C0282a(-92238559, false, new rd1(10));

    /* JADX INFO: renamed from: a */
    public static final zi6 m13441a(BackEvent backEvent) {
        return new zi6(backEvent.getProgress(), backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }
}
