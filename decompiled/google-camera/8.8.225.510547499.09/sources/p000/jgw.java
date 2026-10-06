package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class jgw {

    /* JADX INFO: renamed from: a */
    private static final jcw[] f33984a = new jcw[0];

    /* JADX INFO: renamed from: b */
    jho f33985b;

    /* JADX INFO: renamed from: c */
    public final Context f33986c;

    /* JADX INFO: renamed from: d */
    final Handler f33987d;

    /* JADX INFO: renamed from: g */
    protected jgr f33990g;

    /* JADX INFO: renamed from: j */
    public final int f33993j;

    /* JADX INFO: renamed from: k */
    public volatile String f33994k;

    /* JADX INFO: renamed from: p */
    public jhu f33999p;

    /* JADX INFO: renamed from: q */
    public final AmbientMode.AmbientController f34000q;

    /* JADX INFO: renamed from: r */
    public final AmbientMode.AmbientController f34001r;

    /* JADX INFO: renamed from: t */
    private final jhj f34003t;

    /* JADX INFO: renamed from: u */
    private IInterface f34004u;

    /* JADX INFO: renamed from: v */
    private jgs f34005v;

    /* JADX INFO: renamed from: w */
    private final String f34006w;

    /* JADX INFO: renamed from: s */
    private volatile String f34002s = null;

    /* JADX INFO: renamed from: e */
    public final Object f33988e = new Object();

    /* JADX INFO: renamed from: f */
    public final Object f33989f = new Object();

    /* JADX INFO: renamed from: h */
    public final ArrayList f33991h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public int f33992i = 1;

    /* JADX INFO: renamed from: l */
    public jcu f33995l = null;

    /* JADX INFO: renamed from: m */
    public boolean f33996m = false;

    /* JADX INFO: renamed from: n */
    public volatile jhb f33997n = null;

    /* JADX INFO: renamed from: o */
    protected final AtomicInteger f33998o = new AtomicInteger(0);

    protected jgw(Context context, Looper looper, jhj jhjVar, jcz jczVar, int i, AmbientMode.AmbientController ambientController, AmbientMode.AmbientController ambientController2, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        jib.m13206k(context, "Context must not be null");
        this.f33986c = context;
        jib.m13206k(looper, "Looper must not be null");
        jib.m13206k(jhjVar, "Supervisor must not be null");
        this.f34003t = jhjVar;
        jib.m13206k(jczVar, "API availability must not be null");
        this.f33987d = new jgp(this, looper);
        this.f33993j = i;
        this.f34001r = ambientController;
        this.f34000q = ambientController2;
        this.f34006w = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final void m13151K(int i, IInterface iInterface) {
        boolean z;
        jho jhoVar;
        jib.m13196a((i == 4) == (iInterface != null));
        synchronized (this.f33988e) {
            this.f33992i = i;
            this.f34004u = iInterface;
            switch (i) {
                case 1:
                    jgs jgsVar = this.f34005v;
                    if (jgsVar != null) {
                        jhj jhjVar = this.f34003t;
                        jho jhoVar2 = this.f33985b;
                        Object obj = jhoVar2.f34087c;
                        Object obj2 = jhoVar2.f34088d;
                        int i2 = jhoVar2.f34085a;
                        m13170v();
                        jhjVar.m13182a((String) obj, (String) obj2, jgsVar, this.f33985b.f34086b);
                        this.f34005v = null;
                    }
                    break;
                case 2:
                case 3:
                    jgs jgsVar2 = this.f34005v;
                    if (jgsVar2 != null && (jhoVar = this.f33985b) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) jhoVar.f34087c) + hsSUWRJfoeC.lXooYkotoeWKgH + ((String) jhoVar.f34088d));
                        jhj jhjVar2 = this.f34003t;
                        jho jhoVar3 = this.f33985b;
                        Object obj3 = jhoVar3.f34087c;
                        Object obj4 = jhoVar3.f34088d;
                        int i3 = jhoVar3.f34085a;
                        m13170v();
                        jhjVar2.m13182a((String) obj3, (String) obj4, jgsVar2, this.f33985b.f34086b);
                        this.f33998o.incrementAndGet();
                    }
                    jgs jgsVar3 = new jgs(this, this.f33998o.get());
                    this.f34005v = jgsVar3;
                    jho jhoVar4 = new jho(mo13171w(), mo12836d(), mo13152A());
                    this.f33985b = jhoVar4;
                    if (jhoVar4.f34086b && mo12833a() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat((String) jhoVar4.f34087c));
                    }
                    jhj jhjVar3 = this.f34003t;
                    Object obj5 = jhoVar4.f34087c;
                    Object obj6 = jhoVar4.f34088d;
                    int i4 = jhoVar4.f34085a;
                    String strM13170v = m13170v();
                    boolean z2 = this.f33985b.f34086b;
                    mo13156F();
                    jhi jhiVar = new jhi((String) obj5, (String) obj6, z2);
                    synchronized (jhjVar3.f34068c) {
                        jhk jhkVar = (jhk) jhjVar3.f34068c.get(jhiVar);
                        if (jhkVar == null) {
                            jhkVar = new jhk(jhjVar3, jhiVar);
                            jhkVar.m13185c(jgsVar3, jgsVar3);
                            jhkVar.m13186d(strM13170v);
                            jhjVar3.f34068c.put(jhiVar, jhkVar);
                        } else {
                            jhjVar3.f34070e.removeMessages(0, jhiVar);
                            if (!jhkVar.m13183a(jgsVar3)) {
                                jhkVar.m13185c(jgsVar3, jgsVar3);
                                switch (jhkVar.f34076b) {
                                    case 1:
                                        jgsVar3.onServiceConnected(jhkVar.f34080f, jhkVar.f34078d);
                                        break;
                                    case 2:
                                        jhkVar.m13186d(strM13170v);
                                        break;
                                }
                            } else {
                                throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + jhiVar.f34060b);
                            }
                        }
                        z = jhkVar.f34077c;
                    }
                    if (!z) {
                        jho jhoVar5 = this.f33985b;
                        Log.w("GmsClient", "unable to connect to service: " + ((String) jhoVar5.f34087c) + " on " + ((String) jhoVar5.f34088d));
                        m13158H(16, this.f33998o.get());
                    }
                    break;
                case 4:
                    jib.m13205j(iInterface);
                    System.currentTimeMillis();
                    break;
                default:
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    protected boolean mo13152A() {
        return false;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m13153B() {
        return this.f33997n != null;
    }

    /* JADX INFO: renamed from: C */
    public boolean mo13154C() {
        return false;
    }

    /* JADX INFO: renamed from: D */
    public jcw[] mo13155D() {
        throw null;
    }

    /* JADX INFO: renamed from: F */
    protected void mo13156F() {
        throw null;
    }

    /* JADX INFO: renamed from: G */
    protected void mo13157G() {
        System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: H */
    protected final void m13158H(int i, int i2) {
        Handler handler = this.f33987d;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new jgv(this, i)));
    }

    /* JADX INFO: renamed from: a */
    public int mo12833a() {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    protected abstract IInterface mo12834b(IBinder iBinder);

    /* JADX INFO: renamed from: c */
    protected abstract String mo12835c();

    /* JADX INFO: renamed from: d */
    protected abstract String mo12836d();

    /* JADX INFO: renamed from: e */
    public jcw[] mo12893e() {
        return f33984a;
    }

    /* JADX INFO: renamed from: f */
    public final String m13159f() {
        jho jhoVar;
        if (!m13162l() || (jhoVar = this.f33985b) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return (String) jhoVar.f34088d;
    }

    /* JADX INFO: renamed from: g */
    public final String m13160g() {
        return this.f34002s;
    }

    /* JADX INFO: renamed from: i */
    public void mo12941i(jgr jgrVar) {
        jib.m13206k(jgrVar, "Connection progress callbacks cannot be null.");
        this.f33990g = jgrVar;
        m13151K(2, null);
    }

    /* JADX INFO: renamed from: j */
    public void mo12942j() {
        this.f33998o.incrementAndGet();
        synchronized (this.f33991h) {
            int size = this.f33991h.size();
            for (int i = 0; i < size; i++) {
                ((jgq) this.f33991h.get(i)).m13148e();
            }
            this.f33991h.clear();
        }
        synchronized (this.f33989f) {
            this.f33999p = null;
        }
        m13151K(1, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m13161k(String str) {
        this.f34002s = str;
        mo12942j();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m13162l() {
        boolean z;
        synchronized (this.f33988e) {
            z = this.f33992i == 4;
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m13163m() {
        boolean z;
        synchronized (this.f33988e) {
            int i = this.f33992i;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo12946n() {
        return true;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo12947o() {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final jcw[] m13164p() {
        jhb jhbVar = this.f33997n;
        if (jhbVar == null) {
            return null;
        }
        return jhbVar.f34026b;
    }

    /* JADX INFO: renamed from: q */
    public final void m13165q(jhp jhpVar, Set set) {
        Bundle bundleMo13168t = mo13168t();
        int i = this.f33993j;
        String str = this.f33994k;
        int i2 = jcz.f33769c;
        Scope[] scopeArr = jhg.f34040a;
        Bundle bundle = new Bundle();
        jcw[] jcwVarArr = jhg.f34041b;
        jhg jhgVar = new jhg(6, i, i2, null, null, scopeArr, bundle, null, jcwVarArr, jcwVarArr, true, 0, false, str);
        jhgVar.f34045f = this.f33986c.getPackageName();
        jhgVar.f34048i = bundleMo13168t;
        if (set != null) {
            jhgVar.f34047h = (Scope[]) set.toArray(new Scope[0]);
        }
        if (mo12947o()) {
            Account accountMo13167s = mo13167s();
            if (accountMo13167s == null) {
                accountMo13167s = new Account("<<default account>>", "com.google");
            }
            jhgVar.f34049j = accountMo13167s;
            if (jhpVar != null) {
                jhgVar.f34046g = jhpVar.f4962a;
            }
        }
        jhgVar.f34050k = mo13155D();
        jhgVar.f34051l = mo12893e();
        if (mo13154C()) {
            jhgVar.f34054o = true;
        }
        try {
            synchronized (this.f33989f) {
                jhu jhuVar = this.f33999p;
                if (jhuVar != null) {
                    jht jhtVar = new jht(this, this.f33998o.get());
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        parcelObtain.writeStrongBinder(jhtVar);
                        parcelObtain.writeInt(1);
                        jbt.m12849a(jhgVar, parcelObtain, 0);
                        jhuVar.f34092a.transact(46, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (Throwable th) {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.f33987d;
            handler.sendMessage(handler.obtainMessage(6, this.f33998o.get(), 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo13172x(8, null, null, this.f33998o.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo13172x(8, null, null, this.f33998o.get());
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m13166r(AmbientMode.AmbientController ambientController) {
        ((jfj) ambientController.f1697a).f33879k.f33903n.post(new ith(ambientController, 14, null, null, null, null));
    }

    /* JADX INFO: renamed from: s */
    public Account mo13167s() {
        throw null;
    }

    /* JADX INFO: renamed from: t */
    protected Bundle mo13168t() {
        return new Bundle();
    }

    /* JADX INFO: renamed from: u */
    public final IInterface m13169u() {
        IInterface iInterface;
        synchronized (this.f33988e) {
            if (this.f33992i == 5) {
                throw new DeadObjectException();
            }
            if (!m13162l()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            iInterface = this.f34004u;
            jib.m13206k(iInterface, "Client is connected but service is null");
        }
        return iInterface;
    }

    /* JADX INFO: renamed from: v */
    protected final String m13170v() {
        String str = this.f34006w;
        return str == null ? this.f33986c.getClass().getName() : str;
    }

    /* JADX INFO: renamed from: w */
    protected String mo13171w() {
        return "com.google.android.gms";
    }

    /* JADX INFO: renamed from: x */
    protected void mo13172x(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f33987d;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new jgu(this, i, iBinder, bundle)));
    }

    /* JADX INFO: renamed from: y */
    protected final void m13173y(jgr jgrVar, int i, PendingIntent pendingIntent) {
        this.f33990g = jgrVar;
        Handler handler = this.f33987d;
        handler.sendMessage(handler.obtainMessage(3, this.f33998o.get(), i, pendingIntent));
    }

    /* JADX INFO: renamed from: z */
    public final boolean m13174z(int i, int i2, IInterface iInterface) {
        synchronized (this.f33988e) {
            if (this.f33992i != i) {
                return false;
            }
            m13151K(i2, iInterface);
            return true;
        }
    }
}
