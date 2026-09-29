package p000;

import android.os.SystemClock;
import com.google.android.material.progressindicator.AbstractC1068a;

/* JADX INFO: loaded from: classes.dex */
public final class v90 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65033a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1068a f65034b;

    public /* synthetic */ v90(AbstractC1068a abstractC1068a, int i) {
        this.f65033a = i;
        this.f65034b = abstractC1068a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f65033a;
        AbstractC1068a abstractC1068a = this.f65034b;
        switch (i) {
            case 0:
                if (abstractC1068a.f13074e > 0) {
                    abstractC1068a.f13075f = SystemClock.uptimeMillis();
                }
                abstractC1068a.setVisibility(0);
                break;
            default:
                ((yl2) abstractC1068a.getCurrentDrawable()).m25184d(false, false, true);
                if ((abstractC1068a.getProgressDrawable() == null || !abstractC1068a.getProgressDrawable().isVisible()) && (abstractC1068a.getIndeterminateDrawable() == null || !abstractC1068a.getIndeterminateDrawable().isVisible())) {
                    abstractC1068a.setVisibility(4);
                }
                abstractC1068a.f13075f = -1L;
                break;
        }
    }
}
