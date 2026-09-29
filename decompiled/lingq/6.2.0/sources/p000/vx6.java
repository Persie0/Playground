package p000;

import android.os.AsyncTask;
import com.iterable.iterableapi.AsyncTaskC1217m;
import com.iterable.iterableapi.C1205a;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class vx6 implements l78 {
    /* JADX INFO: renamed from: e */
    public static void m23580e(JSONObject jSONObject) {
        try {
            jSONObject.put("createdAt", jSONObject.has("createdAt") ? Long.parseLong(jSONObject.getString("createdAt")) : new Date().getTime() / 1000);
        } catch (JSONException unused) {
            eh0.m11135p("OnlineRequestProcessor", "Could not add createdAt timestamp to json object");
        }
    }

    @Override // p000.l78
    /* JADX INFO: renamed from: a */
    public final void mo6963a(String str, String str2, JSONObject jSONObject, String str3, ob4 ob4Var, pb4 pb4Var) {
        m23580e(jSONObject);
        new AsyncTaskC1217m().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new C1205a(str, str2, jSONObject, "GET", str3, ob4Var, pb4Var));
    }

    @Override // p000.l78
    /* JADX INFO: renamed from: b */
    public final void mo6964b() {
    }

    @Override // p000.l78
    /* JADX INFO: renamed from: c */
    public final void mo6965c(String str, String str2, JSONObject jSONObject, String str3, ub4 ub4Var) {
        m23580e(jSONObject);
        new AsyncTaskC1217m().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new C1205a(str, str2, jSONObject, "GET", str3, ub4Var));
    }

    @Override // p000.l78
    /* JADX INFO: renamed from: d */
    public final void mo6966d(String str, String str2, JSONObject jSONObject, String str3, vb4 vb4Var, pb4 pb4Var) {
        m23580e(jSONObject);
        new AsyncTaskC1217m().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new C1205a(str, str2, jSONObject, "POST", str3, vb4Var, pb4Var));
    }
}
