package p000;

import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jp1 implements kp3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45950a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f45951b;

    public /* synthetic */ jp1(Object obj, int i) {
        this.f45950a = i;
        this.f45951b = obj;
    }

    @Override // p000.kp3
    /* JADX INFO: renamed from: a */
    public final void mo3204a(pp3 pp3Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i = this.f45950a;
        Object obj = this.f45951b;
        switch (i) {
            case 0:
                List list = (List) obj;
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
                }
                break;
            default:
                r74 r74Var = (r74) obj;
                try {
                    if (pp3Var.f56629c == null && (jSONObject2 = pp3Var.f56630d) != null && jSONObject2.getBoolean("success")) {
                        r74Var.m20430a();
                        break;
                    }
                } catch (JSONException unused2) {
                    return;
                }
                break;
        }
    }
}
