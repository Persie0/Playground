package p176ib;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: renamed from: ib.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6307z0 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6253a1 f36522a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f36522a.f36432d) {
                try {
                    C6303x0 c6303x0 = (C6303x0) message.obj;
                    ServiceConnectionC6305y0 serviceConnectionC6305y0 = (ServiceConnectionC6305y0) this.f36522a.f36432d.get(c6303x0);
                    if (serviceConnectionC6305y0 != null && serviceConnectionC6305y0.f36515a.isEmpty()) {
                        if (serviceConnectionC6305y0.f36517c) {
                            serviceConnectionC6305y0.f36521g.f36434f.removeMessages(1, serviceConnectionC6305y0.f36519e);
                            C6253a1 c6253a1 = serviceConnectionC6305y0.f36521g;
                            c6253a1.f36435g.m14690c(c6253a1.f36433e, serviceConnectionC6305y0);
                            serviceConnectionC6305y0.f36517c = false;
                            serviceConnectionC6305y0.f36516b = 2;
                        }
                        this.f36522a.f36432d.remove(c6303x0);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f36522a.f36432d) {
            C6303x0 c6303x1 = (C6303x0) message.obj;
            ServiceConnectionC6305y0 serviceConnectionC6305y1 = (ServiceConnectionC6305y0) this.f36522a.f36432d.get(c6303x1);
            if (serviceConnectionC6305y1 != null && serviceConnectionC6305y1.f36516b == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(c6303x1)), new Exception());
                ComponentName componentName = serviceConnectionC6305y1.f36520f;
                if (componentName == null) {
                    c6303x1.getClass();
                    componentName = null;
                }
                if (componentName == null) {
                    String str = c6303x1.f36513b;
                    C6272i.m12915i(str);
                    componentName = new ComponentName(str, "unknown");
                }
                serviceConnectionC6305y1.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
