package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.StrictMode;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class jhk implements ServiceConnection, jhm {

    /* JADX INFO: renamed from: a */
    public final Map f34075a = new HashMap();

    /* JADX INFO: renamed from: b */
    public int f34076b = 2;

    /* JADX INFO: renamed from: c */
    public boolean f34077c;

    /* JADX INFO: renamed from: d */
    public IBinder f34078d;

    /* JADX INFO: renamed from: e */
    public final jhi f34079e;

    /* JADX INFO: renamed from: f */
    public ComponentName f34080f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ jhj f34081g;

    public jhk(jhj jhjVar, jhi jhiVar) {
        this.f34081g = jhjVar;
        this.f34079e = jhiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13183a(ServiceConnection serviceConnection) {
        return this.f34075a.containsKey(serviceConnection);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13184b() {
        return this.f34075a.isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public final void m13185c(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.f34075a.put(serviceConnection, serviceConnection2);
    }

    /* JADX INFO: renamed from: d */
    public final void m13186d(String str) {
        Bundle bundleCall;
        this.f34076b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        try {
            jhj jhjVar = this.f34081g;
            jir jirVar = jhjVar.f34071f;
            Context context = jhjVar.f34069d;
            jhi jhiVar = this.f34079e;
            Intent intent = null;
            if (jhiVar.f34063e) {
                Bundle bundle = new Bundle();
                bundle.putString("serviceActionBundleKey", jhiVar.f34060b);
                try {
                    bundleCall = context.getContentResolver().call(jhi.f34059a, "serviceIntentCall", (String) null, bundle);
                } catch (IllegalArgumentException e) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    bundleCall = null;
                }
                if (bundleCall != null) {
                    intent = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(jhiVar.f34060b));
                }
            }
            if (intent == null) {
                intent = new Intent(jhiVar.f34060b).setPackage(jhiVar.f34061c);
            }
            boolean zM13232c = jirVar.m13232c(context, str, intent, this, 4225);
            this.f34077c = zM13232c;
            if (zM13232c) {
                this.f34081g.f34070e.sendMessageDelayed(this.f34081g.f34070e.obtainMessage(1, this.f34079e), this.f34081g.f34072g);
            } else {
                this.f34076b = 2;
                try {
                    jhj jhjVar2 = this.f34081g;
                    jhjVar2.f34071f.m13231b(jhjVar2.f34069d, this);
                } catch (IllegalArgumentException e2) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f34081g.f34068c) {
            this.f34081g.f34070e.removeMessages(1, this.f34079e);
            this.f34078d = iBinder;
            this.f34080f = componentName;
            Iterator it = this.f34075a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f34076b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f34081g.f34068c) {
            this.f34081g.f34070e.removeMessages(1, this.f34079e);
            this.f34078d = null;
            this.f34080f = componentName;
            Iterator it = this.f34075a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f34076b = 2;
        }
    }
}
