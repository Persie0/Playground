package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class v23 {

    /* JADX INFO: renamed from: a */
    public static final v23 f64723a = new v23();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f64724b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final ConcurrentLinkedQueue f64725c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f64726d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static volatile Long f64727e;

    /* JADX INFO: renamed from: f */
    public static volatile ic2 f64728f;

    /* JADX INFO: renamed from: a */
    public static JSONObject m23053a() {
        Bundle bundleM12429f = g9a.m12429f("platform", "android");
        sy2 sy2Var = sy2.f61585a;
        bundleM12429f.putString("sdk_version", "18.2.3");
        bundleM12429f.putString("fields", "gatekeepers");
        String str = mp3.f51688j;
        mp3 mp3VarM21068p = s46.m21068p(null, String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1)), null);
        mp3VarM21068p.f51694d = bundleM12429f;
        JSONObject jSONObject = mp3VarM21068p.m16982c().f56630d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m23054b(String str, String str2, boolean z) {
        HashMap map;
        ConcurrentHashMap concurrentHashMap;
        Boolean bool;
        str.getClass();
        v23 v23Var = f64723a;
        ArrayList<bk3> arrayList = null;
        m23055d(null);
        if (v23Var.m23058c(str2) == null) {
            map = new HashMap();
        } else {
            ic2 ic2Var = f64728f;
            if (ic2Var != null && (concurrentHashMap = (ConcurrentHashMap) ic2Var.f43919a.get(str2)) != null) {
                arrayList = new ArrayList(concurrentHashMap.size());
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((bk3) ((Map.Entry) it.next()).getValue());
                }
            }
            if (arrayList != null) {
                map = new HashMap();
                for (bk3 bk3Var : arrayList) {
                    map.put(bk3Var.f8633a, Boolean.valueOf(bk3Var.f8634b));
                }
            } else {
                HashMap map2 = new HashMap();
                JSONObject jSONObjectM23058c = v23Var.m23058c(str2);
                if (jSONObjectM23058c == null) {
                    jSONObjectM23058c = new JSONObject();
                }
                Iterator<String> itKeys = jSONObjectM23058c.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    next.getClass();
                    map2.put(next, Boolean.valueOf(jSONObjectM23058c.optBoolean(next)));
                }
                ic2 ic2Var2 = f64728f;
                if (ic2Var2 == null) {
                    ic2Var2 = new ic2(1);
                }
                ArrayList<bk3> arrayList2 = new ArrayList(map2.size());
                for (Map.Entry entry : map2.entrySet()) {
                    arrayList2.add(new bk3((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                for (bk3 bk3Var2 : arrayList2) {
                    concurrentHashMap2.put(bk3Var2.f8633a, bk3Var2);
                }
                ic2Var2.f43919a.put(str2, concurrentHashMap2);
                f64728f = ic2Var2;
                map = map2;
            }
        }
        return (map.containsKey(str) && (bool = (Boolean) map.get(str)) != null) ? bool.booleanValue() : z;
    }

    /* JADX INFO: renamed from: d */
    public static final synchronized void m23055d(o13 o13Var) {
        if (o13Var != null) {
            try {
                f64725c.add(o13Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        String strM21767b = sy2.m21767b();
        v23 v23Var = f64723a;
        Long l = f64727e;
        if (l != null && System.currentTimeMillis() - l.longValue() < 3600000 && v23Var.m23058c(strM21767b) != null) {
            m23057f();
            return;
        }
        Context contextM21766a = sy2.m21766a();
        String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strM21767b}, 1));
        JSONObject jSONObject = null;
        String string = contextM21766a.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
        if (!bna.m3945d0(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException unused) {
                sy2 sy2Var = sy2.f61585a;
            }
            if (jSONObject != null) {
                m23056e(strM21767b, jSONObject);
            }
        }
        Executor executorM21768c = sy2.m21768c();
        if (f64724b.compareAndSet(false, true)) {
            executorM21768c.execute(new u23(strM21767b, contextM21766a, str));
        }
    }

    /* JADX INFO: renamed from: e */
    public static final synchronized JSONObject m23056e(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        try {
            JSONObject jSONObjectM23058c = f64723a.m23058c(str);
            jSONObject2 = jSONObjectM23058c != null ? new JSONObject(jSONObjectM23058c.toString()) : new JSONObject();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.optJSONObject(0) : null;
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            int length = jSONArrayOptJSONArray2.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i);
                    jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean("value"));
                } catch (JSONException unused) {
                    sy2 sy2Var = sy2.f61585a;
                }
            }
            synchronized (f64723a) {
                f64726d.put(str, jSONObject2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: f */
    public static void m23057f() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f64725c;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            o13 o13Var = (o13) concurrentLinkedQueue.poll();
            if (o13Var != null) {
                handler.post(new RunnableC0002a0(o13Var, 10));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized JSONObject m23058c(String str) {
        return (JSONObject) f64726d.get(str);
    }
}
