package p000;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.SpecialEffectsController$Operation$State;

/* JADX INFO: loaded from: classes2.dex */
public final class h82 extends ye9 {

    /* JADX INFO: renamed from: c */
    public final i82 f41936c;

    public h82(i82 i82Var) {
        this.f41936c = i82Var;
    }

    @Override // p000.ye9
    /* JADX INFO: renamed from: b */
    public final void mo2067b(ViewGroup viewGroup) {
        viewGroup.getClass();
        ze9 ze9Var = (ze9) this.f41936c.f60774a;
        View view = ze9Var.f71466c.f5692d0;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ze9Var.m25573c(this);
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Animation from operation " + ze9Var + " has been cancelled.");
        }
    }

    @Override // p000.ye9
    /* JADX INFO: renamed from: c */
    public final void mo2068c(ViewGroup viewGroup) {
        viewGroup.getClass();
        i82 i82Var = this.f41936c;
        ze9 ze9Var = (ze9) i82Var.f60774a;
        if (i82Var.m21329s()) {
            ze9Var.m25573c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = ze9Var.f71466c.f5692d0;
        context.getClass();
        bl2 bl2VarM13717E = i82Var.m13717E(context);
        if (bl2VarM13717E == null) {
            C3386nv.m17633t("Required value was null.");
            return;
        }
        Animation animation = (Animation) bl2VarM13717E.f8655a;
        if (animation == null) {
            C3386nv.m17633t("Required value was null.");
            return;
        }
        if (ze9Var.f71464a != SpecialEffectsController$Operation$State.REMOVED) {
            view.startAnimation(animation);
            ze9Var.m25573c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        kd3 kd3Var = new kd3(animation, viewGroup, view);
        kd3Var.setAnimationListener(new g82(ze9Var, viewGroup, view, this));
        view.startAnimation(kd3Var);
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Animation from operation " + ze9Var + " has started.");
        }
    }
}
