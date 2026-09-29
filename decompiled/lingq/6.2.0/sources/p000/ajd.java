package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ajd {

    /* JADX INFO: renamed from: n */
    public static final HashMap f734n = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f735a;

    /* JADX INFO: renamed from: b */
    public final gp0 f736b;

    /* JADX INFO: renamed from: g */
    public boolean f741g;

    /* JADX INFO: renamed from: h */
    public final Intent f742h;

    /* JADX INFO: renamed from: l */
    public yub f746l;

    /* JADX INFO: renamed from: m */
    public c4c f747m;

    /* JADX INFO: renamed from: d */
    public final ArrayList f738d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HashSet f739e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f740f = new Object();

    /* JADX INFO: renamed from: j */
    public final rrc f744j = new IBinder.DeathRecipient() { // from class: rrc
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            ajd ajdVar = this.f59745a;
            ajdVar.f736b.m12786b("reportBinderDeath", new Object[0]);
            if (ajdVar.f743i.get() != null) {
                ho2.m13383c();
                return;
            }
            ajdVar.f736b.m12786b("%s : Binder has died.", ajdVar.f737c);
            for (enc encVar : ajdVar.f738d) {
                RemoteException remoteException = new RemoteException(String.valueOf(ajdVar.f737c).concat(" : Binder has died."));
                wr9 wr9Var = encVar.f37583a;
                if (wr9Var != null) {
                    wr9Var.m24139c(remoteException);
                }
            }
            ajdVar.f738d.clear();
            synchronized (ajdVar.f740f) {
                ajdVar.m508c();
            }
        }
    };

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f745k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final String f737c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i */
    public final WeakReference f743i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [rrc] */
    public ajd(Context context, gp0 gp0Var, Intent intent) {
        this.f735a = context;
        this.f736b = gp0Var;
        this.f742h = intent;
    }

    /* JADX INFO: renamed from: b */
    public static void m506b(ajd ajdVar, b4c b4cVar) {
        c4c c4cVar = ajdVar.f747m;
        gp0 gp0Var = ajdVar.f736b;
        ArrayList<enc> arrayList = ajdVar.f738d;
        if (c4cVar != null || ajdVar.f741g) {
            if (!ajdVar.f741g) {
                b4cVar.run();
                return;
            } else {
                gp0Var.m12786b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(b4cVar);
                return;
            }
        }
        gp0Var.m12786b("Initiate binding to the service.", new Object[0]);
        arrayList.add(b4cVar);
        yub yubVar = new yub(ajdVar, 1);
        ajdVar.f746l = yubVar;
        ajdVar.f741g = true;
        if (ajdVar.f735a.bindService(ajdVar.f742h, yubVar, 1)) {
            return;
        }
        gp0Var.m12786b("Failed to bind to the service.", new Object[0]);
        ajdVar.f741g = false;
        for (enc encVar : arrayList) {
            zzu zzuVar = new zzu("Failed to bind to the service.");
            wr9 wr9Var = encVar.f37583a;
            if (wr9Var != null) {
                wr9Var.m24139c(zzuVar);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: a */
    public final Handler m507a() {
        Handler handler;
        HashMap map = f734n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f737c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f737c, 10);
                    handlerThread.start();
                    map.put(this.f737c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f737c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: c */
    public final void m508c() {
        HashSet hashSet = this.f739e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((wr9) it.next()).m24139c(new RemoteException(String.valueOf(this.f737c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
