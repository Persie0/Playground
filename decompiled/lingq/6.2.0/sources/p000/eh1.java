package p000;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class eh1 {

    /* JADX INFO: renamed from: e */
    public static final Date f37248e = new Date(-1);

    /* JADX INFO: renamed from: f */
    public static final Date f37249f = new Date(-1);

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f37250a;

    /* JADX INFO: renamed from: b */
    public final Object f37251b = new Object();

    /* JADX INFO: renamed from: c */
    public final Object f37252c = new Object();

    /* JADX INFO: renamed from: d */
    public final Object f37253d = new Object();

    public eh1(SharedPreferences sharedPreferences) {
        this.f37250a = sharedPreferences;
    }

    /* JADX INFO: renamed from: a */
    public final ztb m11146a() {
        ztb ztbVar;
        synchronized (this.f37252c) {
            int i = this.f37250a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f37250a.getLong("backoff_end_time_in_millis", -1L));
            ztbVar = new ztb(3, (byte) 0);
            ztbVar.f72161b = i;
            ztbVar.f72162c = date;
        }
        return ztbVar;
    }

    /* JADX INFO: renamed from: b */
    public final HashMap m11147b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f37250a.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* JADX INFO: renamed from: c */
    public final C3126ix m11148c() {
        C3126ix c3126ix;
        synchronized (this.f37253d) {
            int i = this.f37250a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f37250a.getLong("realtime_backoff_end_time_in_millis", -1L));
            c3126ix = new C3126ix(1, (byte) 0);
            c3126ix.f44720b = i;
            c3126ix.f44721c = date;
        }
        return c3126ix;
    }

    /* JADX INFO: renamed from: d */
    public final void m11149d(int i, Date date) {
        synchronized (this.f37252c) {
            this.f37250a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11150e(int i, Date date) {
        synchronized (this.f37253d) {
            this.f37250a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
