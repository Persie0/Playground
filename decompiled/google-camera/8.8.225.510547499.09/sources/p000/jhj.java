package p000;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jhj {

    /* JADX INFO: renamed from: a */
    public static final Object f34065a = new Object();

    /* JADX INFO: renamed from: b */
    public static HandlerThread f34066b;

    /* JADX INFO: renamed from: h */
    public static jhj f34067h;

    /* JADX INFO: renamed from: c */
    public final HashMap f34068c;

    /* JADX INFO: renamed from: d */
    public final Context f34069d;

    /* JADX INFO: renamed from: e */
    public volatile Handler f34070e;

    /* JADX INFO: renamed from: f */
    public final jir f34071f;

    /* JADX INFO: renamed from: g */
    public final long f34072g;

    /* JADX INFO: renamed from: i */
    private final jhl f34073i;

    /* JADX INFO: renamed from: j */
    private final long f34074j;

    public jhj() {
    }

    /* JADX INFO: renamed from: a */
    public final void m13182a(String str, String str2, ServiceConnection serviceConnection, boolean z) {
        jhi jhiVar = new jhi(str, str2, z);
        synchronized (this.f34068c) {
            jhk jhkVar = (jhk) this.f34068c.get(jhiVar);
            if (jhkVar == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + jhiVar.f34060b);
            }
            if (!jhkVar.m13183a(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + jhiVar.f34060b);
            }
            jhkVar.f34075a.remove(serviceConnection);
            if (jhkVar.m13184b()) {
                this.f34070e.sendMessageDelayed(this.f34070e.obtainMessage(0, jhiVar), this.f34074j);
            }
        }
    }

    public jhj(Context context, Looper looper) {
        this.f34068c = new HashMap();
        jhl jhlVar = new jhl(this, 0);
        this.f34073i = jhlVar;
        this.f34069d = context.getApplicationContext();
        this.f34070e = new jmx(looper, jhlVar);
        this.f34071f = jir.m13228a();
        this.f34074j = 5000L;
        this.f34072g = 300000L;
    }
}
