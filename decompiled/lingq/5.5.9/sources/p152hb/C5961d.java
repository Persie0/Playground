package p152hb;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.gms.common.C2548c;
import com.google.android.gms.common.C2550e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.AbstractC2543b;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.wrappers.InstantApps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p176ib.AbstractC6260d;
import p176ib.C6268g;
import p176ib.C6272i;
import p176ib.C6274j;
import p176ib.C6302x;
import p197jb.C6444c;
import p262mb.C7529b;
import p326q.AbstractC8451g;
import p326q.C8448d;
import p412ub.C9516e;
import p412ub.HandlerC9517f;

/* JADX INFO: renamed from: hb.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5961d implements Handler.Callback {

    /* JADX INFO: renamed from: K */
    public static final Status f35435K = new Status("Sign-out occurred while this API call was in progress.", 4);

    /* JADX INFO: renamed from: L */
    public static final Status f35436L = new Status("The user must be signed in to make this API call.", 4);

    /* JADX INFO: renamed from: M */
    public static final Object f35437M = new Object();

    /* JADX INFO: renamed from: N */
    public static C5961d f35438N;

    /* JADX INFO: renamed from: H */
    public final C8448d f35439H;

    /* JADX INFO: renamed from: I */
    @NotOnlyInitialized
    public final HandlerC9517f f35440I;

    /* JADX INFO: renamed from: J */
    public volatile boolean f35441J;

    /* JADX INFO: renamed from: a */
    public long f35442a;

    /* JADX INFO: renamed from: b */
    public boolean f35443b;

    /* JADX INFO: renamed from: c */
    public TelemetryData f35444c;

    /* JADX INFO: renamed from: d */
    public C6444c f35445d;

    /* JADX INFO: renamed from: e */
    public final Context f35446e;

    /* JADX INFO: renamed from: f */
    public final C2548c f35447f;

    /* JADX INFO: renamed from: g */
    public final C6302x f35448g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f35449h;

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f35450i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f35451j;

    /* JADX INFO: renamed from: k */
    public C6001q f35452k;

    /* JADX INFO: renamed from: l */
    public final C8448d f35453l;

    public C5961d(Context context, Looper looper) {
        C2548c c2548c = C2548c.f13920d;
        this.f35442a = 10000L;
        this.f35443b = false;
        this.f35449h = new AtomicInteger(1);
        this.f35450i = new AtomicInteger(0);
        this.f35451j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f35452k = null;
        this.f35453l = new C8448d();
        this.f35439H = new C8448d();
        this.f35441J = true;
        this.f35446e = context;
        HandlerC9517f handlerC9517f = new HandlerC9517f(looper, this);
        this.f35440I = handlerC9517f;
        this.f35447f = c2548c;
        this.f35448g = new C6302x(c2548c);
        PackageManager packageManager = context.getPackageManager();
        if (C7529b.f41602d == null) {
            C7529b.f41602d = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (C7529b.f41602d.booleanValue()) {
            this.f35441J = false;
        }
        handlerC9517f.sendMessage(handlerC9517f.obtainMessage(6));
    }

    /* JADX INFO: renamed from: d */
    public static Status m12399d(C5949a<?> c5949a, ConnectionResult connectionResult) {
        String str = c5949a.f35408b.f13886c;
        String strValueOf = String.valueOf(connectionResult);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length());
        sb2.append("API: ");
        sb2.append(str);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(strValueOf);
        return new Status(1, 17, sb2.toString(), connectionResult.f13858c, connectionResult);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    public static C5961d m12400f(Context context) {
        C5961d c5961d;
        HandlerThread handlerThread;
        synchronized (f35437M) {
            try {
                if (f35438N == null) {
                    synchronized (AbstractC6260d.f36457a) {
                        try {
                            handlerThread = AbstractC6260d.f36459c;
                            if (handlerThread == null) {
                                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                                AbstractC6260d.f36459c = handlerThread2;
                                handlerThread2.start();
                                handlerThread = AbstractC6260d.f36459c;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    Looper looper = handlerThread.getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = C2548c.f13919c;
                    f35438N = new C5961d(applicationContext, looper);
                }
                c5961d = f35438N;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c5961d;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m12401a(C6001q c6001q) {
        synchronized (f35437M) {
            if (this.f35452k != c6001q) {
                this.f35452k = c6001q;
                this.f35453l.clear();
            }
            this.f35453l.addAll(c6001q.f35575f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12402b() {
        if (this.f35443b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = C6274j.m12918a().f36470a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.f13963b) {
            return false;
        }
        int i10 = this.f35448g.f36509a.get(203400000, -1);
        return i10 == -1 || i10 == 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12403c(ConnectionResult connectionResult, int i10) {
        C2548c c2548c = this.f35447f;
        c2548c.getClass();
        Context context = this.f35446e;
        if (InstantApps.isInstantApp(context)) {
            return false;
        }
        boolean zM7530q = connectionResult.m7530q();
        int i11 = connectionResult.f13857b;
        PendingIntent pendingIntentM7591b = zM7530q ? connectionResult.f13858c : c2548c.m7591b(i11, 0, context, null);
        if (pendingIntentM7591b == null) {
            return false;
        }
        int i12 = GoogleApiActivity.f13869b;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntentM7591b);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", true);
        c2548c.m7589i(context, i11, PendingIntent.getActivity(context, 0, intent, C9516e.f49021a | 134217728));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final C6008s0<?> m12404e(AbstractC2543b<?> abstractC2543b) {
        Object obj = abstractC2543b.f13891e;
        ConcurrentHashMap concurrentHashMap = this.f35451j;
        C6008s0<?> c6008s0 = (C6008s0) concurrentHashMap.get(obj);
        if (c6008s0 == null) {
            c6008s0 = new C6008s0<>(this, abstractC2543b);
            concurrentHashMap.put(obj, c6008s0);
        }
        if (c6008s0.f35582b.mo7553s()) {
            this.f35439H.add(obj);
        }
        c6008s0.m12463m();
        return c6008s0;
    }

    /* JADX INFO: renamed from: g */
    public final void m12405g(ConnectionResult connectionResult, int i10) {
        if (!m12403c(connectionResult, i10)) {
            HandlerC9517f handlerC9517f = this.f35440I;
            handlerC9517f.sendMessage(handlerC9517f.obtainMessage(5, i10, 0, connectionResult));
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:162:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:163:0x041d  */
    /* JADX WARN: Code duplicated, block: B:164:0x042a  */
    /* JADX WARN: Code duplicated, block: B:189:0x04ff  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Feature[] featureArrMo12443g;
        boolean z10;
        int i10 = message.what;
        HandlerC9517f handlerC9517f = this.f35440I;
        ConcurrentHashMap concurrentHashMap = this.f35451j;
        long j10 = 300000;
        C6008s0 c6008s0 = null;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = 10000;
                }
                this.f35442a = j10;
                handlerC9517f.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    handlerC9517f.sendMessageDelayed(handlerC9517f.obtainMessage(12, (C5949a) it.next()), this.f35442a);
                }
                return true;
            case 2:
                ((C6006r1) message.obj).getClass();
                throw null;
            case 3:
                for (C6008s0 c6008s1 : concurrentHashMap.values()) {
                    C6272i.m12909c(c6008s1.f35592l.f35440I);
                    c6008s1.f35591k = null;
                    c6008s1.m12463m();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C5963d1 c5963d1 = (C5963d1) message.obj;
                C6008s0<?> c6008s0M12404e = (C6008s0) concurrentHashMap.get(c5963d1.f35457c.f13891e);
                if (c6008s0M12404e == null) {
                    c6008s0M12404e = m12404e(c5963d1.f35457c);
                }
                boolean zMo7553s = c6008s0M12404e.f35582b.mo7553s();
                AbstractC5997o1 abstractC5997o1 = c5963d1.f35455a;
                if (!zMo7553s || this.f35450i.get() == c5963d1.f35456b) {
                    c6008s0M12404e.m12464n(abstractC5997o1);
                } else {
                    abstractC5997o1.mo12434a(f35435K);
                    c6008s0M12404e.m12466p();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                for (C6008s0 c6008s2 : concurrentHashMap.values()) {
                    if (c6008s2.f35587g == i11) {
                        c6008s0 = c6008s2;
                        if (c6008s0 != null) {
                            StringBuilder sb2 = new StringBuilder(76);
                            sb2.append("Could not find API instance ");
                            sb2.append(i11);
                            sb2.append(" while trying to fail enqueued calls.");
                            Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                        } else if (connectionResult.f13857b == 13) {
                            this.f35447f.getClass();
                            String errorString = C2550e.getErrorString(connectionResult.f13857b);
                            int length = String.valueOf(errorString).length();
                            String str = connectionResult.f13859d;
                            StringBuilder sb3 = new StringBuilder(length + 69 + String.valueOf(str).length());
                            sb3.append("Error resolution was canceled by the user, original error message: ");
                            sb3.append(errorString);
                            sb3.append(": ");
                            sb3.append(str);
                            c6008s0.m12454b(new Status(sb3.toString(), 17));
                        } else {
                            c6008s0.m12454b(m12399d(c6008s0.f35583c, connectionResult));
                        }
                        return true;
                    }
                }
                if (c6008s0 != null) {
                    StringBuilder sb4 = new StringBuilder(76);
                    sb4.append("Could not find API instance ");
                    sb4.append(i11);
                    sb4.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb4.toString(), new Exception());
                } else if (connectionResult.f13857b == 13) {
                    this.f35447f.getClass();
                    String errorString2 = C2550e.getErrorString(connectionResult.f13857b);
                    int length2 = String.valueOf(errorString2).length();
                    String str2 = connectionResult.f13859d;
                    StringBuilder sb5 = new StringBuilder(length2 + 69 + String.valueOf(str2).length());
                    sb5.append("Error resolution was canceled by the user, original error message: ");
                    sb5.append(errorString2);
                    sb5.append(": ");
                    sb5.append(str2);
                    c6008s0.m12454b(new Status(sb5.toString(), 17));
                } else {
                    c6008s0.m12454b(m12399d(c6008s0.f35583c, connectionResult));
                }
                return true;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                Context context = this.f35446e;
                if (context.getApplicationContext() instanceof Application) {
                    Application application = (Application) context.getApplicationContext();
                    ComponentCallbacks2C5953b componentCallbacks2C5953b = ComponentCallbacks2C5953b.f35417e;
                    synchronized (componentCallbacks2C5953b) {
                        if (!componentCallbacks2C5953b.f35421d) {
                            application.registerActivityLifecycleCallbacks(componentCallbacks2C5953b);
                            application.registerComponentCallbacks(componentCallbacks2C5953b);
                            componentCallbacks2C5953b.f35421d = true;
                        }
                        break;
                    }
                    C5996o0 c5996o0 = new C5996o0(this);
                    componentCallbacks2C5953b.getClass();
                    synchronized (componentCallbacks2C5953b) {
                        componentCallbacks2C5953b.f35420c.add(c5996o0);
                        break;
                    }
                    AtomicBoolean atomicBoolean = componentCallbacks2C5953b.f35419b;
                    if (!atomicBoolean.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            componentCallbacks2C5953b.f35418a.set(true);
                        }
                    }
                    if (!componentCallbacks2C5953b.f35418a.get()) {
                        this.f35442a = 300000L;
                    }
                }
                return true;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                m12404e((AbstractC2543b) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    C6008s0 c6008s3 = (C6008s0) concurrentHashMap.get(message.obj);
                    C6272i.m12909c(c6008s3.f35592l.f35440I);
                    if (c6008s3.f35589i) {
                        c6008s3.m12463m();
                    }
                }
                return true;
            case 10:
                C8448d c8448d = this.f35439H;
                Iterator it2 = c8448d.iterator();
                while (true) {
                    while (true) {
                        AbstractC8451g.a aVar = (AbstractC8451g.a) it2;
                        if (!aVar.hasNext()) {
                            c8448d.clear();
                            return true;
                        }
                        C6008s0 c6008s4 = (C6008s0) concurrentHashMap.remove((C5949a) aVar.next());
                        if (c6008s4 != null) {
                            c6008s4.m12466p();
                        }
                    }
                }
                break;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    C6008s0 c6008s5 = (C6008s0) concurrentHashMap.get(message.obj);
                    C5961d c5961d = c6008s5.f35592l;
                    C6272i.m12909c(c5961d.f35440I);
                    boolean z11 = c6008s5.f35589i;
                    if (z11) {
                        if (z11) {
                            C5961d c5961d2 = c6008s5.f35592l;
                            HandlerC9517f handlerC9517f2 = c5961d2.f35440I;
                            Object obj = c6008s5.f35583c;
                            handlerC9517f2.removeMessages(11, obj);
                            c5961d2.f35440I.removeMessages(9, obj);
                            c6008s5.f35589i = false;
                        }
                        c6008s5.m12454b(c5961d.f35447f.m7588e(c5961d.f35446e) == 18 ? new Status("Connection timed out waiting for Google Play services update to complete.", 21) : new Status("API failed to connect while resuming due to an unknown error.", 22));
                        c6008s5.f35582b.mo7542f("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((C6008s0) concurrentHashMap.get(message.obj)).m12462l(true);
                }
                return true;
            case 14:
                ((C6004r) message.obj).getClass();
                if (!concurrentHashMap.containsKey(null)) {
                    throw null;
                }
                ((C6008s0) concurrentHashMap.get(null)).m12462l(false);
                throw null;
            case 15:
                C6011t0 c6011t0 = (C6011t0) message.obj;
                if (concurrentHashMap.containsKey(c6011t0.f35596a)) {
                    C6008s0 c6008s6 = (C6008s0) concurrentHashMap.get(c6011t0.f35596a);
                    if (c6008s6.f35590j.contains(c6011t0)) {
                        if (!c6008s6.f35589i) {
                            if (c6008s6.f35582b.mo7537a()) {
                                c6008s6.m12456d();
                            } else {
                                c6008s6.m12463m();
                            }
                        }
                    }
                }
                return true;
            case 16:
                C6011t0 c6011t1 = (C6011t0) message.obj;
                if (concurrentHashMap.containsKey(c6011t1.f35596a)) {
                    C6008s0<?> c6008s7 = (C6008s0) concurrentHashMap.get(c6011t1.f35596a);
                    if (c6008s7.f35590j.remove(c6011t1)) {
                        C5961d c5961d3 = c6008s7.f35592l;
                        c5961d3.f35440I.removeMessages(15, c6011t1);
                        c5961d3.f35440I.removeMessages(16, c6011t1);
                        LinkedList linkedList = c6008s7.f35581a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it3 = linkedList.iterator();
                        while (true) {
                            while (true) {
                                boolean zHasNext = it3.hasNext();
                                Feature feature = c6011t1.f35597b;
                                if (zHasNext) {
                                    AbstractC5997o1 abstractC5997o2 = (AbstractC5997o1) it3.next();
                                    if (!(abstractC5997o2 instanceof AbstractC6029z0) || (featureArrMo12443g = ((AbstractC6029z0) abstractC5997o2).mo12443g(c6008s7)) == null) {
                                    }
                                    int length3 = featureArrMo12443g.length;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < length3) {
                                            if (!C6268g.m12905a(featureArrMo12443g[i12], feature)) {
                                                i12++;
                                            } else if (i12 >= 0) {
                                                z10 = true;
                                            }
                                        }
                                        z10 = false;
                                    }
                                    if (!z10) {
                                    }
                                    arrayList.add(abstractC5997o2);
                                } else {
                                    int size = arrayList.size();
                                    for (int i13 = 0; i13 < size; i13++) {
                                        AbstractC5997o1 abstractC5997o3 = (AbstractC5997o1) arrayList.get(i13);
                                        linkedList.remove(abstractC5997o3);
                                        abstractC5997o3.mo12435b(new UnsupportedApiCallException(feature));
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return true;
            case 17:
                TelemetryData telemetryData = this.f35444c;
                if (telemetryData != null) {
                    if (telemetryData.f13967a > 0 || m12402b()) {
                        if (this.f35445d == null) {
                            this.f35445d = new C6444c(this.f35446e);
                        }
                        this.f35445d.m13068b(telemetryData);
                    }
                    this.f35444c = null;
                }
                return true;
            case 18:
                C5955b1 c5955b1 = (C5955b1) message.obj;
                c5955b1.getClass();
                c5955b1.getClass();
                c5955b1.getClass();
                if (0 == 0) {
                    TelemetryData telemetryData2 = new TelemetryData(0, Arrays.asList(null));
                    if (this.f35445d == null) {
                        this.f35445d = new C6444c(this.f35446e);
                    }
                    this.f35445d.m13068b(telemetryData2);
                } else {
                    TelemetryData telemetryData3 = this.f35444c;
                    if (telemetryData3 != null) {
                        List<MethodInvocation> list = telemetryData3.f13968b;
                        if (telemetryData3.f13967a == 0) {
                            if (list != null) {
                                int size2 = list.size();
                                c5955b1.getClass();
                                if (size2 >= 0) {
                                }
                            }
                            TelemetryData telemetryData4 = this.f35444c;
                            if (telemetryData4.f13968b == null) {
                                telemetryData4.f13968b = new ArrayList();
                            }
                            telemetryData4.f13968b.add(null);
                        }
                        handlerC9517f.removeMessages(17);
                        TelemetryData telemetryData5 = this.f35444c;
                        if (telemetryData5 != null) {
                            if (telemetryData5.f13967a > 0 || m12402b()) {
                                if (this.f35445d == null) {
                                    this.f35445d = new C6444c(this.f35446e);
                                }
                                this.f35445d.m13068b(telemetryData5);
                            }
                            this.f35444c = null;
                        }
                    }
                    if (this.f35444c == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(null);
                        this.f35444c = new TelemetryData(0, arrayList2);
                        Message messageObtainMessage = handlerC9517f.obtainMessage(17);
                        c5955b1.getClass();
                        handlerC9517f.sendMessageDelayed(messageObtainMessage, 0L);
                    }
                }
                return true;
            case 19:
                this.f35443b = false;
                return true;
            default:
                StringBuilder sb6 = new StringBuilder(31);
                sb6.append("Unknown message id: ");
                sb6.append(i10);
                Log.w("GoogleApiManager", sb6.toString());
                return false;
        }
    }
}
