package va;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;

/* JADX INFO: renamed from: va.t */
/* JADX INFO: loaded from: classes.dex */
public final class C9706t extends WebView {
    public C9706t(Context context) {
        super(context, null);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return false;
    }
}
