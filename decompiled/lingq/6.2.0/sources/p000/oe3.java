package p000;

import android.util.Log;
import androidx.compose.p002ui.platform.AbstractC0389a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oe3 implements rb5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54239a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f54240b;

    public /* synthetic */ oe3(Object obj, int i) {
        this.f54239a = i;
        this.f54240b = obj;
    }

    @Override // p000.rb5
    /* JADX INFO: renamed from: c */
    public final void mo399c(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
        int i = this.f54239a;
        Object obj = this.f54240b;
        switch (i) {
            case 0:
                qe3 qe3Var = (qe3) obj;
                if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                    AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = (AbstractComponentCallbacksC0635c) ub5Var;
                    Object obj2 = null;
                    for (Object obj3 : (Iterable) ((C3244l) qe3Var.m15273b().f35169f.f9311a).getValue()) {
                        if (fa4.m11650l(((y76) obj3).f69413f, abstractComponentCallbacksC0635c.f5680V)) {
                            obj2 = obj3;
                        }
                    }
                    y76 y76Var = (y76) obj2;
                    if (y76Var != null) {
                        if (qe3.m19892n()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + y76Var + " due to fragment " + ub5Var + " lifecycle reaching DESTROYED");
                        }
                        qe3Var.m15273b().m10155c(y76Var);
                    }
                }
                break;
            case 1:
                h86 h86Var = (h86) obj;
                h86Var.f41961p = lifecycle$Event.getTargetState();
                if (h86Var.f41948c != null) {
                    for (y76 y76Var2 : u91.m22624p1(h86Var.f41951f)) {
                        y76Var2.getClass();
                        a86 a86Var = y76Var2.f69415h;
                        a86Var.getClass();
                        y76 y76Var3 = a86Var.f338a;
                        Lifecycle$State targetState = lifecycle$Event.getTargetState();
                        targetState.getClass();
                        y76Var3.f69411d = targetState;
                        a86Var.f341d = lifecycle$Event.getTargetState();
                        a86Var.m171b();
                    }
                }
                break;
            case 2:
                lb4 lb4Var = (lb4) obj;
                if (lifecycle$Event == Lifecycle$Event.ON_START) {
                    lb4Var.f49397c = true;
                } else if (lifecycle$Event == Lifecycle$Event.ON_STOP) {
                    lb4Var.f49397c = false;
                }
                break;
            default:
                AbstractC0389a abstractC0389a = (AbstractC0389a) obj;
                if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                    abstractC0389a.m1711e();
                }
                break;
        }
    }
}
