package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cew implements cet {

    /* JADX INFO: renamed from: a */
    public final Set f5474a;

    /* JADX INFO: renamed from: b */
    public final jvb f5475b;

    /* JADX INFO: renamed from: c */
    private jwn f5476c;

    /* JADX INFO: renamed from: d */
    private jwn f5477d;

    /* JADX INFO: renamed from: e */
    private jwn f5478e;

    /* JADX INFO: renamed from: f */
    private jwn f5479f;

    /* JADX INFO: renamed from: g */
    private boolean f5480g;

    /* JADX INFO: renamed from: h */
    private final mrf f5481h = new cev(0);

    public cew(Set set, jvb jvbVar) {
        this.f5474a = set;
        this.f5475b = jvbVar;
    }

    @Override // p000.cet
    /* JADX INFO: renamed from: a */
    public final int mo3575a() {
        return ((Integer) this.f5476c.mo3831be()).intValue();
    }

    @Override // p000.cet
    /* JADX INFO: renamed from: b */
    public final void mo3576b() {
        this.f5480g = false;
        Iterator it = this.f5474a.iterator();
        while (it.hasNext()) {
            ((cfg) it.next()).mo3597c();
        }
    }

    @Override // p000.cet
    /* JADX INFO: renamed from: c */
    public final void mo3577c() {
        this.f5480g = true;
    }

    @Override // p000.cet
    /* JADX INFO: renamed from: d */
    public final void mo3578d(kmg kmgVar) {
        Iterator it = this.f5474a.iterator();
        while (it.hasNext()) {
            ((cfg) it.next()).mo3598d(kmgVar);
        }
    }

    @Override // p000.cet
    /* JADX INFO: renamed from: e */
    public final void mo3579e(dci dciVar) {
        Iterator it = this.f5474a.iterator();
        while (it.hasNext()) {
            ((cfg) it.next()).mo3599e(dciVar.f10511c);
        }
    }

    @Override // p000.cet
    /* JADX INFO: renamed from: f */
    public final void mo3580f(grm grmVar) {
        if (this.f5480g) {
            if (!((Boolean) this.f5479f.mo3831be()).booleanValue()) {
                grmVar.f26152a.close();
                return;
            }
            kmv kmvVar = new kmv(grmVar.f26152a, this.f5474a.size());
            for (cfg cfgVar : this.f5474a) {
                if (((Boolean) cfgVar.mo3596b().mo3590a().mo3831be()).booleanValue() && (cfgVar instanceof cfd)) {
                    grm.m9673c(new kmw(kmvVar), grmVar);
                    ((cfd) cfgVar).m3593a();
                } else {
                    kmvVar.m14586l();
                }
            }
        }
    }

    @Override // p000.cet
    /* JADX INFO: renamed from: g */
    public final void mo3581g(grm grmVar) {
        if (!this.f5480g || !mo3583i()) {
            grmVar.f26152a.close();
            return;
        }
        kmv kmvVar = new kmv(grmVar.f26152a, this.f5474a.size());
        for (cfg cfgVar : this.f5474a) {
            if (((Boolean) cfgVar.mo3596b().mo3590a().mo3831be()).booleanValue() && (cfgVar instanceof cff)) {
                ((cff) cfgVar).mo3595a(grm.m9673c(new kmw(kmvVar), grmVar));
            } else {
                kmvVar.m14586l();
            }
        }
    }

    @Override // p000.cet
    /* JADX INFO: renamed from: h */
    public final void mo3582h(kpp kppVar) {
        if (this.f5480g && ((Boolean) this.f5478e.mo3831be()).booleanValue()) {
            for (cfg cfgVar : this.f5474a) {
                if (((Boolean) cfgVar.mo3596b().mo3590a().mo3831be()).booleanValue() && (cfgVar instanceof cfe)) {
                    ((cfe) cfgVar).mo3594a(kppVar);
                }
            }
        }
    }

    @Override // p000.cet
    /* JADX INFO: renamed from: i */
    public final boolean mo3583i() {
        return ((Boolean) this.f5477d.mo3831be()).booleanValue();
    }

    @Override // p000.cet
    /* JADX INFO: renamed from: j */
    public final void mo3584j(cfk cfkVar) {
        Iterator it = this.f5474a.iterator();
        while (it.hasNext()) {
            ((cfg) it.next()).mo3600f(cfkVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m3586k() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        arrayList2.add(jwr.m13637g(false));
        arrayList3.add(jwr.m13637g(false));
        arrayList4.add(jwr.m13637g(false));
        for (cfg cfgVar : this.f5474a) {
            cfc cfcVarMo3596b = cfgVar.mo3596b();
            if (cfgVar instanceof cff) {
                arrayList2.add(cfcVarMo3596b.mo3590a());
                if (((Boolean) cfcVarMo3596b.mo3590a().mo3831be()).booleanValue()) {
                    arrayList.add(cfcVarMo3596b.mo3591b());
                }
            }
            if (cfgVar instanceof cfe) {
                arrayList3.add(cfcVarMo3596b.mo3590a());
                if (((Boolean) cfcVarMo3596b.mo3590a().mo3831be()).booleanValue()) {
                    arrayList.add(cfcVarMo3596b.mo3591b());
                }
            }
            if (cfgVar instanceof cfd) {
                arrayList4.add(cfcVarMo3596b.mo3590a());
            }
        }
        this.f5476c = jwr.m13640j(jwr.m13631a(arrayList), this.f5481h);
        this.f5477d = jwr.m13638h(arrayList2);
        this.f5478e = jwr.m13638h(arrayList3);
        this.f5479f = jwr.m13638h(arrayList4);
        jwn jwnVar = this.f5476c;
        jwnVar.getClass();
        mpw.m16775n(new ceu(jwnVar, 1));
        jwn jwnVar2 = this.f5477d;
        jwnVar2.getClass();
        mpw.m16775n(new ceu(jwnVar2, i));
        jwn jwnVar3 = this.f5478e;
        jwnVar3.getClass();
        mpw.m16775n(new ceu(jwnVar3, i));
        jwn jwnVar4 = this.f5479f;
        jwnVar4.getClass();
        mpw.m16775n(new ceu(jwnVar4, i));
    }
}
