package p000;

import androidx.compose.runtime.internal.C0282a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o1c {

    /* JADX INFO: renamed from: a */
    public static final C0282a f53607a = new C0282a(-776390092, false, new wd1(5));

    /* JADX INFO: renamed from: a */
    public static ny8 m17753a(JSONObject jSONObject) {
        return new ny8(jSONObject.optString("branch", null), jSONObject.optString("source", null), jSONObject.optString("version", null), jSONObject.optString("versionId", null), 8);
    }
}
