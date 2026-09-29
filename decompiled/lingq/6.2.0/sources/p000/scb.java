package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.zzj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class scb implements qo3, ro3 {

    /* JADX INFO: renamed from: g */
    public final co3 f60689g;

    /* JADX INFO: renamed from: h */
    public final C3118io f60690h;

    /* JADX INFO: renamed from: i */
    public final qfa f60691i;

    /* JADX INFO: renamed from: l */
    public final int f60694l;

    /* JADX INFO: renamed from: m */
    public final edb f60695m;

    /* JADX INFO: renamed from: n */
    public boolean f60696n;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ so3 f60700r;

    /* JADX INFO: renamed from: f */
    public final LinkedList f60688f = new LinkedList();

    /* JADX INFO: renamed from: j */
    public final HashSet f60692j = new HashSet();

    /* JADX INFO: renamed from: k */
    public final HashMap f60693k = new HashMap();

    /* JADX INFO: renamed from: o */
    public final ArrayList f60697o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public ConnectionResult f60698p = null;

    /* JADX INFO: renamed from: q */
    public int f60699q = 0;

    public scb(so3 so3Var, no3 no3Var) {
        this.f60700r = so3Var;
        Looper looper = so3Var.f61092H.getLooper();
        C3309ls c3309lsM17567a = no3Var.m17567a();
        co7 co7Var = new co7((C3437ov) c3309lsM17567a.f50064b, (String) c3309lsM17567a.f50065c, (String) c3309lsM17567a.f50066d);
        pk9 pk9Var = (pk9) no3Var.f53048d.f8006a;
        lda.m16130p(pk9Var);
        co3 co3VarMo17372c = pk9Var.mo17372c(no3Var.f53045a, looper, co7Var, no3Var.f53049e, this, this);
        m58 m58Var = no3Var.f53047c;
        if (m58Var == null || !(co3VarMo17372c instanceof f90)) {
            String str = no3Var.f53046b;
            if (str != null && (co3VarMo17372c instanceof f90)) {
                co3VarMo17372c.f38658s = str;
            }
        } else {
            co3VarMo17372c.f38659t = m58Var;
        }
        this.f60689g = co3VarMo17372c;
        this.f60690h = no3Var.f53050f;
        this.f60691i = new qfa(8);
        this.f60694l = no3Var.f53052h;
        if (!co3VarMo17372c.mo3407r()) {
            this.f60695m = null;
            return;
        }
        Context context = so3Var.f61098e;
        wdb wdbVar = so3Var.f61092H;
        C3309ls c3309lsM17567a2 = no3Var.m17567a();
        this.f60695m = new edb(context, wdbVar, new co7((C3437ov) c3309lsM17567a2.f50064b, (String) c3309lsM17567a2.f50065c, (String) c3309lsM17567a2.f50066d));
    }

    /* JADX INFO: renamed from: a */
    public final void m21226a() {
        co3 co3Var = this.f60689g;
        so3 so3Var = this.f60700r;
        lda.m16126l(so3Var.f61092H);
        this.f60698p = null;
        m21234i(ConnectionResult.f11635f);
        if (this.f60696n) {
            wdb wdbVar = so3Var.f61092H;
            C3118io c3118io = this.f60690h;
            wdbVar.removeMessages(11, c3118io);
            so3Var.f61092H.removeMessages(9, c3118io);
            this.f60696n = false;
        }
        Iterator it = this.f60693k.values().iterator();
        while (it.hasNext()) {
            nc0 nc0Var = ((bdb) it.next()).f8400a;
            if (m21235j(nc0Var.m17328e()) != null) {
                it.remove();
            } else {
                try {
                    nc0Var.m17332i(co3Var, new wr9());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    co3Var.m11609d("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException | RuntimeException e) {
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        m21229d();
        m21233h();
    }

    /* JADX INFO: renamed from: b */
    public final void m21227b(int i) {
        lda.m16126l(this.f60700r.f61092H);
        this.f60698p = null;
        this.f60696n = true;
        String str = this.f60689g.f38640a;
        qfa qfaVar = this.f60691i;
        qfaVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        qfaVar.m19915o(true, new Status(20, sb.toString(), null, null));
        C3118io c3118io = this.f60690h;
        so3 so3Var = this.f60700r;
        wdb wdbVar = so3Var.f61092H;
        wdbVar.sendMessageDelayed(Message.obtain(wdbVar, 9, c3118io), 5000L);
        wdb wdbVar2 = so3Var.f61092H;
        wdbVar2.sendMessageDelayed(Message.obtain(wdbVar2, 11, c3118io), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) so3Var.f61100g.f57705a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.f60693k.values().iterator();
        while (it.hasNext()) {
            ((bdb) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m21228c(ConnectionResult connectionResult) {
        synchronized (so3.f61090L) {
            this.f60700r.getClass();
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m21229d() {
        LinkedList linkedList = this.f60688f;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qdb qdbVar = (qdb) arrayList.get(i);
            if (!this.f60689g.m11612p()) {
                return;
            }
            if (m21230e(qdbVar)) {
                linkedList.remove(qdbVar);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m21230e(qdb qdbVar) {
        if (!(qdbVar instanceof ycb)) {
            qfa qfaVar = this.f60691i;
            co3 co3Var = this.f60689g;
            qdbVar.mo13799c(qfaVar, co3Var.mo3407r());
            try {
                qdbVar.mo13800d(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                co3Var.m11609d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        ycb ycbVar = (ycb) qdbVar;
        Feature featureM21235j = m21235j(ycbVar.mo16787f(this));
        if (featureM21235j == null) {
            qfa qfaVar2 = this.f60691i;
            co3 co3Var2 = this.f60689g;
            qdbVar.mo13799c(qfaVar2, co3Var2.mo3407r());
            try {
                qdbVar.mo13800d(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                co3Var2.m11609d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f60689g.getClass().getName();
        String str = featureM21235j.f11641a;
        long jM5279r = featureM21235j.m5279r();
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(jM5279r).length() + 2);
        AbstractC3393o1.m17725C(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(jM5279r);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        so3 so3Var = this.f60700r;
        if (!so3Var.f61093I || !ycbVar.mo16788g(this)) {
            ycbVar.mo13798b(new UnsupportedApiCallException(featureM21235j));
            return true;
        }
        int iMo16789h = ycbVar.mo16789h(this);
        tcb tcbVar = new tcb(this.f60690h, featureM21235j);
        ArrayList arrayList = this.f60697o;
        int iIndexOf = arrayList.indexOf(tcbVar);
        if (iIndexOf >= 0) {
            tcb tcbVar2 = (tcb) arrayList.get(iIndexOf);
            so3Var.f61092H.removeMessages(15, tcbVar2);
            so3Var.f61092H.sendMessageDelayed(Message.obtain(so3Var.f61092H, 15, tcbVar2), 5000L);
            return false;
        }
        arrayList.add(tcbVar);
        so3Var.f61092H.sendMessageDelayed(Message.obtain(so3Var.f61092H, 15, tcbVar), 5000L);
        so3Var.f61092H.sendMessageDelayed(Message.obtain(so3Var.f61092H, 16, tcbVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(1, 2, null, null, Integer.valueOf(iMo16789h));
        if (m21228c(connectionResult)) {
            String str2 = featureM21235j.f11641a;
            long jM5279r2 = featureM21235j.m5279r();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jM5279r2).length());
            sb2.append("A dialog should be displayed for missing feature: ");
            sb2.append(str2);
            sb2.append(", version: ");
            sb2.append(jM5279r2);
            Log.w("GoogleApiManager", sb2.toString());
            return false;
        }
        if (!so3Var.m21519g(connectionResult, this.f60694l)) {
            return false;
        }
        String str3 = featureM21235j.f11641a;
        long jM5279r3 = featureM21235j.m5279r();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jM5279r3).length());
        sb3.append("Notification displayed for missing feature: ");
        sb3.append(str3);
        sb3.append(", version: ");
        sb3.append(jM5279r3);
        Log.w("GoogleApiManager", sb3.toString());
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m21231f(Status status, Exception exc, boolean z) {
        lda.m16126l(this.f60700r.f61092H);
        if ((status == null) == (exc == null)) {
            C3386nv.m17626m("Status XOR exception should be null");
            return;
        }
        Iterator it = this.f60688f.iterator();
        while (it.hasNext()) {
            qdb qdbVar = (qdb) it.next();
            if (!z || qdbVar.f57628a == 2) {
                if (status != null) {
                    qdbVar.mo13797a(status);
                } else {
                    qdbVar.mo13798b(exc);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m21232g(Status status) {
        lda.m16126l(this.f60700r.f61092H);
        m21231f(status, null, false);
    }

    /* JADX INFO: renamed from: h */
    public final void m21233h() {
        so3 so3Var = this.f60700r;
        wdb wdbVar = so3Var.f61092H;
        C3118io c3118io = this.f60690h;
        wdbVar.removeMessages(12, c3118io);
        wdb wdbVar2 = so3Var.f61092H;
        wdbVar2.sendMessageDelayed(wdbVar2.obtainMessage(12, c3118io), so3Var.f61094a);
    }

    /* JADX INFO: renamed from: i */
    public final void m21234i(ConnectionResult connectionResult) {
        HashSet hashSet = this.f60692j;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            ho2.m13383c();
            return;
        }
        if (x74.m24360q(connectionResult, ConnectionResult.f11635f)) {
            co3 co3Var = this.f60689g;
            if (!co3Var.m11612p() || co3Var.f38641b == null) {
                ho2.m13385e("Failed to connect when checking package");
                return;
            }
        }
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public final Feature m21235j(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            zzj zzjVar = this.f60689g.f38662w;
            Feature[] featureArr2 = zzjVar == null ? null : zzjVar.f11744b;
            if (featureArr2 == null) {
                featureArr2 = new Feature[0];
            }
            C3275kv c3275kv = new C3275kv(featureArr2.length);
            for (Feature feature : featureArr2) {
                c3275kv.put(feature.f11641a, Long.valueOf(feature.m5279r()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) c3275kv.get(feature2.f11641a);
                if (l == null || l.longValue() < feature2.m5279r()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m21236k(ConnectionResult connectionResult) {
        lda.m16126l(this.f60700r.f61092H);
        co3 co3Var = this.f60689g;
        String name = co3Var.getClass().getName();
        String strValueOf = String.valueOf(connectionResult);
        co3 co3Var2 = co3Var;
        co3Var2.m11609d(wq1.m24125u(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        m21237l(connectionResult, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m21237l(ConnectionResult connectionResult, RuntimeException runtimeException) {
        b79 b79Var;
        so3 so3Var = this.f60700r;
        lda.m16126l(so3Var.f61092H);
        edb edbVar = this.f60695m;
        if (edbVar != null && (b79Var = edbVar.f37093l) != null) {
            b79Var.m11608c();
        }
        lda.m16126l(this.f60700r.f61092H);
        this.f60698p = null;
        SparseIntArray sparseIntArray = (SparseIntArray) so3Var.f61100g.f57705a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        m21234i(connectionResult);
        if ((this.f60689g instanceof beb) && connectionResult.f11637b != 24) {
            so3Var.f61095b = true;
            wdb wdbVar = so3Var.f61092H;
            wdbVar.sendMessageDelayed(wdbVar.obtainMessage(19), 300000L);
        }
        int i = connectionResult.f11637b;
        if (i == 4) {
            m21232g(so3.f61089K);
            return;
        }
        if (i == 25) {
            m21232g(so3.m21514d(this.f60690h, connectionResult));
            return;
        }
        LinkedList linkedList = this.f60688f;
        if (linkedList.isEmpty()) {
            this.f60698p = connectionResult;
            return;
        }
        if (runtimeException != null) {
            lda.m16126l(so3Var.f61092H);
            m21231f(null, runtimeException, false);
            return;
        }
        boolean z = so3Var.f61093I;
        C3118io c3118io = this.f60690h;
        if (!z) {
            m21232g(so3.m21514d(c3118io, connectionResult));
            return;
        }
        m21231f(so3.m21514d(c3118io, connectionResult), null, true);
        if (linkedList.isEmpty() || m21228c(connectionResult) || so3Var.m21519g(connectionResult, this.f60694l)) {
            return;
        }
        if (connectionResult.f11637b == 18) {
            this.f60696n = true;
        }
        if (!this.f60696n) {
            m21232g(so3.m21514d(c3118io, connectionResult));
        } else {
            wdb wdbVar2 = so3Var.f61092H;
            wdbVar2.sendMessageDelayed(Message.obtain(wdbVar2, 9, c3118io), 5000L);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m21238m(qdb qdbVar) {
        lda.m16126l(this.f60700r.f61092H);
        boolean zM11612p = this.f60689g.m11612p();
        LinkedList linkedList = this.f60688f;
        if (zM11612p) {
            if (m21230e(qdbVar)) {
                m21233h();
                return;
            } else {
                linkedList.add(qdbVar);
                return;
            }
        }
        linkedList.add(qdbVar);
        ConnectionResult connectionResult = this.f60698p;
        if (connectionResult == null || connectionResult.f11637b == 0 || connectionResult.f11638c == null) {
            m21240o();
        } else {
            m21237l(connectionResult, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m21239n() {
        lda.m16126l(this.f60700r.f61092H);
        Status status = so3.f61088J;
        m21232g(status);
        this.f60691i.m19915o(false, status);
        for (qg5 qg5Var : (qg5[]) this.f60693k.keySet().toArray(new qg5[0])) {
            m21238m(new mdb(qg5Var, new wr9()));
        }
        m21234i(new ConnectionResult(4, null, null));
        if (this.f60689g.m11612p()) {
            new web(this).m23872J();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m21240o() {
        so3 so3Var = this.f60700r;
        lda.m16126l(so3Var.f61092H);
        co3 co3Var = this.f60689g;
        if (co3Var.m11612p()) {
            return;
        }
        co3 co3Var2 = co3Var;
        if (co3Var2.m11613q()) {
            return;
        }
        try {
            int iM19914n = so3Var.f61100g.m19914n(so3Var.f61098e, co3Var);
            if (iM19914n != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iM19914n, null, null);
                String name = co3Var.getClass().getName();
                String string = connectionResult.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                Log.w("GoogleApiManager", sb.toString());
                m21237l(connectionResult, null);
                return;
            }
            ucb ucbVar = new ucb(so3Var, co3Var, this.f60690h);
            if (co3Var.mo3407r()) {
                edb edbVar = this.f60695m;
                lda.m16130p(edbVar);
                b79 b79Var = edbVar.f37093l;
                if (b79Var != null) {
                    b79Var.m11608c();
                }
                co7 co7Var = edbVar.f37092k;
                co7Var.f10364g = Integer.valueOf(System.identityHashCode(edbVar));
                ncb ncbVar = edbVar.f37090i;
                Context context = edbVar.f37088g;
                Handler handler = edbVar.f37089h;
                edbVar.f37093l = (b79) ncbVar.mo17372c(context, handler.getLooper(), co7Var, (c79) co7Var.f10363f, edbVar, edbVar);
                edbVar.f37094m = ucbVar;
                Set set = edbVar.f37091j;
                if (set == null || set.isEmpty()) {
                    handler.post(new RunnableC3468pp(edbVar));
                } else {
                    edbVar.f37093l.m3409w();
                }
            }
            try {
                co3Var2.f38649j = ucbVar;
                co3Var2.m11616u(2, null);
            } catch (SecurityException e) {
                m21237l(new ConnectionResult(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            m21237l(new ConnectionResult(10, null, null), e2);
        }
    }

    @Override // p000.qo3
    public final void onConnected(Bundle bundle) {
        so3 so3Var = this.f60700r;
        if (Looper.myLooper() == so3Var.f61092H.getLooper()) {
            m21226a();
        } else {
            so3Var.f61092H.post(new RunnableC3468pp(this, 19));
        }
    }

    @Override // p000.ro3
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        m21237l(connectionResult, null);
    }

    @Override // p000.qo3
    public final void onConnectionSuspended(int i) {
        so3 so3Var = this.f60700r;
        if (Looper.myLooper() == so3Var.f61092H.getLooper()) {
            m21227b(i);
        } else {
            so3Var.f61092H.post(new ea0(this, i, 4));
        }
    }
}
