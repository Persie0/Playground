package p501y6;

import android.text.TextUtils;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.task.Task;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p043c7.C1735a;
import p043c7.InterfaceC1742h;
import p066d7.C5050b;
import p260m8.C7499b;

/* JADX INFO: renamed from: y6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10299c {

    /* JADX INFO: renamed from: a */
    public final CleverTapInstanceConfig f51809a;

    /* JADX INFO: renamed from: b */
    public String f51810b;

    /* JADX INFO: renamed from: c */
    public final C5050b f51811c;

    /* JADX INFO: renamed from: d */
    public final Map<String, String> f51812d = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: y6.c$a */
    public class a implements Callable<Boolean> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() throws Exception {
            C10299c c10299c = C10299c.this;
            try {
                HashMap map = new HashMap(c10299c.f51812d);
                map.remove("fetch_min_interval_seconds");
                c10299c.f51811c.m10729c(c10299c.m19286a(), "config_settings.json", new JSONObject(map));
                return Boolean.TRUE;
            } catch (Exception e10) {
                e10.printStackTrace();
                C2181a c2181aM6433b = c10299c.f51809a.m6433b();
                String strM14908I = C7499b.m14908I(c10299c.f51809a);
                String str = "UpdateConfigToFile failed: " + e10.getLocalizedMessage();
                c2181aM6433b.getClass();
                C2181a.m6460m(strM14908I, str);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: renamed from: y6.c$b */
    public class b implements InterfaceC1742h<Boolean> {
        public b() {
        }

        @Override // p043c7.InterfaceC1742h
        /* JADX INFO: renamed from: a */
        public final void mo5478a(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            C10299c c10299c = C10299c.this;
            if (!zBooleanValue) {
                C2181a c2181aM6433b = c10299c.f51809a.m6433b();
                String strM14908I = C7499b.m14908I(c10299c.f51809a);
                c2181aM6433b.getClass();
                C2181a.m6460m(strM14908I, "Product Config settings: writing Failed");
                return;
            }
            C2181a c2181aM6433b2 = c10299c.f51809a.m6433b();
            String strM14908I2 = C7499b.m14908I(c10299c.f51809a);
            String str = "Product Config settings: writing Success " + c10299c.f51812d;
            c2181aM6433b2.getClass();
            C2181a.m6460m(strM14908I2, str);
        }
    }

    public C10299c(String str, CleverTapInstanceConfig cleverTapInstanceConfig, C5050b c5050b) {
        this.f51810b = str;
        this.f51809a = cleverTapInstanceConfig;
        this.f51811c = c5050b;
        m19291f();
    }

    /* JADX INFO: renamed from: a */
    public final String m19286a() {
        return "Product_Config_" + this.f51809a.f10995a + "_" + this.f51810b;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m19287b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException e10) {
                e10.printStackTrace();
                CleverTapInstanceConfig cleverTapInstanceConfig = this.f51809a;
                C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                String strM14908I = C7499b.m14908I(cleverTapInstanceConfig);
                String str2 = "LoadSettings failed: " + e10.getLocalizedMessage();
                c2181aM6433b.getClass();
                C2181a.m6460m(strM14908I, str2);
            }
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized long m19288c() {
        long j10;
        String str = this.f51812d.get("ts");
        try {
            j10 = !TextUtils.isEmpty(str) ? (long) Double.parseDouble(str) : 0L;
        } catch (Exception e10) {
            e10.printStackTrace();
            C2181a c2181aM6433b = this.f51809a.m6433b();
            String strM14908I = C7499b.m14908I(this.f51809a);
            String str2 = "GetLastFetchTimeStampInMillis failed: " + e10.getLocalizedMessage();
            c2181aM6433b.getClass();
            C2181a.m6460m(strM14908I, str2);
        }
        return j10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final synchronized int m19289d() {
        int i10;
        try {
            String str = this.f51812d.get("rc_n");
            try {
                i10 = !TextUtils.isEmpty(str) ? (int) Double.parseDouble(str) : 5;
            } catch (Exception e10) {
                e10.printStackTrace();
                C2181a c2181aM6433b = this.f51809a.m6433b();
                String strM14908I = C7499b.m14908I(this.f51809a);
                String str2 = "GetNoOfCallsInAllowedWindow failed: " + e10.getLocalizedMessage();
                c2181aM6433b.getClass();
                C2181a.m6460m(strM14908I, str2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final synchronized int m19290e() {
        int i10;
        String str = this.f51812d.get("rc_w");
        try {
            i10 = !TextUtils.isEmpty(str) ? (int) Double.parseDouble(str) : 60;
        } catch (Exception e10) {
            e10.printStackTrace();
            C2181a c2181aM6433b = this.f51809a.m6433b();
            String strM14908I = C7499b.m14908I(this.f51809a);
            String str2 = "GetWindowIntervalInMinutes failed: " + e10.getLocalizedMessage();
            c2181aM6433b.getClass();
            C2181a.m6460m(strM14908I, str2);
        }
        return i10;
    }

    /* JADX INFO: renamed from: f */
    public final void m19291f() {
        String strValueOf = String.valueOf(5);
        Map<String, String> map = this.f51812d;
        map.put("rc_n", strValueOf);
        map.put("rc_w", String.valueOf(60));
        map.put("ts", String.valueOf(0));
        map.put("fetch_min_interval_seconds", String.valueOf(InterfaceC10297a.f51806a));
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f51809a;
        C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
        c2181aM6433b.getClass();
        C2181a.m6460m(C7499b.m14908I(cleverTapInstanceConfig), "Settings loaded with default values: " + map);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m19292g(C5050b c5050b) {
        if (c5050b == null) {
            throw new IllegalArgumentException("fileutils can't be null");
        }
        try {
            m19293h(m19287b(c5050b.m10728b(m19286a() + "/config_settings.json")));
        } catch (Exception e10) {
            e10.printStackTrace();
            C2181a c2181aM6433b = this.f51809a.m6433b();
            String strM14908I = C7499b.m14908I(this.f51809a);
            String str = "LoadSettings failed while reading file: " + e10.getLocalizedMessage();
            c2181aM6433b.getClass();
            C2181a.m6460m(strM14908I, str);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final synchronized void m19293h(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                try {
                    String strValueOf = String.valueOf(jSONObject.get(next));
                    if (!TextUtils.isEmpty(strValueOf)) {
                        this.f51812d.put(next, strValueOf);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    C2181a c2181aM6433b = this.f51809a.m6433b();
                    String strM14908I = C7499b.m14908I(this.f51809a);
                    String str = "Failed loading setting for key " + next + " Error: " + e10.getLocalizedMessage();
                    c2181aM6433b.getClass();
                    C2181a.m6460m(strM14908I, str);
                }
            }
        }
        C2181a c2181aM6433b2 = this.f51809a.m6433b();
        String strM14908I2 = C7499b.m14908I(this.f51809a);
        String str2 = "LoadSettings completed with settings: " + this.f51812d;
        c2181aM6433b2.getClass();
        C2181a.m6460m(strM14908I2, str2);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: i */
    public final void m19294i(String str, int i10) {
        str.getClass();
        if (str.equals("rc_n")) {
            synchronized (this) {
                long jM19289d = m19289d();
                if (i10 > 0 && jM19289d != i10) {
                    this.f51812d.put("rc_n", String.valueOf(i10));
                    m19295j();
                }
            }
            return;
        }
        if (str.equals("rc_w")) {
            synchronized (this) {
                try {
                    int iM19290e = m19290e();
                    if (i10 > 0 && iM19290e != i10) {
                        this.f51812d.put("rc_w", String.valueOf(i10));
                        m19295j();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final synchronized void m19295j() {
        Task taskM5473a = C1735a.m5472a(this.f51809a).m5473a();
        taskM5473a.m6584a(new b());
        taskM5473a.m6585b("ProductConfigSettings#updateConfigToFile", new a());
    }
}
