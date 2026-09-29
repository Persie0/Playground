package p000;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c4d {
    /* JADX INFO: renamed from: b */
    public static String m4310b(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo4311a();

    /* JADX INFO: renamed from: c */
    public abstract c4d mo4312c(String str, vi3 vi3Var);
}
