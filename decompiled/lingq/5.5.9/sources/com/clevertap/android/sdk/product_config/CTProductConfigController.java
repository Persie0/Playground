package com.clevertap.android.sdk.product_config;

import android.support.v4.media.AbstractC0140a;
import android.text.TextUtils;
import androidx.activity.result.C0204c;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.task.Task;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p043c7.C1735a;
import p043c7.C1736b;
import p043c7.InterfaceC1742h;
import p066d7.C5050b;
import p260m8.C7499b;
import p501y6.C10299c;

/* JADX INFO: loaded from: classes.dex */
public final class CTProductConfigController {

    /* JADX INFO: renamed from: d */
    public final C5050b f11319d;

    /* JADX INFO: renamed from: e */
    public final CleverTapInstanceConfig f11320e;

    /* JADX INFO: renamed from: g */
    public final AbstractC0140a f11322g;

    /* JADX INFO: renamed from: h */
    public final C10299c f11323h;

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f11316a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: b */
    public final Map<String, String> f11317b = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f11318c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f11321f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i */
    public final Map<String, String> f11324i = Collections.synchronizedMap(new HashMap());

    public enum PROCESSING_STATE {
        INIT,
        FETCHED,
        ACTIVATED
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.CTProductConfigController$a */
    public static /* synthetic */ class C2248a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11325a;

