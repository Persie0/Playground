package p000;

import android.content.SharedPreferences;
import com.google.android.gms.measurement.internal.C1045d;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class pz2 implements su2 {

    /* JADX INFO: renamed from: a */
    public long f57022a;

    /* JADX INFO: renamed from: b */
    public Object f57023b;

    /* JADX INFO: renamed from: c */
    public Object f57024c;

    /* JADX INFO: renamed from: d */
    public Serializable f57025d;

    /* JADX INFO: renamed from: e */
    public final Object f57026e;

    public /* synthetic */ pz2(qfc qfcVar, long j) {
        this.f57026e = qfcVar;
        lda.m16127m("health_monitor");
        lda.m16125k(j > 0);
        this.f57023b = "health_monitor:start";
        this.f57024c = "health_monitor:count";
        this.f57025d = "health_monitor:value";
        this.f57022a = j;
    }

    /* JADX INFO: renamed from: a */
    public void m19572a() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f57025d;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            lj8 lj8Var = (lj8) it.next();
            lj8Var.cancel();
            lj8 lj8VarMo11844b = lj8Var.mo11844b();
            if (lj8VarMo11844b != null) {
                ((p18) this.f57023b).f55453p.addLast(lj8VarMo11844b);
            }
        }
        copyOnWriteArrayList.clear();
    }

    @Override // p000.su2
    /* JADX INFO: renamed from: b */
    public j18 mo18303b() throws IOException {
        kj8 kj8VarM19573c;
        long j;
        kj8 kj8Var;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.f57025d).isEmpty() && !((p18) this.f57023b).m18853a(null)) {
                    m19572a();
                    iOException.getClass();
                    throw iOException;
                }
                if (((p18) this.f57023b).f55448k.f43339K) {
                    throw new IOException("Canceled");
                }
                cc4 cc4Var = ((as9) this.f57024c).f7433a;
                long jNanoTime = System.nanoTime();
                long j2 = this.f57022a - jNanoTime;
                if (((CopyOnWriteArrayList) this.f57025d).isEmpty() || j2 <= 0) {
                    kj8VarM19573c = m19573c();
                    j = 250000000;
                    this.f57022a = jNanoTime + 250000000;
                } else {
                    j = j2;
                    kj8VarM19573c = null;
                }
                if (kj8VarM19573c == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f57025d;
                    if (copyOnWriteArrayList.isEmpty() || (kj8Var = (kj8) ((LinkedBlockingDeque) this.f57026e).poll(j, timeUnit)) == null) {
                        kj8VarM19573c = null;
                    } else {
                        copyOnWriteArrayList.remove(kj8Var.f47398a);
                        kj8VarM19573c = kj8Var;
                    }
                    if (kj8VarM19573c == null) {
                    }
                }
                boolean z = false;
                if (kj8VarM19573c.f47399b == null && kj8VarM19573c.f47400c == null) {
                    m19572a();
                    if (!kj8VarM19573c.f47398a.mo11843a()) {
                        kj8VarM19573c = kj8VarM19573c.f47398a.mo11849g();
                    }
                    if (kj8VarM19573c.f47399b == null && kj8VarM19573c.f47400c == null) {
                        z = true;
                    }
                    if (z) {
                        j18 j18VarMo11845c = kj8VarM19573c.f47398a.mo11845c();
                        m19572a();
                        return j18VarMo11845c;
                    }
                }
                Throwable th = kj8VarM19573c.f47400c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        lda.m16117c(iOException, th);
                    }
                }
                lj8 lj8Var = kj8VarM19573c.f47399b;
                if (lj8Var != null) {
                    ((p18) this.f57023b).f55453p.addFirst(lj8Var);
                }
            } catch (Throwable th2) {
                m19572a();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public kj8 m19573c() {
        lj8 iz2Var;
        p18 p18Var = (p18) this.f57023b;
        if (p18Var.m18853a(null)) {
            try {
                iz2Var = p18Var.m18854b();
            } catch (Throwable th) {
                iz2Var = new iz2(th);
            }
            if (iz2Var.mo11843a()) {
                return new kj8(iz2Var, (Throwable) null, 6);
            }
            if (iz2Var instanceof iz2) {
                return ((iz2) iz2Var).f44796a;
            }
            ((CopyOnWriteArrayList) this.f57025d).add(iz2Var);
            ((as9) this.f57024c).m3023d().m25753c(new oz2(kcb.f47052b + " connect " + p18Var.f55446i.f43720h.m11382h(), iz2Var, this), 0L);
        }
        return null;
    }

    @Override // p000.su2
    /* JADX INFO: renamed from: d */
    public p18 mo18304d() {
        return (p18) this.f57023b;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5 A[RETURN] */
    /* JADX INFO: renamed from: e */
    public boolean m19574e(long j, ohc ohcVar) {
        pjc pjcVar;
        if (((ArrayList) this.f57025d) == null) {
            this.f57025d = new ArrayList();
        }
        if (((ArrayList) this.f57024c) == null) {
            this.f57024c = new ArrayList();
        }
        if (((ArrayList) this.f57025d).isEmpty() || ((((ohc) ((ArrayList) this.f57025d).get(0)).m18028z() / 1000) / 60) / 60 == ((ohcVar.m18028z() / 1000) / 60) / 60) {
            long jM23968l = this.f57022a + ((long) ohcVar.m23968l());
            C1045d c1045d = (C1045d) this.f57026e;
            if (!c1045d.m5916e0().m4869O(null, z8c.f71150Y0)) {
                c1045d.m5916e0();
                if (jM23968l < Math.max(0, ((Integer) z8c.f71180j.m21901a(null)).intValue())) {
                    this.f57022a = jM23968l;
                    ((ArrayList) this.f57025d).add(ohcVar);
                    ((ArrayList) this.f57024c).add(Long.valueOf(j));
                    pjcVar = (pjc) this.f57023b;
                    if (((ArrayList) this.f57025d).size() < Math.max(1, c1045d.m5916e0().m4867M(pjcVar != null ? pjcVar.m19334s() : null, z8c.f71183k))) {
                        return true;
                    }
                }
            } else if (((ArrayList) this.f57025d).isEmpty()) {
                this.f57022a = jM23968l;
                ((ArrayList) this.f57025d).add(ohcVar);
                ((ArrayList) this.f57024c).add(Long.valueOf(j));
                pjcVar = (pjc) this.f57023b;
                if (((ArrayList) this.f57025d).size() < Math.max(1, c1045d.m5916e0().m4867M(pjcVar != null ? pjcVar.m19334s() : null, z8c.f71183k))) {
                    return true;
                }
            } else {
                c1045d.m5916e0();
                if (jM23968l < Math.max(0, ((Integer) z8c.f71180j.m21901a(null)).intValue())) {
                    this.f57022a = jM23968l;
                    ((ArrayList) this.f57025d).add(ohcVar);
                    ((ArrayList) this.f57024c).add(Long.valueOf(j));
                    pjcVar = (pjc) this.f57023b;
                    if (((ArrayList) this.f57025d).size() < Math.max(1, c1045d.m5916e0().m4867M(pjcVar != null ? pjcVar.m19334s() : null, z8c.f71183k))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m19575f() {
        qfc qfcVar = (qfc) this.f57026e;
        qfcVar.mo12359D();
        ((kjc) qfcVar.f60774a).f47443k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = qfcVar.m19930H().edit();
        editorEdit.remove((String) this.f57024c);
        editorEdit.remove((String) this.f57025d);
        editorEdit.putLong((String) this.f57023b, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public pz2(p18 p18Var, as9 as9Var) {
        as9Var.getClass();
        this.f57023b = p18Var;
        this.f57024c = as9Var;
        this.f57022a = Long.MIN_VALUE;
        this.f57025d = new CopyOnWriteArrayList();
        this.f57026e = new LinkedBlockingDeque();
    }
}
