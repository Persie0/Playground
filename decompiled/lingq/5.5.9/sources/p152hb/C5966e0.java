package p152hb;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C2549d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.internal.AbstractC2546a;
import com.google.android.gms.common.internal.InterfaceC2556b;
import gb.InterfaceC5740d;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import p071dc.C5142a;
import p071dc.InterfaceC5147f;
import p115fb.RunnableC5493i;
import p176ib.C6254b;
import p176ib.C6272i;

/* JADX INFO: renamed from: hb.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5966e0 implements InterfaceC5981j0 {

    /* JADX INFO: renamed from: a */
    public final C5990m0 f35463a;

    /* JADX INFO: renamed from: b */
    public final Lock f35464b;

    /* JADX INFO: renamed from: c */
    public final Context f35465c;

    /* JADX INFO: renamed from: d */
    public final C2549d f35466d;

    /* JADX INFO: renamed from: e */
    public ConnectionResult f35467e;

    /* JADX INFO: renamed from: f */
    public int f35468f;

    /* JADX INFO: renamed from: h */
    public int f35470h;

    /* JADX INFO: renamed from: k */
    public InterfaceC5147f f35473k;

    /* JADX INFO: renamed from: l */
    public boolean f35474l;

    /* JADX INFO: renamed from: m */
    public boolean f35475m;

    /* JADX INFO: renamed from: n */
    public boolean f35476n;

    /* JADX INFO: renamed from: o */
    public InterfaceC2556b f35477o;

    /* JADX INFO: renamed from: p */
    public boolean f35478p;

    /* JADX INFO: renamed from: q */
    public boolean f35479q;

    /* JADX INFO: renamed from: r */
    public final C6254b f35480r;

    /* JADX INFO: renamed from: s */
    public final Map<C2542a<?>, Boolean> f35481s;

    /* JADX INFO: renamed from: t */
    public final C2542a.a<? extends InterfaceC5147f, C5142a> f35482t;

    /* JADX INFO: renamed from: g */
    public int f35469g = 0;

    /* JADX INFO: renamed from: i */
    public final Bundle f35471i = new Bundle();

    /* JADX INFO: renamed from: j */
    public final HashSet f35472j = new HashSet();

    /* JADX INFO: renamed from: u */
    public final ArrayList<Future<?>> f35483u = new ArrayList<>();

    public C5966e0(C5990m0 c5990m0, C6254b c6254b, Map<C2542a<?>, Boolean> map, C2549d c2549d, C2542a.a<? extends InterfaceC5147f, C5142a> aVar, Lock lock, Context context) {
        this.f35463a = c5990m0;
        this.f35480r = c6254b;
        this.f35481s = map;
        this.f35466d = c2549d;
        this.f35482t = aVar;
        this.f35464b = lock;
        this.f35465c = context;
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: a */
    public final void mo12407a(Bundle bundle) {
        if (m12420n(1)) {
            if (bundle != null) {
                this.f35471i.putAll(bundle);
            }
            if (m12421o()) {
                m12416j();
            }
        }
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: b */
    public final void mo12408b() {
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: c */
    public final void mo12409c(ConnectionResult connectionResult, C2542a<?> c2542a, boolean z10) {
        if (m12420n(1)) {
            m12418l(connectionResult, c2542a, z10);
            if (m12421o()) {
                m12416j();
            }
        }
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: d */
    public final void mo12410d(int i10) {
        m12417k(new ConnectionResult(8, null));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.common.api.a$e, dc.f] */
    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: e */
    public final void mo12411e() {
        Map<C2542a.b<?>, C2542a.e> map;
        C5990m0 c5990m0 = this.f35463a;
        c5990m0.f35536g.clear();
        this.f35475m = false;
        this.f35467e = null;
        this.f35469g = 0;
        this.f35474l = true;
        this.f35476n = false;
        this.f35478p = false;
        HashMap map2 = new HashMap();
        Map<C2542a<?>, Boolean> map3 = this.f35481s;
        Iterator<C2542a<?>> it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = c5990m0.f35535f;
            if (!zHasNext) {
                break;
            }
            C2542a<?> next = it.next();
            C2542a.e eVar = map.get(next.f13885b);
            C6272i.m12915i(eVar);
            C2542a.e eVar2 = eVar;
            next.f13884a.getClass();
            boolean zBooleanValue = map3.get(next).booleanValue();
            if (eVar2.mo7553s()) {
                this.f35475m = true;
                if (zBooleanValue) {
                    this.f35472j.add(next.f13885b);
                } else {
                    this.f35474l = false;
                }
            }
            map2.put(eVar2, new C6016v(this, next, zBooleanValue));
        }
        if (this.f35475m) {
            C6254b c6254b = this.f35480r;
            C6272i.m12915i(c6254b);
            C6272i.m12915i(this.f35482t);
            C5978i0 c5978i0 = c5990m0.f35542m;
            c6254b.f36446h = Integer.valueOf(System.identityHashCode(c5978i0));
            C5958c0 c5958c0 = new C5958c0(this);
            this.f35473k = this.f35482t.mo4928b(this.f35465c, c5978i0.f35513g, c6254b, c6254b.f36445g, c5958c0, c5958c0);
        }
        this.f35470h = map.size();
        this.f35483u.add(C5993n0.f35561a.submit(new C6025y(this, map2)));
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: f */
    public final boolean mo12412f() {
        ArrayList<Future<?>> arrayList = this.f35483u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).cancel(true);
        }
        arrayList.clear();
        m12415i(true);
        this.f35463a.m12440i();
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: g */
    public final <A, T extends AbstractC2546a<? extends InterfaceC5740d, A>> T mo12413g(T t10) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* JADX INFO: renamed from: h */
    public final void m12414h() {
        this.f35475m = false;
        C5990m0 c5990m0 = this.f35463a;
        c5990m0.f35542m.f35500K = Collections.emptySet();
        while (true) {
            for (C2542a.b bVar : this.f35472j) {
                HashMap map = c5990m0.f35536g;
                if (!map.containsKey(bVar)) {
                    map.put(bVar, new ConnectionResult(17, null));
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m12415i(boolean z10) {
        InterfaceC5147f interfaceC5147f = this.f35473k;
        if (interfaceC5147f != null) {
            if (interfaceC5147f.mo7537a() && z10) {
                interfaceC5147f.mo10918l();
            }
            interfaceC5147f.mo7545i();
            C6272i.m12915i(this.f35480r);
            this.f35477o = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m12416j() {
        C5990m0 c5990m0 = this.f35463a;
        c5990m0.f35530a.lock();
        try {
            c5990m0.f35542m.m12431o();
            c5990m0.f35540k = new C6013u(c5990m0);
            c5990m0.f35540k.mo12411e();
            c5990m0.f35531b.signalAll();
            c5990m0.f35530a.unlock();
            C5993n0.f35561a.execute(new RunnableC5493i(1, this));
            InterfaceC5147f interfaceC5147f = this.f35473k;
            if (interfaceC5147f != null) {
                if (this.f35478p) {
                    InterfaceC2556b interfaceC2556b = this.f35477o;
                    C6272i.m12915i(interfaceC2556b);
                    interfaceC5147f.mo10919o(interfaceC2556b, this.f35479q);
                }
                m12415i(false);
            }
            Iterator it = this.f35463a.f35536g.keySet().iterator();
            while (it.hasNext()) {
                C2542a.e eVar = this.f35463a.f35535f.get((C2542a.b) it.next());
                C6272i.m12915i(eVar);
                eVar.mo7545i();
            }
            this.f35463a.f35543n.mo12424b(this.f35471i.isEmpty() ? null : this.f35471i);
        } catch (Throwable th2) {
            c5990m0.f35530a.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m12417k(ConnectionResult connectionResult) {
        ArrayList<Future<?>> arrayList = this.f35483u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).cancel(true);
        }
        arrayList.clear();
        m12415i(!connectionResult.m7530q());
        C5990m0 c5990m0 = this.f35463a;
        c5990m0.m12440i();
        c5990m0.f35543n.mo12426i(connectionResult);
    }

    /* JADX INFO: renamed from: l */
    public final void m12418l(ConnectionResult connectionResult, C2542a<?> c2542a, boolean z10) {
        c2542a.f13884a.getClass();
        if (!z10 || connectionResult.m7530q() || this.f35466d.mo7585a(null, connectionResult.f13857b, null) != null) {
            if (this.f35467e == null || Integer.MAX_VALUE < this.f35468f) {
                this.f35467e = connectionResult;
                this.f35468f = Integer.MAX_VALUE;
            }
        }
        this.f35463a.f35536g.put(c2542a.f13885b, connectionResult);
    }

    /* JADX INFO: renamed from: m */
    public final void m12419m() {
        if (this.f35470h != 0) {
            return;
        }
        if (!this.f35475m || this.f35476n) {
            ArrayList arrayList = new ArrayList();
            this.f35469g = 1;
            C5990m0 c5990m0 = this.f35463a;
            this.f35470h = c5990m0.f35535f.size();
            Map<C2542a.b<?>, C2542a.e> map = c5990m0.f35535f;
            for (C2542a.b<?> bVar : map.keySet()) {
                if (!c5990m0.f35536g.containsKey(bVar)) {
                    arrayList.add(map.get(bVar));
                } else if (m12421o()) {
                    m12416j();
                }
            }
            if (!arrayList.isEmpty()) {
                this.f35483u.add(C5993n0.f35561a.submit(new C6028z(this, arrayList)));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m12420n(int i10) {
        if (this.f35469g == i10) {
            return true;
        }
        C5978i0 c5978i0 = this.f35463a.f35542m;
        c5978i0.getClass();
        StringWriter stringWriter = new StringWriter();
        c5978i0.mo7557e("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i11 = this.f35470h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i11);
        Log.w("GACConnecting", sb2.toString());
        String str = this.f35469g != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        String str2 = i10 == 0 ? "STEP_SERVICE_BINDINGS_AND_SIGN_IN" : "STEP_GETTING_REMOTE_SERVICE";
        StringBuilder sb3 = new StringBuilder(str2.length() + str.length() + 70);
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(str);
        sb3.append(" but received callback for step ");
        sb3.append(str2);
        Log.e("GACConnecting", sb3.toString(), new Exception());
        m12417k(new ConnectionResult(8, null));
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m12421o() {
        int i10 = this.f35470h - 1;
        this.f35470h = i10;
        if (i10 > 0) {
            return false;
        }
        C5990m0 c5990m0 = this.f35463a;
        if (i10 >= 0) {
            ConnectionResult connectionResult = this.f35467e;
            if (connectionResult == null) {
                return true;
            }
            c5990m0.f35541l = this.f35468f;
            m12417k(connectionResult);
            return false;
        }
        C5978i0 c5978i0 = c5990m0.f35542m;
        c5978i0.getClass();
        StringWriter stringWriter = new StringWriter();
        c5978i0.mo7557e("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        m12417k(new ConnectionResult(8, null));
        return false;
    }
}
