package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p389t2.C9185d;

/* JADX INFO: renamed from: androidx.fragment.app.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0969o0 extends AbstractC0977s0 {

    /* JADX INFO: renamed from: androidx.fragment.app.o0$a */
    public class a implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f6379a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f6380b;

        public a(View view, ArrayList arrayList) {
            this.f6379a = view;
            this.f6380b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f6379a.setVisibility(8);
            ArrayList arrayList = this.f6380b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) arrayList.get(i10)).setVisibility(0);
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

    /* JADX INFO: renamed from: androidx.fragment.app.o0$b */
    public class b extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f6381a;

        public b(Rect rect) {
            this.f6381a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f6381a;
            if (rect != null && !rect.isEmpty()) {
                return rect;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m3779s(Transition transition) {
        return (AbstractC0977s0.m3798h(transition.getTargetIds()) && AbstractC0977s0.m3798h(transition.getTargetNames()) && AbstractC0977s0.m3798h(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: a */
    public final void mo3780a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: b */
    public final void mo3781b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                mo3781b(transitionSet.getTransitionAt(i10), arrayList);
                i10++;
            }
            return;
        }
        if (m3779s(transition) || !AbstractC0977s0.m3798h(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            transition.addTarget(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: c */
    public final void mo3782c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: e */
    public final boolean mo3783e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: f */
    public final Object mo3784f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: i */
    public final Object mo3785i(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: j */
    public final Object mo3786j(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: k */
    public final void mo3787k(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new a(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: l */
    public final void mo3788l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new C0971p0(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: m */
    public final void mo3789m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC0977s0.m3797g(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0967n0(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: n */
    public final void mo3790n(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new b(rect));
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: o */
    public final void mo3791o(Object obj, C9185d c9185d, RunnableC0960k runnableC0960k) {
        ((Transition) obj).addListener(new C0973q0(runnableC0960k));
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: p */
    public final void mo3792p(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0977s0.m3796d(arrayList.get(i10), targets);
        }
        targets.add(view);
        arrayList.add(view);
        mo3781b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: q */
    public final void mo3793q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m3795t(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0977s0
    /* JADX INFO: renamed from: r */
    public final Object mo3794r(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* JADX INFO: renamed from: t */
    public final void m3795t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                m3795t(transitionSet.getTransitionAt(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (m3779s(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i10 < size) {
            transition.addTarget(arrayList2.get(i10));
            i10++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }
}
