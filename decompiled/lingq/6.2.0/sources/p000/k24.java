package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class k24 implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        componentName.getClass();
        iBinder.getClass();
        AtomicBoolean atomicBoolean = m24.f50449a;
        Context contextM21766a = sy2.m21766a();
        w24 w24Var = w24.f66276a;
        Object objM23684i = null;
        if (!lp1.f49971a.contains(w24.class)) {
            try {
                objM23684i = w24.f66276a.m23684i(contextM21766a, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
            } catch (Throwable th) {
                lp1.m16420a(w24.class, th);
            }
        }
        m24.f50455g = objM23684i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
    }
}
