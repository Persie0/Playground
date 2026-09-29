package p000;

import android.util.Log;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class l53 {

    /* JADX INFO: renamed from: a */
    public final m43 f49072a;

    /* JADX INFO: renamed from: b */
    public final Executor f49073b;

    /* JADX INFO: renamed from: c */
    public final qg1 f49074c;

    /* JADX INFO: renamed from: d */
    public final qg1 f49075d;

    /* JADX INFO: renamed from: e */
    public final xg1 f49076e;

    /* JADX INFO: renamed from: f */
    public final zg1 f49077f;

    /* JADX INFO: renamed from: g */
    public final eh1 f49078g;

    /* JADX INFO: renamed from: h */
    public final b64 f49079h;

    /* JADX INFO: renamed from: i */
    public final ny8 f49080i;

    public l53(m43 m43Var, Executor executor, qg1 qg1Var, qg1 qg1Var2, qg1 qg1Var3, xg1 xg1Var, zg1 zg1Var, eh1 eh1Var, b64 b64Var, ny8 ny8Var) {
        this.f49072a = m43Var;
        this.f49073b = executor;
        this.f49074c = qg1Var;
        this.f49075d = qg1Var2;
        this.f49076e = xg1Var;
        this.f49077f = zg1Var;
        this.f49078g = eh1Var;
        this.f49079h = b64Var;
        this.f49080i = ny8Var;
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m15810d(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final HashMap m15811a() {
        String string;
        o53 o53Var;
        zg1 zg1Var = this.f49077f;
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(zg1.m25599a(zg1Var.f71519c));
        hashSet.addAll(zg1.m25599a(zg1Var.f71520d));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            sg1 sg1VarM19941c = zg1Var.f71519c.m19941c();
            String string2 = null;
            if (sg1VarM19941c == null) {
                string = null;
            } else {
                try {
                    string = sg1VarM19941c.f60806b.getString(str);
                } catch (JSONException unused) {
                    string = null;
                }
            }
            int i = 0;
            if (string != null) {
                sg1 sg1VarM19941c2 = zg1Var.f71519c.m19941c();
                if (sg1VarM19941c2 != null) {
                    synchronized (zg1Var.f71517a) {
                        try {
                            Iterator it = zg1Var.f71517a.iterator();
                            while (it.hasNext()) {
                                zg1Var.f71518b.execute(new yg1((f58) it.next(), str, sg1VarM19941c2, i));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                o53Var = new o53(string, 2);
            } else {
                sg1 sg1VarM19941c3 = zg1Var.f71520d.m19941c();
                if (sg1VarM19941c3 != null) {
                    try {
                        string2 = sg1VarM19941c3.f60806b.getString(str);
                    } catch (JSONException unused2) {
                    }
                }
                if (string2 != null) {
                    o53Var = new o53(string2, 1);
                } else {
                    Log.w("FirebaseRemoteConfig", "No value of type 'FirebaseRemoteConfigValue' exists for parameter key '" + str + "'.");
                    o53Var = new o53("", 0);
                }
            }
            map.put(str, o53Var);
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public final oj5 m15812b() {
        oj5 oj5Var;
        eh1 eh1Var = this.f49078g;
        synchronized (eh1Var.f37251b) {
            try {
                eh1Var.f37250a.getLong("last_fetch_time_in_millis", -1L);
                int i = eh1Var.f37250a.getInt("last_fetch_status", 0);
                long j = eh1Var.f37250a.getLong("fetch_timeout_in_seconds", 60L);
                if (j < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
                }
                long j2 = eh1Var.f37250a.getLong("minimum_fetch_interval_in_seconds", 43200L);
                if (j2 < 0) {
                    throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j2 + " is an invalid argument");
                }
                oj5Var = new oj5(i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return oj5Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m15813c(boolean z) {
        HttpURLConnection httpURLConnection;
        b64 b64Var = this.f49079h;
        synchronized (b64Var) {
            ch1 ch1Var = (ch1) b64Var.f8007b;
            synchronized (ch1Var.f10081r) {
                try {
                    ch1Var.f10068e = z;
                    mg1 mg1Var = ch1Var.f10070g;
                    if (mg1Var != null) {
                        mg1Var.m16823e(z);
                    }
                    if (z && (httpURLConnection = ch1Var.f10069f) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                synchronized (b64Var) {
                    if (!((LinkedHashSet) b64Var.f8006a).isEmpty()) {
                        ((ch1) b64Var.f8007b).m4653e(0L);
                    }
                }
            }
        }
    }
}
