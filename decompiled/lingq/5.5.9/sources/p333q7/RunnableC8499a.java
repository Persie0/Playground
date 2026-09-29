package p333q7;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.appevents.p050ml.ModelManager;
import com.facebook.internal.FetchedAppSettingsManager;
import dm.C5207g;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5055a;
import p067d8.C5073m;
import p067d8.C5074n;
import p173i8.C6205a;
import p291o7.C8004n;
import p431v7.C9659c;
import p431v7.C9663g;
import p451w7.C9819a;
import p476x7.C10105d;
import p476x7.C10111j;
import p476x7.C10113l;

/* JADX INFO: renamed from: q7.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC8499a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45740a;

    public /* synthetic */ RunnableC8499a(int i10) {
        this.f45740a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [x7.j] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [x7.l] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ?? r10;
        ?? c10113l;
        String str2 = null;
        switch (this.f45740a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                if (!C6205a.m12742b(C8500b.class)) {
                    try {
                        Context contextM15871a = C8004n.m15871a();
                        C5055a c5055a = C5055a.f32901f;
                        C5055a c5055aM10738a = C5055a.a.m10738a(contextM15871a);
                        if (!(c5055aM10738a != null && c5055aM10738a.f32906e)) {
                            C8500b c8500b = C8500b.f45741a;
                            c8500b.getClass();
                            if (!C6205a.m12742b(c8500b)) {
                                try {
                                    FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f11550a;
                                    C5074n c5074nM6673f = FetchedAppSettingsManager.m6673f(C8004n.m15872b(), false);
                                    if (c5074nM6673f != null && (str = c5074nM6673f.f32979m) != null) {
                                        try {
                                            C8502d.m16602a().clear();
                                            C8502d.a.m16604a(new JSONObject(str));
                                            break;
                                        } catch (JSONException unused) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                    C6205a.m12741a(c8500b, th2);
                                }
                            }
                            C8500b.f45743c = true;
                        }
                    } catch (Throwable th3) {
                        C6205a.m12741a(C8500b.class, th3);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                Context contextM15871a2 = C8004n.m15871a();
                C9663g c9663g = C9663g.f49486a;
                C9659c.m18118a(C9659c.f49447a, contextM15871a2, C9663g.m18132f(contextM15871a2, C9659c.f49455i), false);
                Object obj = C9659c.f49455i;
                ?? M18133a = str2;
                if (!C6205a.m12742b(C9663g.class)) {
                    try {
                        C9663g c9663g2 = C9663g.f49486a;
                        M18133a = c9663g2.m18133a(c9663g2.m18137e(contextM15871a2, obj, "subs"));
                    } catch (Throwable th4) {
                        C6205a.m12741a(C9663g.class, th4);
                        M18133a = str2;
                    }
                }
                C9659c.m18118a(C9659c.f49447a, contextM15871a2, M18133a, true);
                break;
            case 2:
                if (C10105d.f51255g == null) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C8004n.m15871a());
                    long j10 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
                    long j11 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
                    String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", str2);
                    if (j10 != 0 && j11 != 0 && string != null) {
                        C10111j c10111j = new C10111j(Long.valueOf(j10), Long.valueOf(j11));
                        c10111j.f51281d = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                        SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(C8004n.m15871a());
                        if (defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                            r10 = str2;
                            r10 = str2;
                            r10 = str2;
                            c10113l = new C10113l(defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", str2), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
                        } else {
                            r10 = str2;
                            r10 = str2;
                            r10 = str2;
                            c10113l = str2;
                        }
                        c10111j.f51283f = c10113l;
                        c10111j.f51282e = Long.valueOf(System.currentTimeMillis());
                        UUID uuidFromString = UUID.fromString(string);
                        C5207g.m11110e(uuidFromString, "fromString(sessionIDStr)");
                        c10111j.f51280c = uuidFromString;
                        r10 = c10111j;
                    }
                    r10 = str2;
                    r10 = str2;
                    r10 = str2;
                    r10 = str2;
                    r10 = str2;
                    r10 = str2;
                    C10105d.f51255g = r10;
                }
                break;
            default:
                ModelManager modelManager = ModelManager.f11524a;
                if (!C6205a.m12742b(ModelManager.class)) {
                    try {
                        C9819a c9819a = C9819a.f49984a;
                        if (!C6205a.m12742b(C9819a.class)) {
                            try {
                                C9819a.f49985b = true;
                                C5073m c5073m = C5073m.f32961a;
                                C9819a.f49986c = C5073m.m10770b("FBSDKFeatureIntegritySample", C8004n.m15872b(), false);
                            } catch (Throwable th5) {
                                C6205a.m12741a(C9819a.class, th5);
                            }
                        }
                    } catch (Throwable th6) {
                        C6205a.m12741a(ModelManager.class, th6);
                        return;
                    }
                    break;
                }
                break;
        }
    }
}
