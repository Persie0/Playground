package p028b7;

import android.content.Context;
import android.support.v4.media.AbstractC0140a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.product_config.CTProductConfigController;
import org.json.JSONObject;
import p260m8.C7499b;
import p290o6.C7963j0;
import p290o6.C7985x;
import p290o6.C7986y;
import p475x6.C10101a;

/* JADX INFO: renamed from: b7.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1333k extends AbstractC1324b {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f8118b = 0;

    /* JADX INFO: renamed from: c */
    public final AbstractC0140a f8119c;

    /* JADX INFO: renamed from: d */
    public final CleverTapInstanceConfig f8120d;

    /* JADX INFO: renamed from: e */
    public final C2181a f8121e;

    /* JADX INFO: renamed from: f */
    public final Object f8122f;

    /* JADX INFO: renamed from: g */
    public final Object f8123g;

    public C1333k(C1329g c1329g, CleverTapInstanceConfig cleverTapInstanceConfig, C7986y c7986y, C7985x c7985x) {
        this.f8119c = c1329g;
        this.f8120d = cleverTapInstanceConfig;
        this.f8121e = cleverTapInstanceConfig.m6433b();
        this.f8122f = c7986y;
        this.f8123g = c7985x;
    }

    public C1333k(CleverTapInstanceConfig cleverTapInstanceConfig, C10101a c10101a, C7963j0 c7963j0, C1330h c1330h) {
        this.f8119c = c1330h;
        this.f8120d = cleverTapInstanceConfig;
        this.f8121e = cleverTapInstanceConfig.m6433b();
        this.f8123g = c10101a;
        this.f8122f = c7963j0;
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: b0 */
    public final void mo591b0(JSONObject jSONObject, String str, Context context) {
        int i10 = this.f8118b;
        Object obj = this.f8123g;
        AbstractC0140a abstractC0140a = this.f8119c;
        C2181a c2181a = this.f8121e;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f8120d;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                String str2 = cleverTapInstanceConfig.f10995a;
                c2181a.getClass();
                C2181a.m6460m(str2, "Processing Product Config response...");
                boolean z10 = cleverTapInstanceConfig.f10999e;
                String str3 = cleverTapInstanceConfig.f10995a;
                if (z10) {
                    C2181a.m6460m(str3, "CleverTap instance is configured to analytics only, not processing Product Config response");
                    abstractC0140a.mo591b0(jSONObject, str, context);
                } else if (jSONObject == null) {
                    C2181a.m6460m(str3, "Product Config : Can't parse Product Config Response, JSON response object is null");
                    m4892l0();
                } else if (!jSONObject.has("pc_notifs")) {
                    C2181a.m6460m(str3, "Product Config : JSON object doesn't contain the Product Config key");
                    m4892l0();
                    abstractC0140a.mo591b0(jSONObject, str, context);
                } else {
                    try {
                        C2181a.m6460m(str3, "Product Config : Processing Product Config response");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("pc_notifs");
                        if (jSONObject2.getJSONArray("kv") == null || ((C7985x) obj).f43438g == null) {
                            m4892l0();
                        } else {
                            ((C7985x) obj).f43438g.m6564g(jSONObject2);
                        }
                    } catch (Throwable th2) {
                        m4892l0();
                        C2181a.m6461n(str3, "Product Config : Failed to parse Product Config response", th2);
                    }
                    abstractC0140a.mo591b0(jSONObject, str, context);
                }
                break;
            default:
                if (str == null) {
                    String str4 = cleverTapInstanceConfig.f10995a;
                    c2181a.getClass();
                    C2181a.m6460m(str4, "Problem processing queue response, response is null");
                } else {
                    try {
                        String str5 = cleverTapInstanceConfig.f10995a;
                        String strConcat = "Trying to process response: ".concat(str);
                        c2181a.getClass();
                        C2181a.m6460m(str5, strConcat);
                        JSONObject jSONObject3 = new JSONObject(str);
                        abstractC0140a.mo591b0(jSONObject3, str, context);
                        try {
                            ((C7963j0) this.f8122f).m15797q(context, jSONObject3);
                        } catch (Throwable th3) {
                            C2181a.m6461n(cleverTapInstanceConfig.f10995a, "Failed to sync local cache with upstream", th3);
                            return;
                        }
                    } catch (Throwable th4) {
                        ((C10101a) obj).f51226H++;
                        String str6 = cleverTapInstanceConfig.f10995a;
                        c2181a.getClass();
                        C2181a.m6461n(str6, "Problem process send queue response", th4);
                        return;
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m4892l0() {
        C7986y c7986y = (C7986y) this.f8122f;
        if (c7986y.f43470l) {
            CTProductConfigController cTProductConfigController = ((C7985x) this.f8123g).f43438g;
            if (cTProductConfigController != null) {
                cTProductConfigController.f11321f.compareAndSet(true, false);
                CleverTapInstanceConfig cleverTapInstanceConfig = cTProductConfigController.f11320e;
                C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                String strM14908I = C7499b.m14908I(cleverTapInstanceConfig);
                c2181aM6433b.getClass();
                C2181a.m6460m(strM14908I, "Fetch Failed");
            }
            c7986y.f43470l = false;
        }
    }
}
