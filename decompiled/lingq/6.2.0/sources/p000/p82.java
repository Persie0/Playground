package p000;

import android.animation.AnimatorSet;
import android.content.Context;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R$id;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.fragment.app.C0634b;
import androidx.fragment.app.C0639g;
import androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact;
import androidx.fragment.app.SpecialEffectsController$Operation$State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class p82 {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f55723a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f55724b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f55725c;

    /* JADX INFO: renamed from: d */
    public boolean f55726d;

    /* JADX INFO: renamed from: e */
    public boolean f55727e;

    /* JADX INFO: renamed from: f */
    public boolean f55728f;

    public p82(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f55723a = viewGroup;
        this.f55724b = new ArrayList();
        this.f55725c = new ArrayList();
    }

    /* JADX INFO: renamed from: i */
    public static final p82 m18951i(ViewGroup viewGroup, AbstractC0638f abstractC0638f) {
        viewGroup.getClass();
        abstractC0638f.getClass();
        abstractC0638f.m2141J().getClass();
        Object tag = viewGroup.getTag(R$id.special_effects_controller_view_tag);
        if (tag instanceof p82) {
            return (p82) tag;
        }
        p82 p82Var = new p82(viewGroup);
        viewGroup.setTag(R$id.special_effects_controller_view_tag, p82Var);
        return p82Var;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m18952j(ArrayList arrayList) {
        boolean z;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                ze9 ze9Var = (ze9) it.next();
                if (!ze9Var.f71474k.isEmpty()) {
                    ArrayList arrayList2 = ze9Var.f71474k;
                    if (arrayList2 != null && arrayList2.isEmpty()) {
                        break;
                    }
                    Iterator it2 = arrayList2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            break;
                        }
                    } while (((ye9) it2.next()).mo2066a());
                }
                z = false;
            }
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                u91.m22630w0(((ze9) it3.next()).f71474k, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m18953a(ze9 ze9Var) {
        ze9Var.getClass();
        if (ze9Var.f71472i) {
            ze9Var.f71464a.applyState(ze9Var.f71466c.m2092T(), this.f55723a);
            ze9Var.f71472i = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18954b(ArrayList arrayList, boolean z) {
        Object next;
        Object objPrevious;
        boolean z2;
        cg3 cg3Var;
        cg3 cg3Var2;
        int i;
        int i2 = 2;
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ze9 ze9Var = (ze9) next;
            af9 af9Var = SpecialEffectsController$Operation$State.Companion;
            View view = ze9Var.f71466c.f5692d0;
            view.getClass();
            af9Var.getClass();
            SpecialEffectsController$Operation$State specialEffectsController$Operation$StateM349a = af9.m349a(view);
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State = SpecialEffectsController$Operation$State.VISIBLE;
            if (specialEffectsController$Operation$StateM349a == specialEffectsController$Operation$State && ze9Var.f71464a != specialEffectsController$Operation$State) {
                break;
            }
        }
        ze9 ze9Var2 = (ze9) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            ze9 ze9Var3 = (ze9) objPrevious;
            af9 af9Var2 = SpecialEffectsController$Operation$State.Companion;
            View view2 = ze9Var3.f71466c.f5692d0;
            view2.getClass();
            af9Var2.getClass();
            SpecialEffectsController$Operation$State specialEffectsController$Operation$StateM349a2 = af9.m349a(view2);
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = SpecialEffectsController$Operation$State.VISIBLE;
            if (specialEffectsController$Operation$StateM349a2 != specialEffectsController$Operation$State2 && ze9Var3.f71464a == specialEffectsController$Operation$State2) {
                break;
            }
        }
        ze9 ze9Var4 = (ze9) objPrevious;
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Executing operations from " + ze9Var2 + " to " + ze9Var4);
        }
        ArrayList<i82> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = ((ze9) u91.m22597O0(arrayList)).f71466c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ed3 ed3Var = ((ze9) it2.next()).f71466c.f5698g0;
            ed3 ed3Var2 = abstractComponentCallbacksC0635c.f5698g0;
            ed3Var.f37042b = ed3Var2.f37042b;
            ed3Var.f37043c = ed3Var2.f37043c;
            ed3Var.f37044d = ed3Var2.f37044d;
            ed3Var.f37045e = ed3Var2.f37045e;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            int i3 = 0;
            if (!it3.hasNext()) {
                break;
            }
            ze9 ze9Var5 = (ze9) it3.next();
            arrayList2.add(new i82(ze9Var5, z));
            arrayList3.add(new o82(ze9Var5, z, !z ? ze9Var5 != ze9Var4 : ze9Var5 != ze9Var2));
            ze9Var5.f71467d.add(new f82(this, ze9Var5, i3));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (!((o82) obj).m21329s()) {
                arrayList4.add(obj);
            }
        }
        ArrayList<o82> arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            o82 o82Var = (o82) obj2;
            Object obj3 = o82Var.f53968b;
            if (obj3 == null) {
                i = i2;
                cg3Var2 = null;
            } else {
                cg3Var2 = wf3.f66752a;
                i = i2;
                if (!(obj3 instanceof Transition)) {
                    cg3 cg3Var3 = wf3.f66753b;
                    if (cg3Var3 == null || !cg3Var3.mo372f(obj3)) {
                        StringBuilder sb = new StringBuilder("Transition ");
                        sb.append(obj3);
                        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = ((ze9) o82Var.f60774a).f71466c;
                        sb.append(" for fragment ");
                        sb.append(abstractComponentCallbacksC0635c2);
                        sb.append(" is not a valid framework Transition or AndroidX Transition");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    cg3Var2 = cg3Var3;
                }
            }
            if (cg3Var2 == null) {
                cg3Var2 = null;
            }
            if (cg3Var2 != null) {
                arrayList5.add(obj2);
            }
            i2 = i;
        }
        int i4 = i2;
        cg3 cg3Var4 = null;
        for (o82 o82Var2 : arrayList5) {
            Object obj4 = o82Var2.f53968b;
            ze9 ze9Var6 = (ze9) o82Var2.f60774a;
            if (obj4 == null) {
                cg3Var = null;
            } else {
                cg3Var = wf3.f66752a;
                if (!(obj4 instanceof Transition)) {
                    cg3 cg3Var5 = wf3.f66753b;
                    if (cg3Var5 == null || !cg3Var5.mo372f(obj4)) {
                        StringBuilder sb2 = new StringBuilder("Transition ");
                        sb2.append(obj4);
                        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c3 = ze9Var6.f71466c;
                        sb2.append(" for fragment ");
                        sb2.append(abstractComponentCallbacksC0635c3);
                        sb2.append(" is not a valid framework Transition or AndroidX Transition");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    cg3Var = cg3Var5;
                }
            }
            cg3 cg3Var6 = cg3Var == null ? null : cg3Var;
            if (cg3Var4 != null && cg3Var6 != cg3Var4) {
                StringBuilder sb3 = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb3.append(ze9Var6.f71466c);
                v63.m23140r(sb3, " returned Transition ", o82Var2.f53968b, " which uses a different Transition type than other Fragments.");
                return;
            }
            cg3Var4 = cg3Var6;
        }
        if (cg3Var4 != null) {
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            boolean z3 = false;
            C3275kv c3275kv = new C3275kv(0);
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            C3275kv c3275kv2 = new C3275kv(0);
            C3275kv c3275kv3 = new C3275kv(0);
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                ((o82) it4.next()).getClass();
            }
            if (arrayList5.isEmpty()) {
                z2 = z3;
                break;
            }
            Iterator it5 = arrayList5.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    z2 = z3;
                    break;
                }
                if (((o82) it5.next()).f53968b != null) {
                    z2 = false;
                    C0634b c0634b = new C0634b(arrayList5, ze9Var2, ze9Var4, cg3Var4, arrayList6, arrayList7, c3275kv, arrayList8, arrayList9, c3275kv2, c3275kv3, z);
                    Iterator it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        ((ze9) ((o82) it6.next()).f60774a).f71473j.add(c0634b);
                    }
                    break;
                }
                z3 = false;
            }
        } else {
            z2 = false;
        }
        ArrayList<i82> arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            u91.m22630w0(((ze9) ((i82) it7.next()).f60774a).f71474k, arrayList11);
        }
        boolean zIsEmpty = arrayList11.isEmpty();
        boolean z4 = z2;
        for (i82 i82Var : arrayList2) {
            Context context = this.f55723a.getContext();
            ze9 ze9Var7 = (ze9) i82Var.f60774a;
            context.getClass();
            bl2 bl2VarM13717E = i82Var.m13717E(context);
            if (bl2VarM13717E != null) {
                if (((AnimatorSet) bl2VarM13717E.f8656b) == null) {
                    arrayList10.add(i82Var);
                } else {
                    AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c4 = ze9Var7.f71466c;
                    if (ze9Var7.f71474k.isEmpty()) {
                        if (ze9Var7.f71464a == SpecialEffectsController$Operation$State.GONE) {
                            ze9Var7.f71472i = z2;
                        }
                        ze9Var7.f71473j.add(new k82(i82Var));
                        z4 = true;
                    } else if (AbstractC0638f.m2128L(i4)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0635c4 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (i82 i82Var2 : arrayList10) {
            ze9 ze9Var8 = (ze9) i82Var2.f60774a;
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c5 = ze9Var8.f71466c;
            if (zIsEmpty) {
                if (!z4) {
                    ze9Var8.f71473j.add(new h82(i82Var2));
                } else if (AbstractC0638f.m2128L(i4)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0635c5 + " as Animations cannot run alongside Animators.");
                }
            } else if (AbstractC0638f.m2128L(i4)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0635c5 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18955c(List list) {
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            u91.m22630w0(((ze9) it.next()).f71474k, arrayList);
        }
        List listM22622n1 = u91.m22622n1(u91.m22627s1(arrayList));
        int size = listM22622n1.size();
        for (int i = 0; i < size; i++) {
            ((ye9) listM22622n1.get(i)).mo2068c(this.f55723a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            m18953a((ze9) list.get(i2));
        }
        List listM22622n2 = u91.m22622n1(list2);
        int size3 = listM22622n2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ze9 ze9Var = (ze9) listM22622n2.get(i3);
            if (ze9Var.f71474k.isEmpty()) {
                ze9Var.m25572b();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18956d(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact, C0639g c0639g) {
        synchronized (this.f55724b) {
            try {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = c0639g.f5768c;
                abstractComponentCallbacksC0635c.getClass();
                ze9 ze9VarM18958f = m18958f(abstractComponentCallbacksC0635c);
                if (ze9VarM18958f == null) {
                    AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = c0639g.f5768c;
                    ze9VarM18958f = (abstractComponentCallbacksC0635c2.f5666H || abstractComponentCallbacksC0635c2.f5707l) ? m18959g(abstractComponentCallbacksC0635c2) : null;
                }
                if (ze9VarM18958f != null) {
                    ze9VarM18958f.m25574d(specialEffectsController$Operation$State, specialEffectsController$Operation$LifecycleImpact);
                    return;
                }
                ze9 ze9Var = new ze9(specialEffectsController$Operation$State, specialEffectsController$Operation$LifecycleImpact, c0639g);
                this.f55724b.add(ze9Var);
                ze9Var.f71467d.add(new f82(this, ze9Var, 1));
                ze9Var.f71467d.add(new f82(this, ze9Var, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18957e() {
        boolean z;
        if (this.f55728f) {
            return;
        }
        if (!this.f55723a.isAttachedToWindow()) {
            m18960h();
            this.f55727e = false;
            return;
        }
        synchronized (this.f55724b) {
            try {
                ArrayList<ze9> arrayListM22624p1 = u91.m22624p1(this.f55725c);
                this.f55725c.clear();
                Iterator it = arrayListM22624p1.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    ze9 ze9Var = (ze9) it.next();
                    if (this.f55724b.isEmpty() || !ze9Var.f71466c.f5666H) {
                        z = false;
                    }
                    ze9Var.f71470g = z;
                }
                for (ze9 ze9Var2 : arrayListM22624p1) {
                    if (this.f55726d) {
                        if (AbstractC0638f.m2128L(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + ze9Var2);
                        }
                        ze9Var2.m25572b();
                    } else {
                        if (AbstractC0638f.m2128L(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + ze9Var2);
                        }
                        ze9Var2.m25571a(this.f55723a);
                    }
                    this.f55726d = false;
                    if (!ze9Var2.f71469f) {
                        this.f55725c.add(ze9Var2);
                    }
                }
                if (!this.f55724b.isEmpty()) {
                    m18962l();
                    ArrayList arrayListM22624p2 = u91.m22624p1(this.f55724b);
                    if (arrayListM22624p2.isEmpty()) {
                        return;
                    }
                    this.f55724b.clear();
                    this.f55725c.addAll(arrayListM22624p2);
                    if (AbstractC0638f.m2128L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    m18954b(arrayListM22624p2, this.f55727e);
                    boolean zM18952j = m18952j(arrayListM22624p2);
                    Iterator it2 = arrayListM22624p2.iterator();
                    boolean z2 = true;
                    while (it2.hasNext()) {
                        if (!((ze9) it2.next()).f71466c.f5666H) {
                            z2 = false;
                        }
                    }
                    if (!z2 || zM18952j) {
                        z = false;
                    }
                    this.f55726d = z;
                    if (AbstractC0638f.m2128L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zM18952j + " \ntransition = " + z2);
                    }
                    if (!z2) {
                        m18961k(arrayListM22624p2);
                        m18955c(arrayListM22624p2);
                    } else if (zM18952j) {
                        m18961k(arrayListM22624p2);
                        int size = arrayListM22624p2.size();
                        for (int i = 0; i < size; i++) {
                            m18953a((ze9) arrayListM22624p2.get(i));
                        }
                    }
                    this.f55727e = false;
                    if (AbstractC0638f.m2128L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final ze9 m18958f(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        Object next;
        Iterator it = this.f55724b.iterator();
        while (it.hasNext()) {
            next = it.next();
            ze9 ze9Var = (ze9) next;
            if (fa4.m11650l(ze9Var.f71466c, abstractComponentCallbacksC0635c) && !ze9Var.f71468e) {
                return (ze9) next;
            }
        }
        next = null;
        return (ze9) next;
    }

    /* JADX INFO: renamed from: g */
    public final ze9 m18959g(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        Object next;
        Iterator it = this.f55725c.iterator();
        while (it.hasNext()) {
            next = it.next();
            ze9 ze9Var = (ze9) next;
            if (fa4.m11650l(ze9Var.f71466c, abstractComponentCallbacksC0635c) && !ze9Var.f71468e) {
                return (ze9) next;
            }
        }
        next = null;
        return (ze9) next;
    }

    /* JADX INFO: renamed from: h */
    public final void m18960h() {
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f55723a.isAttachedToWindow();
        synchronized (this.f55724b) {
            try {
                m18962l();
                m18961k(this.f55724b);
                ArrayList<ze9> arrayListM22624p1 = u91.m22624p1(this.f55725c);
                Iterator it = arrayListM22624p1.iterator();
                while (it.hasNext()) {
                    ((ze9) it.next()).f71470g = false;
                }
                for (ze9 ze9Var : arrayListM22624p1) {
                    if (AbstractC0638f.m2128L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f55723a + " is not attached to window. ") + "Cancelling running operation " + ze9Var);
                    }
                    ze9Var.m25571a(this.f55723a);
                }
                ArrayList<ze9> arrayListM22624p2 = u91.m22624p1(this.f55724b);
                Iterator it2 = arrayListM22624p2.iterator();
                while (it2.hasNext()) {
                    ((ze9) it2.next()).f71470g = false;
                }
                for (ze9 ze9Var2 : arrayListM22624p2) {
                    if (AbstractC0638f.m2128L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f55723a + " is not attached to window. ") + "Cancelling pending operation " + ze9Var2);
                    }
                    ze9Var2.m25571a(this.f55723a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m18961k(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ze9 ze9Var = (ze9) list.get(i);
            C0639g c0639g = ze9Var.f71475l;
            if (!ze9Var.f71471h) {
                ze9Var.f71471h = true;
                SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact = ze9Var.f71465b;
                if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.ADDING) {
                    AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = c0639g.f5768c;
                    abstractComponentCallbacksC0635c.getClass();
                    View viewFindFocus = abstractComponentCallbacksC0635c.f5692d0.findFocus();
                    if (viewFindFocus != null) {
                        abstractComponentCallbacksC0635c.m2104f().f37053m = viewFindFocus;
                        if (AbstractC0638f.m2128L(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0635c);
                        }
                    }
                    View viewM2092T = ze9Var.f71466c.m2092T();
                    if (viewM2092T.getParent() == null) {
                        if (AbstractC0638f.m2128L(2)) {
                            Log.v("FragmentManager", "Adding fragment " + abstractComponentCallbacksC0635c + " view " + viewM2092T + " to container in onStart");
                        }
                        c0639g.m2193b();
                        viewM2092T.setAlpha(0.0f);
                    }
                    if (viewM2092T.getAlpha() == 0.0f && viewM2092T.getVisibility() == 0) {
                        if (AbstractC0638f.m2128L(2)) {
                            Log.v("FragmentManager", "Making view " + viewM2092T + " INVISIBLE in onStart");
                        }
                        viewM2092T.setVisibility(4);
                    }
                    ed3 ed3Var = abstractComponentCallbacksC0635c.f5698g0;
                    viewM2092T.setAlpha(ed3Var == null ? 1.0f : ed3Var.f37052l);
                    if (AbstractC0638f.m2128L(2)) {
                        StringBuilder sb = new StringBuilder("Setting view alpha to ");
                        ed3 ed3Var2 = abstractComponentCallbacksC0635c.f5698g0;
                        sb.append(ed3Var2 != null ? ed3Var2.f37052l : 1.0f);
                        sb.append(" in onStart");
                        Log.v("FragmentManager", sb.toString());
                    }
                } else if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.REMOVING) {
                    AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = c0639g.f5768c;
                    abstractComponentCallbacksC0635c2.getClass();
                    View viewM2092T2 = abstractComponentCallbacksC0635c2.m2092T();
                    if (AbstractC0638f.m2128L(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewM2092T2.findFocus() + " on view " + viewM2092T2 + " for Fragment " + abstractComponentCallbacksC0635c2);
                    }
                    viewM2092T2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u91.m22630w0(((ze9) it.next()).f71474k, arrayList);
        }
        List listM22622n1 = u91.m22622n1(u91.m22627s1(arrayList));
        int size2 = listM22622n1.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ye9 ye9Var = (ye9) listM22622n1.get(i2);
            ye9Var.getClass();
            ViewGroup viewGroup = this.f55723a;
            viewGroup.getClass();
            if (!ye9Var.f69751a) {
                ye9Var.mo2070e(viewGroup);
            }
            ye9Var.f69751a = true;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m18962l() {
        for (ze9 ze9Var : this.f55724b) {
            if (ze9Var.f71465b == SpecialEffectsController$Operation$LifecycleImpact.ADDING) {
                View viewM2092T = ze9Var.f71466c.m2092T();
                af9 af9Var = SpecialEffectsController$Operation$State.Companion;
                int visibility = viewM2092T.getVisibility();
                af9Var.getClass();
                ze9Var.m25574d(af9.m350b(visibility), SpecialEffectsController$Operation$LifecycleImpact.NONE);
            }
        }
    }
}
