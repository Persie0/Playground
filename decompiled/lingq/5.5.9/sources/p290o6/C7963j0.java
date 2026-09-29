package p290o6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteException;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.p049db.DBAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0009a;
import p357r6.C8739a;

/* JADX INFO: renamed from: o6.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7963j0 {

    /* JADX INFO: renamed from: g */
    public static long f43346g;

    /* JADX INFO: renamed from: c */
    public final CleverTapInstanceConfig f43349c;

    /* JADX INFO: renamed from: d */
    public final Context f43350d;

    /* JADX INFO: renamed from: e */
    public DBAdapter f43351e;

    /* JADX INFO: renamed from: a */
    public final HashMap<String, Integer> f43347a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public final HashMap<String, Object> f43348b = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public final ExecutorService f43352f = Executors.newFixedThreadPool(1);

    /* JADX INFO: renamed from: o6.j0$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f43353a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f43354b;

        public a(String str, Runnable runnable) {
            this.f43353a = str;
            this.f43354b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7963j0 c7963j0 = C7963j0.this;
            C7963j0.f43346g = Thread.currentThread().getId();
            try {
                C2181a c2181aM15784d = c7963j0.m15784d();
                String str = c7963j0.f43349c.f10995a;
                String str2 = "Local Data Store Executor service: Starting task - " + this.f43353a;
                c2181aM15784d.getClass();
                C2181a.m6460m(str, str2);
                this.f43354b.run();
            } catch (Throwable th2) {
                C2181a c2181aM15784d2 = c7963j0.m15784d();
                String str3 = c7963j0.f43349c.f10995a;
                c2181aM15784d2.getClass();
                C2181a.m6461n(str3, "Executor service: Failed to complete the scheduled task", th2);
            }
        }
    }

    public C7963j0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f43350d = context;
        this.f43349c = cleverTapInstanceConfig;
        m15789i("LocalDataStore#inflateLocalProfileAsync", new RunnableC7959h0(this, context, cleverTapInstanceConfig.f10995a));
    }

    /* JADX INFO: renamed from: b */
    public static C8739a m15781b(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        String[] strArrSplit = str2.split("\\|");
        return new C8739a(str, Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
    }

    /* JADX INFO: renamed from: c */
    public static String m15782c(int i10, int i11, int i12) {
        return i12 + "|" + i10 + "|" + i11;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final void m15783a() {
        synchronized (this.f43347a) {
            this.f43347a.clear();
        }
        synchronized (this.f43348b) {
            this.f43348b.clear();
        }
        String str = this.f43349c.f10995a;
        DBAdapter dBAdapter = this.f43351e;
        synchronized (dBAdapter) {
            if (str == null) {
                return;
            }
            try {
                String name = DBAdapter.Table.USER_PROFILES.getName();
                try {
                    try {
                        dBAdapter.f11040b.getWritableDatabase().delete(name, "_id = ?", new String[]{str});
                    } catch (SQLiteException unused) {
                        dBAdapter.m6470g().getClass();
                        C2181a.m6458k("Error removing user profile from " + name + " Recreating DB");
                        dBAdapter.f11040b.m6477a();
                    }
                    dBAdapter.f11040b.close();
                } catch (Throwable th2) {
                    dBAdapter.f11040b.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final C2181a m15784d() {
        return this.f43349c.m6433b();
    }

    /* JADX INFO: renamed from: e */
    public final int m15785e(String str, int i10) {
        boolean z10 = this.f43349c.f10988H;
        Context context = this.f43350d;
        if (!z10) {
            return C7977q0.m15824b(context, i10, m15794n(str));
        }
        int iM15824b = C7977q0.m15824b(context, -1000, m15794n(str));
        return iM15824b != -1000 ? iM15824b : C7977q0.m15824b(context, i10, str);
    }

    /* JADX INFO: renamed from: f */
    public final Object m15786f(String str) {
        Object obj;
        if (str != null) {
            synchronized (this.f43348b) {
                try {
                    obj = this.f43348b.get(str);
                } catch (Throwable th2) {
                    C2181a c2181aM15784d = m15784d();
                    String str2 = this.f43349c.f10995a;
                    c2181aM15784d.getClass();
                    C2181a.m6461n(str2, "Failed to retrieve local profile property", th2);
                }
            }
            return obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final String m15787g(String str, String str2, String str3) {
        boolean z10 = this.f43349c.f10988H;
        Context context = this.f43350d;
        if (!z10) {
            return C7977q0.m15827e(context, str3).getString(m15794n(str), str2);
        }
        String string = C7977q0.m15827e(context, str3).getString(m15794n(str), str2);
        return string != null ? string : C7977q0.m15827e(context, str3).getString(str, str2);
    }

    @SuppressLint({"CommitPrefEdits"})
    /* JADX INFO: renamed from: h */
    public final void m15788h(Context context, JSONObject jSONObject) {
        String str;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f43349c;
        try {
            String string = jSONObject.getString("evtName");
            if (string == null) {
                return;
            }
            if (cleverTapInstanceConfig.f10988H) {
                str = "local_events";
            } else {
                str = "local_events:" + cleverTapInstanceConfig.f10995a;
            }
            SharedPreferences sharedPreferencesM15827e = C7977q0.m15827e(context, str);
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            C8739a c8739aM15781b = m15781b(string, m15787g(string, m15782c(iCurrentTimeMillis, iCurrentTimeMillis, 0), str));
            String strM15782c = m15782c(c8739aM15781b.f46333b, iCurrentTimeMillis, c8739aM15781b.f46332a + 1);
            SharedPreferences.Editor editorEdit = sharedPreferencesM15827e.edit();
            editorEdit.putString(m15794n(string), strM15782c);
            C7977q0.m15830h(editorEdit);
        } catch (Throwable th2) {
            C2181a c2181aM15784d = m15784d();
            String str2 = cleverTapInstanceConfig.f10995a;
            c2181aM15784d.getClass();
            C2181a.m6461n(str2, "Failed to persist event locally", th2);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m15789i(String str, Runnable runnable) {
        try {
            if (Thread.currentThread().getId() == f43346g) {
                runnable.run();
            } else {
                this.f43352f.submit(new a(str, runnable));
            }
        } catch (Throwable th2) {
            C2181a c2181aM15784d = m15784d();
            String str2 = this.f43349c.f10995a;
            c2181aM15784d.getClass();
            C2181a.m6461n(str2, "Failed to submit task to the executor service", th2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m15790j(String str, Boolean bool) {
        if (str == null) {
            return;
        }
        try {
            synchronized (this.f43348b) {
                try {
                    try {
                        this.f43348b.remove(str);
                    } catch (Throwable th2) {
                        C2181a c2181aM15784d = m15784d();
                        String str2 = this.f43349c.f10995a;
                        String strConcat = "Failed to remove local profile value for key ".concat(str);
                        c2181aM15784d.getClass();
                        C2181a.m6461n(str2, strConcat, th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (!bool.booleanValue()) {
                m15798r(str);
            }
        } catch (Throwable unused) {
        }
        m15789i("LocalDataStore#persistLocalProfileAsync", new RunnableC7961i0(this, this.f43349c.f10995a));
    }

    /* JADX INFO: renamed from: k */
    public final void m15791k(JSONObject jSONObject) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f43349c;
        try {
            if (!cleverTapInstanceConfig.f10991K) {
                jSONObject.put("dsync", false);
                return;
            }
            String string = jSONObject.getString("type");
            boolean zEquals = "event".equals(string);
            String str = cleverTapInstanceConfig.f10995a;
            if (zEquals && "App Launched".equals(jSONObject.getString("evtName"))) {
                m15784d().getClass();
                C2181a.m6460m(str, "Local cache needs to be updated (triggered by App Launched)");
                jSONObject.put("dsync", true);
                return;
            }
            if ("profile".equals(string)) {
                jSONObject.put("dsync", true);
                m15784d().getClass();
                C2181a.m6460m(str, "Local cache needs to be updated (profile event)");
                return;
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (m15785e("local_cache_last_update", iCurrentTimeMillis) + m15785e("local_cache_expires_in", 1200) < iCurrentTimeMillis) {
                jSONObject.put("dsync", true);
                m15784d().getClass();
                C2181a.m6460m(str, "Local cache needs to be updated");
            } else {
                jSONObject.put("dsync", false);
                m15784d().getClass();
                C2181a.m6460m(str, "Local cache doesn't need to be updated");
            }
        } catch (Throwable th2) {
            C2181a c2181aM15784d = m15784d();
            String str2 = cleverTapInstanceConfig.f10995a;
            c2181aM15784d.getClass();
            C2181a.m6461n(str2, "Failed to sync with upstream", th2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m15792l(String str, Object obj, Boolean bool, boolean z10) {
        if (str != null) {
            if (obj == null) {
                return;
            }
            try {
                synchronized (this.f43348b) {
                    this.f43348b.put(str, obj);
                }
                if (!bool.booleanValue()) {
                    m15798r(str);
                }
            } catch (Throwable unused) {
            }
            if (z10) {
                m15789i("LocalDataStore#persistLocalProfileAsync", new RunnableC7961i0(this, this.f43349c.f10995a));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m15793m(JSONObject jSONObject, Boolean bool) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f43349c;
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String string = itKeys.next().toString();
                m15792l(string, jSONObject.get(string), bool, false);
            }
            m15789i("LocalDataStore#persistLocalProfileAsync", new RunnableC7961i0(this, cleverTapInstanceConfig.f10995a));
        } catch (Throwable th2) {
            C2181a c2181aM15784d = m15784d();
            String str = cleverTapInstanceConfig.f10995a;
            c2181aM15784d.getClass();
            C2181a.m6461n(str, "Failed to set profile fields", th2);
        }
    }

    /* JADX INFO: renamed from: n */
    public final String m15794n(String str) {
        StringBuilder sbM26o = C0009a.m26o(str, ":");
        sbM26o.append(this.f43349c.f10995a);
        return sbM26o.toString();
    }

    /* JADX INFO: renamed from: o */
    public final JSONObject m15795o(Context context, JSONObject jSONObject) {
        String str;
        String str2;
        Iterator<String> it;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f43349c;
        try {
            boolean z10 = cleverTapInstanceConfig.f10988H;
            String str3 = cleverTapInstanceConfig.f10995a;
            if (z10) {
                str = "local_events";
            } else {
                str = "local_events:" + str3;
            }
            String str4 = str;
            SharedPreferences sharedPreferencesM15827e = C7977q0.m15827e(context, str4);
            Iterator<String> itKeys = jSONObject.keys();
            SharedPreferences.Editor editorEdit = sharedPreferencesM15827e.edit();
            JSONObject jSONObject2 = null;
            while (itKeys.hasNext()) {
                String string = itKeys.next().toString();
                C8739a c8739aM15781b = m15781b(string, m15787g(string, m15782c(0, 0, 0), str4));
                JSONArray jSONArray = jSONObject.getJSONArray(string);
                if (jSONArray == null || jSONArray.length() < 3) {
                    str2 = str4;
                    it = itKeys;
                    m15784d().getClass();
                    C2181a.m6460m(str3, "Corrupted upstream event detail");
                } else {
                    try {
                        int i10 = jSONArray.getInt(0);
                        int i11 = jSONArray.getInt(1);
                        str2 = str4;
                        try {
                            int i12 = jSONArray.getInt(2);
                            it = itKeys;
                            if (i10 > c8739aM15781b.f46332a) {
                                editorEdit.putString(m15794n(string), m15782c(i11, i12, i10));
                                m15784d().getClass();
                                C2181a.m6460m(str3, "Accepted update for event " + string + " from upstream");
                                if (jSONObject2 == null) {
                                    try {
                                        jSONObject2 = jSONObject2;
                                        jSONObject2 = new JSONObject();
                                        jSONObject2 = jSONObject2;
                                    } catch (Throwable th2) {
                                        m15784d().getClass();
                                        C2181a.m6461n(str3, "Couldn't set event updates", th2);
                                    }
                                }
                                jSONObject2 = jSONObject2;
                                JSONObject jSONObject3 = new JSONObject();
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("oldValue", c8739aM15781b.f46332a);
                                jSONObject4.put("newValue", i10);
                                jSONObject3.put("count", jSONObject4);
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("oldValue", c8739aM15781b.f46333b);
                                jSONObject5.put("newValue", jSONArray.getInt(1));
                                jSONObject3.put("firstTime", jSONObject5);
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("oldValue", c8739aM15781b.f46334c);
                                jSONObject6.put("newValue", jSONArray.getInt(2));
                                jSONObject3.put("lastTime", jSONObject6);
                                jSONObject2.put(string, jSONObject3);
                            } else {
                                m15784d().getClass();
                                C2181a.m6460m(str3, "Rejected update for event " + string + " from upstream");
                            }
                        } catch (Throwable unused) {
                            it = itKeys;
                            C2181a c2181aM15784d = m15784d();
                            String str5 = "Failed to parse upstream event message: " + jSONArray.toString();
                            c2181aM15784d.getClass();
                            C2181a.m6460m(str3, str5);
                        }
                    } catch (Throwable unused2) {
                        str2 = str4;
                    }
                }
                str4 = str2;
                itKeys = it;
                jSONObject2 = jSONObject2;
            }
            C7977q0.m15830h(editorEdit);
            return jSONObject2;
        } catch (Throwable th3) {
            C2181a c2181aM15784d2 = m15784d();
            String str6 = cleverTapInstanceConfig.f10995a;
            c2181aM15784d2.getClass();
            C2181a.m6461n(str6, "Couldn't sync events from upstream", th3);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x001e A[SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public final JSONObject m15796p(JSONObject jSONObject) {
        Integer num;
        Integer num2;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject.length() <= 0) {
            return jSONObject3;
        }
        try {
            JSONObject jSONObject4 = new JSONObject();
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    String string = itKeys.next().toString();
                    int iCurrentTimeMillis2 = iCurrentTimeMillis <= 0 ? (int) (System.currentTimeMillis() / 1000) : iCurrentTimeMillis;
                    if (string == null) {
                        num2 = 0;
                    } else {
                        synchronized (this.f43347a) {
                            try {
                                num = this.f43347a.get(string);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        num2 = num;
                    }
                    boolean z10 = true;
                    if (Boolean.valueOf(num2 != null && num2.intValue() > iCurrentTimeMillis2).booleanValue()) {
                        C2181a c2181aM15784d = m15784d();
                        c2181aM15784d.getClass();
                        C2181a.m6460m(this.f43349c.f10995a, "Rejecting upstream value for key " + string + " because our local cache prohibits it");
                    } else {
                        Object objM15786f = m15786f(string);
                        Object obj = jSONObject.get(string);
                        if (obj != null) {
                            boolean z11 = (obj instanceof String) && ((String) obj).trim().length() == 0;
                            if (obj instanceof JSONArray) {
                                z10 = ((JSONArray) obj).length() <= 0;
                            } else {
                                z10 = z11;
                            }
                        }
                        if (z10) {
                            obj = null;
                        }
                        if (!Boolean.valueOf((obj == null ? "" : obj.toString()).equals(objM15786f == null ? "" : objM15786f.toString())).booleanValue()) {
                            if (obj != null) {
                                try {
                                    jSONObject4.put(string, obj);
                                } catch (Throwable th3) {
                                    C2181a c2181aM15784d2 = m15784d();
                                    String str = this.f43349c.f10995a;
                                    c2181aM15784d2.getClass();
                                    C2181a.m6461n(str, "Failed to set profile updates", th3);
                                }
                            } else {
                                m15790j(string, Boolean.TRUE);
                            }
                            if (objM15786f != null || obj != null) {
                                jSONObject2 = new JSONObject();
                                if (obj == null) {
                                    try {
                                        obj = -1;
                                    } catch (Throwable th4) {
                                        C2181a c2181aM15784d3 = m15784d();
                                        String str2 = this.f43349c.f10995a;
                                        c2181aM15784d3.getClass();
                                        C2181a.m6461n(str2, "Failed to create profile changed values object", th4);
                                        jSONObject2 = null;
                                    }
                                }
                                jSONObject2.put("newValue", obj);
                                if (objM15786f != null) {
                                    jSONObject2.put("oldValue", objM15786f);
                                }
                                if (jSONObject2 != null) {
                                    jSONObject3.put(string, jSONObject2);
                                }
                            }
                            jSONObject2 = null;
                            if (jSONObject2 != null) {
                                jSONObject3.put(string, jSONObject2);
                            }
                        }
                    }
                } catch (Throwable th5) {
                    C2181a c2181aM15784d4 = m15784d();
                    String str3 = this.f43349c.f10995a;
                    c2181aM15784d4.getClass();
                    C2181a.m6461n(str3, "Failed to update profile field", th5);
                }
            }
            if (jSONObject4.length() > 0) {
                m15793m(jSONObject4, Boolean.TRUE);
            }
            return jSONObject3;
        } catch (Throwable th6) {
            C2181a c2181aM15784d5 = m15784d();
            String str4 = this.f43349c.f10995a;
            c2181aM15784d5.getClass();
            C2181a.m6461n(str4, "Failed to sync remote profile", th6);
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m15797q(Context context, JSONObject jSONObject) {
        JSONObject jSONObjectM15796p;
        Object jSONArray;
        try {
            if (jSONObject.has("evpr")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evpr");
                if (jSONObject2.has("profile")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("profile");
                    if (jSONObject3.has("_custom")) {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("_custom");
                        jSONObject3.remove("_custom");
                        Iterator<String> itKeys = jSONObject4.keys();
                        loop0: while (true) {
                            while (true) {
                                if (!itKeys.hasNext()) {
                                    break loop0;
                                }
                                String string = itKeys.next().toString();
                                try {
                                    try {
                                        jSONArray = jSONObject4.getJSONArray(string);
                                    } catch (Throwable unused) {
                                        jSONArray = jSONObject4.get(string);
                                    }
                                } catch (JSONException unused2) {
                                    jSONArray = null;
                                }
                                if (jSONArray != null) {
                                    jSONObject3.put(string, jSONArray);
                                }
                            }
                        }
                    }
                    jSONObjectM15796p = m15796p(jSONObject3);
                } else {
                    jSONObjectM15796p = null;
                }
                JSONObject jSONObjectM15795o = jSONObject2.has("events") ? m15795o(context, jSONObject2.getJSONObject("events")) : null;
                if (jSONObject2.has("expires_in")) {
                    C7977q0.m15831i(context, jSONObject2.getInt("expires_in"), m15794n("local_cache_expires_in"));
                }
                C7977q0.m15831i(context, (int) (System.currentTimeMillis() / 1000), m15794n("local_cache_last_update"));
                boolean z10 = true;
                Boolean boolValueOf = Boolean.valueOf(jSONObjectM15796p != null && jSONObjectM15796p.length() > 0);
                if (jSONObjectM15795o == null || jSONObjectM15795o.length() <= 0) {
                    z10 = false;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z10);
                if (!boolValueOf.booleanValue() && !boolValueOf2.booleanValue()) {
                    return;
                }
                JSONObject jSONObject5 = new JSONObject();
                if (boolValueOf.booleanValue()) {
                    jSONObject5.put("profile", jSONObjectM15796p);
                }
                if (boolValueOf2.booleanValue()) {
                    jSONObject5.put("events", jSONObjectM15795o);
                }
                try {
                    CleverTapAPI cleverTapAPIM6420g = CleverTapAPI.m6420g(context, null);
                    if (cleverTapAPIM6420g != null) {
                        cleverTapAPIM6420g.f10981b.f43476f.mo580R();
                    }
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable th2) {
            C2181a c2181aM15784d = m15784d();
            String str = this.f43349c.f10995a;
            c2181aM15784d.getClass();
            C2181a.m6461n(str, "Failed to sync with upstream", th2);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m15798r(String str) {
        if (str == null) {
            return;
        }
        synchronized (this.f43347a) {
            this.f43347a.put(str, Integer.valueOf(m15785e("local_cache_expires_in", 0) + ((int) (System.currentTimeMillis() / 1000))));
        }
    }
}
