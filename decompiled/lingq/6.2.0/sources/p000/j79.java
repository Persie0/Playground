package p000;

import androidx.compose.runtime.AbstractC0278f;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j79 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45163a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f45164b;

    public /* synthetic */ j79(String str, int i) {
        this.f45163a = i;
        this.f45164b = str;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        JSONArray jSONArrayOptJSONArray;
        int i = this.f45163a;
        String str = this.f45164b;
        switch (i) {
            case 0:
                return AbstractC0278f.m1260j(str);
            case 1:
                str.getClass();
                if (nj0.f52798Q == null) {
                    C3386nv.m17633t("You have to initialize apiKey before use");
                    return null;
                }
                try {
                    String strM17453p = nj0.m17453p(nj0.m17449j("api/user/subscriptions", AbstractC3194a.m15364Q(new Pair("user", str))));
                    if (strM17453p != null) {
                        return qba.m19851c(new JSONObject(strM17453p));
                    }
                    return null;
                } catch (Exception e) {
                    System.out.println((Object) ("Failed to fetch subscription status: " + e.getLocalizedMessage()));
                    return null;
                }
            default:
                str.getClass();
                if (nj0.f52798Q == null) {
                    C3386nv.m17633t("You have to initialize apiKey before use");
                    return null;
                }
                try {
                    String strM17453p2 = nj0.m17453p(nj0.m17449j("api/user/properties", AbstractC3194a.m15364Q(new Pair("user", str))));
                    if (strM17453p2 != null && (jSONArrayOptJSONArray = new JSONObject(strM17453p2).optJSONArray("properties")) != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int length = jSONArrayOptJSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                            linkedHashMap.put(jSONObject.optString("property"), jSONObject.optString("value"));
                        }
                        return linkedHashMap;
                    }
                    return null;
                } catch (Exception e2) {
                    System.out.println((Object) ("Failed to fetch properties: " + e2.getLocalizedMessage()));
                    return null;
                }
        }
    }
}
