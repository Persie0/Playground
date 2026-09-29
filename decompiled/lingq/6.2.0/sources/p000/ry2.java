package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.appevents.FlushReason;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ry2 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60035a;

    public /* synthetic */ ry2(int i) {
        this.f60035a = i;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00eb A[Catch: all -> 0x00f6, NameNotFoundException -> 0x0107, TryCatch #5 {NameNotFoundException -> 0x0107, all -> 0x00f6, blocks: (B:41:0x00ba, B:43:0x00d3, B:45:0x00db, B:47:0x00eb, B:50:0x00f8, B:52:0x0100), top: B:79:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0100 A[Catch: all -> 0x00f6, NameNotFoundException -> 0x0107, TRY_LEAVE, TryCatch #5 {NameNotFoundException -> 0x0107, all -> 0x00f6, blocks: (B:41:0x00ba, B:43:0x00d3, B:45:0x00db, B:47:0x00eb, B:50:0x00f8, B:52:0x0100), top: B:79:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        AccessToken accessTokenM24356m;
        Profile profile;
        Context contextM21766a;
        Bundle bundle;
        C3012fs c3012fs;
        Bundle bundle2;
        C3012fs c3012fs2;
        AccessToken accessTokenM24363t;
        String string;
        switch (this.f60035a) {
            case 0:
                Context context = sy2.f61594j;
                if (context != null) {
                    return context.getCacheDir();
                }
                fa4.m11636J("applicationContext");
                throw null;
            default:
                p84 p84Var = C3309ls.f50061k;
                w41 w41VarM22270m = w41.f66361h.m22270m();
                SharedPreferences sharedPreferences = ((C3744x2) w41VarM22270m.f66366b).f67655a;
                if (sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken") && (string = sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null)) != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        Date date = AccessToken.f11306l;
                        accessTokenM24356m = x74.m24356m(jSONObject);
                    } catch (JSONException unused) {
                        accessTokenM24356m = null;
                    }
                    break;
                } else {
                    accessTokenM24356m = null;
                }
                if (accessTokenM24356m != null) {
                    w41VarM22270m.m23714H(accessTokenM24356m, false);
                }
                C3309ls c3309lsM18973k = p84Var.m18973k();
                String string2 = ((C3336mi) c3309lsM18973k.f50065c).f51344a.getString("com.facebook.ProfileManager.CachedProfile", null);
                if (string2 != null) {
                    try {
                        profile = new Profile(new JSONObject(string2));
                    } catch (JSONException unused2) {
                        profile = null;
                    }
                    break;
                } else {
                    profile = null;
                }
                if (profile != null) {
                    c3309lsM18973k.m16498R(profile, false);
                }
                Date date2 = AccessToken.f11306l;
                if (x74.m24366w() && ((Profile) p84Var.m18973k().f50066d) == null && (accessTokenM24363t = x74.m24363t()) != null) {
                    if (x74.m24366w()) {
                        bna.m3933V(new to2(), accessTokenM24363t.f11311e);
                    } else {
                        p84Var.m18973k().m16498R(null, true);
                    }
                }
                Context contextM21766a2 = sy2.m21766a();
                String str = sy2.f61588d;
                String str2 = C3012fs.f39540c;
                if (!ema.m11256c()) {
                    if (!lp1.f49971a.contains(ema.class)) {
                        try {
                            contextM21766a = sy2.m21766a();
                            ApplicationInfo applicationInfo = contextM21766a.getPackageManager().getApplicationInfo(contextM21766a.getPackageName(), 128);
                            applicationInfo.getClass();
                            bundle = applicationInfo.metaData;
                            if (bundle != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                                c3012fs = new C3012fs(contextM21766a, (String) null);
                                bundle2 = new Bundle();
                                if (!bna.m3939a0()) {
                                    bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                    Log.w("ema", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                }
                                if (ema.m11256c()) {
                                    c3012fs.m12038d("fb_auto_applink", bundle2);
                                }
                            }
                            break;
                        } catch (PackageManager.NameNotFoundException unused3) {
                        } catch (Throwable th) {
                            lp1.m16420a(ema.class, th);
                        }
                    }
                    Context applicationContext = sy2.m21766a().getApplicationContext();
                    applicationContext.getClass();
                    c3012fs2 = new C3012fs(applicationContext, (String) null);
                    if (!lp1.f49971a.contains(c3012fs2)) {
                        try {
                            AbstractC3546rr.m20754c(FlushReason.EXPLICIT);
                        } catch (Throwable th2) {
                            lp1.m16420a(c3012fs2, th2);
                        }
                    }
                    break;
                } else {
                    C3012fs c3012fs3 = new C3012fs(contextM21766a2, str);
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM12035b = C3012fs.m12035b();
                    if (scheduledThreadPoolExecutorM12035b != null) {
                        scheduledThreadPoolExecutorM12035b.execute(new RunnableC3470pr(2, contextM21766a2, c3012fs3));
                        if (!lp1.f49971a.contains(ema.class)) {
                            contextM21766a = sy2.m21766a();
                            ApplicationInfo applicationInfo2 = contextM21766a.getPackageManager().getApplicationInfo(contextM21766a.getPackageName(), 128);
                            applicationInfo2.getClass();
                            bundle = applicationInfo2.metaData;
                            if (bundle != null) {
                                c3012fs = new C3012fs(contextM21766a, (String) null);
                                bundle2 = new Bundle();
                                if (!bna.m3939a0()) {
                                    bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                    Log.w("ema", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                }
                                if (ema.m11256c()) {
                                    c3012fs.m12038d("fb_auto_applink", bundle2);
                                }
                            }
                        }
                        Context applicationContext2 = sy2.m21766a().getApplicationContext();
                        applicationContext2.getClass();
                        c3012fs2 = new C3012fs(applicationContext2, (String) null);
                        if (!lp1.f49971a.contains(c3012fs2)) {
                            AbstractC3546rr.m20754c(FlushReason.EXPLICIT);
                        }
                    } else {
                        C3386nv.m17633t("Required value was null.");
                    }
                    break;
                }
                return null;
        }
    }
}
