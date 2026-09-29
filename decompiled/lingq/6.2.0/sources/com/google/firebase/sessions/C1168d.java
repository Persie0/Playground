package com.google.firebase.sessions;

import android.util.Log;
import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.api.C1165a;
import com.google.firebase.sessions.api.SessionSubscriber$Name;
import com.google.firebase.sessions.settings.C1170b;
import java.util.Map;
import java.util.Objects;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.time.DurationUnit;
import p000.AbstractC3352my;
import p000.C3309ls;
import p000.C3386nv;
import p000.cn2;
import p000.dz8;
import p000.f59;
import p000.fa4;
import p000.gm5;
import p000.iy5;
import p000.k0a;
import p000.kn1;
import p000.lz8;
import p000.np1;
import p000.r0a;
import p000.t33;
import p000.uy8;
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.xk7;
import p000.zk7;
import p000.zy8;

/* JADX INFO: renamed from: com.google.firebase.sessions.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1168d {

    /* JADX INFO: renamed from: a */
    public final C1170b f13858a;

    /* JADX INFO: renamed from: b */
    public final dz8 f13859b;

    /* JADX INFO: renamed from: c */
    public final C1167c f13860c;

    /* JADX INFO: renamed from: d */
    public final r0a f13861d;

    /* JADX INFO: renamed from: e */
    public final DataStore f13862e;

    /* JADX INFO: renamed from: f */
    public final zk7 f13863f;

    /* JADX INFO: renamed from: g */
    public final kn1 f13864g;

    /* JADX INFO: renamed from: h */
    public uy8 f13865h;

    /* JADX INFO: renamed from: i */
    public boolean f13866i;

    /* JADX INFO: renamed from: j */
    public boolean f13867j;

    /* JADX INFO: renamed from: k */
    public String f13868k;

    public C1168d(C1170b c1170b, dz8 dz8Var, C1167c c1167c, r0a r0aVar, DataStore dataStore, zk7 zk7Var, kn1 kn1Var) {
        c1170b.getClass();
        dz8Var.getClass();
        c1167c.getClass();
        r0aVar.getClass();
        dataStore.getClass();
        zk7Var.getClass();
        kn1Var.getClass();
        this.f13858a = c1170b;
        this.f13859b = dz8Var;
        this.f13860c = c1167c;
        this.f13861d = r0aVar;
        this.f13862e = dataStore;
        this.f13863f = zk7Var;
        this.f13864g = kn1Var;
        SharedSessionRepositoryImpl$NotificationType sharedSessionRepositoryImpl$NotificationType = SharedSessionRepositoryImpl$NotificationType.GENERAL;
        this.f13868k = "";
        wfb.m23926u(vz1.m23619a(kn1Var), null, null, new SharedSessionRepositoryImpl$1(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m6756a(C1168d c1168d, String str, SharedSessionRepositoryImpl$NotificationType sharedSessionRepositoryImpl$NotificationType, Continuation continuation) throws Throwable {
        SharedSessionRepositoryImpl$notifySubscribers$1 sharedSessionRepositoryImpl$notifySubscribers$1;
        String str2;
        if (continuation instanceof SharedSessionRepositoryImpl$notifySubscribers$1) {
            sharedSessionRepositoryImpl$notifySubscribers$1 = (SharedSessionRepositoryImpl$notifySubscribers$1) continuation;
            int i = sharedSessionRepositoryImpl$notifySubscribers$1.f13838e;
            if ((i & Integer.MIN_VALUE) != 0) {
                sharedSessionRepositoryImpl$notifySubscribers$1.f13838e = i - Integer.MIN_VALUE;
            } else {
                sharedSessionRepositoryImpl$notifySubscribers$1 = new SharedSessionRepositoryImpl$notifySubscribers$1(c1168d, continuation);
            }
        } else {
            sharedSessionRepositoryImpl$notifySubscribers$1 = new SharedSessionRepositoryImpl$notifySubscribers$1(c1168d, continuation);
        }
        Object objM6753b = sharedSessionRepositoryImpl$notifySubscribers$1.f13836c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = sharedSessionRepositoryImpl$notifySubscribers$1.f13838e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM6753b);
            if (fa4.m11650l(c1168d.f13868k, str)) {
                return xfa.f68157a;
            }
            c1168d.f13868k = str;
            C1165a c1165a = C1165a.f13849a;
            sharedSessionRepositoryImpl$notifySubscribers$1.f13834a = str;
            sharedSessionRepositoryImpl$notifySubscribers$1.f13835b = sharedSessionRepositoryImpl$NotificationType;
            sharedSessionRepositoryImpl$notifySubscribers$1.f13838e = 1;
            objM6753b = c1165a.m6753b(sharedSessionRepositoryImpl$notifySubscribers$1);
            if (objM6753b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sharedSessionRepositoryImpl$NotificationType = sharedSessionRepositoryImpl$notifySubscribers$1.f13835b;
            str = sharedSessionRepositoryImpl$notifySubscribers$1.f13834a;
            AbstractC3193b.m15359b(objM6753b);
        }
        for (np1 np1Var : ((Map) objM6753b).values()) {
            lz8 lz8Var = new lz8(str);
            np1Var.getClass();
            String str3 = "App Quality Sessions session changed: " + lz8Var;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
            C3309ls c3309ls = np1Var.f53087b;
            synchronized (c3309ls) {
                if (!Objects.equals((String) c3309ls.f50066d, str)) {
                    C3309ls.m16478G((t33) c3309ls.f50064b, (String) c3309ls.f50065c, str);
                    c3309ls.f50066d = str;
                }
            }
            int i3 = f59.f38442a[sharedSessionRepositoryImpl$NotificationType.ordinal()];
            if (i3 == 1) {
                str2 = "Notified " + SessionSubscriber$Name.CRASHLYTICS + " of new session " + str;
            } else {
                if (i3 != 2) {
                    gm5.m12750e();
                    return null;
                }
                str2 = "Notified " + SessionSubscriber$Name.CRASHLYTICS + " of new fallback session " + str;
            }
            Log.d("FirebaseSessions", str2);
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: b */
    public final void m6757b() {
        this.f13866i = false;
        if (this.f13865h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f13863f.m25683a());
        wfb.m23926u(vz1.m23619a(this.f13864g), null, null, new SharedSessionRepositoryImpl$appBackground$1(this, null), 3);
    }

    /* JADX INFO: renamed from: c */
    public final void m6758c() {
        this.f13866i = true;
        uy8 uy8Var = this.f13865h;
        if (uy8Var == null) {
            this.f13867j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
        } else {
            if (uy8Var == null) {
                fa4.m11636J("localSessionData");
                throw null;
            }
            Log.d("FirebaseSessions", "App foregrounded on " + this.f13863f.m25683a());
            if (m6760e(uy8Var) || m6759d(uy8Var)) {
                wfb.m23926u(vz1.m23619a(this.f13864g), null, null, new SharedSessionRepositoryImpl$appForeground$1(this, uy8Var, null), 3);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6759d(uy8 uy8Var) {
        Map map = uy8Var.f64545c;
        boolean z = true;
        zk7 zk7Var = this.f13863f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + zk7Var.m25683a());
            return true;
        }
        zk7Var.getClass();
        xk7 xk7Var = (xk7) map.get(zk7Var.m25683a());
        if (xk7Var != null && xk7Var.f68316a == zk7Var.f71683c && fa4.m11650l(xk7Var.f68317b, (String) zk7Var.f71684d.getValue())) {
            z = false;
        }
        if (z) {
            Log.d("FirebaseSessions", "Process " + zk7Var.m25683a() + " is stale");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX INFO: renamed from: e */
    public final boolean m6760e(uy8 uy8Var) {
        cn2 cn2VarMo6762b;
        long jM17117e0;
        k0a k0aVar = uy8Var.f64544b;
        zy8 zy8Var = uy8Var.f64543a;
        if (k0aVar == null) {
            Log.d("FirebaseSessions", "Session " + zy8Var.f72388a + " has not backgrounded yet");
            return false;
        }
        this.f13861d.getClass();
        k0a k0aVarM20228a = r0a.m20228a();
        iy5 iy5Var = cn2.f10315b;
        long jM17119f0 = AbstractC3352my.m17119f0(k0aVarM20228a.f46519a - k0aVar.f46519a, DurationUnit.MILLISECONDS);
        C1170b c1170b = this.f13858a;
        cn2 cn2VarMo6762b2 = c1170b.f13901a.mo6762b();
        if (cn2VarMo6762b2 != null) {
            jM17117e0 = cn2VarMo6762b2.f10319a;
            if (jM17117e0 <= 0 || cn2.m4888f(jM17117e0)) {
                cn2VarMo6762b = c1170b.f13902b.mo6762b();
                if (cn2VarMo6762b != null) {
                    jM17117e0 = cn2VarMo6762b.f10319a;
                    if (jM17117e0 > 0 || cn2.m4888f(jM17117e0)) {
                        jM17117e0 = AbstractC3352my.m17117e0(30, DurationUnit.MINUTES);
                    }
                } else {
                    jM17117e0 = AbstractC3352my.m17117e0(30, DurationUnit.MINUTES);
                }
            }
        } else {
            cn2VarMo6762b = c1170b.f13902b.mo6762b();
            if (cn2VarMo6762b != null) {
                jM17117e0 = cn2VarMo6762b.f10319a;
                if (jM17117e0 > 0) {
                    jM17117e0 = AbstractC3352my.m17117e0(30, DurationUnit.MINUTES);
                } else {
                    jM17117e0 = AbstractC3352my.m17117e0(30, DurationUnit.MINUTES);
                }
            } else {
                jM17117e0 = AbstractC3352my.m17117e0(30, DurationUnit.MINUTES);
            }
        }
        boolean z = cn2.m4885c(jM17119f0, jM17117e0) > 0;
        if (z) {
            Log.d("FirebaseSessions", "Session " + zy8Var.f72388a + " is expired");
        }
        return z;
    }
}
