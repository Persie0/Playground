package p000;

import android.util.Log;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.Lifecycle$State;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final class se3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d86 f60733a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe3 f60734b;

    public se3(d86 d86Var, qe3 qe3Var) {
        this.f60733a = d86Var;
        this.f60734b = qe3Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m21306a(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, boolean z) {
        Object obj;
        Object objPrevious;
        qe3 qe3Var = this.f60734b;
        ArrayList arrayList = qe3Var.f57639g;
        abstractComponentCallbacksC0635c.getClass();
        d86 d86Var = this.f60733a;
        ArrayList arrayListM22603U0 = u91.m22603U0((Iterable) ((C3244l) d86Var.f35169f.f9311a).getValue(), (Collection) ((C3244l) d86Var.f35168e.f9311a).getValue());
        ListIterator listIterator = arrayListM22603U0.listIterator(arrayListM22603U0.size());
        do {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!fa4.m11650l(((y76) objPrevious).f69413f, abstractComponentCallbacksC0635c.f5680V));
        y76 y76Var = (y76) objPrevious;
        boolean z2 = z && arrayList.isEmpty() && abstractComponentCallbacksC0635c.f5707l;
        for (Object obj2 : arrayList) {
            if (fa4.m11650l(((Pair) obj2).f47623a, abstractComponentCallbacksC0635c.f5680V)) {
                obj = obj2;
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            arrayList.remove(pair);
        }
        if (!z2 && qe3.m19892n()) {
            Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + abstractComponentCallbacksC0635c + " associated with entry " + y76Var);
        }
        boolean z3 = pair != null && ((Boolean) pair.f47624b).booleanValue();
        if (!z && !z3 && y76Var == null) {
            C3386nv.m17624j(wq1.m24117m("The fragment ", abstractComponentCallbacksC0635c, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
            return;
        }
        if (y76Var != null) {
            qe3Var.m19893l(abstractComponentCallbacksC0635c, y76Var, d86Var);
            if (z2) {
                if (qe3.m19892n()) {
                    Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + abstractComponentCallbacksC0635c + " popping associated entry " + y76Var + " via system back");
                }
                d86Var.m10158f(y76Var, false);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21307b(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, boolean z) {
        Object objPrevious;
        abstractComponentCallbacksC0635c.getClass();
        if (z) {
            d86 d86Var = this.f60733a;
            List list = (List) ((C3244l) d86Var.f35168e.f9311a).getValue();
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!fa4.m11650l(((y76) objPrevious).f69413f, abstractComponentCallbacksC0635c.f5680V));
            y76 y76Var = (y76) objPrevious;
            if (qe3.m19892n()) {
                Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + abstractComponentCallbacksC0635c + " associated with entry " + y76Var);
            }
            if (y76Var != null) {
                C3244l c3244l = d86Var.f35166c;
                c3244l.m15572j(null, AbstractC3489q9.m19765B((Set) c3244l.getValue(), y76Var));
                h86 h86Var = d86Var.f35171h.f63760b;
                h86Var.getClass();
                if (h86Var.f41951f.contains(y76Var)) {
                    y76Var.m24978a(Lifecycle$State.STARTED);
                } else {
                    C3386nv.m17633t("Cannot transition entry that is not in the back stack");
                }
            }
        }
    }
}
