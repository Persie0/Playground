package p527z7;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.media.session.C0166e;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.FacebookException;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import dm.C5207g;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.collections.EmptyList;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5073m;
import p067d8.C5074n;
import p067d8.C5086z;
import p173i8.C6205a;
import p286o2.RunnableC7907g;
import p291o7.C7993c0;
import p291o7.C8004n;
import p317p7.C8195b;
import p317p7.C8201h;
import p317p7.C8206m;
import p317p7.RunnableC8194a;
import p476x7.C10105d;
import p476x7.C10107f;

/* JADX INFO: renamed from: z7.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC10453a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52304a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f52305b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f52306c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f52307d;

    public /* synthetic */ RunnableC10453a(int i10, Context context, String str, String str2) {
        this.f52304a = i10;
        this.f52306c = context;
        this.f52305b = str;
        this.f52307d = str2;
    }

    public /* synthetic */ RunnableC10453a(Context context, String str, String str2) {
        this.f52304a = 1;
        this.f52305b = str;
        this.f52306c = context;
        this.f52307d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x012b  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        int i10 = 0;
        switch (this.f52304a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                Context context = this.f52306c;
                String str = this.f52305b;
                String str2 = this.f52307d;
                if (C6205a.m12742b(C10454b.class)) {
                    return;
                }
                try {
                    C5207g.m11111f(context, "$context");
                    SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                    String strM11116k = C5207g.m11116k("pingForOnDevice", str2);
                    if (sharedPreferences.getLong(strM11116k, 0L) == 0) {
                        RemoteServiceWrapper remoteServiceWrapper = RemoteServiceWrapper.f11538a;
                        if (!C6205a.m12742b(RemoteServiceWrapper.class)) {
                            try {
                                C5207g.m11111f(str2, "applicationId");
                                RemoteServiceWrapper.f11538a.m6661b(RemoteServiceWrapper.EventType.MOBILE_APP_INSTALL, str2, EmptyList.f38032a);
                            } catch (Throwable th2) {
                                C6205a.m12741a(RemoteServiceWrapper.class, th2);
                            }
                            break;
                        }
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putLong(strM11116k, System.currentTimeMillis());
                        editorEdit.apply();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    C6205a.m12741a(C10454b.class, th3);
                    return;
                }
            case 1:
                C5073m c5073m = C5073m.f32961a;
                String str3 = this.f52305b;
                C5207g.m11111f(str3, "$applicationId");
                Context context2 = this.f52306c;
                C5207g.m11111f(context2, "$context");
                String str4 = this.f52307d;
                C5207g.m11111f(str4, "$gateKeepersKey");
                C5073m.f32961a.getClass();
                JSONObject jSONObjectM10769a = C5073m.m10769a();
                if (jSONObjectM10769a.length() != 0) {
                    C5073m.m10772d(str3, jSONObjectM10769a);
                    context2.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str4, jSONObjectM10769a.toString()).apply();
                    C5073m.f32965e = Long.valueOf(System.currentTimeMillis());
                }
                C5073m.m10773e();
                C5073m.f32962b.set(false);
                return;
            default:
                Context context3 = this.f52306c;
                String str5 = this.f52305b;
                String str6 = this.f52307d;
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f11550a;
                C5207g.m11111f(context3, "$context");
                C5207g.m11111f(str5, "$settingsKey");
                C5207g.m11111f(str6, "$applicationId");
                SharedPreferences sharedPreferences2 = context3.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                C5074n c5074nM6672d = null;
                String string = sharedPreferences2.getString(str5, null);
                if (!C5086z.m10802A(string)) {
                    if (string == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException e10) {
                        C5086z.m10806E("FacebookSDK", e10);
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        FetchedAppSettingsManager.f11550a.getClass();
                        c5074nM6672d = FetchedAppSettingsManager.m6672d(str6, jSONObject);
                    }
                    break;
                }
                FetchedAppSettingsManager.f11550a.getClass();
                JSONObject jSONObjectM6669a = FetchedAppSettingsManager.m6669a();
                FetchedAppSettingsManager.m6672d(str6, jSONObjectM6669a);
                sharedPreferences2.edit().putString(str5, jSONObjectM6669a.toString()).apply();
                if (c5074nM6672d != null) {
                    String str7 = c5074nM6672d.f32978l;
                    if (!FetchedAppSettingsManager.f11556g && str7 != null && str7.length() > 0) {
                        FetchedAppSettingsManager.f11556g = true;
                        Log.w(FetchedAppSettingsManager.f11551b, str7);
                    }
                }
                C5073m.f32961a.getClass();
                JSONObject jSONObjectM10769a2 = C5073m.m10769a();
                C8004n.m15871a().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(C0166e.m770q(new Object[]{str6}, 1, "com.facebook.internal.APP_GATEKEEPERS.%s", "java.lang.String.format(format, *args)"), jSONObjectM10769a2.toString()).apply();
                C5073m.m10772d(str6, jSONObjectM10769a2);
                C10107f c10107f = C10107f.f51262a;
                Context contextM15871a = C8004n.m15871a();
                String strM15872b = C8004n.m15872b();
                if (C7993c0.m15849b()) {
                    if (contextM15871a instanceof Application) {
                        Application application = (Application) contextM15871a;
                        String str8 = C8201h.f44393c;
                        if (!C8004n.m15878h()) {
                            throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
                        }
                        C8195b c8195b = C8195b.f44375a;
                        if (!C8195b.f44379e) {
                            if (C8201h.m16330b() == null) {
                                C8201h.a.m16339d();
                            }
                            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM16330b = C8201h.m16330b();
                            if (scheduledThreadPoolExecutorM16330b == null) {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            scheduledThreadPoolExecutorM16330b.execute(new RunnableC8194a(i10));
                        }
                        C8206m c8206m = C8206m.f44408a;
                        if (!C6205a.m12742b(C8206m.class)) {
                            try {
                                if (!C8206m.f44411d.get()) {
                                    C8206m.f44408a.m16348b();
                                    break;
                                }
                            } catch (Throwable th4) {
                                C6205a.m12741a(C8206m.class, th4);
                            }
                        }
                        C8004n c8004n = C8004n.f43550a;
                        if (!C6205a.m12742b(C8004n.class)) {
                            try {
                                C8004n.m15873c().execute(new RunnableC7907g(application.getApplicationContext(), 4, strM15872b));
                                FeatureManager featureManager = FeatureManager.f11546a;
                                if (FeatureManager.m6666c(FeatureManager.Feature.OnDeviceEventProcessing) && C10454b.m19414a()) {
                                    String str9 = "com.facebook.sdk.attributionTracking";
                                    if (!C6205a.m12742b(C10454b.class)) {
                                        try {
                                            C8004n.m15873c().execute(new RunnableC10453a(i10, C8004n.m15871a(), str9, strM15872b));
                                        } catch (Throwable th5) {
                                            C6205a.m12741a(C10454b.class, th5);
                                        }
                                    }
                                    break;
                                }
                            } catch (Throwable th6) {
                                C6205a.m12741a(C8004n.class, th6);
                            }
                        }
                        C10105d.m18961b(application, strM15872b);
                    } else {
                        Log.w(C10107f.f51263b, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
                    }
                }
                FetchedAppSettingsManager.f11554e.set(FetchedAppSettingsManager.f11553d.containsKey(str6) ? FetchedAppSettingsManager.FetchAppSettingState.SUCCESS : FetchedAppSettingsManager.FetchAppSettingState.ERROR);
                FetchedAppSettingsManager.f11550a.m6674e();
                return;
        }
    }
}
