package p381s6;

import android.support.v4.media.AbstractC0140a;
import android.text.TextUtils;
import com.clevertap.android.sdk.AnalyticsManager;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.task.Task;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
import p003a2.C0009a;
import p043c7.C1735a;
import p043c7.InterfaceC1742h;
import p066d7.C5050b;

/* JADX INFO: renamed from: s6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8967b {

    /* JADX INFO: renamed from: a */
    public final CleverTapInstanceConfig f46975a;

    /* JADX INFO: renamed from: b */
    public String f46976b;

    /* JADX INFO: renamed from: d */
    public final AbstractC0140a f46978d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0140a f46979e;

    /* JADX INFO: renamed from: f */
    public final C5050b f46980f;

    /* JADX INFO: renamed from: c */
    public boolean f46977c = false;

    /* JADX INFO: renamed from: g */
    public final Map<String, Boolean> f46981g = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: s6.b$a */
    public class a implements InterfaceC1742h<Boolean> {
        public a() {
        }

        @Override // p043c7.InterfaceC1742h
        /* JADX INFO: renamed from: a */
        public final void mo5478a(Boolean bool) {
            C8967b.this.f46977c = bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: s6.b$b */
    public class b implements Callable<Boolean> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() throws Exception {
            Boolean bool;
            synchronized (this) {
                C2181a c2181aM17193c = C8967b.this.m17193c();
                String strM17194d = C8967b.this.m17194d();
                c2181aM17193c.getClass();
                C2181a.m6460m(strM17194d, "Feature flags init is called");
                String str = C8967b.this.m17192b() + "/ff_cache.json";
                try {
                    C8967b.this.f46981g.clear();
                    String strM10728b = C8967b.this.f46980f.m10728b(str);
                    if (TextUtils.isEmpty(strM10728b)) {
                        C2181a c2181aM17193c2 = C8967b.this.m17193c();
                        c2181aM17193c2.getClass();
                        C2181a.m6460m(C8967b.this.m17194d(), "Feature flags file is empty-" + str);
                    } else {
                        JSONArray jSONArray = new JSONObject(strM10728b).getJSONArray("kv");
                        if (jSONArray != null && jSONArray.length() > 0) {
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
                                if (jSONObject != null) {
                                    String string = jSONObject.getString("n");
                                    String string2 = jSONObject.getString("v");
                                    if (!TextUtils.isEmpty(string)) {
                                        C8967b.this.f46981g.put(string, Boolean.valueOf(Boolean.parseBoolean(string2)));
                                    }
                                }
                            }
                        }
                        C2181a c2181aM17193c3 = C8967b.this.m17193c();
                        String strM17194d2 = C8967b.this.m17194d();
                        String str2 = "Feature flags initialized from file " + str + " with configs  " + C8967b.this.f46981g;
                        c2181aM17193c3.getClass();
                        C2181a.m6460m(strM17194d2, str2);
                    }
                    bool = Boolean.TRUE;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    C2181a c2181aM17193c4 = C8967b.this.m17193c();
                    String strM17194d3 = C8967b.this.m17194d();
                    String str3 = "UnArchiveData failed file- " + str + " " + e10.getLocalizedMessage();
                    c2181aM17193c4.getClass();
                    C2181a.m6460m(strM17194d3, str3);
                    bool = Boolean.FALSE;
                }
            }
            return bool;
        }
    }

    public C8967b(String str, CleverTapInstanceConfig cleverTapInstanceConfig, AbstractC0140a abstractC0140a, AnalyticsManager analyticsManager, C5050b c5050b) {
        this.f46976b = str;
        this.f46975a = cleverTapInstanceConfig;
        this.f46979e = abstractC0140a;
        this.f46978d = analyticsManager;
        this.f46980f = c5050b;
        m17195e();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m17191a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f46980f.m10729c(m17192b(), "ff_cache.json", jSONObject);
                C2181a c2181aM17193c = m17193c();
                String strM17194d = m17194d();
                StringBuilder sb2 = new StringBuilder("Feature flags saved into file-[");
                sb2.append(m17192b() + "/ff_cache.json");
                sb2.append("]");
                sb2.append(this.f46981g);
                String string = sb2.toString();
                c2181aM17193c.getClass();
                C2181a.m6460m(strM17194d, string);
            } catch (Exception e10) {
                e10.printStackTrace();
                C2181a c2181aM17193c2 = m17193c();
                String strM17194d2 = m17194d();
                String str = "ArchiveData failed - " + e10.getLocalizedMessage();
                c2181aM17193c2.getClass();
                C2181a.m6460m(strM17194d2, str);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m17192b() {
        return "Feature_Flag_" + this.f46975a.f10995a + "_" + this.f46976b;
    }

    /* JADX INFO: renamed from: c */
    public final C2181a m17193c() {
        return this.f46975a.m6433b();
    }

    /* JADX INFO: renamed from: d */
    public final String m17194d() {
        return C0009a.m23l(new StringBuilder(), this.f46975a.f10995a, "[Feature Flag]");
    }

    /* JADX INFO: renamed from: e */
    public final void m17195e() {
        if (TextUtils.isEmpty(this.f46976b)) {
            return;
        }
        Task taskM5473a = C1735a.m5472a(this.f46975a).m5473a();
        taskM5473a.m6584a(new a());
        taskM5473a.m6585b("initFeatureFlags", new b());
    }
}
