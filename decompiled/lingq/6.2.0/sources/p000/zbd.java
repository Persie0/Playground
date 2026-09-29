package p000;

import kotlinx.coroutines.flow.AbstractC3224d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zbd {
    /* JADX INFO: renamed from: a */
    public static mp2 m25542a(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("type");
        string.getClass();
        String string2 = jSONObject.getString("data");
        string2.getClass();
        return new mp2(string, 0, string2);
    }

    /* JADX INFO: renamed from: b */
    public static final c83 m25543b(u8b u8bVar, nn1 nn1Var, String str) {
        u8bVar.getClass();
        nn1Var.getClass();
        str.getClass();
        return AbstractC3224d.m15544w(AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(u8bVar.f63598a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new r8b(str, u8bVar, 1)), 23)), nn1Var);
    }
}
