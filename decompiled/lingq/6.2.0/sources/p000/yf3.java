package p000;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class yf3 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f69767a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f69768b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ag3 f69769c;

    public yf3(ag3 ag3Var, Object obj, ArrayList arrayList) {
        this.f69769c = ag3Var;
        this.f69767a = obj;
        this.f69768b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.f69769c.m383v(this.f69767a, this.f69768b, null);
    }
}
