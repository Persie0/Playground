package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import coil.C0855a;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class lp9 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f49985a;

    /* JADX INFO: renamed from: b */
    public Context f49986b;

    /* JADX INFO: renamed from: c */
    public fk6 f49987c;

    /* JADX INFO: renamed from: d */
    public boolean f49988d;

    /* JADX INFO: renamed from: e */
    public boolean f49989e = true;

    public lp9(C0855a c0855a) {
        this.f49985a = new WeakReference(c0855a);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m16427a() {
        fk6 n58Var;
        try {
            C0855a c0855a = (C0855a) this.f49985a.get();
            if (c0855a == null) {
                m16428b();
            } else if (this.f49987c == null) {
                if (c0855a.f10407d.f68985b) {
                    Context context = c0855a.f10404a;
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                    if (connectivityManager == null || do7.m10532h(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                        n58Var = new n58(7);
                    } else {
                        try {
                            n58Var = new sq5(connectivityManager, this);
                        } catch (Exception unused) {
                            n58Var = new n58(7);
                        }
                    }
                } else {
                    n58Var = new n58(7);
                }
                this.f49987c = n58Var;
                this.f49989e = n58Var.mo11926a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m16428b() {
        try {
            if (this.f49988d) {
                return;
            }
            this.f49988d = true;
            Context context = this.f49986b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            fk6 fk6Var = this.f49987c;
            if (fk6Var != null) {
                fk6Var.shutdown();
            }
            this.f49985a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((C0855a) this.f49985a.get()) == null) {
            m16428b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i) {
        C0855a c0855a = (C0855a) this.f49985a.get();
        if (c0855a != null) {
            m18 m18Var = (m18) c0855a.f10406c.getValue();
            if (m18Var != null) {
                m18Var.f50436a.mo12109n(i);
                C3126ix c3126ix = m18Var.f50437b;
                synchronized (c3126ix) {
                    if (i >= 10 && i != 20) {
                        c3126ix.m14169d();
                    }
                }
            }
        } else {
            m16428b();
        }
    }
}
