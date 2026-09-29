package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class nd2 {

    /* JADX INFO: renamed from: a */
    public final Map f52616a;

    /* JADX INFO: renamed from: b */
    public final Map f52617b;

    /* JADX INFO: renamed from: c */
    public final Map f52618c;

    /* JADX INFO: renamed from: d */
    public final List f52619d;

    public nd2(Map map, Map map2, LinkedHashMap linkedHashMap, List list) {
        this.f52616a = map;
        this.f52617b = map2;
        this.f52618c = linkedHashMap;
        this.f52619d = list;
    }

    /* JADX INFO: renamed from: a */
    public final String m17376a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map map = this.f52616a;
        if (map != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
            }
            jSONObject.put("tags", jSONObject2);
        }
        Map map2 = this.f52617b;
        if (map2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry entry2 : map2.entrySet()) {
                jSONObject3.put((String) entry2.getKey(), ((Number) entry2.getValue()).longValue());
            }
            jSONObject.put("counters", jSONObject3);
        }
        Map map3 = this.f52618c;
        if (map3 != null) {
            JSONObject jSONObject4 = new JSONObject();
            for (Map.Entry entry3 : map3.entrySet()) {
                String str = (String) entry3.getKey();
                wt3 wt3Var = (wt3) entry3.getValue();
                wt3Var.getClass();
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("count", wt3Var.f67267a);
                jSONObject5.put("min", wt3Var.f67268b);
                jSONObject5.put("max", wt3Var.f67269c);
                jSONObject5.put("avg", wt3Var.f67270d);
                jSONObject4.put(str, jSONObject5);
            }
            jSONObject.put("histogram", jSONObject4);
        }
        List list = this.f52619d;
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((md2) it.next()).m16781a());
            }
            jSONObject.put("events", jSONArray);
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd2)) {
            return false;
        }
        nd2 nd2Var = (nd2) obj;
        return fa4.m11650l(this.f52616a, nd2Var.f52616a) && fa4.m11650l(this.f52617b, nd2Var.f52617b) && fa4.m11650l(this.f52618c, nd2Var.f52618c) && fa4.m11650l(this.f52619d, nd2Var.f52619d);
    }

    public final int hashCode() {
        Map map = this.f52616a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.f52617b;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.f52618c;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        List list = this.f52619d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "DiagnosticsPayload(tags=" + this.f52616a + ", counters=" + this.f52617b + ", histograms=" + this.f52618c + ", events=" + this.f52619d + ')';
    }
}
