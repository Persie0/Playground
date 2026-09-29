package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d0a {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ScrollCaptureTarget m9964b(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(viewTreeObserverOnGlobalLayoutListenerC0391c, rect, point, scrollCaptureCallback);
    }
}
