package p000;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class f90 {

    /* JADX INFO: renamed from: y */
    public static final Feature[] f38639y = new Feature[0];

    /* JADX INFO: renamed from: b */
    public mc0 f38641b;

    /* JADX INFO: renamed from: c */
    public final Context f38642c;

    /* JADX INFO: renamed from: d */
    public final obd f38643d;

    /* JADX INFO: renamed from: e */
    public final po3 f38644e;

    /* JADX INFO: renamed from: f */
    public final gob f38645f;

    /* JADX INFO: renamed from: i */
    public mfb f38648i;

    /* JADX INFO: renamed from: j */
    public e90 f38649j;

    /* JADX INFO: renamed from: k */
    public IInterface f38650k;

    /* JADX INFO: renamed from: m */
    public k0c f38652m;

    /* JADX INFO: renamed from: o */
    public final c90 f38654o;

    /* JADX INFO: renamed from: p */
    public final d90 f38655p;

    /* JADX INFO: renamed from: q */
    public final int f38656q;

    /* JADX INFO: renamed from: r */
    public final String f38657r;

    /* JADX INFO: renamed from: s */
    public volatile String f38658s;

    /* JADX INFO: renamed from: t */
    public volatile m58 f38659t;

    /* JADX INFO: renamed from: a */
    public volatile String f38640a = null;

    /* JADX INFO: renamed from: g */
    public final Object f38646g = new Object();

    /* JADX INFO: renamed from: h */
    public final Object f38647h = new Object();

    /* JADX INFO: renamed from: l */
    public final ArrayList f38651l = new ArrayList();

    /* JADX INFO: renamed from: n */
    public int f38653n = 1;

    /* JADX INFO: renamed from: u */
    public ConnectionResult f38660u = null;

    /* JADX INFO: renamed from: v */
    public boolean f38661v = false;

    /* JADX INFO: renamed from: w */
    public volatile zzj f38662w = null;

    /* JADX INFO: renamed from: x */
    public final AtomicInteger f38663x = new AtomicInteger(0);

    public f90(Context context, Looper looper, obd obdVar, po3 po3Var, int i, c90 c90Var, d90 d90Var, String str) {
        lda.m16131q(context, "Context must not be null");
        this.f38642c = context;
        lda.m16131q(looper, "Looper must not be null");
        lda.m16131q(obdVar, "Supervisor must not be null");
        this.f38643d = obdVar;
        lda.m16131q(po3Var, "API availability must not be null");
        this.f38644e = po3Var;
        this.f38645f = new gob(this, looper);
        this.f38656q = i;
        this.f38654o = c90Var;
        this.f38655p = d90Var;
        this.f38657r = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m11607a() {
        int iM19432c = this.f38644e.m19432c(this.f38642c, mo3404i());
        if (iM19432c == 0) {
            this.f38649j = new ck6(this);
            m11616u(2, null);
            return;
        }
        m11616u(1, null);
        this.f38649j = new ck6(this);
        int i = this.f38663x.get();
        gob gobVar = this.f38645f;
        gobVar.sendMessage(gobVar.obtainMessage(3, i, iM19432c, null));
    }

    /* JADX INFO: renamed from: b */
    public abstract IInterface mo3402b(IBinder iBinder);

    /* JADX INFO: renamed from: c */
    public final void m11608c() {
        this.f38663x.incrementAndGet();
        ArrayList arrayList = this.f38651l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ifb) arrayList.get(i)).m13880e();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f38647h) {
            this.f38648i = null;
        }
        m11616u(1, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m11609d(String str) {
        this.f38640a = str;
        m11608c();
    }

    /* JADX INFO: renamed from: e */
    public Account mo4916e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public Feature[] mo3671f() {
        return f38639y;
    }

    /* JADX INFO: renamed from: g */
    public Executor mo4917g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public Bundle mo3403h() {
        return new Bundle();
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo3404i();

    /* JADX INFO: renamed from: j */
    public final void m11610j(lx3 lx3Var, Set set) {
        AttributionSource attributionSource;
        Bundle bundleMo3403h = mo3403h();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.f38659t == null || (attributionSource = (AttributionSource) this.f38659t.f50618b) == null || attributionSource.getAttributionTag() == null) ? this.f38658s : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i = this.f38656q;
        int i2 = po3.f56583a;
        Scope[] scopeArr = GetServiceRequest.f11696J;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f11697K;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f11703d = this.f38642c.getPackageName();
        getServiceRequest.f11706g = bundleMo3403h;
        if (set != null) {
            getServiceRequest.f11705f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (mo3407r()) {
            Account accountMo4916e = mo4916e();
            if (accountMo4916e == null) {
                accountMo4916e = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.f11707h = accountMo4916e;
            if (lx3Var != null) {
                getServiceRequest.f11704e = lx3Var.asBinder();
            }
        }
        getServiceRequest.f11708i = f38639y;
        getServiceRequest.f11709j = mo3671f();
        if (mo11614s()) {
            getServiceRequest.f11698H = true;
        }
        try {
            try {
                synchronized (this.f38647h) {
                    try {
                        mfb mfbVar = this.f38648i;
                        if (mfbVar != null) {
                            mfbVar.m16805F(new ewb(this, this.f38663x.get()), getServiceRequest);
                        } else {
                            Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (RemoteException | RuntimeException e) {
                Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
                int i3 = this.f38663x.get();
                e4c e4cVar = new e4c(this, 8, null, null);
                gob gobVar = this.f38645f;
                gobVar.sendMessage(gobVar.obtainMessage(1, i3, -1, e4cVar));
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            int i4 = this.f38663x.get();
            gob gobVar2 = this.f38645f;
            gobVar2.sendMessage(gobVar2.obtainMessage(6, i4, 3));
        } catch (SecurityException e3) {
            throw e3;
        }
    }

    /* JADX INFO: renamed from: k */
    public Set mo4918k() {
        return Collections.EMPTY_SET;
    }

    /* JADX INFO: renamed from: l */
    public final IInterface m11611l() {
        IInterface iInterface;
        synchronized (this.f38646g) {
            try {
                if (this.f38653n == 5) {
                    throw new DeadObjectException();
                }
                if (!m11612p()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.f38650k;
                lda.m16131q(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    /* JADX INFO: renamed from: m */
    public abstract String mo3405m();

    /* JADX INFO: renamed from: n */
    public abstract String mo3406n();

    /* JADX INFO: renamed from: o */
    public boolean mo3672o() {
        return mo3404i() >= 211700000;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m11612p() {
        boolean z;
        synchronized (this.f38646g) {
            z = this.f38653n == 4;
        }
        return z;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m11613q() {
        boolean z;
        synchronized (this.f38646g) {
            int i = this.f38653n;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: r */
    public boolean mo3407r() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo11614s() {
        return this instanceof ceb;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ boolean m11615t(int i, int i2, IInterface iInterface) {
        synchronized (this.f38646g) {
            try {
                if (this.f38653n != i) {
                    return false;
                }
                m11616u(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m11616u(int i, IInterface iInterface) {
        mc0 mc0Var;
        lda.m16125k((i == 4) == (iInterface != null));
        synchronized (this.f38646g) {
            try {
                this.f38653n = i;
                this.f38650k = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    k0c k0cVar = this.f38652m;
                    if (k0cVar != null) {
                        obd obdVar = this.f38643d;
                        String strM16758b = this.f38641b.m16758b();
                        lda.m16130p(strM16758b);
                        this.f38641b.getClass();
                        if (this.f38657r == null) {
                            this.f38642c.getClass();
                        }
                        obdVar.m17905c(strM16758b, "com.google.android.gms", k0cVar, this.f38641b.m16759c());
                        this.f38652m = null;
                    }
                } else if (i == 2 || i == 3) {
                    k0c k0cVar2 = this.f38652m;
                    if (k0cVar2 != null && (mc0Var = this.f38641b) != null) {
                        String strM16758b2 = mc0Var.m16758b();
                        StringBuilder sb = new StringBuilder(String.valueOf(strM16758b2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(strM16758b2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        obd obdVar2 = this.f38643d;
                        String strM16758b3 = this.f38641b.m16758b();
                        lda.m16130p(strM16758b3);
                        this.f38641b.getClass();
                        if (this.f38657r == null) {
                            this.f38642c.getClass();
                        }
                        obdVar2.m17905c(strM16758b3, "com.google.android.gms", k0cVar2, this.f38641b.m16759c());
                        this.f38663x.incrementAndGet();
                    }
                    k0c k0cVar3 = new k0c(this, this.f38663x.get());
                    this.f38652m = k0cVar3;
                    mc0 mc0Var2 = new mc0(mo3406n(), 3, mo3672o());
                    this.f38641b = mc0Var2;
                    if (mc0Var2.m16759c() && mo3404i() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f38641b.m16758b())));
                    }
                    obd obdVar3 = this.f38643d;
                    String strM16758b4 = this.f38641b.m16758b();
                    lda.m16130p(strM16758b4);
                    this.f38641b.getClass();
                    String name = this.f38657r;
                    if (name == null) {
                        name = this.f38642c.getClass().getName();
                    }
                    ConnectionResult connectionResultM17904b = obdVar3.m17904b(new n3d(strM16758b4, "com.google.android.gms", this.f38641b.m16759c()), k0cVar3, name, mo4917g());
                    if (!(connectionResultM17904b.f11637b == 0)) {
                        String strM16758b5 = this.f38641b.m16758b();
                        this.f38641b.getClass();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strM16758b5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(strM16758b5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i2 = connectionResultM17904b.f11637b;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (connectionResultM17904b.f11638c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", connectionResultM17904b.f11638c);
                        }
                        int i3 = this.f38663x.get();
                        h9c h9cVar = new h9c(this, i2, bundle);
                        gob gobVar = this.f38645f;
                        gobVar.sendMessage(gobVar.obtainMessage(7, i3, -1, h9cVar));
                    }
                } else if (i == 4) {
                    lda.m16130p(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
