package p291o7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.appevents.FlushReason;
import com.google.firebase.heartbeatinfo.C3218a;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import dm.C5212l;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5086z;
import p080e.RunnableC5286r;
import p173i8.C6205a;
import p317p7.C8199f;
import p317p7.C8201h;

/* JADX INFO: renamed from: o7.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC8003m implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43548a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43549b;

    public /* synthetic */ CallableC8003m(int i10, Object obj) {
        this.f43548a = i10;
        this.f43549b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        AccessToken accessTokenM6594a;
        Profile profile;
        AccessToken accessTokenM6595b;
        String string;
        switch (this.f43548a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C0166e.m776w(this.f43549b);
                C7995e c7995eM15863a = C7995e.f43517f.m15863a();
                SharedPreferences sharedPreferences = c7995eM15863a.f43520b.f43482a;
                if (sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken") && (string = sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null)) != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        Date date = AccessToken.f11370l;
                        accessTokenM6594a = AccessToken.C2262b.m6594a(jSONObject);
                    } catch (JSONException unused) {
                        accessTokenM6594a = null;
                    }
                    break;
                } else {
                    accessTokenM6594a = null;
                }
                if (accessTokenM6594a != null) {
                    c7995eM15863a.m15862c(accessTokenM6594a, false);
                }
                C8012v.a aVar = C8012v.f43591d;
                C8012v c8012vM15888a = aVar.m15888a();
                String string2 = c8012vM15888a.f43594b.f43590a.getString("com.facebook.ProfileManager.CachedProfile", null);
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
                    c8012vM15888a.m15887a(profile, false);
                }
                Date date2 = AccessToken.f11370l;
                if (AccessToken.C2262b.m6596c() && aVar.m15888a().f43595c == null && (accessTokenM6595b = AccessToken.C2262b.m6595b()) != null) {
                    if (AccessToken.C2262b.m6596c()) {
                        C5086z c5086z = C5086z.f33015a;
                        C5086z.m10831p(new C5212l(), accessTokenM6595b.f11375e);
                    } else {
                        aVar.m15888a().m15887a(null, true);
                    }
                }
                Context contextM15871a = C8004n.m15871a();
                String str = C8004n.f43554e;
                String str2 = C8201h.f44393c;
                if (C7993c0.m15849b()) {
                    C8201h c8201h = new C8201h(contextM15871a, str);
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM16330b = C8201h.m16330b();
                    if (scheduledThreadPoolExecutorM16330b == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    scheduledThreadPoolExecutorM16330b.execute(new RunnableC5286r(contextM15871a, 6, c8201h));
                }
                if (!C6205a.m12742b(C7993c0.class)) {
                    try {
                        Context contextM15871a2 = C8004n.m15871a();
                        ApplicationInfo applicationInfo = contextM15871a2.getPackageManager().getApplicationInfo(contextM15871a2.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH);
                        C5207g.m11110e(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                        Bundle bundle = applicationInfo.metaData;
                        if (bundle != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                            C8201h c8201h2 = new C8201h(contextM15871a2, (String) null);
                            Bundle bundle2 = new Bundle();
                            if (!C5086z.m10838w()) {
                                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                Log.w(C7993c0.f43497b, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                            }
                            if (C7993c0.m15849b()) {
                                c8201h2.m16332d(bundle2, "fb_auto_applink");
                            }
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused3) {
                    } catch (Throwable th2) {
                        C6205a.m12741a(C7993c0.class, th2);
                    }
                }
                Context applicationContext = C8004n.m15871a().getApplicationContext();
                C5207g.m11110e(applicationContext, "getApplicationContext().applicationContext");
                C8201h c8201h3 = new C8201h(applicationContext, (String) null);
                if (!C6205a.m12742b(c8201h3)) {
                    try {
                        String str3 = C8199f.f44386a;
                        C8199f.m16323c(FlushReason.EXPLICIT);
                    } catch (Throwable th3) {
                        C6205a.m12741a(c8201h3, th3);
                    }
                    break;
                }
                return null;
            default:
                C3218a c3218a = (C3218a) this.f43549b;
                synchronized (c3218a) {
                    c3218a.f16247a.get().m453h(c3218a.f16249c.get().mo13080a(), System.currentTimeMillis());
                    break;
                }
                return null;
        }
    }
}
