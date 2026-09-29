package kh;

import ag.C0076c;
import android.app.Application;
import androidx.work.C1243a;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kochava.tracker.log.LogLevel;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import mp.C7663a;
import ng.C7773b;
import ni.C7796d;
import ni.C7797e;
import p043c7.C1735a;
import p076di.InterfaceC5179a;
import p290o6.C7951d0;
import p290o6.C7954f;
import p290o6.C7977q0;
import p290o6.CallableC7981t;
import p291o7.C8004n;
import p338qd.C8573r0;
import p354r3.C8727a;
import p535zg.C10489a;
import sl.C9072e;

/* JADX INFO: renamed from: kh.a */
/* JADX INFO: loaded from: classes.dex */
public class ApplicationC6674a extends Application implements C1243a.b {

    /* JADX INFO: renamed from: e */
    public static ApplicationC6674a f37760e;

    /* JADX INFO: renamed from: a */
    public C8727a f37761a;

    /* JADX INFO: renamed from: b */
    public C7796d f37762b;

    /* JADX INFO: renamed from: c */
    public InterfaceC5179a f37763c;

    /* JADX INFO: renamed from: d */
    public C7797e f37764d;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.work.C1243a.b
    /* JADX INFO: renamed from: a */
    public final C1243a mo4701a() {
        C1243a.a aVar = new C1243a.a();
        C8727a c8727a = this.f37761a;
        if (c8727a == null) {
            C5207g.m11117l("workerFactory");
            throw null;
        }
        aVar.f7819b = c8727a;
        aVar.f7821d = Math.min(20, 50);
        aVar.f7818a = Executors.newFixedThreadPool(8);
        aVar.f7820c = 3;
        return new C1243a(aVar);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.app.Application
    public void onCreate() {
        C0076c c0076c;
        ConcurrentHashMap<String, CleverTapAPI> concurrentHashMap;
        synchronized (C7954f.class) {
            try {
                C7954f.m15770a(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        CleverTapAPI cleverTapAPIM6420g = CleverTapAPI.m6420g(this, null);
        if (cleverTapAPIM6420g != null) {
            C7951d0 c7951d0 = cleverTapAPIM6420g.f10981b.f43472b;
            c7951d0.f43297g = true;
            CleverTapInstanceConfig cleverTapInstanceConfig = c7951d0.f43294d;
            C7977q0.m15830h(C7977q0.m15827e(c7951d0.f43295e, null).edit().putBoolean(C7977q0.m15833k(cleverTapInstanceConfig, "NetworkInfo"), c7951d0.f43297g));
            C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
            String str = "Device Network Information reporting set to " + c7951d0.f43297g;
            String str2 = cleverTapInstanceConfig.f10995a;
            c2181aM6433b.getClass();
            C2181a.m6460m(str2, str);
        }
        boolean z10 = (getApplicationInfo().flags & 2) != 0;
        super.onCreate();
        f37760e = this;
        if (z10) {
            C7663a.b bVar = C7663a.f42133a;
            C7663a.a aVar = new C7663a.a();
            bVar.getClass();
            if (!(aVar != bVar)) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
            }
            ArrayList<C7663a.c> arrayList = C7663a.f42134b;
            synchronized (arrayList) {
                try {
                    arrayList.add(aVar);
                    Object[] array = arrayList.toArray(new C7663a.c[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            C8004n.f43559j = true;
            return;
        }
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        C5207g.m11110e(firebaseAnalytics, "getInstance(this)");
        CleverTapAPI cleverTapAPIM6420g2 = CleverTapAPI.m6420g(this, null);
        if (cleverTapAPIM6420g2 != null) {
            cleverTapAPIM6420g2.f10981b.f43472b.m15765i();
        }
        CleverTapAPI.f10977c = 3;
        CleverTapAPI cleverTapAPIM6420g3 = CleverTapAPI.m6420g(this, null);
        if (cleverTapAPIM6420g3 == null && (concurrentHashMap = CleverTapAPI.f10979e) != null && !concurrentHashMap.isEmpty()) {
            Iterator<String> it = CleverTapAPI.f10979e.keySet().iterator();
            while (it.hasNext()) {
                cleverTapAPIM6420g3 = CleverTapAPI.f10979e.get(it.next());
                if (cleverTapAPIM6420g3 != null) {
                    break;
                }
            }
        }
        if (cleverTapAPIM6420g3 == null) {
            C2181a.m6455h("No CleverTap Instance found in CleverTapAPI#createNotificatonChannel");
        } else {
            try {
                C1735a.m5472a(cleverTapAPIM6420g3.f10981b.f43471a).m5474b().m6585b("createNotificationChannel", new CallableC7981t(this, cleverTapAPIM6420g3));
            } catch (Throwable th4) {
                C2181a c2181aM6429f = cleverTapAPIM6420g3.m6429f();
                String strM6428e = cleverTapAPIM6420g3.m6428e();
                c2181aM6429f.getClass();
                C2181a.m6461n(strM6428e, "Failure creating Notification Channel", th4);
            }
        }
        C7796d c7796d = this.f37762b;
        if (c7796d == null) {
            C5207g.m11117l("analytics");
            throw null;
        }
        c7796d.f42870b = firebaseAnalytics;
        c7796d.f42871c = cleverTapAPIM6420g2;
        if (C7773b.f42702k == null) {
            synchronized (C7773b.f42701j) {
                if (C7773b.f42702k == null) {
                    C7773b.f42702k = new C7773b();
                }
            }
        }
        C7773b c7773b = C7773b.f42702k;
        C7797e c7797e = this.f37764d;
        if (c7797e == null) {
            C5207g.m11117l("sharedUtils");
            throw null;
        }
        String strM15510c = c7797e.m15510c("kochava_key");
        c7773b.getClass();
        Object obj = C7773b.f42701j;
        synchronized (obj) {
            c0076c = C7773b.f42700i;
            C10489a.m19477c(c0076c, "Host called API: Start With App GUID " + strM15510c);
            if (C8573r0.m16662A0(strM15510c)) {
                c0076c.m458b("startWithAppGuid failed, invalid app guid");
            } else {
                c7773b.m15479a(this, strM15510c);
            }
        }
        if (C7773b.f42702k == null) {
            synchronized (obj) {
                if (C7773b.f42702k == null) {
                    C7773b.f42702k = new C7773b();
                }
            }
        }
        C7773b c7773b2 = C7773b.f42702k;
        LogLevel logLevel = LogLevel.DEBUG;
        c7773b2.getClass();
        C10489a.m19477c(c0076c, "Host called API: Set Log Level " + logLevel);
        if (logLevel == null) {
            c0076c.m460d("setLogLevel failed, invalid level");
            return;
        }
        C10489a.m19476b().f200b = logLevel.toLevel();
        if (logLevel.toLevel() < 4) {
            c0076c.m460d(logLevel + " log level detected. Set to Info or lower prior to publishing");
        }
    }
}
