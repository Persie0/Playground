package p291o7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.GraphRequest;
import com.facebook.internal.instrument.InstrumentData;
import dm.C5206f;
import dm.C5207g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o7.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7992c implements GraphRequest.InterfaceC2278b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43494a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43495b;

    public /* synthetic */ C7992c(int i10, Object obj) {
        this.f43494a = i10;
        this.f43495b = obj;
    }

    @Override // com.facebook.GraphRequest.InterfaceC2278b
    /* JADX INFO: renamed from: a */
    public final void mo6614a(C8010t c8010t) {
        JSONObject jSONObject = c8010t.f43589d;
        int i10 = this.f43494a;
        Boolean boolValueOf = null;
        Object obj = this.f43495b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7995e.d dVar = (C7995e.d) obj;
                C5207g.m11111f(dVar, "$refreshResult");
                if (jSONObject != null) {
                    dVar.f43524a = jSONObject.optString("access_token");
                    dVar.f43525b = jSONObject.optInt("expires_at");
                    dVar.f43526c = jSONObject.optInt("expires_in");
                    dVar.f43527d = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                    dVar.f43528e = jSONObject.optString("graph_domain", null);
                    break;
                }
                break;
            default:
                InstrumentData instrumentData = (InstrumentData) obj;
                C5207g.m11111f(instrumentData, "$instrumentData");
                try {
                    if (c8010t.f43588c == null) {
                        if (jSONObject != null) {
                            boolValueOf = Boolean.valueOf(jSONObject.getBoolean("success"));
                        }
                        if (C5207g.m11106a(boolValueOf, Boolean.TRUE)) {
                            C5206f.m10984E0(instrumentData.f11557a);
                        }
                    }
                } catch (JSONException unused) {
                    return;
                }
                break;
        }
    }
}
