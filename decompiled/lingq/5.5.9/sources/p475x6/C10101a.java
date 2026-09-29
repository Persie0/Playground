package p475x6;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.media.AbstractC0140a;
import android.support.v4.media.session.C0166e;
import android.util.Log;
import androidx.activity.result.C0204c;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.events.EventGroup;
import com.clevertap.android.sdk.p049db.AbstractC2184a;
import com.clevertap.android.sdk.p049db.C2185b;
import com.clevertap.android.sdk.p049db.C2186c;
import com.clevertap.android.sdk.p049db.DBAdapter;
import com.clevertap.android.sdk.validation.Validator;
import dm.C5206f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONObject;
import p003a2.C0009a;
import p028b7.C1323a;
import p028b7.C1325c;
import p028b7.C1326d;
import p028b7.C1327e;
import p028b7.C1328f;
import p028b7.C1329g;
import p028b7.C1330h;
import p028b7.C1331i;
import p028b7.C1332j;
import p028b7.C1333k;
import p028b7.C1334l;
import p043c7.C1735a;
import p066d7.C5049a;
import p088e7.C5383c;
import p289o5.C7940t;
import p290o6.C7951d0;
import p290o6.C7963j0;
import p290o6.C7972o;
import p290o6.C7977q0;
import p290o6.C7985x;
import p290o6.C7986y;
import p338qd.C8573r0;
import p357r6.C8740b;

