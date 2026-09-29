package p291o7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.internal.instrument.InstrumentData;
import dm.C5206f;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5078r;
import p067d8.C5086z;
import p134g8.C5716c;
import p173i8.C6205a;
import p194j8.C6423a;

/* JADX INFO: renamed from: o7.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8005o implements GraphRequest.InterfaceC2278b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43572a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43573b;

    public /* synthetic */ C8005o(int i10, Object obj) {
        this.f43572a = i10;
        this.f43573b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.GraphRequest.InterfaceC2278b
    /* JADX INFO: renamed from: a */
    public final void mo6614a(C8010t c8010t) {
        int length;
        JSONObject jSONObject = c8010t.f43589d;
        FacebookRequestError facebookRequestError = c8010t.f43588c;
        int i10 = this.f43572a;
        Boolean boolValueOf = null;
        Object obj = this.f43573b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                GraphRequest.InterfaceC2278b interfaceC2278b = (GraphRequest.InterfaceC2278b) obj;
                JSONObject jSONObject2 = c8010t.f43587b;
                JSONObject jSONObjectOptJSONObject = jSONObject2 == null ? null : jSONObject2.optJSONObject("__debug__");
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONArray("messages");
                if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i11);
                        String strOptString = jSONObjectOptJSONObject2 == null ? null : jSONObjectOptJSONObject2.optString("message");
                        String strOptString2 = jSONObjectOptJSONObject2 == null ? null : jSONObjectOptJSONObject2.optString("type");
                        String strOptString3 = jSONObjectOptJSONObject2 == null ? null : jSONObjectOptJSONObject2.optString("link");
                        if (strOptString != null && strOptString2 != null) {
                            LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                            if (C5207g.m11106a(strOptString2, "warning")) {
                                loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                            }
                            if (!C5086z.m10802A(strOptString3)) {
                                strOptString = ((Object) strOptString) + " Link: " + ((Object) strOptString3);
                            }
                            C5078r.f32986e.m10780b(loggingBehavior, "GraphRequest", strOptString);
                        }
                        if (i12 < length) {
                            i11 = i12;
                        }
                    }
                }
                if (interfaceC2278b != null) {
                    interfaceC2278b.mo6614a(c8010t);
                }
                break;
            case 1:
                List list = (List) obj;
                AtomicBoolean atomicBoolean = C5716c.f34732a;
                if (!C6205a.m12742b(C5716c.class)) {
                    try {
                        C5207g.m11111f(list, "$validReports");
                        if (facebookRequestError == null) {
                            if (jSONObject != null) {
                                try {
                                    boolValueOf = Boolean.valueOf(jSONObject.getBoolean("success"));
                                } catch (JSONException unused) {
                                    return;
                                }
                            }
                            if (C5207g.m11106a(boolValueOf, Boolean.TRUE)) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    C5206f.m10984E0(((InstrumentData) it.next()).f11557a);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        C6205a.m12741a(C5716c.class, th2);
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                C5207g.m11111f(arrayList, "$validReports");
                if (facebookRequestError == null) {
                    if (jSONObject != null) {
                        try {
                            boolValueOf = Boolean.valueOf(jSONObject.getBoolean("success"));
                        } catch (JSONException unused2) {
                            return;
                        }
                    }
                    if (C5207g.m11106a(boolValueOf, Boolean.TRUE)) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            C5206f.m10984E0(((C6423a) it2.next()).f36898a);
                        }
                    }
                }
                break;
        }
    }
}
