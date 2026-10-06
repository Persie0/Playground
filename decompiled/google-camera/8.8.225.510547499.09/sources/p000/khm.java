package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class khm implements kfo {

    /* JADX INFO: renamed from: a */
    public final kic f36060a;

    /* JADX INFO: renamed from: b */
    public final kbz f36061b;

    /* JADX INFO: renamed from: c */
    public final djm f36062c;

    public khm(djm djmVar, kbz kbzVar, kic kicVar, byte[] bArr) {
        this.f36062c = djmVar;
        this.f36061b = kbzVar;
        this.f36060a = kicVar;
    }

    /* JADX INFO: renamed from: k */
    public static final void m14268k(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Set) it.next()).iterator();
            while (it2.hasNext()) {
                ((khq) it2.next()).m14283g();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static final List m14269l(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kgx kgxVar = (kgx) it.next();
            lku.m15669w(kgxVar instanceof kgx);
            arrayList.add(mxk.m17134F(kgxVar.f35994c));
        }
        return arrayList;
    }

    @Override // p000.kfo
    /* JADX INFO: renamed from: a */
    public final kew mo14152a() {
        return this.f36060a.m14307a();
    }

    @Override // p000.kfo
    /* JADX INFO: renamed from: b */
    public final kfj mo14153b() {
        return this.f36060a.m14308b();
    }

    @Override // p000.kfo
    /* JADX INFO: renamed from: c */
    public final kfj mo14154c() {
        return this.f36060a.m14308b();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f36060a.close();
    }

    @Override // p000.kfo
    /* JADX INFO: renamed from: d */
    public final nps mo14155d(kex kexVar) {
        return this.f36060a.m14311e(kexVar, false);
    }

    @Override // p000.kfo
    /* JADX INFO: renamed from: e */
    public final List mo14156e(List list) {
        List list2;
        this.f36061b.mo13961e("FrameServerSession#submit(burst)");
        ArrayList<nps> arrayList = new ArrayList(list.size());
        List listM14269l = m14269l(list);
        this.f36061b.mo13961e("allocate");
        Iterator it = listM14269l.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f36062c.m6246u((Set) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        try {
            try {
                this.f36061b.mo13963g("await");
                list2 = (List) kxk.m14961G(arrayList).get();
                try {
                    lku.m15613H(list2.size() == list.size());
                    this.f36061b.mo13963g("build_results");
                    ArrayList arrayList3 = new ArrayList(list.size());
                    for (int i = 0; i < list.size(); i++) {
                        Set<khq> set = (Set) list2.get(i);
                        mwt mwtVarM17116j = mwx.m17116j(set.size());
                        for (khq khqVar : set) {
                            key keyVarM14356l = kim.m14356l(khqVar);
                            keyVarM14356l.getClass();
                            mwtVarM17116j.mo17110e(khqVar.f36079c, keyVarM14356l);
                        }
                        arrayList3.add(new khl(mwtVarM17116j.mo17059b()));
                    }
                    try {
                        this.f36061b.mo13963g("submit");
                        this.f36060a.m14314h(list, list2);
                        this.f36061b.mo13962f();
                        this.f36061b.mo13962f();
                        return arrayList3;
                    } catch (InterruptedException | ExecutionException | kec e) {
                        e = e;
                        arrayList2 = arrayList3;
                        for (nps npsVar : arrayList) {
                            if (!npsVar.cancel(true) || npsVar.isDone()) {
                                Set set2 = (Set) jvh.m13560h(npsVar);
                                if (set2 != null) {
                                    Iterator it2 = set2.iterator();
                                    while (it2.hasNext()) {
                                        ((khq) it2.next()).m14283g();
                                    }
                                }
                            }
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            ((khl) it3.next()).close();
                        }
                        if (list2 != null) {
                            m14268k(list2);
                        }
                        throw new kec(e);
                    }
                } catch (InterruptedException e2) {
                    e = e2;
                } catch (ExecutionException e3) {
                    e = e3;
                } catch (kec e4) {
                    e = e4;
                }
            } catch (Throwable th) {
                this.f36061b.mo13962f();
                this.f36061b.mo13962f();
                throw th;
            }
        } catch (InterruptedException | ExecutionException | kec e5) {
            e = e5;
            list2 = null;
        }
    }

    @Override // p000.kfo
    /* JADX INFO: renamed from: f */
    public final khl mo14157f(kgx kgxVar) {
        khl khlVar;
        Set set;
        this.f36061b.mo13961e("FrameServerSession#submit(single)");
        this.f36061b.mo13961e("allocate");
        lku.m15669w(true);
        nps npsVarM6246u = this.f36062c.m6246u(kgxVar.f35994c);
        Set set2 = null;
        try {
            try {
                this.f36061b.mo13963g("await");
                Set<khq> set3 = (Set) npsVarM6246u.get();
                try {
                    mwt mwtVarM17116j = mwx.m17116j(set3.size());
                    this.f36061b.mo13963g("build_results");
                    for (khq khqVar : set3) {
                        key keyVarM14356l = kim.m14356l(khqVar);
                        keyVarM14356l.getClass();
                        mwtVarM17116j.mo17110e(khqVar.f36079c, keyVarM14356l);
                    }
                    khlVar = new khl(mwtVarM17116j.mo17059b());
                    try {
                        this.f36061b.mo13963g("submit");
                        this.f36060a.m14316j(kgxVar, set3);
                        this.f36061b.mo13962f();
                        this.f36061b.mo13962f();
                        return khlVar;
                    } catch (InterruptedException | ExecutionException | kec e) {
                        e = e;
                        set2 = set3;
                        if ((!npsVarM6246u.cancel(true) || npsVarM6246u.isDone()) && (set = (Set) jvh.m13560h(npsVarM6246u)) != null) {
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                ((khq) it.next()).m14283g();
                            }
                        }
                        if (khlVar != null) {
                            khlVar.close();
                        }
                        if (set2 != null) {
                            Iterator it2 = set2.iterator();
                            while (it2.hasNext()) {
                                ((khq) it2.next()).m14283g();
                            }
                        }
                        throw new kec(e);
                    }
                } catch (InterruptedException | ExecutionException | kec e2) {
                    e = e2;
                    khlVar = null;
                    set2 = set3;
                }
            } catch (Throwable th) {
                this.f36061b.mo13962f();
                this.f36061b.mo13962f();
                throw th;
            }
        } catch (InterruptedException | ExecutionException | kec e3) {
            e = e3;
            khlVar = null;
        }
    }

    @Override // p000.kfo
    /* JADX INFO: renamed from: g */
    public final void mo14158g(kgx kgxVar) {
        this.f36060a.m14315i(kgxVar);
    }

    @Override // p000.kfo
    /* JADX INFO: renamed from: h */
    public final nps mo14159h(kex kexVar) {
        return this.f36060a.m14317k(kexVar);
    }

    @Override // p000.kfo
    /* JADX INFO: renamed from: i */
    public final void mo14160i(kex kexVar) {
        this.f36060a.m14319m(kexVar);
    }

    @Override // p000.kfo
    /* JADX INFO: renamed from: j */
    public final void mo14161j(Set set, kfv kfvVar) {
        this.f36060a.m14320n(set, kfvVar);
    }
}
