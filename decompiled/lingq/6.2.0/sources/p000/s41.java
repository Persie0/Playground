package p000;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.facebook.HttpMethod;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s41 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60263a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f60264b;

    public /* synthetic */ s41(String str, int i) {
        this.f60263a = i;
        this.f60264b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Locale locale = null;
        switch (this.f60263a) {
            case 0:
                String str = this.f60264b;
                if (lp1.f49971a.contains(t41.class)) {
                    return;
                }
                try {
                    Bundle bundle = new Bundle();
                    C3388nx c3388nxM19782l = AbstractC3489q9.m19782l(sy2.m21766a());
                    JSONArray jSONArray = new JSONArray();
                    String str2 = Build.MODEL;
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONArray.put(str2);
                    if ((c3388nxM19782l != null ? c3388nxM19782l.m17663a() : null) != null) {
                        jSONArray.put(c3388nxM19782l.m17663a());
                    } else {
                        jSONArray.put("");
                    }
                    jSONArray.put("0");
                    jSONArray.put(AbstractC3695vr.m23512w() ? "1" : "0");
                    try {
                        locale = sy2.m21766a().getResources().getConfiguration().locale;
                        break;
                    } catch (Exception unused) {
                    }
                    if (locale == null) {
                        locale = Locale.getDefault();
                        locale.getClass();
                    }
                    jSONArray.put(locale.getLanguage() + '_' + locale.getCountry());
                    String string = jSONArray.toString();
                    string.getClass();
                    bundle.putString("device_session_id", t41.m21837a());
                    bundle.putString("extinfo", string);
                    String str3 = mp3.f51688j;
                    boolean z = true;
                    JSONObject jSONObject = new mp3(null, String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1)), bundle, HttpMethod.POST, null).m16982c().f56628b;
                    AtomicBoolean atomicBoolean = t41.f61845g;
                    if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                        z = false;
                    }
                    atomicBoolean.set(z);
                    if (atomicBoolean.get()) {
                        ota otaVar = t41.f61842d;
                        if (otaVar != null) {
                            otaVar.m18510c();
                        }
                    } else {
                        t41.f61843e = null;
                    }
                    t41.f61846h = false;
                    return;
                } catch (Throwable th) {
                    lp1.m16420a(t41.class, th);
                    return;
                }
            default:
                String str4 = this.f60264b;
                if (lp1.f49971a.contains(vja.class)) {
                    return;
                }
                try {
                    if (!vja.f65511c.get()) {
                        vja.f65509a.m23352b();
                    }
                    SharedPreferences sharedPreferences = vja.f65510b;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putString("com.facebook.appevents.UserDataStore.internalUserData", str4).apply();
                        return;
                    } else {
                        fa4.m11636J("sharedPreferences");
                        throw null;
                    }
                } catch (Throwable th2) {
                    lp1.m16420a(vja.class, th2);
                    return;
                }
        }
    }
}
