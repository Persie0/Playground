package p176ib;

import android.content.Context;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import lb.C7297a;
import p455wb.HandlerC9898d;

/* JADX INFO: renamed from: ib.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C6253a1 extends AbstractC6260d {

    /* JADX INFO: renamed from: d */
    public final HashMap f36432d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final Context f36433e;

    /* JADX INFO: renamed from: f */
    public volatile HandlerC9898d f36434f;

    /* JADX INFO: renamed from: g */
    public final C7297a f36435g;

    /* JADX INFO: renamed from: h */
    public final long f36436h;

    /* JADX INFO: renamed from: i */
    public final long f36437i;

    /* JADX INFO: renamed from: j */
    public volatile Executor f36438j;

    public C6253a1(Context context, Looper looper) {
        C6307z0 c6307z0 = new C6307z0(this);
        this.f36433e = context.getApplicationContext();
        this.f36434f = new HandlerC9898d(looper, c6307z0);
        this.f36435g = C7297a.m14688b();
        this.f36436h = 5000L;
        this.f36437i = 300000L;
        this.f36438j = null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p176ib.AbstractC6260d
    /* JADX INFO: renamed from: c */
    public final boolean mo12892c(C6303x0 c6303x0, ServiceConnectionC6291r0 serviceConnectionC6291r0, String str, Executor executor) {
        boolean z10;
        synchronized (this.f36432d) {
            try {
                ServiceConnectionC6305y0 serviceConnectionC6305y0 = (ServiceConnectionC6305y0) this.f36432d.get(c6303x0);
                if (executor == null) {
                    executor = this.f36438j;
                }
                if (serviceConnectionC6305y0 == null) {
                    serviceConnectionC6305y0 = new ServiceConnectionC6305y0(this, c6303x0);
                    serviceConnectionC6305y0.f36515a.put(serviceConnectionC6291r0, serviceConnectionC6291r0);
                    serviceConnectionC6305y0.m12935a(str, executor);
                    this.f36432d.put(c6303x0, serviceConnectionC6305y0);
                } else {
                    this.f36434f.removeMessages(0, c6303x0);
                    if (serviceConnectionC6305y0.f36515a.containsKey(serviceConnectionC6291r0)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(c6303x0.toString()));
                    }
                    serviceConnectionC6305y0.f36515a.put(serviceConnectionC6291r0, serviceConnectionC6291r0);
                    int i10 = serviceConnectionC6305y0.f36516b;
                    if (i10 == 1) {
                        serviceConnectionC6291r0.onServiceConnected(serviceConnectionC6305y0.f36520f, serviceConnectionC6305y0.f36518d);
                    } else if (i10 == 2) {
                        serviceConnectionC6305y0.m12935a(str, executor);
                    }
                }
                z10 = serviceConnectionC6305y0.f36517c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }
}
