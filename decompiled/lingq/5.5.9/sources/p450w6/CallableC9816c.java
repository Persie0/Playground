package p450w6;

import com.clevertap.android.sdk.AnalyticsManager;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.events.EventGroup;
import com.clevertap.android.sdk.pushnotification.C2260f;
import com.clevertap.android.sdk.pushnotification.PushConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import p080e.C5288t;
import p290o6.C7951d0;
import p290o6.C7957g0;
import p290o6.C7985x;
import p290o6.C7986y;

/* JADX INFO: renamed from: w6.c */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC9816c implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Map f49960a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f49961b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f49962c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9817d f49963d;

    public CallableC9816c(C9817d c9817d, Map map, String str, String str2) {
        this.f49963d = c9817d;
        this.f49960a = map;
        this.f49961b = str;
        this.f49962c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        String str;
        C9817d c9817d;
        C7985x c7985x;
        try {
            C2181a c2181aM6433b = this.f49963d.f49970f.m6433b();
            String str2 = this.f49963d.f49970f.f10995a;
            StringBuilder sb2 = new StringBuilder("asyncProfileSwitchUser:[profile ");
            sb2.append(this.f49960a);
            sb2.append(" with Cached GUID ");
            if (this.f49961b != null) {
                str = this.f49963d.f49965a;
            } else {
                str = "NULL and cleverTapID " + this.f49962c;
            }
            sb2.append(str);
            String string = sb2.toString();
            c2181aM6433b.getClass();
            C2181a.m6460m(str2, string);
            C7986y c7986y = this.f49963d.f49973i;
            synchronized (c7986y.f43452J) {
                try {
                    c7986y.f43463e = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C2260f c2260f = this.f49963d.f49977m;
            Iterator<PushConstants.PushType> it = c2260f.f11338a.iterator();
            while (it.hasNext()) {
                c2260f.m6580j(it.next(), null, false);
            }
            C9817d c9817d2 = this.f49963d;
            c9817d2.f49967c.mo606x(c9817d2.f49971g, EventGroup.REGULAR);
            C9817d c9817d3 = this.f49963d;
            c9817d3.f49967c.mo606x(c9817d3.f49971g, EventGroup.PUSH_NOTIFICATION_VIEWED);
            C9817d c9817d4 = this.f49963d;
            c9817d4.f49974j.mo6478a(c9817d4.f49971g);
            this.f49963d.f49976l.m15783a();
            C7986y.f43448S = 1;
            this.f49963d.f49978n.m15821k0();
            String str3 = this.f49961b;
            if (str3 != null) {
                this.f49963d.f49975k.m15760c(str3);
                this.f49963d.f49969e.mo583U(this.f49961b);
            } else {
                C9817d c9817d5 = this.f49963d;
                if (c9817d5.f49970f.f11005k) {
                    c9817d5.f49975k.m15759b(this.f49962c);
                } else {
                    C7951d0 c7951d0 = c9817d5.f49975k;
                    c7951d0.getClass();
                    c7951d0.m15760c(C7951d0.m15756e());
                }
            }
            C9817d c9817d6 = this.f49963d;
            c9817d6.f49969e.mo583U(c9817d6.f49975k.m15765i());
            this.f49963d.f49975k.m15769n();
            AnalyticsManager analyticsManager = this.f49963d.f49966b;
            C7986y c7986y2 = analyticsManager.f10952h;
            synchronized (c7986y2.f43461c) {
                try {
                    c7986y2.f43460b = false;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            analyticsManager.m6411t0();
            Map<String, Object> map = this.f49960a;
            if (map != null) {
                this.f49963d.f49966b.m6402A0(map);
            }
            C2260f c2260f2 = this.f49963d.f49977m;
            Iterator<PushConstants.PushType> it2 = c2260f2.f11338a.iterator();
            while (it2.hasNext()) {
                c2260f2.m6580j(it2.next(), null, true);
            }
            synchronized (C9817d.f49964q) {
                try {
                    c9817d = this.f49963d;
                    c9817d.f49980p = null;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            synchronized (c9817d.f49968d.f43257b) {
                try {
                    c7985x = c9817d.f49972h;
                    c7985x.f43436e = null;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            c7985x.m15845a();
            C9817d.m18293a(this.f49963d);
            C9817d.m18294b(this.f49963d);
            this.f49963d.m18295c();
            C9817d c9817d7 = this.f49963d;
            C5288t c5288t = c9817d7.f49972h.f43434c;
            if (c5288t != null) {
                synchronized (c5288t) {
                    try {
                        ((HashMap) c5288t.f33503b).clear();
                        C2181a.m6450b("DisplayUnit : ", "Cleared Display Units Cache");
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
            } else {
                CleverTapInstanceConfig cleverTapInstanceConfig = c9817d7.f49970f;
                C2181a c2181aM6433b2 = cleverTapInstanceConfig.m6433b();
                String str4 = cleverTapInstanceConfig.f10995a;
                c2181aM6433b2.getClass();
                C2181a.m6460m(str4, "DisplayUnit : Can't reset Display Units, DisplayUnitcontroller is null");
            }
            C9817d c9817d8 = this.f49963d;
            C7957g0 c7957g0 = c9817d8.f49972h.f43432a;
            String strM15765i = c9817d8.f49975k.m15765i();
            c7957g0.f43330f.clear();
            c7957g0.f43331g = 0;
            c7957g0.f43329e.clear();
            c7957g0.f43328d = strM15765i;
            c7957g0.m15777g(strM15765i);
        } catch (Throwable th7) {
            C2181a c2181aM6433b3 = this.f49963d.f49970f.m6433b();
            String str5 = this.f49963d.f49970f.f10995a;
            c2181aM6433b3.getClass();
            C2181a.m6461n(str5, "Reset Profile error", th7);
        }
        return null;
    }
}
