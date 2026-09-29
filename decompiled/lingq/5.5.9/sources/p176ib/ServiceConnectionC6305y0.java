package p176ib;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import lb.C7297a;

/* JADX INFO: renamed from: ib.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC6305y0 implements ServiceConnection, InterfaceC6256b1 {

    /* JADX INFO: renamed from: a */
    public final HashMap f36515a = new HashMap();

    /* JADX INFO: renamed from: b */
    public int f36516b = 2;

    /* JADX INFO: renamed from: c */
    public boolean f36517c;

    /* JADX INFO: renamed from: d */
    public IBinder f36518d;

    /* JADX INFO: renamed from: e */
    public final C6303x0 f36519e;

    /* JADX INFO: renamed from: f */
    public ComponentName f36520f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C6253a1 f36521g;

    public ServiceConnectionC6305y0(C6253a1 c6253a1, C6303x0 c6303x0) {
        this.f36521g = c6253a1;
        this.f36519e = c6303x0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m12935a(String str, Executor executor) {
        this.f36516b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            C6253a1 c6253a1 = this.f36521g;
            C7297a c7297a = c6253a1.f36435g;
            Context context = c6253a1.f36433e;
            boolean zM14691d = c7297a.m14691d(context, str, this.f36519e.m12933a(context), this, 4225, executor);
            this.f36517c = zM14691d;
            if (zM14691d) {
                this.f36521g.f36434f.sendMessageDelayed(this.f36521g.f36434f.obtainMessage(1, this.f36519e), this.f36521g.f36437i);
            } else {
                this.f36516b = 2;
                try {
                    C6253a1 c6253a2 = this.f36521g;
                    c6253a2.f36435g.m14690c(c6253a2.f36433e, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f36521g.f36432d) {
            this.f36521g.f36434f.removeMessages(1, this.f36519e);
            this.f36518d = iBinder;
            this.f36520f = componentName;
            Iterator it = this.f36515a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f36516b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f36521g.f36432d) {
            this.f36521g.f36434f.removeMessages(1, this.f36519e);
            this.f36518d = null;
            this.f36520f = componentName;
            Iterator it = this.f36515a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f36516b = 2;
        }
    }
}
