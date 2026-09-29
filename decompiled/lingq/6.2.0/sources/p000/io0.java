package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class io0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44341a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f44342b;

    public /* synthetic */ io0(Object obj, int i) {
        this.f44341a = i;
        this.f44342b = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m14044a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m14045b(View view) {
    }

    /* JADX INFO: renamed from: c */
    private final void m14046c(View view) {
    }

    /* JADX INFO: renamed from: d */
    private final void m14047d(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f44341a) {
            case 1:
                is2 is2Var = (is2) this.f44342b;
                AccessibilityManager accessibilityManager = is2Var.f44489O;
                if (is2Var.f44490P != null && accessibilityManager != null && is2Var.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(is2Var.f44490P);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        int i = this.f44341a;
        Object obj = this.f44342b;
        switch (i) {
            case 0:
                lo0 lo0Var = (lo0) obj;
                ViewTreeObserver viewTreeObserver = lo0Var.f49893T;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        lo0Var.f49893T = view.getViewTreeObserver();
                    }
                    lo0Var.f49893T.removeGlobalOnLayoutListener(lo0Var.f49904j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                is2 is2Var = (is2) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = is2Var.f44490P;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = is2Var.f44489O) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 2:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                rs3 rs3Var = hideBottomViewOnScrollBehavior.f12654h;
                if (rs3Var != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.f12653g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(rs3Var);
                    hideBottomViewOnScrollBehavior.f12654h = null;
                    break;
                }
                break;
            case 3:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                rs3 rs3Var2 = hideViewOnScrollBehavior.f12665c;
                if (rs3Var2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.f12664b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(rs3Var2);
                    hideViewOnScrollBehavior.f12665c = null;
                    break;
                }
                break;
            default:
                sg9 sg9Var = (sg9) obj;
                ViewTreeObserver viewTreeObserver2 = sg9Var.f60832K;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sg9Var.f60832K = view.getViewTreeObserver();
                    }
                    sg9Var.f60832K.removeGlobalOnLayoutListener(sg9Var.f60846j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
