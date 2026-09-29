package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3275kv;
import p000.RunnableC0002a0;
import p000.RunnableC0800b7;
import p000.RunnableC0806bd;
import p000.RunnableC3781y2;
import p000.bg3;
import p000.cg3;
import p000.dta;
import p000.jta;
import p000.n82;
import p000.o82;
import p000.sx6;
import p000.u60;
import p000.ui3;
import p000.um0;
import p000.v91;
import p000.wf3;
import p000.xfa;
import p000.ye9;
import p000.ze9;

/* JADX INFO: renamed from: androidx.fragment.app.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0634b extends ye9 {

    /* JADX INFO: renamed from: c */
    public final ArrayList f5655c;

    /* JADX INFO: renamed from: d */
    public final ze9 f5656d;

    /* JADX INFO: renamed from: e */
    public final ze9 f5657e;

    /* JADX INFO: renamed from: f */
    public final cg3 f5658f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f5659g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f5660h;

    /* JADX INFO: renamed from: i */
    public final C3275kv f5661i;

    /* JADX INFO: renamed from: j */
    public final um0 f5662j = new um0();

    /* JADX INFO: renamed from: k */
    public Object f5663k;

    /* JADX INFO: renamed from: l */
    public boolean f5664l;

    public C0634b(ArrayList arrayList, ze9 ze9Var, ze9 ze9Var2, cg3 cg3Var, ArrayList arrayList2, ArrayList arrayList3, C3275kv c3275kv, ArrayList arrayList4, ArrayList arrayList5, C3275kv c3275kv2, C3275kv c3275kv3, boolean z) {
        this.f5655c = arrayList;
        this.f5656d = ze9Var;
        this.f5657e = ze9Var2;
        this.f5658f = cg3Var;
        this.f5659g = arrayList2;
        this.f5660h = arrayList3;
        this.f5661i = c3275kv;
    }

    /* JADX INFO: renamed from: f */
    public static void m2065f(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = jta.f46136a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                m2065f(childAt, arrayList);
            }
        }
    }

    @Override // p000.ye9
    /* JADX INFO: renamed from: a */
    public final boolean mo2066a() {
        Object obj;
        cg3 cg3Var = this.f5658f;
        if (!cg3Var.mo374j()) {
            return false;
        }
        ArrayList<o82> arrayList = this.f5655c;
        if (arrayList.isEmpty()) {
            return true;
        }
        for (o82 o82Var : arrayList) {
            if (Build.VERSION.SDK_INT < 34 || (obj = o82Var.f53968b) == null || !cg3Var.mo375k(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.ye9
    /* JADX INFO: renamed from: b */
    public final void mo2067b(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f5662j.m22792a();
    }

    @Override // p000.ye9
    /* JADX INFO: renamed from: c */
    public final void mo2068c(final ViewGroup viewGroup) {
        viewGroup.getClass();
        boolean zIsLaidOut = viewGroup.isLaidOut();
        ArrayList<o82> arrayList = this.f5655c;
        if (!zIsLaidOut || this.f5664l) {
            for (o82 o82Var : arrayList) {
                ze9 ze9Var = (ze9) o82Var.f60774a;
                if (AbstractC0638f.m2128L(2)) {
                    if (this.f5664l) {
                        Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + ze9Var);
                    } else {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + ze9Var);
                    }
                }
                ((ze9) o82Var.f60774a).m25573c(this);
            }
            this.f5664l = false;
            return;
        }
        Object obj = this.f5663k;
        cg3 cg3Var = this.f5658f;
        ze9 ze9Var2 = this.f5657e;
        ze9 ze9Var3 = this.f5656d;
        if (obj != null) {
            cg3Var.mo4636c(obj);
            if (AbstractC0638f.m2128L(2)) {
                Log.v("FragmentManager", "Ending execution of operations from " + ze9Var3 + " to " + ze9Var2);
                return;
            }
            return;
        }
        Pair pairM2071g = m2071g(viewGroup, ze9Var2, ze9Var3);
        ArrayList arrayList2 = (ArrayList) pairM2071g.f47623a;
        final Object obj2 = pairM2071g.f47624b;
        ArrayList<ze9> arrayList3 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add((ze9) ((o82) it.next()).f60774a);
        }
        for (ze9 ze9Var4 : arrayList3) {
            cg3Var.mo381r(ze9Var4.f71466c, obj2, this.f5662j, new n82(ze9Var4, this, 1));
        }
        m2073i(arrayList2, viewGroup, new ui3() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                this.f5658f.mo371e(viewGroup, obj2);
                return xfa.f68157a;
            }
        });
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + ze9Var3 + " to " + ze9Var2);
        }
    }

    @Override // p000.ye9
    /* JADX INFO: renamed from: d */
    public final void mo2069d(u60 u60Var, ViewGroup viewGroup) {
        viewGroup.getClass();
        Object obj = this.f5663k;
        if (obj != null) {
            this.f5658f.mo4639p(obj, u60Var.m22503a());
        }
    }

    @Override // p000.ye9
    /* JADX INFO: renamed from: e */
    public final void mo2070e(final ViewGroup viewGroup) {
        viewGroup.getClass();
        boolean zIsLaidOut = viewGroup.isLaidOut();
        ArrayList arrayList = this.f5655c;
        if (!zIsLaidOut) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ze9 ze9Var = (ze9) ((o82) it.next()).f60774a;
                if (AbstractC0638f.m2128L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + ze9Var);
                }
            }
            return;
        }
        m2072h();
        if (mo2066a() && m2072h()) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Pair pairM2071g = m2071g(viewGroup, this.f5657e, this.f5656d);
            ArrayList arrayList2 = (ArrayList) pairM2071g.f47623a;
            final Object obj = pairM2071g.f47624b;
            ArrayList<ze9> arrayList3 = new ArrayList(v91.m23189q0(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add((ze9) ((o82) it2.next()).f60774a);
            }
            for (ze9 ze9Var2 : arrayList3) {
                RunnableC0002a0 runnableC0002a0 = new RunnableC0002a0(ref$ObjectRef, 7);
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = ze9Var2.f71466c;
                this.f5658f.mo4640s(obj, this.f5662j, runnableC0002a0, new n82(ze9Var2, this, 0));
            }
            m2073i(arrayList2, viewGroup, new ui3() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    if (AbstractC0638f.m2128L(2)) {
                        Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                    }
                    final C0634b c0634b = this.f5617b;
                    cg3 cg3Var = c0634b.f5658f;
                    final ViewGroup viewGroup2 = viewGroup;
                    final Object obj2 = obj;
                    Object objMo4638h = cg3Var.mo4638h(viewGroup2, obj2);
                    c0634b.f5663k = objMo4638h;
                    if (objMo4638h == null) {
                        if (AbstractC0638f.m2128L(2)) {
                            Log.v("FragmentManager", "TransitionSeekController was not created.");
                        }
                        c0634b.f5664l = true;
                    } else {
                        ref$ObjectRef.f47718a = new ui3() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Code duplicated, block: B:16:0x005b  */
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                C0634b c0634b2 = c0634b;
                                ArrayList arrayList4 = c0634b2.f5655c;
                                cg3 cg3Var2 = c0634b2.f5658f;
                                if (arrayList4.isEmpty()) {
                                    if (AbstractC0638f.m2128L(2)) {
                                        Log.v("FragmentManager", "Animating to start");
                                    }
                                    Object obj3 = c0634b2.f5663k;
                                    obj3.getClass();
                                    cg3Var2.mo4637d(obj3, new RunnableC0806bd(18, c0634b2, viewGroup2));
                                } else {
                                    Iterator it3 = arrayList4.iterator();
                                    while (it3.hasNext()) {
                                        if (!((ze9) ((o82) it3.next()).f60774a).f71470g) {
                                            if (AbstractC0638f.m2128L(2)) {
                                                Log.v("FragmentManager", "Completing animating immediately");
                                            }
                                            um0 um0Var = new um0();
                                            cg3Var2.mo381r(((ze9) ((o82) arrayList4.get(0)).f60774a).f71466c, obj2, um0Var, new RunnableC3781y2(c0634b2, 14));
                                            um0Var.m22792a();
                                        }
                                    }
                                    if (AbstractC0638f.m2128L(2)) {
                                        Log.v("FragmentManager", "Animating to start");
                                    }
                                    Object obj4 = c0634b2.f5663k;
                                    obj4.getClass();
                                    cg3Var2.mo4637d(obj4, new RunnableC0806bd(18, c0634b2, viewGroup2));
                                }
                                return xfa.f68157a;
                            }
                        };
                        if (AbstractC0638f.m2128L(2)) {
                            Log.v("FragmentManager", "Started executing operations from " + c0634b.f5656d + " to " + c0634b.f5657e);
                        }
                    }
                    return xfa.f68157a;
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final Pair m2071g(ViewGroup viewGroup, ze9 ze9Var, ze9 ze9Var2) {
        cg3 cg3Var;
        int i;
        View view = new View(viewGroup.getContext());
        new Rect();
        ArrayList arrayList = this.f5655c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o82) it.next()).getClass();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        Object objMo377m = null;
        Object objMo377m2 = null;
        while (true) {
            boolean zHasNext = it2.hasNext();
            cg3Var = this.f5658f;
            if (!zHasNext) {
                break;
            }
            o82 o82Var = (o82) it2.next();
            ze9 ze9Var3 = (ze9) o82Var.f60774a;
            Object objMo373g = cg3Var.mo373g(o82Var.f53968b);
            if (objMo373g != null) {
                ArrayList arrayList3 = new ArrayList();
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = ze9Var3.f71466c;
                View view2 = abstractComponentCallbacksC0635c.f5692d0;
                view2.getClass();
                m2065f(view2, arrayList3);
                if (arrayList3.isEmpty()) {
                    cg3Var.mo369a(view, objMo373g);
                    i = 2;
                } else {
                    cg3Var.mo370b(objMo373g, arrayList3);
                    cg3Var.mo379o(objMo373g, objMo373g, arrayList3);
                    i = 2;
                    if (ze9Var3.f71464a == SpecialEffectsController$Operation$State.GONE) {
                        ze9Var3.f71472i = false;
                        ArrayList arrayList4 = new ArrayList(arrayList3);
                        arrayList4.remove(abstractComponentCallbacksC0635c.f5692d0);
                        cg3Var.mo378n(objMo373g, abstractComponentCallbacksC0635c.f5692d0, arrayList4);
                        sx6.m21765a(viewGroup, new RunnableC0800b7(arrayList3));
                    }
                }
                if (ze9Var3.f71464a == SpecialEffectsController$Operation$State.VISIBLE) {
                    arrayList2.addAll(arrayList3);
                    if (AbstractC0638f.m2128L(i)) {
                        Log.v("FragmentManager", "Entering Transition: " + objMo373g);
                        Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                        for (Object obj : arrayList3) {
                            obj.getClass();
                            Log.v("FragmentManager", "View: " + ((View) obj));
                        }
                    }
                } else {
                    cg3Var.mo380q(objMo373g);
                    if (AbstractC0638f.m2128L(i)) {
                        Log.v("FragmentManager", "Exiting Transition: " + objMo373g);
                        Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                        for (Object obj2 : arrayList3) {
                            obj2.getClass();
                            Log.v("FragmentManager", "View: " + ((View) obj2));
                        }
                    }
                }
                if (o82Var.f53969c) {
                    objMo377m = cg3Var.mo377m(objMo377m, objMo373g);
                } else {
                    objMo377m2 = cg3Var.mo377m(objMo377m2, objMo373g);
                }
            }
        }
        Object objMo376l = cg3Var.mo376l(objMo377m, objMo377m2);
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Final merged transition: " + objMo376l + " for container " + viewGroup);
        }
        return new Pair(arrayList2, objMo376l);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2072h() {
        ArrayList arrayList = this.f5655c;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((ze9) ((o82) it.next()).f60774a).f71466c.f5666H) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m2073i(ArrayList arrayList, ViewGroup viewGroup, ui3 ui3Var) {
        wf3.m23892a(4, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f5660h;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            WeakHashMap weakHashMap = dta.f36217a;
            arrayList2.add(view.getTransitionName());
            view.setTransitionName(null);
        }
        boolean zM2128L = AbstractC0638f.m2128L(2);
        ArrayList arrayList4 = this.f5659g;
        if (zM2128L) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            for (Object obj : arrayList4) {
                obj.getClass();
                View view2 = (View) obj;
                StringBuilder sb = new StringBuilder("View: ");
                sb.append(view2);
                sb.append(" Name: ");
                WeakHashMap weakHashMap2 = dta.f36217a;
                sb.append(view2.getTransitionName());
                Log.v("FragmentManager", sb.toString());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            for (Object obj2 : arrayList3) {
                obj2.getClass();
                View view3 = (View) obj2;
                StringBuilder sb2 = new StringBuilder("View: ");
                sb2.append(view3);
                sb2.append(" Name: ");
                WeakHashMap weakHashMap3 = dta.f36217a;
                sb2.append(view3.getTransitionName());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        ui3Var.mo0a();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < size2; i2++) {
            View view4 = (View) arrayList4.get(i2);
            WeakHashMap weakHashMap4 = dta.f36217a;
            String transitionName = view4.getTransitionName();
            arrayList5.add(transitionName);
            if (transitionName != null) {
                view4.setTransitionName(null);
                String str = (String) this.f5661i.get(transitionName);
                for (int i3 = 0; i3 < size2; i3++) {
                    if (str.equals(arrayList2.get(i3))) {
                        ((View) arrayList3.get(i3)).setTransitionName(transitionName);
                        break;
                    }
                }
            }
        }
        sx6.m21765a(viewGroup, new bg3(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        wf3.m23892a(0, arrayList);
        this.f5658f.mo382t(arrayList4, arrayList3);
    }
}
