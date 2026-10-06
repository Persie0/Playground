package p000;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: da */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0122da implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ View f10201a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ArrayList f10202b;

    public C0122da(View view, ArrayList arrayList) {
        this.f10201a = view;
        this.f10202b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f10201a.setVisibility(8);
        int size = this.f10202b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f10202b.get(i)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
