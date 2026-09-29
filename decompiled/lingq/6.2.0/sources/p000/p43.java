package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class p43 extends BroadcastReceiver {

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f55550b = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final Context f55551a;

    public p43(Context context) {
        this.f55551a = context;
    }

    /* JADX INFO: renamed from: a */
    public static void m18882a(Context context) {
        AtomicReference atomicReference = f55550b;
        if (atomicReference.get() == null) {
            p43 p43Var = new p43(context);
            while (!atomicReference.compareAndSet(null, p43Var)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(p43Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (q43.f57250k) {
            try {
                Iterator it = ((C3161jv) q43.f57251l.values()).iterator();
                while (it.hasNext()) {
                    ((q43) it.next()).m19647e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f55551a.unregisterReceiver(this);
    }
}
