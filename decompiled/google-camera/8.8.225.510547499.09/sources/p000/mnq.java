package p000;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mnq {

    /* JADX INFO: renamed from: m */
    private static final Map f41120m = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f41121a;

    /* JADX INFO: renamed from: e */
    public boolean f41125e;

    /* JADX INFO: renamed from: f */
    public final Intent f41126f;

    /* JADX INFO: renamed from: j */
    public ServiceConnection f41130j;

    /* JADX INFO: renamed from: k */
    public IInterface f41131k;

    /* JADX INFO: renamed from: l */
    public final mav f41132l;

    /* JADX INFO: renamed from: b */
    public final List f41122b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final Set f41123c = new HashSet();

    /* JADX INFO: renamed from: d */
    public final Object f41124d = new Object();

    /* JADX INFO: renamed from: h */
    public final IBinder.DeathRecipient f41128h = new IBinder.DeathRecipient() { // from class: mnj
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            mnq mnqVar = this.f41110a;
            mnm mnmVar = (mnm) mnqVar.f41127g.get();
            if (mnmVar != null) {
                mnmVar.m16658a();
            } else {
                Iterator it = mnqVar.f41122b.iterator();
                while (it.hasNext()) {
                    ((mnh) it.next()).m16657b(mnqVar.m16660a());
                }
                mnqVar.f41122b.clear();
            }
            synchronized (mnqVar.f41124d) {
                mnqVar.m16661b();
            }
        }
    };

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f41129i = new AtomicInteger(0);

    /* JADX INFO: renamed from: n */
    private final String f41133n = "AppUpdateService";

    /* JADX INFO: renamed from: g */
    public final WeakReference f41127g = new WeakReference(null);

    public mnq(Context context, mav mavVar, Intent intent, byte[] bArr) {
        this.f41121a = context;
        this.f41132l = mavVar;
        this.f41126f = intent;
    }

    /* JADX INFO: renamed from: a */
    public final RemoteException m16660a() {
        return new RemoteException(String.valueOf(this.f41133n).concat(" : Binder has died."));
    }

    /* JADX INFO: renamed from: b */
    public final void m16661b() {
        Iterator it = this.f41123c.iterator();
        while (it.hasNext()) {
            ((khb) it.next()).m14244j(m16660a());
        }
        this.f41123c.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m16662c(mnh mnhVar) {
        Handler handler;
        Map map = f41120m;
        synchronized (map) {
            if (!map.containsKey(this.f41133n)) {
                HandlerThread handlerThread = new HandlerThread(this.f41133n, 10);
                handlerThread.start();
                map.put(this.f41133n, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f41133n);
        }
        handler.post(mnhVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m16663e(mnh mnhVar, khb khbVar) {
        m16662c(new mnk(this, mnhVar.f41107d, khbVar, mnhVar, null, null));
    }

    /* JADX INFO: renamed from: f */
    public final void m16664f(khb khbVar) {
        synchronized (this.f41124d) {
            this.f41123c.remove(khbVar);
        }
        m16662c(new mnl(this));
    }
}
