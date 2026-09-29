package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0971p0 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f6383a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f6384b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6385c = null;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f6386d = null;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f6387e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ArrayList f6388f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0969o0 f6389g;

    public C0971p0(C0969o0 c0969o0, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f6389g = c0969o0;
        this.f6383a = obj;
        this.f6384b = arrayList;
        this.f6387e = obj2;
        this.f6388f = arrayList2;
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
        C0969o0 c0969o0 = this.f6389g;
        Object obj = this.f6383a;
        if (obj != null) {
            c0969o0.m3795t(obj, this.f6384b, null);
        }
        Object obj2 = this.f6385c;
        if (obj2 != null) {
            c0969o0.m3795t(obj2, this.f6386d, null);
        }
        Object obj3 = this.f6387e;
        if (obj3 != null) {
            c0969o0.m3795t(obj3, this.f6388f, null);
        }
    }
}
