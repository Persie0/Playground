package p000;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import p021j$.util.DesugarCollections;
import p021j$.util.Map;
import p021j$.util.concurrent.ConcurrentHashMap;
import p021j$.util.function.BiConsumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ihk {

    /* JADX INFO: renamed from: c */
    private static Boolean f30965c;

    /* JADX INFO: renamed from: a */
    public final Object f30966a;

    /* JADX INFO: renamed from: b */
    public final Object f30967b;

    public ihk(Activity activity) {
        this.f30967b = activity;
        this.f30966a = new dfg(activity, 9);
    }

    public ihk(Context context) {
        this.f30967b = context;
        this.f30966a = new jmx();
    }

    public ihk(MotionEvent motionEvent, View view) {
        this.f30967b = motionEvent;
        this.f30966a = view;
    }

    public ihk(AmbientDelegate ambientDelegate, khb khbVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f30966a = ambientDelegate;
        this.f30967b = khbVar;
    }

    public ihk(fcp fcpVar) {
        this.f30967b = new LinkedList();
        this.f30966a = fcpVar;
    }

    public ihk(ihx ihxVar, mrm mrmVar) {
        this.f30966a = ihxVar;
        this.f30967b = mrmVar;
    }

    public ihk(ikg ikgVar, ikg ikgVar2) {
        this.f30966a = ikgVar;
        this.f30967b = ikgVar2;
    }

    public ihk(ind indVar, Executor executor) {
        this.f30967b = indVar;
        this.f30966a = executor;
    }

    public ihk(izv izvVar) {
        this.f30967b = izvVar;
        this.f30966a = new jan();
    }

    private ihk(Object obj) {
        this.f30966a = new Object();
        this.f30967b = obj;
    }

    public ihk(String str, jeu jeuVar, byte[] bArr) {
        this.f30966a = str;
        this.f30967b = jeuVar;
    }

    public ihk(Executor executor) {
        this.f30966a = executor;
        this.f30967b = new ArrayList();
    }

    public ihk(kpb kpbVar, dhv dhvVar) {
        this.f30967b = kpbVar;
        this.f30966a = dhvVar;
    }

    private ihk(mrm mrmVar, mrm mrmVar2) {
        this.f30967b = mrmVar;
        this.f30966a = mrmVar2;
    }

    public ihk(oju ojuVar, oju ojuVar2) {
        this.f30967b = ojuVar;
        this.f30966a = ojuVar2;
    }

    public ihk(oju ojuVar, oju ojuVar2, byte[] bArr) {
        ojuVar.getClass();
        this.f30966a = ojuVar;
        ojuVar2.getClass();
        this.f30967b = ojuVar2;
    }

    public ihk(byte[] bArr) {
        this.f30967b = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.f30966a = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public ihk(byte[] bArr, byte[] bArr2) {
        this.f30967b = new jwf(false);
        this.f30966a = new jwf(false);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m11327B(Context context) {
        jib.m13205j(context);
        Boolean bool = f30965c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                z = true;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        f30965c = Boolean.valueOf(z);
        return z;
    }

    /* JADX INFO: renamed from: F */
    public static ihk m11328F(Object obj) {
        return new ihk(obj);
    }

    /* JADX INFO: renamed from: h */
    public static final Enum m11329h(Enum r0, Class cls) {
        r0.getClass();
        return Enum.valueOf(cls, r0.name());
    }

    /* JADX INFO: renamed from: i */
    public static ihk m11330i(Object obj) {
        return new ihk(mrm.m16829i(obj), mqu.f41450a);
    }

    /* JADX INFO: renamed from: j */
    public static ihk m11331j(Object obj) {
        return new ihk(mqu.f41450a, mrm.m16829i(obj));
    }

    /* JADX INFO: renamed from: A */
    public final void m11332A(Runnable runnable) {
        izv.m11947c((Context) this.f30967b).m11950b().m11919b(new jaw(this, runnable, null, null, null, null));
    }

    /* JADX INFO: renamed from: C */
    public final void m11333C(Intent intent, int i) {
        try {
            synchronized (jav.f33628a) {
                jpe jpeVar = jav.f33629b;
                if (jpeVar != null && jpeVar.m13443b()) {
                    if (jpeVar.f34545m.decrementAndGet() < 0) {
                        Log.e("WakeLock", jpeVar.f34542j.concat(" release without a matched acquire!"));
                    }
                    synchronized (jpeVar.f34534b) {
                        jpeVar.m13444c();
                        if (jpeVar.f34544l.containsKey(null)) {
                            luc lucVar = (luc) jpeVar.f34544l.get(null);
                            if (lucVar != null) {
                                int i2 = lucVar.f39211a - 1;
                                lucVar.f39211a = i2;
                                if (i2 == 0) {
                                    jpeVar.f34544l.remove(null);
                                }
                            }
                        } else {
                            Log.w("WakeLock", jpeVar.f34542j + " counter does not exist");
                        }
                        jpeVar.m13445d();
                    }
                }
            }
        } catch (SecurityException e) {
        }
        izv izvVarM11947c = izv.m11947c((Context) this.f30967b);
        jar jarVarM11951d = izvVarM11947c.m11951d();
        if (intent == null) {
            jarVarM11951d.m11939t("AnalyticsService started with null intent");
            return;
        }
        String action = intent.getAction();
        jah jahVar = izvVarM11947c.f32730c;
        jarVarM11951d.m11938s("Local AnalyticsService called. startId, action", Integer.valueOf(i), action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            m11332A(new RunnableC0904pi(this, i, jarVarM11951d, 15, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
        }
    }

    /* JADX INFO: renamed from: D */
    public final Object m11334D() {
        synchronized (this.f30966a) {
        }
        return this.f30967b;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: E */
    public final jfs m11335E(hlw hlwVar) {
        synchronized (this.f30967b) {
            String strM10453b = hlwVar.m10453b();
            if (this.f30967b.containsKey(strM10453b)) {
                return (jfs) this.f30967b.get(strM10453b);
            }
            boolean z = ((lqc) this.f30966a).f38949a;
            jfs jfsVar = new jfs(hlwVar);
            this.f30967b.put(strM10453b, jfsVar);
            return jfsVar;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final void m11336a(ifv ifvVar) {
        for (ifi ifiVar : ifi.values()) {
            Map.EL.putIfAbsent(this.f30967b, ifiVar, ifvVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final void m11337b(ifi ifiVar, ifv ifvVar) {
        this.f30967b.put(ifiVar, ifvVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m11338c(ifi ifiVar) {
        m11337b(ifiVar, new ifv() { // from class: ifw
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Interpolator interpolator = iga.f30699a;
                ifi ifiVar2 = ((ign) obj).f30844v;
                ifi ifiVar3 = ((ign) obj2).f30844v;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final PointF m11339d() {
        Point pointM13569q = jvh.m13569q((View) this.f30966a);
        return new PointF(((MotionEvent) this.f30967b).getRawX() - pointM13569q.x, ((MotionEvent) this.f30967b).getRawY() - pointM13569q.y);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX INFO: renamed from: e */
    public final nps m11340e(Uri uri) {
        return kxk.m14969O(new cpb(this, uri, 9, (byte[]) null, (byte[]) null), this.f30966a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX INFO: renamed from: f */
    public final void m11341f(Uri uri) {
        this.f30966a.execute(new hri(this, uri, 20, null, null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX INFO: renamed from: g */
    public final void m11342g(Uri uri) {
        this.f30966a.execute(new ipe(this, uri, 1, (byte[]) null, (byte[]) null));
    }

    /* JADX INFO: renamed from: k */
    public final void m11343k() {
        ((hst) this.f30967b).m10713l(16, C0100R.string.taxi_feature_name, (View) this.f30966a);
    }

    /* JADX INFO: renamed from: l */
    public final synchronized int m11344l() {
        if (((LinkedList) this.f30967b).isEmpty()) {
            return 0;
        }
        return ((kxt) ((LinkedList) this.f30967b).getLast()).f37675b;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized hkc m11345m() {
        while (!((LinkedList) this.f30967b).isEmpty()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            kxt kxtVar = (kxt) ((LinkedList) this.f30967b).removeFirst();
            long j = jUptimeMillis - kxtVar.f37674a;
            if (j <= 60000) {
                hkc hkcVar = new hkc();
                hkcVar.f28121b = kxtVar.f37675b;
                hkcVar.f28120a = j;
                return hkcVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [fcp, java.lang.Object] */
    /* JADX INFO: renamed from: n */
    public final synchronized void m11346n(hjy hjyVar) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long jConvert = TimeUnit.MILLISECONDS.convert(jElapsedRealtimeNanos, TimeUnit.NANOSECONDS);
        int size = ((LinkedList) this.f30967b).size();
        ((LinkedList) this.f30967b).add(new kxt(SystemClock.uptimeMillis(), size));
        this.f30966a.mo8149X(8, null, null, null, hjyVar.mo10399a());
        hkb hkbVar = ((hjz) hjyVar).f28084j;
        if (hkbVar != null) {
            hkbVar.f28104b = jElapsedRealtimeNanos;
        }
        ((hjz) hjyVar).f28075a = jConvert;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX WARN: Type inference failed for: r5v2, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: o */
    public final boolean m11347o(kmq kmqVar, jxp jxpVar, jxn jxnVar) {
        boolean z;
        boolean z2 = jxpVar.m13662c() && jxnVar.equals(jxn.FPS_30);
        if (jxpVar.m13663d() && jxnVar.equals(jxn.FPS_30)) {
            kpb kpbVar = (kpb) this.f30967b;
            if (kpbVar.f36774g || kpbVar.f36775h) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (kmqVar.equals(kmq.f36557a) && jxnVar.equals(jxn.FPS_30)) {
            return true;
        }
        if (kmqVar.equals(kmq.BACK) && this.f30966a.mo6184l(dis.f11707c)) {
            return z2 || z;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: p */
    public final void m11348p() {
        this.f30967b.clear();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kbo] */
    /* JADX INFO: renamed from: q */
    public final jww m11349q(String str, boolean z) {
        if (!((had) this.f30966a).mo10047n(str)) {
            this.f30967b.mo13944f("Initializing default value (" + z + ") for key: (" + str + ")");
            ((had) this.f30966a).mo10045l(str, z);
        }
        return new gza((had) this.f30966a, str);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kbo] */
    /* JADX INFO: renamed from: r */
    public final jww m11350r(String str, int i) {
        if (!((had) this.f30966a).mo10047n(str)) {
            this.f30967b.mo13944f("Initializing default value (" + i + ") for key: (" + str + ")");
            ((had) this.f30966a).mo10042i(str, i);
        }
        return new gzh((had) this.f30966a, str);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kbo] */
    /* JADX INFO: renamed from: s */
    public final jww m11351s(String str, String str2) {
        if (!((had) this.f30966a).mo10047n(str)) {
            this.f30967b.mo13944f("Initializing default value (" + str2 + ") for key: (" + str + qQLA.jmkpLXq);
            ((had) this.f30966a).mo10044k(str, str2);
        }
        return new hal((had) this.f30966a, str);
    }

    /* JADX INFO: renamed from: t */
    public final knw m11352t(final long j) {
        final byte[] bArr = null;
        return (knw) ((khb) this.f30967b).m14253s(new kar(j, bArr) { // from class: kio

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long f36189a;

            @Override // p000.kar
            /* JADX INFO: renamed from: a */
            public final Object mo13886a() {
                ihk ihkVar = this.f36190b;
                return ((AmbientDelegate) ihkVar.f30966a).m1596aa(this.f36189a);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final knw m11353u(final kkq kkqVar) {
        return (knw) ((khb) this.f30967b).m14254t(kkqVar, new kar() { // from class: kin
            @Override // p000.kar
            /* JADX INFO: renamed from: a */
            public final Object mo13886a() {
                return ((AmbientDelegate) kkqVar.f36402e.f36008a).m1596aa(1L);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX INFO: renamed from: v */
    public final void m11354v(kfv kfvVar, boolean z, boolean z2, kfd kfdVar, boolean z3, kpp kppVar, boolean z4, boolean z5) {
        kgv kgvVar;
        synchronized (this.f30967b) {
            if (this.f30967b.isEmpty()) {
                kgvVar = new kgv(this, null, null, null);
            } else {
                ?? r1 = this.f30967b;
                kgvVar = (kgv) r1.remove(r1.size() - 1);
            }
        }
        kgvVar.f35987h = kfvVar;
        kgvVar.f35980a = z;
        kgvVar.f35981b = z2;
        kgvVar.f35982c = kfdVar;
        kgvVar.f35983d = z3;
        kgvVar.f35984e = kppVar;
        kgvVar.f35985f = z4;
        kgvVar.f35986g = z5;
        Executor executorMo11578bw = kfvVar.mo11578bw();
        ?? r4 = executorMo11578bw;
        if (executorMo11578bw == null) {
            r4 = this.f30966a;
        }
        r4.execute(kgvVar);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, msi] */
    /* JADX INFO: renamed from: w */
    public final void m11355w(Intent intent) {
        if (!intent.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        int iM12929a = jdm.m12929a((Context) this.f30967b, 11925000);
        if (iM12929a == 0) {
            Object objMo6051a = this.f30966a.mo6051a();
            jkn jknVar = (jkn) objMo6051a;
            jib.m13205j(jknVar.f34252a);
            jec jecVar = ((jdz) objMo6051a).f33826i;
            jkl jklVar = new jkl(jecVar, intent, new WeakReference(jknVar.f34252a));
            jecVar.mo12967b(jklVar);
            jib.m13208m(jklVar);
            return;
        }
        Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP")).f7738q);
        if (iM12929a == 7) {
            iM12929a = 7;
        } else if (!((Activity) this.f30967b).getPackageManager().queryIntentActivities(data, 0).isEmpty()) {
            new jmx(Looper.getMainLooper()).post(new ipe(this, data, 16, (byte[]) null, (byte[]) null));
            return;
        }
        Object obj = this.f30967b;
        if (true == jdm.m12931c((Context) obj, iM12929a)) {
            iM12929a = 18;
        }
        jcy.f33766a.m12899c((Activity) obj, iM12929a, 0, null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: x */
    public final void m11356x(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f30967b) {
            map = new HashMap((java.util.Map) this.f30967b);
        }
        synchronized (this.f30966a) {
            map2 = new HashMap((java.util.Map) this.f30966a);
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m4648g(status);
            }
        }
        for (java.util.Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((khb) entry2.getKey()).m14244j(new jdv(status));
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m11357y() {
        izv izvVarM11947c = izv.m11947c((Context) this.f30967b);
        jar jarVarM11951d = izvVarM11947c.m11951d();
        jah jahVar = izvVarM11947c.f32730c;
        jarVarM11951d.m11936q("Local AnalyticsService is starting up");
    }

    /* JADX INFO: renamed from: z */
    public final void m11358z() {
        izv izvVarM11947c = izv.m11947c((Context) this.f30967b);
        jar jarVarM11951d = izvVarM11947c.m11951d();
        jah jahVar = izvVarM11947c.f32730c;
        jarVarM11951d.m11936q("Local AnalyticsService is shutting down");
    }

    public ihk(lqc lqcVar, byte[] bArr) {
        this.f30967b = new HashMap();
        this.f30966a = lqcVar;
    }

    public ihk(oju ojuVar, oju ojuVar2, byte[] bArr, byte[] bArr2) {
        this.f30967b = ojuVar;
        ojuVar2.getClass();
        this.f30966a = ojuVar2;
    }

    public ihk(Context context, hst hstVar) {
        this.f30967b = hstVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30966a = frameLayout;
        View.inflate(context, C0100R.layout.macro_focus_bottomsheet, frameLayout);
    }

    public ihk(Context context, byte[] bArr) {
        jib.m13205j(context);
        Context applicationContext = context.getApplicationContext();
        jib.m13206k(applicationContext, "Application context can't be null");
        this.f30967b = applicationContext;
        this.f30966a = applicationContext;
    }

    public ihk(had hadVar, kbn kbnVar) {
        this.f30966a = hadVar;
        this.f30967b = kbnVar.mo6314a("Settings");
    }

    public ihk(PackageManager packageManager) {
        this.f30967b = new ConcurrentHashMap();
        this.f30966a = packageManager;
    }

    public ihk() {
        if (!hqn.class.isEnum()) {
            throw new IllegalArgumentException("Class to do conversion is not enum: ".concat(hqn.class.toString()));
        }
        if (!nma.class.isEnum()) {
            throw new IllegalArgumentException("Class to do conversion is not enum: ".concat(nma.class.toString()));
        }
        this.f30967b = hqn.class;
        this.f30966a = nma.class;
    }

    public ihk(jpd jpdVar, int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f30967b = new hrc(jpdVar, null, null, null);
        this.f30966a = new hrd(i, i2);
    }

    public ihk(ifi ifiVar) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(ifi.class);
        this.f30966a = enumSetNoneOf;
        this.f30967b = new EnumMap(ifi.class);
        enumSetNoneOf.add(ifiVar);
    }
}
