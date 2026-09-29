package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.SpecialEffectsController$Operation$State;

/* JADX INFO: loaded from: classes2.dex */
public final class j82 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f45177a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f45178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f45179c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ze9 f45180d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ k82 f45181e;

    public j82(ViewGroup viewGroup, View view, boolean z, ze9 ze9Var, k82 k82Var) {
        this.f45177a = viewGroup;
        this.f45178b = view;
        this.f45179c = z;
        this.f45180d = ze9Var;
        this.f45181e = k82Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.f45177a;
        View view = this.f45178b;
        viewGroup.endViewTransition(view);
        boolean z = this.f45179c;
        ze9 ze9Var = this.f45180d;
        if (z || ze9Var.f71464a == SpecialEffectsController$Operation$State.GONE) {
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State = ze9Var.f71464a;
            view.getClass();
            specialEffectsController$Operation$State.applyState(view, viewGroup);
        }
        k82 k82Var = this.f45181e;
        ((ze9) k82Var.f46850c.f60774a).m25573c(k82Var);
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Animator from operation " + ze9Var + " has ended.");
        }
    }
}
