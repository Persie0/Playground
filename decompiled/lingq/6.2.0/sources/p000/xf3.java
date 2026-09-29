package p000;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class xf3 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f68149a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f68150b;

    public xf3(View view, ArrayList arrayList) {
        this.f68149a = view;
        this.f68150b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f68149a.setVisibility(8);
        ArrayList arrayList = this.f68150b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
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
