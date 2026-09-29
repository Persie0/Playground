package p000;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rs3 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59753a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f59754b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ im1 f59755c;

    public /* synthetic */ rs3(im1 im1Var, View view, int i) {
        this.f59753a = i;
        this.f59755c = im1Var;
        this.f59754b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        int i = this.f59753a;
        View view = this.f59754b;
        im1 im1Var = this.f59755c;
        switch (i) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) im1Var;
                int i2 = HideBottomViewOnScrollBehavior.f12644n;
                if (z && hideBottomViewOnScrollBehavior.f12656j == 1) {
                    hideBottomViewOnScrollBehavior.m6012w(view);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) im1Var;
                if (z && hideViewOnScrollBehavior.f12672j == 1) {
                    hideViewOnScrollBehavior.m6015x(view);
                    break;
                }
                break;
        }
    }
}
