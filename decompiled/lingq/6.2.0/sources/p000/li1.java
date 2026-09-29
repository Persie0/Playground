package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class li1 {

    /* JADX INFO: renamed from: b */
    public static final Object f49693b = new Object();

    /* JADX INFO: renamed from: c */
    public static volatile li1 f49694c;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f49695a;

    public li1(int i) {
        switch (i) {
            case 1:
                this.f49695a = new ConcurrentHashMap();
                break;
            default:
                this.f49695a = new ConcurrentHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public static li1 m16230b() {
        if (f49694c == null) {
            synchronized (f49693b) {
                try {
                    if (f49694c == null) {
                        f49694c = new li1(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        li1 li1Var = f49694c;
        lda.m16130p(li1Var);
        return li1Var;
    }

    /* JADX INFO: renamed from: a */
    public boolean m16231a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m16233d(context, context.getClass().getName(), intent, serviceConnection, i, null);
    }

    /* JADX INFO: renamed from: c */
    public void m16232c(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof fed)) {
            ConcurrentHashMap concurrentHashMap = this.f49695a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m16233d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((m9b.m16702a(context).m23948a(0, packageName).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof fed) {
            if (executor == null) {
                executor = null;
            }
            return executor != null ? context.bindService(intent, i, executor, serviceConnection) : context.bindService(intent, serviceConnection, i);
        }
        ConcurrentHashMap concurrentHashMap = this.f49695a;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = executor != null ? context.bindService(intent, i, executor, serviceConnection) : context.bindService(intent, serviceConnection, i);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }
}
