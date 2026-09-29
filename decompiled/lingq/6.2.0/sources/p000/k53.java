package p000;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k53 implements fn9, bm1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ l53 f46724a;

    public /* synthetic */ k53(l53 l53Var) {
        this.f46724a = l53Var;
    }

    @Override // p000.bm1
    /* JADX INFO: renamed from: e */
    public Object mo393e(Task task) {
        boolean z;
        l53 l53Var = this.f46724a;
        l53Var.getClass();
        if (task.mo5971m()) {
            qg1 qg1Var = l53Var.f49074c;
            synchronized (qg1Var) {
                qg1Var.f57745c = Tasks.m5975c(null);
            }
            fh1 fh1Var = qg1Var.f57744b;
            synchronized (fh1Var) {
                fh1Var.f39101a.deleteFile(fh1Var.f39102b);
            }
            sg1 sg1Var = (sg1) task.mo5967i();
            if (sg1Var != null) {
                JSONArray jSONArray = sg1Var.f60808d;
                m43 m43Var = l53Var.f49072a;
                if (m43Var != null) {
                    try {
                        m43Var.m16620c(l53.m15810d(jSONArray));
                    } catch (AbtException e) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
                    } catch (JSONException e2) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
                    }
                }
                ny8 ny8Var = l53Var.f49080i;
                try {
                    h50 h50VarM12112s = ((fs6) ny8Var.f53415c).m12112s(sg1Var);
                    Iterator it = ((Set) ny8Var.f53417e).iterator();
                    while (it.hasNext()) {
                        ((Executor) ny8Var.f53416d).execute(new ks6(2, (vp1) it.next(), h50VarM12112s));
                    }
                } catch (FirebaseRemoteConfigException e3) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e3);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // p000.fn9
    /* JADX INFO: renamed from: k */
    public Task mo91k(Object obj) {
        l53 l53Var = this.f46724a;
        Task taskM19940b = l53Var.f49074c.m19940b();
        Task taskM19940b2 = l53Var.f49075d.m19940b();
        return Tasks.m5977e(taskM19940b, taskM19940b2).mo5965g(l53Var.f49073b, new ar1(l53Var, taskM19940b, taskM19940b2, 1));
    }
}
