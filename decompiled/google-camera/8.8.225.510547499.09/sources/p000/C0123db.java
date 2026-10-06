package p000;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: renamed from: db */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0123db implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f10354a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ArrayList f10355b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f10356c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ ArrayList f10357d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C0126de f10358e;

    public C0123db(C0126de c0126de, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f10358e = c0126de;
        this.f10354a = obj;
        this.f10355b = arrayList;
        this.f10356c = obj2;
        this.f10357d = arrayList2;
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
        Object obj = this.f10354a;
        if (obj != null) {
            this.f10358e.m5966g(obj, this.f10355b, (ArrayList) null);
        }
        Object obj2 = this.f10356c;
        if (obj2 != null) {
            this.f10358e.m5966g(obj2, this.f10357d, (ArrayList) null);
        }
    }
}
