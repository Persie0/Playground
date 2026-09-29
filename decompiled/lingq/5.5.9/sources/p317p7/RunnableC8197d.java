package p317p7;

import android.app.ActivityManager;
import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.appevents.AppEventsLogger$FlushBehavior;
import com.facebook.appevents.FlushReason;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p029b8.C1338d;
import p134g8.C5714a;
import p173i8.C6205a;
import p291o7.C8004n;
import p387t0.C9166r;
import p431v7.C9659c;
import p431v7.C9663g;

/* JADX INFO: renamed from: p7.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC8197d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44381a;

    public /* synthetic */ RunnableC8197d(int i10) {
        this.f44381a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9663g c9663g;
        Class<?> clsM18134b;
        ArrayList<String> arrayListM18133a = null;
        switch (this.f44381a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                if (C6205a.m12742b(C8199f.class)) {
                    return;
                }
                try {
                    C8199f.f44390e = null;
                    String str = C8201h.f44393c;
                    if (C8201h.a.m16337b() != AppEventsLogger$FlushBehavior.EXPLICIT_ONLY) {
                        C8199f.m16324d(FlushReason.TIMER);
                        return;
                    }
                } catch (Throwable th2) {
                    C6205a.m12741a(C8199f.class, th2);
                }
                return;
            case 1:
                if (C6205a.m12742b(C8199f.class)) {
                    return;
                }
                try {
                    int i10 = C8200g.f44392a;
                    C8200g.m16328b(C8199f.f44388c);
                    C8199f.f44388c = new C9166r(1);
                    return;
                } catch (Throwable th3) {
                    C6205a.m12741a(C8199f.class, th3);
                    return;
                }
            case 2:
                Context contextM15871a = C8004n.m15871a();
                C9663g c9663g2 = C9663g.f49486a;
                ArrayList<String> arrayListM18132f = C9663g.m18132f(contextM15871a, C9659c.f49455i);
                if (arrayListM18132f.isEmpty()) {
                    Object obj = C9659c.f49455i;
                    if (!C6205a.m12742b(C9663g.class)) {
                        try {
                            arrayListM18133a = (obj != null && (clsM18134b = (c9663g = C9663g.f49486a).m18134b(contextM15871a, "com.android.vending.billing.IInAppBillingService")) != null && c9663g.m18135c(clsM18134b, "getPurchaseHistory") != null) ? c9663g.m18133a(c9663g.m18136d(contextM15871a, obj)) : new ArrayList<>();
                        } catch (Throwable th4) {
                            C6205a.m12741a(C9663g.class, th4);
                        }
                    }
                    break;
                } else {
                    arrayListM18133a = arrayListM18132f;
                }
                C9659c.m18118a(C9659c.f49447a, contextM15871a, arrayListM18133a, false);
                return;
            case 3:
                C1338d c1338d = C1338d.f8143a;
                if (C6205a.m12742b(C1338d.class)) {
                    return;
                }
                try {
                    AtomicBoolean atomicBoolean = C1338d.f8144b;
                    if (atomicBoolean.get()) {
                        return;
                    }
                    atomicBoolean.set(true);
                    C1338d.f8143a.m4916b();
                    return;
                } catch (Throwable th5) {
                    C6205a.m12741a(C1338d.class, th5);
                    return;
                }
            default:
                int i11 = C5714a.f34727a;
                if (C6205a.m12742b(C5714a.class)) {
                    return;
                }
                try {
                    Object systemService = C8004n.m15871a().getSystemService("activity");
                    if (systemService == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                    }
                    C5714a.m12073a((ActivityManager) systemService);
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th6) {
                    C6205a.m12741a(C5714a.class, th6);
                    return;
                }
        }
    }
}
