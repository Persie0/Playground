package p000;

import android.content.Context;
import android.database.Cursor;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import android.util.Log;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class azs implements Runnable {

    /* JADX INFO: renamed from: a */
    static final String f2793a = ayc.m2100b("WorkerWrapper");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f2794j = 0;

    /* JADX INFO: renamed from: b */
    final Context f2795b;

    /* JADX INFO: renamed from: c */
    public final bcv f2796c;

    /* JADX INFO: renamed from: d */
    public ayb f2797d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f2798e;

    /* JADX INFO: renamed from: i */
    final C1058va f2802i;

    /* JADX INFO: renamed from: k */
    private final String f2803k;

    /* JADX INFO: renamed from: l */
    private final axp f2804l;

    /* JADX INFO: renamed from: m */
    private final bbp f2805m;

    /* JADX INFO: renamed from: n */
    private final WorkDatabase f2806n;

    /* JADX INFO: renamed from: o */
    private final bcw f2807o;

    /* JADX INFO: renamed from: p */
    private final bbv f2808p;

    /* JADX INFO: renamed from: q */
    private final List f2809q;

    /* JADX INFO: renamed from: r */
    private String f2810r;

    /* JADX INFO: renamed from: h */
    C0139dr f2801h = C0139dr.m6614c();

    /* JADX INFO: renamed from: f */
    final bev f2799f = bev.m2275g();

    /* JADX INFO: renamed from: g */
    public final bev f2800g = bev.m2275g();

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [bbp, java.lang.Object] */
    public azs(ljf ljfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f2795b = (Context) ljfVar.f38373e;
        this.f2802i = (C1058va) ljfVar.f38371c;
        this.f2805m = ljfVar.f38369a;
        bcv bcvVar = (bcv) ljfVar.f38372d;
        this.f2796c = bcvVar;
        this.f2803k = bcvVar.f2964a;
        this.f2797d = null;
        this.f2804l = (axp) ljfVar.f38375g;
        WorkDatabase workDatabase = (WorkDatabase) ljfVar.f38374f;
        this.f2806n = workDatabase;
        this.f2807o = workDatabase.mo1700B();
        this.f2808p = workDatabase.mo1702w();
        this.f2809q = ljfVar.f38370b;
    }

    /* JADX INFO: renamed from: d */
    private final void m2131d() {
        this.f2806n.m1825m();
        try {
            this.f2807o.mo2242k(1, this.f2803k);
            this.f2807o.mo2237f(this.f2803k, System.currentTimeMillis());
            this.f2807o.mo2241j(this.f2803k, -1L);
            this.f2806n.m1829q();
        } finally {
            this.f2806n.m1827o();
            m2133f(true);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m2132e() {
        this.f2806n.m1825m();
        try {
            this.f2807o.mo2237f(this.f2803k, System.currentTimeMillis());
            this.f2807o.mo2242k(1, this.f2803k);
            bcw bcwVar = this.f2807o;
            String str = this.f2803k;
            ((bdk) bcwVar).f2987a.m1824l();
            arf arfVarM1853e = ((bdk) bcwVar).f2991e.m1853e();
            arfVarM1853e.mo1847g(1, str);
            ((bdk) bcwVar).f2987a.m1825m();
            try {
                arfVarM1853e.m1883a();
                ((bdk) bcwVar).f2987a.m1829q();
                ((bdk) bcwVar).f2987a.m1827o();
                ((bdk) bcwVar).f2991e.m1855g(arfVarM1853e);
                bcw bcwVar2 = this.f2807o;
                String str2 = this.f2803k;
                ((bdk) bcwVar2).f2987a.m1824l();
                arf arfVarM1853e2 = ((bdk) bcwVar2).f2989c.m1853e();
                arfVarM1853e2.mo1847g(1, str2);
                ((bdk) bcwVar2).f2987a.m1825m();
                try {
                    arfVarM1853e2.m1883a();
                    ((bdk) bcwVar2).f2987a.m1829q();
                    ((bdk) bcwVar2).f2987a.m1827o();
                    ((bdk) bcwVar2).f2989c.m1855g(arfVarM1853e2);
                    this.f2807o.mo2241j(this.f2803k, -1L);
                    this.f2806n.m1829q();
                    this.f2806n.m1827o();
                    m2133f(false);
                } catch (Throwable th) {
                    ((bdk) bcwVar2).f2987a.m1827o();
                    ((bdk) bcwVar2).f2989c.m1855g(arfVarM1853e2);
                    throw th;
                }
            } catch (Throwable th2) {
                ((bdk) bcwVar).f2987a.m1827o();
                ((bdk) bcwVar).f2991e.m1855g(arfVarM1853e);
                throw th2;
            }
        } catch (Throwable th3) {
            this.f2806n.m1827o();
            m2133f(false);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m2133f(boolean z) {
        boolean zContainsKey;
        this.f2806n.m1825m();
        try {
            bcw bcwVarMo1700B = this.f2806n.mo1700B();
            apy apyVarM1841a = apy.m1841a(voNZjxiJou.SON, 0);
            ((bdk) bcwVarMo1700B).f2987a.m1824l();
            Cursor cursorM409e = aey.m409e(((bdk) bcwVarMo1700B).f2987a, apyVarM1841a, false);
            try {
                boolean z2 = cursorM409e.moveToFirst() && cursorM409e.getInt(0) != 0;
                cursorM409e.close();
                apyVarM1841a.m1850j();
                if (!z2) {
                    bdz.m2261a(this.f2795b, RescheduleReceiver.class, false);
                }
                if (z) {
                    this.f2807o.mo2242k(1, this.f2803k);
                    this.f2807o.mo2241j(this.f2803k, -1L);
                }
                if (this.f2797d != null) {
                    bbp bbpVar = this.f2805m;
                    String str = this.f2803k;
                    synchronized (((azb) bbpVar).f2752f) {
                        zContainsKey = ((azb) bbpVar).f2748b.containsKey(str);
                    }
                    if (zContainsKey) {
                        bbp bbpVar2 = this.f2805m;
                        String str2 = this.f2803k;
                        synchronized (((azb) bbpVar2).f2752f) {
                            ((azb) bbpVar2).f2748b.remove(str2);
                            ((azb) bbpVar2).m2114d();
                        }
                    }
                }
                this.f2806n.m1829q();
                this.f2806n.m1827o();
                this.f2799f.m2285h(Boolean.valueOf(z));
            } catch (Throwable th) {
                cursorM409e.close();
                apyVarM1841a.m1850j();
                throw th;
            }
        } catch (Throwable th2) {
            this.f2806n.m1827o();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m2134g() {
        int iMo2239h = this.f2807o.mo2239h(this.f2803k);
        if (iMo2239h == 2) {
            ayc.m2099a();
            m2133f(true);
            return;
        }
        ayc.m2099a();
        StringBuilder sb = new StringBuilder();
        sb.append(VzWFSVj.KuLSJxbfcYJKBoI);
        sb.append(this.f2803k);
        sb.append(" is ");
        sb.append((Object) C0158ej.m7378e(iMo2239h));
        sb.append(" ; not doing any work");
        m2133f(false);
    }

    /* JADX INFO: renamed from: a */
    final void m2135a() {
        if (m2137c()) {
            return;
        }
        this.f2806n.m1825m();
        try {
            int iMo2239h = this.f2807o.mo2239h(this.f2803k);
            bco bcoVarMo1699A = this.f2806n.mo1699A();
            String str = this.f2803k;
            ((bcs) bcoVarMo1699A).f2952a.m1824l();
            arf arfVarM1853e = ((bcs) bcoVarMo1699A).f2953b.m1853e();
            arfVarM1853e.mo1847g(1, str);
            ((bcs) bcoVarMo1699A).f2952a.m1825m();
            try {
                arfVarM1853e.m1883a();
                ((bcs) bcoVarMo1699A).f2952a.m1829q();
                ((bcs) bcoVarMo1699A).f2952a.m1827o();
                ((bcs) bcoVarMo1699A).f2953b.m1855g(arfVarM1853e);
                if (iMo2239h == 0) {
                    m2133f(false);
                } else if (iMo2239h == 2) {
                    C0139dr c0139dr = this.f2801h;
                    if (c0139dr instanceof aya) {
                        ayc.m2099a();
                        if (this.f2796c.m2231e()) {
                            m2132e();
                        } else {
                            this.f2806n.m1825m();
                            try {
                                this.f2807o.mo2242k(3, this.f2803k);
                                this.f2807o.mo2238g(this.f2803k, ((aya) this.f2801h).f2704a);
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                for (String str2 : this.f2808p.mo2190a(this.f2803k)) {
                                    if (this.f2807o.mo2239h(str2) == 5) {
                                        bbv bbvVar = this.f2808p;
                                        apy apyVarM1841a = apy.m1841a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                                        if (str2 == null) {
                                            apyVarM1841a.mo1846f(1);
                                        } else {
                                            apyVarM1841a.mo1847g(1, str2);
                                        }
                                        ((bbx) bbvVar).f2929a.m1824l();
                                        Cursor cursorM409e = aey.m409e(((bbx) bbvVar).f2929a, apyVarM1841a, false);
                                        try {
                                            boolean z = cursorM409e.moveToFirst() && cursorM409e.getInt(0) != 0;
                                            cursorM409e.close();
                                            apyVarM1841a.m1850j();
                                            if (z) {
                                                ayc.m2099a();
                                                this.f2807o.mo2242k(1, str2);
                                                this.f2807o.mo2237f(str2, jCurrentTimeMillis);
                                            }
                                        } catch (Throwable th) {
                                            cursorM409e.close();
                                            apyVarM1841a.m1850j();
                                            throw th;
                                        }
                                    }
                                }
                                this.f2806n.m1829q();
                                this.f2806n.m1827o();
                                m2133f(false);
                            } catch (Throwable th2) {
                                this.f2806n.m1827o();
                                m2133f(false);
                                throw th2;
                            }
                        }
                    } else if (c0139dr instanceof axz) {
                        ayc.m2099a();
                        m2131d();
                    } else {
                        ayc.m2099a();
                        if (this.f2796c.m2231e()) {
                            m2132e();
                        } else {
                            m2136b();
                        }
                    }
                } else if (!C0158ej.m7379f(iMo2239h)) {
                    m2131d();
                }
                this.f2806n.m1829q();
                this.f2806n.m1827o();
            } catch (Throwable th3) {
                ((bcs) bcoVarMo1699A).f2952a.m1827o();
                ((bcs) bcoVarMo1699A).f2953b.m1855g(arfVarM1853e);
                throw th3;
            }
        } catch (Throwable th4) {
            this.f2806n.m1827o();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: b */
    final void m2136b() {
        this.f2806n.m1825m();
        try {
            String str = this.f2803k;
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (this.f2807o.mo2239h(str2) != 6) {
                    this.f2807o.mo2242k(4, str2);
                }
                linkedList.addAll(this.f2808p.mo2190a(str2));
            }
            this.f2807o.mo2238g(this.f2803k, ((axy) this.f2801h).f2698a);
            this.f2806n.m1829q();
        } finally {
            this.f2806n.m1827o();
            m2133f(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2137c() {
        if (!this.f2798e) {
            return false;
        }
        ayc.m2099a();
        int iMo2239h = this.f2807o.mo2239h(this.f2803k);
        if (iMo2239h == 0) {
            m2133f(false);
        } else {
            m2133f(!C0158ej.m7379f(iMo2239h));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        WorkDatabase workDatabase;
        axw axwVar;
        axt axtVarMo1694a;
        List list = this.f2809q;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f2803k);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z2 = true;
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (!z2) {
                sb.append(", ");
            }
            sb.append(str);
            z2 = false;
        }
        sb.append(" } ]");
        this.f2810r = sb.toString();
        if (m2137c()) {
            return;
        }
        this.f2806n.m1825m();
        try {
            bcv bcvVar = this.f2796c;
            if (bcvVar.f2981r != 1) {
                m2134g();
                this.f2806n.m1829q();
                ayc.m2099a();
                workDatabase = this.f2806n;
            } else {
                if ((!bcvVar.m2231e() && !bcvVar.m2230d()) || System.currentTimeMillis() >= this.f2796c.m2228a()) {
                    this.f2806n.m1829q();
                    this.f2806n.m1827o();
                    bcv bcvVar2 = this.f2796c;
                    if (bcvVar2.m2231e()) {
                        axtVarMo1694a = bcvVar2.f2967d;
                    } else {
                        String str2 = bcvVar2.f2966c;
                        str2.getClass();
                        String str3 = axx.f2697a;
                        try {
                            Object objNewInstance = Class.forName(str2).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            objNewInstance.getClass();
                            axwVar = (axw) objNewInstance;
                        } catch (Exception e) {
                            ayc.m2099a();
                            Log.e(axx.f2697a, "Trouble instantiating ".concat(str2), e);
                            axwVar = null;
                        }
                        if (axwVar == null) {
                            ayc.m2099a();
                            Log.e(f2793a, "Could not create Input Merger ".concat(String.valueOf(this.f2796c.f2966c)));
                            m2136b();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f2796c.f2967d);
                        bcw bcwVar = this.f2807o;
                        String str4 = this.f2803k;
                        apy apyVarM1841a = apy.m1841a("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                        apyVarM1841a.mo1847g(1, str4);
                        bdk bdkVar = (bdk) bcwVar;
                        bdkVar.f2987a.m1824l();
                        Cursor cursorM409e = aey.m409e(bdkVar.f2987a, apyVarM1841a, false);
                        try {
                            ArrayList arrayList2 = new ArrayList(cursorM409e.getCount());
                            while (cursorM409e.moveToNext()) {
                                arrayList2.add(axt.m2090a(cursorM409e.isNull(0) ? null : cursorM409e.getBlob(0)));
                            }
                            cursorM409e.close();
                            apyVarM1841a.m1850j();
                            arrayList.addAll(arrayList2);
                            axtVarMo1694a = axwVar.mo1694a(arrayList);
                        } catch (Throwable th) {
                            cursorM409e.close();
                            apyVarM1841a.m1850j();
                            throw th;
                        }
                    }
                    UUID uuidFromString = UUID.fromString(this.f2803k);
                    List list2 = this.f2809q;
                    int i = this.f2796c.f2973j;
                    axp axpVar = this.f2804l;
                    Executor executor = axpVar.f2670a;
                    C1058va c1058va = this.f2802i;
                    ayl aylVar = axpVar.f2672c;
                    int i2 = bei.f3036a;
                    int i3 = beh.f3035a;
                    this.f2806n.mo1700B();
                    WorkerParameters workerParameters = new WorkerParameters(uuidFromString, axtVarMo1694a, list2, i, executor, c1058va, aylVar, null);
                    if (this.f2797d == null) {
                        this.f2797d = this.f2804l.f2672c.m2107b(this.f2795b, this.f2796c.f2965b, workerParameters);
                    }
                    ayb aybVar = this.f2797d;
                    if (aybVar == null) {
                        ayc.m2099a();
                        Log.e(f2793a, "Could not create Worker ".concat(String.valueOf(this.f2796c.f2965b)));
                        m2136b();
                        return;
                    }
                    if (aybVar.f2708f) {
                        ayc.m2099a();
                        Log.e(f2793a, "Received an already-used Worker " + this.f2796c.f2965b + "; Worker Factory should return new instances");
                        m2136b();
                        return;
                    }
                    aybVar.f2708f = true;
                    this.f2806n.m1825m();
                    try {
                        if (this.f2807o.mo2239h(this.f2803k) == 1) {
                            this.f2807o.mo2242k(2, this.f2803k);
                            bcw bcwVar2 = this.f2807o;
                            String str5 = this.f2803k;
                            ((bdk) bcwVar2).f2987a.m1824l();
                            arf arfVarM1853e = ((bdk) bcwVar2).f2990d.m1853e();
                            arfVarM1853e.mo1847g(1, str5);
                            ((bdk) bcwVar2).f2987a.m1825m();
                            try {
                                arfVarM1853e.m1883a();
                                ((bdk) bcwVar2).f2987a.m1829q();
                                ((bdk) bcwVar2).f2987a.m1827o();
                                ((bdk) bcwVar2).f2990d.m1855g(arfVarM1853e);
                                z = true;
                            } catch (Throwable th2) {
                                ((bdk) bcwVar2).f2987a.m1827o();
                                ((bdk) bcwVar2).f2990d.m1855g(arfVarM1853e);
                                throw th2;
                            }
                        }
                        this.f2806n.m1829q();
                        this.f2806n.m1827o();
                        if (!z) {
                            m2134g();
                            return;
                        }
                        if (m2137c()) {
                            return;
                        }
                        beg begVar = new beg();
                        this.f2802i.f47803b.execute(begVar);
                        bev bevVar = begVar.f3034a;
                        this.f2800g.mo2282d(new RunnableC0058bd(this, bevVar, 17), new caz(1));
                        bevVar.mo2282d(new RunnableC0058bd(this, bevVar, 18, (byte[]) null), this.f2802i.f47803b);
                        this.f2800g.mo2282d(new azr(this, this.f2810r), this.f2802i.f47802a);
                        return;
                    } catch (Throwable th3) {
                        this.f2806n.m1827o();
                        throw th3;
                    }
                }
                ayc.m2099a();
                String.format("Delaying execution for %s because it is being executed before schedule.", this.f2796c.f2965b);
                m2133f(true);
                this.f2806n.m1829q();
                workDatabase = this.f2806n;
            }
            workDatabase.m1827o();
        } catch (Throwable th4) {
            this.f2806n.m1827o();
            throw th4;
        }
    }
}
