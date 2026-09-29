package p000;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler$FetchType;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lg1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49618a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f49619b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mg1 f49620c;

    public lg1(mg1 mg1Var, int i, long j) {
        this.f49620c = mg1Var;
        this.f49618a = i;
        this.f49619b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final mg1 mg1Var = this.f49620c;
        int i = this.f49618a;
        final long j = this.f49619b;
        synchronized (mg1Var) {
            final int i2 = i - 1;
            final Task taskM24491c = mg1Var.f51270c.m24491c(ConfigFetchHandler$FetchType.REALTIME, 3 - i2);
            final Task taskM19940b = mg1Var.f51271d.m19940b();
            Tasks.m5977e(taskM24491c, taskM19940b).mo5965g(mg1Var.f51273f, new bm1() { // from class: kg1
                @Override // p000.bm1
                /* JADX INFO: renamed from: e */
                public final Object mo393e(Task task) throws JSONException {
                    Boolean boolValueOf;
                    mg1 mg1Var2 = mg1Var;
                    Task task2 = taskM24491c;
                    Task task3 = taskM19940b;
                    long j2 = j;
                    int i3 = i2;
                    if (!task2.mo5971m()) {
                        return Tasks.m5974b(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", (Throwable) task2.mo5966h()));
                    }
                    if (!task3.mo5971m()) {
                        return Tasks.m5974b(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", (Throwable) task3.mo5966h()));
                    }
                    wg1 wg1Var = (wg1) task2.mo5967i();
                    sg1 sg1Var = (sg1) task3.mo5967i();
                    sg1 sg1Var2 = wg1Var.f66792b;
                    if (sg1Var2 != null) {
                        boolValueOf = Boolean.valueOf(sg1Var2.f60810f >= j2);
                    } else {
                        boolValueOf = Boolean.valueOf(wg1Var.f66791a == 1);
                    }
                    if (!boolValueOf.booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        mg1Var2.m16819a(i3, j2);
                        return Tasks.m5975c(null);
                    }
                    if (wg1Var.f66792b == null) {
                        Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return Tasks.m5975c(null);
                    }
                    if (sg1Var == null) {
                        rg1 rg1VarM21346d = sg1.m21346d();
                        sg1Var = new sg1((JSONObject) rg1VarM21346d.f59229b, (Date) rg1VarM21346d.f59231d, (JSONArray) rg1VarM21346d.f59232e, (JSONObject) rg1VarM21346d.f59230c, rg1VarM21346d.f59228a, (JSONArray) rg1VarM21346d.f59233f);
                    }
                    sg1 sg1Var3 = wg1Var.f66792b;
                    JSONObject jSONObject = sg1Var.f60809e;
                    JSONObject jSONObject2 = sg1Var3.f60805a;
                    JSONObject jSONObject3 = sg1Var3.f60806b;
                    JSONObject jSONObject4 = sg1Var3.f60809e;
                    JSONObject jSONObject5 = sg1.m21345a(new JSONObject(jSONObject2.toString())).f60806b;
                    HashMap mapM21348c = sg1Var.m21348c();
                    HashMap mapM21348c2 = sg1Var3.m21348c();
                    HashMap mapM21347b = sg1Var.m21347b();
                    HashMap mapM21347b2 = sg1Var3.m21347b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject6 = sg1Var.f60806b;
                    Iterator<String> itKeys = jSONObject6.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                            hashSet.add(next);
                        } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                            hashSet.add(next);
                        } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                            hashSet.add(next);
                        } else if (mapM21348c.containsKey(next) != mapM21348c2.containsKey(next)) {
                            hashSet.add(next);
                        } else if (mapM21348c.containsKey(next) && mapM21348c2.containsKey(next) && !((Map) mapM21348c.get(next)).equals(mapM21348c2.get(next))) {
                            hashSet.add(next);
                        } else if (mapM21347b.containsKey(next) != mapM21347b2.containsKey(next)) {
                            hashSet.add(next);
                        } else if (mapM21347b2.containsKey(next) && mapM21347b.containsKey(next) && !((JSONObject) mapM21347b2.get(next)).toString().equals(((JSONObject) mapM21347b.get(next)).toString())) {
                            hashSet.add(next);
                        } else {
                            jSONObject5.remove(next);
                        }
                    }
                    Iterator<String> itKeys2 = jSONObject5.keys();
                    while (itKeys2.hasNext()) {
                        hashSet.add(itKeys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                        return Tasks.m5975c(null);
                    }
                    synchronized (mg1Var2) {
                        Iterator it = mg1Var2.f51268a.iterator();
                        while (it.hasNext()) {
                            ((bh1) it.next()).getClass();
                        }
                    }
                    return Tasks.m5975c(null);
                }
            });
        }
    }
}
