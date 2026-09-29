package p000;

import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle$Event;
import java.util.List;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jc1 implements rb5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45394a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f45395b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f45396c;

    public /* synthetic */ jc1(int i, Object obj, Object obj2) {
        this.f45394a = i;
        this.f45395b = obj;
        this.f45396c = obj2;
    }

    @Override // p000.rb5
    /* JADX INFO: renamed from: c */
    public final void mo399c(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
        int i = this.f45394a;
        Object obj = this.f45396c;
        Object obj2 = this.f45395b;
        switch (i) {
            case 0:
                pr6 pr6Var = (pr6) obj2;
                uc1 uc1Var = (uc1) obj;
                if (lifecycle$Event == Lifecycle$Event.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = uc1Var.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    pr6Var.m19464c(onBackInvokedDispatcher);
                }
                break;
            default:
                qe3 qe3Var = (qe3) obj2;
                y76 y76Var = (y76) obj;
                if (lifecycle$Event == Lifecycle$Event.ON_RESUME && ((List) ((C3244l) qe3Var.m15273b().f35168e.f9311a).getValue()).contains(y76Var)) {
                    if (qe3.m19892n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + y76Var + " due to fragment " + ub5Var + " view lifecycle reaching RESUMED");
                    }
                    qe3Var.m15273b().m10155c(y76Var);
                }
                if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                    if (qe3.m19892n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + y76Var + " due to fragment " + ub5Var + " view lifecycle reaching DESTROYED");
                    }
                    qe3Var.m15273b().m10155c(y76Var);
                }
                break;
        }
    }
}
