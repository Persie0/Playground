package p028b7;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.AbstractC0140a;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.p049db.AbstractC2184a;
import com.clevertap.android.sdk.p049db.C2185b;
import com.clevertap.android.sdk.p049db.DBAdapter;
import com.clevertap.android.sdk.pushnotification.C2257c;
import com.clevertap.android.sdk.pushnotification.PushConstants;
import com.clevertap.android.sdk.task.Task;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p043c7.C1735a;
import p043c7.RunnableC1745k;
import p066d7.C5049a;
import p290o6.C7972o;
import p290o6.C7985x;
import p290o6.CallableC7978r;
import p526z6.C10445a;

/* JADX INFO: renamed from: b7.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1334l extends AbstractC1324b {

    /* JADX INFO: renamed from: b */
    public final AbstractC0140a f8124b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0140a f8125c;

    /* JADX INFO: renamed from: d */
    public final CleverTapInstanceConfig f8126d;

    /* JADX INFO: renamed from: e */
    public final Context f8127e;

    /* JADX INFO: renamed from: f */
    public final C2181a f8128f;

    /* JADX INFO: renamed from: g */
    public final C7985x f8129g;

    /* JADX INFO: renamed from: h */
    public final AbstractC2184a f8130h;

    public C1334l(C1327e c1327e, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, C2185b c2185b, C7972o c7972o, C7985x c7985x) {
        this.f8125c = c1327e;
        this.f8127e = context;
        this.f8126d = cleverTapInstanceConfig;
        this.f8128f = cleverTapInstanceConfig.m6433b();
        this.f8130h = c2185b;
        this.f8124b = c7972o;
        this.f8129g = c7985x;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008e A[Catch: all -> 0x00d5, TryCatch #1 {all -> 0x00d5, blocks: (B:7:0x002f, B:9:0x0035, B:11:0x0051, B:12:0x005b, B:20:0x0088, B:22:0x008e, B:24:0x00a6, B:26:0x00bc, B:27:0x00c7, B:18:0x0071, B:15:0x0062), top: B:33:0x002f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a6 A[Catch: all -> 0x00d5, TryCatch #1 {all -> 0x00d5, blocks: (B:7:0x002f, B:9:0x0035, B:11:0x0051, B:12:0x005b, B:20:0x0088, B:22:0x008e, B:24:0x00a6, B:26:0x00bc, B:27:0x00c7, B:18:0x0071, B:15:0x0062), top: B:33:0x002f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00bc A[Catch: all -> 0x00d5, LOOP:0: B:25:0x00ba->B:26:0x00bc, LOOP_END, TryCatch #1 {all -> 0x00d5, blocks: (B:7:0x002f, B:9:0x0035, B:11:0x0051, B:12:0x005b, B:20:0x0088, B:22:0x008e, B:24:0x00a6, B:26:0x00bc, B:27:0x00c7, B:18:0x0071, B:15:0x0062), top: B:33:0x002f, inners: #0 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x008e, please report this as an issue */
    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: b0 */
    public final void mo591b0(JSONObject jSONObject, String str, Context context) {
        boolean z10;
        JSONArray jSONArrayM10725d;
        int length;
        String[] strArr;
        int i10;
        AbstractC2184a abstractC2184a = this.f8130h;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f8126d;
        boolean z11 = cleverTapInstanceConfig.f10999e;
        String str2 = cleverTapInstanceConfig.f10995a;
        AbstractC0140a abstractC0140a = this.f8125c;
        C2181a c2181a = this.f8128f;
        if (z11) {
            c2181a.getClass();
            C2181a.m6460m(str2, "CleverTap instance is configured to analytics only, not processing push amp response");
            abstractC0140a.mo591b0(jSONObject, str, context);
            return;
        }
        try {
            if (jSONObject.has("pushamp_notifs")) {
                c2181a.getClass();
                C2181a.m6460m(str2, "Processing pushamp messages...");
                JSONObject jSONObject2 = jSONObject.getJSONObject("pushamp_notifs");
                JSONArray jSONArray = jSONObject2.getJSONArray("list");
                if (jSONArray.length() > 0) {
                    C2181a.m6460m(str2, "Handling Push payload locally");
                    m4893l0(jSONArray);
                }
                if (jSONObject2.has("pf")) {
                    try {
                        this.f8129g.f43444m.m6583m(jSONObject2.getInt("pf"), context);
                    } catch (Throwable th2) {
                        C2181a.m6458k("Error handling ping frequency in response : " + th2.getMessage());
                    }
                    if (jSONObject2.has("ack")) {
                        z10 = jSONObject2.getBoolean("ack");
                        C2181a.m6458k("Received ACK -" + z10);
                        if (z10) {
                            jSONArrayM10725d = C5049a.m10725d(abstractC2184a.mo6479b(context));
                            length = jSONArrayM10725d.length();
                            strArr = new String[length];
                            for (i10 = 0; i10 < length; i10++) {
                                strArr[i10] = jSONArrayM10725d.getString(i10);
                            }
                            C2181a.m6458k("Updating RTL values...");
                            abstractC2184a.mo6479b(context).m6476m(strArr);
                        }
                    }
                } else if (jSONObject2.has("ack")) {
                    z10 = jSONObject2.getBoolean("ack");
                    C2181a.m6458k("Received ACK -" + z10);
                    if (z10) {
                        jSONArrayM10725d = C5049a.m10725d(abstractC2184a.mo6479b(context));
                        length = jSONArrayM10725d.length();
                        strArr = new String[length];
                        while (i10 < length) {
                            strArr[i10] = jSONArrayM10725d.getString(i10);
                        }
                        C2181a.m6458k("Updating RTL values...");
                        abstractC2184a.mo6479b(context).m6476m(strArr);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        abstractC0140a.mo591b0(jSONObject, str, context);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0172 A[Catch: JSONException -> 0x0198, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0198, blocks: (B:3:0x000b, B:5:0x0013, B:7:0x0023, B:8:0x002c, B:9:0x0032, B:11:0x0038, B:12:0x004a, B:16:0x0054, B:17:0x0060, B:20:0x006b, B:22:0x006e, B:23:0x0088, B:37:0x0164, B:39:0x0167, B:42:0x016b, B:43:0x016c, B:46:0x016f, B:47:0x0170, B:49:0x0172, B:24:0x0089, B:28:0x00a6, B:35:0x0119, B:36:0x012b, B:18:0x0061), top: B:53:0x000b, inners: #2, #3 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x0172, please report this as an issue */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: l0 */
    public final void m4893l0(JSONArray jSONArray) {
        boolean zEquals;
        Context context = this.f8127e;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f8126d;
        C2181a c2181a = this.f8128f;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                Bundle bundle = new Bundle();
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (jSONObject.has("wzrk_ttl")) {
                    bundle.putLong("wzrk_ttl", jSONObject.getLong("wzrk_ttl"));
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String string = itKeys.next().toString();
                    bundle.putString(string, jSONObject.getString(string));
                }
                if (bundle.isEmpty()) {
                    String str = cleverTapInstanceConfig.f10995a;
                    String str2 = "Push Notification already shown, ignoring local notification :" + jSONObject.getString("wzrk_pid");
                    c2181a.getClass();
                    C2181a.m6460m(str, str2);
                } else {
                    DBAdapter dBAdapterMo6479b = this.f8130h.mo6479b(context);
                    String string2 = jSONObject.getString("wzrk_pid");
                    synchronized (dBAdapterMo6479b) {
                        zEquals = string2.equals(dBAdapterMo6479b.m6468e(string2));
                    }
                    if (zEquals) {
                        String str3 = cleverTapInstanceConfig.f10995a;
                        String str4 = "Push Notification already shown, ignoring local notification :" + jSONObject.getString("wzrk_pid");
                        c2181a.getClass();
                        C2181a.m6460m(str3, str4);
                    } else {
                        c2181a.getClass();
                        C2181a.m6458k("Creating Push Notification locally");
                        this.f8124b.mo575M();
                        C2257c c2257c = C2257c.a.f11334a;
                        String string3 = PushConstants.PushType.FCM.toString();
                        synchronized (c2257c) {
                            CleverTapAPI cleverTapAPIM6419d = CleverTapAPI.m6419d(context, bundle.getString("wzrk_acct_id", ""));
                            if (CleverTapAPI.m6421h(bundle).f52296b) {
                                if (cleverTapAPIM6419d != null) {
                                    cleverTapAPIM6419d.f10981b.f43471a.m6434c("PushProvider", string3 + "received notification from CleverTap: " + bundle.toString());
                                    C2257c.m6569b(bundle);
                                    "signedcall".equals(bundle.getString("source"));
                                    C10445a c10445a = new C10445a();
                                    CleverTapInstanceConfig cleverTapInstanceConfig2 = cleverTapAPIM6419d.f10981b.f43471a;
                                    try {
                                        Task taskM5474b = C1735a.m5472a(cleverTapInstanceConfig2).m5474b();
                                        CallableC7978r callableC7978r = new CallableC7978r(cleverTapAPIM6419d, c10445a, bundle, context);
                                        Executor executor = taskM5474b.f11356c;
                                        if (!(executor instanceof ExecutorService)) {
                                            throw new UnsupportedOperationException("Can't use this method without ExecutorService, Use Execute alternatively ");
                                        }
                                        ((ExecutorService) executor).submit(new RunnableC1745k(taskM5474b, "CleverTapAPI#renderPushNotification", callableC7978r));
                                    } catch (Throwable th2) {
                                        C2181a c2181aM6433b = cleverTapInstanceConfig2.m6433b();
                                        String str5 = cleverTapInstanceConfig2.f10995a;
                                        c2181aM6433b.getClass();
                                        C2181a.m6453e(str5, "Failed to process renderPushNotification()", th2);
                                    }
                                } else {
                                    C2181a.m6450b("PushProvider", string3 + "received notification from CleverTap: " + bundle.toString());
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(string3);
                                    sb2.append(" not renderning since cleverTapAPI is null");
                                    C2181a.m6450b("PushProvider", sb2.toString());
                                }
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
                String str6 = cleverTapInstanceConfig.f10995a;
                c2181a.getClass();
                C2181a.m6460m(str6, "Error parsing push notification JSON");
                return;
            }
        }
    }
}
