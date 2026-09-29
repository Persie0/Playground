package p290o6;

import android.content.Context;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.p049db.DBAdapter;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o6.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7959h0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f43336a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f43337b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C7963j0 f43338c;

    public RunnableC7959h0(C7963j0 c7963j0, Context context, String str) {
        this.f43338c = c7963j0;
        this.f43336a = context;
        this.f43337b = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C7963j0 c7963j0 = this.f43338c;
        if (c7963j0.f43351e == null) {
            c7963j0.f43351e = new DBAdapter(this.f43336a, this.f43338c.f43349c);
        }
        synchronized (this.f43338c.f43348b) {
            try {
                try {
                    JSONObject jSONObjectM6469f = this.f43338c.f43351e.m6469f(this.f43337b);
                    if (jSONObjectM6469f == null) {
                        return;
                    }
                    Iterator<String> itKeys = jSONObjectM6469f.keys();
                    while (itKeys.hasNext()) {
                        try {
                            String next = itKeys.next();
                            Object obj = jSONObjectM6469f.get(next);
                            if (obj instanceof JSONObject) {
                                this.f43338c.f43348b.put(next, jSONObjectM6469f.getJSONObject(next));
                            } else if (obj instanceof JSONArray) {
                                this.f43338c.f43348b.put(next, jSONObjectM6469f.getJSONArray(next));
                            } else {
                                this.f43338c.f43348b.put(next, obj);
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    C2181a c2181aM15784d = this.f43338c.m15784d();
                    String str = this.f43338c.f43349c.f10995a;
                    String str2 = "Local Data Store - Inflated local profile " + this.f43338c.f43348b.toString();
                    c2181aM15784d.getClass();
                    C2181a.m6460m(str, str2);
                } catch (Throwable unused2) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
