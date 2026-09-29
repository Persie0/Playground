package p176ib;

import android.content.Context;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ib.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6260d {

    /* JADX INFO: renamed from: a */
    public static final Object f36457a = new Object();

    /* JADX INFO: renamed from: b */
    public static C6253a1 f36458b;

    /* JADX INFO: renamed from: c */
    public static HandlerThread f36459c;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C6253a1 m12896a(Context context) {
        synchronized (f36457a) {
            try {
                if (f36458b == null) {
                    f36458b = new C6253a1(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f36458b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m12897b(String str, String str2, ServiceConnectionC6291r0 serviceConnectionC6291r0, boolean z10) {
        C6303x0 c6303x0 = new C6303x0(str, str2, z10);
        C6253a1 c6253a1 = (C6253a1) this;
        synchronized (c6253a1.f36432d) {
            ServiceConnectionC6305y0 serviceConnectionC6305y0 = (ServiceConnectionC6305y0) c6253a1.f36432d.get(c6303x0);
            if (serviceConnectionC6305y0 == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: ".concat(c6303x0.toString()));
            }
            if (!serviceConnectionC6305y0.f36515a.containsKey(serviceConnectionC6291r0)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(c6303x0.toString()));
            }
            serviceConnectionC6305y0.f36515a.remove(serviceConnectionC6291r0);
            if (serviceConnectionC6305y0.f36515a.isEmpty()) {
                c6253a1.f36434f.sendMessageDelayed(c6253a1.f36434f.obtainMessage(0, c6303x0), c6253a1.f36436h);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo12892c(C6303x0 c6303x0, ServiceConnectionC6291r0 serviceConnectionC6291r0, String str, Executor executor);
}
