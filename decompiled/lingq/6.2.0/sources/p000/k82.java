package p000;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.fragment.app.SpecialEffectsController$Operation$State;

/* JADX INFO: loaded from: classes2.dex */
public final class k82 extends ye9 {

    /* JADX INFO: renamed from: c */
    public final i82 f46850c;

    /* JADX INFO: renamed from: d */
    public AnimatorSet f46851d;

    public k82(i82 i82Var) {
        this.f46850c = i82Var;
    }

    @Override // p000.ye9
    /* JADX INFO: renamed from: b */
    public final void mo2067b(ViewGroup viewGroup) {
        viewGroup.getClass();
        AnimatorSet animatorSet = this.f46851d;
        ze9 ze9Var = (ze9) this.f46850c.f60774a;
        if (animatorSet == null) {
            ze9Var.m25573c(this);
            return;
        }
        if (ze9Var.f71470g) {
            m82.f50746a.m16676a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (AbstractC0638f.m2128L(2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(ze9Var);
            sb.append(" has been canceled");
            sb.append(ze9Var.f71470g ? " with seeking." : ".");
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // p000.ye9
    /* JADX INFO: renamed from: c */
    public final void mo2068c(ViewGroup viewGroup) {
        viewGroup.getClass();
        ze9 ze9Var = (ze9) this.f46850c.f60774a;
        AnimatorSet animatorSet = this.f46851d;
        if (animatorSet == null) {
            ze9Var.m25573c(this);
            return;
        }
        animatorSet.start();
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Animator from operation " + ze9Var + " has started.");
        }
    }

    @Override // p000.ye9
    /* JADX INFO: renamed from: d */
    public final void mo2069d(u60 u60Var, ViewGroup viewGroup) {
        viewGroup.getClass();
        ze9 ze9Var = (ze9) this.f46850c.f60774a;
        AnimatorSet animatorSet = this.f46851d;
        if (animatorSet == null) {
            ze9Var.m25573c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !ze9Var.f71466c.f5666H) {
            return;
        }
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + ze9Var);
        }
        long jM16019a = l82.f49290a.m16019a(animatorSet);
        long j = (long) (u60Var.f63472c * jM16019a);
        if (j == 0) {
            j = 1;
        }
        if (j == jM16019a) {
            j = jM16019a - 1;
        }
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + ze9Var);
        }
        m82.f50746a.m16677b(animatorSet, j);
    }

    @Override // p000.ye9
    /* JADX INFO: renamed from: e */
    public final void mo2070e(ViewGroup viewGroup) {
        k82 k82Var;
        viewGroup.getClass();
        i82 i82Var = this.f46850c;
        if (i82Var.m21329s()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        bl2 bl2VarM13717E = i82Var.m13717E(context);
        this.f46851d = bl2VarM13717E != null ? (AnimatorSet) bl2VarM13717E.f8656b : null;
        ze9 ze9Var = (ze9) i82Var.f60774a;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = ze9Var.f71466c;
        boolean z = ze9Var.f71464a == SpecialEffectsController$Operation$State.GONE;
        View view = abstractComponentCallbacksC0635c.f5692d0;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.f46851d;
        if (animatorSet != null) {
            k82Var = this;
            animatorSet.addListener(new j82(viewGroup, view, z, ze9Var, k82Var));
        } else {
            k82Var = this;
        }
        AnimatorSet animatorSet2 = k82Var.f46851d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
