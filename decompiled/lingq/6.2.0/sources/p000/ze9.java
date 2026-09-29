package p000;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.fragment.app.C0639g;
import androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact;
import androidx.fragment.app.SpecialEffectsController$Operation$State;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ze9 {

    /* JADX INFO: renamed from: a */
    public SpecialEffectsController$Operation$State f71464a;

    /* JADX INFO: renamed from: b */
    public SpecialEffectsController$Operation$LifecycleImpact f71465b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC0635c f71466c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f71467d;

    /* JADX INFO: renamed from: e */
    public boolean f71468e;

    /* JADX INFO: renamed from: f */
    public boolean f71469f;

    /* JADX INFO: renamed from: g */
    public boolean f71470g;

    /* JADX INFO: renamed from: h */
    public boolean f71471h;

    /* JADX INFO: renamed from: i */
    public boolean f71472i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f71473j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f71474k;

    /* JADX INFO: renamed from: l */
    public final C0639g f71475l;

    public ze9(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact, C0639g c0639g) {
        specialEffectsController$Operation$State.getClass();
        specialEffectsController$Operation$LifecycleImpact.getClass();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = c0639g.f5768c;
        abstractComponentCallbacksC0635c.getClass();
        specialEffectsController$Operation$State.getClass();
        specialEffectsController$Operation$LifecycleImpact.getClass();
        abstractComponentCallbacksC0635c.getClass();
        this.f71464a = specialEffectsController$Operation$State;
        this.f71465b = specialEffectsController$Operation$LifecycleImpact;
        this.f71466c = abstractComponentCallbacksC0635c;
        this.f71467d = new ArrayList();
        this.f71472i = true;
        ArrayList arrayList = new ArrayList();
        this.f71473j = arrayList;
        this.f71474k = arrayList;
        this.f71475l = c0639g;
    }

    /* JADX INFO: renamed from: a */
    public final void m25571a(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f71471h = false;
        if (this.f71468e) {
            return;
        }
        this.f71468e = true;
        if (this.f71473j.isEmpty()) {
            m25572b();
            return;
        }
        for (ye9 ye9Var : u91.m22622n1(this.f71474k)) {
            ye9Var.getClass();
            if (!ye9Var.f69752b) {
                ye9Var.mo2067b(viewGroup);
            }
            ye9Var.f69752b = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m25572b() {
        this.f71471h = false;
        if (!this.f71469f) {
            if (AbstractC0638f.m2128L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f71469f = true;
            Iterator it = this.f71467d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f71466c.f5666H = false;
        this.f71475l.m2202k();
    }

    /* JADX INFO: renamed from: c */
    public final void m25573c(ye9 ye9Var) {
        ye9Var.getClass();
        ArrayList arrayList = this.f71473j;
        if (arrayList.remove(ye9Var) && arrayList.isEmpty()) {
            m25572b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m25574d(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact) {
        specialEffectsController$Operation$State.getClass();
        specialEffectsController$Operation$LifecycleImpact.getClass();
        int i = cf9.f10006a[specialEffectsController$Operation$LifecycleImpact.ordinal()];
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f71466c;
        if (i == 1) {
            if (this.f71464a == SpecialEffectsController$Operation$State.REMOVED) {
                if (AbstractC0638f.m2128L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0635c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f71465b + " to ADDING.");
                }
                this.f71464a = SpecialEffectsController$Operation$State.VISIBLE;
                this.f71465b = SpecialEffectsController$Operation$LifecycleImpact.ADDING;
                this.f71472i = true;
                return;
            }
            return;
        }
        if (i == 2) {
            if (AbstractC0638f.m2128L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0635c + " mFinalState = " + this.f71464a + " -> REMOVED. mLifecycleImpact  = " + this.f71465b + " to REMOVING.");
            }
            this.f71464a = SpecialEffectsController$Operation$State.REMOVED;
            this.f71465b = SpecialEffectsController$Operation$LifecycleImpact.REMOVING;
            this.f71472i = true;
            return;
        }
        if (i == 3 && this.f71464a != SpecialEffectsController$Operation$State.REMOVED) {
            if (AbstractC0638f.m2128L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0635c + " mFinalState = " + this.f71464a + " -> " + specialEffectsController$Operation$State + '.');
            }
            this.f71464a = specialEffectsController$Operation$State;
        }
    }

    public final String toString() {
        StringBuilder sbM17742q = AbstractC3393o1.m17742q("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbM17742q.append(this.f71464a);
        sbM17742q.append(" lifecycleImpact = ");
        sbM17742q.append(this.f71465b);
        sbM17742q.append(" fragment = ");
        sbM17742q.append(this.f71466c);
        sbM17742q.append('}');
        return sbM17742q.toString();
    }
}
