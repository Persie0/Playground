package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jir {

    /* JADX INFO: renamed from: b */
    private static final Object f34135b = new Object();

    /* JADX INFO: renamed from: c */
    private static volatile jir f34136c;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f34137a = new ConcurrentHashMap();

    private jir() {
    }

    /* JADX INFO: renamed from: a */
    public static jir m13228a() {
        if (f34136c == null) {
            synchronized (f34135b) {
                if (f34136c == null) {
                    f34136c = new jir();
                }
            }
        }
        jir jirVar = f34136c;
        jib.m13205j(jirVar);
        return jirVar;
    }

    /* JADX INFO: renamed from: d */
    private static void m13229d(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException e) {
        }
    }

    /* JADX INFO: renamed from: e */
    private static boolean m13230e(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof jhm);
    }

    /* JADX INFO: renamed from: b */
    public final void m13231b(Context context, ServiceConnection serviceConnection) {
        if (!m13230e(serviceConnection) || !this.f34137a.containsKey(serviceConnection)) {
            m13229d(context, serviceConnection);
            return;
        }
        try {
            m13229d(context, (ServiceConnection) this.f34137a.get(serviceConnection));
        } finally {
            this.f34137a.remove(serviceConnection);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m13232c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((jiz.m13300b(context).m14247m(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        if (!m13230e(serviceConnection)) {
            return context.bindService(intent, serviceConnection, i);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f34137a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zBindService = context.bindService(intent, serviceConnection, i);
            if (zBindService) {
                return zBindService;
            }
            this.f34137a.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            this.f34137a.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }
}
