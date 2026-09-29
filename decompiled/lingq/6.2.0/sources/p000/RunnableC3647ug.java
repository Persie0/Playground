package p000;

import android.os.Trace;
import android.view.MotionEvent;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;

/* JADX INFO: renamed from: ug */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3647ug implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63858a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0391c f63859b;

    public /* synthetic */ RunnableC3647ug(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c, int i) {
        this.f63858a = i;
        this.f63859b = viewTreeObserverOnGlobalLayoutListenerC0391c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f63858a;
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f63859b;
        switch (i) {
            case 0:
                C0825bv c0825bv = viewTreeObserverOnGlobalLayoutListenerC0391c.f4698h;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!c0825bv.isEmpty()) {
                    try {
                        ((ui3) c0825bv.removeLast()).mo0a();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.endSection();
                return;
            case 1:
                viewTreeObserverOnGlobalLayoutListenerC0391c.f4667Q0 = false;
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    viewTreeObserverOnGlobalLayoutListenerC0391c.m1739O(motionEvent);
                    return;
                } else {
                    C3386nv.m17633t("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                ViewTreeObserverOnGlobalLayoutListenerC0391c.m1723m(viewTreeObserverOnGlobalLayoutListenerC0391c.getRoot());
                return;
            default:
                ViewTreeObserverOnGlobalLayoutListenerC0391c.m1723m(viewTreeObserverOnGlobalLayoutListenerC0391c.getRoot());
                return;
        }
    }
}
