package p000;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: de */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0126de extends AbstractC0127df {
    /* JADX INFO: renamed from: t */
    private static boolean m5965t(Transition transition) {
        return (m6044r(transition.getTargetIds()) && m6044r(transition.getTargetNames()) && m6044r(transition.getTargetTypes())) ? false : true;
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: a */
    public final Object mo1910a(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: b */
    public final Object mo1911b(Object obj, Object obj2, Object obj3) {
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

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: c */
    public final Object mo1912c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: d */
    public final void mo1913d(Object obj, View view) {
        ((Transition) obj).addTarget(view);
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: e */
    public final void mo1914e(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo1914e(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m5965t(transition) || !m6044r(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: f */
    public final void mo1915f(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* JADX INFO: renamed from: g */
    public final void m5966g(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                m5966g(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m5965t(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((View) arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: h */
    public final void mo1917h(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C0122da(view, arrayList));
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: i */
    public final void mo1918i(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new C0125dd(rect));
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: j */
    public final void mo1919j(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m6045s(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0120cz(rect));
        }
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: k */
    public final void mo1920k(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m6043q(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo1914e(transitionSet, arrayList);
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: l */
    public final void mo1921l(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m5966g(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: m */
    public final boolean mo1922m(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: n */
    public final Object mo1923n(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: o */
    public final void mo1924o(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new C0123db(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: p */
    public final void mo1925p(Object obj, exz exzVar, Runnable runnable) {
        ((Transition) obj).addListener(new C0124dc(runnable));
    }
}
