package p317p7;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5055a;
import p067d8.C5086z;
import p173i8.C6205a;
import p409u7.C9475a;
import sl.C9072e;

/* JADX INFO: renamed from: p7.l */
/* JADX INFO: loaded from: classes.dex */
public final class C8205l {

    /* JADX INFO: renamed from: a */
    public final C5055a f44403a;

    /* JADX INFO: renamed from: b */
    public final String f44404b;

    /* JADX INFO: renamed from: c */
    public ArrayList f44405c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f44406d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f44407e;

    public C8205l(C5055a c5055a, String str) {
        this.f44403a = c5055a;
        this.f44404b = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m16342a(AppEvent appEvent) {
        try {
            if (C6205a.m12742b(this)) {
                return;
            }
            try {
                C5207g.m11111f(appEvent, "event");
                if (this.f44405c.size() + this.f44406d.size() >= 1000) {
                    this.f44407e++;
                } else {
                    this.f44405c.add(appEvent);
                }
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m16343b(boolean z10) {
        if (C6205a.m12742b(this)) {
            return;
        }
        if (z10) {
            try {
                this.f44405c.addAll(this.f44406d);
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
                return;
            }
        }
        this.f44406d.clear();
        this.f44407e = 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized List<AppEvent> m16344c() {
        try {
            if (C6205a.m12742b(this)) {
                return null;
            }
            try {
                ArrayList arrayList = this.f44405c;
                this.f44405c = new ArrayList();
                return arrayList;
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
                return null;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m16345d(GraphRequest graphRequest, Context context, boolean z10, boolean z11) {
        boolean zM11106a;
        if (C6205a.m12742b(this)) {
            return 0;
        }
        try {
            synchronized (this) {
                try {
                    int i10 = this.f44407e;
                    C9475a c9475a = C9475a.f48579a;
                    C9475a.m17895b(this.f44405c);
                    this.f44406d.addAll(this.f44405c);
                    this.f44405c.clear();
                    JSONArray jSONArray = new JSONArray();
                    for (AppEvent appEvent : this.f44406d) {
                        String str = appEvent.f11484e;
                        if (str == null) {
                            zM11106a = true;
                        } else {
                            String string = appEvent.f11480a.toString();
                            C5207g.m11110e(string, "jsonObject.toString()");
                            zM11106a = C5207g.m11106a(AppEvent.C2284a.m6640a(string), str);
                        }
                        if (!zM11106a) {
                            C5086z c5086z = C5086z.f33015a;
                            C5086z.m10807F("l", C5207g.m11116k(appEvent, "Event with invalid checksum: "));
                        } else if (z10 || !appEvent.f11481b) {
                            jSONArray.put(appEvent.f11480a);
                        }
                    }
                    if (jSONArray.length() == 0) {
                        return 0;
                    }
                    C9072e c9072e = C9072e.f47360a;
                    m16346e(graphRequest, context, i10, jSONArray, z11);
                    return jSONArray.length();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
            return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16346e(GraphRequest graphRequest, Context context, int i10, JSONArray jSONArray, boolean z10) {
        JSONObject jSONObject;
        try {
            if (C6205a.m12742b(this)) {
                return;
            }
            try {
                HashMap map = AppEventsLoggerUtility.f11523a;
                jSONObject = AppEventsLoggerUtility.m6648a(AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, this.f44403a, this.f44404b, z10, context);
                if (this.f44407e > 0) {
                    jSONObject.put("num_skipped_events", i10);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            graphRequest.f11453c = jSONObject;
            Bundle bundle = graphRequest.f11454d;
            String string = jSONArray.toString();
            C5207g.m11110e(string, "events.toString()");
            bundle.putString("custom_events", string);
            graphRequest.f11455e = string;
            graphRequest.f11454d = bundle;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
