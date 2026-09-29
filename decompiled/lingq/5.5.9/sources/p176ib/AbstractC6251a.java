package p176ib;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C2549d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.InterfaceC2556b;
import com.google.android.gms.common.internal.zzk;
import gb.C5737a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p070db.C5127g;
import p152hb.C6005r0;
import p152hb.RunnableC6002q0;
import sb.C8987a;

/* JADX INFO: renamed from: ib.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6251a<T extends IInterface> {

    /* JADX INFO: renamed from: X */
    public static final Feature[] f36399X = new Feature[0];

    /* JADX INFO: renamed from: I */
    public InterfaceC6266f f36401I;

    /* JADX INFO: renamed from: J */
    public c f36402J;

    /* JADX INFO: renamed from: K */
    public IInterface f36403K;

    /* JADX INFO: renamed from: M */
    public ServiceConnectionC6291r0 f36405M;

    /* JADX INFO: renamed from: O */
    public final a f36407O;

    /* JADX INFO: renamed from: P */
    public final b f36408P;

    /* JADX INFO: renamed from: Q */
    public final int f36409Q;

    /* JADX INFO: renamed from: R */
    public final String f36410R;

    /* JADX INFO: renamed from: S */
    public volatile String f36411S;

    /* JADX INFO: renamed from: a */
    public int f36416a;

    /* JADX INFO: renamed from: b */
    public long f36417b;

    /* JADX INFO: renamed from: c */
    public long f36418c;

    /* JADX INFO: renamed from: d */
    public int f36419d;

    /* JADX INFO: renamed from: e */
    public long f36420e;

    /* JADX INFO: renamed from: g */
    public C6259c1 f36422g;

    /* JADX INFO: renamed from: h */
    public final Context f36423h;

    /* JADX INFO: renamed from: i */
    public final AbstractC6260d f36424i;

    /* JADX INFO: renamed from: j */
    public final C2549d f36425j;

    /* JADX INFO: renamed from: k */
    public final HandlerC6285o0 f36426k;

    /* JADX INFO: renamed from: f */
    public volatile String f36421f = null;

    /* JADX INFO: renamed from: l */
    public final Object f36427l = new Object();

    /* JADX INFO: renamed from: H */
    public final Object f36400H = new Object();

    /* JADX INFO: renamed from: L */
    public final ArrayList f36404L = new ArrayList();

    /* JADX INFO: renamed from: N */
    public int f36406N = 1;

    /* JADX INFO: renamed from: T */
    public ConnectionResult f36412T = null;

    /* JADX INFO: renamed from: U */
    public boolean f36413U = false;

    /* JADX INFO: renamed from: V */
    public volatile zzk f36414V = null;

    /* JADX INFO: renamed from: W */
    public final AtomicInteger f36415W = new AtomicInteger(0);

    /* JADX INFO: renamed from: ib.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo5741a();

        /* JADX INFO: renamed from: h */
        void mo5742h(int i10);
    }

    /* JADX INFO: renamed from: ib.a$b */
    public interface b {
        /* JADX INFO: renamed from: j */
        void mo5743j(ConnectionResult connectionResult);
    }

    /* JADX INFO: renamed from: ib.a$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo12467a(ConnectionResult connectionResult);
    }

    /* JADX INFO: renamed from: ib.a$d */
    public class d implements c {
        public d() {
        }

        @Override // p176ib.AbstractC6251a.c
        /* JADX INFO: renamed from: a */
        public final void mo12467a(ConnectionResult connectionResult) {
            boolean zM7529C = connectionResult.m7529C();
            AbstractC6251a abstractC6251a = AbstractC6251a.this;
            if (zM7529C) {
                abstractC6251a.m12878e(null, abstractC6251a.mo12870B());
                return;
            }
            b bVar = abstractC6251a.f36408P;
            if (bVar != null) {
                bVar.mo5743j(connectionResult);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public AbstractC6251a(Context context, Looper looper, C6253a1 c6253a1, C2549d c2549d, int i10, a aVar, b bVar, String str) {
        if (context == null) {
            throw new NullPointerException("Context must not be null");
        }
        this.f36423h = context;
        if (looper == null) {
            throw new NullPointerException("Looper must not be null");
        }
        if (c6253a1 == null) {
            throw new NullPointerException("Supervisor must not be null");
        }
        this.f36424i = c6253a1;
        C6272i.m12916j(c2549d, "API availability must not be null");
        this.f36425j = c2549d;
        this.f36426k = new HandlerC6285o0(this, looper);
        this.f36409Q = i10;
        this.f36407O = aVar;
        this.f36408P = bVar;
        this.f36410R = str;
    }

    /* JADX INFO: renamed from: H */
    public static /* bridge */ /* synthetic */ boolean m12869H(AbstractC6251a abstractC6251a, int i10, int i11, IInterface iInterface) {
        synchronized (abstractC6251a.f36427l) {
            if (abstractC6251a.f36406N != i10) {
                return false;
            }
            abstractC6251a.m12874I(i11, iInterface);
            return true;
        }
    }

    /* JADX INFO: renamed from: A */
    public Bundle mo11557A() {
        return new Bundle();
    }

    /* JADX INFO: renamed from: B */
    public Set<Scope> mo12870B() {
        return Collections.emptySet();
    }

    /* JADX INFO: renamed from: C */
    public final T m12871C() throws DeadObjectException {
        T t10;
        synchronized (this.f36427l) {
            try {
                if (this.f36406N == 5) {
                    throw new DeadObjectException();
                }
                if (!m12875a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                t10 = (T) this.f36403K;
                C6272i.m12916j(t10, "Client is connected but service is null");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    /* JADX INFO: renamed from: D */
    public abstract String mo5606D();

    /* JADX INFO: renamed from: E */
    public abstract String mo5607E();

    /* JADX INFO: renamed from: F */
    public boolean mo12872F() {
        return mo5608m() >= 211700000;
    }

    /* JADX INFO: renamed from: G */
    public final void m12873G(ConnectionResult connectionResult) {
        this.f36419d = connectionResult.f13857b;
        this.f36420e = System.currentTimeMillis();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: I */
    public final void m12874I(int i10, IInterface iInterface) {
        C6259c1 c6259c1;
        C6272i.m12908b((i10 == 4) == (iInterface != null));
        synchronized (this.f36427l) {
            try {
                this.f36406N = i10;
                this.f36403K = iInterface;
                if (i10 == 1) {
                    ServiceConnectionC6291r0 serviceConnectionC6291r0 = this.f36405M;
                    if (serviceConnectionC6291r0 != null) {
                        AbstractC6260d abstractC6260d = this.f36424i;
                        String str = (String) this.f36422g.f36455b;
                        C6272i.m12915i(str);
                        String str2 = (String) this.f36422g.f36456c;
                        if (this.f36410R == null) {
                            this.f36423h.getClass();
                        }
                        abstractC6260d.m12897b(str, str2, serviceConnectionC6291r0, this.f36422g.f36454a);
                        this.f36405M = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    ServiceConnectionC6291r0 serviceConnectionC6291r1 = this.f36405M;
                    if (serviceConnectionC6291r1 != null && (c6259c1 = this.f36422g) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) c6259c1.f36455b) + " on " + ((String) c6259c1.f36456c));
                        AbstractC6260d abstractC6260d2 = this.f36424i;
                        String str3 = (String) this.f36422g.f36455b;
                        C6272i.m12915i(str3);
                        String str4 = (String) this.f36422g.f36456c;
                        if (this.f36410R == null) {
                            this.f36423h.getClass();
                        }
                        abstractC6260d2.m12897b(str3, str4, serviceConnectionC6291r1, this.f36422g.f36454a);
                        this.f36415W.incrementAndGet();
                    }
                    ServiceConnectionC6291r0 serviceConnectionC6291r2 = new ServiceConnectionC6291r0(this, this.f36415W.get());
                    this.f36405M = serviceConnectionC6291r2;
                    C6259c1 c6259c2 = new C6259c1(mo5607E(), mo12872F());
                    this.f36422g = c6259c2;
                    if (c6259c2.f36454a && mo5608m() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f36422g.f36455b)));
                    }
                    AbstractC6260d abstractC6260d3 = this.f36424i;
                    String str5 = (String) this.f36422g.f36455b;
                    C6272i.m12915i(str5);
                    String str6 = (String) this.f36422g.f36456c;
                    String name = this.f36410R;
                    if (name == null) {
                        name = this.f36423h.getClass().getName();
                    }
                    boolean z10 = this.f36422g.f36454a;
                    mo12891z();
                    if (!abstractC6260d3.mo12892c(new C6303x0(str5, str6, z10), serviceConnectionC6291r2, name, null)) {
                        C6259c1 c6259c3 = this.f36422g;
                        Log.w("GmsClient", "unable to connect to service: " + ((String) c6259c3.f36455b) + " on " + ((String) c6259c3.f36456c));
                        int i11 = this.f36415W.get();
                        C6295t0 c6295t0 = new C6295t0(this, 16);
                        HandlerC6285o0 handlerC6285o0 = this.f36426k;
                        handlerC6285o0.sendMessage(handlerC6285o0.obtainMessage(7, i11, -1, c6295t0));
                    }
                } else if (i10 == 4) {
                    C6272i.m12915i(iInterface);
                    this.f36418c = System.currentTimeMillis();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m12875a() {
        boolean z10;
        synchronized (this.f36427l) {
            z10 = this.f36406N == 4;
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m12876b(c cVar) {
        if (cVar == null) {
            throw new NullPointerException("Connection progress callbacks cannot be null.");
        }
        this.f36402J = cVar;
        m12874I(2, null);
    }

    /* JADX INFO: renamed from: c */
    public boolean m12877c() {
        return this instanceof C5127g;
    }

    /* JADX INFO: renamed from: e */
    public final void m12878e(InterfaceC2556b interfaceC2556b, Set<Scope> set) {
        Bundle bundleMo11557A = mo11557A();
        int i10 = this.f36409Q;
        String str = this.f36411S;
        int i11 = C2549d.f13921a;
        Scope[] scopeArr = GetServiceRequest.f13937J;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f13938K;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i10, i11, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f13944d = this.f36423h.getPackageName();
        getServiceRequest.f13947g = bundleMo11557A;
        if (set != null) {
            getServiceRequest.f13946f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (mo7553s()) {
            Account accountMo12889x = mo12889x();
            if (accountMo12889x == null) {
                accountMo12889x = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.f13948h = accountMo12889x;
            if (interfaceC2556b != null) {
                getServiceRequest.f13945e = interfaceC2556b.asBinder();
            }
        }
        getServiceRequest.f13949i = f36399X;
        getServiceRequest.f13950j = mo12890y();
        if (this instanceof C8987a) {
            getServiceRequest.f13939H = true;
        }
        try {
            synchronized (this.f36400H) {
                InterfaceC6266f interfaceC6266f = this.f36401I;
                if (interfaceC6266f != null) {
                    interfaceC6266f.mo12900V0(new BinderC6289q0(this, this.f36415W.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            HandlerC6285o0 handlerC6285o0 = this.f36426k;
            handlerC6285o0.sendMessage(handlerC6285o0.obtainMessage(6, this.f36415W.get(), 3));
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i12 = this.f36415W.get();
            C6293s0 c6293s0 = new C6293s0(this, 8, null, null);
            HandlerC6285o0 handlerC6285o1 = this.f36426k;
            handlerC6285o1.sendMessage(handlerC6285o1.obtainMessage(1, i12, -1, c6293s0));
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i13 = this.f36415W.get();
            C6293s0 c6293s1 = new C6293s0(this, 8, null, null);
            HandlerC6285o0 handlerC6285o2 = this.f36426k;
            handlerC6285o2.sendMessage(handlerC6285o2.obtainMessage(1, i13, -1, c6293s1));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12879f(String str) {
        this.f36421f = str;
        m12882i();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m12880g() {
        boolean z10;
        synchronized (this.f36427l) {
            int i10 = this.f36406N;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: h */
    public final String m12881h() {
        C6259c1 c6259c1;
        if (!m12875a() || (c6259c1 = this.f36422g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return (String) c6259c1.f36456c;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: i */
    public final void m12882i() {
        this.f36415W.incrementAndGet();
        synchronized (this.f36404L) {
            try {
                int size = this.f36404L.size();
                for (int i10 = 0; i10 < size; i10++) {
                    AbstractC6287p0 abstractC6287p0 = (AbstractC6287p0) this.f36404L.get(i10);
                    synchronized (abstractC6287p0) {
                        try {
                            abstractC6287p0.f36483a = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                this.f36404L.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (this.f36400H) {
            try {
                this.f36401I = null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        m12874I(1, null);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final void m12883j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        InterfaceC6266f interfaceC6266f;
        synchronized (this.f36427l) {
            try {
                i10 = this.f36406N;
                iInterface = this.f36403K;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f36400H) {
            try {
                interfaceC6266f = this.f36401I;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) mo5606D()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC6266f == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC6266f.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f36418c > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f36418c;
            printWriterAppend.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.f36417b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f36416a;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.f36417b;
            printWriterAppend2.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.f36420e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) C5737a.m12093a(this.f36419d));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j12 = this.f36420e;
            printWriterAppend3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m12884k() {
        return true;
    }

    /* JADX INFO: renamed from: m */
    public int mo5608m() {
        return C2549d.f13921a;
    }

    /* JADX INFO: renamed from: n */
    public final Feature[] m12885n() {
        zzk zzkVar = this.f36414V;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f13985b;
    }

    /* JADX INFO: renamed from: p */
    public final String m12886p() {
        return this.f36421f;
    }

    /* JADX INFO: renamed from: q */
    public final void m12887q(C6005r0 c6005r0) {
        c6005r0.f35579a.f35592l.f35440I.post(new RunnableC6002q0(c6005r0));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: r */
    public Intent mo7552r() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* JADX INFO: renamed from: s */
    public boolean mo7553s() {
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final void m12888v() {
        int iMo7586c = this.f36425j.mo7586c(this.f36423h, mo5608m());
        if (iMo7586c == 0) {
            m12876b(new d());
            return;
        }
        m12874I(1, null);
        this.f36402J = new d();
        int i10 = this.f36415W.get();
        HandlerC6285o0 handlerC6285o0 = this.f36426k;
        handlerC6285o0.sendMessage(handlerC6285o0.obtainMessage(3, i10, iMo7586c, null));
    }

    /* JADX INFO: renamed from: w */
    public abstract T mo5609w(IBinder iBinder);

    /* JADX INFO: renamed from: x */
    public Account mo12889x() {
        return null;
    }

    /* JADX INFO: renamed from: y */
    public Feature[] mo12890y() {
        return f36399X;
    }

    /* JADX INFO: renamed from: z */
    public void mo12891z() {
    }
}
