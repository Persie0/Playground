package p000;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.wear.ambient.AmbientMode;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jfj implements jea, jeb {

    /* JADX INFO: renamed from: b */
    public final jdu f33870b;

    /* JADX INFO: renamed from: c */
    public final jev f33871c;

    /* JADX INFO: renamed from: f */
    public final int f33874f;

    /* JADX INFO: renamed from: g */
    public boolean f33875g;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ jfm f33879k;

    /* JADX INFO: renamed from: l */
    public final ihk f33880l;

    /* JADX INFO: renamed from: m */
    private final jgd f33881m;

    /* JADX INFO: renamed from: a */
    public final Queue f33869a = new LinkedList();

    /* JADX INFO: renamed from: d */
    public final Set f33872d = new HashSet();

    /* JADX INFO: renamed from: e */
    public final Map f33873e = new HashMap();

    /* JADX INFO: renamed from: h */
    public final List f33876h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public jcu f33877i = null;

    /* JADX INFO: renamed from: j */
    public int f33878j = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public jfj(jfm jfmVar, jdz jdzVar) {
        this.f33879k = jfmVar;
        Looper looper = jfmVar.f33903n.getLooper();
        jgz jgzVarM13175a = jdzVar.m12959d().m13175a();
        jdu jduVarMo12827a = ((jeu) jdzVar.f33828k.f30967b).mo12827a(jdzVar.f33820c, looper, jgzVarM13175a, jdzVar.f33822e, this, this);
        String str = jdzVar.f33821d;
        if (str != null) {
            ((jgw) jduVarMo12827a).f33994k = str;
        }
        this.f33870b = jduVarMo12827a;
        this.f33871c = jdzVar.f33823f;
        this.f33880l = new ihk((byte[]) null);
        this.f33874f = jdzVar.f33825h;
        if (jduVarMo12827a.mo12947o()) {
            this.f33881m = new jgd(jfmVar.f33896g, jfmVar.f33903n, jdzVar.m12959d().m13175a());
        } else {
            this.f33881m = null;
        }
    }

    /* JADX INFO: renamed from: p */
    private final jcw m13017p(jcw[] jcwVarArr) {
        if (jcwVarArr != null) {
            jcw[] jcwVarArrM12948p = this.f33870b.m12948p();
            if (jcwVarArrM12948p == null) {
                jcwVarArrM12948p = new jcw[0];
            }
            C1109wy c1109wy = new C1109wy(jcwVarArrM12948p.length);
            for (jcw jcwVar : jcwVarArrM12948p) {
                c1109wy.put(jcwVar.f33761a, Long.valueOf(jcwVar.m12896a()));
            }
            for (int i = 0; i <= 0; i++) {
                jcw jcwVar2 = jcwVarArr[i];
                Long l = (Long) c1109wy.get(jcwVar2.f33761a);
                if (l == null || l.longValue() < jcwVar2.m12896a()) {
                    return jcwVar2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    private final Status m13018q(jcu jcuVar) {
        return jfm.m13040a(this.f33871c, jcuVar);
    }

    /* JADX INFO: renamed from: r */
    private final void m13019r(jcu jcuVar) {
        Iterator it = this.f33872d.iterator();
        while (it.hasNext()) {
            ((jew) it.next()).m12998a(this.f33871c, jcuVar, jib.m13209n(jcuVar, jcu.f33753a) ? this.f33870b.m12938f() : null);
        }
        this.f33872d.clear();
    }

    /* JADX INFO: renamed from: s */
    private final void m13020s(Status status, Exception exc, boolean z) {
        jib.m13199d(this.f33879k.f33903n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f33869a.iterator();
        while (it.hasNext()) {
            jet jetVar = (jet) it.next();
            if (!z || jetVar.f33841c == 2) {
                if (status != null) {
                    jetVar.mo12974d(status);
                } else {
                    jetVar.mo12975e(exc);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private final void m13021t(jet jetVar) {
        jetVar.mo12977g(this.f33880l, m13036o());
        try {
            jetVar.mo12976f(this);
        } catch (DeadObjectException e) {
            mo13014a(1);
            this.f33870b.m12943k("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* JADX INFO: renamed from: u */
    private final boolean m13022u(jet jetVar) {
        if (!(jetVar instanceof jen)) {
            m13021t(jetVar);
            return true;
        }
        jen jenVar = (jen) jetVar;
        jcw jcwVarM13017p = m13017p(jenVar.mo12972b(this));
        if (jcwVarM13017p == null) {
            m13021t(jetVar);
            return true;
        }
        Log.w("GoogleApiManager", this.f33870b.getClass().getName() + " could not execute call because it requires feature (" + jcwVarM13017p.f33761a + ", " + jcwVarM13017p.m12896a() + ").");
        if (!this.f33879k.f33904o || !jenVar.mo12971a(this)) {
            jenVar.mo12975e(new jem(jcwVarM13017p));
            return true;
        }
        jfk jfkVar = new jfk(this.f33871c, jcwVarM13017p);
        int iIndexOf = this.f33876h.indexOf(jfkVar);
        if (iIndexOf >= 0) {
            jfk jfkVar2 = (jfk) this.f33876h.get(iIndexOf);
            this.f33879k.f33903n.removeMessages(15, jfkVar2);
            Handler handler = this.f33879k.f33903n;
            handler.sendMessageDelayed(Message.obtain(handler, 15, jfkVar2), 5000L);
            return false;
        }
        this.f33876h.add(jfkVar);
        Handler handler2 = this.f33879k.f33903n;
        handler2.sendMessageDelayed(Message.obtain(handler2, 15, jfkVar), 5000L);
        Handler handler3 = this.f33879k.f33903n;
        handler3.sendMessageDelayed(Message.obtain(handler3, 16, jfkVar), 120000L);
        jcu jcuVar = new jcu(2, null);
        if (m13023v(jcuVar)) {
            return false;
        }
        this.f33879k.m13050h(jcuVar, this.f33874f);
        return false;
    }

    /* JADX INFO: renamed from: v */
    private final boolean m13023v(jcu jcuVar) {
        synchronized (jfm.f33892c) {
            jfm jfmVar = this.f33879k;
            if (jfmVar.f33901l == null || !jfmVar.f33902m.contains(this.f33871c)) {
                return false;
            }
            jfh jfhVar = this.f33879k.f33901l;
            kym kymVar = new kym(jcuVar, this.f33874f);
            AtomicReference atomicReference = jfhVar.f33859b;
            while (!atomicReference.compareAndSet(null, kymVar)) {
                if (atomicReference.get() != null) {
                    return true;
                }
            }
            jfhVar.f33860c.post(new fvx(jfhVar, kymVar, 2, null));
            return true;
        }
    }

    @Override // p000.jfe
    /* JADX INFO: renamed from: a */
    public final void mo13014a(int i) {
        if (Looper.myLooper() == this.f33879k.f33903n.getLooper()) {
            m13032k(i);
        } else {
            this.f33879k.f33903n.post(new gdi(this, i, 4));
        }
    }

    @Override // p000.jfe
    /* JADX INFO: renamed from: b */
    public final void mo13015b() {
        if (Looper.myLooper() == this.f33879k.f33903n.getLooper()) {
            m13029h();
        } else {
            this.f33879k.f33903n.post(new ith(this, 13));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13024c() {
        jib.m13199d(this.f33879k.f33903n);
        this.f33877i = null;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [jdu, jou] */
    /* JADX INFO: renamed from: d */
    public final void m13025d() {
        jib.m13199d(this.f33879k.f33903n);
        if (this.f33870b.m12944l() || this.f33870b.m12945m()) {
            return;
        }
        try {
            jfm jfmVar = this.f33879k;
            kon konVar = jfmVar.f33905p;
            Context context = jfmVar.f33896g;
            jdu jduVar = this.f33870b;
            jib.m13205j(context);
            jib.m13205j(jduVar);
            int iM12902f = 0;
            if (jduVar.mo12946n()) {
                int iMo12833a = jduVar.mo12833a();
                int iM14631g = konVar.m14631g(iMo12833a);
                if (iM14631g == -1) {
                    int i = 0;
                    while (true) {
                        if (i >= ((SparseIntArray) konVar.f36701a).size()) {
                            iM12902f = -1;
                            break;
                        }
                        int iKeyAt = ((SparseIntArray) konVar.f36701a).keyAt(i);
                        if (iKeyAt > iMo12833a && ((SparseIntArray) konVar.f36701a).get(iKeyAt) == 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (iM12902f == -1) {
                        iM12902f = ((jcz) konVar.f36702b).m12902f(context, iMo12833a);
                    }
                    ((SparseIntArray) konVar.f36701a).put(iMo12833a, iM12902f);
                } else {
                    iM12902f = iM14631g;
                }
            }
            if (iM12902f != 0) {
                jcu jcuVar = new jcu(iM12902f, null);
                Log.w("GoogleApiManager", "The service for " + this.f33870b.getClass().getName() + " is not available: " + jcuVar.toString());
                mo13030i(jcuVar);
                return;
            }
            jfm jfmVar2 = this.f33879k;
            jdu jduVar2 = this.f33870b;
            jfl jflVar = new jfl(jfmVar2, jduVar2, this.f33871c);
            if (jduVar2.mo12947o()) {
                jgd jgdVar = this.f33881m;
                jib.m13205j(jgdVar);
                jou jouVar = jgdVar.f33949e;
                if (jouVar != null) {
                    jouVar.mo12942j();
                }
                jgdVar.f33948d.f34021h = Integer.valueOf(System.identityHashCode(jgdVar));
                jeu jeuVar = jgdVar.f33951g;
                Context context2 = jgdVar.f33945a;
                Looper looper = jgdVar.f33946b.getLooper();
                jgz jgzVar = jgdVar.f33948d;
                jgdVar.f33949e = jeuVar.mo12827a(context2, looper, jgzVar, jgzVar.f34020g, jgdVar, jgdVar);
                jgdVar.f33950f = jflVar;
                Set set = jgdVar.f33947c;
                if (set == null || set.isEmpty()) {
                    jgdVar.f33946b.post(new ith(jgdVar, 15));
                } else {
                    jgw jgwVar = (jgw) jgdVar.f33949e;
                    jgwVar.mo12941i(new jgt(jgwVar));
                }
            }
            try {
                this.f33870b.mo12941i(jflVar);
            } catch (SecurityException e) {
                m13031j(new jcu(10), e);
            }
        } catch (IllegalStateException e2) {
            m13031j(new jcu(10), e2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m13026e(jet jetVar) {
        jib.m13199d(this.f33879k.f33903n);
        if (this.f33870b.m12944l()) {
            if (m13022u(jetVar)) {
                m13033l();
                return;
            } else {
                this.f33869a.add(jetVar);
                return;
            }
        }
        this.f33869a.add(jetVar);
        jcu jcuVar = this.f33877i;
        if (jcuVar == null || !jcuVar.m12894a()) {
            m13025d();
        } else {
            mo13030i(jcuVar);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m13027f(Status status) {
        jib.m13199d(this.f33879k.f33903n);
        m13020s(status, null, false);
    }

    /* JADX INFO: renamed from: g */
    public final void m13028g() {
        ArrayList arrayList = new ArrayList(this.f33869a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jet jetVar = (jet) arrayList.get(i);
            if (!this.f33870b.m12944l()) {
                return;
            }
            if (m13022u(jetVar)) {
                this.f33869a.remove(jetVar);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m13029h() {
        m13024c();
        m13019r(jcu.f33753a);
        m13035n();
        Iterator it = this.f33873e.values().iterator();
        while (it.hasNext()) {
            djm djmVar = (djm) it.next();
            if (m13017p((jcw[]) ((kyl) djmVar.f11789c).f37730b) != null) {
                it.remove();
            } else {
                try {
                    ((kyl) djmVar.f11789c).m15063b(this.f33870b, new khb((byte[]) null, (byte[]) null));
                } catch (DeadObjectException e) {
                    mo13014a(3);
                    this.f33870b.m12943k("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e2) {
                    it.remove();
                }
            }
        }
        m13028g();
        m13033l();
    }

    @Override // p000.jga
    /* JADX INFO: renamed from: i */
    public final void mo13030i(jcu jcuVar) {
        m13031j(jcuVar, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m13031j(jcu jcuVar, Exception exc) {
        jou jouVar;
        jib.m13199d(this.f33879k.f33903n);
        jgd jgdVar = this.f33881m;
        if (jgdVar != null && (jouVar = jgdVar.f33949e) != null) {
            jouVar.mo12942j();
        }
        m13024c();
        this.f33879k.f33905p.m14630f();
        m13019r(jcuVar);
        if ((this.f33870b instanceof jiq) && jcuVar.f33755c != 24) {
            jfm jfmVar = this.f33879k;
            jfmVar.f33895f = true;
            Handler handler = jfmVar.f33903n;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        if (jcuVar.f33755c == 4) {
            m13027f(jfm.f33891b);
            return;
        }
        if (this.f33869a.isEmpty()) {
            this.f33877i = jcuVar;
            return;
        }
        if (exc != null) {
            jib.m13199d(this.f33879k.f33903n);
            m13020s(null, exc, false);
            return;
        }
        if (!this.f33879k.f33904o) {
            m13027f(m13018q(jcuVar));
            return;
        }
        m13020s(m13018q(jcuVar), null, true);
        if (this.f33869a.isEmpty() || m13023v(jcuVar) || this.f33879k.m13050h(jcuVar, this.f33874f)) {
            return;
        }
        if (jcuVar.f33755c == 18) {
            this.f33875g = true;
        }
        if (!this.f33875g) {
            m13027f(m13018q(jcuVar));
        } else {
            Handler handler2 = this.f33879k.f33903n;
            handler2.sendMessageDelayed(Message.obtain(handler2, 9, this.f33871c), 5000L);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m13032k(int i) {
        m13024c();
        this.f33875g = true;
        ihk ihkVar = this.f33880l;
        String strM12939g = this.f33870b.m12939g();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(BcwGDRhrTsnlj.PtX);
        }
        if (strM12939g != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strM12939g);
        }
        ihkVar.m11356x(true, new Status(20, sb.toString()));
        Handler handler = this.f33879k.f33903n;
        handler.sendMessageDelayed(Message.obtain(handler, 9, this.f33871c), 5000L);
        Handler handler2 = this.f33879k.f33903n;
        handler2.sendMessageDelayed(Message.obtain(handler2, 11, this.f33871c), 120000L);
        this.f33879k.f33905p.m14630f();
        Iterator it = this.f33873e.values().iterator();
        while (it.hasNext()) {
            Object obj = ((djm) it.next()).f11788b;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m13033l() {
        this.f33879k.f33903n.removeMessages(12, this.f33871c);
        Handler handler = this.f33879k.f33903n;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.f33871c), this.f33879k.f33894e);
    }

    /* JADX INFO: renamed from: m */
    public final void m13034m() {
        jib.m13199d(this.f33879k.f33903n);
        m13027f(jfm.f33890a);
        this.f33880l.m11356x(false, jfm.f33890a);
        for (jfv jfvVar : (jfv[]) this.f33873e.keySet().toArray(new jfv[0])) {
            m13026e(new jes(jfvVar, new khb((byte[]) null, (byte[]) null), null, null));
        }
        m13019r(new jcu(4));
        if (this.f33870b.m12944l()) {
            this.f33870b.m12950r(new AmbientMode.AmbientController(this));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m13035n() {
        if (this.f33875g) {
            this.f33879k.f33903n.removeMessages(11, this.f33871c);
            this.f33879k.f33903n.removeMessages(9, this.f33871c);
            this.f33875g = false;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m13036o() {
        return this.f33870b.mo12947o();
    }
}
