package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.wrappers.InstantApps;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class so3 implements Handler.Callback {

    /* JADX INFO: renamed from: J */
    public static final Status f61088J = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: K */
    public static final Status f61089K = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: L */
    public static final Object f61090L = new Object();

    /* JADX INFO: renamed from: M */
    public static so3 f61091M;

    /* JADX INFO: renamed from: H */
    public final wdb f61092H;

    /* JADX INFO: renamed from: I */
    public volatile boolean f61093I;

    /* JADX INFO: renamed from: a */
    public long f61094a;

    /* JADX INFO: renamed from: b */
    public boolean f61095b;

    /* JADX INFO: renamed from: c */
    public TelemetryData f61096c;

    /* JADX INFO: renamed from: d */
    public aeb f61097d;

    /* JADX INFO: renamed from: e */
    public final Context f61098e;

    /* JADX INFO: renamed from: f */
    public final oo3 f61099f;

    /* JADX INFO: renamed from: g */
    public final qfa f61100g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f61101h;

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f61102i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f61103j;

    /* JADX INFO: renamed from: k */
    public final C3437ov f61104k;

    /* JADX INFO: renamed from: l */
    public final C3437ov f61105l;

    public so3(Context context, Looper looper) {
        oo3 oo3Var = oo3.f54649e;
        this.f61094a = 10000L;
        this.f61095b = false;
        this.f61101h = new AtomicInteger(1);
        this.f61102i = new AtomicInteger(0);
        this.f61103j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f61104k = new C3437ov(0);
        this.f61105l = new C3437ov(0);
        this.f61093I = true;
        this.f61098e = context;
        wdb wdbVar = new wdb(looper, this);
        Looper.getMainLooper();
        this.f61092H = wdbVar;
        this.f61099f = oo3Var;
        this.f61100g = new qfa(9);
        PackageManager packageManager = context.getPackageManager();
        if (b34.f7858s == null) {
            b34.f7858s = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (b34.f7858s.booleanValue()) {
            this.f61093I = false;
        }
        wdbVar.sendMessage(wdbVar.obtainMessage(6));
    }

    /* JADX INFO: renamed from: a */
    public static void m21513a() {
        synchronized (f61090L) {
            try {
                so3 so3Var = f61091M;
                if (so3Var != null) {
                    so3Var.f61102i.incrementAndGet();
                    wdb wdbVar = so3Var.f61092H;
                    wdbVar.sendMessageAtFrontOfQueue(wdbVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static Status m21514d(C3118io c3118io, ConnectionResult connectionResult) {
        String str = (String) c3118io.f44338b.f8007b;
        String strValueOf = String.valueOf(connectionResult);
        return new Status(17, wq1.m24125u(new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), connectionResult.f11638c, connectionResult);
    }

    /* JADX INFO: renamed from: e */
    public static so3 m21515e(Context context) {
        so3 so3Var;
        HandlerThread handlerThread;
        synchronized (f61090L) {
            if (f61091M == null) {
                synchronized (obd.f54147g) {
                    try {
                        handlerThread = obd.f54149i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            obd.f54149i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = obd.f54149i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = oo3.f54648d;
                f61091M = new so3(applicationContext, looper);
            }
            so3Var = f61091M;
        }
        return so3Var;
    }

    /* JADX INFO: renamed from: b */
    public final scb m21516b(no3 no3Var) {
        C3118io c3118io = no3Var.f53050f;
        ConcurrentHashMap concurrentHashMap = this.f61103j;
        scb scbVar = (scb) concurrentHashMap.get(c3118io);
        if (scbVar == null) {
            scbVar = new scb(this, no3Var);
            concurrentHashMap.put(c3118io, scbVar);
        }
        if (scbVar.f60689g.mo3407r()) {
            this.f61105l.add(c3118io);
        }
        scbVar.m21240o();
        return scbVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m21517c(wr9 wr9Var, int i, no3 no3Var) {
        wcb wcbVarM23850a;
        if (i == 0 || (wcbVarM23850a = wcb.m23850a(this, i, no3Var.f53050f)) == null) {
            return;
        }
        tld tldVar = wr9Var.f67208a;
        wdb wdbVar = this.f61092H;
        Objects.requireNonNull(wdbVar);
        tldVar.mo5960b(new f78(wdbVar, 1), wcbVarM23850a);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m21518f() {
        int i;
        if (this.f61095b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfigurationM13284t = hi8.m13280u().m13284t();
        if (rootTelemetryConfigurationM13284t != null && !rootTelemetryConfigurationM13284t.m5288r()) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.f61100g.f57705a;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(203400000, -1);
        }
        return i == -1 || i == 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m21519g(ConnectionResult connectionResult, int i) {
        oo3 oo3Var = this.f61099f;
        oo3Var.getClass();
        Context context = this.f61098e;
        if (!InstantApps.isInstantApp(context)) {
            int i2 = connectionResult.f11637b;
            PendingIntent pendingIntentM12274a = connectionResult.f11638c;
            if (!((i2 == 0 || pendingIntentM12274a == null) ? false : true)) {
                pendingIntentM12274a = null;
                Intent intentM19431b = oo3Var.m19431b(i2, context, null);
                if (intentM19431b != null) {
                    pendingIntentM12274a = g0c.m12274a(context, intentM19431b);
                }
            }
            if (pendingIntentM12274a != null) {
                oo3Var.m18188g(context, i2, udb.m22700a(context, GoogleApiActivity.m5280a(context, pendingIntentM12274a, i, true), udb.f63801a | 134217728));
                Integer num = connectionResult.f11640e;
                int iIntValue = num == null ? -1 : num.intValue();
                zab zabVar = new zab(iIntValue, connectionResult.f11637b, System.currentTimeMillis(), context.getPackageName(), false);
                if (oo3Var.f54650c == null) {
                    oo3Var.f54650c = new xdb(context);
                }
                oo3Var.f54650c.m24466d(zabVar);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m21520h(ConnectionResult connectionResult, int i) {
        if (m21519g(connectionResult, i)) {
            return;
        }
        wdb wdbVar = this.f61092H;
        wdbVar.sendMessage(wdbVar.obtainMessage(5, i, 0, connectionResult));
    }

    /* JADX WARN: Code duplicated, block: B:156:0x032c  */
    /* JADX WARN: Code duplicated, block: B:158:0x0332  */
    /* JADX WARN: Code duplicated, block: B:160:0x0364  */
    /* JADX WARN: Code duplicated, block: B:162:0x036e  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v11 scb, still in use, count: 2, list:
          (r2v11 scb) from 0x0324: IGET (r2v11 scb) A[WRAPPED] scb.l int
          (r2v11 scb) from 0x032a: PHI (r2 I:??) = (r2v8 scb), (r2v11 scb) binds: [B:154:0x0329, B:206:0x032a] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instruction units count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.so3.handleMessage(android.os.Message):boolean");
    }
}
