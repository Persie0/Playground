package ni;

import ag.C0076c;
import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapAPI;
import com.google.android.gms.internal.measurement.C2612c1;
import com.google.android.gms.internal.measurement.C2766n1;
import com.google.android.gms.internal.measurement.C2779o1;
import com.google.android.gms.internal.measurement.C2870v1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kochava.tracker.events.EventType;
import com.kochava.tracker.events.Events;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C6753d;
import org.json.JSONException;
import org.json.JSONObject;
import p260m8.C7499b;
import p338qd.C8573r0;
import p349qo.C8656b;
import p534zf.C10487e;
import p535zg.C10489a;
import tg.C9281a;
import tl.C9325m;

/* JADX INFO: renamed from: ni.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7796d {

    /* JADX INFO: renamed from: a */
    public final C7797e f42869a;

    /* JADX INFO: renamed from: b */
    public FirebaseAnalytics f42870b;

    /* JADX INFO: renamed from: c */
    public CleverTapAPI f42871c;

    /* JADX INFO: renamed from: d */
    public String f42872d = "";

    public C7796d(Context context, C7797e c7797e) {
        this.f42869a = c7797e;
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m15504a(String... strArr) {
        if (!(!(strArr.length == 0)) || strArr.length % 2 != 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i10 = 0; i10 < strArr.length; i10 += 2) {
            bundle.putString(strArr[i10], strArr[i10 + 1]);
        }
        return bundle;
    }

    /* JADX WARN: Unreachable blocks removed: 5, instructions: 5 */
    /* JADX INFO: renamed from: b */
    public final void m15505b(Bundle bundle, String str) {
        C9281a c9281a;
        JSONObject jSONObjectMo19456f;
        if (this.f42869a.m15513f()) {
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("Client", "Android app");
        Map<String, String> map = C7795c.f42868a;
        CleverTapAPI cleverTapAPI = this.f42871c;
        Set<String> setKeySet = bundle.keySet();
        C5207g.m11110e(setKeySet, "params.keySet()");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(setKeySet, 10));
        for (String str2 : setKeySet) {
            arrayList.add(new Pair(str2, bundle.get(str2)));
        }
        Map<String, Object> mapM13464Q0 = C6753d.m13464Q0(arrayList);
        String str3 = C7795c.f42868a.get(str);
        if (str3 != null && cleverTapAPI != null) {
            cleverTapAPI.m6431n(str3, mapM13464Q0);
        }
        bundle.putString("platform", "android");
        FirebaseAnalytics firebaseAnalytics = this.f42870b;
        String strM15510c = this.f42869a.m15510c("app_code");
        if (firebaseAnalytics != null) {
            bundle.putString("platform", "android");
            bundle.putString("app", strM15510c);
            C2870v1 c2870v1 = firebaseAnalytics.f16185a;
            c2870v1.getClass();
            c2870v1.m8300b(new C2766n1(c2870v1, null, str, bundle, false));
        }
        bundle.putString("platform", "android");
        bundle.putString("app", this.f42869a.m15510c("app_code"));
        if (C5207g.m11106a(str, "new_user")) {
            EventType eventType = EventType.REGISTRATION_COMPLETE;
            c9281a = eventType == null ? new C9281a("") : new C9281a(eventType.getEventName());
        } else if (C5207g.m11106a(str, "upgrade_confirmation")) {
            EventType eventType2 = EventType.PURCHASE;
            c9281a = eventType2 == null ? new C9281a("") : new C9281a(eventType2.getEventName());
            Object obj = bundle.get("Product Id");
            C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.String");
            String str4 = (String) obj;
            synchronized (c9281a) {
                c9281a.m17644c("content_id", str4);
            }
            try {
                Object obj2 = bundle.get("Amount paid");
                C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.String");
                double d10 = Double.parseDouble((String) obj2);
                synchronized (c9281a) {
                    try {
                        c9281a.m17643b(d10);
                        Object obj3 = bundle.get("Currency");
                        C5207g.m11109d(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str5 = (String) obj3;
                        synchronized (c9281a) {
                            c9281a.m17644c("currency", str5);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (NumberFormatException e10) {
                e10.printStackTrace();
            }
        } else {
            c9281a = null;
        }
        if (c9281a != null) {
            String str6 = this.f42872d;
            synchronized (c9281a) {
                c9281a.m17644c("user_id", str6);
            }
            JSONObject jSONObject = new JSONObject();
            for (String str7 : bundle.keySet()) {
                try {
                    jSONObject.put(str7, bundle.get(str7));
                } catch (JSONException unused) {
                }
            }
            synchronized (c9281a) {
                try {
                    c9281a.m17642a(C8656b.m16887N(jSONObject, true));
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            Events events = (Events) Events.getInstance();
            events.getClass();
            C0076c c0076c = Events.f16481c;
            C10489a.m19477c(c0076c, "Host called API: Send Event");
            if (C8573r0.m16662A0(c9281a.f47979a)) {
                c0076c.m460d("sendWithEvent failed, invalid event");
                return;
            }
            synchronized (c9281a) {
                C10487e c10487eM19445u = C10487e.m19445u();
                c10487eM19445u.m19450D("event_name", c9281a.f47979a);
                if (c9281a.f47980b.length() > 0) {
                    c10487eM19445u.m19448B(c9281a.f47980b.mo19451a(), "event_data");
                }
                if (c9281a.f47981c.length() > 0) {
                    c10487eM19445u.m19448B(c9281a.f47981c.mo19451a(), "receipt");
                }
                jSONObjectMo19456f = c10487eM19445u.mo19456f();
            }
            events.f16484a.offer(new C10487e(jSONObjectMo19456f));
            events.m9306a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m15506c(String str) {
        C5207g.m11111f(str, "userId");
        if (this.f42869a.m15513f()) {
            return;
        }
        FirebaseAnalytics firebaseAnalytics = this.f42870b;
        if (firebaseAnalytics != null && firebaseAnalytics != null) {
            C2870v1 c2870v1 = firebaseAnalytics.f16185a;
            c2870v1.getClass();
            c2870v1.m8300b(new C2612c1(c2870v1, str, 0));
        }
        Map<String, String> map = C7795c.f42868a;
        CleverTapAPI cleverTapAPI = this.f42871c;
        if (cleverTapAPI != null) {
            cleverTapAPI.m6430m(C7499b.m14943h0(new Pair("Identity", str)));
        }
        this.f42872d = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m15507d(String str, String str2) {
        if (this.f42869a.m15513f()) {
            return;
        }
        FirebaseAnalytics firebaseAnalytics = this.f42870b;
        if (firebaseAnalytics != null) {
            C2870v1 c2870v1 = firebaseAnalytics.f16185a;
            c2870v1.getClass();
            c2870v1.m8300b(new C2779o1(c2870v1, null, str, str2, false));
        }
        Map<String, String> map = C7795c.f42868a;
        CleverTapAPI cleverTapAPI = this.f42871c;
        HashMap map2 = new HashMap();
        map2.put(str, str2);
        if (cleverTapAPI != null) {
            cleverTapAPI.f10981b.f43474d.m6402A0(map2);
        }
    }
}
