package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ema {

    /* JADX INFO: renamed from: a */
    public static final ema f37526a = new ema();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f37527b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f37528c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final up2 f37529d = new up2(true, "com.facebook.sdk.AutoInitEnabled");

    /* JADX INFO: renamed from: e */
    public static final up2 f37530e = new up2(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* JADX INFO: renamed from: f */
    public static final up2 f37531f = new up2(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* JADX INFO: renamed from: g */
    public static final up2 f37532g = new up2(false, "auto_event_setup_enabled");

    /* JADX INFO: renamed from: h */
    public static final up2 f37533h = new up2(true, "com.facebook.sdk.MonitorEnabled");

    /* JADX INFO: renamed from: i */
    public static SharedPreferences f37534i;

    /* JADX INFO: renamed from: b */
    public static final boolean m11255b() {
        if (lp1.f49971a.contains(ema.class)) {
            return false;
        }
        try {
            f37526a.m11260e();
            return f37531f.m22852a();
        } catch (Throwable th) {
            lp1.m16420a(ema.class, th);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m11256c() {
        if (lp1.f49971a.contains(ema.class)) {
            return false;
        }
        try {
            ema emaVar = f37526a;
            emaVar.m11260e();
            return emaVar.m11258a();
        } catch (Throwable th) {
            lp1.m16420a(ema.class, th);
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Boolean m11257j() {
        String str = "";
        if (!lp1.f49971a.contains(ema.class)) {
            try {
                f37526a.m11266l();
                try {
                    SharedPreferences sharedPreferences = f37534i;
                    if (sharedPreferences == null) {
                        fa4.m11636J("userSettingPref");
                        throw null;
                    }
                    String string = sharedPreferences.getString((String) f37530e.f64166c, "");
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
                    }
                } catch (JSONException unused) {
                    sy2 sy2Var = sy2.f61585a;
                }
            } catch (Throwable th) {
                lp1.m16420a(ema.class, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11258a() {
        Set set = lp1.f49971a;
        if (set.contains(this)) {
            return false;
        }
        try {
            HashMap mapM24855c = y23.m24855c();
            if (mapM24855c != null && !mapM24855c.isEmpty()) {
                Boolean bool = (Boolean) mapM24855c.get("auto_log_app_events_enabled");
                Boolean bool2 = (Boolean) mapM24855c.get("auto_log_app_events_default");
                if (bool != null) {
                    return bool.booleanValue();
                }
                Boolean bool3 = null;
                if (!set.contains(this)) {
                    try {
                        Boolean boolM11257j = m11257j();
                        if (boolM11257j != null || (boolM11257j = m11261f()) != null) {
                            bool3 = boolM11257j;
                        }
                    } catch (Throwable th) {
                        lp1.m16420a(this, th);
                    }
                }
                if (bool3 != null) {
                    return bool3.booleanValue();
                }
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return true;
            }
            return f37530e.m22852a();
        } catch (Throwable th2) {
            lp1.m16420a(this, th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11259d() {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            up2 up2Var = f37532g;
            m11265k(up2Var);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (((Boolean) up2Var.f64167d) == null || jCurrentTimeMillis - up2Var.f64164a >= 604800000) {
                up2Var.f64167d = null;
                up2Var.f64164a = 0L;
                if (f37528c.compareAndSet(false, true)) {
                    sy2.m21768c().execute(new Runnable() { // from class: dma
                        @Override // java.lang.Runnable
                        public final void run() {
                            w23 w23VarM24862k;
                            long j = jCurrentTimeMillis;
                            if (lp1.f49971a.contains(ema.class)) {
                                return;
                            }
                            try {
                                if (ema.f37531f.m22852a() && (w23VarM24862k = y23.m24862k(sy2.m21767b(), false)) != null && w23VarM24862k.f66258g) {
                                    C3388nx c3388nxM19782l = AbstractC3489q9.m19782l(sy2.m21766a());
                                    String strM17663a = (c3388nxM19782l == null || c3388nxM19782l.m17663a() == null) ? null : c3388nxM19782l.m17663a();
                                    if (strM17663a != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("advertiser_id", strM17663a);
                                        bundle.putString("fields", "auto_event_setup_enabled");
                                        String str = mp3.f51688j;
                                        mp3 mp3VarM21068p = s46.m21068p(null, "app", null);
                                        mp3VarM21068p.f51694d = bundle;
                                        JSONObject jSONObject = mp3VarM21068p.m16982c().f56628b;
                                        if (jSONObject != null) {
                                            up2 up2Var2 = ema.f37532g;
                                            up2Var2.f64167d = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                            up2Var2.f64164a = j;
                                            ema.f37526a.m11267m(up2Var2);
                                        }
                                    }
                                }
                                ema.f37528c.set(false);
                            } catch (Throwable th) {
                                lp1.m16420a(ema.class, th);
                            }
                        }
                    });
                }
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11260e() {
        Set set = lp1.f49971a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (sy2.f61601q.get()) {
                if (f37527b.compareAndSet(false, true)) {
                    SharedPreferences sharedPreferences = sy2.m21766a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    sharedPreferences.getClass();
                    f37534i = sharedPreferences;
                    up2[] up2VarArr = {f37530e, f37531f, f37529d};
                    if (!set.contains(this)) {
                        for (int i = 0; i < 3; i++) {
                            try {
                                up2 up2Var = up2VarArr[i];
                                if (up2Var == f37532g) {
                                    m11259d();
                                } else if (((Boolean) up2Var.f64167d) == null) {
                                    m11265k(up2Var);
                                    if (((Boolean) up2Var.f64167d) == null) {
                                        m11262g(up2Var);
                                    }
                                } else {
                                    m11267m(up2Var);
                                }
                            } catch (Throwable th) {
                                lp1.m16420a(this, th);
                                m11259d();
                                m11264i();
                                m11263h();
                            }
                        }
                    }
                    m11259d();
                    m11264i();
                    m11263h();
                }
            }
        } catch (Throwable th2) {
            lp1.m16420a(this, th2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final Boolean m11261f() {
        if (!lp1.f49971a.contains(this)) {
            try {
                m11266l();
                try {
                    Context contextM21766a = sy2.m21766a();
                    ApplicationInfo applicationInfo = contextM21766a.getPackageManager().getApplicationInfo(contextM21766a.getPackageName(), 128);
                    applicationInfo.getClass();
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle != null) {
                        up2 up2Var = f37530e;
                        if (bundle.containsKey((String) up2Var.f64166c)) {
                            return Boolean.valueOf(applicationInfo.metaData.getBoolean((String) up2Var.f64166c));
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    sy2 sy2Var = sy2.f61585a;
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m11262g(up2 up2Var) {
        String str = (String) up2Var.f64166c;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            m11266l();
            try {
                Context contextM21766a = sy2.m21766a();
                ApplicationInfo applicationInfo = contextM21766a.getPackageManager().getApplicationInfo(contextM21766a.getPackageName(), 128);
                applicationInfo.getClass();
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(str)) {
                    return;
                }
                up2Var.f64167d = Boolean.valueOf(applicationInfo.metaData.getBoolean(str, up2Var.f64165b));
                return;
            } catch (PackageManager.NameNotFoundException unused) {
                sy2 sy2Var = sy2.f61585a;
                return;
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
        lp1.m16420a(this, th);
    }

    /* JADX INFO: renamed from: h */
    public final void m11263h() {
        int i;
        int i2;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            if (f37527b.get() && sy2.f61601q.get()) {
                Context contextM21766a = sy2.m21766a();
                int i3 = (f37529d.m22852a() ? 1 : 0) | ((f37530e.m22852a() ? 1 : 0) << 1) | ((f37531f.m22852a() ? 1 : 0) << 2) | ((f37533h.m22852a() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = f37534i;
                if (sharedPreferences == null) {
                    fa4.m11636J("userSettingPref");
                    throw null;
                }
                int i4 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i4 != i3) {
                    SharedPreferences sharedPreferences2 = f37534i;
                    if (sharedPreferences2 == null) {
                        fa4.m11636J("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i3).apply();
                    try {
                        ApplicationInfo applicationInfo = contextM21766a.getPackageManager().getApplicationInfo(contextM21766a.getPackageName(), 128);
                        applicationInfo.getClass();
                        if (applicationInfo.metaData != null) {
                            String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                            boolean[] zArr = {true, true, true, true};
                            i = 0;
                            i2 = 0;
                            for (int i5 = 0; i5 < 4; i5++) {
                                try {
                                    i2 |= (applicationInfo.metaData.containsKey(strArr[i5]) ? 1 : 0) << i5;
                                    i |= (applicationInfo.metaData.getBoolean(strArr[i5], zArr[i5]) ? 1 : 0) << i5;
                                } catch (PackageManager.NameNotFoundException unused) {
                                }
                            }
                        } else {
                            i = 0;
                            i2 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                    C3012fs c3012fs = new C3012fs(contextM21766a, (String) null);
                    Bundle bundle = new Bundle();
                    bundle.putInt("usage", i2);
                    bundle.putInt("initial", i);
                    bundle.putInt("previous", i4);
                    bundle.putInt("current", i3);
                    if (!((bundle.getInt("previous") & 2) != 0)) {
                        sy2 sy2Var = sy2.f61585a;
                        if (!m11256c()) {
                            return;
                        }
                    }
                    c3012fs.m12040g("fb_sdk_settings_changed", bundle);
                }
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11264i() {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            Context contextM21766a = sy2.m21766a();
            ApplicationInfo applicationInfo = contextM21766a.getPackageManager().getApplicationInfo(contextM21766a.getPackageName(), 128);
            applicationInfo.getClass();
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w("ema", "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (m11255b()) {
                    return;
                }
                Log.w("ema", "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11265k(up2 up2Var) {
        String str = "";
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            m11266l();
            try {
                SharedPreferences sharedPreferences = f37534i;
                if (sharedPreferences == null) {
                    fa4.m11636J("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString((String) up2Var.f64166c, "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    up2Var.f64167d = Boolean.valueOf(jSONObject.getBoolean("value"));
                    up2Var.f64164a = jSONObject.getLong("last_timestamp");
                }
            } catch (JSONException unused) {
                sy2 sy2Var = sy2.f61585a;
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m11266l() {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            if (f37527b.get()) {
            } else {
                throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m11267m(up2 up2Var) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            m11266l();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", (Boolean) up2Var.f64167d);
                jSONObject.put("last_timestamp", up2Var.f64164a);
                SharedPreferences sharedPreferences = f37534i;
                if (sharedPreferences == null) {
                    fa4.m11636J("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString((String) up2Var.f64166c, jSONObject.toString()).apply();
                m11263h();
            } catch (Exception unused) {
                sy2 sy2Var = sy2.f61585a;
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
