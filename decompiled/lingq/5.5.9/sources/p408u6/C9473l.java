package p408u6;

import androidx.activity.result.C0204c;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: u6.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9473l {

    /* JADX INFO: renamed from: a */
    public String f48564a;

    /* JADX INFO: renamed from: b */
    public long f48565b;

    /* JADX INFO: renamed from: c */
    public long f48566c;

    /* JADX INFO: renamed from: d */
    public String f48567d;

    /* JADX INFO: renamed from: e */
    public JSONObject f48568e;

    /* JADX INFO: renamed from: f */
    public boolean f48569f;

    /* JADX INFO: renamed from: g */
    public final List<String> f48570g;

    /* JADX INFO: renamed from: h */
    public String f48571h;

    /* JADX INFO: renamed from: i */
    public JSONObject f48572i;

    public C9473l() {
        this.f48570g = new ArrayList();
    }

    public C9473l(String str, JSONObject jSONObject, long j10, long j11, String str2, ArrayList arrayList, String str3, JSONObject jSONObject2) {
        this.f48570g = new ArrayList();
        this.f48567d = str;
        this.f48568e = jSONObject;
        this.f48569f = false;
        this.f48565b = j10;
        this.f48566c = j11;
        this.f48571h = str2;
        this.f48570g = arrayList;
        this.f48564a = str3;
        this.f48572i = jSONObject2;
    }

    /* JADX INFO: renamed from: b */
    public static C9473l m17891b(String str, JSONObject jSONObject) {
        try {
            String string = jSONObject.has("_id") ? jSONObject.getString("_id") : null;
            long j10 = jSONObject.has("date") ? jSONObject.getInt("date") : System.currentTimeMillis() / 1000;
            long j11 = jSONObject.has("wzrk_ttl") ? jSONObject.getInt("wzrk_ttl") : (System.currentTimeMillis() + 86400000) / 1000;
            JSONObject jSONObject2 = jSONObject.has("msg") ? jSONObject.getJSONObject("msg") : null;
            ArrayList arrayList = new ArrayList();
            if (jSONObject2 != null) {
                JSONArray jSONArray = jSONObject2.has("tags") ? jSONObject2.getJSONArray("tags") : null;
                if (jSONArray != null) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        arrayList.add(jSONArray.getString(i10));
                    }
                }
            }
            String string2 = jSONObject.has("wzrk_id") ? jSONObject.getString("wzrk_id") : "0_0";
            if (string2.equalsIgnoreCase("0_0")) {
                jSONObject.put("wzrk_id", string2);
            }
            JSONObject jSONObject3 = new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.startsWith("wzrk_")) {
                    jSONObject3.put(next, jSONObject.get(next));
                }
            }
            if (string == null) {
                return null;
            }
            return new C9473l(string, jSONObject2, j10, j11, str, arrayList, string2, jSONObject3);
        } catch (JSONException e10) {
            C2181a.m6449a("Unable to parse Notification inbox message to CTMessageDao - " + e10.getLocalizedMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17892a() {
        C2181a.m6449a("CTMessageDAO:containsVideoOrAudio() called");
        CTInboxMessageContent cTInboxMessageContent = new CTInboxMessage(m17894d()).f11285j.get(0);
        return cTInboxMessageContent.m6553n() || cTInboxMessageContent.m6550j();
    }

    /* JADX INFO: renamed from: c */
    public final void m17893c(String str) {
        this.f48570g.addAll(Arrays.asList(str.split(",")));
    }

    /* JADX INFO: renamed from: d */
    public final JSONObject m17894d() {
        List<String> list = this.f48570g;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f48567d);
            jSONObject.put("msg", this.f48568e);
            jSONObject.put("isRead", this.f48569f);
            jSONObject.put("date", this.f48565b);
            jSONObject.put("wzrk_ttl", this.f48566c);
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < list.size(); i10++) {
                jSONArray.put(list.get(i10));
            }
            jSONObject.put("tags", jSONArray);
            jSONObject.put("wzrk_id", this.f48564a);
            jSONObject.put("wzrkParams", this.f48572i);
            return jSONObject;
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Unable to convert CTMessageDao to JSON - "));
            return jSONObject;
        }
    }
}
