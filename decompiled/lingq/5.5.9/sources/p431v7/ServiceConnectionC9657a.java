package p431v7;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import dm.C5207g;
import p173i8.C6205a;
import p291o7.C8004n;

/* JADX INFO: renamed from: v7.a */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC9657a implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C5207g.m11111f(componentName, "name");
        C5207g.m11111f(iBinder, "service");
        C9659c c9659c = C9659c.f49447a;
        C9663g c9663g = C9663g.f49486a;
        Context contextM15871a = C8004n.m15871a();
        Object objM18139h = null;
        if (!C6205a.m12742b(C9663g.class)) {
            try {
                objM18139h = C9663g.f49486a.m18139h(contextM15871a, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
            } catch (Throwable th2) {
                C6205a.m12741a(C9663g.class, th2);
            }
        }
        C9659c.f49455i = objM18139h;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C5207g.m11111f(componentName, "name");
    }
}
