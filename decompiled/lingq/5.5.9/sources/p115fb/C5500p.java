package p115fb;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p136gc.C5761q;
import p276nb.ThreadFactoryC7736a;

/* JADX INFO: renamed from: fb.p */
/* JADX INFO: loaded from: classes.dex */
public final class C5500p {

    /* JADX INFO: renamed from: e */
    public static C5500p f34106e;

    /* JADX INFO: renamed from: a */
    public final Context f34107a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f34108b;

    /* JADX INFO: renamed from: c */
    public ServiceConnectionC5495k f34109c = new ServiceConnectionC5495k(this);

    /* JADX INFO: renamed from: d */
    public int f34110d = 1;

    public C5500p(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f34108b = scheduledExecutorService;
        this.f34107a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C5500p m11726a(Context context) {
        if (f34106e == null) {
            f34106e = new C5500p(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC7736a("MessengerIpcClient"))));
        }
        return f34106e;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized C5761q m11727b(AbstractC5498n abstractC5498n) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(abstractC5498n);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 9);
                sb2.append("Queueing ");
                sb2.append(strValueOf);
                Log.d("MessengerIpcClient", sb2.toString());
            }
            if (!this.f34109c.m11721d(abstractC5498n)) {
                ServiceConnectionC5495k serviceConnectionC5495k = new ServiceConnectionC5495k(this);
                this.f34109c = serviceConnectionC5495k;
                serviceConnectionC5495k.m11721d(abstractC5498n);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return abstractC5498n.f34103b.f34812a;
    }
}
