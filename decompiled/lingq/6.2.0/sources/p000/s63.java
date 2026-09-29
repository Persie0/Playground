package p000;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class s63 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f60402a;

    public s63(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new ol7(jSONObjectOptJSONObject));
                }
            }
        }
        this.f60402a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public ArrayList m21126a() {
        return this.f60402a;
    }

    public s63() {
        this.f60402a = new ArrayList();
        new ArrayList();
        new ArrayList();
    }
}
