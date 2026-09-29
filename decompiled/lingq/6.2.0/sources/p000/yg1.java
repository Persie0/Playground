package p000;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion;
import com.facebook.appevents.iap.InAppPurchaseUtils$IAPProductType;
import com.google.firebase.perf.p010v1.ApplicationProcessState;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yg1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69805a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f69806b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f69807c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f69808d;

    public /* synthetic */ yg1(Object obj, Object obj2, Object obj3, int i) {
        this.f69805a = i;
        this.f69806b = obj;
        this.f69807c = obj2;
        this.f69808d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObjectOptJSONObject;
        switch (this.f69805a) {
            case 0:
                f58 f58Var = (f58) this.f69806b;
                String str = (String) this.f69807c;
                sg1 sg1Var = (sg1) this.f69808d;
                fs6 fs6Var = f58Var.f38441a;
                InterfaceC3036gf interfaceC3036gf = (InterfaceC3036gf) ((uo7) fs6Var.f39590b).get();
                if (interfaceC3036gf == null) {
                    return;
                }
                JSONObject jSONObject = sg1Var.f60809e;
                if (jSONObject.length() < 1) {
                    return;
                }
                JSONObject jSONObject2 = sg1Var.f60806b;
                if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                    if (strOptString.isEmpty()) {
                        return;
                    }
                    synchronized (((Map) fs6Var.f39591c)) {
                        try {
                            if (!strOptString.equals(((Map) fs6Var.f39591c).get(str))) {
                                ((Map) fs6Var.f39591c).put(str, strOptString);
                                Bundle bundleM12429f = g9a.m12429f("arm_key", str);
                                bundleM12429f.putString("arm_value", jSONObject2.optString(str));
                                bundleM12429f.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                bundleM12429f.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                bundleM12429f.putString("group", jSONObjectOptJSONObject.optString("group"));
                                C3182kf c3182kf = (C3182kf) interfaceC3036gf;
                                c3182kf.m15167a("fp", "personalization_assignment", bundleM12429f);
                                Bundle bundle = new Bundle();
                                bundle.putString("_fpid", strOptString);
                                c3182kf.m15167a("fp", "_fpc", bundle);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 1:
                C3002fi c3002fi = (C3002fi) this.f69806b;
                d32 d32Var = (d32) this.f69807c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f69808d;
                try {
                    jb3 jb3VarM17128k = AbstractC3352my.m17128k(c3002fi.f39115a);
                    if (jb3VarM17128k == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    oq2 oq2Var = (oq2) jb3VarM17128k.f49998b;
                    ((ib3) oq2Var).m13754d(threadPoolExecutor);
                    oq2Var.mo11839a(new rq2(d32Var, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    d32Var.mo10069a0(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 2:
                ((GaugeManager) this.f69806b).lambda$stopCollectingGauges$3((String) this.f69807c, (ApplicationProcessState) this.f69808d);
                return;
            case 3:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f69806b;
                InAppPurchaseUtils$BillingClientVersion inAppPurchaseUtils$BillingClientVersion = (InAppPurchaseUtils$BillingClientVersion) this.f69807c;
                Context context = (Context) this.f69808d;
                if (lp1.f49971a.contains(n24.class)) {
                    return;
                }
                try {
                    ((o24) ref$ObjectRef.f47718a).mo17770a(InAppPurchaseUtils$IAPProductType.SUBS, new RunnableC0806bd(23, inAppPurchaseUtils$BillingClientVersion, context));
                    return;
                } catch (Throwable th3) {
                    lp1.m16420a(n24.class, th3);
                    return;
                }
            case 4:
                ((SessionManager) this.f69806b).lambda$setApplicationContext$0((Context) this.f69807c, (PerfSession) this.f69808d);
                return;
            case 5:
                mba mbaVar = (mba) this.f69806b;
                e8a e8aVar = (e8a) this.f69807c;
                ApplicationProcessState applicationProcessState = (ApplicationProcessState) this.f69808d;
                w67 w67VarM24321y = x67.m24321y();
                w67VarM24321y.m22767h();
                x67.m24319u((x67) w67VarM24321y.f64019b, e8aVar);
                mbaVar.m16752d(w67VarM24321y, applicationProcessState);
                return;
            default:
                mba mbaVar2 = (mba) this.f69806b;
                kk6 kk6Var = (kk6) this.f69807c;
                ApplicationProcessState applicationProcessState2 = (ApplicationProcessState) this.f69808d;
                mbaVar2.getClass();
                w67 w67VarM24321y2 = x67.m24321y();
                w67VarM24321y2.m22767h();
                x67.m24320v((x67) w67VarM24321y2.f64019b, kk6Var);
                mbaVar2.m16752d(w67VarM24321y2, applicationProcessState2);
                return;
        }
    }
}
