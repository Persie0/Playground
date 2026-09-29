package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class x62 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67813a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f67814b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f67815c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f67816d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ a72 f67817e;

    public /* synthetic */ x62(a72 a72Var, Object obj, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f67813a = i;
        this.f67817e = a72Var;
        this.f67814b = obj;
        this.f67815c = viewPropertyAnimator;
        this.f67816d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f67813a;
        Object obj = this.f67814b;
        a72 a72Var = this.f67817e;
        View view = this.f67816d;
        ViewPropertyAnimator viewPropertyAnimator = this.f67815c;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                y62 y62Var = (y62) obj;
                a72Var.m23068c(y62Var.f69356a);
                a72Var.f317r.remove(y62Var.f69356a);
                a72Var.m155i();
                break;
            case 1:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                y62 y62Var2 = (y62) obj;
                a72Var.m23068c(y62Var2.f69357b);
                a72Var.f317r.remove(y62Var2.f69357b);
                a72Var.m155i();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                o38 o38Var = (o38) obj;
                a72Var.m23068c(o38Var);
                a72Var.f316q.remove(o38Var);
                a72Var.m155i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f67813a) {
            case 0:
                this.f67817e.getClass();
                break;
            case 1:
                this.f67817e.getClass();
                break;
            default:
                this.f67817e.getClass();
                break;
        }
    }
}
