package se;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p241le.C7341l;

/* JADX INFO: renamed from: se.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8994d {

    /* JADX INFO: renamed from: a */
    public final C7341l f47186a;

    public C8994d(C7341l c7341l) {
        this.f47186a = c7341l;
    }

    /* JADX INFO: renamed from: a */
    public final C8992b m17235a(JSONObject jSONObject) throws JSONException {
        InterfaceC8995e c8998h;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            c8998h = new C8991a();
        } else {
            c8998h = new C8998h();
        }
        return c8998h.mo17234a(this.f47186a, jSONObject);
    }
}
