package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.AbstractC0638f;

/* JADX INFO: loaded from: classes2.dex */
public final class g82 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ze9 f40375a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f40376b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f40377c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ h82 f40378d;

    public g82(ze9 ze9Var, ViewGroup viewGroup, View view, h82 h82Var) {
        this.f40375a = ze9Var;
        this.f40376b = viewGroup;
        this.f40377c = view;
        this.f40378d = h82Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.f40376b;
        viewGroup.post(new RunnableC3725wk(viewGroup, this.f40377c, this.f40378d, 8));
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f40375a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f40375a + " has reached onAnimationStart.");
        }
    }
}
