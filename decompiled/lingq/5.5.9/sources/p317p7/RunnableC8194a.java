package p317p7;

import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.p050ml.ModelManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p067d8.C5079s;
import p173i8.C6205a;
import p291o7.C8004n;
import p431v7.C9661e;

/* JADX INFO: renamed from: p7.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC8194a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44374a;

    public /* synthetic */ RunnableC8194a(int i10) {
        this.f44374a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dd A[Catch: all -> 0x0100, Exception -> 0x0105, TryCatch #7 {Exception -> 0x0105, all -> 0x0100, blocks: (B:24:0x0058, B:26:0x006c, B:32:0x007b, B:34:0x0088, B:38:0x009c, B:40:0x00a3, B:60:0x00f8, B:52:0x00ca, B:56:0x00d3, B:59:0x00dd, B:33:0x0083, B:47:0x00b8), top: B:104:0x0058, inners: #2 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Set] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? M17490u;
        JSONObject jSONObject;
        boolean z10 = false;
        String str = null;
        switch (this.f44374a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C8195b.f44375a.getClass();
                C8195b.m16318a();
                return;
            case 1:
                HashSet hashSet = new HashSet();
                String str2 = C8199f.f44386a;
                if (!C6205a.m12742b(C8199f.class)) {
                    try {
                        M17490u = C8199f.f44388c.m17490u();
                    } catch (Throwable th2) {
                        C6205a.m12741a(C8199f.class, th2);
                        M17490u = str;
                    }
                    break;
                } else {
                    M17490u = str;
                }
                Iterator it = M17490u.iterator();
                while (it.hasNext()) {
                    hashSet.add(((AccessTokenAppIdPair) it.next()).f11475a);
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    FetchedAppSettingsManager.m6673f((String) it2.next(), true);
                }
                return;
            case 2:
                C9661e c9661e = C9661e.f49457a;
                if (C6205a.m12742b(C9661e.class)) {
                    return;
                }
                try {
                    C9661e.f49457a.m18121a();
                    return;
                } catch (Throwable th3) {
                    C6205a.m12741a(C9661e.class, th3);
                    return;
                }
            case 3:
                ModelManager modelManager = ModelManager.f11524a;
                if (C6205a.m12742b(ModelManager.class)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences = C8004n.m15871a().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
                    String string = sharedPreferences.getString("models", str);
                    if (string != null) {
                        jSONObject = string.length() == 0 ? new JSONObject() : new JSONObject(string);
                    }
                    long j10 = sharedPreferences.getLong("model_request_timestamp", 0L);
                    FeatureManager featureManager = FeatureManager.f11546a;
                    boolean zM6666c = FeatureManager.m6666c(FeatureManager.Feature.ModelRequest);
                    ModelManager modelManager2 = ModelManager.f11524a;
                    if (!zM6666c || jSONObject.length() == 0) {
                        jSONObject = modelManager2.m6653c();
                        if (jSONObject == null) {
                            return;
                        } else {
                            sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                        }
                    } else {
                        modelManager2.getClass();
                        if (!C6205a.m12742b(modelManager2) && j10 != 0) {
                            try {
                                if (System.currentTimeMillis() - j10 < 259200000) {
                                    z10 = true;
                                }
                            } catch (Throwable th4) {
                                C6205a.m12741a(modelManager2, th4);
                            }
                        }
                        if (!z10) {
                            jSONObject = modelManager2.m6653c();
                            if (jSONObject == null) {
                                return;
                            } else {
                                sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                            }
                        }
                    }
                    modelManager2.m6651a(jSONObject);
                    modelManager2.m6652b();
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th5) {
                    C6205a.m12741a(ModelManager.class, th5);
                    return;
                }
            case 4:
                AtomicBoolean atomicBoolean = C5079s.f32995d;
                if (C6205a.m12742b(C5079s.class)) {
                    return;
                }
                try {
                    try {
                        Iterator it3 = C5079s.f32994c.iterator();
                        while (it3.hasNext()) {
                            ((C5079s.e) it3.next()).m10798a(true);
                        }
                        atomicBoolean.set(false);
                        return;
                    } catch (Throwable th6) {
                        atomicBoolean.set(false);
                        throw th6;
                    }
                } catch (Throwable th7) {
                    C6205a.m12741a(C5079s.class, th7);
                    return;
                }
            default:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.f11780a;
                return;
        }
    }
}
