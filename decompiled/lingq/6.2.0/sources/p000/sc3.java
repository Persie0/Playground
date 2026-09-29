package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public final class sc3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60667a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tc3 f60668b;

    public /* synthetic */ sc3(tc3 tc3Var, int i) {
        this.f60667a = i;
        this.f60668b = tc3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f60667a;
        tc3 tc3Var = this.f60668b;
        switch (i) {
            case 0:
                ViewParent parent = tc3Var.f62140d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                tc3Var.m21947a();
                View view = tc3Var.f62140d;
                if (view.isEnabled() && !view.isLongClickable() && tc3Var.mo19447c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    tc3Var.f62143g = true;
                    break;
                }
                break;
        }
    }
}
