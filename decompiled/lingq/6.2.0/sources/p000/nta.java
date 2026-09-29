package p000;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class nta extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ota f53241a;

    public nta(ota otaVar) {
        this.f53241a = otaVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        try {
            boolean zContains = lp1.f49971a.contains(ota.class);
            Handler handler = null;
            ota otaVar = this.f53241a;
            if (zContains) {
                weakReference = null;
            } else {
                try {
                    weakReference = otaVar.f54981b;
                } catch (Throwable th) {
                    lp1.m16420a(ota.class, th);
                    weakReference = null;
                }
            }
            Activity activity = (Activity) weakReference.get();
            View viewM23508s = AbstractC3695vr.m23508s(activity);
            if (activity != null && viewM23508s != null) {
                String simpleName = activity.getClass().getSimpleName();
                t41 t41Var = t41.f61839a;
                boolean z = false;
                if (!lp1.f49971a.contains(t41.class)) {
                    try {
                        z = t41.f61845g.get();
                    } catch (Throwable th2) {
                        lp1.m16420a(t41.class, th2);
                    }
                }
                if (z) {
                    FutureTask futureTask = new FutureTask(new z06(viewM23508s));
                    if (!lp1.f49971a.contains(ota.class)) {
                        try {
                            handler = otaVar.f54980a;
                        } catch (Throwable th3) {
                            lp1.m16420a(ota.class, th3);
                        }
                    }
                    handler.post(futureTask);
                    String str = "";
                    try {
                        str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                    } catch (Exception e) {
                        Log.e(ota.m18508a(), "Failed to take screenshot.", e);
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("screenname", simpleName);
                        jSONObject.put("screenshot", str);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(mta.m17037d(viewM23508s));
                        jSONObject.put("view", jSONArray);
                    } catch (JSONException unused) {
                        Log.e(ota.m18508a(), "Failed to create JSONObject");
                    }
                    String string = jSONObject.toString();
                    string.getClass();
                    Set set = lp1.f49971a;
                    if (set.contains(ota.class)) {
                        return;
                    }
                    try {
                        if (set.contains(otaVar)) {
                            return;
                        }
                        try {
                            sy2.m21768c().execute(new mv5(17, string, otaVar));
                        } catch (Throwable th4) {
                            lp1.m16420a(otaVar, th4);
                        }
                    } catch (Throwable th5) {
                        lp1.m16420a(ota.class, th5);
                    }
                }
            }
        } catch (Exception e2) {
            Log.e(ota.m18508a(), "UI Component tree indexing failure!", e2);
        }
    }
}
