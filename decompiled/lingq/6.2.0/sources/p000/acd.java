package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class acd {
    /* JADX INFO: renamed from: a */
    public static np2 m269a(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("id");
        string.getClass();
        String strOptString = jSONObject.optString("text");
        strOptString.getClass();
        String strOptString2 = jSONObject.optString("label");
        strOptString2.getClass();
        return new np2(string, strOptString, strOptString2);
    }

    /* JADX INFO: renamed from: b */
    public static final a8b m270b(p8b p8bVar) {
        p8bVar.getClass();
        return new a8b(p8bVar.f55772a, p8bVar.f55791t);
    }
}
