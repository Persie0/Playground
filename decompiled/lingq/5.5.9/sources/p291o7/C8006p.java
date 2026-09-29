package p291o7;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.GraphRequest;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.login.DeviceAuthDialog;
import dm.C5206f;
import dm.C5207g;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o7.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8006p implements GraphRequest.InterfaceC2278b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43574a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43575b;

    public /* synthetic */ C8006p(int i10, Object obj) {
        this.f43574a = i10;
        this.f43575b = obj;
    }

    @Override // com.facebook.GraphRequest.InterfaceC2278b
    /* JADX INFO: renamed from: a */
    public final void mo6614a(C8010t c8010t) {
        int i10 = this.f43574a;
        Object obj = this.f43575b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C0166e.m776w(obj);
                break;
            case 1:
                List list = (List) obj;
                C5207g.m11111f(list, "$validReports");
                try {
                    if (c8010t.f43588c == null) {
                        JSONObject jSONObject = c8010t.f43589d;
                        if (C5207g.m11106a(jSONObject == null ? null : Boolean.valueOf(jSONObject.getBoolean("success")), Boolean.TRUE)) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                C5206f.m10984E0(((InstrumentData) it.next()).f11557a);
                            }
                        }
                    }
                    break;
                } catch (JSONException unused) {
                }
                break;
            default:
                DeviceAuthDialog.m6687t0((DeviceAuthDialog) obj, c8010t);
                break;
        }
    }
}
