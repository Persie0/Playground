package p290o6;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
import p003a2.C0009a;
import p043c7.C1735a;

/* JADX INFO: renamed from: o6.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7957g0 {

    /* JADX INFO: renamed from: b */
    public final CleverTapInstanceConfig f43326b;

    /* JADX INFO: renamed from: c */
    public final Context f43327c;

    /* JADX INFO: renamed from: d */
    public String f43328d;

    /* JADX INFO: renamed from: a */
    public final SimpleDateFormat f43325a = new SimpleDateFormat("ddMMyyyy", Locale.US);

    /* JADX INFO: renamed from: e */
    public final ArrayList<String> f43329e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public final HashMap<String, Integer> f43330f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public int f43331g = 0;

    /* JADX INFO: renamed from: o6.g0$a */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            C7957g0 c7957g0 = C7957g0.this;
            c7957g0.m15777g(c7957g0.f43328d);
            return null;
        }
    }

    public C7957g0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        this.f43326b = cleverTapInstanceConfig;
        this.f43327c = context;
        this.f43328d = str;
        C1735a.m5472a(cleverTapInstanceConfig).m5474b().m6585b("initInAppFCManager", new a());
    }

    /* JADX INFO: renamed from: c */
    public static String m15771c(CTInAppNotification cTInAppNotification) {
        String str = cTInAppNotification.f11082L;
        if (str == null) {
            return null;
        }
        if (!str.isEmpty()) {
            try {
                return cTInAppNotification.f11082L;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m15772e(String str, String str2) {
        return C0009a.m21i(str, ":", str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m15773a(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put("imp", m15775d(m15772e("istc_inapp", this.f43328d), 0));
            JSONArray jSONArray = new JSONArray();
            Map<String, ?> all = C7977q0.m15827e(context, m15772e("counts_per_inapp", this.f43328d)).getAll();
            for (String str : all.keySet()) {
                Object obj = all.get(str);
                if (obj instanceof String) {
                    String[] strArrSplit = ((String) obj).split(",");
                    if (strArrSplit.length == 2) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(0, str);
                        jSONArray2.put(1, Integer.parseInt(strArrSplit[0]));
                        jSONArray2.put(2, Integer.parseInt(strArrSplit[1]));
                        jSONArray.put(jSONArray2);
                    }
                }
            }
            jSONObject.put("tlc", jSONArray);
        } catch (Throwable th2) {
            C2181a.m6457j("Failed to attach FC to header", th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int[] m15774b(String str) {
        String string = C7977q0.m15827e(this.f43327c, m15772e("counts_per_inapp", this.f43328d)).getString(str, null);
        if (string == null) {
            return new int[]{0, 0};
        }
        try {
            String[] strArrSplit = string.split(",");
            return strArrSplit.length != 2 ? new int[]{0, 0} : new int[]{Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1])};
        } catch (Throwable unused) {
            return new int[]{0, 0};
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m15775d(String str, int i10) {
        boolean z10 = this.f43326b.f10988H;
        Context context = this.f43327c;
        if (!z10) {
            return C7977q0.m15824b(context, i10, m15780j(str));
        }
        int iM15824b = C7977q0.m15824b(context, -1000, m15780j(str));
        return iM15824b != -1000 ? iM15824b : C7977q0.m15824b(context, i10, str);
    }

    /* JADX INFO: renamed from: f */
    public final String m15776f(String str, String str2) {
        boolean z10 = this.f43326b.f10988H;
        Context context = this.f43327c;
        if (!z10) {
            return C7977q0.m15828f(context, m15780j(str), str2);
        }
        String strM15828f = C7977q0.m15828f(context, m15780j(str), str2);
        return strM15828f != null ? strM15828f : C7977q0.m15828f(context, str, str2);
    }

    /* JADX INFO: renamed from: g */
    public final void m15777g(String str) {
        Context context = this.f43327c;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f43326b;
        C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
        StringBuilder sb2 = new StringBuilder();
        String str2 = cleverTapInstanceConfig.f10995a;
        String str3 = cleverTapInstanceConfig.f10995a;
        sb2.append(str2);
        sb2.append(":async_deviceID");
        String string = sb2.toString();
        c2181aM6433b.getClass();
        C2181a.m6460m(string, "InAppFCManager init() called");
        try {
            m15778h(str);
            String str4 = this.f43325a.format(new Date());
            if (str4.equals(m15776f(m15772e("ict_date", str), "20140428"))) {
                return;
            }
            C7977q0.m15832j(context, m15780j(m15772e("ict_date", str)), str4);
            C7977q0.m15831i(context, 0, m15780j(m15772e("istc_inapp", str)));
            SharedPreferences sharedPreferencesM15827e = C7977q0.m15827e(context, m15772e("counts_per_inapp", str));
            SharedPreferences.Editor editorEdit = sharedPreferencesM15827e.edit();
            Map<String, ?> all = sharedPreferencesM15827e.getAll();
            for (String str5 : all.keySet()) {
                Object obj = all.get(str5);
                if (obj instanceof String) {
                    String[] strArrSplit = ((String) obj).split(",");
                    if (strArrSplit.length != 2) {
                        editorEdit.remove(str5);
                    } else {
                        try {
                            editorEdit.putString(str5, "0," + strArrSplit[1]);
                        } catch (Throwable th2) {
                            cleverTapInstanceConfig.m6433b().getClass();
                            C2181a.m6461n(str3, "Failed to reset todayCount for inapp " + str5, th2);
                        }
                    }
                } else {
                    editorEdit.remove(str5);
                }
            }
            C7977q0.m15830h(editorEdit);
        } catch (Exception e10) {
            C2181a c2181aM6433b2 = cleverTapInstanceConfig.m6433b();
            String str6 = "Failed to init inapp manager " + e10.getLocalizedMessage();
            c2181aM6433b2.getClass();
            C2181a.m6460m(str3, str6);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m15778h(String str) {
        if (m15776f(m15780j(m15772e("ict_date", str)), null) == null && m15776f("ict_date", null) != null) {
            C2181a.m6455h("Migrating InAppFC Prefs");
            String strM15776f = m15776f("ict_date", "20140428");
            String strM15780j = m15780j(m15772e("ict_date", str));
            Context context = this.f43327c;
            C7977q0.m15832j(context, strM15780j, strM15776f);
            C7977q0.m15831i(context, m15775d(m15780j("istc_inapp"), 0), m15780j(m15772e("istc_inapp", str)));
            SharedPreferences sharedPreferencesM15827e = C7977q0.m15827e(context, "counts_per_inapp");
            SharedPreferences.Editor editorEdit = sharedPreferencesM15827e.edit();
            SharedPreferences.Editor editorEdit2 = C7977q0.m15827e(context, m15772e("counts_per_inapp", str)).edit();
            Map<String, ?> all = sharedPreferencesM15827e.getAll();
            for (String str2 : all.keySet()) {
                Object obj = all.get(str2);
                if (!(obj instanceof String)) {
                    editorEdit.remove(str2);
                } else if (((String) obj).split(",").length != 2) {
                    editorEdit.remove(str2);
                } else {
                    editorEdit2.putString(str2, obj.toString());
                }
            }
            C7977q0.m15830h(editorEdit2);
            editorEdit.clear().apply();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m15779i(Context context, JSONObject jSONObject) {
        try {
            if (jSONObject.has("inapp_stale")) {
                JSONArray jSONArray = jSONObject.getJSONArray("inapp_stale");
                SharedPreferences.Editor editorEdit = C7977q0.m15827e(context, m15772e("counts_per_inapp", this.f43328d)).edit();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    Object obj = jSONArray.get(i10);
                    if (obj instanceof Integer) {
                        editorEdit.remove("" + obj);
                        C2181a.m6449a("Purged stale in-app - " + obj);
                    } else if (obj instanceof String) {
                        editorEdit.remove((String) obj);
                        C2181a.m6449a("Purged stale in-app - " + obj);
                    }
                }
                C7977q0.m15830h(editorEdit);
            }
        } catch (Throwable th2) {
            C2181a.m6457j("Failed to purge out stale targets", th2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final String m15780j(String str) {
        StringBuilder sbM26o = C0009a.m26o(str, ":");
        sbM26o.append(this.f43326b.f10995a);
        return sbM26o.toString();
    }
}
