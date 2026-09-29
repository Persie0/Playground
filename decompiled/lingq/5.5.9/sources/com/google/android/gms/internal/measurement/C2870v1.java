package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import cc.C1843i4;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p031bc.C1356a;
import p176ib.C6272i;
import p260m8.C7499b;
import p338qd.C8573r0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2870v1 {

    /* JADX INFO: renamed from: i */
    public static volatile C2870v1 f14465i;

    /* JADX INFO: renamed from: a */
    public final String f14466a = "FA";

    /* JADX INFO: renamed from: b */
    public final C7499b f14467b = C7499b.f41437l;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f14468c;

    /* JADX INFO: renamed from: d */
    public final C1356a f14469d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f14470e;

    /* JADX INFO: renamed from: f */
    public int f14471f;

    /* JADX INFO: renamed from: g */
    public boolean f14472g;

    /* JADX INFO: renamed from: h */
    public volatile InterfaceC2804q0 f14473h;

    public C2870v1(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2738l1());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f14468c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f14469d = new C1356a(this);
        this.f14470e = new ArrayList();
        try {
            if (C8573r0.m16757s1(context, C1843i4.m5627a(context)) != null) {
                boolean z10 = false;
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C2870v1.class.getClassLoader());
                    z10 = true;
                } catch (ClassNotFoundException unused) {
                }
                if (!z10) {
                    this.f14472g = true;
                    Log.w(this.f14466a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        m8300b(new C2640e1(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f14466a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C2857u1(this));
        }
    }

    /* JADX INFO: renamed from: c */
    public static C2870v1 m8298c(Context context, Bundle bundle) {
        C6272i.m12915i(context);
        if (f14465i == null) {
            synchronized (C2870v1.class) {
                if (f14465i == null) {
                    f14465i = new C2870v1(context, bundle);
                }
            }
        }
        return f14465i;
    }

    /* JADX INFO: renamed from: a */
    public final void m8299a(Exception exc, boolean z10, boolean z11) {
        this.f14472g |= z10;
        String str = this.f14466a;
        if (z10) {
            Log.w(str, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            m8300b(new C2724k1(this, exc));
        }
        Log.w(str, "Error with data collection. Data lost.", exc);
    }

    /* JADX INFO: renamed from: b */
    public final void m8300b(AbstractRunnableC2792p1 abstractRunnableC2792p1) {
        this.f14468c.execute(abstractRunnableC2792p1);
    }
}
