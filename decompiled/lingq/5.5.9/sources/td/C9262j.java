package td;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import dm.C5212l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p081e0.C5298b1;
import p290o6.C7967l0;
import p457wd.C9902c;
import p457wd.C9904e;
import p457wd.C9907h;
import p457wd.C9910k;

/* JADX INFO: renamed from: td.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9262j {

    /* JADX INFO: renamed from: o */
    public static final HashMap f47951o = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f47952a;

    /* JADX INFO: renamed from: b */
    public final C7967l0 f47953b;

    /* JADX INFO: renamed from: c */
    public final String f47954c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f47955d;

    /* JADX INFO: renamed from: e */
    public final HashSet f47956e;

    /* JADX INFO: renamed from: f */
    public final Object f47957f;

    /* JADX INFO: renamed from: g */
    public boolean f47958g;

    /* JADX INFO: renamed from: h */
    public final Intent f47959h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC9258f f47960i;

    /* JADX INFO: renamed from: j */
    public final WeakReference f47961j;

    /* JADX INFO: renamed from: k */
    public final C9252b f47962k;

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f47963l;

    /* JADX INFO: renamed from: m */
    public ServiceConnectionC9261i f47964m;

    /* JADX INFO: renamed from: n */
    public IInterface f47965n;

    /* JADX WARN: Type inference failed for: r1v3, types: [td.b] */
    public C9262j(Context context, C7967l0 c7967l0, String str, Intent intent) {
        C5212l c5212l = C5212l.f33281J;
        this.f47955d = new ArrayList();
        this.f47956e = new HashSet();
        this.f47957f = new Object();
        this.f47962k = new IBinder.DeathRecipient() { // from class: td.b
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                C9262j c9262j = this.f47943a;
                c9262j.f47953b.m15814o("reportBinderDeath", new Object[0]);
                InterfaceC9257e interfaceC9257e = (InterfaceC9257e) c9262j.f47961j.get();
                C7967l0 c7967l1 = c9262j.f47953b;
                if (interfaceC9257e != null) {
                    c7967l1.m15814o("calling onBinderDied", new Object[0]);
                    interfaceC9257e.zza();
                } else {
                    String str2 = c9262j.f47954c;
                    c7967l1.m15814o("%s : Binder has died.", str2);
                    ArrayList<AbstractRunnableC9250a> arrayList = c9262j.f47955d;
                    for (AbstractRunnableC9250a abstractRunnableC9250a : arrayList) {
                        RemoteException remoteException = new RemoteException(String.valueOf(str2).concat(" : Binder has died."));
                        C9907h c9907h = abstractRunnableC9250a.f47942a;
                        if (c9907h != null) {
                            c9907h.m18407a(remoteException);
                        }
                    }
                    arrayList.clear();
                }
                c9262j.m17622d();
            }
        };
        this.f47963l = new AtomicInteger(0);
        this.f47952a = context;
        this.f47953b = c7967l0;
        this.f47954c = str;
        this.f47959h = intent;
        this.f47960i = c5212l;
        this.f47961j = new WeakReference(null);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final Handler m17619a() {
        Handler handler;
        HashMap map = f47951o;
        synchronized (map) {
            if (!map.containsKey(this.f47954c)) {
                HandlerThread handlerThread = new HandlerThread(this.f47954c, 10);
                handlerThread.start();
                map.put(this.f47954c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f47954c);
        }
        return handler;
    }

    /* JADX INFO: renamed from: b */
    public final void m17620b(AbstractRunnableC9250a abstractRunnableC9250a, C9907h c9907h) {
        synchronized (this.f47957f) {
            this.f47956e.add(c9907h);
            C9910k c9910k = c9907h.f50541a;
            C5298b1 c5298b1 = new C5298b1(this, c9907h);
            c9910k.getClass();
            c9910k.f50544b.m12894b(new C9904e(C9902c.f50532a, c5298b1));
            c9910k.m18409b();
        }
        synchronized (this.f47957f) {
            try {
                if (this.f47963l.getAndIncrement() > 0) {
                    this.f47953b.m15811l("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m17619a().post(new C9254c(this, abstractRunnableC9250a.f47942a, abstractRunnableC9250a));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m17621c(C9907h c9907h) {
        synchronized (this.f47957f) {
            try {
                this.f47956e.remove(c9907h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f47957f) {
            try {
                if (this.f47963l.get() > 0 && this.f47963l.decrementAndGet() > 0) {
                    this.f47953b.m15814o("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    m17619a().post(new C9256d(this));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m17622d() {
        synchronized (this.f47957f) {
            Iterator it = this.f47956e.iterator();
            while (it.hasNext()) {
                ((C9907h) it.next()).m18407a(new RemoteException(String.valueOf(this.f47954c).concat(" : Binder has died.")));
            }
            this.f47956e.clear();
        }
    }
}
