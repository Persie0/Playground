package p000;

import android.util.Log;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w60 extends kr6 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f66441d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f66442e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w60(Object obj, int i) {
        super(false);
        this.f66441d = i;
        this.f66442e = obj;
    }

    @Override // p000.kr6
    /* JADX INFO: renamed from: a */
    public void mo15654a() {
        int i = this.f66441d;
        Object obj = this.f66442e;
        switch (i) {
            case 0:
                ((x60) obj).mo631e();
                break;
            case 1:
                AbstractC0638f abstractC0638f = (AbstractC0638f) obj;
                if (AbstractC0638f.m2128L(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + abstractC0638f);
                }
                if (AbstractC0638f.m2128L(3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + abstractC0638f.f5747h);
                }
                g70 g70Var = abstractC0638f.f5747h;
                if (g70Var != null) {
                    g70Var.f40305s = false;
                    g70Var.m12395e();
                    g70 g70Var2 = abstractC0638f.f5747h;
                    RunnableC3781y2 runnableC3781y2 = new RunnableC3781y2(abstractC0638f, 22);
                    if (g70Var2.f40303q == null) {
                        g70Var2.f40303q = new ArrayList();
                    }
                    g70Var2.f40303q.add(runnableC3781y2);
                    abstractC0638f.f5747h.m12396f();
                    abstractC0638f.f5748i = true;
                    abstractC0638f.m2191z(true);
                    abstractC0638f.m2138F();
                    abstractC0638f.f5748i = false;
                    abstractC0638f.f5747h = null;
                }
                break;
        }
    }

    @Override // p000.kr6
    /* JADX INFO: renamed from: b */
    public final void mo15655b() {
        int i = this.f66441d;
        Object obj = this.f66442e;
        switch (i) {
            case 0:
                ((x60) obj).mo632f();
                break;
            case 1:
                AbstractC0638f abstractC0638f = (AbstractC0638f) obj;
                if (AbstractC0638f.m2128L(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + abstractC0638f);
                }
                w60 w60Var = abstractC0638f.f5749j;
                ArrayList<se3> arrayList = abstractC0638f.f5754o;
                abstractC0638f.f5748i = true;
                abstractC0638f.m2191z(true);
                abstractC0638f.f5748i = false;
                if (abstractC0638f.f5747h != null) {
                    if (!arrayList.isEmpty()) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0638f.m2127G(abstractC0638f.f5747h));
                        for (se3 se3Var : arrayList) {
                            Iterator it = linkedHashSet.iterator();
                            while (it.hasNext()) {
                                se3Var.m21306a((AbstractComponentCallbacksC0635c) it.next(), true);
                            }
                        }
                    }
                    Iterator it2 = abstractC0638f.f5747h.f40287a.iterator();
                    while (it2.hasNext()) {
                        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = ((vf3) it2.next()).f65305b;
                        if (abstractComponentCallbacksC0635c != null) {
                            abstractComponentCallbacksC0635c.f5666H = false;
                        }
                    }
                    for (p82 p82Var : abstractC0638f.m2164f(new ArrayList(Collections.singletonList(abstractC0638f.f5747h)), 0, 1)) {
                        ArrayList arrayList2 = p82Var.f55725c;
                        if (AbstractC0638f.m2128L(3)) {
                            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                        }
                        p82Var.m18961k(arrayList2);
                        p82Var.m18955c(arrayList2);
                    }
                    Iterator it3 = abstractC0638f.f5747h.f40287a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = ((vf3) it3.next()).f65305b;
                        if (abstractComponentCallbacksC0635c2 != null && abstractComponentCallbacksC0635c2.f5690c0 == null) {
                            abstractC0638f.m2166g(abstractComponentCallbacksC0635c2).m2202k();
                        }
                    }
                    abstractC0638f.f5747h = null;
                    abstractC0638f.m2178m0();
                    if (AbstractC0638f.m2128L(3)) {
                        Log.d("FragmentManager", "Op is being set to null");
                        Log.d("FragmentManager", "OnBackPressedCallback enabled=" + w60Var.f48365b + " for  FragmentManager " + abstractC0638f);
                    }
                } else if (w60Var.f48365b) {
                    if (AbstractC0638f.m2128L(3)) {
                        Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                    }
                    abstractC0638f.m2149V();
                } else {
                    if (AbstractC0638f.m2128L(3)) {
                        Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                    }
                    abstractC0638f.f5746g.m19463b().m10414a();
                }
                break;
            default:
                ((ud6) obj).m22691h();
                break;
        }
    }

    @Override // p000.kr6
    /* JADX INFO: renamed from: c */
    public void mo15656c(u60 u60Var) {
        int i = this.f66441d;
        Object obj = this.f66442e;
        switch (i) {
            case 0:
                ((x60) obj).mo633g(u60Var);
                break;
            case 1:
                AbstractC0638f abstractC0638f = (AbstractC0638f) obj;
                if (AbstractC0638f.m2128L(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + abstractC0638f);
                }
                if (abstractC0638f.f5747h != null) {
                    for (p82 p82Var : abstractC0638f.m2164f(new ArrayList(Collections.singletonList(abstractC0638f.f5747h)), 0, 1)) {
                        p82Var.getClass();
                        if (AbstractC0638f.m2128L(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + u60Var.m22503a());
                        }
                        ArrayList arrayList = p82Var.f55725c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            u91.m22630w0(((ze9) it.next()).f71474k, arrayList2);
                        }
                        List listM22622n1 = u91.m22622n1(u91.m22627s1(arrayList2));
                        int size = listM22622n1.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((ye9) listM22622n1.get(i2)).mo2069d(u60Var, p82Var.f55723a);
                        }
                    }
                    Iterator it2 = abstractC0638f.f5754o.iterator();
                    while (it2.hasNext()) {
                        ((se3) it2.next()).getClass();
                    }
                }
                break;
        }
    }

    @Override // p000.kr6
    /* JADX INFO: renamed from: d */
    public void mo15657d(u60 u60Var) {
        int i = this.f66441d;
        Object obj = this.f66442e;
        switch (i) {
            case 0:
                ((x60) obj).mo634h();
                break;
            case 1:
                AbstractC0638f abstractC0638f = (AbstractC0638f) obj;
                if (AbstractC0638f.m2128L(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + abstractC0638f);
                }
                abstractC0638f.m2188w();
                abstractC0638f.m2189x(new ke3(abstractC0638f), false);
                break;
        }
    }
}
