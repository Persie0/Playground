package p000;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;

/* JADX INFO: renamed from: fh */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTranslationCallbackC3001fh implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a */
    public static final ViewTranslationCallbackC3001fh f39097a = new ViewTranslationCallbackC3001fh();

    public final boolean onClearTranslation(View view) {
        view.getClass();
        ((ViewTreeObserverOnGlobalLayoutListenerC0391c) view).getContentCaptureManager$ui().m1331j();
        return true;
    }

    public final boolean onHideTranslation(View view) {
        view.getClass();
        ((ViewTreeObserverOnGlobalLayoutListenerC0391c) view).getContentCaptureManager$ui().m1332k();
        return true;
    }

    public final boolean onShowTranslation(View view) {
        view.getClass();
        ((ViewTreeObserverOnGlobalLayoutListenerC0391c) view).getContentCaptureManager$ui().m1333l();
        return true;
    }
}
