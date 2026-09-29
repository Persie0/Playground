package p028b7;

import android.content.Context;
import android.support.v4.media.AbstractC0140a;
import android.text.TextUtils;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p080e.C5288t;
import p290o6.C7985x;

/* JADX INFO: renamed from: b7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1327e extends AbstractC1324b {

    /* JADX INFO: renamed from: b */
    public final Object f8086b = new Object();

    /* JADX INFO: renamed from: c */
    public final AbstractC0140a f8087c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0140a f8088d;

    /* JADX INFO: renamed from: e */
    public final CleverTapInstanceConfig f8089e;

    /* JADX INFO: renamed from: f */
    public final C7985x f8090f;

    /* JADX INFO: renamed from: g */
    public final C2181a f8091g;

    public C1327e(AbstractC0140a abstractC0140a, CleverTapInstanceConfig cleverTapInstanceConfig, AbstractC0140a abstractC0140a2, C7985x c7985x) {
        this.f8088d = abstractC0140a;
        this.f8089e = cleverTapInstanceConfig;
        this.f8091g = cleverTapInstanceConfig.m6433b();
        this.f8087c = abstractC0140a2;
        this.f8090f = c7985x;
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: b0 */
    public final void mo591b0(JSONObject jSONObject, String str, Context context) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f8089e;
        String str2 = cleverTapInstanceConfig.f10995a;
        this.f8091g.getClass();
        C2181a.m6460m(str2, "Processing Display Unit items...");
        String str3 = cleverTapInstanceConfig.f10995a;
        boolean z10 = cleverTapInstanceConfig.f10999e;
        AbstractC0140a abstractC0140a = this.f8088d;
        if (z10) {
            C2181a.m6460m(str3, "CleverTap instance is configured to analytics only, not processing Display Unit response");
            abstractC0140a.mo591b0(jSONObject, str, context);
            return;
        }
        if (jSONObject == null) {
            C2181a.m6460m(str3, "DisplayUnit : Can't parse Display Unit Response, JSON response object is null");
            return;
        }
        if (!jSONObject.has("adUnit_notifs")) {
            C2181a.m6460m(str3, "DisplayUnit : JSON object doesn't contain the Display Units key");
            abstractC0140a.mo591b0(jSONObject, str, context);
            return;
        }
        try {
            C2181a.m6460m(str3, "DisplayUnit : Processing Display Unit response");
            m4890l0(jSONObject.getJSONArray("adUnit_notifs"));
        } catch (Throwable th2) {
            C2181a.m6461n(str3, "DisplayUnit : Failed to parse response", th2);
        }
        abstractC0140a.mo591b0(jSONObject, str, context);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l0 */
    public final void m4890l0(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            C2181a c2181a = this.f8091g;
            String str = this.f8089e.f10995a;
            c2181a.getClass();
            C2181a.m6460m(str, "DisplayUnit : Can't parse Display Units, jsonArray is either empty or null");
            return;
        }
        synchronized (this.f8086b) {
            try {
                C7985x c7985x = this.f8090f;
                if (c7985x.f43434c == null) {
                    c7985x.f43434c = new C5288t(5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C5288t c5288t = this.f8090f.f43434c;
        synchronized (c5288t) {
            try {
                synchronized (c5288t) {
                    try {
                        ((HashMap) c5288t.f33503b).clear();
                        C2181a.m6450b("DisplayUnit : ", "Cleared Display Units Cache");
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                this.f8087c.mo582T(arrayList);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        ArrayList arrayList = null;
        if (jSONArray.length() > 0) {
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    CleverTapDisplayUnit cleverTapDisplayUnitM6483a = CleverTapDisplayUnit.m6483a((JSONObject) jSONArray.get(i10));
                    if (TextUtils.isEmpty(cleverTapDisplayUnitM6483a.f11052d)) {
                        ((HashMap) c5288t.f33503b).put(cleverTapDisplayUnitM6483a.f11055g, cleverTapDisplayUnitM6483a);
                        arrayList2.add(cleverTapDisplayUnitM6483a);
                    } else {
                        C2181a.m6450b("DisplayUnit : ", "Failed to convert JsonArray item at index:" + i10 + " to Display Unit");
                    }
                } catch (Exception e10) {
                    C2181a.m6450b("DisplayUnit : ", "Failed while parsing Display Unit:" + e10.getLocalizedMessage());
                }
            }
            arrayList = arrayList2.isEmpty() ? null : arrayList2;
        } else {
            C2181a.m6450b("DisplayUnit : ", "Null json array response can't parse Display Units ");
        }
        this.f8087c.mo582T(arrayList);
    }
}
