package p000;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.gps.ara.C0923a;
import com.facebook.internal.FeatureManager$Feature;
import com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u23 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63270a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f63271b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f63272c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f63273d;

    public /* synthetic */ u23(Context context, String str, String str2) {
        this.f63271b = context;
        this.f63272c = str;
        this.f63273d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        switch (this.f63270a) {
            case 0:
                String str = this.f63272c;
                Context context = this.f63271b;
                String str2 = this.f63273d;
                v23 v23Var = v23.f64723a;
                JSONObject jSONObjectM23053a = v23.m23053a();
                if (jSONObjectM23053a.length() != 0) {
                    v23.m23056e(str, jSONObjectM23053a);
                    context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, jSONObjectM23053a.toString()).apply();
                    v23.f64727e = Long.valueOf(System.currentTimeMillis());
                }
                v23.m23057f();
                v23.f64724b.set(false);
                return;
            default:
                Context context2 = this.f63271b;
                String str3 = this.f63272c;
                String str4 = this.f63273d;
                y23 y23Var = y23.f69121a;
                SharedPreferences sharedPreferences = context2.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                w23 w23VarM24857e = null;
                String string = sharedPreferences.getString(str3, null);
                if (!bna.m3945d0(string)) {
                    if (string == null) {
                        C3386nv.m17633t("Required value was null.");
                        return;
                    }
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                        sy2 sy2Var = sy2.f61585a;
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        w23VarM24857e = y23.m24857e(str4, jSONObject);
                    }
                    break;
                }
                JSONObject jSONObjectM24853a = y23.m24853a();
                y23.m24857e(str4, jSONObjectM24853a);
                sharedPreferences.edit().putString(str3, jSONObjectM24853a.toString()).apply();
                if (w23VarM24857e != null) {
                    String str5 = w23VarM24857e.f66260i;
                    if (!y23.f69126f && str5.length() > 0) {
                        y23.f69126f = true;
                        Log.w("y23", str5);
                    }
                }
                v23 v23Var2 = v23.f64723a;
                JSONObject jSONObjectM23053a2 = v23.m23053a();
                sy2.m21766a().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str4}, 1)), jSONObjectM23053a2.toString()).apply();
                v23.m23056e(str4, jSONObjectM23053a2);
                m58 m58Var = c60.f9605a;
                Context contextM21766a = sy2.m21766a();
                String strM21767b = sy2.m21767b();
                if (ema.m11256c()) {
                    if (contextM21766a instanceof Application) {
                        Application application = (Application) contextM21766a;
                        String str6 = C3012fs.f39540c;
                        if (!sy2.f61601q.get()) {
                            throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
                        }
                        if (!AbstractC3609tf.f62210c) {
                            if (C3012fs.m12035b() == null) {
                                iy5.m14196k();
                            }
                            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM12035b = C3012fs.m12035b();
                            if (scheduledThreadPoolExecutorM12035b == null) {
                                C3386nv.m17633t("Required value was null.");
                                return;
                            }
                            scheduledThreadPoolExecutorM12035b.execute(new RunnableC3637u6(2));
                        }
                        vja vjaVar = vja.f65509a;
                        if (!lp1.f49971a.contains(vja.class)) {
                            try {
                                if (!vja.f65511c.get()) {
                                    vja.f65509a.m23352b();
                                    break;
                                }
                            } catch (Throwable th) {
                                lp1.m16420a(vja.class, th);
                            }
                        }
                        Set set = lp1.f49971a;
                        if (!set.contains(sy2.class)) {
                            try {
                                Context applicationContext = application.getApplicationContext();
                                if (applicationContext != null) {
                                    if (!v23.m23054b("app_events_killswitch", sy2.m21767b(), false)) {
                                        sy2.m21768c().execute(new RunnableC3470pr(14, applicationContext, strM21767b));
                                    }
                                    if (p13.m18852b(FeatureManager$Feature.OnDeviceEventProcessing) && xr6.m24659a() && !set.contains(xr6.class)) {
                                        try {
                                            sy2.m21768c().execute(new mv5(3, sy2.m21766a(), strM21767b));
                                        } catch (Throwable th2) {
                                            lp1.m16420a(xr6.class, th2);
                                        }
                                    }
                                    break;
                                }
                            } catch (Throwable th3) {
                                lp1.m16420a(sy2.class, th3);
                            }
                        }
                        AbstractC3785y6.m24950c(application, strM21767b);
                        if (p13.m18852b(FeatureManager$Feature.GPSPACAProcessing)) {
                            f17.f38243a.m11497b(strM21767b);
                        }
                        if (p13.m18852b(FeatureManager$Feature.GPSARATriggers)) {
                            C0923a.f11395a.m5189d(strM21767b, new AppEvent("unknown", "MOBILE_INSTALL_EVENT", null, null, false, AbstractC3785y6.f69348k == 0, AbstractC3785y6.m24949b(), null));
                        }
                    } else {
                        Log.w("c60", "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
                    }
                }
                y23.f69124d.set(y23.f69123c.containsKey(str4) ? FetchedAppSettingsManager$FetchAppSettingState.SUCCESS : FetchedAppSettingsManager$FetchAppSettingState.ERROR);
                y23Var.m24863j();
                return;
        }
    }

    public /* synthetic */ u23(String str, Context context, String str2) {
        this.f63272c = str;
        this.f63271b = context;
        this.f63273d = str2;
    }
}
