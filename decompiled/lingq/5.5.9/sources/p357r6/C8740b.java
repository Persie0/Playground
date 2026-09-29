package p357r6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.media.AbstractC0140a;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.events.EventGroup;
import com.clevertap.android.sdk.p049db.AbstractC2184a;
import com.clevertap.android.sdk.p049db.C2185b;
import com.clevertap.android.sdk.p049db.DBAdapter;
import com.clevertap.android.sdk.task.Task;
import com.google.android.exoplayer2.ExoPlayer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;
import p043c7.C1735a;
import p043c7.HandlerC1740f;
import p043c7.RunnableC1745k;
import p066d7.C5049a;
import p088e7.C5382b;
import p088e7.C5383c;
import p289o5.C7940t;
import p290o6.C7951d0;
import p290o6.C7963j0;
import p290o6.C7972o;
import p290o6.C7975p0;
import p290o6.C7977q0;
import p290o6.C7979r0;
import p290o6.C7986y;
import p290o6.InterfaceC7955f0;
import p290o6.InterfaceC7984w;
import p338qd.C8573r0;
import p388t1.C9181g;
import p450w6.C9818e;
import p450w6.InterfaceC9814a;
import p475x6.C10101a;

/* JADX INFO: renamed from: r6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8740b extends AbstractC0140a implements InterfaceC7955f0 {

    /* JADX INFO: renamed from: H */
    public final C10101a f46336H;

    /* JADX INFO: renamed from: I */
    public final C7975p0 f46337I;

    /* JADX INFO: renamed from: J */
    public final C5383c f46338J;

    /* JADX INFO: renamed from: b */
    public final AbstractC2184a f46341b;

    /* JADX INFO: renamed from: c */
    public final C7986y f46342c;

    /* JADX INFO: renamed from: d */
    public final CleverTapInstanceConfig f46343d;

    /* JADX INFO: renamed from: e */
    public final Context f46344e;

    /* JADX INFO: renamed from: f */
    public final C7940t f46345f;

    /* JADX INFO: renamed from: g */
    public final C7951d0 f46346g;

    /* JADX INFO: renamed from: h */
    public final C9181g f46347h;

    /* JADX INFO: renamed from: i */
    public final C7963j0 f46348i;

    /* JADX INFO: renamed from: j */
    public final C2181a f46349j;

    /* JADX INFO: renamed from: k */
    public C9818e f46350k;

    /* JADX INFO: renamed from: l */
    public final HandlerC1740f f46351l;

    /* JADX INFO: renamed from: a */
    public e f46340a = null;

    /* JADX INFO: renamed from: K */
    public RunnableC8742d f46339K = null;

    /* JADX INFO: renamed from: r6.b$a */
    public class a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ EventGroup f46352a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f46353b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C8740b f46354c;

        public a(Context context, EventGroup eventGroup, C8740b c8740b) {
            this.f46354c = c8740b;
            this.f46352a = eventGroup;
            this.f46353b = context;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            EventGroup eventGroup = EventGroup.PUSH_NOTIFICATION_VIEWED;
            C8740b c8740b = this.f46354c;
            EventGroup eventGroup2 = this.f46352a;
            if (eventGroup2 == eventGroup) {
                C2181a c2181a = c8740b.f46349j;
                String str = c8740b.f46343d.f10995a;
                c2181a.getClass();
                C2181a.m6460m(str, "Pushing Notification Viewed event onto queue flush sync");
            } else {
                C2181a c2181a2 = c8740b.f46349j;
                String str2 = c8740b.f46343d.f10995a;
                c2181a2.getClass();
                C2181a.m6460m(str2, "Pushing event onto queue flush sync");
            }
            c8740b.mo606x(this.f46353b, eventGroup2);
            return null;
        }
    }

    /* JADX INFO: renamed from: r6.b$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f46355a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ EventGroup f46356b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C8740b f46357c;

        public b(Context context, EventGroup eventGroup, C8740b c8740b) {
            this.f46357c = c8740b;
            this.f46355a = context;
            this.f46356b = eventGroup;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f46357c.f46336H.m18946l0(this.f46355a, this.f46356b);
        }
    }

    /* JADX INFO: renamed from: r6.b$c */
    public class c implements Callable<Void> {
        public c() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            C8740b c8740b = C8740b.this;
            try {
                C2181a c2181aM6433b = c8740b.f46343d.m6433b();
                String str = c8740b.f46343d.f10995a;
                c2181aM6433b.getClass();
                C2181a.m6460m(str, "Queuing daily events");
                c8740b.mo592c0(null, false);
            } catch (Throwable th2) {
                C2181a c2181aM6433b2 = c8740b.f46343d.m6433b();
                String str2 = c8740b.f46343d.f10995a;
                c2181aM6433b2.getClass();
                C2181a.m6461n(str2, "Daily profile sync failed", th2);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: r6.b$d */
    public class d implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ JSONObject f46359a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f46360b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f46361c;

        public d(JSONObject jSONObject, int i10, Context context) {
            this.f46359a = jSONObject;
            this.f46360b = i10;
            this.f46361c = context;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:29:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:48:0x0103  */
        /* JADX WARN: Code duplicated, block: B:51:0x0107  */
        /* JADX WARN: Code duplicated, block: B:52:0x0145  */
        /* JADX WARN: Code duplicated, block: B:54:0x0149  */
        /* JADX WARN: Code duplicated, block: B:55:0x0157  */
        /* JADX WARN: Code duplicated, block: B:67:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:51:0x0107, please report this as an issue */
        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            boolean z10;
            boolean z11;
            C9181g c9181g;
            JSONObject jSONObject;
            int i10;
            C7986y c7986y;
            boolean z12;
            int i11;
            C9181g c9181g2 = C8740b.this.f46347h;
            JSONObject jSONObject2 = this.f46359a;
            boolean z13 = true;
            boolean z14 = false;
            if (this.f46360b != 7) {
                C7986y c7986y2 = (C7986y) c9181g2.f47721b;
                synchronized (c7986y2.f43452J) {
                    z10 = c7986y2.f43463e;
                }
                if (z10) {
                    String string = jSONObject2 == null ? "null" : jSONObject2.toString();
                    C2181a c2181aM6433b = ((CleverTapInstanceConfig) c9181g2.f47722c).m6433b();
                    c2181aM6433b.getClass();
                    C2181a.m6452d(((CleverTapInstanceConfig) c9181g2.f47722c).f10995a, "Current user is opted out dropping event: " + string);
                } else {
                    if (((int) (System.currentTimeMillis() / 1000)) - C7977q0.m15825c((Context) c9181g2.f47723d, (CleverTapInstanceConfig) c9181g2.f47722c, "comms_mtd") < 86400) {
                        C2181a c2181aM6433b2 = ((CleverTapInstanceConfig) c9181g2.f47722c).m6433b();
                        String str = ((CleverTapInstanceConfig) c9181g2.f47722c).f10995a;
                        String str2 = "CleverTap is muted, dropping event - " + jSONObject2.toString();
                        c2181aM6433b2.getClass();
                        C2181a.m6460m(str, str2);
                    }
                }
                z11 = true;
                if (!z11) {
                    c9181g = C8740b.this.f46347h;
                    jSONObject = this.f46359a;
                    i10 = this.f46360b;
                    if (!((CleverTapInstanceConfig) c9181g.f47722c).f11002h) {
                        if (!jSONObject.has("evtName")) {
                            try {
                                if (!Arrays.asList(InterfaceC7984w.f43428a).contains(jSONObject.getString("evtName"))) {
                                    if (i10 == 4) {
                                        c7986y = (C7986y) c9181g.f47721b;
                                        synchronized (c7986y.f43461c) {
                                            z12 = c7986y.f43460b;
                                        }
                                        if (!z12) {
                                            z13 = false;
                                        }
                                    } else {
                                        z13 = false;
                                    }
                                    z14 = z13;
                                }
                            } catch (JSONException unused) {
                            }
                        } else {
                            if (i10 == 4) {
                                c7986y = (C7986y) c9181g.f47721b;
                                synchronized (c7986y.f43461c) {
                                    z12 = c7986y.f43460b;
                                    if (!z12) {
                                        z13 = false;
                                    }
                                }
                            } else {
                                z13 = false;
                            }
                            z14 = z13;
                        }
                    }
                    if (z14) {
                        C2181a c2181aM6433b3 = C8740b.this.f46343d.m6433b();
                        String str3 = C8740b.this.f46343d.f10995a;
                        String str4 = "App Launched not yet processed, re-queuing event " + this.f46359a + "after 2s";
                        c2181aM6433b3.getClass();
                        C2181a.m6452d(str3, str4);
                        C8740b.this.f46351l.postDelayed(new RunnableC8741c(this), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                    } else {
                        i11 = this.f46360b;
                        if (i11 == 7) {
                            C8740b.this.m16979k0(this.f46361c, this.f46359a, i11);
                        } else {
                            C8740b.this.f46337I.m15822l0(this.f46361c);
                            C8740b.this.mo594d0();
                            C8740b.this.m16979k0(this.f46361c, this.f46359a, this.f46360b);
                        }
                    }
                }
                return null;
            }
            c9181g2.getClass();
            z11 = false;
            if (!z11) {
                c9181g = C8740b.this.f46347h;
                jSONObject = this.f46359a;
                i10 = this.f46360b;
                if (!((CleverTapInstanceConfig) c9181g.f47722c).f11002h) {
                    if (!jSONObject.has("evtName")) {
                        if (i10 == 4) {
                            c7986y = (C7986y) c9181g.f47721b;
                            synchronized (c7986y.f43461c) {
                                z12 = c7986y.f43460b;
                                if (!z12) {
                                    z13 = false;
                                }
                            }
                        } else {
                            z13 = false;
                        }
                        z14 = z13;
                    } else if (!Arrays.asList(InterfaceC7984w.f43428a).contains(jSONObject.getString("evtName"))) {
                        if (i10 == 4) {
                            c7986y = (C7986y) c9181g.f47721b;
                            synchronized (c7986y.f43461c) {
                                z12 = c7986y.f43460b;
                                if (!z12) {
                                    z13 = false;
                                }
                            }
                        } else {
                            z13 = false;
                        }
                        z14 = z13;
                    }
                }
                if (z14) {
                    C2181a c2181aM6433b4 = C8740b.this.f46343d.m6433b();
                    String str5 = C8740b.this.f46343d.f10995a;
                    String str6 = "App Launched not yet processed, re-queuing event " + this.f46359a + "after 2s";
                    c2181aM6433b4.getClass();
                    C2181a.m6452d(str5, str6);
                    C8740b.this.f46351l.postDelayed(new RunnableC8741c(this), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                } else {
                    i11 = this.f46360b;
                    if (i11 == 7) {
                        C8740b.this.m16979k0(this.f46361c, this.f46359a, i11);
                    } else {
                        C8740b.this.f46337I.m15822l0(this.f46361c);
                        C8740b.this.mo594d0();
                        C8740b.this.m16979k0(this.f46361c, this.f46359a, this.f46360b);
                    }
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: r6.b$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f46363a;

        public e(Context context) {
            this.f46363a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            EventGroup eventGroup = EventGroup.REGULAR;
            C8740b c8740b = C8740b.this;
            Context context = this.f46363a;
            c8740b.m16980m0(context, eventGroup);
            c8740b.m16980m0(context, EventGroup.PUSH_NOTIFICATION_VIEWED);
        }
    }

    public C8740b(C2185b c2185b, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, C9181g c9181g, C7975p0 c7975p0, C7972o c7972o, HandlerC1740f handlerC1740f, C7951d0 c7951d0, C5383c c5383c, C10101a c10101a, C7986y c7986y, C7940t c7940t, C7963j0 c7963j0) {
        this.f46341b = c2185b;
        this.f46344e = context;
        this.f46343d = cleverTapInstanceConfig;
        this.f46347h = c9181g;
        this.f46337I = c7975p0;
        this.f46351l = handlerC1740f;
        this.f46346g = c7951d0;
        this.f46338J = c5383c;
        this.f46336H = c10101a;
        this.f46348i = c7963j0;
        this.f46349j = cleverTapInstanceConfig.m6433b();
        this.f46342c = c7986y;
        this.f46345f = c7940t;
        c7972o.f43392d = this;
    }

    /* JADX INFO: renamed from: l0 */
    public static void m16978l0(Context context, JSONObject jSONObject) {
        try {
            boolean z10 = C7979r0.f43406a;
            jSONObject.put("mc", Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        } catch (Throwable unused) {
        }
        try {
            boolean z11 = C7979r0.f43406a;
            String strM15840g = "Unavailable";
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                    strM15840g = (networkInfo == null || !networkInfo.isConnected()) ? C7979r0.m15840g(context) : "WiFi";
                }
            } catch (Throwable unused2) {
            }
            jSONObject.put("nt", strM15840g);
        } catch (Throwable unused3) {
        }
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: c0 */
    public final void mo592c0(JSONObject jSONObject, boolean z10) {
        Object jSONObject2;
        C7951d0 c7951d0 = this.f46346g;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f46343d;
        try {
            String strM15765i = c7951d0.m15765i();
            JSONObject jSONObject3 = new JSONObject();
            Context context = this.f46344e;
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                InterfaceC9814a interfaceC9814aM16759t0 = C8573r0.m16759t0(context, cleverTapInstanceConfig, c7951d0, this.f46338J);
                this.f46350k = new C9818e(context, cleverTapInstanceConfig, c7951d0);
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        try {
                            jSONObject2 = jSONObject.getJSONObject(next);
                        } catch (Throwable unused) {
                            jSONObject2 = jSONObject.get(next);
                        }
                    } catch (JSONException unused2) {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        jSONObject3.put(next, jSONObject2);
                        boolean zMo4794a = interfaceC9814aM16759t0.mo4794a(next);
                        if (zMo4794a && z10) {
                            try {
                                this.f46350k.m18302g(strM15765i, next);
                            } catch (Throwable unused3) {
                            }
                        } else if (zMo4794a) {
                            this.f46350k.m18296a(strM15765i, next, jSONObject2.toString());
                        }
                    }
                }
            }
            try {
                String str = c7951d0.m15764h().f43304c;
                if (str != null && !str.equals("")) {
                    jSONObject3.put("Carrier", str);
                }
                String str2 = c7951d0.m15764h().f43305d;
                if (str2 != null && !str2.equals("")) {
                    jSONObject3.put("cc", str2);
                }
                jSONObject3.put("tz", TimeZone.getDefault().getID());
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("profile", jSONObject3);
                mo595e0(context, jSONObject4, 3);
            } catch (JSONException unused4) {
                C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                String str3 = cleverTapInstanceConfig.f10995a;
                c2181aM6433b.getClass();
                C2181a.m6460m(str3, "FATAL: Creating basic profile update event failed!");
            }
        } catch (Throwable th2) {
            cleverTapInstanceConfig.m6433b().getClass();
            C2181a.m6461n(cleverTapInstanceConfig.f10995a, "Basic profile sync", th2);
        }
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: d0 */
    public final void mo594d0() {
        if (this.f46342c.f43462d > 0) {
            return;
        }
        C1735a.m5472a(this.f46343d).m5474b().m6585b("CleverTapAPI#pushInitialEventsAsync", new c());
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: e0 */
    public final Future<?> mo595e0(Context context, JSONObject jSONObject, int i10) {
        Task taskM5474b = C1735a.m5472a(this.f46343d).m5474b();
        d dVar = new d(jSONObject, i10, context);
        Executor executor = taskM5474b.f11356c;
        if (executor instanceof ExecutorService) {
            return ((ExecutorService) executor).submit(new RunnableC1745k(taskM5474b, "queueEvent", dVar));
        }
        throw new UnsupportedOperationException("Can't use this method without ExecutorService, Use Execute alternatively ");
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0219  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k0 */
    public final void m16979k0(Context context, JSONObject jSONObject, int i10) {
        String str;
        if (i10 == 6) {
            C2181a c2181aM6433b = this.f46343d.m6433b();
            String str2 = this.f46343d.f10995a;
            c2181aM6433b.getClass();
            C2181a.m6460m(str2, "Pushing Notification Viewed event onto separate queue");
            synchronized (((Boolean) this.f46345f.f43256a)) {
                try {
                    jSONObject.put("s", this.f46342c.f43462d);
                    jSONObject.put("type", "event");
                    jSONObject.put("ep", (int) (System.currentTimeMillis() / 1000));
                    C5382b c5382bM11555a = this.f46338J.m11555a();
                    if (c5382bM11555a != null) {
                        jSONObject.put("wzrk_error", C5049a.m10724c(c5382bM11555a));
                    }
                    C2181a c2181aM6433b2 = this.f46343d.m6433b();
                    String str3 = this.f46343d.f10995a;
                    c2181aM6433b2.getClass();
                    C2181a.m6460m(str3, "Pushing Notification Viewed event onto DB");
                    C2185b c2185b = (C2185b) this.f46341b;
                    c2185b.getClass();
                    c2185b.m6481d(context, jSONObject, DBAdapter.Table.PUSH_NOTIFICATION_VIEWED);
                    C2181a c2181aM6433b3 = this.f46343d.m6433b();
                    String str4 = this.f46343d.f10995a;
                    c2181aM6433b3.getClass();
                    C2181a.m6460m(str4, "Pushing Notification Viewed event onto queue flush");
                    if (this.f46339K == null) {
                        this.f46339K = new RunnableC8742d(this, context);
                    }
                    RunnableC8742d runnableC8742d = this.f46339K;
                    HandlerC1740f handlerC1740f = this.f46351l;
                    handlerC1740f.removeCallbacks(runnableC8742d);
                    handlerC1740f.post(this.f46339K);
                } catch (Throwable th2) {
                    C2181a c2181aM6433b4 = this.f46343d.m6433b();
                    String str5 = this.f46343d.f10995a;
                    String str6 = "Failed to queue notification viewed event: " + jSONObject.toString();
                    c2181aM6433b4.getClass();
                    C2181a.m6461n(str5, str6, th2);
                }
            }
            return;
        }
        synchronized (((Boolean) this.f46345f.f43256a)) {
            try {
                if (C7986y.f43448S == 0) {
                    C7986y.f43448S = 1;
                }
                if (i10 == 1) {
                    str = "page";
                } else if (i10 == 2) {
                    m16978l0(context, jSONObject);
                    if (jSONObject.has("bk")) {
                        this.f46342c.f43468j = true;
                        jSONObject.remove("bk");
                    }
                    if (this.f46342c.f43469k) {
                        jSONObject.put("gf", true);
                        C7986y c7986y = this.f46342c;
                        c7986y.f43469k = false;
                        jSONObject.put("gfSDKVersion", c7986y.f43466h);
                        this.f46342c.f43466h = 0;
                    }
                    str = "ping";
                } else if (i10 == 3) {
                    str = "profile";
                } else {
                    str = i10 == 5 ? "data" : "event";
                }
                this.f46342c.getClass();
                jSONObject.put("s", this.f46342c.f43462d);
                jSONObject.put("pg", C7986y.f43448S);
                jSONObject.put("type", str);
                jSONObject.put("ep", (int) (System.currentTimeMillis() / 1000));
                jSONObject.put("f", this.f46342c.f43465g);
                jSONObject.put("lsl", this.f46342c.f43450H);
                try {
                    if ("event".equals(jSONObject.getString("type")) && "App Launched".equals(jSONObject.getString("evtName"))) {
                        jSONObject.put("pai", context.getPackageName());
                    }
                } catch (Throwable unused) {
                }
                C5382b c5382bM11555a2 = this.f46338J.m11555a();
                if (c5382bM11555a2 != null) {
                    jSONObject.put("wzrk_error", C5049a.m10724c(c5382bM11555a2));
                }
                this.f46348i.m15791k(jSONObject);
                C2185b c2185b2 = (C2185b) this.f46341b;
                c2185b2.getClass();
                c2185b2.m6481d(context, jSONObject, i10 == 3 ? DBAdapter.Table.PROFILE_EVENTS : DBAdapter.Table.EVENTS);
                if (i10 == 4) {
                    C7963j0 c7963j0 = this.f46348i;
                    c7963j0.getClass();
                    if (i10 == 4) {
                        try {
                            c7963j0.m15788h(context, jSONObject);
                        } catch (Throwable th3) {
                            C2181a c2181aM15784d = c7963j0.m15784d();
                            String str7 = c7963j0.f43349c.f10995a;
                            c2181aM15784d.getClass();
                            C2181a.m6461n(str7, "Failed to sync with upstream", th3);
                        }
                    }
                    m16981n0(context);
                } else {
                    m16981n0(context);
                }
            } catch (Throwable th4) {
                C2181a c2181aM6433b5 = this.f46343d.m6433b();
                String str8 = this.f46343d.f10995a;
                String str9 = "Failed to queue event: " + jSONObject.toString();
                c2181aM6433b5.getClass();
                C2181a.m6461n(str8, str9, th4);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m16980m0(Context context, EventGroup eventGroup) {
        C1735a.m5472a(this.f46343d).m5474b().m6585b("CommsManager#flushQueueAsync", new a(context, eventGroup, this));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m16981n0(Context context) {
        if (this.f46340a == null) {
            this.f46340a = new e(context);
        }
        e eVar = this.f46340a;
        HandlerC1740f handlerC1740f = this.f46351l;
        handlerC1740f.removeCallbacks(eVar);
        handlerC1740f.postDelayed(this.f46340a, this.f46336H.m18948n0());
        String str = this.f46343d.f10995a;
        this.f46349j.getClass();
        C2181a.m6460m(str, "Scheduling delayed queue flush on main event loop");
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: x */
    public final void mo606x(Context context, EventGroup eventGroup) {
        boolean z10;
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            z10 = connectivityManager == null || ((activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected());
        } catch (Throwable unused) {
        }
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f46343d;
        C2181a c2181a = this.f46349j;
        if (!z10) {
            String str = cleverTapInstanceConfig.f10995a;
            c2181a.getClass();
            C2181a.m6460m(str, "Network connectivity unavailable. Will retry later");
            return;
        }
        this.f46342c.getClass();
        C10101a c10101a = this.f46336H;
        if (c10101a.m18955u0(eventGroup)) {
            c10101a.m18952r0(eventGroup, new b(context, eventGroup, this));
            return;
        }
        String str2 = cleverTapInstanceConfig.f10995a;
        c2181a.getClass();
        C2181a.m6460m(str2, "Pushing Notification Viewed event onto queue DB flush");
        c10101a.m18946l0(context, eventGroup);
    }
}
