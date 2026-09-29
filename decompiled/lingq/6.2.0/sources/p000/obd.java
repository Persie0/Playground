package p000;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class obd {

    /* JADX INFO: renamed from: g */
    public static final Object f54147g = new Object();

    /* JADX INFO: renamed from: h */
    public static obd f54148h;

    /* JADX INFO: renamed from: i */
    public static HandlerThread f54149i;

    /* JADX INFO: renamed from: a */
    public final HashMap f54150a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Context f54151b;

    /* JADX INFO: renamed from: c */
    public volatile wdb f54152c;

    /* JADX INFO: renamed from: d */
    public final li1 f54153d;

    /* JADX INFO: renamed from: e */
    public final long f54154e;

    /* JADX INFO: renamed from: f */
    public final long f54155f;

    public obd(Context context, Looper looper) {
        y8d y8dVar = new y8d(this);
        this.f54151b = context.getApplicationContext();
        wdb wdbVar = new wdb(looper, y8dVar);
        Looper.getMainLooper();
        this.f54152c = wdbVar;
        this.f54153d = li1.m16230b();
        this.f54154e = 5000L;
        this.f54155f = 300000L;
    }

    /* JADX INFO: renamed from: a */
    public static obd m17903a(Context context) {
        synchronized (f54147g) {
            try {
                if (f54148h == null) {
                    f54148h = new obd(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f54148h;
    }

    /* JADX INFO: renamed from: b */
    public final ConnectionResult m17904b(n3d n3dVar, k0c k0cVar, String str, Executor executor) {
        ConnectionResult connectionResultM14929j;
        HashMap map = this.f54150a;
        synchronized (map) {
            try {
                k6d k6dVar = (k6d) map.get(n3dVar);
                if (executor == null) {
                    executor = null;
                }
                if (k6dVar == null) {
                    k6dVar = new k6d(this, n3dVar);
                    k6dVar.m14921b(k0cVar, k0cVar);
                    connectionResultM14929j = k6dVar.m14929j(str, executor);
                    map.put(n3dVar, k6dVar);
                } else {
                    this.f54152c.removeMessages(0, n3dVar);
                    if (k6dVar.m14925f(k0cVar)) {
                        String string = n3dVar.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    k6dVar.m14921b(k0cVar, k0cVar);
                    int iM14924e = k6dVar.m14924e();
                    if (iM14924e == 1) {
                        k0cVar.onServiceConnected(k6dVar.m14928i(), k6dVar.m14927h());
                    } else if (iM14924e == 2) {
                        connectionResultM14929j = k6dVar.m14929j(str, executor);
                    }
                    connectionResultM14929j = null;
                }
                if (k6dVar.m14923d()) {
                    return ConnectionResult.f11635f;
                }
                if (connectionResultM14929j == null) {
                    connectionResultM14929j = new ConnectionResult(-1, null, null);
                }
                return connectionResultM14929j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m17905c(String str, String str2, ServiceConnection serviceConnection, boolean z) {
        n3d n3dVar = new n3d(str, str2, z);
        lda.m16131q(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f54150a;
        synchronized (map) {
            try {
                k6d k6dVar = (k6d) map.get(n3dVar);
                if (k6dVar == null) {
                    String string = n3dVar.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!k6dVar.m14925f(serviceConnection)) {
                    String string2 = n3dVar.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                k6dVar.m14922c(serviceConnection);
                if (k6dVar.m14926g()) {
                    this.f54152c.sendMessageDelayed(this.f54152c.obtainMessage(0, n3dVar), this.f54154e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
