package p028b7;

import android.content.Context;
import android.support.v4.media.AbstractC0140a;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONArray;
import org.json.JSONObject;
import p289o5.C7940t;
import p290o6.C7985x;
import p408u6.C9471j;

/* JADX INFO: renamed from: b7.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1331i extends AbstractC1324b {

    /* JADX INFO: renamed from: b */
    public final Object f8107b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0140a f8108c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0140a f8109d;

    /* JADX INFO: renamed from: e */
    public final CleverTapInstanceConfig f8110e;

    /* JADX INFO: renamed from: f */
    public final C2181a f8111f;

    /* JADX INFO: renamed from: g */
    public final C7985x f8112g;

    public C1331i(AbstractC0140a abstractC0140a, CleverTapInstanceConfig cleverTapInstanceConfig, C7940t c7940t, AbstractC0140a abstractC0140a2, C7985x c7985x) {
        this.f8109d = abstractC0140a;
        this.f8110e = cleverTapInstanceConfig;
        this.f8108c = abstractC0140a2;
        this.f8111f = cleverTapInstanceConfig.m6433b();
        this.f8107b = c7940t.f43257b;
        this.f8112g = c7985x;
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: b0 */
    public final void mo591b0(JSONObject jSONObject, String str, Context context) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f8110e;
        if (cleverTapInstanceConfig.f10999e) {
            C2181a c2181a = this.f8111f;
            String str2 = cleverTapInstanceConfig.f10995a;
            c2181a.getClass();
            C2181a.m6460m(str2, "CleverTap instance is configured to analytics only, not processing inbox messages");
            this.f8109d.mo591b0(jSONObject, str, context);
            return;
        }
        C2181a c2181a2 = this.f8111f;
        String str3 = cleverTapInstanceConfig.f10995a;
        c2181a2.getClass();
        C2181a.m6460m(str3, "Inbox: Processing response");
        if (!jSONObject.has("inbox_notifs")) {
            C2181a c2181a3 = this.f8111f;
            String str4 = this.f8110e.f10995a;
            c2181a3.getClass();
            C2181a.m6460m(str4, "Inbox: Response JSON object doesn't contain the inbox key");
            this.f8109d.mo591b0(jSONObject, str, context);
            return;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("inbox_notifs");
            synchronized (this.f8107b) {
                try {
                    C7985x c7985x = this.f8112g;
                    if (c7985x.f43436e == null) {
                        c7985x.m15845a();
                    }
                    C9471j c9471j = this.f8112g.f43436e;
                    if (c9471j != null && c9471j.m17889e(jSONArray)) {
                        this.f8108c.mo597h();
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            C2181a c2181a4 = this.f8111f;
            String str5 = this.f8110e.f10995a;
            c2181a4.getClass();
            C2181a.m6461n(str5, "InboxResponse: Failed to parse response", th2);
        }
        this.f8109d.mo591b0(jSONObject, str, context);
    }
}
