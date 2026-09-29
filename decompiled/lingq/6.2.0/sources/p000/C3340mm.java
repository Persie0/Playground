package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.slider.AbstractC1071b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: mm */
/* JADX INFO: loaded from: classes2.dex */
public final class C3340mm extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51506a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f51507b;

    public /* synthetic */ C3340mm(Object obj, int i) {
        this.f51506a = i;
        this.f51507b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.f51506a;
        Object obj = this.f51507b;
        switch (i) {
            case 4:
                ((s90) obj).mo13547d();
                break;
            case 5:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                focusRingDrawable.f12994k = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.f51506a;
        Object obj = this.f51507b;
        switch (i) {
            case 0:
                C3465pm c3465pm = (C3465pm) obj;
                ArrayList arrayList = new ArrayList(c3465pm.f56437e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC3689vl) arrayList.get(i2)).mo23406a(c3465pm);
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                AbstractC1071b abstractC1071b = (AbstractC1071b) obj;
                ViewGroup viewGroupM12723b = gka.m12723b(abstractC1071b);
                ViewOverlay overlay = viewGroupM12723b == null ? null : viewGroupM12723b.getOverlay();
                if (overlay != null) {
                    Iterator it = abstractC1071b.f13198l.iterator();
                    while (it.hasNext()) {
                        overlay.remove((d6a) it.next());
                    }
                    break;
                }
                break;
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                bottomSheetBehavior.m6033N(5);
                WeakReference weakReference = bottomSheetBehavior.f12707X;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.f12707X.get()).requestLayout();
                    break;
                }
                break;
            case 3:
                ym2 ym2Var = (ym2) obj;
                ym2Var.m14638p();
                ym2Var.f70063r.start();
                break;
            case 4:
                ((s90) obj).mo12953e();
                break;
            case 5:
            case 6:
            default:
                super.onAnimationEnd(animator);
                break;
            case 7:
                nr5 nr5Var = (nr5) obj;
                nr5Var.f44455b.setTranslationY(0.0f);
                nr5Var.m17605b(0.0f);
                break;
            case 8:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.m6167x(5);
                WeakReference weakReference2 = sideSheetBehavior.f13100p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.f13100p.get()).requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f51506a) {
            case 6:
                super.onAnimationRepeat(animator);
                yc5 yc5Var = (yc5) this.f51507b;
                yc5Var.f69631f = (yc5Var.f69631f + 1) % yc5Var.f69630e.f67948e.length;
                yc5Var.f69632g = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.f51506a;
        Object obj = this.f51507b;
        switch (i) {
            case 0:
                C3465pm c3465pm = (C3465pm) obj;
                ArrayList arrayList = new ArrayList(c3465pm.f56437e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC3689vl) arrayList.get(i2)).mo23407b(c3465pm);
                }
                break;
            case 4:
                ((s90) obj).mo12954f(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
