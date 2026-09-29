package p000;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class gb4 {

    /* JADX INFO: renamed from: a */
    public final boolean f40488a;

    /* JADX INFO: renamed from: b */
    public final int f40489b;

    /* JADX INFO: renamed from: c */
    public final String f40490c;

    /* JADX INFO: renamed from: d */
    public final JSONObject f40491d;

    /* JADX INFO: renamed from: e */
    public final String f40492e;

    public gb4(boolean z, int i, String str, JSONObject jSONObject, String str2) {
        this.f40488a = z;
        this.f40489b = i;
        this.f40490c = str;
        this.f40491d = jSONObject;
        this.f40492e = str2;
    }

    /* JADX INFO: renamed from: a */
    public static gb4 m12463a(int i, String str, JSONObject jSONObject, String str2) {
        return new gb4(false, i, str, jSONObject, str2);
    }

    /* JADX INFO: renamed from: b */
    public static gb4 m12464b(int i, String str, JSONObject jSONObject) {
        return new gb4(true, i, str, jSONObject, null);
    }
}
