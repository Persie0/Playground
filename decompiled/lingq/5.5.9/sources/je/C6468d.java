package je;

import android.os.Bundle;
import android.util.Log;
import ke.InterfaceC6663a;
import ke.InterfaceC6664b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: je.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6468d implements InterfaceC6466b, InterfaceC6664b {

    /* JADX INFO: renamed from: a */
    public InterfaceC6663a f37040a;

    /* JADX INFO: renamed from: c */
    public static String m13076c(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // je.InterfaceC6466b
    /* JADX INFO: renamed from: a */
    public final void mo13075a(Bundle bundle, String str) {
        InterfaceC6663a interfaceC6663a = this.f37040a;
        if (interfaceC6663a != null) {
            try {
                interfaceC6663a.mo13288a("$A$:" + m13076c(bundle, str));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // ke.InterfaceC6664b
    /* JADX INFO: renamed from: b */
    public final void mo11739b(InterfaceC6663a interfaceC6663a) {
        this.f37040a = interfaceC6663a;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }
}
