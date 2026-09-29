package p000;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wh8 {

    /* JADX INFO: renamed from: a */
    public static final cc4 f66833a;

    static {
        of4 of4Var = new of4();
        e20 e20Var = e20.f36605a;
        of4Var.mo12901e(wh8.class, e20Var);
        of4Var.mo12901e(g50.class, e20Var);
        f66833a = new cc4(of4Var);
    }

    /* JADX INFO: renamed from: a */
    public static g50 m23952a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return m23953b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    /* JADX INFO: renamed from: b */
    public static g50 m23953b(String str, String str2, String str3, String str4, long j) {
        if (str3.length() > 256) {
            str3 = str3.substring(0, 256);
        }
        return new g50(str, str2, str3, str4, j);
    }

    /* JADX INFO: renamed from: c */
    public final b40 m23954c() {
        a40 a40Var = new a40();
        g50 g50Var = (g50) this;
        String str = g50Var.f40220e;
        if (str == null) {
            C3386nv.m17635v("Null variantId");
            return null;
        }
        String str2 = g50Var.f40217b;
        if (str2 == null) {
            C3386nv.m17635v("Null rolloutId");
            return null;
        }
        a40Var.f194a = new c40(str2, str);
        a40Var.m98b(g50Var.f40218c);
        a40Var.f196c = g50Var.f40219d;
        a40Var.m99c(g50Var.f40221f);
        return a40Var.m97a();
    }
}
