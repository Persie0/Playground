package lb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p176ib.C6272i;
import p176ib.InterfaceC6256b1;
import p295ob.C8032b;

/* JADX INFO: renamed from: lb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7297a {

    /* JADX INFO: renamed from: b */
    public static final Object f40906b = new Object();

    /* JADX INFO: renamed from: c */
    public static volatile C7297a f40907c;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f40908a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static C7297a m14688b() {
        if (f40907c == null) {
            synchronized (f40906b) {
                if (f40907c == null) {
                    f40907c = new C7297a();
                }
            }
        }
        C7297a c7297a = f40907c;
        C6272i.m12915i(c7297a);
        return c7297a;
    }

    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: a */
    public final boolean m14689a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return m14691d(context, context.getClass().getName(), intent, serviceConnection, i10, null);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m14690c(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof InterfaceC6256b1)) {
            ConcurrentHashMap concurrentHashMap = this.f40908a;
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

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m14691d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C8032b.m15902a(context).m15899a(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        boolean z10 = true;
        if (!(!(serviceConnection instanceof InterfaceC6256b1))) {
            return (!(Build.VERSION.SDK_INT >= 29) || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
        }
        ConcurrentHashMap concurrentHashMap = this.f40908a;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            if (Build.VERSION.SDK_INT < 29) {
                z10 = false;
            }
            boolean zBindService = (!z10 || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th2) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th2;
        }
    }
}
