package p028b7;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.media.AbstractC0140a;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.CallableC2216e0;
import com.clevertap.android.sdk.inapp.InAppController;
import com.kochava.core.BuildConfig;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p043c7.C1735a;
import p290o6.C7957g0;
import p290o6.C7977q0;
import p290o6.C7985x;

/* JADX INFO: renamed from: b7.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1330h extends AbstractC1324b {

    /* JADX INFO: renamed from: b */
    public final AbstractC0140a f8100b;

    /* JADX INFO: renamed from: c */
    public final CleverTapInstanceConfig f8101c;

    /* JADX INFO: renamed from: d */
    public final C7985x f8102d;

    /* JADX INFO: renamed from: e */
    public final boolean f8103e;

    /* JADX INFO: renamed from: f */
    public final C2181a f8104f;

    /* JADX INFO: renamed from: b7.h$a */
    public class a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f8105a;

        public a(Context context) {
            this.f8105a = context;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            InAppController inAppController = C1330h.this.f8102d.f43443l;
            CleverTapInstanceConfig cleverTapInstanceConfig = inAppController.f11142c;
            if (!cleverTapInstanceConfig.f10999e) {
                C1735a.m5472a(cleverTapInstanceConfig).m5475c("TAG_FEATURE_IN_APPS").m6585b("InappController#showNotificationIfAvailable", new CallableC2216e0(inAppController, this.f8105a));
            }
            return null;
        }
    }

    public C1330h(AbstractC0140a abstractC0140a, CleverTapInstanceConfig cleverTapInstanceConfig, C7985x c7985x, boolean z10) {
        this.f8100b = abstractC0140a;
        this.f8101c = cleverTapInstanceConfig;
        this.f8104f = cleverTapInstanceConfig.m6433b();
        this.f8102d = c7985x;
        this.f8103e = z10;
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: b0 */
    public final void mo591b0(JSONObject jSONObject, String str, Context context) {
        try {
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f8101c;
            if (cleverTapInstanceConfig.f10999e) {
                C2181a c2181a = this.f8104f;
                String str2 = cleverTapInstanceConfig.f10995a;
                c2181a.getClass();
                C2181a.m6460m(str2, "CleverTap instance is configured to analytics only, not processing inapp messages");
                this.f8100b.mo591b0(jSONObject, str, context);
                return;
            }
            C2181a c2181a2 = this.f8104f;
            String str3 = cleverTapInstanceConfig.f10995a;
            c2181a2.getClass();
            C2181a.m6460m(str3, "InApp: Processing response");
            if (!jSONObject.has("inapp_notifs")) {
                C2181a c2181a3 = this.f8104f;
                String str4 = this.f8101c.f10995a;
                c2181a3.getClass();
                C2181a.m6460m(str4, "InApp: Response JSON object doesn't contain the inapp key, failing");
                this.f8100b.mo591b0(jSONObject, str, context);
                return;
            }
            int i10 = 10;
            int i11 = (jSONObject.has("imc") && (jSONObject.get("imc") instanceof Integer)) ? jSONObject.getInt("imc") : 10;
            if (jSONObject.has("imp") && (jSONObject.get("imp") instanceof Integer)) {
                i10 = jSONObject.getInt("imp");
            }
            if (this.f8103e || this.f8102d.f43432a == null) {
                C2181a c2181a4 = this.f8104f;
                String str5 = this.f8101c.f10995a;
                c2181a4.getClass();
                C2181a.m6460m(str5, "controllerManager.getInAppFCManager() is NULL, not Updating InAppFC Limits");
            } else {
                C2181a.m6455h("Updating InAppFC Limits");
                C7957g0 c7957g0 = this.f8102d.f43432a;
                synchronized (c7957g0) {
                    C7977q0.m15831i(context, i10, c7957g0.m15780j(C7957g0.m15772e("istmcd_inapp", c7957g0.f43328d)));
                    C7977q0.m15831i(context, i11, c7957g0.m15780j(C7957g0.m15772e("imc", c7957g0.f43328d)));
                }
                this.f8102d.f43432a.m15779i(context, jSONObject);
            }
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("inapp_notifs");
                SharedPreferences.Editor editorEdit = C7977q0.m15827e(context, null).edit();
                try {
                    JSONArray jSONArray2 = new JSONArray(C7977q0.m15829g(context, this.f8101c, "inApp", BuildConfig.SDK_PERMISSIONS));
                    if (jSONArray != null && jSONArray.length() > 0) {
                        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                            try {
                                jSONArray2.put(jSONArray.getJSONObject(i12));
                            } catch (JSONException unused) {
                                C2181a.m6455h("InAppManager: Malformed inapp notification");
                            }
                        }
                    }
                    editorEdit.putString(C7977q0.m15833k(this.f8101c, "inApp"), jSONArray2.toString());
                    C7977q0.m15830h(editorEdit);
                } catch (Throwable th2) {
                    C2181a c2181a5 = this.f8104f;
                    String str6 = this.f8101c.f10995a;
                    c2181a5.getClass();
                    C2181a.m6460m(str6, "InApp: Failed to parse the in-app notifications properly");
                    C2181a c2181a6 = this.f8104f;
                    String str7 = this.f8101c.f10995a;
                    String str8 = "InAppManager: Reason: " + th2.getMessage();
                    c2181a6.getClass();
                    C2181a.m6461n(str7, str8, th2);
                }
                C1735a.m5472a(this.f8101c).m5475c("TAG_FEATURE_IN_APPS").m6585b("InAppResponse#processResponse", new a(context));
            } catch (JSONException unused2) {
                C2181a c2181a7 = this.f8104f;
                String str9 = this.f8101c.f10995a;
                c2181a7.getClass();
                C2181a.m6452d(str9, "InApp: In-app key didn't contain a valid JSON array");
                this.f8100b.mo591b0(jSONObject, str, context);
                return;
            }
        } catch (Throwable th3) {
            C2181a.m6457j("InAppManager: Failed to parse response", th3);
        }
        this.f8100b.mo591b0(jSONObject, str, context);
    }
}
