package p291o7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdkNotInitializedException;
import com.facebook.GraphRequest;
import com.facebook.internal.FetchedAppSettingsManager;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5055a;
import p067d8.C5074n;
import p067d8.C5086z;
import p173i8.C6205a;
import p317p7.C8201h;

/* JADX INFO: renamed from: o7.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7993c0 {

    /* JADX INFO: renamed from: a */
    public static final C7993c0 f43496a = new C7993c0();

    /* JADX INFO: renamed from: b */
    public static final String f43497b = C7993c0.class.getName();

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f43498c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f43499d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public static final a f43500e = new a("com.facebook.sdk.AutoInitEnabled", true);

    /* JADX INFO: renamed from: f */
    public static final a f43501f = new a("com.facebook.sdk.AutoLogAppEventsEnabled", true);

    /* JADX INFO: renamed from: g */
    public static final a f43502g = new a("com.facebook.sdk.AdvertiserIDCollectionEnabled", true);

    /* JADX INFO: renamed from: h */
    public static final a f43503h = new a("auto_event_setup_enabled", false);

    /* JADX INFO: renamed from: i */
    public static final a f43504i = new a("com.facebook.sdk.MonitorEnabled", true);

    /* JADX INFO: renamed from: j */
    public static SharedPreferences f43505j;

    /* JADX INFO: renamed from: o7.c0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final boolean f43506a;

        /* JADX INFO: renamed from: b */
        public final String f43507b;

        /* JADX INFO: renamed from: c */
        public Boolean f43508c;

        /* JADX INFO: renamed from: d */
        public long f43509d;

        public a(String str, boolean z10) {
            this.f43506a = z10;
            this.f43507b = str;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m15858a() {
            Boolean bool = this.f43508c;
            return bool == null ? this.f43506a : bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m15848a() {
        if (C6205a.m12742b(C7993c0.class)) {
            return false;
        }
        try {
            f43496a.m15851d();
            return f43502g.m15858a();
        } catch (Throwable th2) {
            C6205a.m12741a(C7993c0.class, th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m15849b() {
        if (C6205a.m12742b(C7993c0.class)) {
            return false;
        }
        try {
            f43496a.m15851d();
            return f43501f.m15858a();
        } catch (Throwable th2) {
            C6205a.m12741a(C7993c0.class, th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m15850c() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            a aVar = f43503h;
            m15855h(aVar);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.f43508c == null || jCurrentTimeMillis - aVar.f43509d >= 604800000) {
                aVar.f43508c = null;
                aVar.f43509d = 0L;
                if (f43499d.compareAndSet(false, true)) {
                    C8004n.m15873c().execute(new Runnable() { // from class: o7.b0
                        @Override // java.lang.Runnable
                        public final void run() {
                            long j10 = jCurrentTimeMillis;
                            if (C6205a.m12742b(C7993c0.class)) {
                                return;
                            }
                            try {
                                if (C7993c0.f43502g.m15858a()) {
                                    FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f11550a;
                                    C5074n c5074nM6673f = FetchedAppSettingsManager.m6673f(C8004n.m15872b(), false);
                                    if (c5074nM6673f != null && c5074nM6673f.f32976j) {
                                        Context contextM15871a = C8004n.m15871a();
                                        C5055a c5055a = C5055a.f32901f;
                                        C5055a c5055aM10738a = C5055a.a.m10738a(contextM15871a);
                                        String strM10737a = (c5055aM10738a == null || c5055aM10738a.m10737a() == null) ? null : c5055aM10738a.m10737a();
                                        if (strM10737a != null) {
                                            Bundle bundle = new Bundle();
                                            bundle.putString("advertiser_id", strM10737a);
                                            bundle.putString("fields", "auto_event_setup_enabled");
                                            String str = GraphRequest.f11448j;
                                            GraphRequest graphRequestM6621g = GraphRequest.C2279c.m6621g(null, "app", null);
                                            graphRequestM6621g.f11454d = bundle;
                                            JSONObject jSONObject = graphRequestM6621g.m6606c().f43587b;
                                            if (jSONObject != null) {
                                                C7993c0.a aVar2 = C7993c0.f43503h;
                                                aVar2.f43508c = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                                aVar2.f43509d = j10;
                                                C7993c0.f43496a.m15857j(aVar2);
                                            }
                                        }
                                    }
                                }
                                C7993c0.f43499d.set(false);
                            } catch (Throwable th2) {
                                C6205a.m12741a(C7993c0.class, th2);
                            }
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15851d() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            if (C8004n.m15878h()) {
                int i10 = 0;
                if (f43498c.compareAndSet(false, true)) {
                    SharedPreferences sharedPreferences = C8004n.m15871a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    C5207g.m11110e(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
                    f43505j = sharedPreferences;
                    a[] aVarArr = {f43501f, f43502g, f43500e};
                    if (!C6205a.m12742b(this)) {
                        loop0: while (true) {
                            while (true) {
                                if (i10 >= 3) {
                                    break loop0;
                                }
                                try {
                                    a aVar = aVarArr[i10];
                                    i10++;
                                    if (aVar == f43503h) {
                                        m15850c();
                                    } else if (aVar.f43508c == null) {
                                        m15855h(aVar);
                                        if (aVar.f43508c == null) {
                                            m15852e(aVar);
                                        }
                                    } else {
                                        m15857j(aVar);
                                    }
                                } catch (Throwable th2) {
                                    C6205a.m12741a(this, th2);
                                    m15850c();
                                    m15854g();
                                    m15853f();
                                }
                            }
                        }
                    }
                    m15850c();
                    m15854g();
                    m15853f();
                }
            }
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m15852e(a aVar) {
        String str = aVar.f43507b;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            m15856i();
            try {
                Context contextM15871a = C8004n.m15871a();
                ApplicationInfo applicationInfo = contextM15871a.getPackageManager().getApplicationInfo(contextM15871a.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH);
                C5207g.m11110e(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null && bundle.containsKey(str)) {
                    aVar.f43508c = Boolean.valueOf(applicationInfo.metaData.getBoolean(str, aVar.f43506a));
                }
            } catch (PackageManager.NameNotFoundException e10) {
                C5086z c5086z = C5086z.f33015a;
                C5086z.m10806E(f43497b, e10);
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15853f() {
        int i10;
        int i11;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            if (f43498c.get() && C8004n.m15878h()) {
                Context contextM15871a = C8004n.m15871a();
                int i12 = ((f43500e.m15858a() ? 1 : 0) << 0) | 0 | ((f43501f.m15858a() ? 1 : 0) << 1) | ((f43502g.m15858a() ? 1 : 0) << 2) | ((f43504i.m15858a() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = f43505j;
                if (sharedPreferences == null) {
                    C5207g.m11117l("userSettingPref");
                    throw null;
                }
                int i13 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i13 != i12) {
                    SharedPreferences sharedPreferences2 = f43505j;
                    if (sharedPreferences2 == null) {
                        C5207g.m11117l("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i12).apply();
                    try {
                        ApplicationInfo applicationInfo = contextM15871a.getPackageManager().getApplicationInfo(contextM15871a.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH);
                        C5207g.m11110e(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                        if (applicationInfo.metaData != null) {
                            String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                            boolean[] zArr = {true, true, true, true};
                            int i14 = 0;
                            i10 = 0;
                            i11 = 0;
                            while (true) {
                                int i15 = i14 + 1;
                                try {
                                    i10 |= (applicationInfo.metaData.containsKey(strArr[i14]) ? 1 : 0) << i14;
                                    i11 |= (applicationInfo.metaData.getBoolean(strArr[i14], zArr[i14]) ? 1 : 0) << i14;
                                    if (i15 > 3) {
                                        break;
                                    } else {
                                        i14 = i15;
                                    }
                                } catch (PackageManager.NameNotFoundException unused) {
                                }
                            }
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                    C8201h c8201h = new C8201h(contextM15871a, (String) null);
                    Bundle bundle = new Bundle();
                    bundle.putInt("usage", i10);
                    bundle.putInt("initial", i11);
                    bundle.putInt("previous", i13);
                    bundle.putInt("current", i12);
                    if (!((bundle.getInt("previous") & 2) != 0)) {
                        C8004n c8004n = C8004n.f43550a;
                        if (!m15849b()) {
                            return;
                        }
                    }
                    c8201h.m16334f("fb_sdk_settings_changed", bundle);
                }
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m15854g() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            Context contextM15871a = C8004n.m15871a();
            ApplicationInfo applicationInfo = contextM15871a.getPackageManager().getApplicationInfo(contextM15871a.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH);
            C5207g.m11110e(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                boolean zContainsKey = bundle.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled");
                String str = f43497b;
                if (!zContainsKey) {
                    Log.w(str, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(str, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (m15848a()) {
                    return;
                }
                Log.w(str, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m15855h(a aVar) {
        String str = "";
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            m15856i();
            try {
                SharedPreferences sharedPreferences = f43505j;
                if (sharedPreferences == null) {
                    C5207g.m11117l("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(aVar.f43507b, "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    aVar.f43508c = Boolean.valueOf(jSONObject.getBoolean("value"));
                    aVar.f43509d = jSONObject.getLong("last_timestamp");
                }
            } catch (JSONException e10) {
                C5086z c5086z = C5086z.f33015a;
                C5086z.m10806E(f43497b, e10);
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m15856i() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            if (f43498c.get()) {
            } else {
                throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m15857j(a aVar) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            m15856i();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.f43508c);
                jSONObject.put("last_timestamp", aVar.f43509d);
                SharedPreferences sharedPreferences = f43505j;
                if (sharedPreferences == null) {
                    C5207g.m11117l("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString(aVar.f43507b, jSONObject.toString()).apply();
                m15853f();
            } catch (Exception e10) {
                C5086z c5086z = C5086z.f33015a;
                C5086z.m10806E(f43497b, e10);
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
