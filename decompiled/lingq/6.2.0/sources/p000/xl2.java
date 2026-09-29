package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xl2 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68324a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yl2 f68325b;

    public /* synthetic */ xl2(yl2 yl2Var, int i) {
        this.f68324a = i;
        this.f68325b = yl2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f68324a) {
            case 1:
                super.onAnimationEnd(animator);
                yl2 yl2Var = this.f68325b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = yl2Var.f69979g;
                if (arrayList != null && !yl2Var.f69980h) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC3689vl) it.next()).mo23406a(yl2Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f68324a) {
            case 0:
                super.onAnimationStart(animator);
                yl2 yl2Var = this.f68325b;
                ArrayList arrayList = yl2Var.f69979g;
                if (arrayList != null && !yl2Var.f69980h) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC3689vl) it.next()).mo23407b(yl2Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
