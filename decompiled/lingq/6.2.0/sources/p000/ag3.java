package p000;

import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ag3 extends cg3 {
    /* JADX INFO: renamed from: u */
    public static boolean m368u(Transition transition) {
        return (cg3.m4635i(transition.getTargetIds()) && cg3.m4635i(transition.getTargetNames()) && cg3.m4635i(transition.getTargetTypes())) ? false : true;
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: a */
    public final void mo369a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: b */
    public final void mo370b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo370b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m368u(transition) || !cg3.m4635i(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: e */
    public final void mo371e(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: f */
    public final boolean mo372f(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: g */
    public final Object mo373g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: j */
    public final boolean mo374j() {
        if (!AbstractC0638f.m2128L(4)) {
            return false;
        }
        Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: k */
    public final boolean mo375k(Object obj) {
        if (!AbstractC0638f.m2128L(2)) {
            return false;
        }
        Log.v("FragmentManager", "Predictive back not available for framework transition " + obj + ". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: l */
    public final Object mo376l(Object obj, Object obj2) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        if (transition != null && transition2 != null) {
            return new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        }
        if (transition != null) {
            return transition;
        }
        if (transition2 != null) {
            return transition2;
        }
        return null;
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: m */
    public final Object mo377m(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: n */
    public final void mo378n(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new xf3(view, arrayList));
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: o */
    public final void mo379o(Object obj, Object obj2, ArrayList arrayList) {
        ((Transition) obj).addListener(new yf3(this, obj2, arrayList));
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: q */
    public final void mo380q(Object obj) {
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: r */
    public final void mo381r(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, Object obj, um0 um0Var, Runnable runnable) {
        ((Transition) obj).addListener(new zf3(runnable));
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: t */
    public final void mo382t(ArrayList arrayList, ArrayList arrayList2) {
    }

    /* JADX INFO: renamed from: v */
    public final void m383v(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                m383v(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m368u(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
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
}
