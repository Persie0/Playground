package p317p7;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.RunnableC0183b;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.FlushResult;
import com.facebook.appevents.cloudbridge.C2294a;
import com.facebook.internal.FetchedAppSettingsManager;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONArray;
import org.json.JSONException;
import p067d8.C5074n;
import p067d8.C5078r;
import p067d8.C5086z;
import p166i1.C6153k;
import p173i8.C6205a;
import p213k4.RunnableC6590j;
import p291o7.C8004n;
import p291o7.C8010t;
import p358r7.C8744b;
import p387t0.C9166r;
import p498y3.C10289a;

/* JADX INFO: renamed from: p7.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8199f {

    /* JADX INFO: renamed from: a */
    public static final String f44386a;

    /* JADX INFO: renamed from: b */
    public static final int f44387b;

    /* JADX INFO: renamed from: c */
    public static volatile C9166r f44388c;

    /* JADX INFO: renamed from: d */
    public static final ScheduledExecutorService f44389d;

    /* JADX INFO: renamed from: e */
    public static ScheduledFuture<?> f44390e;

    /* JADX INFO: renamed from: f */
    public static final RunnableC8197d f44391f;

    static {
        new C8199f();
        f44386a = C8199f.class.getName();
        f44387b = 100;
        f44388c = new C9166r(1);
        f44389d = Executors.newSingleThreadScheduledExecutor();
        f44391f = new RunnableC8197d(0);
    }

    /* JADX INFO: renamed from: a */
    public static final GraphRequest m16321a(final AccessTokenAppIdPair accessTokenAppIdPair, final C8205l c8205l, boolean z10, final C6153k c6153k) {
        if (C6205a.m12742b(C8199f.class)) {
            return null;
        }
        try {
            String str = accessTokenAppIdPair.f11475a;
            C5074n c5074nM6673f = FetchedAppSettingsManager.m6673f(str, false);
            String str2 = GraphRequest.f11448j;
            String str3 = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
            C5207g.m11110e(str3, "java.lang.String.format(format, *args)");
            final GraphRequest graphRequestM6622h = GraphRequest.C2279c.m6622h(null, str3, null, null);
            graphRequestM6622h.f11459i = true;
            Bundle bundle = graphRequestM6622h.f11454d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("access_token", accessTokenAppIdPair.f11476b);
            synchronized (C8201h.m16331c()) {
                C6205a.m12742b(C8201h.class);
            }
            String str4 = C8201h.f44393c;
            String strM16338c = C8201h.a.m16338c();
            if (strM16338c != null) {
                bundle.putString("install_referrer", strM16338c);
            }
            graphRequestM6622h.f11454d = bundle;
            int iM16345d = c8205l.m16345d(graphRequestM6622h, C8004n.m15871a(), c5074nM6673f != null ? c5074nM6673f.f32967a : false, z10);
            if (iM16345d == 0) {
                return null;
            }
            c6153k.f35977a += iM16345d;
            graphRequestM6622h.m6612j(new GraphRequest.InterfaceC2278b() { // from class: p7.e
                @Override // com.facebook.GraphRequest.InterfaceC2278b
                /* JADX INFO: renamed from: a */
                public final void mo6614a(C8010t c8010t) {
                    AccessTokenAppIdPair accessTokenAppIdPair2 = accessTokenAppIdPair;
                    GraphRequest graphRequest = graphRequestM6622h;
                    C8205l c8205l2 = c8205l;
                    C6153k c6153k2 = c6153k;
                    if (C6205a.m12742b(C8199f.class)) {
                        return;
                    }
                    try {
                        C5207g.m11111f(accessTokenAppIdPair2, "$accessTokenAppId");
                        C5207g.m11111f(graphRequest, "$postRequest");
                        C5207g.m11111f(c8205l2, "$appEvents");
                        C5207g.m11111f(c6153k2, "$flushState");
                        C8199f.m16325e(c6153k2, graphRequest, c8010t, accessTokenAppIdPair2, c8205l2);
                    } catch (Throwable th2) {
                        C6205a.m12741a(C8199f.class, th2);
                    }
                }
            });
            return graphRequestM6622h;
        } catch (Throwable th2) {
            C6205a.m12741a(C8199f.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m16322b(C9166r c9166r, C6153k c6153k) {
        C8205l c8205l;
        if (C6205a.m12742b(C8199f.class)) {
            return null;
        }
        try {
            C5207g.m11111f(c9166r, "appEventCollection");
            boolean zM15876f = C8004n.m15876f(C8004n.m15871a());
            ArrayList arrayList = new ArrayList();
            for (AccessTokenAppIdPair accessTokenAppIdPair : c9166r.m17490u()) {
                synchronized (c9166r) {
                    try {
                        C5207g.m11111f(accessTokenAppIdPair, "accessTokenAppIdPair");
                        c8205l = (C8205l) ((HashMap) c9166r.f47694a).get(accessTokenAppIdPair);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (c8205l == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                GraphRequest graphRequestM16321a = m16321a(accessTokenAppIdPair, c8205l, zM15876f, c6153k);
                if (graphRequestM16321a != null) {
                    arrayList.add(graphRequestM16321a);
                    C8744b.f46369a.getClass();
                    if (C8744b.f46371c) {
                        HashSet<Integer> hashSet = C2294a.f11502a;
                        RunnableC0183b runnableC0183b = new RunnableC0183b(7, graphRequestM16321a);
                        C5086z c5086z = C5086z.f33015a;
                        try {
                            C8004n.m15873c().execute(runnableC0183b);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            return arrayList;
        } catch (Throwable th3) {
            C6205a.m12741a(C8199f.class, th3);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m16323c(FlushReason flushReason) {
        if (C6205a.m12742b(C8199f.class)) {
            return;
        }
        try {
            C5207g.m11111f(flushReason, "reason");
            f44389d.execute(new RunnableC0183b(6, flushReason));
        } catch (Throwable th2) {
            C6205a.m12741a(C8199f.class, th2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m16324d(FlushReason flushReason) {
        if (C6205a.m12742b(C8199f.class)) {
            return;
        }
        try {
            C5207g.m11111f(flushReason, "reason");
            f44388c.m17486a(C8196c.m16319a());
            try {
                C6153k c6153kM16326f = m16326f(flushReason, f44388c);
                if (c6153kM16326f != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", c6153kM16326f.f35977a);
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", (FlushResult) c6153kM16326f.f35978b);
                    C10289a.m19281a(C8004n.m15871a()).m19283c(intent);
                }
            } catch (Exception e10) {
                Log.w(f44386a, "Caught unexpected exception while flushing app events: ", e10);
            }
        } catch (Throwable th2) {
            C6205a.m12741a(C8199f.class, th2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m16325e(C6153k c6153k, GraphRequest graphRequest, C8010t c8010t, AccessTokenAppIdPair accessTokenAppIdPair, C8205l c8205l) {
        String string;
        if (C6205a.m12742b(C8199f.class)) {
            return;
        }
        try {
            FacebookRequestError facebookRequestError = c8010t.f43588c;
            String str = "Success";
            FlushResult flushResult = FlushResult.SUCCESS;
            boolean z10 = true;
            if (facebookRequestError != null) {
                if (facebookRequestError.f11439b == -1) {
                    str = "Failed: No Connectivity";
                    flushResult = FlushResult.NO_CONNECTIVITY;
                } else {
                    str = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{c8010t.toString(), facebookRequestError.toString()}, 2));
                    C5207g.m11110e(str, "java.lang.String.format(format, *args)");
                    flushResult = FlushResult.SERVER_ERROR;
                }
            }
            C8004n c8004n = C8004n.f43550a;
            if (C8004n.m15879i(LoggingBehavior.APP_EVENTS)) {
                try {
                    string = new JSONArray((String) graphRequest.f11455e).toString(2);
                    C5207g.m11110e(string, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
                } catch (JSONException unused) {
                    string = "<Can't encode events for debug logging>";
                }
                C5078r.a aVar = C5078r.f32986e;
                LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                String str2 = f44386a;
                C5207g.m11110e(str2, "TAG");
                aVar.m10781c(loggingBehavior, str2, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(graphRequest.f11453c), str, string);
            }
            if (facebookRequestError == null) {
                z10 = false;
            }
            c8205l.m16343b(z10);
            FlushResult flushResult2 = FlushResult.NO_CONNECTIVITY;
            if (flushResult == flushResult2) {
                C8004n.m15873c().execute(new RunnableC6590j(accessTokenAppIdPair, 6, c8205l));
            }
            if (flushResult == FlushResult.SUCCESS || ((FlushResult) c6153k.f35978b) == flushResult2) {
                return;
            }
            C5207g.m11111f(flushResult, "<set-?>");
            c6153k.f35978b = flushResult;
        } catch (Throwable th2) {
            C6205a.m12741a(C8199f.class, th2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final C6153k m16326f(FlushReason flushReason, C9166r c9166r) {
        if (C6205a.m12742b(C8199f.class)) {
            return null;
        }
        try {
            C5207g.m11111f(flushReason, "reason");
            C5207g.m11111f(c9166r, "appEventCollection");
            C6153k c6153k = new C6153k(1);
            ArrayList arrayListM16322b = m16322b(c9166r, c6153k);
            if (!(!arrayListM16322b.isEmpty())) {
                return null;
            }
            C5078r.a aVar = C5078r.f32986e;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = f44386a;
            C5207g.m11110e(str, "TAG");
            aVar.m10781c(loggingBehavior, str, "Flushing %d events due to %s.", Integer.valueOf(c6153k.f35977a), flushReason.toString());
            Iterator it = arrayListM16322b.iterator();
            while (it.hasNext()) {
                ((GraphRequest) it.next()).m6606c();
            }
            return c6153k;
        } catch (Throwable th2) {
            C6205a.m12741a(C8199f.class, th2);
            return null;
        }
    }
}
