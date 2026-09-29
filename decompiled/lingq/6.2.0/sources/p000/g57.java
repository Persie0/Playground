package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class g57 {

    /* JADX INFO: renamed from: a */
    public final String f40234a;

    /* JADX INFO: renamed from: b */
    public final int f40235b;

    /* JADX INFO: renamed from: c */
    public final int f40236c;

    /* JADX INFO: renamed from: d */
    public final String f40237d;

    /* JADX INFO: renamed from: e */
    public final String f40238e;

    /* JADX INFO: renamed from: f */
    public final String f40239f;

    /* JADX INFO: renamed from: g */
    public final String f40240g;

    /* JADX INFO: renamed from: h */
    public final int f40241h;

    public g57(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("class_name");
        string.getClass();
        this.f40234a = string;
        this.f40235b = jSONObject.optInt("index", -1);
        this.f40236c = jSONObject.optInt("id");
        String strOptString = jSONObject.optString("text");
        strOptString.getClass();
        this.f40237d = strOptString;
        String strOptString2 = jSONObject.optString("tag");
        strOptString2.getClass();
        this.f40238e = strOptString2;
        String strOptString3 = jSONObject.optString("description");
        strOptString3.getClass();
        this.f40239f = strOptString3;
        String strOptString4 = jSONObject.optString("hint");
        strOptString4.getClass();
        this.f40240g = strOptString4;
        this.f40241h = jSONObject.optInt("match_bitmask");
    }

    /* JADX INFO: renamed from: a */
    public final String m12366a() {
        return this.f40234a;
    }

    /* JADX INFO: renamed from: b */
    public final String m12367b() {
        return this.f40239f;
    }

    /* JADX INFO: renamed from: c */
    public final String m12368c() {
        return this.f40240g;
    }

    /* JADX INFO: renamed from: d */
    public final int m12369d() {
        return this.f40236c;
    }

    /* JADX INFO: renamed from: e */
    public final int m12370e() {
        return this.f40235b;
    }

    /* JADX INFO: renamed from: f */
    public final int m12371f() {
        return this.f40241h;
    }

    /* JADX INFO: renamed from: g */
    public final String m12372g() {
        return this.f40238e;
    }

    /* JADX INFO: renamed from: h */
    public final String m12373h() {
        return this.f40237d;
    }
}
