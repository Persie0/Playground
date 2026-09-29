package p000;

import android.util.Log;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: z2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3818z2 implements kp3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicBoolean f70766a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HashSet f70767b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ HashSet f70768c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ HashSet f70769d;

    public /* synthetic */ C3818z2(AtomicBoolean atomicBoolean, HashSet hashSet, HashSet hashSet2, HashSet hashSet3) {
        this.f70766a = atomicBoolean;
        this.f70767b = hashSet;
        this.f70768c = hashSet2;
        this.f70769d = hashSet3;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    @Override // p000.kp3
    /* JADX INFO: renamed from: a */
    public final void mo3204a(pp3 pp3Var) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObject = pp3Var.f56630d;
        if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) == null) {
            return;
        }
        this.f70766a.set(true);
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("permission");
                String strOptString2 = jSONObjectOptJSONObject.optString("status");
                if (!bna.m3945d0(strOptString) && !bna.m3945d0(strOptString2)) {
                    strOptString2.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strOptString2.toLowerCase(locale);
                    lowerCase.getClass();
                    int iHashCode = lowerCase.hashCode();
                    if (iHashCode != -1309235419) {
                        if (iHashCode != 280295099) {
                            if (iHashCode == 568196142 && lowerCase.equals("declined")) {
                                this.f70768c.add(strOptString);
                            } else {
                                Log.w("AccessTokenManager", "Unexpected status: ".concat(lowerCase));
                            }
                        } else if (lowerCase.equals("granted")) {
                            this.f70767b.add(strOptString);
                        } else {
                            Log.w("AccessTokenManager", "Unexpected status: ".concat(lowerCase));
                        }
                    } else if (lowerCase.equals("expired")) {
                        this.f70769d.add(strOptString);
                    } else {
                        Log.w("AccessTokenManager", "Unexpected status: ".concat(lowerCase));
                    }
                }
            }
        }
    }
}
