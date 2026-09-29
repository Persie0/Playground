package p000;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: l5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3286l5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49058a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f49059b;

    public /* synthetic */ RunnableC3286l5(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f49058a = i;
        this.f49059b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f49058a;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f49059b;
        switch (i) {
            case 0:
                actionBarOverlayLayout.m659b();
                actionBarOverlayLayout.f1089R = actionBarOverlayLayout.f1098d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1090S);
                break;
            default:
                actionBarOverlayLayout.m659b();
                actionBarOverlayLayout.f1089R = actionBarOverlayLayout.f1098d.animate().translationY(-actionBarOverlayLayout.f1098d.getHeight()).setListener(actionBarOverlayLayout.f1090S);
                break;
        }
    }
}
