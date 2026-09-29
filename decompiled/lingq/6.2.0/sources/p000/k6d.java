package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class k6d implements ServiceConnection, fed {

    /* JADX INFO: renamed from: a */
    public final HashMap f46790a = new HashMap();

    /* JADX INFO: renamed from: b */
    public int f46791b = 2;

    /* JADX INFO: renamed from: c */
    public boolean f46792c;

    /* JADX INFO: renamed from: d */
    public IBinder f46793d;

    /* JADX INFO: renamed from: e */
    public final n3d f46794e;

    /* JADX INFO: renamed from: f */
    public ComponentName f46795f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ obd f46796g;

    public k6d(obd obdVar, n3d n3dVar) {
        this.f46796g = obdVar;
        this.f46794e = n3dVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m14920a() {
        n3d n3dVar = this.f46794e;
        obd obdVar = this.f46796g;
        obdVar.f54152c.removeMessages(1, n3dVar);
        obdVar.f54153d.m16232c(obdVar.f54151b, this);
        this.f46792c = false;
        this.f46791b = 2;
    }

    /* JADX INFO: renamed from: b */
    public final void m14921b(k0c k0cVar, k0c k0cVar2) {
        this.f46790a.put(k0cVar, k0cVar2);
    }

    /* JADX INFO: renamed from: c */
    public final void m14922c(ServiceConnection serviceConnection) {
        this.f46790a.remove(serviceConnection);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m14923d() {
        return this.f46792c;
    }

    /* JADX INFO: renamed from: e */
    public final int m14924e() {
        return this.f46791b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m14925f(ServiceConnection serviceConnection) {
        return this.f46790a.containsKey(serviceConnection);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m14926g() {
        return this.f46790a.isEmpty();
    }

    /* JADX INFO: renamed from: h */
    public final IBinder m14927h() {
        return this.f46793d;
    }

    /* JADX INFO: renamed from: i */
    public final ComponentName m14928i() {
        return this.f46795f;
    }

    /* JADX INFO: renamed from: j */
    public final ConnectionResult m14929j(String str, Executor executor) {
        try {
            Intent intentM4817a = ckb.m4817a(this.f46796g.f54151b, this.f46794e);
            this.f46791b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(vrb.m23530a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                obd obdVar = this.f46796g;
                li1 li1Var = obdVar.f54153d;
                Context context = obdVar.f54151b;
                n3d n3dVar = this.f46794e;
                boolean zM16233d = li1Var.m16233d(context, str, intentM4817a, this, 4225, executor);
                this.f46792c = zM16233d;
                if (zM16233d) {
                    obdVar.f54152c.sendMessageDelayed(obdVar.f54152c.obtainMessage(1, n3dVar), obdVar.f54155f);
                    return ConnectionResult.f11635f;
                }
                this.f46791b = 2;
                try {
                    obdVar.f54153d.m16232c(obdVar.f54151b, this);
                } catch (IllegalArgumentException unused) {
                }
                return new ConnectionResult(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (zzaf e) {
            return e.f11742a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        obd obdVar = this.f46796g;
        synchronized (obdVar.f54150a) {
            try {
                obdVar.f54152c.removeMessages(1, this.f46794e);
                this.f46793d = iBinder;
                this.f46795f = componentName;
                Iterator it = this.f46790a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f46791b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        obd obdVar = this.f46796g;
        synchronized (obdVar.f54150a) {
            try {
                obdVar.f54152c.removeMessages(1, this.f46794e);
                this.f46793d = null;
                this.f46795f = componentName;
                Iterator it = this.f46790a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f46791b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