/* JADX INFO: renamed from: x6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10101a extends AbstractC0140a {

    /* JADX INFO: renamed from: I */
    public static SSLSocketFactory f51224I;

    /* JADX INFO: renamed from: J */
    public static SSLContext f51225J;

    /* JADX INFO: renamed from: a */
    public final AbstractC0140a f51227a;

    /* JADX INFO: renamed from: b */
    public AbstractC0140a f51228b;

    /* JADX INFO: renamed from: c */
    public final CleverTapInstanceConfig f51229c;

    /* JADX INFO: renamed from: d */
    public final Context f51230d;

    /* JADX INFO: renamed from: e */
    public final C7985x f51231e;

    /* JADX INFO: renamed from: f */
    public final C7986y f51232f;

    /* JADX INFO: renamed from: h */
    public final AbstractC2184a f51234h;

    /* JADX INFO: renamed from: i */
    public final C7951d0 f51235i;

    /* JADX INFO: renamed from: j */
    public final C2181a f51236j;

    /* JADX INFO: renamed from: l */
    public final C5383c f51238l;

    /* JADX INFO: renamed from: g */
    public int f51233g = 0;

    /* JADX INFO: renamed from: k */
    public int f51237k = 0;

    /* JADX INFO: renamed from: H */
    public int f51226H = 0;

    /* JADX INFO: renamed from: x6.a$a */
    public class a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f51239a;

        public a(Context context) {
            this.f51239a = context;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            C10101a.this.f51234h.mo6478a(this.f51239a);
            return null;
        }
    }

    public C10101a(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, C7951d0 c7951d0, C7986y c7986y, C5383c c5383c, C7985x c7985x, C2185b c2185b, C7972o c7972o, C7940t c7940t, Validator validator, C7963j0 c7963j0) {
        this.f51230d = context;
        this.f51229c = cleverTapInstanceConfig;
        this.f51235i = c7951d0;
        this.f51227a = c7972o;
        this.f51236j = cleverTapInstanceConfig.m6433b();
        this.f51232f = c7986y;
        this.f51238l = c5383c;
        this.f51231e = c7985x;
        this.f51234h = c2185b;
        this.f51228b = new C1333k(cleverTapInstanceConfig, this, c7963j0, new C1330h(new C1332j(new C1323a(new C1326d(new C1331i(new C1334l(new C1327e(new C1328f(new C1333k(new C1329g(new C1325c(), cleverTapInstanceConfig, c7972o), cleverTapInstanceConfig, c7986y, c7985x), cleverTapInstanceConfig, c7985x), cleverTapInstanceConfig, c7972o, c7985x), context, cleverTapInstanceConfig, c2185b, c7972o, c7985x), cleverTapInstanceConfig, c7940t, c7972o, c7985x), cleverTapInstanceConfig), cleverTapInstanceConfig, this, validator, c7985x), cleverTapInstanceConfig, c7951d0, this), cleverTapInstanceConfig, c7985x, false));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k0 */
    public final HttpsURLConnection m18945k0(String str) throws IOException {
        SSLContext sSLContext;
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        httpsURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        httpsURLConnection.setRequestProperty("X-CleverTap-Account-ID", this.f51229c.f10995a);
        httpsURLConnection.setRequestProperty("X-CleverTap-Token", this.f51229c.f10997c);
        httpsURLConnection.setInstanceFollowRedirects(false);
        if (this.f51229c.f10993M) {
            synchronized (C10101a.class) {
                try {
                    if (f51225J == null) {
                        f51225J = new C5206f().m11102w0();
                    }
                    sSLContext = f51225J;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (sSLContext != null) {
                if (f51224I == null) {
                    try {
                        f51224I = sSLContext.getSocketFactory();
                        C2181a.m6449a("Pinning SSL session to DigiCertGlobalRoot CA certificate");
                    } catch (Throwable th3) {
                        if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.INFO.intValue()) {
                            Log.d("CleverTap", "Issue in pinning SSL,", th3);
                        }
                    }
                }
                httpsURLConnection.setSSLSocketFactory(f51224I);
            }
        }
        return httpsURLConnection;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public final void m18946l0(Context context, EventGroup eventGroup) {
        C2186c c2186cM6480c;
        boolean z10;
        HttpsURLConnection httpsURLConnectionM18945k0;
        C2181a c2181aM6433b = this.f51229c.m6433b();
        String str = this.f51229c.f10995a;
        c2181aM6433b.getClass();
        C2181a.m6460m(str, "Somebody has invoked me to send the queue to CleverTap servers");
        C2186c c2186c = null;
        C2186c c2186c2 = null;
        boolean z11 = true;
        while (z11) {
            C2185b c2185b = (C2185b) this.f51234h;
            c2185b.getClass();
            if (eventGroup == EventGroup.PUSH_NOTIFICATION_VIEWED) {
                C2181a c2181aM6433b2 = c2185b.f11045c.m6433b();
                String str2 = c2185b.f11045c.f10995a;
                c2181aM6433b2.getClass();
                C2181a.m6460m(str2, "Returning Queued Notification Viewed events");
                c2186cM6480c = c2185b.m6480c(context, DBAdapter.Table.PUSH_NOTIFICATION_VIEWED, c2186c2);
            } else {
                C2181a c2181aM6433b3 = c2185b.f11045c.m6433b();
                String str3 = c2185b.f11045c.f10995a;
                c2181aM6433b3.getClass();
                C2181a.m6460m(str3, "Returning Queued events");
                synchronized (((Boolean) c2185b.f11044b.f43256a)) {
                    DBAdapter.Table table = DBAdapter.Table.EVENTS;
                    c2186cM6480c = c2185b.m6480c(context, table, c2186c2);
                    if (c2186cM6480c.m6482a().booleanValue() && c2186cM6480c.f11048c.equals(table)) {
                        c2186cM6480c = c2185b.m6480c(context, DBAdapter.Table.PROFILE_EVENTS, c2186c);
                    }
                    if (c2186cM6480c.m6482a().booleanValue()) {
                        c2186cM6480c = c2186c;
                    }
                }
            }
            if (c2186cM6480c == null || c2186cM6480c.m6482a().booleanValue()) {
                C2181a c2181aM6433b4 = this.f51229c.m6433b();
                String str4 = this.f51229c.f10995a;
                c2181aM6433b4.getClass();
                C2181a.m6460m(str4, "No events in the queue, failing");
                return;
            }
            JSONArray jSONArray = c2186cM6480c.f11046a;
            if (jSONArray == null || jSONArray.length() <= 0) {
                C2181a c2181aM6433b5 = this.f51229c.m6433b();
                String str5 = this.f51229c.f10995a;
                c2181aM6433b5.getClass();
                C2181a.m6460m(str5, "No events in the queue, failing");
                return;
            }
            AbstractC0140a abstractC0140a = this.f51227a;
            boolean z12 = false;
            if (jSONArray.length() <= 0) {
                c2186c = c2186c;
                c2186cM6480c = c2186cM6480c;
                z11 = z12;
            } else {
                String strM15765i = this.f51235i.m15765i();
                C2181a c2181a = this.f51236j;
                CleverTapInstanceConfig cleverTapInstanceConfig = this.f51229c;
                if (strM15765i == null) {
                    String str6 = cleverTapInstanceConfig.f10995a;
                    c2181a.getClass();
                    C2181a.m6452d(str6, "CleverTap Id not finalized, unable to send queue");
                } else {
                    try {
                        String strM18950p0 = m18950p0(false, eventGroup);
                        if (strM18950p0 == null) {
                            String str7 = cleverTapInstanceConfig.f10995a;
                            c2181a.getClass();
                            C2181a.m6452d(str7, "Problem configuring queue endpoint, unable to send queue");
                        } else {
                            try {
                                httpsURLConnectionM18945k0 = m18945k0(strM18950p0);
                                try {
                                    String strM18953s0 = m18953s0(context, jSONArray);
                                    if (strM18953s0 == null) {
                                        String str8 = cleverTapInstanceConfig.f10995a;
                                        c2181a.getClass();
                                        C2181a.m6452d(str8, "Problem configuring queue request, unable to send queue");
                                        try {
                                            httpsURLConnectionM18945k0.getInputStream().close();
                                            httpsURLConnectionM18945k0.disconnect();
                                        } catch (Throwable unused) {
                                        }
                                        c2186cM6480c = c2186cM6480c;
                                    } else {
                                        String str9 = cleverTapInstanceConfig.f10995a;
                                        c2186cM6480c = c2186cM6480c;
                                        try {
                                            String str10 = "Send queue contains " + jSONArray.length() + " items: " + strM18953s0;
                                            c2181a.getClass();
                                            C2181a.m6452d(str9, str10);
                                            C2181a.m6452d(cleverTapInstanceConfig.f10995a, "Sending queue to: ".concat(strM18950p0));
                                            httpsURLConnectionM18945k0.setDoOutput(true);
                                            httpsURLConnectionM18945k0.getOutputStream().write(strM18953s0.getBytes("UTF-8"));
                                            int responseCode = httpsURLConnectionM18945k0.getResponseCode();
                                            try {
                                                if (responseCode != 200) {
                                                    z10 = false;
                                                    c2186c = null;
                                                    throw new IOException("Response code is not 200. It is " + responseCode);
                                                }
                                                String headerField = httpsURLConnectionM18945k0.getHeaderField("X-WZRK-RD");
                                                Context context2 = this.f51230d;
                                                if (headerField == null || headerField.trim().length() <= 0 || !(!headerField.equals(C7977q0.m15829g(context2, cleverTapInstanceConfig, "comms_dmn", null)))) {
                                                    if (m18956v0(context, httpsURLConnectionM18945k0)) {
                                                        try {
                                                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnectionM18945k0.getInputStream(), "utf-8"));
                                                            StringBuilder sb2 = new StringBuilder();
                                                            while (true) {
                                                                String line = bufferedReader.readLine();
                                                                if (line == null) {
                                                                    break;
                                                                } else {
                                                                    sb2.append(line);
                                                                }
                                                                z10 = false;
                                                                String str11 = cleverTapInstanceConfig.f10995a;
                                                                c2181a.getClass();
                                                                C2181a.m6453e(str11, "An exception occurred while sending the queue, will retry: ", th);
                                                                this.f51226H++;
                                                                this.f51237k++;
                                                                ((C8740b) abstractC0140a.mo608z()).m16981n0(context);
                                                                if (httpsURLConnectionM18945k0 != 0) {
                                                                    try {
                                                                        httpsURLConnectionM18945k0.getInputStream().close();
                                                                        httpsURLConnectionM18945k0.disconnect();
                                                                    } catch (Throwable unused2) {
                                                                    }
                                                                }
                                                                z11 = z10;
                                                            }
                                                            c2186c = null;
                                                            try {
                                                                this.f51228b.mo591b0(null, sb2.toString(), context2);
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                z10 = false;
                                                                String str12 = cleverTapInstanceConfig.f10995a;
                                                                c2181a.getClass();
                                                                C2181a.m6453e(str12, "An exception occurred while sending the queue, will retry: ", th);
                                                                this.f51226H++;
                                                                this.f51237k++;
                                                                ((C8740b) abstractC0140a.mo608z()).m16981n0(context);
                                                                if (httpsURLConnectionM18945k0 != 0) {
                                                                    httpsURLConnectionM18945k0.getInputStream().close();
                                                                    httpsURLConnectionM18945k0.disconnect();
                                                                }
                                                                z11 = z10;
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            c2186c = null;
                                                        }
                                                    } else {
                                                        c2186c = null;
                                                    }
                                                    C7977q0.m15831i(context2, this.f51233g, C7977q0.m15833k(cleverTapInstanceConfig, "comms_last_ts"));
                                                    int i10 = this.f51233g;
                                                    if (C7977q0.m15825c(this.f51230d, this.f51229c, "comms_first_ts") <= 0) {
                                                        C7977q0.m15831i(context2, i10, C7977q0.m15833k(cleverTapInstanceConfig, "comms_first_ts"));
                                                    }
                                                    if (eventGroup == EventGroup.PUSH_NOTIFICATION_VIEWED) {
                                                        JSONObject jSONObjectOptJSONObject = jSONArray.getJSONObject(jSONArray.length() - 1).optJSONObject("evtData");
                                                        if (jSONObjectOptJSONObject != null) {
                                                            String strOptString = jSONObjectOptJSONObject.optString("wzrk_pid");
                                                            String str13 = this.f51232f.f43451I;
                                                            if (str13 != null && str13.equals(strOptString)) {
                                                                abstractC0140a.mo571I();
                                                                C2181a.m6460m(cleverTapInstanceConfig.f10995a, "push notification viewed event sent successfully for push id = " + strOptString);
                                                            }
                                                        }
                                                        C2181a.m6460m(cleverTapInstanceConfig.f10995a, "push notification viewed event sent successfully");
                                                    }
                                                    C2181a.m6452d(cleverTapInstanceConfig.f10995a, "Queue sent successfully");
                                                    z10 = false;
                                                    try {
                                                        this.f51226H = 0;
                                                        this.f51237k = 0;
                                                        try {
                                                            httpsURLConnectionM18945k0.getInputStream().close();
                                                            httpsURLConnectionM18945k0.disconnect();
                                                        } catch (Throwable unused3) {
                                                        }
                                                        z12 = true;
                                                        z11 = z12;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        String str14 = cleverTapInstanceConfig.f10995a;
                                                        c2181a.getClass();
                                                        C2181a.m6453e(str14, "An exception occurred while sending the queue, will retry: ", th);
                                                        this.f51226H++;
                                                        this.f51237k++;
                                                        ((C8740b) abstractC0140a.mo608z()).m16981n0(context);
                                                        if (httpsURLConnectionM18945k0 != 0) {
                                                            httpsURLConnectionM18945k0.getInputStream().close();
                                                            httpsURLConnectionM18945k0.disconnect();
                                                        }
                                                        z11 = z10;
                                                    }
                                                } else {
                                                    m18957w0(context, headerField);
                                                    C2181a.m6452d(cleverTapInstanceConfig.f10995a, "The domain has changed to " + headerField + ". The request will be retried shortly.");
                                                    try {
                                                        httpsURLConnectionM18945k0.getInputStream().close();
                                                        httpsURLConnectionM18945k0.disconnect();
                                                    } catch (Throwable unused4) {
                                                    }
                                                }
                                                String str15 = cleverTapInstanceConfig.f10995a;
                                                c2181a.getClass();
                                                C2181a.m6453e(str15, "An exception occurred while sending the queue, will retry: ", th);
                                                this.f51226H++;
                                                this.f51237k++;
                                                ((C8740b) abstractC0140a.mo608z()).m16981n0(context);
                                                if (httpsURLConnectionM18945k0 != 0) {
                                                    httpsURLConnectionM18945k0.getInputStream().close();
                                                    httpsURLConnectionM18945k0.disconnect();
                                                }
                                                z11 = z10;
                                            } catch (Throwable th5) {
                                                if (httpsURLConnectionM18945k0 != 0) {
                                                    try {
                                                        httpsURLConnectionM18945k0.getInputStream().close();
                                                        httpsURLConnectionM18945k0.disconnect();
                                                    } catch (Throwable unused5) {
                                                    }
                                                }
                                                throw th5;
                                            }
                                            th = th4;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            z10 = false;
                                            c2186c = null;
                                        }
                                    }
                                    z11 = false;
                                    c2186c = null;
                                } catch (Throwable th7) {
                                    th = th7;
                                    c2186cM6480c = c2186cM6480c;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                z10 = false;
                                httpsURLConnectionM18945k0 = c2186c;
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        z10 = false;
                    }
                }
                c2186c = c2186c;
                c2186cM6480c = c2186cM6480c;
                z11 = z12;
            }
            c2186c = c2186c;
            c2186c2 = c2186cM6480c;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final JSONObject m18947m0() {
        String strConcat;
        SharedPreferences sharedPreferencesM18954t0;
        Context context = this.f51230d;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f51229c;
        C2181a c2181a = this.f51236j;
        try {
            String strM18951q0 = m18951q0();
            if (strM18951q0 == null) {
                return null;
            }
            if (C7977q0.m15827e(context, strM18951q0).getAll().isEmpty()) {
                String str = cleverTapInstanceConfig.f10995a;
                if (str == null) {
                    strConcat = null;
                } else {
                    String strConcat2 = "Old ARP Key = ARP:".concat(str);
                    c2181a.getClass();
                    C2181a.m6460m(str, strConcat2);
                    strConcat = "ARP:".concat(str);
                }
                sharedPreferencesM18954t0 = m18954t0(strM18951q0, strConcat);
            } else {
                sharedPreferencesM18954t0 = C7977q0.m15827e(context, strM18951q0);
            }
            Map<String, ?> all = sharedPreferencesM18954t0.getAll();
            Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
            while (true) {
                while (it.hasNext()) {
                    Object value = it.next().getValue();
                    if ((value instanceof Number) && ((Number) value).intValue() == -1) {
                        it.remove();
                    }
                }
                JSONObject jSONObject = new JSONObject(all);
                String str2 = cleverTapInstanceConfig.f10995a;
                String str3 = "Fetched ARP for namespace key: " + strM18951q0 + " values: " + all.toString();
                c2181a.getClass();
                C2181a.m6460m(str2, str3);
                return jSONObject;
            }
        } catch (Throwable th2) {
            String str4 = cleverTapInstanceConfig.f10995a;
            c2181a.getClass();
            C2181a.m6461n(str4, "Failed to construct ARP object", th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final int m18948n0() {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f51229c;
        String str = cleverTapInstanceConfig.f10995a;
        String str2 = "Network retry #" + this.f51237k;
        this.f51236j.getClass();
        C2181a.m6452d(str, str2);
        int i10 = this.f51237k;
        String str3 = cleverTapInstanceConfig.f10995a;
        if (i10 < 10) {
            C2181a.m6452d(str3, "Failure count is " + this.f51237k + ". Setting delay frequency to 1s");
            return 1000;
        }
        if (cleverTapInstanceConfig.f10996b == null) {
            C2181a.m6452d(str3, "Setting delay frequency to 1s");
            return 1000;
        }
        int iNextInt = ((new SecureRandom().nextInt(10) + 1) * 1000) + 0;
        if (iNextInt >= 600000) {
            C2181a.m6452d(str3, "Setting delay frequency to 1000");
            return 1000;
        }
        C2181a.m6452d(str3, "Setting delay frequency to " + iNextInt);
        return iNextInt;
    }

    /* JADX INFO: renamed from: o0 */
    public final String m18949o0(EventGroup eventGroup) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f51229c;
        try {
            String str = cleverTapInstanceConfig.f10996b;
            if (str != null && str.trim().length() > 0) {
                this.f51226H = 0;
                if (!eventGroup.equals(EventGroup.PUSH_NOTIFICATION_VIEWED)) {
                    return str.trim().toLowerCase() + ".wzrkt.com";
                }
                return str.trim().toLowerCase() + eventGroup.httpResource + ".wzrkt.com";
            }
        } catch (Throwable unused) {
        }
        boolean zEquals = eventGroup.equals(EventGroup.PUSH_NOTIFICATION_VIEWED);
        Context context = this.f51230d;
        return zEquals ? C7977q0.m15829g(context, cleverTapInstanceConfig, "comms_dmn_spiky", null) : C7977q0.m15829g(context, cleverTapInstanceConfig, "comms_dmn", null);
    }

    /* JADX INFO: renamed from: p0 */
    public final String m18950p0(boolean z10, EventGroup eventGroup) {
        String strM765k;
        String strM18949o0 = m18949o0(eventGroup);
        boolean z11 = strM18949o0 == null || strM18949o0.trim().length() == 0;
        if (!z11 || z10) {
            strM765k = z11 ? "wzrkt.com/hello" : C0166e.m765k(strM18949o0, "/a1");
        } else {
            strM765k = null;
        }
        C2181a c2181a = this.f51236j;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f51229c;
        if (strM765k == null) {
            String str = cleverTapInstanceConfig.f10995a;
            c2181a.getClass();
            C2181a.m6460m(str, "Unable to configure endpoint, domain is null");
            return null;
        }
        String str2 = cleverTapInstanceConfig.f10995a;
        if (str2 == null) {
            c2181a.getClass();
            C2181a.m6460m(str2, "Unable to configure endpoint, accountID is null");
            return null;
        }
        StringBuilder sbM854m = C0204c.m854m("https://", strM765k, "?os=Android&t=");
        sbM854m.append(this.f51235i.m15764h().f43314m);
        String strM21i = C0009a.m21i(sbM854m.toString(), "&z=", str2);
        if (m18955u0(eventGroup)) {
            return strM21i;
        }
        this.f51233g = (int) (System.currentTimeMillis() / 1000);
        StringBuilder sbM26o = C0009a.m26o(strM21i, "&ts=");
        sbM26o.append(this.f51233g);
        return sbM26o.toString();
    }

    /* JADX INFO: renamed from: q0 */
    public final String m18951q0() {
        String str = this.f51229c.f10995a;
        if (str == null) {
            return null;
        }
        StringBuilder sbM854m = C0204c.m854m("New ARP Key = ARP:", str, ":");
        C7951d0 c7951d0 = this.f51235i;
        sbM854m.append(c7951d0.m15765i());
        String string = sbM854m.toString();
        this.f51236j.getClass();
        C2181a.m6460m(str, string);
        return "ARP:" + str + ":" + c7951d0.m15765i();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: r0 */
    public final void m18952r0(EventGroup eventGroup, C8740b.b bVar) {
        HttpsURLConnection httpsURLConnectionM18945k0;
        this.f51226H = 0;
        Context context = this.f51230d;
        String strM18950p0 = m18950p0(true, eventGroup);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f51229c;
        C2181a c2181a = this.f51236j;
        if (strM18950p0 == null) {
            String str = cleverTapInstanceConfig.f10995a;
            c2181a.getClass();
            C2181a.m6460m(str, "Unable to perform handshake, endpoint is null");
        }
        String str2 = cleverTapInstanceConfig.f10995a;
        c2181a.getClass();
        C2181a.m6460m(str2, "Performing handshake with " + strM18950p0);
        try {
            try {
                httpsURLConnectionM18945k0 = m18945k0(strM18950p0);
                try {
                    int responseCode = httpsURLConnectionM18945k0.getResponseCode();
                    if (responseCode == 200) {
                        C2181a.m6460m(str2, "Received success from handshake :)");
                        if (m18956v0(context, httpsURLConnectionM18945k0)) {
                            C2181a.m6460m(str2, "We are not muted");
                            bVar.run();
                        }
                        httpsURLConnectionM18945k0.getInputStream().close();
                        httpsURLConnectionM18945k0.disconnect();
                    }
                    C2181a.m6460m(str2, "Invalid HTTP status code received for handshake - " + responseCode);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        C2181a.m6461n(str2, "Failed to perform handshake!", th);
                        if (httpsURLConnectionM18945k0 != null) {
                        }
                    } catch (Throwable th3) {
                        if (httpsURLConnectionM18945k0 != null) {
                            try {
                                httpsURLConnectionM18945k0.getInputStream().close();
                                httpsURLConnectionM18945k0.disconnect();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                httpsURLConnectionM18945k0 = null;
            }
            httpsURLConnectionM18945k0.getInputStream().close();
            httpsURLConnectionM18945k0.disconnect();
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: s0 */
    public final String m18953s0(Context context, JSONArray jSONArray) {
        JSONObject jSONObject;
        String str;
        String str2;
        String str3;
        try {
            JSONObject jSONObject2 = new JSONObject();
            String strM15765i = this.f51235i.m15765i();
            if (strM15765i == null || strM15765i.equals("")) {
                C2181a c2181a = this.f51236j;
                String str4 = this.f51229c.f10995a;
                c2181a.getClass();
                C2181a.m6460m(str4, "CRITICAL: Couldn't finalise on a device ID! Using error device ID instead!");
            } else {
                jSONObject2.put("g", strM15765i);
            }
            jSONObject2.put("type", "meta");
            jSONObject2.put("af", this.f51235i.m15762f());
            for (Map.Entry<String, Integer> entry : this.f51232f.f43453K.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            long jM15826d = C7977q0.m15826d(this.f51230d, this.f51229c, "comms_i");
            if (jM15826d > 0) {
                jSONObject2.put("_i", jM15826d);
            }
            long jM15826d2 = C7977q0.m15826d(this.f51230d, this.f51229c, "comms_j");
            if (jM15826d2 > 0) {
                jSONObject2.put("_j", jM15826d2);
            }
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f51229c;
            String str5 = cleverTapInstanceConfig.f10995a;
            String str6 = cleverTapInstanceConfig.f10997c;
            if (str5 == null || str6 == null) {
                this.f51236j.getClass();
                C2181a.m6452d(str5, "Account ID/token not found, unable to configure queue request");
                return null;
            }
            jSONObject2.put("id", str5);
            jSONObject2.put("tk", str6);
            jSONObject2.put("l_ts", C7977q0.m15825c(this.f51230d, this.f51229c, "comms_last_ts"));
            jSONObject2.put("f_ts", C7977q0.m15825c(this.f51230d, this.f51229c, "comms_first_ts"));
            jSONObject2.put("ct_pi", C8573r0.m16759t0(this.f51230d, this.f51229c, this.f51235i, this.f51238l).mo4796c().toString());
            jSONObject2.put("ddnd", (this.f51235i.m15764h().f43311j && this.f51231e.f43444m.m6579i()) ? false : true);
            if (this.f51232f.f43468j) {
                jSONObject2.put("bk", 1);
                this.f51232f.f43468j = false;
            }
            jSONObject2.put("rtl", C5049a.m10725d(this.f51234h.mo6479b(this.f51230d)));
            C7986y c7986y = this.f51232f;
            if (!c7986y.f43467i) {
                jSONObject2.put("rct", c7986y.f43454L);
                jSONObject2.put("ait", this.f51232f.f43459a);
            }
            jSONObject2.put("frs", this.f51232f.f43464f);
            this.f51232f.f43464f = false;
            try {
                JSONObject jSONObjectM18947m0 = m18947m0();
                if (jSONObjectM18947m0 != null && jSONObjectM18947m0.length() > 0) {
                    jSONObject2.put("arp", jSONObjectM18947m0);
                }
            } catch (Throwable th2) {
                C2181a c2181a2 = this.f51236j;
                String str7 = this.f51229c.f10995a;
                c2181a2.getClass();
                C2181a.m6461n(str7, "Failed to attach ARP", th2);
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                C7986y c7986y2 = this.f51232f;
                synchronized (c7986y2) {
                    try {
                        str = c7986y2.f43455M;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (str != null) {
                    jSONObject3.put("us", str);
                }
                C7986y c7986y3 = this.f51232f;
                synchronized (c7986y3) {
                    str2 = c7986y3.f43456N;
                }
                if (str2 != null) {
                    jSONObject3.put("um", str2);
                }
                C7986y c7986y4 = this.f51232f;
                synchronized (c7986y4) {
                    try {
                        str3 = c7986y4.f43457O;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (str3 != null) {
                    jSONObject3.put("uc", str3);
                }
                if (jSONObject3.length() > 0) {
                    jSONObject2.put("ref", jSONObject3);
                }
            } catch (Throwable th5) {
                C2181a c2181a3 = this.f51236j;
                String str8 = this.f51229c.f10995a;
                c2181a3.getClass();
                C2181a.m6461n(str8, "Failed to attach ref", th5);
            }
            C7986y c7986y5 = this.f51232f;
            synchronized (c7986y5) {
                try {
                    jSONObject = c7986y5.f43458P;
                } catch (Throwable th6) {
                    throw th6;
                }
            }
            if (jSONObject != null && jSONObject.length() > 0) {
                jSONObject2.put("wzrk_ref", jSONObject);
            }
            if (this.f51231e.f43432a != null) {
                C2181a.m6455h("Attaching InAppFC to Header");
                this.f51231e.f43432a.m15773a(context, jSONObject2);
            } else {
                C2181a c2181a4 = this.f51236j;
                String str9 = this.f51229c.f10995a;
                c2181a4.getClass();
                C2181a.m6460m(str9, "controllerManager.getInAppFCManager() is NULL, not Attaching InAppFC to Header");
            }
            return "[" + jSONObject2.toString() + ", " + jSONArray.toString().substring(1);
        } catch (Throwable th7) {
            C2181a c2181a5 = this.f51236j;
            String str10 = this.f51229c.f10995a;
            c2181a5.getClass();
            C2181a.m6461n(str10, "CommsManager: Failed to attach header", th7);
            return jSONArray.toString();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final SharedPreferences m18954t0(String str, String str2) {
        Context context = this.f51230d;
        SharedPreferences sharedPreferencesM15827e = C7977q0.m15827e(context, str2);
        SharedPreferences sharedPreferencesM15827e2 = C7977q0.m15827e(context, str);
        SharedPreferences.Editor editorEdit = sharedPreferencesM15827e2.edit();
        Iterator<Map.Entry<String, ?>> it = sharedPreferencesM15827e.getAll().entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f51229c;
            C2181a c2181a = this.f51236j;
            if (!zHasNext) {
                c2181a.getClass();
                C2181a.m6460m(cleverTapInstanceConfig.f10995a, "Completed ARP update for namespace key: " + str + "");
                C7977q0.m15830h(editorEdit);
                sharedPreferencesM15827e.edit().clear().apply();
                return sharedPreferencesM15827e2;
            }
            Map.Entry<String, ?> next = it.next();
            Object value = next.getValue();
            if (value instanceof Number) {
                editorEdit.putInt(next.getKey(), ((Number) value).intValue());
            } else if (value instanceof String) {
                String str3 = (String) value;
                if (str3.length() < 100) {
                    editorEdit.putString(next.getKey(), str3);
                } else {
                    String str4 = cleverTapInstanceConfig.f10995a;
                    String str5 = "ARP update for key " + next.getKey() + " rejected (string value too long)";
                    c2181a.getClass();
                    C2181a.m6460m(str4, str5);
                }
            } else if (value instanceof Boolean) {
                editorEdit.putBoolean(next.getKey(), ((Boolean) value).booleanValue());
            } else {
                String str6 = cleverTapInstanceConfig.f10995a;
                String str7 = "ARP update for key " + next.getKey() + " rejected (invalid data type)";
                c2181a.getClass();
                C2181a.m6460m(str6, str7);
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m18955u0(EventGroup eventGroup) {
        String strM18949o0 = m18949o0(eventGroup);
        boolean z10 = this.f51226H > 5;
        if (z10) {
            m18957w0(this.f51230d, null);
        }
        return strM18949o0 == null || z10;
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m18956v0(Context context, HttpsURLConnection httpsURLConnection) {
        String headerField = httpsURLConnection.getHeaderField("X-WZRK-MUTE");
        if (headerField != null && headerField.trim().length() > 0) {
            if (headerField.equals("true")) {
                m18958x0(context, true);
                return false;
            }
            m18958x0(context, false);
        }
        String headerField2 = httpsURLConnection.getHeaderField("X-WZRK-RD");
        C2181a.m6455h("Getting domain from header - " + headerField2);
        if (headerField2 != null && headerField2.trim().length() != 0) {
            String headerField3 = httpsURLConnection.getHeaderField("X-WZRK-SPIKY-RD");
            C2181a.m6455h("Getting spiky domain from header - " + headerField3);
            m18958x0(context, false);
            m18957w0(context, headerField2);
            C2181a.m6455h("Setting spiky domain from header as -" + headerField3);
            if (headerField3 == null) {
                m18959y0(context, headerField2);
            } else {
                m18959y0(context, headerField3);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m18957w0(Context context, String str) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f51229c;
        String str2 = cleverTapInstanceConfig.f10995a;
        String strM852k = C0204c.m852k("Setting domain to ", str);
        this.f51236j.getClass();
        C2181a.m6460m(str2, strM852k);
        C7977q0.m15832j(context, C7977q0.m15833k(cleverTapInstanceConfig, "comms_dmn"), str);
        this.f51227a.mo578P();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m18958x0(Context context, boolean z10) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f51229c;
        if (!z10) {
            C7977q0.m15831i(context, 0, C7977q0.m15833k(cleverTapInstanceConfig, "comms_mtd"));
            return;
        }
        C7977q0.m15831i(context, (int) (System.currentTimeMillis() / 1000), C7977q0.m15833k(cleverTapInstanceConfig, "comms_mtd"));
        m18957w0(context, null);
        C1735a.m5472a(cleverTapInstanceConfig).m5474b().m6585b("CommsManager#setMuted", new a(context));
    }

    /* JADX INFO: renamed from: y0 */
    public final void m18959y0(Context context, String str) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f51229c;
        String str2 = cleverTapInstanceConfig.f10995a;
        String strConcat = "Setting spiky domain to ".concat(str);
        this.f51236j.getClass();
        C2181a.m6460m(str2, strConcat);
        C7977q0.m15832j(context, C7977q0.m15833k(cleverTapInstanceConfig, "comms_dmn_spiky"), str);
    }
}
