package p067d8;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.RunnableC0191j;
import com.facebook.GraphRequest;
import dm.C5207g;
import dm.C5209i;
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
import p089e8.C5384a;
import p290o6.C7967l0;
import p291o7.C8004n;
import p527z7.RunnableC10453a;

/* JADX INFO: renamed from: d8.m */
/* JADX INFO: loaded from: classes.dex */
public final class C5073m {

    /* JADX INFO: renamed from: a */
    public static final C5073m f32961a = new C5073m();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f32962b;

    /* JADX INFO: renamed from: c */
    public static final ConcurrentLinkedQueue<a> f32963c;

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f32964d;

    /* JADX INFO: renamed from: e */
    public static Long f32965e;

    /* JADX INFO: renamed from: f */
    public static C7967l0 f32966f;

    /* JADX INFO: renamed from: d8.m$a */
    public interface a {
        /* JADX INFO: renamed from: d */
        void mo10768d();
    }

    static {
        C5209i.m11118a(C5073m.class).mo10976p();
        f32962b = new AtomicBoolean(false);
        f32963c = new ConcurrentLinkedQueue<>();
        f32964d = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m10769a() {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        C8004n c8004n = C8004n.f43550a;
        bundle.putString("sdk_version", "16.0.1");
        bundle.putString("fields", "gatekeepers");
        String str = GraphRequest.f11448j;
        String str2 = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        C5207g.m11110e(str2, "java.lang.String.format(format, *args)");
        GraphRequest graphRequestM6621g = GraphRequest.C2279c.m6621g(null, str2, null);
        graphRequestM6621g.f11454d = bundle;
        JSONObject jSONObject = graphRequestM6621g.m6606c().f43589d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m10770b(String str, String str2, boolean z10) {
        HashMap map;
        ConcurrentHashMap concurrentHashMap;
        Boolean bool;
        C5207g.m11111f(str, "name");
        f32961a.getClass();
        ArrayList<C5384a> arrayList = null;
        m10771c(null);
        ConcurrentHashMap concurrentHashMap2 = f32964d;
        if (concurrentHashMap2.containsKey(str2)) {
            C7967l0 c7967l0 = f32966f;
            if (c7967l0 != null && (concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) c7967l0.f43382a).get(str2)) != null) {
                arrayList = new ArrayList(concurrentHashMap.size());
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((C5384a) ((Map.Entry) it.next()).getValue());
                }
            }
            if (arrayList != null) {
                map = new HashMap();
                for (C5384a c5384a : arrayList) {
                    map.put(c5384a.f33802a, Boolean.valueOf(c5384a.f33803b));
                }
            } else {
                HashMap map2 = new HashMap();
                JSONObject jSONObject = (JSONObject) concurrentHashMap2.get(str2);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    C5207g.m11110e(next, "key");
                    map2.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                C7967l0 c7967l1 = f32966f;
                if (c7967l1 == null) {
                    c7967l1 = new C7967l0(5);
                }
                ArrayList<C5384a> arrayList2 = new ArrayList(map2.size());
                for (Map.Entry entry : map2.entrySet()) {
                    arrayList2.add(new C5384a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
                for (C5384a c5384a2 : arrayList2) {
                    concurrentHashMap3.put(c5384a2.f33802a, c5384a2);
                }
                ((ConcurrentHashMap) c7967l1.f43382a).put(str2, concurrentHashMap3);
                f32966f = c7967l1;
                map = map2;
            }
        } else {
            map = new HashMap();
        }
        return (map.containsKey(str) && (bool = (Boolean) map.get(str)) != null) ? bool.booleanValue() : z10;
    }

    /* JADX INFO: renamed from: c */
    public static final synchronized void m10771c(C5072l c5072l) {
        if (c5072l != null) {
            try {
                f32963c.add(c5072l);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        String strM15872b = C8004n.m15872b();
        C5073m c5073m = f32961a;
        Long l10 = f32965e;
        c5073m.getClass();
        if ((l10 != null && System.currentTimeMillis() - l10.longValue() < 3600000) && f32964d.containsKey(strM15872b)) {
            m10773e();
            return;
        }
        Context contextM15871a = C8004n.m15871a();
        String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strM15872b}, 1));
        C5207g.m11110e(str, "java.lang.String.format(format, *args)");
        JSONObject jSONObject = null;
        String string = contextM15871a.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
        if (!C5086z.m10802A(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                C5086z.m10806E("FacebookSDK", e10);
            }
            if (jSONObject != null) {
                m10772d(strM15872b, jSONObject);
            }
        }
        Executor executorM15873c = C8004n.m15873c();
        if (f32962b.compareAndSet(false, true)) {
            executorM15873c.execute(new RunnableC10453a(contextM15871a, strM15872b, str));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final synchronized JSONObject m10772d(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        jSONObject2 = (JSONObject) f32964d.get(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        int i10 = 0;
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray == null ? null : jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
        if (jSONArrayOptJSONArray2 == null) {
            jSONArrayOptJSONArray2 = new JSONArray();
        }
        int length = jSONArrayOptJSONArray2.length();
        if (length > 0) {
            while (true) {
                int i11 = i10 + 1;
                try {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i10);
                    jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean("value"));
                } catch (JSONException e10) {
                    C5086z.m10806E("FacebookSDK", e10);
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        f32964d.put(str, jSONObject2);
        return jSONObject2;
    }

    /* JADX INFO: renamed from: e */
    public static void m10773e() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = f32963c;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            a aVarPoll = concurrentLinkedQueue.poll();
            if (aVarPoll != null) {
                handler.post(new RunnableC0191j(7, aVarPoll));
            }
        }
    }
}
