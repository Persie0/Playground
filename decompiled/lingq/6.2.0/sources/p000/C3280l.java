package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3280l implements kp3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48833a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f48834b;

    public /* synthetic */ C3280l(Object obj, int i) {
        this.f48833a = i;
        this.f48834b = obj;
    }

    @Override // p000.kp3
    /* JADX INFO: renamed from: a */
    public final void mo3204a(pp3 pp3Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i = this.f48833a;
        Object obj = this.f48834b;
        switch (i) {
            case 0:
                List list = (List) obj;
                if (!lp1.f49971a.contains(AbstractC3317m.class)) {
                    try {
                        if (pp3Var.f56629c == null && (jSONObject = pp3Var.f56630d) != null && jSONObject.getBoolean("success")) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((r74) it.next()).m20430a();
                            }
                            break;
                        }
                    } catch (JSONException unused) {
                        return;
                    } catch (Throwable th) {
                        lp1.m16420a(AbstractC3317m.class, th);
                        return;
                    }
                }
                break;
            case 1:
                C2913d3 c2913d3 = (C2913d3) obj;
                JSONObject jSONObject3 = pp3Var.f56630d;
                if (jSONObject3 != null) {
                    c2913d3.f34884c = jSONObject3.optString("access_token");
                    c2913d3.f34882a = jSONObject3.optInt("expires_at");
                    c2913d3.f34883b = jSONObject3.optInt("expires_in");
                    c2913d3.f34886e = Long.valueOf(jSONObject3.optLong("data_access_expiration_time"));
                    c2913d3.f34885d = jSONObject3.optString("graph_domain", null);
                    break;
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (pp3Var.f56629c == null && (jSONObject2 = pp3Var.f56630d) != null && jSONObject2.getBoolean("success")) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            thb.m22051j(((it2) it2.next()).f44526a);
                        }
                        break;
                    }
                } catch (JSONException unused2) {
                    return;
                }
                break;
        }
    }
}
