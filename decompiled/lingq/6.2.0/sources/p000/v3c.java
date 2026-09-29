package p000;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.crypto.tink.shaded.protobuf.C1143r;
import com.google.protobuf.C1191l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class v3c {

    /* JADX INFO: renamed from: h */
    public static volatile v3c f64805h;

    /* JADX INFO: renamed from: a */
    public final ExecutorService f64806a;

    /* JADX INFO: renamed from: b */
    public final AppMeasurementSdk f64807b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f64808c;

    /* JADX INFO: renamed from: d */
    public int f64809d;

    /* JADX INFO: renamed from: e */
    public boolean f64810e;

    /* JADX INFO: renamed from: f */
    public volatile eub f64811f;

    /* JADX INFO: renamed from: g */
    public volatile long f64812g;

    public v3c(Context context, Bundle bundle) {
        r82 r82Var = new r82(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), r82Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f64806a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f64807b = new AppMeasurementSdk(this);
        this.f64808c = new ArrayList();
        try {
            if (C1191l.m6879d(context, C1143r.m6659e(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, v3c.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f64810e = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        m23087c(new tyb(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C3600t6(this, 3));
        }
    }

    /* JADX INFO: renamed from: e */
    public static v3c m23084e(Context context, Bundle bundle) {
        lda.m16130p(context);
        if (f64805h == null) {
            synchronized (v3c.class) {
                try {
                    if (f64805h == null) {
                        f64805h = new v3c(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f64805h;
    }

    /* JADX INFO: renamed from: a */
    public final Map m23085a(String str, String str2, boolean z) {
        ptb ptbVar = new ptb();
        m23087c(new dxb(this, str, str2, z, ptbVar));
        Bundle bundleM19478G = ptbVar.m19478G(5000L);
        if (bundleM19478G == null || bundleM19478G.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleM19478G.size());
        for (String str3 : bundleM19478G.keySet()) {
            Object obj = bundleM19478G.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public final int m23086b(String str) {
        ptb ptbVar = new ptb();
        m23087c(new a1c(this, str, ptbVar));
        Integer num = (Integer) ptb.m19477H(ptbVar.m19478G(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m23087c(r2c r2cVar) {
        this.f64806a.execute(r2cVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m23088d(Exception exc, boolean z, boolean z2) {
        this.f64810e |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            m23087c(new lxb(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    /* JADX INFO: renamed from: f */
    public final List m23089f(String str, String str2) {
        ptb ptbVar = new ptb();
        m23087c(new qxb(this, str, str2, ptbVar));
        List list = (List) ptb.m19477H(ptbVar.m19478G(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: g */
    public final long m23090g() {
        ptb ptbVar = new ptb();
        m23087c(new kzb(this, ptbVar, 2));
        Long l = (Long) ptb.m19477H(ptbVar.m19478G(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = this.f64809d + 1;
        this.f64809d = i;
        return jNextLong + ((long) i);
    }
}