        static {
            int[] iArr = new int[PROCESSING_STATE.values().length];
            f11325a = iArr;
            try {
                iArr[PROCESSING_STATE.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11325a[PROCESSING_STATE.FETCHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11325a[PROCESSING_STATE.ACTIVATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.CTProductConfigController$b */
    public class CallableC2249b implements Callable<Void> {
        public CallableC2249b() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (this) {
                try {
                    HashMap map = new HashMap();
                    if (CTProductConfigController.this.f11324i.isEmpty()) {
                        CTProductConfigController cTProductConfigController = CTProductConfigController.this;
                        map = CTProductConfigController.m6558a(cTProductConfigController, cTProductConfigController.m6561d());
                    } else {
                        map.putAll(CTProductConfigController.this.f11324i);
                        CTProductConfigController.this.f11324i.clear();
                    }
                    CTProductConfigController.this.f11316a.clear();
                    if (!CTProductConfigController.this.f11317b.isEmpty()) {
                        CTProductConfigController cTProductConfigController2 = CTProductConfigController.this;
                        cTProductConfigController2.f11316a.putAll(cTProductConfigController2.f11317b);
                    }
                    CTProductConfigController.this.f11316a.putAll(map);
                    C2181a c2181aM6433b = CTProductConfigController.this.f11320e.m6433b();
                    String strM14908I = C7499b.m14908I(CTProductConfigController.this.f11320e);
                    String str = "Activated successfully with configs: " + CTProductConfigController.this.f11316a;
                    c2181aM6433b.getClass();
                    C2181a.m6460m(strM14908I, str);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    C2181a c2181aM6433b2 = CTProductConfigController.this.f11320e.m6433b();
                    String strM14908I2 = C7499b.m14908I(CTProductConfigController.this.f11320e);
                    String str2 = "Activate failed: " + e10.getLocalizedMessage();
                    c2181aM6433b2.getClass();
                    C2181a.m6460m(strM14908I2, str2);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.CTProductConfigController$c */
    public class C2250c implements InterfaceC1742h<Void> {
        public C2250c() {
        }

        @Override // p043c7.InterfaceC1742h
        /* JADX INFO: renamed from: a */
        public final void mo5478a(Void r10) {
            CTProductConfigController.this.m6566i(PROCESSING_STATE.ACTIVATED);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.CTProductConfigController$d */
    public class CallableC2251d implements Callable<Void> {
        public CallableC2251d() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            CTProductConfigController cTProductConfigController = CTProductConfigController.this;
            C2181a c2181aM6433b = cTProductConfigController.f11320e.m6433b();
            String strM14908I = C7499b.m14908I(cTProductConfigController.f11320e);
            c2181aM6433b.getClass();
            C2181a.m6460m(strM14908I, "Product Config: fetch Success");
            cTProductConfigController.m6566i(PROCESSING_STATE.FETCHED);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.CTProductConfigController$e */
    public class CallableC2252e implements Callable<Boolean> {
        public CallableC2252e() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final Boolean call() throws Exception {
            Boolean bool;
            synchronized (this) {
                try {
                    try {
                        if (!CTProductConfigController.this.f11317b.isEmpty()) {
                            CTProductConfigController cTProductConfigController = CTProductConfigController.this;
                            cTProductConfigController.f11316a.putAll(cTProductConfigController.f11317b);
                        }
                        CTProductConfigController cTProductConfigController2 = CTProductConfigController.this;
                        HashMap mapM6558a = CTProductConfigController.m6558a(cTProductConfigController2, cTProductConfigController2.m6561d());
                        if (!mapM6558a.isEmpty()) {
                            CTProductConfigController.this.f11324i.putAll(mapM6558a);
                        }
                        C2181a c2181aM6433b = CTProductConfigController.this.f11320e.m6433b();
                        String strM14908I = C7499b.m14908I(CTProductConfigController.this.f11320e);
                        String str = "Loaded configs ready to be applied: " + CTProductConfigController.this.f11324i;
                        c2181aM6433b.getClass();
                        C2181a.m6460m(strM14908I, str);
                        CTProductConfigController cTProductConfigController3 = CTProductConfigController.this;
                        cTProductConfigController3.f11323h.m19292g(cTProductConfigController3.f11319d);
                        CTProductConfigController.this.f11318c.set(true);
                        bool = Boolean.TRUE;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        C2181a c2181aM6433b2 = CTProductConfigController.this.f11320e.m6433b();
                        String strM14908I2 = C7499b.m14908I(CTProductConfigController.this.f11320e);
                        String str2 = "InitAsync failed - " + e10.getLocalizedMessage();
                        c2181aM6433b2.getClass();
                        C2181a.m6460m(strM14908I2, str2);
                        bool = Boolean.FALSE;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bool;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.CTProductConfigController$f */
    public class C2253f implements InterfaceC1742h<Boolean> {
        public C2253f() {
        }

        @Override // p043c7.InterfaceC1742h
        /* JADX INFO: renamed from: a */
        public final void mo5478a(Boolean bool) {
            CTProductConfigController.this.m6566i(PROCESSING_STATE.INIT);
        }
    }

    public CTProductConfigController(CleverTapInstanceConfig cleverTapInstanceConfig, AbstractC0140a abstractC0140a, C10299c c10299c, C5050b c5050b) {
        this.f11320e = cleverTapInstanceConfig;
        this.f11322g = abstractC0140a;
        this.f11323h = c10299c;
        this.f11319d = c5050b;
        m6563f();
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m6558a(CTProductConfigController cTProductConfigController, String str) throws Throwable {
        CleverTapInstanceConfig cleverTapInstanceConfig = cTProductConfigController.f11320e;
        HashMap map = new HashMap();
        try {
            String strM10728b = cTProductConfigController.f11319d.m10728b(str);
            C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
            c2181aM6433b.getClass();
            C2181a.m6460m(C7499b.m14908I(cleverTapInstanceConfig), "GetStoredValues reading file success:[ " + str + "]--[Content]" + strM10728b);
            if (!TextUtils.isEmpty(strM10728b)) {
                try {
                    JSONObject jSONObject = new JSONObject(strM10728b);
                    Iterator<String> itKeys = jSONObject.keys();
                    loop0: while (true) {
                        while (true) {
                            if (!itKeys.hasNext()) {
                                break loop0;
                            }
                            String next = itKeys.next();
                            if (TextUtils.isEmpty(next)) {
                                break;
                            }
                            try {
                                String strValueOf = String.valueOf(jSONObject.get(next));
                                if (TextUtils.isEmpty(strValueOf)) {
                                    break;
                                }
                                map.put(next, strValueOf);
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                C2181a c2181aM6433b2 = cleverTapInstanceConfig.m6433b();
                                String strM14908I = C7499b.m14908I(cleverTapInstanceConfig);
                                StringBuilder sbM854m = C0204c.m854m("GetStoredValues for key ", next, " while parsing json: ");
                                sbM854m.append(e10.getLocalizedMessage());
                                String string = sbM854m.toString();
                                c2181aM6433b2.getClass();
                                C2181a.m6460m(strM14908I, string);
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    C2181a c2181aM6433b3 = cleverTapInstanceConfig.m6433b();
                    String strM14908I2 = C7499b.m14908I(cleverTapInstanceConfig);
                    String str2 = "GetStoredValues failed due to malformed json: " + e11.getLocalizedMessage();
                    c2181aM6433b3.getClass();
                    C2181a.m6460m(strM14908I2, str2);
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
            C2181a c2181aM6433b4 = cleverTapInstanceConfig.m6433b();
            String strM14908I3 = C7499b.m14908I(cleverTapInstanceConfig);
            String str3 = "GetStoredValues reading file failed: " + e12.getLocalizedMessage();
            c2181aM6433b4.getClass();
            C2181a.m6460m(strM14908I3, str3);
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public final void m6559b() {
        if (TextUtils.isEmpty(this.f11323h.f51810b)) {
            return;
        }
        Task taskM5473a = C1735a.m5472a(this.f11320e).m5473a();
        taskM5473a.m6584a(new C2250c());
        taskM5473a.m6585b("activateProductConfigs", new CallableC2249b());
    }

    /* JADX INFO: renamed from: c */
    public final HashMap<String, String> m6560c(JSONObject jSONObject) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f11320e;
        HashMap<String, String> map = new HashMap<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("kv");
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    try {
                        JSONObject jSONObject2 = (JSONObject) jSONArray.get(i10);
                        if (jSONObject2 != null) {
                            String string = jSONObject2.getString("n");
                            String string2 = jSONObject2.getString("v");
                            if (!TextUtils.isEmpty(string)) {
                                map.put(string, string2);
                            }
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                        String strM14908I = C7499b.m14908I(cleverTapInstanceConfig);
                        String str = "ConvertServerJsonToMap failed: " + e10.getLocalizedMessage();
                        c2181aM6433b.getClass();
                        C2181a.m6460m(strM14908I, str);
                    }
                }
            }
            return map;
        } catch (JSONException e11) {
            e11.printStackTrace();
            C2181a c2181aM6433b2 = cleverTapInstanceConfig.m6433b();
            String strM14908I2 = C7499b.m14908I(cleverTapInstanceConfig);
            String str2 = "ConvertServerJsonToMap failed - " + e11.getLocalizedMessage();
            c2181aM6433b2.getClass();
            C2181a.m6460m(strM14908I2, str2);
            return map;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m6561d() {
        return m6562e() + "/activated.json";
    }

    /* JADX INFO: renamed from: e */
    public final String m6562e() {
        return "Product_Config_" + this.f11320e.f10995a + "_" + this.f11323h.f51810b;
    }

    /* JADX INFO: renamed from: f */
    public final void m6563f() {
        if (TextUtils.isEmpty(this.f11323h.f51810b)) {
            return;
        }
        Task taskM5473a = C1735a.m5472a(this.f11320e).m5473a();
        taskM5473a.m6584a(new C2253f());
        taskM5473a.m6585b("ProductConfig#initAsync", new CallableC2252e());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final void m6564g(JSONObject jSONObject) {
        if (TextUtils.isEmpty(this.f11323h.f51810b)) {
            return;
        }
        synchronized (this) {
            try {
                m6565h(jSONObject);
                this.f11319d.m10729c(m6562e(), "activated.json", new JSONObject(this.f11324i));
                C2181a c2181aM6433b = this.f11320e.m6433b();
                String strM14908I = C7499b.m14908I(this.f11320e);
                String str = "Fetch file-[" + m6561d() + "] write success: " + this.f11324i;
                c2181aM6433b.getClass();
                C2181a.m6460m(strM14908I, str);
                C1736b c1736bM5472a = C1735a.m5472a(this.f11320e);
                c1736bM5472a.m5476d(c1736bM5472a.f9582b, c1736bM5472a.f9583c, "Main").m6585b("sendPCFetchSuccessCallback", new CallableC2251d());
                if (this.f11321f.getAndSet(false)) {
                    m6559b();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                C2181a c2181aM6433b2 = this.f11320e.m6433b();
                String strM14908I2 = C7499b.m14908I(this.f11320e);
                c2181aM6433b2.getClass();
                C2181a.m6460m(strM14908I2, "Product Config: fetch Failed");
                m6566i(PROCESSING_STATE.FETCHED);
                this.f11321f.compareAndSet(true, false);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final synchronized void m6565h(JSONObject jSONObject) {
        Integer num;
        try {
            HashMap<String, String> mapM6560c = m6560c(jSONObject);
            this.f11324i.clear();
            this.f11324i.putAll(mapM6560c);
            C2181a c2181aM6433b = this.f11320e.m6433b();
            c2181aM6433b.getClass();
            C2181a.m6460m(C7499b.m14908I(this.f11320e), "Product Config: Fetched response:" + jSONObject);
            try {
                num = (Integer) jSONObject.get("ts");
            } catch (Exception e10) {
                e10.printStackTrace();
                C2181a c2181aM6433b2 = this.f11320e.m6433b();
                String strM14908I = C7499b.m14908I(this.f11320e);
                String str = "ParseFetchedResponse failed: " + e10.getLocalizedMessage();
                c2181aM6433b2.getClass();
                C2181a.m6460m(strM14908I, str);
                num = null;
            }
            if (num != null) {
                C10299c c10299c = this.f11323h;
                long jIntValue = ((long) num.intValue()) * 1000;
                synchronized (c10299c) {
                    long jM19288c = c10299c.m19288c();
                    if (jIntValue >= 0 && jM19288c != jIntValue) {
                        c10299c.f51812d.put("ts", String.valueOf(jIntValue));
                        c10299c.m19295j();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6566i(PROCESSING_STATE processing_state) {
        if (processing_state != null) {
            int i10 = C2248a.f11325a[processing_state.ordinal()];
            AbstractC0140a abstractC0140a = this.f11322g;
            if (i10 != 1) {
                if (i10 == 2) {
                    abstractC0140a.mo573K();
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    abstractC0140a.mo573K();
                    return;
                }
            }
            abstractC0140a.mo573K();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m6567j(JSONObject jSONObject) {
        C10299c c10299c = this.f11323h;
        c10299c.getClass();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    if (!TextUtils.isEmpty(next)) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof Number) {
                            int iDoubleValue = (int) ((Number) obj).doubleValue();
                            if ("rc_n".equalsIgnoreCase(next) || "rc_w".equalsIgnoreCase(next)) {
                                c10299c.m19294i(next, iDoubleValue);
                            }
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    CleverTapInstanceConfig cleverTapInstanceConfig = c10299c.f51809a;
                    C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                    String strM14908I = C7499b.m14908I(cleverTapInstanceConfig);
                    String str = "Product Config setARPValue failed " + e10.getLocalizedMessage();
                    c2181aM6433b.getClass();
                    C2181a.m6460m(strM14908I, str);
                }
            }
            return;
        }
    }
}
