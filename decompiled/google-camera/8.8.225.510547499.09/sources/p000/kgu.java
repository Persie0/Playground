package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kgu extends kfv implements kba {

    /* JADX INFO: renamed from: a */
    private final kgt f35971a;

    /* JADX INFO: renamed from: b */
    private final khu f35972b;

    /* JADX INFO: renamed from: c */
    private final Set f35973c;

    /* JADX INFO: renamed from: d */
    private Set f35974d;

    /* JADX INFO: renamed from: e */
    private Set f35975e = null;

    /* JADX INFO: renamed from: f */
    private boolean f35976f = false;

    /* JADX INFO: renamed from: g */
    private boolean f35977g = false;

    /* JADX INFO: renamed from: h */
    private final boolean f35978h;

    /* JADX INFO: renamed from: i */
    private final djm f35979i;

    public kgu(djm djmVar, kgt kgtVar, khu khuVar, mxk mxkVar, Set set, Set set2, byte[] bArr) {
        this.f35979i = djmVar;
        this.f35971a = kgtVar;
        this.f35972b = khuVar;
        this.f35973c = set;
        this.f35974d = mxk.m17134F(set2);
        this.f35978h = mxkVar.contains(kga.ABORT_FRAME_ON_FAILURE_BEFORE_START);
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: aZ */
    public final synchronized void mo5454aZ(kgg kggVar, long j) {
        Set<kgg> set = this.f35975e;
        set.getClass();
        for (kgg kggVar2 : set) {
            if (kggVar == kggVar2 && (kggVar2 instanceof kkq)) {
                ((kkq) kggVar2).f36398a.m14471c(kggVar, j);
            }
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: ba */
    public final synchronized void mo5455ba(kll kllVar) {
        Set<khq> set = this.f35974d;
        if (set != null) {
            boolean z = false;
            if (kllVar != null && kllVar.m14501c()) {
                z = true;
            }
            if ((this.f35978h && !this.f35977g) || !z) {
                for (khq khqVar : set) {
                    khqVar.m14283g();
                    khqVar.m14282f();
                }
                this.f35974d = null;
            }
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bm */
    public final synchronized void mo9228bm(long j, Set set) {
        this.f35975e = set;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bn */
    public final synchronized void mo8901bn(kfd kfdVar) {
        Set<khq> setM6247v;
        this.f35977g = true;
        Set<kgg> set = this.f35975e;
        set.getClass();
        lku.m15614I(!this.f35976f, "on started invoked after FrameDistributor was closed!");
        jvb jvbVar = new jvb();
        try {
            jvbVar.m13537d(this.f35979i.m6245t());
            for (kgg kggVar : set) {
                if (kggVar instanceof kkq) {
                    jvbVar.m13537d(((kkq) kggVar).f36402e.m14252r());
                }
            }
            Set set2 = this.f35974d;
            this.f35974d = null;
            if (set2 == null || set2.isEmpty()) {
                setM6247v = this.f35979i.m6247v(this.f35973c);
            } else {
                setM6247v = this.f35979i.m6248w(this.f35973c, set2);
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    lku.m15613H(setM6247v.contains((khq) it.next()));
                }
            }
            HashMap map = new HashMap();
            HashSet<klc> hashSet = new HashSet();
            for (khq khqVar : setM6247v) {
                for (kgg kggVar2 : khqVar.f36079c.f36067c) {
                    if ((kggVar2 instanceof kky) && ((kky) kggVar2).mo14453h() == kgj.f35913a) {
                        hashSet.add(khqVar.m14279c(kggVar2));
                    }
                }
                khqVar.m14285i(kfdVar);
                map.put(khqVar.f36079c, khqVar);
            }
            this.f35972b.m14295q(setM6247v);
            for (klc klcVar : hashSet) {
                kgg kggVarMo14461d = klcVar.mo14461d();
                if (kggVarMo14461d instanceof kkq) {
                    if (set.contains(kggVarMo14461d)) {
                        kkw kkwVar = ((kkq) kggVarMo14461d).f36398a;
                        lku.m15669w(klcVar.mo14461d().mo14191a() == kkwVar.f36417b);
                        lku.m15669w(kkwVar.f36418c.equals(klcVar.mo14461d().mo14192b()));
                        kkwVar.f36424i.add(klcVar);
                        kkwVar.f36419d.execute(kkwVar.f36420e);
                    } else {
                        klcVar.mo14465k(null);
                    }
                }
            }
            kgt kgtVar = this.f35971a;
            Set setKeySet = map.keySet();
            mxi mxiVar = new mxi();
            synchronized (kgtVar) {
                for (kgs kgsVar : kgtVar.f35965a) {
                    if (setKeySet.contains(kgsVar.f35958h)) {
                        mxiVar.mo17072d(kgsVar);
                    }
                }
            }
            for (kgs kgsVar2 : mxiVar.mo17127f()) {
                khq khqVar2 = (khq) map.get(kgsVar2.f35958h);
                khqVar2.getClass();
                kiq kiqVar = new kiq(khqVar2.f36079c, khqVar2, khqVar2.m14277a(false));
                lku.m15670x(kiqVar.f36193b == kgsVar2.f35958h, "Frame does not match source!");
                synchronized (kgsVar2) {
                    if (kgsVar2.f35957g) {
                        kiqVar.m14359c();
                    } else {
                        kgsVar2.f35952b.addLast(kiqVar);
                        if (kiqVar.m14360d()) {
                            kgsVar2.f35954d.addLast(kiqVar);
                        } else {
                            kgsVar2.f35953c.addLast(kiqVar);
                        }
                        kgsVar2.m14221s();
                        synchronized (kgsVar2.f35956f) {
                            try {
                                Iterator it2 = kgsVar2.f35956f.iterator();
                                while (it2.hasNext()) {
                                    ((kez) it2.next()).mo3625c(kiqVar);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        kgsVar2.f35951a.execute(new kds(kgsVar2, kiqVar, 6));
                    }
                }
            }
            Iterator it3 = setM6247v.iterator();
            while (it3.hasNext()) {
                ((khq) it3.next()).m14283g();
            }
            if (set2 != null && !set2.isEmpty()) {
                close();
            }
            jvbVar.close();
        } catch (Throwable th2) {
            try {
                jvbVar.close();
                throw th2;
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    throw th2;
                } catch (Exception e) {
                    throw th2;
                }
            }
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f35976f) {
                return;
            }
            this.f35976f = true;
            Set set = this.f35974d;
            this.f35974d = null;
            if (set == null || set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((khq) it.next()).m14283g();
            }
        }
    }
}
